tree grammar cTree;
options{
tokenVocab=c;
ASTLabelType=CommonTree;
output=template;
}

@headers{

}

@members{
int	index=0;
int     data_index=0;
int 	labelindex=0;
int 	labelindex_if=0;
int     num=0;
int     labelindex_bool=0;
int     labelindex_while=0;
int     labelindex_for=0;
int     labelindex_func=0;
String  []text  =       new     String[1000];
String  []data  =       new     String[1000];
}

boolexpr	:	^('=='	s1=expr	s2=expr)
	{text[index++]="pop rax";text[index++]="pop rbx";text[index++]="cmp eax,ebx";text[index++]="jz label_bool_1"+labelindex_bool+"";text[index++]="push 0";text[index++]="jmp label_bool_2"+labelindex_bool+"";text[index++]="label_bool_1"+labelindex_bool+":push 1";text[index++]="label_bool_2"+labelindex_bool+":";
        labelindex_bool++;}
	|	^('!='	s1=expr	s2=expr)
	{text[index++]="pop rax";text[index++]="pop rbx";text[index++]="cmp eax,ebx";text[index++]="jnz label_bool_1"+labelindex_bool+"";text[index++]="push 0";text[index++]="jmp label_bool_2"+labelindex_bool+"";text[index++]="label_bool_1"+labelindex_bool+":push 1";text[index++]="label_bool_2"+labelindex_bool+":";
        labelindex_bool++;}
	|	^('>='	s1=expr	s2=expr)
	{text[index++]="pop rax";text[index++]="pop rbx";text[index++]="cmp eax,ebx";text[index++]="jng label_bool_1"+labelindex_bool+"";text[index++]="push 0";text[index++]="jmp label_bool_2"+labelindex_bool+"";text[index++]="label_bool_1"+labelindex_bool+":push 1";text[index++]="label_bool_2"+labelindex_bool+":";
        labelindex_bool++;}
	|	^('<='	s1=expr	s2=expr)
	{text[index++]="pop rax";text[index++]="pop rbx";text[index++]="cmp eax,ebx";text[index++]="jnl label_bool_1"+labelindex_bool+"";text[index++]="push 0";text[index++]="jmp label_bool_2"+labelindex_bool+"";text[index++]="label_bool_1"+labelindex_bool+":push 1";text[index++]="label_bool_2"+labelindex_bool+":";
        labelindex_bool++;}
	|	^('>'	s1=expr	s2=expr)
	{text[index++]="pop rax";text[index++]="pop rbx";text[index++]="cmp eax,ebx";text[index++]="jl label_bool_1"+labelindex_bool+"";text[index++]="push 0";text[index++]="jmp label_bool_2"+labelindex_bool+"";text[index++]="label_bool_1"+labelindex_bool+":push 1";text[index++]="label_bool_2"+labelindex_bool+":";
        labelindex_bool++;}
	|	^('<'	s1=expr	s2=expr)
	{text[index++]="pop rax";text[index++]="pop rbx";text[index++]="cmp eax,ebx";text[index++]="jg label_bool_1"+labelindex_bool+"";text[index++]="push 0";text[index++]="jmp label_bool_2"+labelindex_bool+"";text[index++]="label_bool_1"+labelindex_bool+":push 1";text[index++]="label_bool_2"+labelindex_bool+":";
        labelindex_bool++;}
	;
expr	:	^('+'	s1=expr	s2=expr){text[index++]="pop rbx";text[index++]="pop rax";text[index++]="add eax,ebx";text[index++]="push rax";}
	|	^('-'	s1=expr	s2=expr){text[index++]="pop rbx";text[index++]="pop rax";text[index++]="sub eax,ebx";text[index++]="push rax";}
	|	^('*'	s1=expr	s2=expr){text[index++]="pop rbx";text[index++]="pop rax";text[index++]="mul eax,ebx";text[index++]="push rax";}
	|	^('/'	s1=expr	s2=expr){text[index++]="pop rbx";text[index++]="pop rax";text[index++]="div eax,ebx";text[index++]="push rax";}
	|	INT{text[index++]="mov eax,"+$INT+"";text[index++]="push rax";}
	|	FLOAT{text[index++]="mov eax,"+$FLOAT+"";text[index++]=" push rax";}
	|	ID{text[index++]="mov eax,["+$ID+"]";text[index++]="push rax";}
	|	callfunc{text[index++]="push rax";}
	;

	
declarevar	:	^('int'	ID){data[data_index++]=$ID+" dd	 0";}
	|	^('float'	ID){data[data_index++]=$ID+" dd	 0";}
	;
	
givevalue	:	^('='	ID	expr){text[index++]="pop rax";text[index++]="mov ["+$ID+"],eax";}
	;
	
ifstat	options{backtrack=true;}
	:	^(IF	boolexpr{text[index++]="pop rax";text[index++]="cmp eax,1";text[index++]="jnz label_if0"+labelindex_if+"";}
		s=stat*{text[index++]="label_if0"+labelindex+":";}){labelindex_if++;}
	|	^(IF	boolexpr{text[index++]="pop rax";text[index++]="cmp eax,1";text[index++]="jnz label_if1"+labelindex_if+"";}
		s1=stat*{text[index++]="jmp label_if2"+labelindex_if+"";text[index++]="label1_if1"+labelindex_if+":";}
		 ELSE 
		 s2=stat*{text[index++]="label_if2"+labelindex_if+":";}){labelindex_if++;}
	;
	
	
