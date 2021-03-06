grammar c;
options{
    output=AST;
    ASTLabelType=CommonTree;
}

tokens{
PROG;STAT;IFSTAT;IF;ELSE;WHILESTAT;FORSTAT;DECLAREVAR;DECLAREFUNC;CALLFUNC;GIVEVALUE;CALL;FUNC1;FUNC2;FUNC3;FUNC4;
}


ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT 
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?  
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT 
    ;

num	:	INT
	|	FLOAT
;

num_type	:	'int'
	|	'float'
	;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ('\r'|'\n'|' '|'\t')+{$channel=HIDDEN;};
END	:	';'
	;
	
boolexpr	:	expr	('=='^|'!='^|'>'^|'<'^|'>='^|'<='^)	expr
	;
expr	:	multexpr	(('+'^	|	'-'^)	multexpr)*
;

multexpr	:	atom	(('*'^|'/'^)	atom)*
;

atom	:	'('	expr	')'     ->      ^(expr)
	|	num
	|	ID
	|	callfunc
	;
	
declarevar	:	'int'^	ID
	|	'float'^	ID
	;
	
	
givevalue	:	ID 	'='	expr
	->	^('='	ID	expr)
	;
	
ifstat	options{ backtrack=true;  }
	:	'if'	INT	'('	boolexpr	')'	'{'	s1=stat*	'}'	'else'	'{'	s2=stat*	'}'
	->	^(IF	INT	 boolexpr	$s1	ELSE	$s2)
	|	'if'	INT	'('	boolexpr	')'	'{'	stat*	'}'
	->	^(IF	INT	boolexpr	stat*)
	;
	
whilestat	options{ backtrack=true;  }
	:	'while'	INT	'('	boolexpr	')'	'{'	stat*	'}'
	->	^('while'	INT	boolexpr	stat*)	
	;

forstat	options{ backtrack=true;  }
	:	'for'	INT	'('	s1=givevalue	';'	s2=boolexpr	';'	s3=givevalue	')'	'{'	s4=stat*	'}'
	->	^('for'	INT	$s1	$s2	$s4     $s3)
	;

declarefunc
	:	'void'	ID	'('	')'	'{'	stat*	'}'	->	^(FUNC1 ID	stat*)
	|	('int'|'float')	ID	'('	')'	'{'	stat*	'return'	expr	END	'}'	->	^(FUNC2	ID	stat*	expr)
	|	'void'	ID	'('	(num_type	ID)	(','	(num_type	ID))*	')'	'{'	stat*	'}'	->
		^(FUNC3	ID	(num_type	ID)+	stat*)
	|	('int'|'float')	ID	'('	(num_type	ID)	(','	(num_type	ID))*	')'	'{'	stat*	'return'	expr	END	'}'	
	->	^(FUNC4	ID	(num_type	ID)+	stat*	expr)
	;	

callfunc	:	ID	'('	')'	->	^(CALL	ID)
	|	ID	'('	expr	(','	expr)*	')'	->	^(CALL	ID	expr	(expr)*)
	;

stat	:	declarevar	END	->	^(DECLAREVAR	declarevar)
	|	givevalue	END->	^(GIVEVALUE	givevalue)
	|	ifstat	->	^(IFSTAT	ifstat)
	|	forstat	->	^(FORSTAT	forstat)
	|	whilestat	->	^(WHILESTAT	whilestat)
	|	declarefunc	->	^(DECLAREFUNC	declarefunc)
	|	callfunc	END	->	^(CALLFUNC	callfunc)
	;

prog	:	stat*	->	^(PROG	stat*)
	;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;


