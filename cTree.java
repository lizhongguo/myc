// $ANTLR 3.5.2 cTree.g 2015-12-24 14:21:38

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class cTree extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL", "CALLFUNC", "COMMENT", 
		"DECLAREFUNC", "DECLAREVAR", "ELSE", "END", "EXPONENT", "FLOAT", "FORSTAT", 
		"FUNC1", "FUNC2", "FUNC3", "FUNC4", "GIVEVALUE", "ID", "IF", "IFSTAT", 
		"INT", "PROG", "STAT", "WHILESTAT", "WS", "'!='", "'('", "')'", "'*'", 
		"'+'", "','", "'-'", "'/'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", 
		"'else'", "'float'", "'for'", "'if'", "'int'", "'return'", "'void'", "'while'", 
		"'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int CALL=4;
	public static final int CALLFUNC=5;
	public static final int COMMENT=6;
	public static final int DECLAREFUNC=7;
	public static final int DECLAREVAR=8;
	public static final int ELSE=9;
	public static final int END=10;
	public static final int EXPONENT=11;
	public static final int FLOAT=12;
	public static final int FORSTAT=13;
	public static final int FUNC1=14;
	public static final int FUNC2=15;
	public static final int FUNC3=16;
	public static final int FUNC4=17;
	public static final int GIVEVALUE=18;
	public static final int ID=19;
	public static final int IF=20;
	public static final int IFSTAT=21;
	public static final int INT=22;
	public static final int PROG=23;
	public static final int STAT=24;
	public static final int WHILESTAT=25;
	public static final int WS=26;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public cTree(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public cTree(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("cTreeTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return cTree.tokenNames; }
	@Override public String getGrammarFileName() { return "cTree.g"; }


	int	index=0;
	int     data_index=0;
	int 	labelindex=0;
	int 	labelindex_if=0;
	int     num=0;
	int     labelindex_bool=0;
	int     labelindex_while=0;
	int     labelindex_for=0;
	int     labelindex_func=0;
	int     deep=0;
	String  []text  =       new     String[1000];
	String  []data  =       new     String[1000];


	public static class boolexpr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "boolexpr"
	// cTree.g:27:1: boolexpr : ( ^( '==' s1= expr s2= expr ) | ^( '!=' s1= expr s2= expr ) | ^( '>=' s1= expr s2= expr ) | ^( '<=' s1= expr s2= expr ) | ^( '>' s1= expr s2= expr ) | ^( '<' s1= expr s2= expr ) );
	public final cTree.boolexpr_return boolexpr() throws RecognitionException {
		cTree.boolexpr_return retval = new cTree.boolexpr_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s1 =null;
		TreeRuleReturnScope s2 =null;

		try {
			// cTree.g:27:10: ( ^( '==' s1= expr s2= expr ) | ^( '!=' s1= expr s2= expr ) | ^( '>=' s1= expr s2= expr ) | ^( '<=' s1= expr s2= expr ) | ^( '>' s1= expr s2= expr ) | ^( '<' s1= expr s2= expr ) )
			int alt1=6;
			switch ( input.LA(1) ) {
			case 38:
				{
				alt1=1;
				}
				break;
			case 27:
				{
				alt1=2;
				}
				break;
			case 40:
				{
				alt1=3;
				}
				break;
			case 36:
				{
				alt1=4;
				}
				break;
			case 39:
				{
				alt1=5;
				}
				break;
			case 35:
				{
				alt1=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// cTree.g:27:12: ^( '==' s1= expr s2= expr )
					{
					match(input,38,FOLLOW_38_in_boolexpr42); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_boolexpr46);
					s1=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_boolexpr50);
					s2=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {text[index++]="pop rax";text[index++]="pop rbx";text[index++]="cmp eax,ebx";text[index++]="jz label_bool_1"+labelindex_bool+"";text[index++]="push 0";text[index++]="jmp label_bool_2"+labelindex_bool+"";text[index++]="label_bool_1"+labelindex_bool+":push 1";text[index++]="label_bool_2"+labelindex_bool+":";
					        labelindex_bool++;}
					}
					break;
				case 2 :
					// cTree.g:30:4: ^( '!=' s1= expr s2= expr )
					{
					match(input,27,FOLLOW_27_in_boolexpr60); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_boolexpr64);
					s1=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_boolexpr68);
					s2=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {text[index++]="pop rax";text[index++]="pop rbx";text[index++]="cmp eax,ebx";text[index++]="jnz label_bool_1"+labelindex_bool+"";text[index++]="push 0";text[index++]="jmp label_bool_2"+labelindex_bool+"";text[index++]="label_bool_1"+labelindex_bool+":push 1";text[index++]="label_bool_2"+labelindex_bool+":";
					        labelindex_bool++;}
					}
					break;
				case 3 :
					// cTree.g:33:4: ^( '>=' s1= expr s2= expr )
					{
					match(input,40,FOLLOW_40_in_boolexpr78); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_boolexpr82);
					s1=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_boolexpr86);
					s2=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {text[index++]="pop rax";text[index++]="pop rbx";text[index++]="cmp eax,ebx";text[index++]="jng label_bool_1"+labelindex_bool+"";text[index++]="push 0";text[index++]="jmp label_bool_2"+labelindex_bool+"";text[index++]="label_bool_1"+labelindex_bool+":push 1";text[index++]="label_bool_2"+labelindex_bool+":";
					        labelindex_bool++;}
					}
					break;
				case 4 :
					// cTree.g:36:4: ^( '<=' s1= expr s2= expr )
					{
					match(input,36,FOLLOW_36_in_boolexpr96); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_boolexpr100);
					s1=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_boolexpr104);
					s2=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {text[index++]="pop rax";text[index++]="pop rbx";text[index++]="cmp eax,ebx";text[index++]="jnl label_bool_1"+labelindex_bool+"";text[index++]="push 0";text[index++]="jmp label_bool_2"+labelindex_bool+"";text[index++]="label_bool_1"+labelindex_bool+":push 1";text[index++]="label_bool_2"+labelindex_bool+":";
					        labelindex_bool++;}
					}
					break;
				case 5 :
					// cTree.g:39:4: ^( '>' s1= expr s2= expr )
					{
					match(input,39,FOLLOW_39_in_boolexpr114); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_boolexpr118);
					s1=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_boolexpr122);
					s2=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {text[index++]="pop rax";text[index++]="pop rbx";text[index++]="cmp eax,ebx";text[index++]="jl label_bool_1"+labelindex_bool+"";text[index++]="push 0";text[index++]="jmp label_bool_2"+labelindex_bool+"";text[index++]="label_bool_1"+labelindex_bool+":push 1";text[index++]="label_bool_2"+labelindex_bool+":";
					        labelindex_bool++;}
					}
					break;
				case 6 :
					// cTree.g:42:4: ^( '<' s1= expr s2= expr )
					{
					match(input,35,FOLLOW_35_in_boolexpr132); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_boolexpr136);
					s1=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_boolexpr140);
					s2=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {text[index++]="pop rax";text[index++]="pop rbx";text[index++]="cmp eax,ebx";text[index++]="jg label_bool_1"+labelindex_bool+"";text[index++]="push 0";text[index++]="jmp label_bool_2"+labelindex_bool+"";text[index++]="label_bool_1"+labelindex_bool+":push 1";text[index++]="label_bool_2"+labelindex_bool+":";
					        labelindex_bool++;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolexpr"


	public static class expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// cTree.g:46:1: expr : ( ^( '+' s1= expr s2= expr ) | ^( '-' s1= expr s2= expr ) | ^( '*' s1= expr s2= expr ) | ^( '/' s1= expr s2= expr ) | INT | FLOAT | ID | callfunc );
	public final cTree.expr_return expr() throws RecognitionException {
		cTree.expr_return retval = new cTree.expr_return();
		retval.start = input.LT(1);

		CommonTree INT1=null;
		CommonTree FLOAT2=null;
		CommonTree ID3=null;
		TreeRuleReturnScope s1 =null;
		TreeRuleReturnScope s2 =null;

		try {
			// cTree.g:46:6: ( ^( '+' s1= expr s2= expr ) | ^( '-' s1= expr s2= expr ) | ^( '*' s1= expr s2= expr ) | ^( '/' s1= expr s2= expr ) | INT | FLOAT | ID | callfunc )
			int alt2=8;
			switch ( input.LA(1) ) {
			case 31:
				{
				alt2=1;
				}
				break;
			case 33:
				{
				alt2=2;
				}
				break;
			case 30:
				{
				alt2=3;
				}
				break;
			case 34:
				{
				alt2=4;
				}
				break;
			case INT:
				{
				alt2=5;
				}
				break;
			case FLOAT:
				{
				alt2=6;
				}
				break;
			case ID:
				{
				alt2=7;
				}
				break;
			case CALL:
				{
				alt2=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// cTree.g:46:8: ^( '+' s1= expr s2= expr )
					{
					match(input,31,FOLLOW_31_in_expr154); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr158);
					s1=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr162);
					s2=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {text[index++]="pop rbx";text[index++]="pop rax";text[index++]="add eax,ebx";text[index++]="push rax";}
					}
					break;
				case 2 :
					// cTree.g:47:4: ^( '-' s1= expr s2= expr )
					{
					match(input,33,FOLLOW_33_in_expr170); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr174);
					s1=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr178);
					s2=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {text[index++]="pop rbx";text[index++]="pop rax";text[index++]="sub eax,ebx";text[index++]="push rax";}
					}
					break;
				case 3 :
					// cTree.g:48:4: ^( '*' s1= expr s2= expr )
					{
					match(input,30,FOLLOW_30_in_expr186); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr190);
					s1=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr194);
					s2=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {text[index++]="pop rbx";text[index++]="pop rax";text[index++]="mul eax,ebx";text[index++]="push rax";}
					}
					break;
				case 4 :
					// cTree.g:49:4: ^( '/' s1= expr s2= expr )
					{
					match(input,34,FOLLOW_34_in_expr202); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr206);
					s1=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr210);
					s2=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {text[index++]="pop rbx";text[index++]="pop rax";text[index++]="div eax,ebx";text[index++]="push rax";}
					}
					break;
				case 5 :
					// cTree.g:50:4: INT
					{
					INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr217); if (state.failed) return retval;
					if ( state.backtracking==0 ) {text[index++]="mov eax,"+INT1+"";text[index++]="push rax";}
					}
					break;
				case 6 :
					// cTree.g:51:4: FLOAT
					{
					FLOAT2=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_expr223); if (state.failed) return retval;
					if ( state.backtracking==0 ) {text[index++]="mov eax,"+FLOAT2+"";text[index++]=" push rax";}
					}
					break;
				case 7 :
					// cTree.g:52:4: ID
					{
					ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_expr229); if (state.failed) return retval;
					if ( state.backtracking==0 ) {text[index++]="mov eax,["+ID3+"]";text[index++]="push rax";}
					}
					break;
				case 8 :
					// cTree.g:53:4: callfunc
					{
					pushFollow(FOLLOW_callfunc_in_expr235);
					callfunc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {text[index++]="push rax";}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class declarevar_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "declarevar"
	// cTree.g:57:1: declarevar : ( ^( 'int' ID ) | ^( 'float' ID ) );
	public final cTree.declarevar_return declarevar() throws RecognitionException {
		cTree.declarevar_return retval = new cTree.declarevar_return();
		retval.start = input.LT(1);

		CommonTree ID4=null;
		CommonTree ID5=null;

		try {
			// cTree.g:57:12: ( ^( 'int' ID ) | ^( 'float' ID ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==45) ) {
				alt3=1;
			}
			else if ( (LA3_0==42) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// cTree.g:57:14: ^( 'int' ID )
					{
					match(input,45,FOLLOW_45_in_declarevar249); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_declarevar251); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {data[data_index++]=ID4+" dd	 0";}
					}
					break;
				case 2 :
					// cTree.g:58:4: ^( 'float' ID )
					{
					match(input,42,FOLLOW_42_in_declarevar259); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_declarevar261); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {data[data_index++]=ID5+" dd	 0";}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarevar"


	public static class givevalue_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "givevalue"
	// cTree.g:61:1: givevalue : ^( '=' ID expr ) ;
	public final cTree.givevalue_return givevalue() throws RecognitionException {
		cTree.givevalue_return retval = new cTree.givevalue_return();
		retval.start = input.LT(1);

		CommonTree ID6=null;

		try {
			// cTree.g:61:11: ( ^( '=' ID expr ) )
			// cTree.g:61:13: ^( '=' ID expr )
			{
			match(input,37,FOLLOW_37_in_givevalue275); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_givevalue277); if (state.failed) return retval;
			pushFollow(FOLLOW_expr_in_givevalue279);
			expr();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			if ( state.backtracking==0 ) {text[index++]="pop rax";text[index++]="mov ["+ID6+"],eax";}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "givevalue"


	public static class ifstat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ifstat"
	// cTree.g:64:1: ifstat options {backtrack=true; } : ( ^( IF index_if= INT boolexpr (s= stat )* ) | ^( IF index_if= INT boolexpr (s1= stat )* ELSE (s2= stat )* ) );
	public final cTree.ifstat_return ifstat() throws RecognitionException {
		cTree.ifstat_return retval = new cTree.ifstat_return();
		retval.start = input.LT(1);

		CommonTree index_if=null;
		TreeRuleReturnScope s =null;
		TreeRuleReturnScope s1 =null;
		TreeRuleReturnScope s2 =null;

		try {
			// cTree.g:65:2: ( ^( IF index_if= INT boolexpr (s= stat )* ) | ^( IF index_if= INT boolexpr (s1= stat )* ELSE (s2= stat )* ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==IF) ) {
				int LA7_1 = input.LA(2);
				if ( (synpred1_cTree()) ) {
					alt7=1;
				}
				else if ( (true) ) {
					alt7=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// cTree.g:65:4: ^( IF index_if= INT boolexpr (s= stat )* )
					{
					match(input,IF,FOLLOW_IF_in_ifstat301); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					index_if=(CommonTree)match(input,INT,FOLLOW_INT_in_ifstat305); if (state.failed) return retval;
					pushFollow(FOLLOW_boolexpr_in_ifstat307);
					boolexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {text[index++]="pop rax";text[index++]="cmp eax,1";text[index++]="jnz label_if0"+index_if+"";}
					// cTree.g:66:4: (s= stat )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==CALLFUNC||(LA4_0 >= DECLAREFUNC && LA4_0 <= DECLAREVAR)||LA4_0==FORSTAT||LA4_0==GIVEVALUE||LA4_0==IFSTAT||LA4_0==WHILESTAT) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// cTree.g:66:4: s= stat
							{
							pushFollow(FOLLOW_stat_in_ifstat314);
							s=stat();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop4;
						}
					}

					if ( state.backtracking==0 ) {text[index++]="label_if0"+index_if+":";}
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {labelindex_if++;}
					}
					break;
				case 2 :
					// cTree.g:67:4: ^( IF index_if= INT boolexpr (s1= stat )* ELSE (s2= stat )* )
					{
					match(input,IF,FOLLOW_IF_in_ifstat324); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					index_if=(CommonTree)match(input,INT,FOLLOW_INT_in_ifstat328); if (state.failed) return retval;
					pushFollow(FOLLOW_boolexpr_in_ifstat330);
					boolexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {text[index++]="pop rax";text[index++]="cmp eax,1";text[index++]="jnz label_if1"+index_if+"";}
					// cTree.g:68:5: (s1= stat )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==CALLFUNC||(LA5_0 >= DECLAREFUNC && LA5_0 <= DECLAREVAR)||LA5_0==FORSTAT||LA5_0==GIVEVALUE||LA5_0==IFSTAT||LA5_0==WHILESTAT) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// cTree.g:68:5: s1= stat
							{
							pushFollow(FOLLOW_stat_in_ifstat337);
							s1=stat();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop5;
						}
					}

					if ( state.backtracking==0 ) {text[index++]="jmp label_if2"+index_if+"";text[index++]="label_if1"+index_if+":";}
					match(input,ELSE,FOLLOW_ELSE_in_ifstat344); if (state.failed) return retval;
					// cTree.g:70:6: (s2= stat )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==CALLFUNC||(LA6_0 >= DECLAREFUNC && LA6_0 <= DECLAREVAR)||LA6_0==FORSTAT||LA6_0==GIVEVALUE||LA6_0==IFSTAT||LA6_0==WHILESTAT) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// cTree.g:70:6: s2= stat
							{
							pushFollow(FOLLOW_stat_in_ifstat352);
							s2=stat();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop6;
						}
					}

					if ( state.backtracking==0 ) {text[index++]="label_if2"+index_if+":";}
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {labelindex_if++;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifstat"


	public static class whilestat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whilestat"
	// cTree.g:74:1: whilestat : ^( 'while' index_while= INT boolexpr ( stat )* ) ;
	public final cTree.whilestat_return whilestat() throws RecognitionException {
		cTree.whilestat_return retval = new cTree.whilestat_return();
		retval.start = input.LT(1);

		CommonTree index_while=null;

		try {
			// cTree.g:74:11: ( ^( 'while' index_while= INT boolexpr ( stat )* ) )
			// cTree.g:74:13: ^( 'while' index_while= INT boolexpr ( stat )* )
			{
			match(input,48,FOLLOW_48_in_whilestat370); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			index_while=(CommonTree)match(input,INT,FOLLOW_INT_in_whilestat374); if (state.failed) return retval;
			if ( state.backtracking==0 ) {text[index++]="label_while"+index_while+":";}
			pushFollow(FOLLOW_boolexpr_in_whilestat378);
			boolexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {text[index++]="pop rax";text[index++]="cmp eax,1";text[index++]="jnz label_while2"+index_while+"";}
			// cTree.g:75:2: ( stat )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==CALLFUNC||(LA8_0 >= DECLAREFUNC && LA8_0 <= DECLAREVAR)||LA8_0==FORSTAT||LA8_0==GIVEVALUE||LA8_0==IFSTAT||LA8_0==WHILESTAT) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// cTree.g:75:2: stat
					{
					pushFollow(FOLLOW_stat_in_whilestat382);
					stat();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop8;
				}
			}

			if ( state.backtracking==0 ) {text[index++]="jmp label_while"+index_while+"\nlabel_while2"+index_while+":";}
			match(input, Token.UP, null); if (state.failed) return retval;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whilestat"


	public static class forstat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "forstat"
	// cTree.g:78:1: forstat : ^( 'for' index_for= INT s1= givevalue s2= boolexpr (s4= stat )* s3= givevalue ) ;
	public final cTree.forstat_return forstat() throws RecognitionException {
		cTree.forstat_return retval = new cTree.forstat_return();
		retval.start = input.LT(1);

		CommonTree index_for=null;
		TreeRuleReturnScope s1 =null;
		TreeRuleReturnScope s2 =null;
		TreeRuleReturnScope s4 =null;
		TreeRuleReturnScope s3 =null;

		try {
			// cTree.g:78:9: ( ^( 'for' index_for= INT s1= givevalue s2= boolexpr (s4= stat )* s3= givevalue ) )
			// cTree.g:78:11: ^( 'for' index_for= INT s1= givevalue s2= boolexpr (s4= stat )* s3= givevalue )
			{
			match(input,43,FOLLOW_43_in_forstat396); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			index_for=(CommonTree)match(input,INT,FOLLOW_INT_in_forstat400); if (state.failed) return retval;
			pushFollow(FOLLOW_givevalue_in_forstat406);
			s1=givevalue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {text[index++]="label_for"+index_for+":";}
			pushFollow(FOLLOW_boolexpr_in_forstat412);
			s2=boolexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {text[index++]="pop rax";text[index++]="cmp eax,1";text[index++]="jnz label_for2"+index_for+"";}
			// cTree.g:81:4: (s4= stat )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==CALLFUNC||(LA9_0 >= DECLAREFUNC && LA9_0 <= DECLAREVAR)||LA9_0==FORSTAT||LA9_0==GIVEVALUE||LA9_0==IFSTAT||LA9_0==WHILESTAT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// cTree.g:81:4: s4= stat
					{
					pushFollow(FOLLOW_stat_in_forstat418);
					s4=stat();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop9;
				}
			}

			pushFollow(FOLLOW_givevalue_in_forstat425);
			s3=givevalue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {text[index++]="jmp label_for"+index_for+"";text[index++]="label_for2"+index_for+":";}
			match(input, Token.UP, null); if (state.failed) return retval;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forstat"


	public static class declarefunc_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "declarefunc"
	// cTree.g:85:1: declarefunc : ( ^( FUNC1 ID (s1= stat )* ) | ^( FUNC2 ID ( stat )* expr ) | ^( FUNC3 a= ID ( ( 'int' | 'float' ) b= ID )+ ( stat )* ) | ^( FUNC4 a= ID ( ( 'int' | 'float' ) b= ID )+ ( stat )* expr ) );
	public final cTree.declarefunc_return declarefunc() throws RecognitionException {
		cTree.declarefunc_return retval = new cTree.declarefunc_return();
		retval.start = input.LT(1);

		CommonTree a=null;
		CommonTree b=null;
		CommonTree ID7=null;
		CommonTree ID8=null;
		TreeRuleReturnScope s1 =null;

		try {
			// cTree.g:86:2: ( ^( FUNC1 ID (s1= stat )* ) | ^( FUNC2 ID ( stat )* expr ) | ^( FUNC3 a= ID ( ( 'int' | 'float' ) b= ID )+ ( stat )* ) | ^( FUNC4 a= ID ( ( 'int' | 'float' ) b= ID )+ ( stat )* expr ) )
			int alt16=4;
			switch ( input.LA(1) ) {
			case FUNC1:
				{
				alt16=1;
				}
				break;
			case FUNC2:
				{
				alt16=2;
				}
				break;
			case FUNC3:
				{
				alt16=3;
				}
				break;
			case FUNC4:
				{
				alt16=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// cTree.g:86:4: ^( FUNC1 ID (s1= stat )* )
					{
					match(input,FUNC1,FOLLOW_FUNC1_in_declarefunc440); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_declarefunc445); if (state.failed) return retval;
					if ( state.backtracking==0 ) {text[index++]="jmp label_func"+labelindex_func+"";text[index++]="label_"+ID7+":";text[index++]="push rbp";text[index++]="mov rbp,rsp";}
					// cTree.g:88:5: (s1= stat )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==CALLFUNC||(LA10_0 >= DECLAREFUNC && LA10_0 <= DECLAREVAR)||LA10_0==FORSTAT||LA10_0==GIVEVALUE||LA10_0==IFSTAT||LA10_0==WHILESTAT) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// cTree.g:88:5: s1= stat
							{
							pushFollow(FOLLOW_stat_in_declarefunc453);
							s1=stat();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop10;
						}
					}

					if ( state.backtracking==0 ) {text[index++]="mov rsp,rbp";text[index++]="pop rbp";text[index++]="ret";text[index++]="label_func"+labelindex_func+":";}
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {labelindex_func++;}
					}
					break;
				case 2 :
					// cTree.g:89:4: ^( FUNC2 ID ( stat )* expr )
					{
					match(input,FUNC2,FOLLOW_FUNC2_in_declarefunc464); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_declarefunc466); if (state.failed) return retval;
					if ( state.backtracking==0 ) {text[index++]="jmp label"+labelindex+"";text[index++]="label_"+ID8+":";text[index++]="push rbp";text[index++]="mov rbp,rsp";}
					// cTree.g:90:3: ( stat )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==CALLFUNC||(LA11_0 >= DECLAREFUNC && LA11_0 <= DECLAREVAR)||LA11_0==FORSTAT||LA11_0==GIVEVALUE||LA11_0==IFSTAT||LA11_0==WHILESTAT) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// cTree.g:90:3: stat
							{
							pushFollow(FOLLOW_stat_in_declarefunc471);
							stat();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop11;
						}
					}

					pushFollow(FOLLOW_expr_in_declarefunc477);
					expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {text[index++]="pop rax";text[index++]="mov rsp,rbp";text[index++]="pop rbp";text[index++]="ret";text[index++]="label"+labelindex+":";text[index++]="push rbp";text[index++]="mov rbp,rsp";}
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {labelindex++;}
					}
					break;
				case 3 :
					// cTree.g:92:4: ^( FUNC3 a= ID ( ( 'int' | 'float' ) b= ID )+ ( stat )* )
					{
					match(input,FUNC3,FOLLOW_FUNC3_in_declarefunc486); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					a=(CommonTree)match(input,ID,FOLLOW_ID_in_declarefunc490); if (state.failed) return retval;
					if ( state.backtracking==0 ) {num=0;text[index++]="jmp label_func"+labelindex_func+"";text[index++]="label_"+a+":";}
					// cTree.g:93:2: ( ( 'int' | 'float' ) b= ID )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==42||LA12_0==45) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// cTree.g:93:3: ( 'int' | 'float' ) b= ID
							{
							if ( input.LA(1)==42||input.LA(1)==45 ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							b=(CommonTree)match(input,ID,FOLLOW_ID_in_declarefunc504); if (state.failed) return retval;
							if ( state.backtracking==0 ) {text[index++]="mov rax,[ rbp+"+"+16+";text[index++]="mov ["+b+"],rax";num++;data[data_index++]=b+" dd 0";}
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					if ( state.backtracking==0 ) {for(int i=1;i<=num;i++){text[index-2*i] = text[index-2*i]+ 8*i+"]";}}
					// cTree.g:95:2: ( stat )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==CALLFUNC||(LA13_0 >= DECLAREFUNC && LA13_0 <= DECLAREVAR)||LA13_0==FORSTAT||LA13_0==GIVEVALUE||LA13_0==IFSTAT||LA13_0==WHILESTAT) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// cTree.g:95:2: stat
							{
							pushFollow(FOLLOW_stat_in_declarefunc521);
							stat();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop13;
						}
					}

					if ( state.backtracking==0 ) {text[index++]="mov rsp,rbp";text[index++]="pop rbp";text[index++]="ret";text[index++]="label_func"+labelindex_func+":";}
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {labelindex_func++;}
					}
					break;
				case 4 :
					// cTree.g:97:4: ^( FUNC4 a= ID ( ( 'int' | 'float' ) b= ID )+ ( stat )* expr )
					{
					match(input,FUNC4,FOLLOW_FUNC4_in_declarefunc540); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					a=(CommonTree)match(input,ID,FOLLOW_ID_in_declarefunc544); if (state.failed) return retval;
					if ( state.backtracking==0 ) {num=0;text[index++]="jmp label_func"+labelindex_func+"";text[index++]="label_"+a+":";text[index++]="push rbp";text[index++]="mov rbp,rsp";}
					// cTree.g:98:3: ( ( 'int' | 'float' ) b= ID )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==42||LA14_0==45) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// cTree.g:98:4: ( 'int' | 'float' ) b= ID
							{
							if ( input.LA(1)==42||input.LA(1)==45 ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							b=(CommonTree)match(input,ID,FOLLOW_ID_in_declarefunc558); if (state.failed) return retval;
							if ( state.backtracking==0 ) {text[index++]="mov rax,[ rbp+"+16+"+";text[index++]="mov ["+b+"],rax";num++;data[data_index++]=b+" dd 0";}
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					if ( state.backtracking==0 ) {for(int i=1;i<=num;i++){text[index-2*i]=text[index-2*i]+8*i+"]";}}
					// cTree.g:100:17: ( stat )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==CALLFUNC||(LA15_0 >= DECLAREFUNC && LA15_0 <= DECLAREVAR)||LA15_0==FORSTAT||LA15_0==GIVEVALUE||LA15_0==IFSTAT||LA15_0==WHILESTAT) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// cTree.g:100:17: stat
							{
							pushFollow(FOLLOW_stat_in_declarefunc606);
							stat();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

						default :
							break loop15;
						}
					}

					pushFollow(FOLLOW_expr_in_declarefunc612);
					expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {text[index++]="pop rax";text[index++]="mov rsp,rbp";text[index++]="pop rbp";text[index++]="ret";text[index++]="label_func"+labelindex_func+":";}
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {labelindex++;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarefunc"


	public static class callfunc_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "callfunc"
	// cTree.g:105:1: callfunc : ( ^( CALL ID ) | ^( CALL ID ( expr )+ ) );
	public final cTree.callfunc_return callfunc() throws RecognitionException {
		cTree.callfunc_return retval = new cTree.callfunc_return();
		retval.start = input.LT(1);

		CommonTree ID9=null;
		CommonTree ID10=null;

		try {
			// cTree.g:105:10: ( ^( CALL ID ) | ^( CALL ID ( expr )+ ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==CALL) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==DOWN) ) {
					int LA18_2 = input.LA(3);
					if ( (LA18_2==ID) ) {
						int LA18_3 = input.LA(4);
						if ( (LA18_3==UP) ) {
							alt18=1;
						}
						else if ( (LA18_3==CALL||LA18_3==FLOAT||LA18_3==ID||LA18_3==INT||(LA18_3 >= 30 && LA18_3 <= 31)||(LA18_3 >= 33 && LA18_3 <= 34)) ) {
							alt18=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 18, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 18, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// cTree.g:105:12: ^( CALL ID )
					{
					match(input,CALL,FOLLOW_CALL_in_callfunc636); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_callfunc638); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {text[index++]="call label_"+ID9+"";}
					}
					break;
				case 2 :
					// cTree.g:106:4: ^( CALL ID ( expr )+ )
					{
					match(input,CALL,FOLLOW_CALL_in_callfunc646); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					ID10=(CommonTree)match(input,ID,FOLLOW_ID_in_callfunc648); if (state.failed) return retval;
					if ( state.backtracking==0 ) {num=0;}
					// cTree.g:106:22: ( expr )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==CALL||LA17_0==FLOAT||LA17_0==ID||LA17_0==INT||(LA17_0 >= 30 && LA17_0 <= 31)||(LA17_0 >= 33 && LA17_0 <= 34)) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// cTree.g:106:23: expr
							{
							pushFollow(FOLLOW_expr_in_callfunc652);
							expr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {num++;}
							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {text[index++]="push "+num;text[index++]="call label_"+ID10+"";}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "callfunc"


	public static class stat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "stat"
	// cTree.g:109:1: stat : ( ^( DECLAREVAR declarevar ) | ^( GIVEVALUE givevalue ) | ^( IFSTAT ifstat ) | ^( FORSTAT forstat ) | ^( WHILESTAT whilestat ) | ^( DECLAREFUNC declarefunc ) | ^( CALLFUNC callfunc ) );
	public final cTree.stat_return stat() throws RecognitionException {
		cTree.stat_return retval = new cTree.stat_return();
		retval.start = input.LT(1);

		try {
			// cTree.g:109:6: ( ^( DECLAREVAR declarevar ) | ^( GIVEVALUE givevalue ) | ^( IFSTAT ifstat ) | ^( FORSTAT forstat ) | ^( WHILESTAT whilestat ) | ^( DECLAREFUNC declarefunc ) | ^( CALLFUNC callfunc ) )
			int alt19=7;
			switch ( input.LA(1) ) {
			case DECLAREVAR:
				{
				alt19=1;
				}
				break;
			case GIVEVALUE:
				{
				alt19=2;
				}
				break;
			case IFSTAT:
				{
				alt19=3;
				}
				break;
			case FORSTAT:
				{
				alt19=4;
				}
				break;
			case WHILESTAT:
				{
				alt19=5;
				}
				break;
			case DECLAREFUNC:
				{
				alt19=6;
				}
				break;
			case CALLFUNC:
				{
				alt19=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// cTree.g:109:8: ^( DECLAREVAR declarevar )
					{
					match(input,DECLAREVAR,FOLLOW_DECLAREVAR_in_stat668); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_declarevar_in_stat670);
					declarevar();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 2 :
					// cTree.g:110:4: ^( GIVEVALUE givevalue )
					{
					match(input,GIVEVALUE,FOLLOW_GIVEVALUE_in_stat677); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_givevalue_in_stat679);
					givevalue();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 3 :
					// cTree.g:111:4: ^( IFSTAT ifstat )
					{
					match(input,IFSTAT,FOLLOW_IFSTAT_in_stat686); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_ifstat_in_stat688);
					ifstat();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 4 :
					// cTree.g:112:4: ^( FORSTAT forstat )
					{
					match(input,FORSTAT,FOLLOW_FORSTAT_in_stat695); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_forstat_in_stat697);
					forstat();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 5 :
					// cTree.g:113:4: ^( WHILESTAT whilestat )
					{
					match(input,WHILESTAT,FOLLOW_WHILESTAT_in_stat704); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_whilestat_in_stat706);
					whilestat();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 6 :
					// cTree.g:114:4: ^( DECLAREFUNC declarefunc )
					{
					match(input,DECLAREFUNC,FOLLOW_DECLAREFUNC_in_stat713); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_declarefunc_in_stat715);
					declarefunc();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 7 :
					// cTree.g:115:4: ^( CALLFUNC callfunc )
					{
					match(input,CALLFUNC,FOLLOW_CALLFUNC_in_stat722); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_callfunc_in_stat724);
					callfunc();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class prog_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "prog"
	// cTree.g:118:1: prog : ^( PROG ( stat )* ) ;
	public final cTree.prog_return prog() throws RecognitionException {
		cTree.prog_return retval = new cTree.prog_return();
		retval.start = input.LT(1);

		try {
			// cTree.g:118:6: ( ^( PROG ( stat )* ) )
			// cTree.g:118:8: ^( PROG ( stat )* )
			{
			match(input,PROG,FOLLOW_PROG_in_prog736); if (state.failed) return retval;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// cTree.g:118:15: ( stat )*
				loop20:
				while (true) {
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==CALLFUNC||(LA20_0 >= DECLAREFUNC && LA20_0 <= DECLAREVAR)||LA20_0==FORSTAT||LA20_0==GIVEVALUE||LA20_0==IFSTAT||LA20_0==WHILESTAT) ) {
						alt20=1;
					}

					switch (alt20) {
					case 1 :
						// cTree.g:118:15: stat
						{
						pushFollow(FOLLOW_stat_in_prog738);
						stat();
						state._fsp--;
						if (state.failed) return retval;
						}
						break;

					default :
						break loop20;
					}
				}

				match(input, Token.UP, null); if (state.failed) return retval;
			}

			if ( state.backtracking==0 ) {
			                System.out.println("section .data\nt resb 100\nbuffer db 10 ,0,0");
			                for(int i=0;i<data_index;i++){
			                        System.out.println(data[i]);                
			                }                
			                System.out.println("section .text\nglobal _start\n_start:\n");
			                for(int i=0;i<index;i++){
			                        System.out.println(text[i]);                
			                }
			                System.out.println("call label_main\njmp label_a\nlabel_print:\nxor rcx,rcx\nxor rax,rax\npush rbp\nmov rbp,rsp\nmov rax,[rbp+8+8*2]\nlabel_prog:\nmov rbx,10\ndiv bl\nadd ah,30h\nmov ebx,buffer\nsub ebx,ecx\ndec ebx\nmov [ebx],ah\nmov ah,0\ninc rcx\ncmp rax,0\njnz label_prog\nmov ax,4\nmov ebx,1\nmov edx,ecx\nmov ecx,buffer\nsub ecx,edx\ninc edx\nint 80h\nmov rsp,rbp\npop rbp\nret\nlabel_a:\nmov ax,1\nmov ebx,0\nint 0x80\n");       
			        }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"

	// $ANTLR start synpred1_cTree
	public final void synpred1_cTree_fragment() throws RecognitionException {
		CommonTree index_if=null;
		TreeRuleReturnScope s =null;

		// cTree.g:65:4: ( ^( IF index_if= INT boolexpr (s= stat )* ) )
		// cTree.g:65:4: ^( IF index_if= INT boolexpr (s= stat )* )
		{
		match(input,IF,FOLLOW_IF_in_synpred1_cTree301); if (state.failed) return;
		match(input, Token.DOWN, null); if (state.failed) return;
		index_if=(CommonTree)match(input,INT,FOLLOW_INT_in_synpred1_cTree305); if (state.failed) return;
		pushFollow(FOLLOW_boolexpr_in_synpred1_cTree307);
		boolexpr();
		state._fsp--;
		if (state.failed) return;
		// cTree.g:66:4: (s= stat )*
		loop21:
		while (true) {
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==CALLFUNC||(LA21_0 >= DECLAREFUNC && LA21_0 <= DECLAREVAR)||LA21_0==FORSTAT||LA21_0==GIVEVALUE||LA21_0==IFSTAT||LA21_0==WHILESTAT) ) {
				alt21=1;
			}

			switch (alt21) {
			case 1 :
				// cTree.g:66:4: s= stat
				{
				pushFollow(FOLLOW_stat_in_synpred1_cTree314);
				s=stat();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop21;
			}
		}

		match(input, Token.UP, null); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_cTree

	// Delegated rules

	public final boolean synpred1_cTree() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_cTree_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_38_in_boolexpr42 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_boolexpr46 = new BitSet(new long[]{0x00000006C0481010L});
	public static final BitSet FOLLOW_expr_in_boolexpr50 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_27_in_boolexpr60 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_boolexpr64 = new BitSet(new long[]{0x00000006C0481010L});
	public static final BitSet FOLLOW_expr_in_boolexpr68 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_40_in_boolexpr78 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_boolexpr82 = new BitSet(new long[]{0x00000006C0481010L});
	public static final BitSet FOLLOW_expr_in_boolexpr86 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_36_in_boolexpr96 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_boolexpr100 = new BitSet(new long[]{0x00000006C0481010L});
	public static final BitSet FOLLOW_expr_in_boolexpr104 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_39_in_boolexpr114 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_boolexpr118 = new BitSet(new long[]{0x00000006C0481010L});
	public static final BitSet FOLLOW_expr_in_boolexpr122 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_35_in_boolexpr132 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_boolexpr136 = new BitSet(new long[]{0x00000006C0481010L});
	public static final BitSet FOLLOW_expr_in_boolexpr140 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_31_in_expr154 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr158 = new BitSet(new long[]{0x00000006C0481010L});
	public static final BitSet FOLLOW_expr_in_expr162 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_33_in_expr170 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr174 = new BitSet(new long[]{0x00000006C0481010L});
	public static final BitSet FOLLOW_expr_in_expr178 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_30_in_expr186 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr190 = new BitSet(new long[]{0x00000006C0481010L});
	public static final BitSet FOLLOW_expr_in_expr194 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_34_in_expr202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr206 = new BitSet(new long[]{0x00000006C0481010L});
	public static final BitSet FOLLOW_expr_in_expr210 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_expr217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_expr223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callfunc_in_expr235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_declarevar249 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_declarevar251 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_42_in_declarevar259 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_declarevar261 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_givevalue275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_givevalue277 = new BitSet(new long[]{0x00000006C0481010L});
	public static final BitSet FOLLOW_expr_in_givevalue279 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_ifstat301 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_ifstat305 = new BitSet(new long[]{0x000001D808000000L});
	public static final BitSet FOLLOW_boolexpr_in_ifstat307 = new BitSet(new long[]{0x00000000022421A8L});
	public static final BitSet FOLLOW_stat_in_ifstat314 = new BitSet(new long[]{0x00000000022421A8L});
	public static final BitSet FOLLOW_IF_in_ifstat324 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_ifstat328 = new BitSet(new long[]{0x000001D808000000L});
	public static final BitSet FOLLOW_boolexpr_in_ifstat330 = new BitSet(new long[]{0x00000000022423A0L});
	public static final BitSet FOLLOW_stat_in_ifstat337 = new BitSet(new long[]{0x00000000022423A0L});
	public static final BitSet FOLLOW_ELSE_in_ifstat344 = new BitSet(new long[]{0x00000000022421A8L});
	public static final BitSet FOLLOW_stat_in_ifstat352 = new BitSet(new long[]{0x00000000022421A8L});
	public static final BitSet FOLLOW_48_in_whilestat370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_whilestat374 = new BitSet(new long[]{0x000001D808000000L});
	public static final BitSet FOLLOW_boolexpr_in_whilestat378 = new BitSet(new long[]{0x00000000022421A8L});
	public static final BitSet FOLLOW_stat_in_whilestat382 = new BitSet(new long[]{0x00000000022421A8L});
	public static final BitSet FOLLOW_43_in_forstat396 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_forstat400 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_givevalue_in_forstat406 = new BitSet(new long[]{0x000001D808000000L});
	public static final BitSet FOLLOW_boolexpr_in_forstat412 = new BitSet(new long[]{0x00000020022421A0L});
	public static final BitSet FOLLOW_stat_in_forstat418 = new BitSet(new long[]{0x00000020022421A0L});
	public static final BitSet FOLLOW_givevalue_in_forstat425 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC1_in_declarefunc440 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_declarefunc445 = new BitSet(new long[]{0x00000000022421A8L});
	public static final BitSet FOLLOW_stat_in_declarefunc453 = new BitSet(new long[]{0x00000000022421A8L});
	public static final BitSet FOLLOW_FUNC2_in_declarefunc464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_declarefunc466 = new BitSet(new long[]{0x00000006C26C31B0L});
	public static final BitSet FOLLOW_stat_in_declarefunc471 = new BitSet(new long[]{0x00000006C26C31B0L});
	public static final BitSet FOLLOW_expr_in_declarefunc477 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC3_in_declarefunc486 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_declarefunc490 = new BitSet(new long[]{0x0000240000000000L});
	public static final BitSet FOLLOW_set_in_declarefunc496 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_declarefunc504 = new BitSet(new long[]{0x00002400022421A8L});
	public static final BitSet FOLLOW_stat_in_declarefunc521 = new BitSet(new long[]{0x00000000022421A8L});
	public static final BitSet FOLLOW_FUNC4_in_declarefunc540 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_declarefunc544 = new BitSet(new long[]{0x0000240000000000L});
	public static final BitSet FOLLOW_set_in_declarefunc550 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_declarefunc558 = new BitSet(new long[]{0x00002406C26C31B0L});
	public static final BitSet FOLLOW_stat_in_declarefunc606 = new BitSet(new long[]{0x00000006C26C31B0L});
	public static final BitSet FOLLOW_expr_in_declarefunc612 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CALL_in_callfunc636 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_callfunc638 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CALL_in_callfunc646 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_callfunc648 = new BitSet(new long[]{0x00000006C0481010L});
	public static final BitSet FOLLOW_expr_in_callfunc652 = new BitSet(new long[]{0x00000006C0481018L});
	public static final BitSet FOLLOW_DECLAREVAR_in_stat668 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declarevar_in_stat670 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GIVEVALUE_in_stat677 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_givevalue_in_stat679 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IFSTAT_in_stat686 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifstat_in_stat688 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FORSTAT_in_stat695 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_forstat_in_stat697 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILESTAT_in_stat704 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_whilestat_in_stat706 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLAREFUNC_in_stat713 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declarefunc_in_stat715 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CALLFUNC_in_stat722 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_callfunc_in_stat724 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROG_in_prog736 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_prog738 = new BitSet(new long[]{0x00000000022421A8L});
	public static final BitSet FOLLOW_IF_in_synpred1_cTree301 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_synpred1_cTree305 = new BitSet(new long[]{0x000001D808000000L});
	public static final BitSet FOLLOW_boolexpr_in_synpred1_cTree307 = new BitSet(new long[]{0x00000000022421A8L});
	public static final BitSet FOLLOW_stat_in_synpred1_cTree314 = new BitSet(new long[]{0x00000000022421A8L});
}
