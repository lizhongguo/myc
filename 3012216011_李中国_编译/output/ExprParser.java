// $ANTLR 3.5.1 /home/lzg/t2/Expr.g 2015-06-12 18:45:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ExprParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "END", "ID", "IFSTAT", 
		"INT", "NUM", "PROG", "STAT", "VAR", "WHILESTAT", "WS", "'('", "')'", 
		"'*'", "'+'", "'-'", "'='", "'else'", "'if'", "'int'", "'while'", "'{'", 
		"'}'"
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "prog", "multExpr", "atom", "ifstat", "block", "whilestat", 
		"expr", "stat"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public ExprParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public ExprParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public ExprParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return ExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/lzg/t2/Expr.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /home/lzg/t2/Expr.g:9:1: prog : ( stat )+ -> ( ^( PROG stat ) )+ ;
	public final ExprParser.prog_return prog() throws RecognitionException {
		ExprParser.prog_return retval = new ExprParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope stat1 =null;

		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(9, 0);

		try {
			// /home/lzg/t2/Expr.g:9:5: ( ( stat )+ -> ( ^( PROG stat ) )+ )
			dbg.enterAlt(1);

			// /home/lzg/t2/Expr.g:9:8: ( stat )+
			{
			dbg.location(9,8);
			// /home/lzg/t2/Expr.g:9:8: ( stat )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==INT||LA1_0==15||(LA1_0 >= 22 && LA1_0 <= 25)) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lzg/t2/Expr.g:9:9: stat
					{
					dbg.location(9,9);
					pushFollow(FOLLOW_stat_in_prog51);
					stat1=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stat.add(stat1.getTree());dbg.location(9,13);
					if ( state.backtracking==0 ) {System.out.println((stat1!=null?((CommonTree)stat1.getTree()):null).toStringTree());}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}

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
			// 9:64: -> ( ^( PROG stat ) )+
			{
				dbg.location(9,67);
				if ( !(stream_stat.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_stat.hasNext() ) {
					dbg.location(9,67);
					// /home/lzg/t2/Expr.g:9:67: ^( PROG stat )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					dbg.location(9,69);
					root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "PROG"), root_1);
					dbg.location(9,74);
					adaptor.addChild(root_1, stream_stat.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_stat.reset();

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
		dbg.location(9, 79);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "prog"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /home/lzg/t2/Expr.g:10:1: block : '{' ( stat )+ '}' -> ( ^( BLOCK stat ) )+ ;
	public final ExprParser.block_return block() throws RecognitionException {
		ExprParser.block_return retval = new ExprParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal2=null;
		Token char_literal4=null;
		ParserRuleReturnScope stat3 =null;

		CommonTree char_literal2_tree=null;
		CommonTree char_literal4_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(10, 0);

		try {
			// /home/lzg/t2/Expr.g:10:6: ( '{' ( stat )+ '}' -> ( ^( BLOCK stat ) )+ )
			dbg.enterAlt(1);

			// /home/lzg/t2/Expr.g:10:8: '{' ( stat )+ '}'
			{
			dbg.location(10,8);
			char_literal2=(Token)match(input,25,FOLLOW_25_in_block69); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_25.add(char_literal2);
			dbg.location(10,12);
			// /home/lzg/t2/Expr.g:10:12: ( stat )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID||LA2_0==INT||LA2_0==15||(LA2_0 >= 22 && LA2_0 <= 25)) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lzg/t2/Expr.g:10:12: stat
					{
					dbg.location(10,12);
					pushFollow(FOLLOW_stat_in_block71);
					stat3=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_stat.add(stat3.getTree());
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(2, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt2++;
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(10,18);
			char_literal4=(Token)match(input,26,FOLLOW_26_in_block74); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_26.add(char_literal4);

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
			// 10:22: -> ( ^( BLOCK stat ) )+
			{
				dbg.location(10,25);
				if ( !(stream_stat.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_stat.hasNext() ) {
					dbg.location(10,25);
					// /home/lzg/t2/Expr.g:10:25: ^( BLOCK stat )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					dbg.location(10,27);
					root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
					dbg.location(10,33);
					adaptor.addChild(root_1, stream_stat.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_stat.reset();

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
		dbg.location(11, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "block"


	public static class stat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// /home/lzg/t2/Expr.g:12:1: stat : ( expr END -> ^( STAT expr ) | ifstat -> ^( IFSTAT ifstat ) | whilestat -> ^( WHILESTAT whilestat ) | block -> ^( BLOCK block ) );
	public final ExprParser.stat_return stat() throws RecognitionException {
		ExprParser.stat_return retval = new ExprParser.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token END6=null;
		ParserRuleReturnScope expr5 =null;
		ParserRuleReturnScope ifstat7 =null;
		ParserRuleReturnScope whilestat8 =null;
		ParserRuleReturnScope block9 =null;

		CommonTree END6_tree=null;
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleSubtreeStream stream_ifstat=new RewriteRuleSubtreeStream(adaptor,"rule ifstat");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_whilestat=new RewriteRuleSubtreeStream(adaptor,"rule whilestat");

		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// /home/lzg/t2/Expr.g:12:5: ( expr END -> ^( STAT expr ) | ifstat -> ^( IFSTAT ifstat ) | whilestat -> ^( WHILESTAT whilestat ) | block -> ^( BLOCK block ) )
			int alt3=4;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case ID:
			case INT:
			case 15:
			case 23:
				{
				alt3=1;
				}
				break;
			case 22:
				{
				alt3=2;
				}
				break;
			case 24:
				{
				alt3=3;
				}
				break;
			case 25:
				{
				alt3=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lzg/t2/Expr.g:12:8: expr END
					{
					dbg.location(12,8);
					pushFollow(FOLLOW_expr_in_stat92);
					expr5=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr5.getTree());dbg.location(12,13);
					END6=(Token)match(input,END,FOLLOW_END_in_stat94); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_END.add(END6);

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
					// 12:18: -> ^( STAT expr )
					{
						dbg.location(12,21);
						// /home/lzg/t2/Expr.g:12:21: ^( STAT expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(12,23);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STAT, "STAT"), root_1);
						dbg.location(12,28);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lzg/t2/Expr.g:13:3: ifstat
					{
					dbg.location(13,3);
					pushFollow(FOLLOW_ifstat_in_stat107);
					ifstat7=ifstat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ifstat.add(ifstat7.getTree());
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
					// 13:11: -> ^( IFSTAT ifstat )
					{
						dbg.location(13,14);
						// /home/lzg/t2/Expr.g:13:14: ^( IFSTAT ifstat )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(13,16);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IFSTAT, "IFSTAT"), root_1);
						dbg.location(13,23);
						adaptor.addChild(root_1, stream_ifstat.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/lzg/t2/Expr.g:14:3: whilestat
					{
					dbg.location(14,3);
					pushFollow(FOLLOW_whilestat_in_stat120);
					whilestat8=whilestat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_whilestat.add(whilestat8.getTree());
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
					// 14:13: -> ^( WHILESTAT whilestat )
					{
						dbg.location(14,16);
						// /home/lzg/t2/Expr.g:14:16: ^( WHILESTAT whilestat )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(14,18);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILESTAT, "WHILESTAT"), root_1);
						dbg.location(14,28);
						adaptor.addChild(root_1, stream_whilestat.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/lzg/t2/Expr.g:15:3: block
					{
					dbg.location(15,3);
					pushFollow(FOLLOW_block_in_stat132);
					block9=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_block.add(block9.getTree());
					// AST REWRITE
					// elements: block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 15:9: -> ^( BLOCK block )
					{
						dbg.location(15,12);
						// /home/lzg/t2/Expr.g:15:12: ^( BLOCK block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(15,14);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
						dbg.location(15,20);
						adaptor.addChild(root_1, stream_block.nextTree());
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
		dbg.location(16, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "stat"


	public static class ifstat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifstat"
	// /home/lzg/t2/Expr.g:17:1: ifstat options {backtrack=true; } : 'if' '(' expr ')' c1= block 'else' c2= block -> ^( 'if' expr $c1 $c2) ;
	public final ExprParser.ifstat_return ifstat() throws RecognitionException {
		ExprParser.ifstat_return retval = new ExprParser.ifstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal10=null;
		Token char_literal11=null;
		Token char_literal13=null;
		Token string_literal14=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope expr12 =null;

		CommonTree string_literal10_tree=null;
		CommonTree char_literal11_tree=null;
		CommonTree char_literal13_tree=null;
		CommonTree string_literal14_tree=null;
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
		RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try { dbg.enterRule(getGrammarFileName(), "ifstat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// /home/lzg/t2/Expr.g:17:36: ( 'if' '(' expr ')' c1= block 'else' c2= block -> ^( 'if' expr $c1 $c2) )
			dbg.enterAlt(1);

			// /home/lzg/t2/Expr.g:18:2: 'if' '(' expr ')' c1= block 'else' c2= block
			{
			dbg.location(18,2);
			string_literal10=(Token)match(input,22,FOLLOW_22_in_ifstat159); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_22.add(string_literal10);
			dbg.location(18,7);
			char_literal11=(Token)match(input,15,FOLLOW_15_in_ifstat161); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_15.add(char_literal11);
			dbg.location(18,11);
			pushFollow(FOLLOW_expr_in_ifstat163);
			expr12=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr12.getTree());dbg.location(18,16);
			char_literal13=(Token)match(input,16,FOLLOW_16_in_ifstat165); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_16.add(char_literal13);
			dbg.location(18,24);
			pushFollow(FOLLOW_block_in_ifstat171);
			c1=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(c1.getTree());dbg.location(18,32);
			string_literal14=(Token)match(input,21,FOLLOW_21_in_ifstat174); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_21.add(string_literal14);
			dbg.location(18,42);
			pushFollow(FOLLOW_block_in_ifstat179);
			c2=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(c2.getTree());
			// AST REWRITE
			// elements: 22, c1, c2, expr
			// token labels: 
			// rule labels: c1, retval, c2
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 18:49: -> ^( 'if' expr $c1 $c2)
			{
				dbg.location(18,52);
				// /home/lzg/t2/Expr.g:18:52: ^( 'if' expr $c1 $c2)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(18,54);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_22.nextNode(), root_1);
				dbg.location(18,59);
				adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(18,65);
				adaptor.addChild(root_1, stream_c1.nextTree());dbg.location(18,69);
				adaptor.addChild(root_1, stream_c2.nextTree());
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
		dbg.location(19, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifstat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/lzg/t2/Expr.g:20:1: whilestat options {backtrack=true; } : 'while' '(' expr ')' b= block -> ^( 'while' expr $b) ;
	public final ExprParser.whilestat_return whilestat() throws RecognitionException {
		ExprParser.whilestat_return retval = new ExprParser.whilestat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal15=null;
		Token char_literal16=null;
		Token char_literal18=null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope expr17 =null;

		CommonTree string_literal15_tree=null;
		CommonTree char_literal16_tree=null;
		CommonTree char_literal18_tree=null;
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
		RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try { dbg.enterRule(getGrammarFileName(), "whilestat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// /home/lzg/t2/Expr.g:20:38: ( 'while' '(' expr ')' b= block -> ^( 'while' expr $b) )
			dbg.enterAlt(1);

			// /home/lzg/t2/Expr.g:21:2: 'while' '(' expr ')' b= block
			{
			dbg.location(21,2);
			string_literal15=(Token)match(input,24,FOLLOW_24_in_whilestat212); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_24.add(string_literal15);
			dbg.location(21,10);
			char_literal16=(Token)match(input,15,FOLLOW_15_in_whilestat214); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_15.add(char_literal16);
			dbg.location(21,14);
			pushFollow(FOLLOW_expr_in_whilestat216);
			expr17=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr17.getTree());dbg.location(21,19);
			char_literal18=(Token)match(input,16,FOLLOW_16_in_whilestat218); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_16.add(char_literal18);
			dbg.location(21,26);
			pushFollow(FOLLOW_block_in_whilestat224);
			b=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(b.getTree());
			// AST REWRITE
			// elements: expr, 24, b
			// token labels: 
			// rule labels: b, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 21:34: -> ^( 'while' expr $b)
			{
				dbg.location(21,37);
				// /home/lzg/t2/Expr.g:21:37: ^( 'while' expr $b)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(21,39);
				root_1 = (CommonTree)adaptor.becomeRoot(stream_24.nextNode(), root_1);
				dbg.location(21,47);
				adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(21,53);
				adaptor.addChild(root_1, stream_b.nextTree());
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
		dbg.location(22, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "whilestat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "whilestat"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /home/lzg/t2/Expr.g:23:1: expr : ( 'int' ^ ID | multExpr ( ( '+' ^| '-' ^) multExpr )* | ID '=' ^ expr );
	public final ExprParser.expr_return expr() throws RecognitionException {
		ExprParser.expr_return retval = new ExprParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal19=null;
		Token ID20=null;
		Token char_literal22=null;
		Token char_literal23=null;
		Token ID25=null;
		Token char_literal26=null;
		ParserRuleReturnScope multExpr21 =null;
		ParserRuleReturnScope multExpr24 =null;
		ParserRuleReturnScope expr27 =null;

		CommonTree string_literal19_tree=null;
		CommonTree ID20_tree=null;
		CommonTree char_literal22_tree=null;
		CommonTree char_literal23_tree=null;
		CommonTree ID25_tree=null;
		CommonTree char_literal26_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// /home/lzg/t2/Expr.g:23:5: ( 'int' ^ ID | multExpr ( ( '+' ^| '-' ^) multExpr )* | ID '=' ^ expr )
			int alt6=3;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			switch ( input.LA(1) ) {
			case 23:
				{
				alt6=1;
				}
				break;
			case INT:
			case 15:
				{
				alt6=2;
				}
				break;
			case ID:
				{
				int LA6_3 = input.LA(2);
				if ( (LA6_3==20) ) {
					alt6=3;
				}
				else if ( (LA6_3==END||(LA6_3 >= 16 && LA6_3 <= 19)) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 3, input);
						dbg.recognitionException(nvae);
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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lzg/t2/Expr.g:24:2: 'int' ^ ID
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(24,7);
					string_literal19=(Token)match(input,23,FOLLOW_23_in_expr247); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal19_tree = (CommonTree)adaptor.create(string_literal19);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal19_tree, root_0);
					}
					dbg.location(24,10);
					ID20=(Token)match(input,ID,FOLLOW_ID_in_expr251); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID20_tree = (CommonTree)adaptor.create(ID20);
					adaptor.addChild(root_0, ID20_tree);
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lzg/t2/Expr.g:25:3: multExpr ( ( '+' ^| '-' ^) multExpr )*
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(25,3);
					pushFollow(FOLLOW_multExpr_in_expr255);
					multExpr21=multExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr21.getTree());
					dbg.location(25,13);
					// /home/lzg/t2/Expr.g:25:13: ( ( '+' ^| '-' ^) multExpr )*
					try { dbg.enterSubRule(5);

					loop5:
					while (true) {
						int alt5=2;
						try { dbg.enterDecision(5, decisionCanBacktrack[5]);

						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= 18 && LA5_0 <= 19)) ) {
							alt5=1;
						}

						} finally {dbg.exitDecision(5);}

						switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// /home/lzg/t2/Expr.g:25:14: ( '+' ^| '-' ^) multExpr
							{
							dbg.location(25,14);
							// /home/lzg/t2/Expr.g:25:14: ( '+' ^| '-' ^)
							int alt4=2;
							try { dbg.enterSubRule(4);
							try { dbg.enterDecision(4, decisionCanBacktrack[4]);

							int LA4_0 = input.LA(1);
							if ( (LA4_0==18) ) {
								alt4=1;
							}
							else if ( (LA4_0==19) ) {
								alt4=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 0, input);
								dbg.recognitionException(nvae);
								throw nvae;
							}

							} finally {dbg.exitDecision(4);}

							switch (alt4) {
								case 1 :
									dbg.enterAlt(1);

									// /home/lzg/t2/Expr.g:25:15: '+' ^
									{
									dbg.location(25,19);
									char_literal22=(Token)match(input,18,FOLLOW_18_in_expr260); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal22_tree = (CommonTree)adaptor.create(char_literal22);
									root_0 = (CommonTree)adaptor.becomeRoot(char_literal22_tree, root_0);
									}

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// /home/lzg/t2/Expr.g:25:21: '-' ^
									{
									dbg.location(25,25);
									char_literal23=(Token)match(input,19,FOLLOW_19_in_expr264); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									char_literal23_tree = (CommonTree)adaptor.create(char_literal23);
									root_0 = (CommonTree)adaptor.becomeRoot(char_literal23_tree, root_0);
									}

									}
									break;

							}
							} finally {dbg.exitSubRule(4);}
							dbg.location(25,29);
							pushFollow(FOLLOW_multExpr_in_expr270);
							multExpr24=multExpr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr24.getTree());

							}
							break;

						default :
							break loop5;
						}
					}
					} finally {dbg.exitSubRule(5);}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/lzg/t2/Expr.g:26:3: ID '=' ^ expr
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(26,3);
					ID25=(Token)match(input,ID,FOLLOW_ID_in_expr276); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID25_tree = (CommonTree)adaptor.create(ID25);
					adaptor.addChild(root_0, ID25_tree);
					}
					dbg.location(26,10);
					char_literal26=(Token)match(input,20,FOLLOW_20_in_expr279); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal26_tree = (CommonTree)adaptor.create(char_literal26);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal26_tree, root_0);
					}
					dbg.location(26,13);
					pushFollow(FOLLOW_expr_in_expr283);
					expr27=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr27.getTree());

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
		dbg.location(28, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expr"


	public static class multExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multExpr"
	// /home/lzg/t2/Expr.g:29:1: multExpr : atom ( '*' ^ atom )* ;
	public final ExprParser.multExpr_return multExpr() throws RecognitionException {
		ExprParser.multExpr_return retval = new ExprParser.multExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal29=null;
		ParserRuleReturnScope atom28 =null;
		ParserRuleReturnScope atom30 =null;

		CommonTree char_literal29_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "multExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// /home/lzg/t2/Expr.g:29:9: ( atom ( '*' ^ atom )* )
			dbg.enterAlt(1);

			// /home/lzg/t2/Expr.g:29:11: atom ( '*' ^ atom )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(29,11);
			pushFollow(FOLLOW_atom_in_multExpr293);
			atom28=atom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, atom28.getTree());
			dbg.location(29,16);
			// /home/lzg/t2/Expr.g:29:16: ( '*' ^ atom )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==17) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lzg/t2/Expr.g:29:17: '*' ^ atom
					{
					dbg.location(29,21);
					char_literal29=(Token)match(input,17,FOLLOW_17_in_multExpr296); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal29_tree = (CommonTree)adaptor.create(char_literal29);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal29_tree, root_0);
					}
					dbg.location(29,23);
					pushFollow(FOLLOW_atom_in_multExpr300);
					atom30=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom30.getTree());

					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}

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
		dbg.location(29, 29);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "multExpr"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// /home/lzg/t2/Expr.g:30:1: atom : ( '(' expr ')' -> expr | INT -> ^( NUM INT ) | ID -> ^( VAR ID ) );
	public final ExprParser.atom_return atom() throws RecognitionException {
		ExprParser.atom_return retval = new ExprParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal31=null;
		Token char_literal33=null;
		Token INT34=null;
		Token ID35=null;
		ParserRuleReturnScope expr32 =null;

		CommonTree char_literal31_tree=null;
		CommonTree char_literal33_tree=null;
		CommonTree INT34_tree=null;
		CommonTree ID35_tree=null;
		RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
		RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// /home/lzg/t2/Expr.g:30:5: ( '(' expr ')' -> expr | INT -> ^( NUM INT ) | ID -> ^( VAR ID ) )
			int alt8=3;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case 15:
				{
				alt8=1;
				}
				break;
			case INT:
				{
				alt8=2;
				}
				break;
			case ID:
				{
				alt8=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/lzg/t2/Expr.g:30:7: '(' expr ')'
					{
					dbg.location(30,7);
					char_literal31=(Token)match(input,15,FOLLOW_15_in_atom309); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_15.add(char_literal31);
					dbg.location(30,10);
					pushFollow(FOLLOW_expr_in_atom310);
					expr32=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr32.getTree());dbg.location(30,14);
					char_literal33=(Token)match(input,16,FOLLOW_16_in_atom311); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_16.add(char_literal33);

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
					// 30:18: -> expr
					{
						dbg.location(30,21);
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/lzg/t2/Expr.g:31:7: INT
					{
					dbg.location(31,7);
					INT34=(Token)match(input,INT,FOLLOW_INT_in_atom323); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(INT34);

					// AST REWRITE
					// elements: INT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 31:11: -> ^( NUM INT )
					{
						dbg.location(31,14);
						// /home/lzg/t2/Expr.g:31:14: ^( NUM INT )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(31,16);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NUM, "NUM"), root_1);
						dbg.location(31,20);
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/lzg/t2/Expr.g:32:7: ID
					{
					dbg.location(32,7);
					ID35=(Token)match(input,ID,FOLLOW_ID_in_atom339); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID35);

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
					// 32:10: -> ^( VAR ID )
					{
						dbg.location(32,13);
						// /home/lzg/t2/Expr.g:32:13: ^( VAR ID )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(32,15);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);
						dbg.location(32,19);
						adaptor.addChild(root_1, stream_ID.nextNode());
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
		dbg.location(33, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog51 = new BitSet(new long[]{0x0000000003C08142L});
	public static final BitSet FOLLOW_25_in_block69 = new BitSet(new long[]{0x0000000003C08140L});
	public static final BitSet FOLLOW_stat_in_block71 = new BitSet(new long[]{0x0000000007C08140L});
	public static final BitSet FOLLOW_26_in_block74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_stat92 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_END_in_stat94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_ifstat159 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ifstat161 = new BitSet(new long[]{0x0000000000808140L});
	public static final BitSet FOLLOW_expr_in_ifstat163 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_ifstat165 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_block_in_ifstat171 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_ifstat174 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_block_in_ifstat179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_whilestat212 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_whilestat214 = new BitSet(new long[]{0x0000000000808140L});
	public static final BitSet FOLLOW_expr_in_whilestat216 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_whilestat218 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_block_in_whilestat224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_expr247 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_expr251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr255 = new BitSet(new long[]{0x00000000000C0002L});
	public static final BitSet FOLLOW_18_in_expr260 = new BitSet(new long[]{0x0000000000008140L});
	public static final BitSet FOLLOW_19_in_expr264 = new BitSet(new long[]{0x0000000000008140L});
	public static final BitSet FOLLOW_multExpr_in_expr270 = new BitSet(new long[]{0x00000000000C0002L});
	public static final BitSet FOLLOW_ID_in_expr276 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_expr279 = new BitSet(new long[]{0x0000000000808140L});
	public static final BitSet FOLLOW_expr_in_expr283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_multExpr293 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_multExpr296 = new BitSet(new long[]{0x0000000000008140L});
	public static final BitSet FOLLOW_atom_in_multExpr300 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_15_in_atom309 = new BitSet(new long[]{0x0000000000808140L});
	public static final BitSet FOLLOW_expr_in_atom310 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_atom311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom339 = new BitSet(new long[]{0x0000000000000002L});
}
