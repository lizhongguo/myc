grammar test;
options{
    output=AST;
    ASTLabelType=CommonTree;
}
tokens{
PROG;STAT;BLOCK;NUM;VAR;IFSTAT;WHILESTAT;
}
prog:  (stat{System.out.println($stat.tree.toStringTree());})+ -> ^(PROG stat)+;
block: '{' stat+ '}' -> ^(BLOCK stat)+
	;
stat: 	expr END  -> ^(STAT expr)
	|ifstat  -> ^(IFSTAT ifstat)
	|whilestat -> ^(WHILESTAT whilestat)
	|block -> ^(BLOCK block)
;
ifstat	options{ backtrack=true;  } :
	'if' '(' expr ')'   c1=block  'else'  c2=block -> ^('if' expr $c1 $c2)
;
whilestat options{ backtrack=true;  }:	
	'while' '(' expr ')'   b=block  -> ^('while' expr $b)
;
expr:	 	
	'int'^  ID
	|multExpr  (('+' ^|'-' ^)  multExpr)*
	|ID  '='^  expr 
	
;
multExpr: atom ('*' ^ atom)* ;
atom: '('expr')' -> expr
    | INT -> ^(NUM INT)
    | ID -> ^(VAR ID)
    ;

ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '0'..'9'+ ;
END 	:	';';
WS  :   ('\r'|'\n'|' '|'\t')+{$channel=HIDDEN;};