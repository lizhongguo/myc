tree grammar ExprEval;
options{
tokenVocab=Expr;
ASTLabelType=CommonTree;
output = template;
}

@members{
private int t=0;
private int order=0;
}

prog	:	^(PROG stat+);
block 	: 	^(BLOCK stat+);
stat 	:
	^(STAT expr)	
	|^(IFSTAT ifstat){t++;}	
	|^(WHILESTAT whilestat){t++;}
	|^(BLOCK block)
;
ifstat	:	^('if' expr{System.out.println(".code jz llabel"+t);order++;} 
    s1=block{System.out.println(".code jmp label"+t+";\n.code llabel"+t+":");order++;}  
    s2=block{System.out.println(".code label"+t+":");order++;}){} 
	 ;
whilestat	: ^('while'{System.out.println(".code label"+t+":");order++;}
	 expr{System.out.println(".code jz llabel"+t+";");order++;} 
	s3=block{System.out.println(".code jmp label"+t+";");order++;})
	{System.out.println(".code llabel"+t+":");order++;}
; 
expr :
^('int' ID){System.out.println(".data "+$ID+" : .int 0");order++;}
|^('=' ID expr){System.out.println(".code popq \%rax;\n.code movl \%eax , "+$ID+";\n.code pushq \%rax;");order++;}
|^('+' a=expr b=expr){System.out.println(".code popq \%rbx;\n.code popq \%rax;\n.code addl \%ebx,\%eax;\n.code pushq \%rax;");order++;}
|^('-' a=expr b=expr){System.out.println(".code popq \%rbx;\n.code popq \%rax;\n.code subl \%ebx,\%eax;\n.code pushq \%rax;");order++;}
|^('*' a=expr b=expr){System.out.println(".code popq \%rbx;\n.code popq \%rax;\n.code mull \%ebx,\%eax;\n.code pushq \%rax;");order++;}
|^('/' a=expr b=expr){System.out.println(".code popq \%rbx;\n.code popq \%rax;\n.code div \%ebx,\%eax;\n.code pushq \%rax;");order++;}
|a=atom
;

atom :
^(NUM i=INT) {System.out.println(".code mov $"+$i+", \%eax;\n.code pushq \%rax;");order++;}
	|	^(VAR v=ID){System.out.println(".code movl "+$v+", \%eax;\n.code pushq \%rax;");order++;} 
;
