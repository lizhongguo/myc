// $ANTLR 3.5.2 c.g 2015-12-24 14:21:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class cParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public cParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public cParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return cParser.tokenNames; }
	@Override public String getGrammarFileName() { return "c.g"; }


	public static class num_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "num"
	// c.g:24:1: num : ( INT | FLOAT );
	public final cParser.num_return num() throws RecognitionException {
		cParser.num_return retval = new cParser.num_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set1=null;

		CommonTree set1_tree=null;

		try {
			// c.g:24:5: ( INT | FLOAT )
			// c.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set1=input.LT(1);
			if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set1));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "num"


	public static class num_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "num_type"
	// c.g:28:1: num_type : ( 'int' | 'float' );
	public final cParser.num_type_return num_type() throws RecognitionException {
		cParser.num_type_return retval = new cParser.num_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set2=null;

		CommonTree set2_tree=null;

		try {
			// c.g:28:10: ( 'int' | 'float' )
			// c.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set2=input.LT(1);
			if ( input.LA(1)==42||input.LA(1)==45 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set2));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "num_type"


	public static class boolexpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolexpr"
	// c.g:41:1: boolexpr : expr ( '==' ^| '!=' ^| '>' ^| '<' ^| '>=' ^| '<=' ^) expr ;
	public final cParser.boolexpr_return boolexpr() throws RecognitionException {
		cParser.boolexpr_return retval = new cParser.boolexpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal4=null;
		Token string_literal5=null;
		Token char_literal6=null;
		Token char_literal7=null;
		Token string_literal8=null;
		Token string_literal9=null;
		ParserRuleReturnScope expr3 =null;
		ParserRuleReturnScope expr10 =null;

		CommonTree string_literal4_tree=null;
		CommonTree string_literal5_tree=null;
		CommonTree char_literal6_tree=null;
		CommonTree char_literal7_tree=null;
		CommonTree string_literal8_tree=null;
		CommonTree string_literal9_tree=null;

		try {
			// c.g:41:10: ( expr ( '==' ^| '!=' ^| '>' ^| '<' ^| '>=' ^| '<=' ^) expr )
			// c.g:41:12: expr ( '==' ^| '!=' ^| '>' ^| '<' ^| '>=' ^| '<=' ^) expr
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expr_in_boolexpr329);
			expr3=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr3.getTree());

			// c.g:41:17: ( '==' ^| '!=' ^| '>' ^| '<' ^| '>=' ^| '<=' ^)
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
			case 39:
				{
				alt1=3;
				}
				break;
			case 35:
				{
				alt1=4;
				}
				break;
			case 40:
				{
				alt1=5;
				}
				break;
			case 36:
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
					// c.g:41:18: '==' ^
					{
					string_literal4=(Token)match(input,38,FOLLOW_38_in_boolexpr332); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal4_tree = (CommonTree)adaptor.create(string_literal4);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal4_tree, root_0);
					}

					}
					break;
				case 2 :
					// c.g:41:24: '!=' ^
					{
					string_literal5=(Token)match(input,27,FOLLOW_27_in_boolexpr335); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal5_tree = (CommonTree)adaptor.create(string_literal5);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal5_tree, root_0);
					}

					}
					break;
				case 3 :
					// c.g:41:30: '>' ^
					{
					char_literal6=(Token)match(input,39,FOLLOW_39_in_boolexpr338); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal6_tree = (CommonTree)adaptor.create(char_literal6);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal6_tree, root_0);
					}

					}
					break;
				case 4 :
					// c.g:41:35: '<' ^
					{
					char_literal7=(Token)match(input,35,FOLLOW_35_in_boolexpr341); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal7_tree = (CommonTree)adaptor.create(char_literal7);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal7_tree, root_0);
					}

					}
					break;
				case 5 :
					// c.g:41:40: '>=' ^
					{
					string_literal8=(Token)match(input,40,FOLLOW_40_in_boolexpr344); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal8_tree = (CommonTree)adaptor.create(string_literal8);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal8_tree, root_0);
					}

					}
					break;
				case 6 :
					// c.g:41:46: '<=' ^
					{
					string_literal9=(Token)match(input,36,FOLLOW_36_in_boolexpr347); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal9_tree = (CommonTree)adaptor.create(string_literal9);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal9_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_expr_in_boolexpr351);
			expr10=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr10.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolexpr"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// c.g:43:1: expr : multexpr ( ( '+' ^| '-' ^) multexpr )* ;
	public final cParser.expr_return expr() throws RecognitionException {
		cParser.expr_return retval = new cParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal12=null;
		Token char_literal13=null;
		ParserRuleReturnScope multexpr11 =null;
		ParserRuleReturnScope multexpr14 =null;

		CommonTree char_literal12_tree=null;
		CommonTree char_literal13_tree=null;

		try {
			// c.g:43:6: ( multexpr ( ( '+' ^| '-' ^) multexpr )* )
			// c.g:43:8: multexpr ( ( '+' ^| '-' ^) multexpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multexpr_in_expr360);
			multexpr11=multexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multexpr11.getTree());

			// c.g:43:17: ( ( '+' ^| '-' ^) multexpr )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==31||LA3_0==33) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// c.g:43:18: ( '+' ^| '-' ^) multexpr
					{
					// c.g:43:18: ( '+' ^| '-' ^)
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==31) ) {
						alt2=1;
					}
					else if ( (LA2_0==33) ) {
						alt2=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// c.g:43:19: '+' ^
							{
							char_literal12=(Token)match(input,31,FOLLOW_31_in_expr364); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal12_tree = (CommonTree)adaptor.create(char_literal12);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal12_tree, root_0);
							}

							}
							break;
						case 2 :
							// c.g:43:26: '-' ^
							{
							char_literal13=(Token)match(input,33,FOLLOW_33_in_expr369); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal13_tree = (CommonTree)adaptor.create(char_literal13);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal13_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_multexpr_in_expr373);
					multexpr14=multexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multexpr14.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class multexpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multexpr"
	// c.g:46:1: multexpr : atom ( ( '*' ^| '/' ^) atom )* ;
	public final cParser.multexpr_return multexpr() throws RecognitionException {
		cParser.multexpr_return retval = new cParser.multexpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal16=null;
		Token char_literal17=null;
		ParserRuleReturnScope atom15 =null;
		ParserRuleReturnScope atom18 =null;

		CommonTree char_literal16_tree=null;
		CommonTree char_literal17_tree=null;

		try {
			// c.g:46:10: ( atom ( ( '*' ^| '/' ^) atom )* )
			// c.g:46:12: atom ( ( '*' ^| '/' ^) atom )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_atom_in_multexpr384);
			atom15=atom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, atom15.getTree());

			// c.g:46:17: ( ( '*' ^| '/' ^) atom )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==30||LA5_0==34) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// c.g:46:18: ( '*' ^| '/' ^) atom
					{
					// c.g:46:18: ( '*' ^| '/' ^)
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==30) ) {
						alt4=1;
					}
					else if ( (LA4_0==34) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// c.g:46:19: '*' ^
							{
							char_literal16=(Token)match(input,30,FOLLOW_30_in_multexpr388); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal16_tree = (CommonTree)adaptor.create(char_literal16);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal16_tree, root_0);
							}

							}
							break;
						case 2 :
							// c.g:46:24: '/' ^
							{
							char_literal17=(Token)match(input,34,FOLLOW_34_in_multexpr391); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							char_literal17_tree = (CommonTree)adaptor.create(char_literal17);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal17_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_atom_in_multexpr395);
					atom18=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom18.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multexpr"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// c.g:49:1: atom : ( '(' expr ')' -> ^( expr ) | num | ID | callfunc );
	public final cParser.atom_return atom() throws RecognitionException {
		cParser.atom_return retval = new cParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal19=null;
		Token char_literal21=null;
		Token ID23=null;
		ParserRuleReturnScope expr20 =null;
		ParserRuleReturnScope num22 =null;
		ParserRuleReturnScope callfunc24 =null;

		CommonTree char_literal19_tree=null;
		CommonTree char_literal21_tree=null;
		CommonTree ID23_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// c.g:49:6: ( '(' expr ')' -> ^( expr ) | num | ID | callfunc )
			int alt6=4;
			switch ( input.LA(1) ) {
			case 28:
				{
				alt6=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt6=2;
				}
				break;
			case ID:
				{
				int LA6_3 = input.LA(2);
				if ( (LA6_3==28) ) {
					alt6=4;
				}
				else if ( (LA6_3==END||LA6_3==27||(LA6_3 >= 29 && LA6_3 <= 36)||(LA6_3 >= 38 && LA6_3 <= 40)) ) {
					alt6=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// c.g:49:8: '(' expr ')'
					{
					char_literal19=(Token)match(input,28,FOLLOW_28_in_atom406); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal19);

					pushFollow(FOLLOW_expr_in_atom408);
					expr20=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr20.getTree());
					char_literal21=(Token)match(input,29,FOLLOW_29_in_atom410); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal21);

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 49:25: -> ^( expr )
					{
						// c.g:49:33: ^( expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_expr.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// c.g:50:4: num
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_num_in_atom430);
					num22=num();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, num22.getTree());

					}
					break;
				case 3 :
					// c.g:51:4: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					ID23=(Token)match(input,ID,FOLLOW_ID_in_atom435); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID23_tree = (CommonTree)adaptor.create(ID23);
					adaptor.addChild(root_0, ID23_tree);
					}

					}
					break;
				case 4 :
					// c.g:52:4: callfunc
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_callfunc_in_atom440);
					callfunc24=callfunc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, callfunc24.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class declarevar_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declarevar"
	// c.g:55:1: declarevar : ( 'int' ^ ID | 'float' ^ ID );
	public final cParser.declarevar_return declarevar() throws RecognitionException {
		cParser.declarevar_return retval = new cParser.declarevar_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal25=null;
		Token ID26=null;
		Token string_literal27=null;
		Token ID28=null;

		CommonTree string_literal25_tree=null;
		CommonTree ID26_tree=null;
		CommonTree string_literal27_tree=null;
		CommonTree ID28_tree=null;

		try {
			// c.g:55:12: ( 'int' ^ ID | 'float' ^ ID )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==45) ) {
				alt7=1;
			}
			else if ( (LA7_0==42) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// c.g:55:14: 'int' ^ ID
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal25=(Token)match(input,45,FOLLOW_45_in_declarevar451); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal25_tree = (CommonTree)adaptor.create(string_literal25);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal25_tree, root_0);
					}

					ID26=(Token)match(input,ID,FOLLOW_ID_in_declarevar454); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID26_tree = (CommonTree)adaptor.create(ID26);
					adaptor.addChild(root_0, ID26_tree);
					}

					}
					break;
				case 2 :
					// c.g:56:4: 'float' ^ ID
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal27=(Token)match(input,42,FOLLOW_42_in_declarevar459); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal27_tree = (CommonTree)adaptor.create(string_literal27);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal27_tree, root_0);
					}

					ID28=(Token)match(input,ID,FOLLOW_ID_in_declarevar462); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID28_tree = (CommonTree)adaptor.create(ID28);
					adaptor.addChild(root_0, ID28_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarevar"


	public static class givevalue_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "givevalue"
	// c.g:60:1: givevalue : ID '=' expr -> ^( '=' ID expr ) ;
	public final cParser.givevalue_return givevalue() throws RecognitionException {
		cParser.givevalue_return retval = new cParser.givevalue_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID29=null;
		Token char_literal30=null;
		ParserRuleReturnScope expr31 =null;

		CommonTree ID29_tree=null;
		CommonTree char_literal30_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// c.g:60:11: ( ID '=' expr -> ^( '=' ID expr ) )
			// c.g:60:13: ID '=' expr
			{
			ID29=(Token)match(input,ID,FOLLOW_ID_in_givevalue475); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(ID29);

			char_literal30=(Token)match(input,37,FOLLOW_37_in_givevalue478); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_37.add(char_literal30);

			pushFollow(FOLLOW_expr_in_givevalue480);
			expr31=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr31.getTree());
			// AST REWRITE
			// elements: ID, 37, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 61:2: -> ^( '=' ID expr )
			{
				// c.g:61:5: ^( '=' ID expr )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_37.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "givevalue"


	public static class ifstat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifstat"
	// c.g:64:1: ifstat options {backtrack=true; } : ( 'if' INT '(' boolexpr ')' '{' (s1= stat )* '}' 'else' '{' (s2= stat )* '}' -> ^( IF INT boolexpr $s1 ELSE $s2) | 'if' INT '(' boolexpr ')' '{' ( stat )* '}' -> ^( IF INT boolexpr ( stat )* ) );
	public final cParser.ifstat_return ifstat() throws RecognitionException {
		cParser.ifstat_return retval = new cParser.ifstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal32=null;
		Token INT33=null;
		Token char_literal34=null;
		Token char_literal36=null;
		Token char_literal37=null;
		Token char_literal38=null;
		Token string_literal39=null;
		Token char_literal40=null;
		Token char_literal41=null;
		Token string_literal42=null;
		Token INT43=null;
		Token char_literal44=null;
		Token char_literal46=null;
		Token char_literal47=null;
		Token char_literal49=null;
		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;
		ParserRuleReturnScope boolexpr35 =null;
		ParserRuleReturnScope boolexpr45 =null;
		ParserRuleReturnScope stat48 =null;

		CommonTree string_literal32_tree=null;
		CommonTree INT33_tree=null;
		CommonTree char_literal34_tree=null;
		CommonTree char_literal36_tree=null;
		CommonTree char_literal37_tree=null;
		CommonTree char_literal38_tree=null;
		CommonTree string_literal39_tree=null;
		CommonTree char_literal40_tree=null;
		CommonTree char_literal41_tree=null;
		CommonTree string_literal42_tree=null;
		CommonTree INT43_tree=null;
		CommonTree char_literal44_tree=null;
		CommonTree char_literal46_tree=null;
		CommonTree char_literal47_tree=null;
		CommonTree char_literal49_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_boolexpr=new RewriteRuleSubtreeStream(adaptor,"rule boolexpr");

		try {
			// c.g:65:2: ( 'if' INT '(' boolexpr ')' '{' (s1= stat )* '}' 'else' '{' (s2= stat )* '}' -> ^( IF INT boolexpr $s1 ELSE $s2) | 'if' INT '(' boolexpr ')' '{' ( stat )* '}' -> ^( IF INT boolexpr ( stat )* ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==44) ) {
				int LA11_1 = input.LA(2);
				if ( (synpred1_c()) ) {
					alt11=1;
				}
				else if ( (true) ) {
					alt11=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// c.g:65:4: 'if' INT '(' boolexpr ')' '{' (s1= stat )* '}' 'else' '{' (s2= stat )* '}'
					{
					string_literal32=(Token)match(input,44,FOLLOW_44_in_ifstat513); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_44.add(string_literal32);

					INT33=(Token)match(input,INT,FOLLOW_INT_in_ifstat515); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(INT33);

					char_literal34=(Token)match(input,28,FOLLOW_28_in_ifstat517); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal34);

					pushFollow(FOLLOW_boolexpr_in_ifstat519);
					boolexpr35=boolexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_boolexpr.add(boolexpr35.getTree());
					char_literal36=(Token)match(input,29,FOLLOW_29_in_ifstat521); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal36);

					char_literal37=(Token)match(input,49,FOLLOW_49_in_ifstat523); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_49.add(char_literal37);

					// c.g:65:36: (s1= stat )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==ID||(LA8_0 >= 42 && LA8_0 <= 45)||(LA8_0 >= 47 && LA8_0 <= 48)) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// c.g:65:36: s1= stat
							{
							pushFollow(FOLLOW_stat_in_ifstat527);
							s1=stat();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_stat.add(s1.getTree());
							}
							break;

						default :
							break loop8;
						}
					}

					char_literal38=(Token)match(input,50,FOLLOW_50_in_ifstat530); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_50.add(char_literal38);

					string_literal39=(Token)match(input,41,FOLLOW_41_in_ifstat532); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_41.add(string_literal39);

					char_literal40=(Token)match(input,49,FOLLOW_49_in_ifstat534); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_49.add(char_literal40);

					// c.g:65:60: (s2= stat )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==ID||(LA9_0 >= 42 && LA9_0 <= 45)||(LA9_0 >= 47 && LA9_0 <= 48)) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// c.g:65:60: s2= stat
							{
							pushFollow(FOLLOW_stat_in_ifstat538);
							s2=stat();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_stat.add(s2.getTree());
							}
							break;

						default :
							break loop9;
						}
					}

					char_literal41=(Token)match(input,50,FOLLOW_50_in_ifstat541); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_50.add(char_literal41);

					// AST REWRITE
					// elements: s2, s1, INT, boolexpr
					// token labels: 
					// rule labels: s1, retval, s2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 66:2: -> ^( IF INT boolexpr $s1 ELSE $s2)
					{
						// c.g:66:5: ^( IF INT boolexpr $s1 ELSE $s2)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_1, stream_boolexpr.nextTree());
						adaptor.addChild(root_1, stream_s1.nextTree());
						adaptor.addChild(root_1, (CommonTree)adaptor.create(ELSE, "ELSE"));
						adaptor.addChild(root_1, stream_s2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// c.g:67:4: 'if' INT '(' boolexpr ')' '{' ( stat )* '}'
					{
					string_literal42=(Token)match(input,44,FOLLOW_44_in_ifstat566); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_44.add(string_literal42);

					INT43=(Token)match(input,INT,FOLLOW_INT_in_ifstat568); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(INT43);

					char_literal44=(Token)match(input,28,FOLLOW_28_in_ifstat570); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal44);

					pushFollow(FOLLOW_boolexpr_in_ifstat572);
					boolexpr45=boolexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_boolexpr.add(boolexpr45.getTree());
					char_literal46=(Token)match(input,29,FOLLOW_29_in_ifstat574); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal46);

					char_literal47=(Token)match(input,49,FOLLOW_49_in_ifstat576); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_49.add(char_literal47);

					// c.g:67:34: ( stat )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==ID||(LA10_0 >= 42 && LA10_0 <= 45)||(LA10_0 >= 47 && LA10_0 <= 48)) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// c.g:67:34: stat
							{
							pushFollow(FOLLOW_stat_in_ifstat578);
							stat48=stat();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_stat.add(stat48.getTree());
							}
							break;

						default :
							break loop10;
						}
					}

					char_literal49=(Token)match(input,50,FOLLOW_50_in_ifstat581); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_50.add(char_literal49);

					// AST REWRITE
					// elements: INT, stat, boolexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 68:2: -> ^( IF INT boolexpr ( stat )* )
					{
						// c.g:68:5: ^( IF INT boolexpr ( stat )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_1, stream_boolexpr.nextTree());
						// c.g:68:23: ( stat )*
						while ( stream_stat.hasNext() ) {
							adaptor.addChild(root_1, stream_stat.nextTree());
						}
						stream_stat.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifstat"


	public static class whilestat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whilestat"
	// c.g:71:1: whilestat options {backtrack=true; } : 'while' INT '(' boolexpr ')' '{' ( stat )* '}' -> ^( 'while' INT boolexpr ( stat )* ) ;
	public final cParser.whilestat_return whilestat() throws RecognitionException {
		cParser.whilestat_return retval = new cParser.whilestat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal50=null;
		Token INT51=null;
		Token char_literal52=null;
		Token char_literal54=null;
		Token char_literal55=null;
		Token char_literal57=null;
		ParserRuleReturnScope boolexpr53 =null;
		ParserRuleReturnScope stat56 =null;

		CommonTree string_literal50_tree=null;
		CommonTree INT51_tree=null;
		CommonTree char_literal52_tree=null;
		CommonTree char_literal54_tree=null;
		CommonTree char_literal55_tree=null;
		CommonTree char_literal57_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_boolexpr=new RewriteRuleSubtreeStream(adaptor,"rule boolexpr");

		try {
			// c.g:72:2: ( 'while' INT '(' boolexpr ')' '{' ( stat )* '}' -> ^( 'while' INT boolexpr ( stat )* ) )
			// c.g:72:4: 'while' INT '(' boolexpr ')' '{' ( stat )* '}'
			{
			string_literal50=(Token)match(input,48,FOLLOW_48_in_whilestat617); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_48.add(string_literal50);

			INT51=(Token)match(input,INT,FOLLOW_INT_in_whilestat619); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INT.add(INT51);

			char_literal52=(Token)match(input,28,FOLLOW_28_in_whilestat621); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_28.add(char_literal52);

			pushFollow(FOLLOW_boolexpr_in_whilestat623);
			boolexpr53=boolexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_boolexpr.add(boolexpr53.getTree());
			char_literal54=(Token)match(input,29,FOLLOW_29_in_whilestat625); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_29.add(char_literal54);

			char_literal55=(Token)match(input,49,FOLLOW_49_in_whilestat627); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_49.add(char_literal55);

			// c.g:72:37: ( stat )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==ID||(LA12_0 >= 42 && LA12_0 <= 45)||(LA12_0 >= 47 && LA12_0 <= 48)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// c.g:72:37: stat
					{
					pushFollow(FOLLOW_stat_in_whilestat629);
					stat56=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stat.add(stat56.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			char_literal57=(Token)match(input,50,FOLLOW_50_in_whilestat632); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_50.add(char_literal57);

			// AST REWRITE
			// elements: stat, 48, boolexpr, INT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 73:2: -> ^( 'while' INT boolexpr ( stat )* )
			{
				// c.g:73:5: ^( 'while' INT boolexpr ( stat )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_48.nextNode(), root_1);
				adaptor.addChild(root_1, stream_INT.nextNode());
				adaptor.addChild(root_1, stream_boolexpr.nextTree());
				// c.g:73:28: ( stat )*
				while ( stream_stat.hasNext() ) {
					adaptor.addChild(root_1, stream_stat.nextTree());
				}
				stream_stat.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whilestat"


	public static class forstat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forstat"
	// c.g:76:1: forstat options {backtrack=true; } : 'for' INT '(' s1= givevalue ';' s2= boolexpr ';' s3= givevalue ')' '{' (s4= stat )* '}' -> ^( 'for' INT $s1 $s2 $s4 $s3) ;
	public final cParser.forstat_return forstat() throws RecognitionException {
		cParser.forstat_return retval = new cParser.forstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal58=null;
		Token INT59=null;
		Token char_literal60=null;
		Token char_literal61=null;
		Token char_literal62=null;
		Token char_literal63=null;
		Token char_literal64=null;
		Token char_literal65=null;
		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;
		ParserRuleReturnScope s3 =null;
		ParserRuleReturnScope s4 =null;

		CommonTree string_literal58_tree=null;
		CommonTree INT59_tree=null;
		CommonTree char_literal60_tree=null;
		CommonTree char_literal61_tree=null;
		CommonTree char_literal62_tree=null;
		CommonTree char_literal63_tree=null;
		CommonTree char_literal64_tree=null;
		CommonTree char_literal65_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_givevalue=new RewriteRuleSubtreeStream(adaptor,"rule givevalue");
		RewriteRuleSubtreeStream stream_boolexpr=new RewriteRuleSubtreeStream(adaptor,"rule boolexpr");

		try {
			// c.g:77:2: ( 'for' INT '(' s1= givevalue ';' s2= boolexpr ';' s3= givevalue ')' '{' (s4= stat )* '}' -> ^( 'for' INT $s1 $s2 $s4 $s3) )
			// c.g:77:4: 'for' INT '(' s1= givevalue ';' s2= boolexpr ';' s3= givevalue ')' '{' (s4= stat )* '}'
			{
			string_literal58=(Token)match(input,43,FOLLOW_43_in_forstat668); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_43.add(string_literal58);

			INT59=(Token)match(input,INT,FOLLOW_INT_in_forstat670); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INT.add(INT59);

			char_literal60=(Token)match(input,28,FOLLOW_28_in_forstat672); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_28.add(char_literal60);

			pushFollow(FOLLOW_givevalue_in_forstat676);
			s1=givevalue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_givevalue.add(s1.getTree());
			char_literal61=(Token)match(input,END,FOLLOW_END_in_forstat678); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_END.add(char_literal61);

			pushFollow(FOLLOW_boolexpr_in_forstat682);
			s2=boolexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_boolexpr.add(s2.getTree());
			char_literal62=(Token)match(input,END,FOLLOW_END_in_forstat684); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_END.add(char_literal62);

			pushFollow(FOLLOW_givevalue_in_forstat688);
			s3=givevalue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_givevalue.add(s3.getTree());
			char_literal63=(Token)match(input,29,FOLLOW_29_in_forstat690); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_29.add(char_literal63);

			char_literal64=(Token)match(input,49,FOLLOW_49_in_forstat692); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_49.add(char_literal64);

			// c.g:77:74: (s4= stat )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==ID||(LA13_0 >= 42 && LA13_0 <= 45)||(LA13_0 >= 47 && LA13_0 <= 48)) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// c.g:77:74: s4= stat
					{
					pushFollow(FOLLOW_stat_in_forstat696);
					s4=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stat.add(s4.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			char_literal65=(Token)match(input,50,FOLLOW_50_in_forstat699); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_50.add(char_literal65);

			// AST REWRITE
			// elements: INT, s3, s2, s1, 43, s4
			// token labels: 
			// rule labels: s3, s4, s1, retval, s2
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_s3=new RewriteRuleSubtreeStream(adaptor,"rule s3",s3!=null?s3.getTree():null);
			RewriteRuleSubtreeStream stream_s4=new RewriteRuleSubtreeStream(adaptor,"rule s4",s4!=null?s4.getTree():null);
			RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 78:2: -> ^( 'for' INT $s1 $s2 $s4 $s3)
			{
				// c.g:78:5: ^( 'for' INT $s1 $s2 $s4 $s3)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_43.nextNode(), root_1);
				adaptor.addChild(root_1, stream_INT.nextNode());
				adaptor.addChild(root_1, stream_s1.nextTree());
				adaptor.addChild(root_1, stream_s2.nextTree());
				adaptor.addChild(root_1, stream_s4.nextTree());
				adaptor.addChild(root_1, stream_s3.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forstat"


	public static class declarefunc_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declarefunc"
	// c.g:81:1: declarefunc : ( 'void' ID '(' ')' '{' ( stat )* '}' -> ^( FUNC1 ID ( stat )* ) | ( 'int' | 'float' ) ID '(' ')' '{' ( stat )* 'return' expr END '}' -> ^( FUNC2 ID ( stat )* expr ) | 'void' ID '(' ( num_type ID ) ( ',' ( num_type ID ) )* ')' '{' ( stat )* '}' -> ^( FUNC3 ID ( num_type ID )+ ( stat )* ) | ( 'int' | 'float' ) ID '(' ( num_type ID ) ( ',' ( num_type ID ) )* ')' '{' ( stat )* 'return' expr END '}' -> ^( FUNC4 ID ( num_type ID )+ ( stat )* expr ) );
	public final cParser.declarefunc_return declarefunc() throws RecognitionException {
		cParser.declarefunc_return retval = new cParser.declarefunc_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal66=null;
		Token ID67=null;
		Token char_literal68=null;
		Token char_literal69=null;
		Token char_literal70=null;
		Token char_literal72=null;
		Token string_literal73=null;
		Token string_literal74=null;
		Token ID75=null;
		Token char_literal76=null;
		Token char_literal77=null;
		Token char_literal78=null;
		Token string_literal80=null;
		Token END82=null;
		Token char_literal83=null;
		Token string_literal84=null;
		Token ID85=null;
		Token char_literal86=null;
		Token ID88=null;
		Token char_literal89=null;
		Token ID91=null;
		Token char_literal92=null;
		Token char_literal93=null;
		Token char_literal95=null;
		Token string_literal96=null;
		Token string_literal97=null;
		Token ID98=null;
		Token char_literal99=null;
		Token ID101=null;
		Token char_literal102=null;
		Token ID104=null;
		Token char_literal105=null;
		Token char_literal106=null;
		Token string_literal108=null;
		Token END110=null;
		Token char_literal111=null;
		ParserRuleReturnScope stat71 =null;
		ParserRuleReturnScope stat79 =null;
		ParserRuleReturnScope expr81 =null;
		ParserRuleReturnScope num_type87 =null;
		ParserRuleReturnScope num_type90 =null;
		ParserRuleReturnScope stat94 =null;
		ParserRuleReturnScope num_type100 =null;
		ParserRuleReturnScope num_type103 =null;
		ParserRuleReturnScope stat107 =null;
		ParserRuleReturnScope expr109 =null;

		CommonTree string_literal66_tree=null;
		CommonTree ID67_tree=null;
		CommonTree char_literal68_tree=null;
		CommonTree char_literal69_tree=null;
		CommonTree char_literal70_tree=null;
		CommonTree char_literal72_tree=null;
		CommonTree string_literal73_tree=null;
		CommonTree string_literal74_tree=null;
		CommonTree ID75_tree=null;
		CommonTree char_literal76_tree=null;
		CommonTree char_literal77_tree=null;
		CommonTree char_literal78_tree=null;
		CommonTree string_literal80_tree=null;
		CommonTree END82_tree=null;
		CommonTree char_literal83_tree=null;
		CommonTree string_literal84_tree=null;
		CommonTree ID85_tree=null;
		CommonTree char_literal86_tree=null;
		CommonTree ID88_tree=null;
		CommonTree char_literal89_tree=null;
		CommonTree ID91_tree=null;
		CommonTree char_literal92_tree=null;
		CommonTree char_literal93_tree=null;
		CommonTree char_literal95_tree=null;
		CommonTree string_literal96_tree=null;
		CommonTree string_literal97_tree=null;
		CommonTree ID98_tree=null;
		CommonTree char_literal99_tree=null;
		CommonTree ID101_tree=null;
		CommonTree char_literal102_tree=null;
		CommonTree ID104_tree=null;
		CommonTree char_literal105_tree=null;
		CommonTree char_literal106_tree=null;
		CommonTree string_literal108_tree=null;
		CommonTree END110_tree=null;
		CommonTree char_literal111_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_num_type=new RewriteRuleSubtreeStream(adaptor,"rule num_type");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// c.g:82:2: ( 'void' ID '(' ')' '{' ( stat )* '}' -> ^( FUNC1 ID ( stat )* ) | ( 'int' | 'float' ) ID '(' ')' '{' ( stat )* 'return' expr END '}' -> ^( FUNC2 ID ( stat )* expr ) | 'void' ID '(' ( num_type ID ) ( ',' ( num_type ID ) )* ')' '{' ( stat )* '}' -> ^( FUNC3 ID ( num_type ID )+ ( stat )* ) | ( 'int' | 'float' ) ID '(' ( num_type ID ) ( ',' ( num_type ID ) )* ')' '{' ( stat )* 'return' expr END '}' -> ^( FUNC4 ID ( num_type ID )+ ( stat )* expr ) )
			int alt22=4;
			switch ( input.LA(1) ) {
			case 47:
				{
				int LA22_1 = input.LA(2);
				if ( (LA22_1==ID) ) {
					int LA22_4 = input.LA(3);
					if ( (LA22_4==28) ) {
						int LA22_6 = input.LA(4);
						if ( (LA22_6==29) ) {
							alt22=1;
						}
						else if ( (LA22_6==42||LA22_6==45) ) {
							alt22=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 22, 6, input);
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
								new NoViableAltException("", 22, 4, input);
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
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 45:
				{
				int LA22_2 = input.LA(2);
				if ( (LA22_2==ID) ) {
					int LA22_5 = input.LA(3);
					if ( (LA22_5==28) ) {
						int LA22_7 = input.LA(4);
						if ( (LA22_7==29) ) {
							alt22=2;
						}
						else if ( (LA22_7==42||LA22_7==45) ) {
							alt22=4;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 22, 7, input);
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
								new NoViableAltException("", 22, 5, input);
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
							new NoViableAltException("", 22, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 42:
				{
				int LA22_3 = input.LA(2);
				if ( (LA22_3==ID) ) {
					int LA22_5 = input.LA(3);
					if ( (LA22_5==28) ) {
						int LA22_7 = input.LA(4);
						if ( (LA22_7==29) ) {
							alt22=2;
						}
						else if ( (LA22_7==42||LA22_7==45) ) {
							alt22=4;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 22, 7, input);
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
								new NoViableAltException("", 22, 5, input);
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
							new NoViableAltException("", 22, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// c.g:82:4: 'void' ID '(' ')' '{' ( stat )* '}'
					{
					string_literal66=(Token)match(input,47,FOLLOW_47_in_declarefunc735); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_47.add(string_literal66);

					ID67=(Token)match(input,ID,FOLLOW_ID_in_declarefunc737); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID67);

					char_literal68=(Token)match(input,28,FOLLOW_28_in_declarefunc739); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal68);

					char_literal69=(Token)match(input,29,FOLLOW_29_in_declarefunc741); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal69);

					char_literal70=(Token)match(input,49,FOLLOW_49_in_declarefunc743); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_49.add(char_literal70);

					// c.g:82:26: ( stat )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==ID||(LA14_0 >= 42 && LA14_0 <= 45)||(LA14_0 >= 47 && LA14_0 <= 48)) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// c.g:82:26: stat
							{
							pushFollow(FOLLOW_stat_in_declarefunc745);
							stat71=stat();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_stat.add(stat71.getTree());
							}
							break;

						default :
							break loop14;
						}
					}

					char_literal72=(Token)match(input,50,FOLLOW_50_in_declarefunc748); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_50.add(char_literal72);

					// AST REWRITE
					// elements: ID, stat
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 82:36: -> ^( FUNC1 ID ( stat )* )
					{
						// c.g:82:39: ^( FUNC1 ID ( stat )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC1, "FUNC1"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// c.g:82:50: ( stat )*
						while ( stream_stat.hasNext() ) {
							adaptor.addChild(root_1, stream_stat.nextTree());
						}
						stream_stat.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// c.g:83:4: ( 'int' | 'float' ) ID '(' ')' '{' ( stat )* 'return' expr END '}'
					{
					// c.g:83:4: ( 'int' | 'float' )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==45) ) {
						alt15=1;
					}
					else if ( (LA15_0==42) ) {
						alt15=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// c.g:83:5: 'int'
							{
							string_literal73=(Token)match(input,45,FOLLOW_45_in_declarefunc765); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_45.add(string_literal73);

							}
							break;
						case 2 :
							// c.g:83:11: 'float'
							{
							string_literal74=(Token)match(input,42,FOLLOW_42_in_declarefunc767); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_42.add(string_literal74);

							}
							break;

					}

					ID75=(Token)match(input,ID,FOLLOW_ID_in_declarefunc770); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID75);

					char_literal76=(Token)match(input,28,FOLLOW_28_in_declarefunc772); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal76);

					char_literal77=(Token)match(input,29,FOLLOW_29_in_declarefunc774); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal77);

					char_literal78=(Token)match(input,49,FOLLOW_49_in_declarefunc776); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_49.add(char_literal78);

					// c.g:83:35: ( stat )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==ID||(LA16_0 >= 42 && LA16_0 <= 45)||(LA16_0 >= 47 && LA16_0 <= 48)) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// c.g:83:35: stat
							{
							pushFollow(FOLLOW_stat_in_declarefunc778);
							stat79=stat();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_stat.add(stat79.getTree());
							}
							break;

						default :
							break loop16;
						}
					}

					string_literal80=(Token)match(input,46,FOLLOW_46_in_declarefunc781); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_46.add(string_literal80);

					pushFollow(FOLLOW_expr_in_declarefunc783);
					expr81=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr81.getTree());
					END82=(Token)match(input,END,FOLLOW_END_in_declarefunc785); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_END.add(END82);

					char_literal83=(Token)match(input,50,FOLLOW_50_in_declarefunc787); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_50.add(char_literal83);

					// AST REWRITE
					// elements: stat, ID, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 83:63: -> ^( FUNC2 ID ( stat )* expr )
					{
						// c.g:83:66: ^( FUNC2 ID ( stat )* expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC2, "FUNC2"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// c.g:83:77: ( stat )*
						while ( stream_stat.hasNext() ) {
							adaptor.addChild(root_1, stream_stat.nextTree());
						}
						stream_stat.reset();

						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// c.g:84:4: 'void' ID '(' ( num_type ID ) ( ',' ( num_type ID ) )* ')' '{' ( stat )* '}'
					{
					string_literal84=(Token)match(input,47,FOLLOW_47_in_declarefunc805); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_47.add(string_literal84);

					ID85=(Token)match(input,ID,FOLLOW_ID_in_declarefunc807); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID85);

					char_literal86=(Token)match(input,28,FOLLOW_28_in_declarefunc809); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal86);

					// c.g:84:18: ( num_type ID )
					// c.g:84:19: num_type ID
					{
					pushFollow(FOLLOW_num_type_in_declarefunc812);
					num_type87=num_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_num_type.add(num_type87.getTree());
					ID88=(Token)match(input,ID,FOLLOW_ID_in_declarefunc814); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID88);

					}

					// c.g:84:32: ( ',' ( num_type ID ) )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==32) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// c.g:84:33: ',' ( num_type ID )
							{
							char_literal89=(Token)match(input,32,FOLLOW_32_in_declarefunc818); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_32.add(char_literal89);

							// c.g:84:37: ( num_type ID )
							// c.g:84:38: num_type ID
							{
							pushFollow(FOLLOW_num_type_in_declarefunc821);
							num_type90=num_type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_num_type.add(num_type90.getTree());
							ID91=(Token)match(input,ID,FOLLOW_ID_in_declarefunc823); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(ID91);

							}

							}
							break;

						default :
							break loop17;
						}
					}

					char_literal92=(Token)match(input,29,FOLLOW_29_in_declarefunc828); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal92);

					char_literal93=(Token)match(input,49,FOLLOW_49_in_declarefunc830); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_49.add(char_literal93);

					// c.g:84:61: ( stat )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==ID||(LA18_0 >= 42 && LA18_0 <= 45)||(LA18_0 >= 47 && LA18_0 <= 48)) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// c.g:84:61: stat
							{
							pushFollow(FOLLOW_stat_in_declarefunc832);
							stat94=stat();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_stat.add(stat94.getTree());
							}
							break;

						default :
							break loop18;
						}
					}

					char_literal95=(Token)match(input,50,FOLLOW_50_in_declarefunc835); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_50.add(char_literal95);

					// AST REWRITE
					// elements: ID, stat, num_type, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 84:71: -> ^( FUNC3 ID ( num_type ID )+ ( stat )* )
					{
						// c.g:85:3: ^( FUNC3 ID ( num_type ID )+ ( stat )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC3, "FUNC3"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						if ( !(stream_num_type.hasNext()||stream_ID.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_num_type.hasNext()||stream_ID.hasNext() ) {
							adaptor.addChild(root_1, stream_num_type.nextTree());
							adaptor.addChild(root_1, stream_ID.nextNode());
						}
						stream_num_type.reset();
						stream_ID.reset();

						// c.g:85:29: ( stat )*
						while ( stream_stat.hasNext() ) {
							adaptor.addChild(root_1, stream_stat.nextTree());
						}
						stream_stat.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// c.g:86:4: ( 'int' | 'float' ) ID '(' ( num_type ID ) ( ',' ( num_type ID ) )* ')' '{' ( stat )* 'return' expr END '}'
					{
					// c.g:86:4: ( 'int' | 'float' )
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==45) ) {
						alt19=1;
					}
					else if ( (LA19_0==42) ) {
						alt19=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}

					switch (alt19) {
						case 1 :
							// c.g:86:5: 'int'
							{
							string_literal96=(Token)match(input,45,FOLLOW_45_in_declarefunc861); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_45.add(string_literal96);

							}
							break;
						case 2 :
							// c.g:86:11: 'float'
							{
							string_literal97=(Token)match(input,42,FOLLOW_42_in_declarefunc863); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_42.add(string_literal97);

							}
							break;

					}

					ID98=(Token)match(input,ID,FOLLOW_ID_in_declarefunc866); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID98);

					char_literal99=(Token)match(input,28,FOLLOW_28_in_declarefunc868); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal99);

					// c.g:86:27: ( num_type ID )
					// c.g:86:28: num_type ID
					{
					pushFollow(FOLLOW_num_type_in_declarefunc871);
					num_type100=num_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_num_type.add(num_type100.getTree());
					ID101=(Token)match(input,ID,FOLLOW_ID_in_declarefunc873); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID101);

					}

					// c.g:86:41: ( ',' ( num_type ID ) )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==32) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// c.g:86:42: ',' ( num_type ID )
							{
							char_literal102=(Token)match(input,32,FOLLOW_32_in_declarefunc877); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_32.add(char_literal102);

							// c.g:86:46: ( num_type ID )
							// c.g:86:47: num_type ID
							{
							pushFollow(FOLLOW_num_type_in_declarefunc880);
							num_type103=num_type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_num_type.add(num_type103.getTree());
							ID104=(Token)match(input,ID,FOLLOW_ID_in_declarefunc882); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(ID104);

							}

							}
							break;

						default :
							break loop20;
						}
					}

					char_literal105=(Token)match(input,29,FOLLOW_29_in_declarefunc887); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal105);

					char_literal106=(Token)match(input,49,FOLLOW_49_in_declarefunc889); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_49.add(char_literal106);

					// c.g:86:70: ( stat )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==ID||(LA21_0 >= 42 && LA21_0 <= 45)||(LA21_0 >= 47 && LA21_0 <= 48)) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// c.g:86:70: stat
							{
							pushFollow(FOLLOW_stat_in_declarefunc891);
							stat107=stat();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_stat.add(stat107.getTree());
							}
							break;

						default :
							break loop21;
						}
					}

					string_literal108=(Token)match(input,46,FOLLOW_46_in_declarefunc894); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_46.add(string_literal108);

					pushFollow(FOLLOW_expr_in_declarefunc896);
					expr109=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr109.getTree());
					END110=(Token)match(input,END,FOLLOW_END_in_declarefunc898); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_END.add(END110);

					char_literal111=(Token)match(input,50,FOLLOW_50_in_declarefunc900); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_50.add(char_literal111);

					// AST REWRITE
					// elements: ID, num_type, stat, ID, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 87:2: -> ^( FUNC4 ID ( num_type ID )+ ( stat )* expr )
					{
						// c.g:87:5: ^( FUNC4 ID ( num_type ID )+ ( stat )* expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC4, "FUNC4"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						if ( !(stream_ID.hasNext()||stream_num_type.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_ID.hasNext()||stream_num_type.hasNext() ) {
							adaptor.addChild(root_1, stream_num_type.nextTree());
							adaptor.addChild(root_1, stream_ID.nextNode());
						}
						stream_ID.reset();
						stream_num_type.reset();

						// c.g:87:31: ( stat )*
						while ( stream_stat.hasNext() ) {
							adaptor.addChild(root_1, stream_stat.nextTree());
						}
						stream_stat.reset();

						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarefunc"


	public static class callfunc_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "callfunc"
	// c.g:90:1: callfunc : ( ID '(' ')' -> ^( CALL ID ) | ID '(' expr ( ',' expr )* ')' -> ^( CALL ID expr ( expr )* ) );
	public final cParser.callfunc_return callfunc() throws RecognitionException {
		cParser.callfunc_return retval = new cParser.callfunc_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID112=null;
		Token char_literal113=null;
		Token char_literal114=null;
		Token ID115=null;
		Token char_literal116=null;
		Token char_literal118=null;
		Token char_literal120=null;
		ParserRuleReturnScope expr117 =null;
		ParserRuleReturnScope expr119 =null;

		CommonTree ID112_tree=null;
		CommonTree char_literal113_tree=null;
		CommonTree char_literal114_tree=null;
		CommonTree ID115_tree=null;
		CommonTree char_literal116_tree=null;
		CommonTree char_literal118_tree=null;
		CommonTree char_literal120_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// c.g:90:10: ( ID '(' ')' -> ^( CALL ID ) | ID '(' expr ( ',' expr )* ')' -> ^( CALL ID expr ( expr )* ) )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==ID) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==28) ) {
					int LA24_2 = input.LA(3);
					if ( (LA24_2==29) ) {
						alt24=1;
					}
					else if ( (LA24_2==FLOAT||LA24_2==ID||LA24_2==INT||LA24_2==28) ) {
						alt24=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 24, 2, input);
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
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// c.g:90:12: ID '(' ')'
					{
					ID112=(Token)match(input,ID,FOLLOW_ID_in_callfunc933); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID112);

					char_literal113=(Token)match(input,28,FOLLOW_28_in_callfunc935); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal113);

					char_literal114=(Token)match(input,29,FOLLOW_29_in_callfunc937); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal114);

					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 90:23: -> ^( CALL ID )
					{
						// c.g:90:26: ^( CALL ID )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// c.g:91:4: ID '(' expr ( ',' expr )* ')'
					{
					ID115=(Token)match(input,ID,FOLLOW_ID_in_callfunc950); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID115);

					char_literal116=(Token)match(input,28,FOLLOW_28_in_callfunc952); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_28.add(char_literal116);

					pushFollow(FOLLOW_expr_in_callfunc954);
					expr117=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr117.getTree());
					// c.g:91:16: ( ',' expr )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==32) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// c.g:91:17: ',' expr
							{
							char_literal118=(Token)match(input,32,FOLLOW_32_in_callfunc957); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_32.add(char_literal118);

							pushFollow(FOLLOW_expr_in_callfunc959);
							expr119=expr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expr.add(expr119.getTree());
							}
							break;

						default :
							break loop23;
						}
					}

					char_literal120=(Token)match(input,29,FOLLOW_29_in_callfunc963); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_29.add(char_literal120);

					// AST REWRITE
					// elements: expr, expr, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 91:32: -> ^( CALL ID expr ( expr )* )
					{
						// c.g:91:35: ^( CALL ID expr ( expr )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_expr.nextTree());
						// c.g:91:50: ( expr )*
						while ( stream_expr.hasNext() ) {
							adaptor.addChild(root_1, stream_expr.nextTree());
						}
						stream_expr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "callfunc"


	public static class stat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// c.g:94:1: stat : ( declarevar END -> ^( DECLAREVAR declarevar ) | givevalue END -> ^( GIVEVALUE givevalue ) | ifstat -> ^( IFSTAT ifstat ) | forstat -> ^( FORSTAT forstat ) | whilestat -> ^( WHILESTAT whilestat ) | declarefunc -> ^( DECLAREFUNC declarefunc ) | callfunc END -> ^( CALLFUNC callfunc ) );
	public final cParser.stat_return stat() throws RecognitionException {
		cParser.stat_return retval = new cParser.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token END122=null;
		Token END124=null;
		Token END130=null;
		ParserRuleReturnScope declarevar121 =null;
		ParserRuleReturnScope givevalue123 =null;
		ParserRuleReturnScope ifstat125 =null;
		ParserRuleReturnScope forstat126 =null;
		ParserRuleReturnScope whilestat127 =null;
		ParserRuleReturnScope declarefunc128 =null;
		ParserRuleReturnScope callfunc129 =null;

		CommonTree END122_tree=null;
		CommonTree END124_tree=null;
		CommonTree END130_tree=null;
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleSubtreeStream stream_ifstat=new RewriteRuleSubtreeStream(adaptor,"rule ifstat");
		RewriteRuleSubtreeStream stream_declarefunc=new RewriteRuleSubtreeStream(adaptor,"rule declarefunc");
		RewriteRuleSubtreeStream stream_givevalue=new RewriteRuleSubtreeStream(adaptor,"rule givevalue");
		RewriteRuleSubtreeStream stream_declarevar=new RewriteRuleSubtreeStream(adaptor,"rule declarevar");
		RewriteRuleSubtreeStream stream_callfunc=new RewriteRuleSubtreeStream(adaptor,"rule callfunc");
		RewriteRuleSubtreeStream stream_whilestat=new RewriteRuleSubtreeStream(adaptor,"rule whilestat");
		RewriteRuleSubtreeStream stream_forstat=new RewriteRuleSubtreeStream(adaptor,"rule forstat");

		try {
			// c.g:94:6: ( declarevar END -> ^( DECLAREVAR declarevar ) | givevalue END -> ^( GIVEVALUE givevalue ) | ifstat -> ^( IFSTAT ifstat ) | forstat -> ^( FORSTAT forstat ) | whilestat -> ^( WHILESTAT whilestat ) | declarefunc -> ^( DECLAREFUNC declarefunc ) | callfunc END -> ^( CALLFUNC callfunc ) )
			int alt25=7;
			switch ( input.LA(1) ) {
			case 45:
				{
				int LA25_1 = input.LA(2);
				if ( (LA25_1==ID) ) {
					int LA25_8 = input.LA(3);
					if ( (LA25_8==28) ) {
						alt25=6;
					}
					else if ( (LA25_8==END) ) {
						alt25=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 25, 8, input);
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
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 42:
				{
				int LA25_2 = input.LA(2);
				if ( (LA25_2==ID) ) {
					int LA25_9 = input.LA(3);
					if ( (LA25_9==28) ) {
						alt25=6;
					}
					else if ( (LA25_9==END) ) {
						alt25=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 25, 9, input);
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
							new NoViableAltException("", 25, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ID:
				{
				int LA25_3 = input.LA(2);
				if ( (LA25_3==37) ) {
					alt25=2;
				}
				else if ( (LA25_3==28) ) {
					alt25=7;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 44:
				{
				alt25=3;
				}
				break;
			case 43:
				{
				alt25=4;
				}
				break;
			case 48:
				{
				alt25=5;
				}
				break;
			case 47:
				{
				alt25=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// c.g:94:8: declarevar END
					{
					pushFollow(FOLLOW_declarevar_in_stat988);
					declarevar121=declarevar();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declarevar.add(declarevar121.getTree());
					END122=(Token)match(input,END,FOLLOW_END_in_stat990); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_END.add(END122);

					// AST REWRITE
					// elements: declarevar
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 94:23: -> ^( DECLAREVAR declarevar )
					{
						// c.g:94:26: ^( DECLAREVAR declarevar )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLAREVAR, "DECLAREVAR"), root_1);
						adaptor.addChild(root_1, stream_declarevar.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// c.g:95:4: givevalue END
					{
					pushFollow(FOLLOW_givevalue_in_stat1003);
					givevalue123=givevalue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_givevalue.add(givevalue123.getTree());
					END124=(Token)match(input,END,FOLLOW_END_in_stat1005); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_END.add(END124);

					// AST REWRITE
					// elements: givevalue
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 95:17: -> ^( GIVEVALUE givevalue )
					{
						// c.g:95:20: ^( GIVEVALUE givevalue )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GIVEVALUE, "GIVEVALUE"), root_1);
						adaptor.addChild(root_1, stream_givevalue.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// c.g:96:4: ifstat
					{
					pushFollow(FOLLOW_ifstat_in_stat1017);
					ifstat125=ifstat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ifstat.add(ifstat125.getTree());
					// AST REWRITE
					// elements: ifstat
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 96:11: -> ^( IFSTAT ifstat )
					{
						// c.g:96:14: ^( IFSTAT ifstat )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IFSTAT, "IFSTAT"), root_1);
						adaptor.addChild(root_1, stream_ifstat.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// c.g:97:4: forstat
					{
					pushFollow(FOLLOW_forstat_in_stat1030);
					forstat126=forstat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_forstat.add(forstat126.getTree());
					// AST REWRITE
					// elements: forstat
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 97:12: -> ^( FORSTAT forstat )
					{
						// c.g:97:15: ^( FORSTAT forstat )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORSTAT, "FORSTAT"), root_1);
						adaptor.addChild(root_1, stream_forstat.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// c.g:98:4: whilestat
					{
					pushFollow(FOLLOW_whilestat_in_stat1043);
					whilestat127=whilestat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_whilestat.add(whilestat127.getTree());
					// AST REWRITE
					// elements: whilestat
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 98:14: -> ^( WHILESTAT whilestat )
					{
						// c.g:98:17: ^( WHILESTAT whilestat )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILESTAT, "WHILESTAT"), root_1);
						adaptor.addChild(root_1, stream_whilestat.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// c.g:99:4: declarefunc
					{
					pushFollow(FOLLOW_declarefunc_in_stat1056);
					declarefunc128=declarefunc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declarefunc.add(declarefunc128.getTree());
					// AST REWRITE
					// elements: declarefunc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 99:16: -> ^( DECLAREFUNC declarefunc )
					{
						// c.g:99:19: ^( DECLAREFUNC declarefunc )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLAREFUNC, "DECLAREFUNC"), root_1);
						adaptor.addChild(root_1, stream_declarefunc.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// c.g:100:4: callfunc END
					{
					pushFollow(FOLLOW_callfunc_in_stat1069);
					callfunc129=callfunc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_callfunc.add(callfunc129.getTree());
					END130=(Token)match(input,END,FOLLOW_END_in_stat1071); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_END.add(END130);

					// AST REWRITE
					// elements: callfunc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 100:17: -> ^( CALLFUNC callfunc )
					{
						// c.g:100:20: ^( CALLFUNC callfunc )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALLFUNC, "CALLFUNC"), root_1);
						adaptor.addChild(root_1, stream_callfunc.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// c.g:103:1: prog : ( stat )* -> ^( PROG ( stat )* ) ;
	public final cParser.prog_return prog() throws RecognitionException {
		cParser.prog_return retval = new cParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope stat131 =null;

		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// c.g:103:6: ( ( stat )* -> ^( PROG ( stat )* ) )
			// c.g:103:8: ( stat )*
			{
			// c.g:103:8: ( stat )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==ID||(LA26_0 >= 42 && LA26_0 <= 45)||(LA26_0 >= 47 && LA26_0 <= 48)) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// c.g:103:8: stat
					{
					pushFollow(FOLLOW_stat_in_prog1089);
					stat131=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stat.add(stat131.getTree());
					}
					break;

				default :
					break loop26;
				}
			}

			// AST REWRITE
			// elements: stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 103:14: -> ^( PROG ( stat )* )
			{
				// c.g:103:17: ^( PROG ( stat )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "PROG"), root_1);
				// c.g:103:24: ( stat )*
				while ( stream_stat.hasNext() ) {
					adaptor.addChild(root_1, stream_stat.nextTree());
				}
				stream_stat.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"

	// $ANTLR start synpred1_c
	public final void synpred1_c_fragment() throws RecognitionException {
		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;


		// c.g:65:4: ( 'if' INT '(' boolexpr ')' '{' (s1= stat )* '}' 'else' '{' (s2= stat )* '}' )
		// c.g:65:4: 'if' INT '(' boolexpr ')' '{' (s1= stat )* '}' 'else' '{' (s2= stat )* '}'
		{
		match(input,44,FOLLOW_44_in_synpred1_c513); if (state.failed) return;

		match(input,INT,FOLLOW_INT_in_synpred1_c515); if (state.failed) return;

		match(input,28,FOLLOW_28_in_synpred1_c517); if (state.failed) return;

		pushFollow(FOLLOW_boolexpr_in_synpred1_c519);
		boolexpr();
		state._fsp--;
		if (state.failed) return;

		match(input,29,FOLLOW_29_in_synpred1_c521); if (state.failed) return;

		match(input,49,FOLLOW_49_in_synpred1_c523); if (state.failed) return;

		// c.g:65:36: (s1= stat )*
		loop27:
		while (true) {
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==ID||(LA27_0 >= 42 && LA27_0 <= 45)||(LA27_0 >= 47 && LA27_0 <= 48)) ) {
				alt27=1;
			}

			switch (alt27) {
			case 1 :
				// c.g:65:36: s1= stat
				{
				pushFollow(FOLLOW_stat_in_synpred1_c527);
				s1=stat();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop27;
			}
		}

		match(input,50,FOLLOW_50_in_synpred1_c530); if (state.failed) return;

		match(input,41,FOLLOW_41_in_synpred1_c532); if (state.failed) return;

		match(input,49,FOLLOW_49_in_synpred1_c534); if (state.failed) return;

		// c.g:65:60: (s2= stat )*
		loop28:
		while (true) {
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==ID||(LA28_0 >= 42 && LA28_0 <= 45)||(LA28_0 >= 47 && LA28_0 <= 48)) ) {
				alt28=1;
			}

			switch (alt28) {
			case 1 :
				// c.g:65:60: s2= stat
				{
				pushFollow(FOLLOW_stat_in_synpred1_c538);
				s2=stat();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop28;
			}
		}

		match(input,50,FOLLOW_50_in_synpred1_c541); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_c

	// Delegated rules

	public final boolean synpred1_c() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_c_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_expr_in_boolexpr329 = new BitSet(new long[]{0x000001D808000000L});
	public static final BitSet FOLLOW_38_in_boolexpr332 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_27_in_boolexpr335 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_39_in_boolexpr338 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_35_in_boolexpr341 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_40_in_boolexpr344 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_36_in_boolexpr347 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_expr_in_boolexpr351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multexpr_in_expr360 = new BitSet(new long[]{0x0000000280000002L});
	public static final BitSet FOLLOW_31_in_expr364 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_33_in_expr369 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_multexpr_in_expr373 = new BitSet(new long[]{0x0000000280000002L});
	public static final BitSet FOLLOW_atom_in_multexpr384 = new BitSet(new long[]{0x0000000440000002L});
	public static final BitSet FOLLOW_30_in_multexpr388 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_34_in_multexpr391 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_atom_in_multexpr395 = new BitSet(new long[]{0x0000000440000002L});
	public static final BitSet FOLLOW_28_in_atom406 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_expr_in_atom408 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_atom410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_atom430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callfunc_in_atom440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_declarevar451 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_declarevar454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_declarevar459 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_declarevar462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_givevalue475 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_givevalue478 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_expr_in_givevalue480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_ifstat513 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_INT_in_ifstat515 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_ifstat517 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_boolexpr_in_ifstat519 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_ifstat521 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ifstat523 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_stat_in_ifstat527 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_50_in_ifstat530 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ifstat532 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ifstat534 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_stat_in_ifstat538 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_50_in_ifstat541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_ifstat566 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_INT_in_ifstat568 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_ifstat570 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_boolexpr_in_ifstat572 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_ifstat574 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_ifstat576 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_stat_in_ifstat578 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_50_in_ifstat581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_whilestat617 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_INT_in_whilestat619 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_whilestat621 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_boolexpr_in_whilestat623 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_whilestat625 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_whilestat627 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_stat_in_whilestat629 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_50_in_whilestat632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_forstat668 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_INT_in_forstat670 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_forstat672 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_givevalue_in_forstat676 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_forstat678 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_boolexpr_in_forstat682 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_forstat684 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_givevalue_in_forstat688 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_forstat690 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_forstat692 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_stat_in_forstat696 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_50_in_forstat699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_declarefunc735 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_declarefunc737 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_declarefunc739 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declarefunc741 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_declarefunc743 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_stat_in_declarefunc745 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_50_in_declarefunc748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_declarefunc765 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_42_in_declarefunc767 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_declarefunc770 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_declarefunc772 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_declarefunc774 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_declarefunc776 = new BitSet(new long[]{0x0001FC0000080000L});
	public static final BitSet FOLLOW_stat_in_declarefunc778 = new BitSet(new long[]{0x0001FC0000080000L});
	public static final BitSet FOLLOW_46_in_declarefunc781 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_expr_in_declarefunc783 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_declarefunc785 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_declarefunc787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_declarefunc805 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_declarefunc807 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_declarefunc809 = new BitSet(new long[]{0x0000240000000000L});
	public static final BitSet FOLLOW_num_type_in_declarefunc812 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_declarefunc814 = new BitSet(new long[]{0x0000000120000000L});
	public static final BitSet FOLLOW_32_in_declarefunc818 = new BitSet(new long[]{0x0000240000000000L});
	public static final BitSet FOLLOW_num_type_in_declarefunc821 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_declarefunc823 = new BitSet(new long[]{0x0000000120000000L});
	public static final BitSet FOLLOW_29_in_declarefunc828 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_declarefunc830 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_stat_in_declarefunc832 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_50_in_declarefunc835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_declarefunc861 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_42_in_declarefunc863 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_declarefunc866 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_declarefunc868 = new BitSet(new long[]{0x0000240000000000L});
	public static final BitSet FOLLOW_num_type_in_declarefunc871 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_declarefunc873 = new BitSet(new long[]{0x0000000120000000L});
	public static final BitSet FOLLOW_32_in_declarefunc877 = new BitSet(new long[]{0x0000240000000000L});
	public static final BitSet FOLLOW_num_type_in_declarefunc880 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_declarefunc882 = new BitSet(new long[]{0x0000000120000000L});
	public static final BitSet FOLLOW_29_in_declarefunc887 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_declarefunc889 = new BitSet(new long[]{0x0001FC0000080000L});
	public static final BitSet FOLLOW_stat_in_declarefunc891 = new BitSet(new long[]{0x0001FC0000080000L});
	public static final BitSet FOLLOW_46_in_declarefunc894 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_expr_in_declarefunc896 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_declarefunc898 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_declarefunc900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_callfunc933 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_callfunc935 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_callfunc937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_callfunc950 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_callfunc952 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_expr_in_callfunc954 = new BitSet(new long[]{0x0000000120000000L});
	public static final BitSet FOLLOW_32_in_callfunc957 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_expr_in_callfunc959 = new BitSet(new long[]{0x0000000120000000L});
	public static final BitSet FOLLOW_29_in_callfunc963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarevar_in_stat988 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_stat990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_givevalue_in_stat1003 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_stat1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat1030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarefunc_in_stat1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callfunc_in_stat1069 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_stat1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_prog1089 = new BitSet(new long[]{0x0001BC0000080002L});
	public static final BitSet FOLLOW_44_in_synpred1_c513 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_INT_in_synpred1_c515 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_synpred1_c517 = new BitSet(new long[]{0x0000000010481000L});
	public static final BitSet FOLLOW_boolexpr_in_synpred1_c519 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_synpred1_c521 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_synpred1_c523 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_stat_in_synpred1_c527 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_50_in_synpred1_c530 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_synpred1_c532 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_synpred1_c534 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_stat_in_synpred1_c538 = new BitSet(new long[]{0x0005BC0000080000L});
	public static final BitSet FOLLOW_50_in_synpred1_c541 = new BitSet(new long[]{0x0000000000000002L});
}
