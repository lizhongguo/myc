// $ANTLR 3.5.2 ExprEval.g 2015-11-26 02:04:27

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class ExprEval extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "END", "ID", "IFSTAT", 
		"INT", "NUM", "PROG", "STAT", "VAR", "WHILESTAT", "WS", "'('", "')'", 
		"'*'", "'+'", "'-'", "'='", "'else'", "'if'", "'int'", "'while'", "'{'", 
		"'}'", "'/'"
	};
	public static final int EOF=-1;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int BLOCK=4;
	public static final int END=5;
	public static final int ID=6;
	public static final int IFSTAT=7;
	public static final int INT=8;
	public static final int NUM=9;
	public static final int PROG=10;
	public static final int STAT=11;
	public static final int VAR=12;
	public static final int WHILESTAT=13;
	public static final int WS=14;
	public static final int T__27=27;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ExprEval(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprEval(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("ExprEvalTemplates", AngleBracketTemplateLexer.class);

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
	@Override public String[] getTokenNames() { return ExprEval.tokenNames; }
	@Override public String getGrammarFileName() { return "ExprEval.g"; }


	private int t=0;
	private int order=0;


	public static class prog_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "prog"
	// ExprEval.g:13:1: prog : ^( PROG ( stat )+ ) ;
	public final ExprEval.prog_return prog() throws RecognitionException {
		ExprEval.prog_return retval = new ExprEval.prog_return();
		retval.start = input.LT(1);

		try {
			// ExprEval.g:13:6: ( ^( PROG ( stat )+ ) )
			// ExprEval.g:13:8: ^( PROG ( stat )+ )
			{
			match(input,PROG,FOLLOW_PROG_in_prog39); 
			match(input, Token.DOWN, null); 
			// ExprEval.g:13:15: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==BLOCK||LA1_0==IFSTAT||LA1_0==STAT||LA1_0==WHILESTAT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ExprEval.g:13:15: stat
					{
					pushFollow(FOLLOW_stat_in_prog41);
					stat();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 

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


	public static class block_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "block"
	// ExprEval.g:14:1: block : ^( BLOCK ( stat )+ ) ;
	public final ExprEval.block_return block() throws RecognitionException {
		ExprEval.block_return retval = new ExprEval.block_return();
		retval.start = input.LT(1);

		try {
			// ExprEval.g:14:8: ( ^( BLOCK ( stat )+ ) )
			// ExprEval.g:14:11: ^( BLOCK ( stat )+ )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block53); 
			match(input, Token.DOWN, null); 
			// ExprEval.g:14:19: ( stat )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BLOCK||LA2_0==IFSTAT||LA2_0==STAT||LA2_0==WHILESTAT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ExprEval.g:14:19: stat
					{
					pushFollow(FOLLOW_stat_in_block55);
					stat();
					state._fsp--;

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match(input, Token.UP, null); 

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
	// $ANTLR end "block"


	public static class stat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "stat"
	// ExprEval.g:15:1: stat : ( ^( STAT expr ) | ^( IFSTAT ifstat ) | ^( WHILESTAT whilestat ) | ^( BLOCK block ) );
	public final ExprEval.stat_return stat() throws RecognitionException {
		ExprEval.stat_return retval = new ExprEval.stat_return();
		retval.start = input.LT(1);

		try {
			// ExprEval.g:15:7: ( ^( STAT expr ) | ^( IFSTAT ifstat ) | ^( WHILESTAT whilestat ) | ^( BLOCK block ) )
			int alt3=4;
			switch ( input.LA(1) ) {
			case STAT:
				{
				alt3=1;
				}
				break;
			case IFSTAT:
				{
				alt3=2;
				}
				break;
			case WHILESTAT:
				{
				alt3=3;
				}
				break;
			case BLOCK:
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// ExprEval.g:16:2: ^( STAT expr )
					{
					match(input,STAT,FOLLOW_STAT_in_stat67); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_stat69);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ExprEval.g:17:3: ^( IFSTAT ifstat )
					{
					match(input,IFSTAT,FOLLOW_IFSTAT_in_stat76); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_ifstat_in_stat78);
					ifstat();
					state._fsp--;

					match(input, Token.UP, null); 

					t++;
					}
					break;
				case 3 :
					// ExprEval.g:18:3: ^( WHILESTAT whilestat )
					{
					match(input,WHILESTAT,FOLLOW_WHILESTAT_in_stat86); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_whilestat_in_stat88);
					whilestat();
					state._fsp--;

					match(input, Token.UP, null); 

					t++;
					}
					break;
				case 4 :
					// ExprEval.g:19:3: ^( BLOCK block )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_stat95); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_block_in_stat97);
					block();
					state._fsp--;

					match(input, Token.UP, null); 

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


	public static class ifstat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ifstat"
	// ExprEval.g:21:1: ifstat : ^( 'if' expr s1= block s2= block ) ;
	public final ExprEval.ifstat_return ifstat() throws RecognitionException {
		ExprEval.ifstat_return retval = new ExprEval.ifstat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s1 =null;
		TreeRuleReturnScope s2 =null;

		try {
			// ExprEval.g:21:8: ( ^( 'if' expr s1= block s2= block ) )
			// ExprEval.g:21:10: ^( 'if' expr s1= block s2= block )
			{
			match(input,22,FOLLOW_22_in_ifstat107); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_ifstat109);
			expr();
			state._fsp--;

			System.out.println(".code jz llabel"+t);order++;
			pushFollow(FOLLOW_block_in_ifstat119);
			s1=block();
			state._fsp--;

			System.out.println(".code jmp label"+t+";\n.code llabel"+t+":");order++;
			pushFollow(FOLLOW_block_in_ifstat130);
			s2=block();
			state._fsp--;

			System.out.println(".code label"+t+":");order++;
			match(input, Token.UP, null); 


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
	// ExprEval.g:25:1: whilestat : ^( 'while' expr s3= block ) ;
	public final ExprEval.whilestat_return whilestat() throws RecognitionException {
		ExprEval.whilestat_return retval = new ExprEval.whilestat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s3 =null;

		try {
			// ExprEval.g:25:11: ( ^( 'while' expr s3= block ) )
			// ExprEval.g:25:13: ^( 'while' expr s3= block )
			{
			match(input,24,FOLLOW_24_in_whilestat145); 
			System.out.println(".code label"+t+":");order++;
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_whilestat150);
			expr();
			state._fsp--;

			System.out.println(".code jz llabel"+t+";");order++;
			pushFollow(FOLLOW_block_in_whilestat157);
			s3=block();
			state._fsp--;

			System.out.println(".code jmp label"+t+";");order++;
			match(input, Token.UP, null); 

			System.out.println(".code llabel"+t+":");order++;
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


	public static class expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// ExprEval.g:30:1: expr : ( ^( 'int' ID ) | ^( '=' ID expr ) | ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ^( '/' a= expr b= expr ) |a= atom );
	public final ExprEval.expr_return expr() throws RecognitionException {
		ExprEval.expr_return retval = new ExprEval.expr_return();
		retval.start = input.LT(1);

		CommonTree ID1=null;
		CommonTree ID2=null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope b =null;

		try {
			// ExprEval.g:30:6: ( ^( 'int' ID ) | ^( '=' ID expr ) | ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ^( '/' a= expr b= expr ) |a= atom )
			int alt4=7;
			switch ( input.LA(1) ) {
			case 23:
				{
				alt4=1;
				}
				break;
			case 20:
				{
				alt4=2;
				}
				break;
			case 18:
				{
				alt4=3;
				}
				break;
			case 19:
				{
				alt4=4;
				}
				break;
			case 17:
				{
				alt4=5;
				}
				break;
			case 27:
				{
				alt4=6;
				}
				break;
			case NUM:
			case VAR:
				{
				alt4=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// ExprEval.g:31:3: ^( 'int' ID )
					{
					match(input,23,FOLLOW_23_in_expr172); 
					match(input, Token.DOWN, null); 
					ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr174); 
					match(input, Token.UP, null); 

					System.out.println(".data "+ID1+" : .int 0");order++;
					}
					break;
				case 2 :
					// ExprEval.g:32:2: ^( '=' ID expr )
					{
					match(input,20,FOLLOW_20_in_expr180); 
					match(input, Token.DOWN, null); 
					ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_expr182); 
					pushFollow(FOLLOW_expr_in_expr184);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					System.out.println(".code popq %rax;\n.code movl %eax , "+ID2+";\n.code pushq %rax;");order++;
					}
					break;
				case 3 :
					// ExprEval.g:33:2: ^( '+' a= expr b= expr )
					{
					match(input,18,FOLLOW_18_in_expr190); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr194);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr198);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					System.out.println(".code popq %rbx;\n.code popq %rax;\n.code addl %ebx,%eax;\n.code pushq %rax;");order++;
					}
					break;
				case 4 :
					// ExprEval.g:34:2: ^( '-' a= expr b= expr )
					{
					match(input,19,FOLLOW_19_in_expr204); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr208);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr212);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					System.out.println(".code popq %rbx;\n.code popq %rax;\n.code subl %ebx,%eax;\n.code pushq %rax;");order++;
					}
					break;
				case 5 :
					// ExprEval.g:35:2: ^( '*' a= expr b= expr )
					{
					match(input,17,FOLLOW_17_in_expr218); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr222);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr226);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					System.out.println(".code popq %rbx;\n.code popq %rax;\n.code mull %ebx,%eax;\n.code pushq %rax;");order++;
					}
					break;
				case 6 :
					// ExprEval.g:36:2: ^( '/' a= expr b= expr )
					{
					match(input,27,FOLLOW_27_in_expr232); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr236);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr240);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					System.out.println(".code popq %rbx;\n.code popq %rax;\n.code div %ebx,%eax;\n.code pushq %rax;");order++;
					}
					break;
				case 7 :
					// ExprEval.g:37:2: a= atom
					{
					pushFollow(FOLLOW_atom_in_expr247);
					a=atom();
					state._fsp--;

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


	public static class atom_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "atom"
	// ExprEval.g:40:1: atom : ( ^( NUM i= INT ) | ^( VAR v= ID ) );
	public final ExprEval.atom_return atom() throws RecognitionException {
		ExprEval.atom_return retval = new ExprEval.atom_return();
		retval.start = input.LT(1);

		CommonTree i=null;
		CommonTree v=null;

		try {
			// ExprEval.g:40:6: ( ^( NUM i= INT ) | ^( VAR v= ID ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==NUM) ) {
				alt5=1;
			}
			else if ( (LA5_0==VAR) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// ExprEval.g:41:3: ^( NUM i= INT )
					{
					match(input,NUM,FOLLOW_NUM_in_atom257); 
					match(input, Token.DOWN, null); 
					i=(CommonTree)match(input,INT,FOLLOW_INT_in_atom261); 
					match(input, Token.UP, null); 

					System.out.println(".code mov $"+i+", %eax;\n.code pushq %rax;");order++;
					}
					break;
				case 2 :
					// ExprEval.g:42:4: ^( VAR v= ID )
					{
					match(input,VAR,FOLLOW_VAR_in_atom270); 
					match(input, Token.DOWN, null); 
					v=(CommonTree)match(input,ID,FOLLOW_ID_in_atom274); 
					match(input, Token.UP, null); 

					System.out.println(".code movl "+v+", %eax;\n.code pushq %rax;");order++;
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
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_PROG_in_prog39 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_prog41 = new BitSet(new long[]{0x0000000000002898L});
	public static final BitSet FOLLOW_BLOCK_in_block53 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_block55 = new BitSet(new long[]{0x0000000000002898L});
	public static final BitSet FOLLOW_STAT_in_stat67 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_stat69 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IFSTAT_in_stat76 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ifstat_in_stat78 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHILESTAT_in_stat86 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_whilestat_in_stat88 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_stat95 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_stat97 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_ifstat107 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_ifstat109 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_block_in_ifstat119 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_block_in_ifstat130 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_whilestat145 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_whilestat150 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_block_in_whilestat157 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_expr172 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr174 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_20_in_expr180 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr182 = new BitSet(new long[]{0x00000000089E1200L});
	public static final BitSet FOLLOW_expr_in_expr184 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_18_in_expr190 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr194 = new BitSet(new long[]{0x00000000089E1200L});
	public static final BitSet FOLLOW_expr_in_expr198 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_19_in_expr204 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr208 = new BitSet(new long[]{0x00000000089E1200L});
	public static final BitSet FOLLOW_expr_in_expr212 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_17_in_expr218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr222 = new BitSet(new long[]{0x00000000089E1200L});
	public static final BitSet FOLLOW_expr_in_expr226 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_27_in_expr232 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr236 = new BitSet(new long[]{0x00000000089E1200L});
	public static final BitSet FOLLOW_expr_in_expr240 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atom_in_expr247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_atom257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_atom261 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_atom270 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_atom274 = new BitSet(new long[]{0x0000000000000008L});
}