whilestat	:	^('while'{text[index++]="label_while"+labelindex_while+":";}	boolexpr{text[index++]="pop rax";text[index++]="cmp eax,1";text[index++]="jnz label_while2"+labelindex_while+"";}
	stat*{text[index++]="jmp label_while"+labelindex_while+"\nlabel_while2"+labelindex_while+":";}){labelindex_while++;}
	;

forstat	:	^('for'	s1=givevalue{text[index++]="label_for"+labelindex_for+":";}
	s2=boolexpr{text[index++]="pop rax";text[index++]="cmp eax,1";text[index++]="jnz label_for2"+labelindex_for+"";}
	s4=stat*	
	s3=givevalue{text[index++]="jmp label_for"+labelindex_for+"";text[index++]="label_for2"+labelindex_for+":";}	){labelindex_for++;}
	;

declarefunc
	:	^(FUNC1	
		ID	{text[index++]="jmp label_func"+labelindex_func+"";text[index++]="label_"+$ID+":";text[index++]="push rbp";text[index++]="mov rbp,rsp";}
		s1=stat*	{text[index++]="mov rsp,rbp";text[index++]="pop rbp";text[index++]="ret";text[index++]="label_func"+labelindex_func+":";}){labelindex_func++;}
	|	^(FUNC2	ID{text[index++]="jmp label"+labelindex+"";text[index++]="label_"+$ID+":";text[index++]="push rbp";text[index++]="mov rbp,rsp";}
		stat*	
		expr{text[index++]="pop rax";text[index++]="mov rsp,rbp";text[index++]="pop rbp";text[index++]="ret";text[index++]="label"+labelindex+":";}){labelindex++;}
	|	^(FUNC3	a=ID{text[index++]="jmp label_func"+labelindex_func+"";text[index++]="label_"+$a+":";}	
	(('int'|'float'){text[index++]="push rbp";text[index++]="mov rbp,rsp";}	b=ID{text[index++]="mov rax,[ rbp+"+8+"+8+"+8*num+"]";text[index++]="mov ["+$b+"],rax";num--;data[data_index++]=$b+" dd 0";})+	
	stat*{text[index++]="mov rsp,rbp";text[index++]="pop rbp";text[index++]="ret";text[index++]="label_func"+labelindex_func+":";})
       	{labelindex_func++;}
	|	^(FUNC4{num=0;}	a=ID{text[index++]="jmp label_func"+labelindex_func+"";text[index++]="label_"+$a+":";}
		(('int'|'float'){text[index++]="push rbp";text[index++]="mov rbp,rsp";}	b=ID{text[index++]="mov rax,[ rbp+"+8+"+"+8*num+"]";text[index++]="mov ["+$b+"],rax";num--;data[data_index++]=$b+" dd 0";})+
        	stat*	
		expr{text[index++]="pop rax";text[index++]="mov rsp,rbp";text[index++]="pop rbp";text[index++]="ret";text[index++]="label"+labelindex_func+":";})
        {labelindex++;}
	;	

callfunc	:	^(CALL	ID){text[index++]="call label_"+$ID+"";}
	|	^(CALL	ID{num=0;}	(expr{num++;})+){text[index++]="push "+num;text[index++]="call label_"+$ID+"";}
	;

stat	:	^(DECLAREVAR	declarevar)
	|	^(GIVEVALUE	givevalue)
	|	^(IFSTAT	ifstat)
	|	^(FORSTAT	forstat)
	|	^(WHILESTAT	whilestat)
	|	^(DECLAREFUNC	declarefunc)
	|	^(CALLFUNC	callfunc)
	;

prog	:	^(PROG	stat*)
        {
                System.out.println("section .data\nt resb 100\nbuffer db 0 ,0,0");
                for(int i=0;i<data_index;i++){
                        System.out.println(data[i]);                
                }                
                System.out.println("section .text\nglobal _start\n_start:\n");
                for(int i=0;i<index;i++){
                        System.out.println(text[i]);                
                }
                System.out.println("call label_main\njmp label_a\nlabel_print:\nxor rcx,rcx\nxor rax,rax\npush rbp\nmov rbp,rsp\nmov rax,[rbp+8+8*2]\nlabel_prog:\nmov rbx,10\ndiv bl\nadd ah,30h\nmov ebx,buffer\nsub ebx,ecx\ndec ebx\nmov [ebx],ah\nmov ah,0\ninc rcx\ncmp rax,0\njnz label_prog\nmov ax,4\nmov ebx,1\nmov edx,ecx\nmov ecx,buffer\nsub ecx,edx\nint 80h\nmov rsp,rbp\npop rbp\nret\nlabel_a:\nmov ax,1\nmov ebx,0\nint 0x80\n");       
        }
	;
