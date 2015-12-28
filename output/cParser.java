// $ANTLR 3.4 /home/lizhongguo/antlr/c.g 2015-11-28 10:45:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class cParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL", "CALLFUNC", "COMMENT", "DECLAREFUNC", "DECLAREVAR", "ELSE", "END", "EXPONENT", "FLOAT", "FORSTAT", "FUNC1", "FUNC2", "FUNC3", "FUNC4", "GIVEVALUE", "ID", "IF", "IFSTAT", "INT", "PROG", "STAT", "WHILESTAT", "WS", "'!='", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'else'", "'float'", "'for'", "'if'", "'int'", "'return'", "'void'", "'while'", "'{'", "'}'"
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


public static final String[] ruleNames = new String[] {
    "invalidRule", "declarefunc", "num_type", "ifstat", "synpred1_c", "expr", 
    "atom", "forstat", "multexpr", "whilestat", "callfunc", "declarevar", 
    "stat", "num", "boolexpr", "givevalue", "prog"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        true, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public cParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public cParser(TokenStream input, int port, RecognizerSharedState state) {
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

public cParser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return cParser.tokenNames; }
    public String getGrammarFileName() { return "/home/lizhongguo/antlr/c.g"; }


    public static class num_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num"
    // /home/lizhongguo/antlr/c.g:23:1: num : ( INT | FLOAT );
    public final cParser.num_return num() throws RecognitionException {
        cParser.num_return retval = new cParser.num_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set1=null;

        CommonTree set1_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "num");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 0);

        try {
            // /home/lizhongguo/antlr/c.g:23:5: ( INT | FLOAT )
            dbg.enterAlt(1);

            // /home/lizhongguo/antlr/c.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(23,5);
            set1=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set1)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(25, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "num");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "num"


    public static class num_type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_type"
    // /home/lizhongguo/antlr/c.g:27:1: num_type : ( 'int' | 'float' );
    public final cParser.num_type_return num_type() throws RecognitionException {
        cParser.num_type_return retval = new cParser.num_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set2=null;

        CommonTree set2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "num_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // /home/lizhongguo/antlr/c.g:27:10: ( 'int' | 'float' )
            dbg.enterAlt(1);

            // /home/lizhongguo/antlr/c.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(27,10);
            set2=(Token)input.LT(1);

            if ( input.LA(1)==42||input.LA(1)==45 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set2)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(29, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "num_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "num_type"


    public static class boolexpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolexpr"
    // /home/lizhongguo/antlr/c.g:40:1: boolexpr : expr ( '==' ^| '!=' ^| '>' ^| '<' ^| '>=' ^| '<=' ^) expr ;
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
        cParser.expr_return expr3 =null;

        cParser.expr_return expr10 =null;


        CommonTree string_literal4_tree=null;
        CommonTree string_literal5_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree string_literal8_tree=null;
        CommonTree string_literal9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "boolexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 0);

        try {
            // /home/lizhongguo/antlr/c.g:40:10: ( expr ( '==' ^| '!=' ^| '>' ^| '<' ^| '>=' ^| '<=' ^) expr )
            dbg.enterAlt(1);

            // /home/lizhongguo/antlr/c.g:40:12: expr ( '==' ^| '!=' ^| '>' ^| '<' ^| '>=' ^| '<=' ^) expr
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(40,12);
            pushFollow(FOLLOW_expr_in_boolexpr328);
            expr3=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr3.getTree());
            dbg.location(40,17);
            // /home/lizhongguo/antlr/c.g:40:17: ( '==' ^| '!=' ^| '>' ^| '<' ^| '>=' ^| '<=' ^)
            int alt1=6;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lizhongguo/antlr/c.g:40:18: '==' ^
                    {
                    dbg.location(40,22);
                    string_literal4=(Token)match(input,38,FOLLOW_38_in_boolexpr331); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal4_tree = 
                    (CommonTree)adaptor.create(string_literal4)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal4_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lizhongguo/antlr/c.g:40:24: '!=' ^
                    {
                    dbg.location(40,28);
                    string_literal5=(Token)match(input,27,FOLLOW_27_in_boolexpr334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal5_tree = 
                    (CommonTree)adaptor.create(string_literal5)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal5_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lizhongguo/antlr/c.g:40:30: '>' ^
                    {
                    dbg.location(40,33);
                    char_literal6=(Token)match(input,39,FOLLOW_39_in_boolexpr337); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal6_tree = 
                    (CommonTree)adaptor.create(char_literal6)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal6_tree, root_0);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lizhongguo/antlr/c.g:40:35: '<' ^
                    {
                    dbg.location(40,38);
                    char_literal7=(Token)match(input,35,FOLLOW_35_in_boolexpr340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal7_tree = 
                    (CommonTree)adaptor.create(char_literal7)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal7_tree, root_0);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lizhongguo/antlr/c.g:40:40: '>=' ^
                    {
                    dbg.location(40,44);
                    string_literal8=(Token)match(input,40,FOLLOW_40_in_boolexpr343); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal8_tree = 
                    (CommonTree)adaptor.create(string_literal8)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal8_tree, root_0);
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/lizhongguo/antlr/c.g:40:46: '<=' ^
                    {
                    dbg.location(40,50);
                    string_literal9=(Token)match(input,36,FOLLOW_36_in_boolexpr346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal9_tree = 
                    (CommonTree)adaptor.create(string_literal9)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal9_tree, root_0);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(40,53);
            pushFollow(FOLLOW_expr_in_boolexpr350);
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
        dbg.location(41, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boolexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "boolexpr"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/lizhongguo/antlr/c.g:42:1: expr : multexpr ( ( '+' ^| '-' ^) multexpr )* ;
    public final cParser.expr_return expr() throws RecognitionException {
        cParser.expr_return retval = new cParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal12=null;
        Token char_literal13=null;
        cParser.multexpr_return multexpr11 =null;

        cParser.multexpr_return multexpr14 =null;


        CommonTree char_literal12_tree=null;
        CommonTree char_literal13_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 0);

        try {
            // /home/lizhongguo/antlr/c.g:42:6: ( multexpr ( ( '+' ^| '-' ^) multexpr )* )
            dbg.enterAlt(1);

            // /home/lizhongguo/antlr/c.g:42:8: multexpr ( ( '+' ^| '-' ^) multexpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(42,8);
            pushFollow(FOLLOW_multexpr_in_expr359);
            multexpr11=multexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multexpr11.getTree());
            dbg.location(42,17);
            // /home/lizhongguo/antlr/c.g:42:17: ( ( '+' ^| '-' ^) multexpr )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==31||LA3_0==33) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lizhongguo/antlr/c.g:42:18: ( '+' ^| '-' ^) multexpr
            	    {
            	    dbg.location(42,18);
            	    // /home/lizhongguo/antlr/c.g:42:18: ( '+' ^| '-' ^)
            	    int alt2=2;
            	    try { dbg.enterSubRule(2);
            	    try { dbg.enterDecision(2, decisionCanBacktrack[2]);

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

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }
            	    } finally {dbg.exitDecision(2);}

            	    switch (alt2) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/lizhongguo/antlr/c.g:42:19: '+' ^
            	            {
            	            dbg.location(42,22);
            	            char_literal12=(Token)match(input,31,FOLLOW_31_in_expr363); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal12_tree = 
            	            (CommonTree)adaptor.create(char_literal12)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal12_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /home/lizhongguo/antlr/c.g:42:26: '-' ^
            	            {
            	            dbg.location(42,29);
            	            char_literal13=(Token)match(input,33,FOLLOW_33_in_expr368); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal13_tree = 
            	            (CommonTree)adaptor.create(char_literal13)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal13_tree, root_0);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(2);}

            	    dbg.location(42,32);
            	    pushFollow(FOLLOW_multexpr_in_expr372);
            	    multexpr14=multexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multexpr14.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


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
        dbg.location(43, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"


    public static class multexpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multexpr"
    // /home/lizhongguo/antlr/c.g:45:1: multexpr : atom ( ( '*' ^| '/' ^) atom )* ;
    public final cParser.multexpr_return multexpr() throws RecognitionException {
        cParser.multexpr_return retval = new cParser.multexpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal16=null;
        Token char_literal17=null;
        cParser.atom_return atom15 =null;

        cParser.atom_return atom18 =null;


        CommonTree char_literal16_tree=null;
        CommonTree char_literal17_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "multexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 0);

        try {
            // /home/lizhongguo/antlr/c.g:45:10: ( atom ( ( '*' ^| '/' ^) atom )* )
            dbg.enterAlt(1);

            // /home/lizhongguo/antlr/c.g:45:12: atom ( ( '*' ^| '/' ^) atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(45,12);
            pushFollow(FOLLOW_atom_in_multexpr383);
            atom15=atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, atom15.getTree());
            dbg.location(45,17);
            // /home/lizhongguo/antlr/c.g:45:17: ( ( '*' ^| '/' ^) atom )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==30||LA5_0==34) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lizhongguo/antlr/c.g:45:18: ( '*' ^| '/' ^) atom
            	    {
            	    dbg.location(45,18);
            	    // /home/lizhongguo/antlr/c.g:45:18: ( '*' ^| '/' ^)
            	    int alt4=2;
            	    try { dbg.enterSubRule(4);
            	    try { dbg.enterDecision(4, decisionCanBacktrack[4]);

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

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }
            	    } finally {dbg.exitDecision(4);}

            	    switch (alt4) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/lizhongguo/antlr/c.g:45:19: '*' ^
            	            {
            	            dbg.location(45,22);
            	            char_literal16=(Token)match(input,30,FOLLOW_30_in_multexpr387); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal16_tree = 
            	            (CommonTree)adaptor.create(char_literal16)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal16_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /home/lizhongguo/antlr/c.g:45:24: '/' ^
            	            {
            	            dbg.location(45,27);
            	            char_literal17=(Token)match(input,34,FOLLOW_34_in_multexpr390); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal17_tree = 
            	            (CommonTree)adaptor.create(char_literal17)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal17_tree, root_0);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(4);}

            	    dbg.location(45,30);
            	    pushFollow(FOLLOW_atom_in_multexpr394);
            	    atom18=atom();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom18.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


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
        dbg.location(46, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "multexpr"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/lizhongguo/antlr/c.g:48:1: atom : ( '(' expr ')' -> ^( expr ) | num | ID | callfunc );
    public final cParser.atom_return atom() throws RecognitionException {
        cParser.atom_return retval = new cParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal19=null;
        Token char_literal21=null;
        Token ID23=null;
        cParser.expr_return expr20 =null;

        cParser.num_return num22 =null;

        cParser.callfunc_return callfunc24 =null;


        CommonTree char_literal19_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree ID23_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 0);

        try {
            // /home/lizhongguo/antlr/c.g:48:6: ( '(' expr ')' -> ^( expr ) | num | ID | callfunc )
            int alt6=4;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

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
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

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

                    // /home/lizhongguo/antlr/c.g:48:8: '(' expr ')'
                    {
                    dbg.location(48,8);
                    char_literal19=(Token)match(input,28,FOLLOW_28_in_atom405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal19);

                    dbg.location(48,12);
                    pushFollow(FOLLOW_expr_in_atom407);
                    expr20=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr20.getTree());
                    dbg.location(48,17);
                    char_literal21=(Token)match(input,29,FOLLOW_29_in_atom409); if (state.failed) return retval; 
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 48:25: -> ^( expr )
                    {
                        dbg.location(48,33);
                        // /home/lizhongguo/antlr/c.g:48:33: ^( expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(48,35);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_expr.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lizhongguo/antlr/c.g:49:4: num
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(49,4);
                    pushFollow(FOLLOW_num_in_atom429);
                    num22=num();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, num22.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lizhongguo/antlr/c.g:50:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(50,4);
                    ID23=(Token)match(input,ID,FOLLOW_ID_in_atom434); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID23_tree = 
                    (CommonTree)adaptor.create(ID23)
                    ;
                    adaptor.addChild(root_0, ID23_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lizhongguo/antlr/c.g:51:4: callfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(51,4);
                    pushFollow(FOLLOW_callfunc_in_atom439);
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
        dbg.location(52, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "atom"


    public static class declarevar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarevar"
    // /home/lizhongguo/antlr/c.g:54:1: declarevar : ( 'int' ^ ID | 'float' ^ ID );
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

        try { dbg.enterRule(getGrammarFileName(), "declarevar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 0);

        try {
            // /home/lizhongguo/antlr/c.g:54:12: ( 'int' ^ ID | 'float' ^ ID )
            int alt7=2;
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lizhongguo/antlr/c.g:54:14: 'int' ^ ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(54,19);
                    string_literal25=(Token)match(input,45,FOLLOW_45_in_declarevar450); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal25_tree = 
                    (CommonTree)adaptor.create(string_literal25)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal25_tree, root_0);
                    }
                    dbg.location(54,21);
                    ID26=(Token)match(input,ID,FOLLOW_ID_in_declarevar453); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID26_tree = 
                    (CommonTree)adaptor.create(ID26)
                    ;
                    adaptor.addChild(root_0, ID26_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lizhongguo/antlr/c.g:55:4: 'float' ^ ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(55,11);
                    string_literal27=(Token)match(input,42,FOLLOW_42_in_declarevar458); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal27_tree = 
                    (CommonTree)adaptor.create(string_literal27)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal27_tree, root_0);
                    }
                    dbg.location(55,13);
                    ID28=(Token)match(input,ID,FOLLOW_ID_in_declarevar461); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID28_tree = 
                    (CommonTree)adaptor.create(ID28)
                    ;
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
        dbg.location(56, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declarevar");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declarevar"


    public static class givevalue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "givevalue"
    // /home/lizhongguo/antlr/c.g:59:1: givevalue : ID '=' expr -> ^( '=' ID expr ) ;
    public final cParser.givevalue_return givevalue() throws RecognitionException {
        cParser.givevalue_return retval = new cParser.givevalue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID29=null;
        Token char_literal30=null;
        cParser.expr_return expr31 =null;


        CommonTree ID29_tree=null;
        CommonTree char_literal30_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "givevalue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 0);

        try {
            // /home/lizhongguo/antlr/c.g:59:11: ( ID '=' expr -> ^( '=' ID expr ) )
            dbg.enterAlt(1);

            // /home/lizhongguo/antlr/c.g:59:13: ID '=' expr
            {
            dbg.location(59,13);
            ID29=(Token)match(input,ID,FOLLOW_ID_in_givevalue474); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID29);

            dbg.location(59,17);
            char_literal30=(Token)match(input,37,FOLLOW_37_in_givevalue477); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_37.add(char_literal30);

            dbg.location(59,21);
            pushFollow(FOLLOW_expr_in_givevalue479);
            expr31=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr31.getTree());

            // AST REWRITE
            // elements: 37, expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 60:2: -> ^( '=' ID expr )
            {
                dbg.location(60,5);
                // /home/lizhongguo/antlr/c.g:60:5: ^( '=' ID expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(60,7);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_37.nextNode()
                , root_1);

                dbg.location(60,11);
                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );
                dbg.location(60,14);
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
        dbg.location(61, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "givevalue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "givevalue"


    public static class ifstat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifstat"
    // /home/lizhongguo/antlr/c.g:63:1: ifstat options {backtrack=true; } : ( 'if' '(' boolexpr ')' '{' (s1= stat )* '}' 'else' '{' (s2= stat )* '}' -> ^( IF boolexpr $s1 ELSE $s2) | 'if' '(' boolexpr ')' '{' ( stat )* '}' -> ^( IF boolexpr ( stat )* ) );
    public final cParser.ifstat_return ifstat() throws RecognitionException {
        cParser.ifstat_return retval = new cParser.ifstat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal32=null;
        Token char_literal33=null;
        Token char_literal35=null;
        Token char_literal36=null;
        Token char_literal37=null;
        Token string_literal38=null;
        Token char_literal39=null;
        Token char_literal40=null;
        Token string_literal41=null;
        Token char_literal42=null;
        Token char_literal44=null;
        Token char_literal45=null;
        Token char_literal47=null;
        cParser.stat_return s1 =null;

        cParser.stat_return s2 =null;

        cParser.boolexpr_return boolexpr34 =null;

        cParser.boolexpr_return boolexpr43 =null;

        cParser.stat_return stat46 =null;


        CommonTree string_literal32_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree string_literal38_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree string_literal41_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree char_literal44_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree char_literal47_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
        RewriteRuleSubtreeStream stream_boolexpr=new RewriteRuleSubtreeStream(adaptor,"rule boolexpr");
        try { dbg.enterRule(getGrammarFileName(), "ifstat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 0);

        try {
            // /home/lizhongguo/antlr/c.g:64:2: ( 'if' '(' boolexpr ')' '{' (s1= stat )* '}' 'else' '{' (s2= stat )* '}' -> ^( IF boolexpr $s1 ELSE $s2) | 'if' '(' boolexpr ')' '{' ( stat )* '}' -> ^( IF boolexpr ( stat )* ) )
            int alt11=2;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred1_c()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lizhongguo/antlr/c.g:64:4: 'if' '(' boolexpr ')' '{' (s1= stat )* '}' 'else' '{' (s2= stat )* '}'
                    {
                    dbg.location(64,4);
                    string_literal32=(Token)match(input,44,FOLLOW_44_in_ifstat512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_44.add(string_literal32);

                    dbg.location(64,9);
                    char_literal33=(Token)match(input,28,FOLLOW_28_in_ifstat514); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal33);

                    dbg.location(64,13);
                    pushFollow(FOLLOW_boolexpr_in_ifstat516);
                    boolexpr34=boolexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_boolexpr.add(boolexpr34.getTree());
                    dbg.location(64,22);
                    char_literal35=(Token)match(input,29,FOLLOW_29_in_ifstat518); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal35);

                    dbg.location(64,26);
                    char_literal36=(Token)match(input,49,FOLLOW_49_in_ifstat520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal36);

                    dbg.location(64,32);
                    // /home/lizhongguo/antlr/c.g:64:32: (s1= stat )*
                    try { dbg.enterSubRule(8);

                    loop8:
                    do {
                        int alt8=2;
                        try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==ID||(LA8_0 >= 42 && LA8_0 <= 45)||(LA8_0 >= 47 && LA8_0 <= 48)) ) {
                            alt8=1;
                        }


                        } finally {dbg.exitDecision(8);}

                        switch (alt8) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/lizhongguo/antlr/c.g:64:32: s1= stat
                    	    {
                    	    dbg.location(64,32);
                    	    pushFollow(FOLLOW_stat_in_ifstat524);
                    	    s1=stat();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stat.add(s1.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(8);}

                    dbg.location(64,39);
                    char_literal37=(Token)match(input,50,FOLLOW_50_in_ifstat527); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal37);

                    dbg.location(64,43);
                    string_literal38=(Token)match(input,41,FOLLOW_41_in_ifstat529); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal38);

                    dbg.location(64,50);
                    char_literal39=(Token)match(input,49,FOLLOW_49_in_ifstat531); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal39);

                    dbg.location(64,56);
                    // /home/lizhongguo/antlr/c.g:64:56: (s2= stat )*
                    try { dbg.enterSubRule(9);

                    loop9:
                    do {
                        int alt9=2;
                        try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ID||(LA9_0 >= 42 && LA9_0 <= 45)||(LA9_0 >= 47 && LA9_0 <= 48)) ) {
                            alt9=1;
                        }


                        } finally {dbg.exitDecision(9);}

                        switch (alt9) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/lizhongguo/antlr/c.g:64:56: s2= stat
                    	    {
                    	    dbg.location(64,56);
                    	    pushFollow(FOLLOW_stat_in_ifstat535);
                    	    s2=stat();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stat.add(s2.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(64,63);
                    char_literal40=(Token)match(input,50,FOLLOW_50_in_ifstat538); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal40);


                    // AST REWRITE
                    // elements: s1, s2, boolexpr
                    // token labels: 
                    // rule labels: s1, retval, s2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 65:2: -> ^( IF boolexpr $s1 ELSE $s2)
                    {
                        dbg.location(65,5);
                        // /home/lizhongguo/antlr/c.g:65:5: ^( IF boolexpr $s1 ELSE $s2)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(65,7);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(IF, "IF")
                        , root_1);

                        dbg.location(65,10);
                        adaptor.addChild(root_1, stream_boolexpr.nextTree());
                        dbg.location(65,20);
                        adaptor.addChild(root_1, stream_s1.nextTree());
                        dbg.location(65,23);
                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(ELSE, "ELSE")
                        );
                        dbg.location(65,29);
                        adaptor.addChild(root_1, stream_s2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lizhongguo/antlr/c.g:66:4: 'if' '(' boolexpr ')' '{' ( stat )* '}'
                    {
                    dbg.location(66,4);
                    string_literal41=(Token)match(input,44,FOLLOW_44_in_ifstat560); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_44.add(string_literal41);

                    dbg.location(66,9);
                    char_literal42=(Token)match(input,28,FOLLOW_28_in_ifstat562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal42);

                    dbg.location(66,13);
                    pushFollow(FOLLOW_boolexpr_in_ifstat564);
                    boolexpr43=boolexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_boolexpr.add(boolexpr43.getTree());
                    dbg.location(66,22);
                    char_literal44=(Token)match(input,29,FOLLOW_29_in_ifstat566); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal44);

                    dbg.location(66,26);
                    char_literal45=(Token)match(input,49,FOLLOW_49_in_ifstat568); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal45);

                    dbg.location(66,30);
                    // /home/lizhongguo/antlr/c.g:66:30: ( stat )*
                    try { dbg.enterSubRule(10);

                    loop10:
                    do {
                        int alt10=2;
                        try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==ID||(LA10_0 >= 42 && LA10_0 <= 45)||(LA10_0 >= 47 && LA10_0 <= 48)) ) {
                            alt10=1;
                        }


                        } finally {dbg.exitDecision(10);}

                        switch (alt10) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/lizhongguo/antlr/c.g:66:30: stat
                    	    {
                    	    dbg.location(66,30);
                    	    pushFollow(FOLLOW_stat_in_ifstat570);
                    	    stat46=stat();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stat.add(stat46.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(10);}

                    dbg.location(66,36);
                    char_literal47=(Token)match(input,50,FOLLOW_50_in_ifstat573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal47);


                    // AST REWRITE
                    // elements: stat, boolexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 67:2: -> ^( IF boolexpr ( stat )* )
                    {
                        dbg.location(67,5);
                        // /home/lizhongguo/antlr/c.g:67:5: ^( IF boolexpr ( stat )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(67,7);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(IF, "IF")
                        , root_1);

                        dbg.location(67,10);
                        adaptor.addChild(root_1, stream_boolexpr.nextTree());
                        dbg.location(67,19);
                        // /home/lizhongguo/antlr/c.g:67:19: ( stat )*
                        while ( stream_stat.hasNext() ) {
                            dbg.location(67,19);
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
        dbg.location(68, 1);

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
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whilestat"
    // /home/lizhongguo/antlr/c.g:70:1: whilestat options {backtrack=true; } : 'while' '(' boolexpr ')' '{' ( stat )* '}' -> ^( 'while' boolexpr ( stat )* ) ;
    public final cParser.whilestat_return whilestat() throws RecognitionException {
        cParser.whilestat_return retval = new cParser.whilestat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal48=null;
        Token char_literal49=null;
        Token char_literal51=null;
        Token char_literal52=null;
        Token char_literal54=null;
        cParser.boolexpr_return boolexpr50 =null;

        cParser.stat_return stat53 =null;


        CommonTree string_literal48_tree=null;
        CommonTree char_literal49_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree char_literal52_tree=null;
        CommonTree char_literal54_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
        RewriteRuleSubtreeStream stream_boolexpr=new RewriteRuleSubtreeStream(adaptor,"rule boolexpr");
        try { dbg.enterRule(getGrammarFileName(), "whilestat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 0);

        try {
            // /home/lizhongguo/antlr/c.g:71:2: ( 'while' '(' boolexpr ')' '{' ( stat )* '}' -> ^( 'while' boolexpr ( stat )* ) )
            dbg.enterAlt(1);

            // /home/lizhongguo/antlr/c.g:71:4: 'while' '(' boolexpr ')' '{' ( stat )* '}'
            {
            dbg.location(71,4);
            string_literal48=(Token)match(input,48,FOLLOW_48_in_whilestat607); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(string_literal48);

            dbg.location(71,12);
            char_literal49=(Token)match(input,28,FOLLOW_28_in_whilestat609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal49);

            dbg.location(71,16);
            pushFollow(FOLLOW_boolexpr_in_whilestat611);
            boolexpr50=boolexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_boolexpr.add(boolexpr50.getTree());
            dbg.location(71,25);
            char_literal51=(Token)match(input,29,FOLLOW_29_in_whilestat613); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal51);

            dbg.location(71,29);
            char_literal52=(Token)match(input,49,FOLLOW_49_in_whilestat615); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal52);

            dbg.location(71,33);
            // /home/lizhongguo/antlr/c.g:71:33: ( stat )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==ID||(LA12_0 >= 42 && LA12_0 <= 45)||(LA12_0 >= 47 && LA12_0 <= 48)) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lizhongguo/antlr/c.g:71:33: stat
            	    {
            	    dbg.location(71,33);
            	    pushFollow(FOLLOW_stat_in_whilestat617);
            	    stat53=stat();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stat.add(stat53.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}

            dbg.location(71,39);
            char_literal54=(Token)match(input,50,FOLLOW_50_in_whilestat620); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal54);


            // AST REWRITE
            // elements: 48, stat, boolexpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 72:2: -> ^( 'while' boolexpr ( stat )* )
            {
                dbg.location(72,5);
                // /home/lizhongguo/antlr/c.g:72:5: ^( 'while' boolexpr ( stat )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(72,7);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_48.nextNode()
                , root_1);

                dbg.location(72,15);
                adaptor.addChild(root_1, stream_boolexpr.nextTree());
                dbg.location(72,24);
                // /home/lizhongguo/antlr/c.g:72:24: ( stat )*
                while ( stream_stat.hasNext() ) {
                    dbg.location(72,24);
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
        dbg.location(73, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whilestat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "whilestat"


    public static class forstat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forstat"
    // /home/lizhongguo/antlr/c.g:75:1: forstat options {backtrack=true; } : 'for' '(' s1= givevalue ';' s2= boolexpr ';' s3= givevalue ')' '{' (s4= stat )* '}' -> ^( 'for' $s1 $s2 $s4 $s3) ;
    public final cParser.forstat_return forstat() throws RecognitionException {
        cParser.forstat_return retval = new cParser.forstat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal55=null;
        Token char_literal56=null;
        Token char_literal57=null;
        Token char_literal58=null;
        Token char_literal59=null;
        Token char_literal60=null;
        Token char_literal61=null;
        cParser.givevalue_return s1 =null;

        cParser.boolexpr_return s2 =null;

        cParser.givevalue_return s3 =null;

        cParser.stat_return s4 =null;


        CommonTree string_literal55_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree char_literal57_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree char_literal61_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
        RewriteRuleSubtreeStream stream_givevalue=new RewriteRuleSubtreeStream(adaptor,"rule givevalue");
        RewriteRuleSubtreeStream stream_boolexpr=new RewriteRuleSubtreeStream(adaptor,"rule boolexpr");
        try { dbg.enterRule(getGrammarFileName(), "forstat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 0);

        try {
            // /home/lizhongguo/antlr/c.g:76:2: ( 'for' '(' s1= givevalue ';' s2= boolexpr ';' s3= givevalue ')' '{' (s4= stat )* '}' -> ^( 'for' $s1 $s2 $s4 $s3) )
            dbg.enterAlt(1);

            // /home/lizhongguo/antlr/c.g:76:4: 'for' '(' s1= givevalue ';' s2= boolexpr ';' s3= givevalue ')' '{' (s4= stat )* '}'
            {
            dbg.location(76,4);
            string_literal55=(Token)match(input,43,FOLLOW_43_in_forstat654); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(string_literal55);

            dbg.location(76,10);
            char_literal56=(Token)match(input,28,FOLLOW_28_in_forstat656); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_28.add(char_literal56);

            dbg.location(76,16);
            pushFollow(FOLLOW_givevalue_in_forstat660);
            s1=givevalue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_givevalue.add(s1.getTree());
            dbg.location(76,27);
            char_literal57=(Token)match(input,END,FOLLOW_END_in_forstat662); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(char_literal57);

            dbg.location(76,33);
            pushFollow(FOLLOW_boolexpr_in_forstat666);
            s2=boolexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_boolexpr.add(s2.getTree());
            dbg.location(76,43);
            char_literal58=(Token)match(input,END,FOLLOW_END_in_forstat668); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(char_literal58);

            dbg.location(76,49);
            pushFollow(FOLLOW_givevalue_in_forstat672);
            s3=givevalue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_givevalue.add(s3.getTree());
            dbg.location(76,60);
            char_literal59=(Token)match(input,29,FOLLOW_29_in_forstat674); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal59);

            dbg.location(76,64);
            char_literal60=(Token)match(input,49,FOLLOW_49_in_forstat676); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal60);

            dbg.location(76,70);
            // /home/lizhongguo/antlr/c.g:76:70: (s4= stat )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==ID||(LA13_0 >= 42 && LA13_0 <= 45)||(LA13_0 >= 47 && LA13_0 <= 48)) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lizhongguo/antlr/c.g:76:70: s4= stat
            	    {
            	    dbg.location(76,70);
            	    pushFollow(FOLLOW_stat_in_forstat680);
            	    s4=stat();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stat.add(s4.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}

            dbg.location(76,77);
            char_literal61=(Token)match(input,50,FOLLOW_50_in_forstat683); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal61);


            // AST REWRITE
            // elements: s3, s1, 43, s4, s2
            // token labels: 
            // rule labels: s3, s4, s1, retval, s2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_s3=new RewriteRuleSubtreeStream(adaptor,"rule s3",s3!=null?s3.tree:null);
            RewriteRuleSubtreeStream stream_s4=new RewriteRuleSubtreeStream(adaptor,"rule s4",s4!=null?s4.tree:null);
            RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 77:2: -> ^( 'for' $s1 $s2 $s4 $s3)
            {
                dbg.location(77,5);
                // /home/lizhongguo/antlr/c.g:77:5: ^( 'for' $s1 $s2 $s4 $s3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(77,7);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_43.nextNode()
                , root_1);

                dbg.location(77,14);
                adaptor.addChild(root_1, stream_s1.nextTree());
                dbg.location(77,18);
                adaptor.addChild(root_1, stream_s2.nextTree());
                dbg.location(77,22);
                adaptor.addChild(root_1, stream_s4.nextTree());
                dbg.location(77,30);
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
        dbg.location(78, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forstat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "forstat"


    public static class declarefunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarefunc"
    // /home/lizhongguo/antlr/c.g:80:1: declarefunc : ( 'void' ID '(' ')' '{' ( stat )* '}' -> ^( FUNC1 ID ( stat )* ) | ( 'int' | 'float' ) ID '(' ')' '{' ( stat )* 'return' expr END '}' -> ^( FUNC2 ID ( stat )* expr ) | 'void' ID '(' ( num_type ID ) ( ',' ( num_type ID ) )* ')' '{' ( stat )* '}' -> ^( FUNC3 ID ( num_type ID )+ ( stat )* ) | ( 'int' | 'float' ) ID '(' ( num_type ID ) ( ',' ( num_type ID ) )* ')' '{' ( stat )* 'return' expr END '}' -> ^( FUNC4 ID ( num_type ID )+ ( stat )* expr ) );
    public final cParser.declarefunc_return declarefunc() throws RecognitionException {
        cParser.declarefunc_return retval = new cParser.declarefunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal62=null;
        Token ID63=null;
        Token char_literal64=null;
        Token char_literal65=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token string_literal69=null;
        Token string_literal70=null;
        Token ID71=null;
        Token char_literal72=null;
        Token char_literal73=null;
        Token char_literal74=null;
        Token string_literal76=null;
        Token END78=null;
        Token char_literal79=null;
        Token string_literal80=null;
        Token ID81=null;
        Token char_literal82=null;
        Token ID84=null;
        Token char_literal85=null;
        Token ID87=null;
        Token char_literal88=null;
        Token char_literal89=null;
        Token char_literal91=null;
        Token string_literal92=null;
        Token string_literal93=null;
        Token ID94=null;
        Token char_literal95=null;
        Token ID97=null;
        Token char_literal98=null;
        Token ID100=null;
        Token char_literal101=null;
        Token char_literal102=null;
        Token string_literal104=null;
        Token END106=null;
        Token char_literal107=null;
        cParser.stat_return stat67 =null;

        cParser.stat_return stat75 =null;

        cParser.expr_return expr77 =null;

        cParser.num_type_return num_type83 =null;

        cParser.num_type_return num_type86 =null;

        cParser.stat_return stat90 =null;

        cParser.num_type_return num_type96 =null;

        cParser.num_type_return num_type99 =null;

        cParser.stat_return stat103 =null;

        cParser.expr_return expr105 =null;


        CommonTree string_literal62_tree=null;
        CommonTree ID63_tree=null;
        CommonTree char_literal64_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree string_literal69_tree=null;
        CommonTree string_literal70_tree=null;
        CommonTree ID71_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree char_literal74_tree=null;
        CommonTree string_literal76_tree=null;
        CommonTree END78_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree string_literal80_tree=null;
        CommonTree ID81_tree=null;
        CommonTree char_literal82_tree=null;
        CommonTree ID84_tree=null;
        CommonTree char_literal85_tree=null;
        CommonTree ID87_tree=null;
        CommonTree char_literal88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree char_literal91_tree=null;
        CommonTree string_literal92_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree ID94_tree=null;
        CommonTree char_literal95_tree=null;
        CommonTree ID97_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree ID100_tree=null;
        CommonTree char_literal101_tree=null;
        CommonTree char_literal102_tree=null;
        CommonTree string_literal104_tree=null;
        CommonTree END106_tree=null;
        CommonTree char_literal107_tree=null;
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
        try { dbg.enterRule(getGrammarFileName(), "declarefunc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 0);

        try {
            // /home/lizhongguo/antlr/c.g:81:2: ( 'void' ID '(' ')' '{' ( stat )* '}' -> ^( FUNC1 ID ( stat )* ) | ( 'int' | 'float' ) ID '(' ')' '{' ( stat )* 'return' expr END '}' -> ^( FUNC2 ID ( stat )* expr ) | 'void' ID '(' ( num_type ID ) ( ',' ( num_type ID ) )* ')' '{' ( stat )* '}' -> ^( FUNC3 ID ( num_type ID )+ ( stat )* ) | ( 'int' | 'float' ) ID '(' ( num_type ID ) ( ',' ( num_type ID ) )* ')' '{' ( stat )* 'return' expr END '}' -> ^( FUNC4 ID ( num_type ID )+ ( stat )* expr ) )
            int alt22=4;
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

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
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 6, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 4, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

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
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 7, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 5, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

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
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 7, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 5, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lizhongguo/antlr/c.g:81:4: 'void' ID '(' ')' '{' ( stat )* '}'
                    {
                    dbg.location(81,4);
                    string_literal62=(Token)match(input,47,FOLLOW_47_in_declarefunc717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_47.add(string_literal62);

                    dbg.location(81,11);
                    ID63=(Token)match(input,ID,FOLLOW_ID_in_declarefunc719); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID63);

                    dbg.location(81,14);
                    char_literal64=(Token)match(input,28,FOLLOW_28_in_declarefunc721); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal64);

                    dbg.location(81,18);
                    char_literal65=(Token)match(input,29,FOLLOW_29_in_declarefunc723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal65);

                    dbg.location(81,22);
                    char_literal66=(Token)match(input,49,FOLLOW_49_in_declarefunc725); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal66);

                    dbg.location(81,26);
                    // /home/lizhongguo/antlr/c.g:81:26: ( stat )*
                    try { dbg.enterSubRule(14);

                    loop14:
                    do {
                        int alt14=2;
                        try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==ID||(LA14_0 >= 42 && LA14_0 <= 45)||(LA14_0 >= 47 && LA14_0 <= 48)) ) {
                            alt14=1;
                        }


                        } finally {dbg.exitDecision(14);}

                        switch (alt14) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/lizhongguo/antlr/c.g:81:26: stat
                    	    {
                    	    dbg.location(81,26);
                    	    pushFollow(FOLLOW_stat_in_declarefunc727);
                    	    stat67=stat();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stat.add(stat67.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(81,32);
                    char_literal68=(Token)match(input,50,FOLLOW_50_in_declarefunc730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal68);


                    // AST REWRITE
                    // elements: ID, stat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 81:36: -> ^( FUNC1 ID ( stat )* )
                    {
                        dbg.location(81,39);
                        // /home/lizhongguo/antlr/c.g:81:39: ^( FUNC1 ID ( stat )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(81,41);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNC1, "FUNC1")
                        , root_1);

                        dbg.location(81,47);
                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );
                        dbg.location(81,50);
                        // /home/lizhongguo/antlr/c.g:81:50: ( stat )*
                        while ( stream_stat.hasNext() ) {
                            dbg.location(81,50);
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
                    dbg.enterAlt(2);

                    // /home/lizhongguo/antlr/c.g:82:4: ( 'int' | 'float' ) ID '(' ')' '{' ( stat )* 'return' expr END '}'
                    {
                    dbg.location(82,4);
                    // /home/lizhongguo/antlr/c.g:82:4: ( 'int' | 'float' )
                    int alt15=2;
                    try { dbg.enterSubRule(15);
                    try { dbg.enterDecision(15, decisionCanBacktrack[15]);

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

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(15);}

                    switch (alt15) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/lizhongguo/antlr/c.g:82:5: 'int'
                            {
                            dbg.location(82,5);
                            string_literal69=(Token)match(input,45,FOLLOW_45_in_declarefunc747); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_45.add(string_literal69);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/lizhongguo/antlr/c.g:82:11: 'float'
                            {
                            dbg.location(82,11);
                            string_literal70=(Token)match(input,42,FOLLOW_42_in_declarefunc749); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_42.add(string_literal70);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(15);}

                    dbg.location(82,20);
                    ID71=(Token)match(input,ID,FOLLOW_ID_in_declarefunc752); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID71);

                    dbg.location(82,23);
                    char_literal72=(Token)match(input,28,FOLLOW_28_in_declarefunc754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal72);

                    dbg.location(82,27);
                    char_literal73=(Token)match(input,29,FOLLOW_29_in_declarefunc756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal73);

                    dbg.location(82,31);
                    char_literal74=(Token)match(input,49,FOLLOW_49_in_declarefunc758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal74);

                    dbg.location(82,35);
                    // /home/lizhongguo/antlr/c.g:82:35: ( stat )*
                    try { dbg.enterSubRule(16);

                    loop16:
                    do {
                        int alt16=2;
                        try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==ID||(LA16_0 >= 42 && LA16_0 <= 45)||(LA16_0 >= 47 && LA16_0 <= 48)) ) {
                            alt16=1;
                        }


                        } finally {dbg.exitDecision(16);}

                        switch (alt16) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/lizhongguo/antlr/c.g:82:35: stat
                    	    {
                    	    dbg.location(82,35);
                    	    pushFollow(FOLLOW_stat_in_declarefunc760);
                    	    stat75=stat();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stat.add(stat75.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(82,41);
                    string_literal76=(Token)match(input,46,FOLLOW_46_in_declarefunc763); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_46.add(string_literal76);

                    dbg.location(82,50);
                    pushFollow(FOLLOW_expr_in_declarefunc765);
                    expr77=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr77.getTree());
                    dbg.location(82,55);
                    END78=(Token)match(input,END,FOLLOW_END_in_declarefunc767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END78);

                    dbg.location(82,59);
                    char_literal79=(Token)match(input,50,FOLLOW_50_in_declarefunc769); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal79);


                    // AST REWRITE
                    // elements: ID, stat, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 82:63: -> ^( FUNC2 ID ( stat )* expr )
                    {
                        dbg.location(82,66);
                        // /home/lizhongguo/antlr/c.g:82:66: ^( FUNC2 ID ( stat )* expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(82,68);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNC2, "FUNC2")
                        , root_1);

                        dbg.location(82,74);
                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );
                        dbg.location(82,77);
                        // /home/lizhongguo/antlr/c.g:82:77: ( stat )*
                        while ( stream_stat.hasNext() ) {
                            dbg.location(82,77);
                            adaptor.addChild(root_1, stream_stat.nextTree());

                        }
                        stream_stat.reset();
                        dbg.location(82,83);
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lizhongguo/antlr/c.g:83:4: 'void' ID '(' ( num_type ID ) ( ',' ( num_type ID ) )* ')' '{' ( stat )* '}'
                    {
                    dbg.location(83,4);
                    string_literal80=(Token)match(input,47,FOLLOW_47_in_declarefunc787); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_47.add(string_literal80);

                    dbg.location(83,11);
                    ID81=(Token)match(input,ID,FOLLOW_ID_in_declarefunc789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID81);

                    dbg.location(83,14);
                    char_literal82=(Token)match(input,28,FOLLOW_28_in_declarefunc791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal82);

                    dbg.location(83,18);
                    // /home/lizhongguo/antlr/c.g:83:18: ( num_type ID )
                    dbg.enterAlt(1);

                    // /home/lizhongguo/antlr/c.g:83:19: num_type ID
                    {
                    dbg.location(83,19);
                    pushFollow(FOLLOW_num_type_in_declarefunc794);
                    num_type83=num_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_num_type.add(num_type83.getTree());
                    dbg.location(83,28);
                    ID84=(Token)match(input,ID,FOLLOW_ID_in_declarefunc796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID84);


                    }

                    dbg.location(83,32);
                    // /home/lizhongguo/antlr/c.g:83:32: ( ',' ( num_type ID ) )*
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==32) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/lizhongguo/antlr/c.g:83:33: ',' ( num_type ID )
                    	    {
                    	    dbg.location(83,33);
                    	    char_literal85=(Token)match(input,32,FOLLOW_32_in_declarefunc800); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_32.add(char_literal85);

                    	    dbg.location(83,37);
                    	    // /home/lizhongguo/antlr/c.g:83:37: ( num_type ID )
                    	    dbg.enterAlt(1);

                    	    // /home/lizhongguo/antlr/c.g:83:38: num_type ID
                    	    {
                    	    dbg.location(83,38);
                    	    pushFollow(FOLLOW_num_type_in_declarefunc803);
                    	    num_type86=num_type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_num_type.add(num_type86.getTree());
                    	    dbg.location(83,47);
                    	    ID87=(Token)match(input,ID,FOLLOW_ID_in_declarefunc805); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID87);


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(17);}

                    dbg.location(83,53);
                    char_literal88=(Token)match(input,29,FOLLOW_29_in_declarefunc810); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal88);

                    dbg.location(83,57);
                    char_literal89=(Token)match(input,49,FOLLOW_49_in_declarefunc812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal89);

                    dbg.location(83,61);
                    // /home/lizhongguo/antlr/c.g:83:61: ( stat )*
                    try { dbg.enterSubRule(18);

                    loop18:
                    do {
                        int alt18=2;
                        try { dbg.enterDecision(18, decisionCanBacktrack[18]);

                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==ID||(LA18_0 >= 42 && LA18_0 <= 45)||(LA18_0 >= 47 && LA18_0 <= 48)) ) {
                            alt18=1;
                        }


                        } finally {dbg.exitDecision(18);}

                        switch (alt18) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/lizhongguo/antlr/c.g:83:61: stat
                    	    {
                    	    dbg.location(83,61);
                    	    pushFollow(FOLLOW_stat_in_declarefunc814);
                    	    stat90=stat();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stat.add(stat90.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(18);}

                    dbg.location(83,67);
                    char_literal91=(Token)match(input,50,FOLLOW_50_in_declarefunc817); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal91);


                    // AST REWRITE
                    // elements: stat, num_type, ID, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:71: -> ^( FUNC3 ID ( num_type ID )+ ( stat )* )
                    {
                        dbg.location(84,3);
                        // /home/lizhongguo/antlr/c.g:84:3: ^( FUNC3 ID ( num_type ID )+ ( stat )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(84,5);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNC3, "FUNC3")
                        , root_1);

                        dbg.location(84,11);
                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );
                        dbg.location(84,14);
                        if ( !(stream_num_type.hasNext()||stream_ID.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_num_type.hasNext()||stream_ID.hasNext() ) {
                            dbg.location(84,15);
                            adaptor.addChild(root_1, stream_num_type.nextTree());
                            dbg.location(84,24);
                            adaptor.addChild(root_1, 
                            stream_ID.nextNode()
                            );

                        }
                        stream_num_type.reset();
                        stream_ID.reset();
                        dbg.location(84,29);
                        // /home/lizhongguo/antlr/c.g:84:29: ( stat )*
                        while ( stream_stat.hasNext() ) {
                            dbg.location(84,29);
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
                    dbg.enterAlt(4);

                    // /home/lizhongguo/antlr/c.g:85:4: ( 'int' | 'float' ) ID '(' ( num_type ID ) ( ',' ( num_type ID ) )* ')' '{' ( stat )* 'return' expr END '}'
                    {
                    dbg.location(85,4);
                    // /home/lizhongguo/antlr/c.g:85:4: ( 'int' | 'float' )
                    int alt19=2;
                    try { dbg.enterSubRule(19);
                    try { dbg.enterDecision(19, decisionCanBacktrack[19]);

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

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(19);}

                    switch (alt19) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/lizhongguo/antlr/c.g:85:5: 'int'
                            {
                            dbg.location(85,5);
                            string_literal92=(Token)match(input,45,FOLLOW_45_in_declarefunc843); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_45.add(string_literal92);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/lizhongguo/antlr/c.g:85:11: 'float'
                            {
                            dbg.location(85,11);
                            string_literal93=(Token)match(input,42,FOLLOW_42_in_declarefunc845); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_42.add(string_literal93);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(85,20);
                    ID94=(Token)match(input,ID,FOLLOW_ID_in_declarefunc848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID94);

                    dbg.location(85,23);
                    char_literal95=(Token)match(input,28,FOLLOW_28_in_declarefunc850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal95);

                    dbg.location(85,27);
                    // /home/lizhongguo/antlr/c.g:85:27: ( num_type ID )
                    dbg.enterAlt(1);

                    // /home/lizhongguo/antlr/c.g:85:28: num_type ID
                    {
                    dbg.location(85,28);
                    pushFollow(FOLLOW_num_type_in_declarefunc853);
                    num_type96=num_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_num_type.add(num_type96.getTree());
                    dbg.location(85,37);
                    ID97=(Token)match(input,ID,FOLLOW_ID_in_declarefunc855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID97);


                    }

                    dbg.location(85,41);
                    // /home/lizhongguo/antlr/c.g:85:41: ( ',' ( num_type ID ) )*
                    try { dbg.enterSubRule(20);

                    loop20:
                    do {
                        int alt20=2;
                        try { dbg.enterDecision(20, decisionCanBacktrack[20]);

                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==32) ) {
                            alt20=1;
                        }


                        } finally {dbg.exitDecision(20);}

                        switch (alt20) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/lizhongguo/antlr/c.g:85:42: ',' ( num_type ID )
                    	    {
                    	    dbg.location(85,42);
                    	    char_literal98=(Token)match(input,32,FOLLOW_32_in_declarefunc859); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_32.add(char_literal98);

                    	    dbg.location(85,46);
                    	    // /home/lizhongguo/antlr/c.g:85:46: ( num_type ID )
                    	    dbg.enterAlt(1);

                    	    // /home/lizhongguo/antlr/c.g:85:47: num_type ID
                    	    {
                    	    dbg.location(85,47);
                    	    pushFollow(FOLLOW_num_type_in_declarefunc862);
                    	    num_type99=num_type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_num_type.add(num_type99.getTree());
                    	    dbg.location(85,56);
                    	    ID100=(Token)match(input,ID,FOLLOW_ID_in_declarefunc864); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID100);


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(20);}

                    dbg.location(85,62);
                    char_literal101=(Token)match(input,29,FOLLOW_29_in_declarefunc869); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal101);

                    dbg.location(85,66);
                    char_literal102=(Token)match(input,49,FOLLOW_49_in_declarefunc871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal102);

                    dbg.location(85,70);
                    // /home/lizhongguo/antlr/c.g:85:70: ( stat )*
                    try { dbg.enterSubRule(21);

                    loop21:
                    do {
                        int alt21=2;
                        try { dbg.enterDecision(21, decisionCanBacktrack[21]);

                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==ID||(LA21_0 >= 42 && LA21_0 <= 45)||(LA21_0 >= 47 && LA21_0 <= 48)) ) {
                            alt21=1;
                        }


                        } finally {dbg.exitDecision(21);}

                        switch (alt21) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/lizhongguo/antlr/c.g:85:70: stat
                    	    {
                    	    dbg.location(85,70);
                    	    pushFollow(FOLLOW_stat_in_declarefunc873);
                    	    stat103=stat();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stat.add(stat103.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(21);}

                    dbg.location(85,76);
                    string_literal104=(Token)match(input,46,FOLLOW_46_in_declarefunc876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_46.add(string_literal104);

                    dbg.location(85,85);
                    pushFollow(FOLLOW_expr_in_declarefunc878);
                    expr105=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr105.getTree());
                    dbg.location(85,90);
                    END106=(Token)match(input,END,FOLLOW_END_in_declarefunc880); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END106);

                    dbg.location(85,94);
                    char_literal107=(Token)match(input,50,FOLLOW_50_in_declarefunc882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal107);


                    // AST REWRITE
                    // elements: expr, ID, num_type, stat, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 86:2: -> ^( FUNC4 ID ( num_type ID )+ ( stat )* expr )
                    {
                        dbg.location(86,5);
                        // /home/lizhongguo/antlr/c.g:86:5: ^( FUNC4 ID ( num_type ID )+ ( stat )* expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(86,7);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNC4, "FUNC4")
                        , root_1);

                        dbg.location(86,13);
                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );
                        dbg.location(86,16);
                        if ( !(stream_num_type.hasNext()||stream_ID.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_num_type.hasNext()||stream_ID.hasNext() ) {
                            dbg.location(86,17);
                            adaptor.addChild(root_1, stream_num_type.nextTree());
                            dbg.location(86,26);
                            adaptor.addChild(root_1, 
                            stream_ID.nextNode()
                            );

                        }
                        stream_num_type.reset();
                        stream_ID.reset();
                        dbg.location(86,31);
                        // /home/lizhongguo/antlr/c.g:86:31: ( stat )*
                        while ( stream_stat.hasNext() ) {
                            dbg.location(86,31);
                            adaptor.addChild(root_1, stream_stat.nextTree());

                        }
                        stream_stat.reset();
                        dbg.location(86,37);
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
        dbg.location(87, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declarefunc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declarefunc"


    public static class callfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callfunc"
    // /home/lizhongguo/antlr/c.g:89:1: callfunc : ( ID '(' ')' -> ^( CALL ID ) | ID '(' expr ( ',' expr )* ')' -> ^( CALL ID expr ( expr )* ) );
    public final cParser.callfunc_return callfunc() throws RecognitionException {
        cParser.callfunc_return retval = new cParser.callfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID108=null;
        Token char_literal109=null;
        Token char_literal110=null;
        Token ID111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        Token char_literal116=null;
        cParser.expr_return expr113 =null;

        cParser.expr_return expr115 =null;


        CommonTree ID108_tree=null;
        CommonTree char_literal109_tree=null;
        CommonTree char_literal110_tree=null;
        CommonTree ID111_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree char_literal114_tree=null;
        CommonTree char_literal116_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "callfunc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 0);

        try {
            // /home/lizhongguo/antlr/c.g:89:10: ( ID '(' ')' -> ^( CALL ID ) | ID '(' expr ( ',' expr )* ')' -> ^( CALL ID expr ( expr )* ) )
            int alt24=2;
            try { dbg.enterDecision(24, decisionCanBacktrack[24]);

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
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lizhongguo/antlr/c.g:89:12: ID '(' ')'
                    {
                    dbg.location(89,12);
                    ID108=(Token)match(input,ID,FOLLOW_ID_in_callfunc915); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID108);

                    dbg.location(89,15);
                    char_literal109=(Token)match(input,28,FOLLOW_28_in_callfunc917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal109);

                    dbg.location(89,19);
                    char_literal110=(Token)match(input,29,FOLLOW_29_in_callfunc919); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal110);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 89:23: -> ^( CALL ID )
                    {
                        dbg.location(89,26);
                        // /home/lizhongguo/antlr/c.g:89:26: ^( CALL ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(89,28);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CALL, "CALL")
                        , root_1);

                        dbg.location(89,33);
                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lizhongguo/antlr/c.g:90:4: ID '(' expr ( ',' expr )* ')'
                    {
                    dbg.location(90,4);
                    ID111=(Token)match(input,ID,FOLLOW_ID_in_callfunc932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID111);

                    dbg.location(90,7);
                    char_literal112=(Token)match(input,28,FOLLOW_28_in_callfunc934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal112);

                    dbg.location(90,11);
                    pushFollow(FOLLOW_expr_in_callfunc936);
                    expr113=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr113.getTree());
                    dbg.location(90,16);
                    // /home/lizhongguo/antlr/c.g:90:16: ( ',' expr )*
                    try { dbg.enterSubRule(23);

                    loop23:
                    do {
                        int alt23=2;
                        try { dbg.enterDecision(23, decisionCanBacktrack[23]);

                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==32) ) {
                            alt23=1;
                        }


                        } finally {dbg.exitDecision(23);}

                        switch (alt23) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/lizhongguo/antlr/c.g:90:17: ',' expr
                    	    {
                    	    dbg.location(90,17);
                    	    char_literal114=(Token)match(input,32,FOLLOW_32_in_callfunc939); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_32.add(char_literal114);

                    	    dbg.location(90,21);
                    	    pushFollow(FOLLOW_expr_in_callfunc941);
                    	    expr115=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr115.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(23);}

                    dbg.location(90,28);
                    char_literal116=(Token)match(input,29,FOLLOW_29_in_callfunc945); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal116);


                    // AST REWRITE
                    // elements: expr, ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 90:32: -> ^( CALL ID expr ( expr )* )
                    {
                        dbg.location(90,35);
                        // /home/lizhongguo/antlr/c.g:90:35: ^( CALL ID expr ( expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(90,37);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CALL, "CALL")
                        , root_1);

                        dbg.location(90,42);
                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );
                        dbg.location(90,45);
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        dbg.location(90,50);
                        // /home/lizhongguo/antlr/c.g:90:50: ( expr )*
                        while ( stream_expr.hasNext() ) {
                            dbg.location(90,51);
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
        dbg.location(91, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "callfunc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "callfunc"


    public static class stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // /home/lizhongguo/antlr/c.g:93:1: stat : ( declarevar END -> ^( DECLAREVAR declarevar ) | givevalue END -> ^( GIVEVALUE givevalue ) | ifstat -> ^( IFSTAT ifstat ) | forstat -> ^( FORSTAT forstat ) | whilestat -> ^( WHILESTAT whilestat ) | declarefunc -> ^( DECLAREFUNC declarefunc ) | callfunc END -> ^( CALLFUNC callfunc ) );
    public final cParser.stat_return stat() throws RecognitionException {
        cParser.stat_return retval = new cParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token END118=null;
        Token END120=null;
        Token END126=null;
        cParser.declarevar_return declarevar117 =null;

        cParser.givevalue_return givevalue119 =null;

        cParser.ifstat_return ifstat121 =null;

        cParser.forstat_return forstat122 =null;

        cParser.whilestat_return whilestat123 =null;

        cParser.declarefunc_return declarefunc124 =null;

        cParser.callfunc_return callfunc125 =null;


        CommonTree END118_tree=null;
        CommonTree END120_tree=null;
        CommonTree END126_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_ifstat=new RewriteRuleSubtreeStream(adaptor,"rule ifstat");
        RewriteRuleSubtreeStream stream_declarefunc=new RewriteRuleSubtreeStream(adaptor,"rule declarefunc");
        RewriteRuleSubtreeStream stream_givevalue=new RewriteRuleSubtreeStream(adaptor,"rule givevalue");
        RewriteRuleSubtreeStream stream_declarevar=new RewriteRuleSubtreeStream(adaptor,"rule declarevar");
        RewriteRuleSubtreeStream stream_callfunc=new RewriteRuleSubtreeStream(adaptor,"rule callfunc");
        RewriteRuleSubtreeStream stream_whilestat=new RewriteRuleSubtreeStream(adaptor,"rule whilestat");
        RewriteRuleSubtreeStream stream_forstat=new RewriteRuleSubtreeStream(adaptor,"rule forstat");
        try { dbg.enterRule(getGrammarFileName(), "stat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 0);

        try {
            // /home/lizhongguo/antlr/c.g:93:6: ( declarevar END -> ^( DECLAREVAR declarevar ) | givevalue END -> ^( GIVEVALUE givevalue ) | ifstat -> ^( IFSTAT ifstat ) | forstat -> ^( FORSTAT forstat ) | whilestat -> ^( WHILESTAT whilestat ) | declarefunc -> ^( DECLAREFUNC declarefunc ) | callfunc END -> ^( CALLFUNC callfunc ) )
            int alt25=7;
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

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
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 8, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

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
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 9, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

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
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lizhongguo/antlr/c.g:93:8: declarevar END
                    {
                    dbg.location(93,8);
                    pushFollow(FOLLOW_declarevar_in_stat970);
                    declarevar117=declarevar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarevar.add(declarevar117.getTree());
                    dbg.location(93,19);
                    END118=(Token)match(input,END,FOLLOW_END_in_stat972); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END118);


                    // AST REWRITE
                    // elements: declarevar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 93:23: -> ^( DECLAREVAR declarevar )
                    {
                        dbg.location(93,26);
                        // /home/lizhongguo/antlr/c.g:93:26: ^( DECLAREVAR declarevar )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(93,28);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(DECLAREVAR, "DECLAREVAR")
                        , root_1);

                        dbg.location(93,39);
                        adaptor.addChild(root_1, stream_declarevar.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lizhongguo/antlr/c.g:94:4: givevalue END
                    {
                    dbg.location(94,4);
                    pushFollow(FOLLOW_givevalue_in_stat985);
                    givevalue119=givevalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_givevalue.add(givevalue119.getTree());
                    dbg.location(94,14);
                    END120=(Token)match(input,END,FOLLOW_END_in_stat987); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END120);


                    // AST REWRITE
                    // elements: givevalue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 94:17: -> ^( GIVEVALUE givevalue )
                    {
                        dbg.location(94,20);
                        // /home/lizhongguo/antlr/c.g:94:20: ^( GIVEVALUE givevalue )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(94,22);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(GIVEVALUE, "GIVEVALUE")
                        , root_1);

                        dbg.location(94,32);
                        adaptor.addChild(root_1, stream_givevalue.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/lizhongguo/antlr/c.g:95:4: ifstat
                    {
                    dbg.location(95,4);
                    pushFollow(FOLLOW_ifstat_in_stat999);
                    ifstat121=ifstat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifstat.add(ifstat121.getTree());

                    // AST REWRITE
                    // elements: ifstat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 95:11: -> ^( IFSTAT ifstat )
                    {
                        dbg.location(95,14);
                        // /home/lizhongguo/antlr/c.g:95:14: ^( IFSTAT ifstat )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(95,16);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(IFSTAT, "IFSTAT")
                        , root_1);

                        dbg.location(95,23);
                        adaptor.addChild(root_1, stream_ifstat.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/lizhongguo/antlr/c.g:96:4: forstat
                    {
                    dbg.location(96,4);
                    pushFollow(FOLLOW_forstat_in_stat1012);
                    forstat122=forstat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_forstat.add(forstat122.getTree());

                    // AST REWRITE
                    // elements: forstat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 96:12: -> ^( FORSTAT forstat )
                    {
                        dbg.location(96,15);
                        // /home/lizhongguo/antlr/c.g:96:15: ^( FORSTAT forstat )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(96,17);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FORSTAT, "FORSTAT")
                        , root_1);

                        dbg.location(96,25);
                        adaptor.addChild(root_1, stream_forstat.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/lizhongguo/antlr/c.g:97:4: whilestat
                    {
                    dbg.location(97,4);
                    pushFollow(FOLLOW_whilestat_in_stat1025);
                    whilestat123=whilestat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_whilestat.add(whilestat123.getTree());

                    // AST REWRITE
                    // elements: whilestat
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 97:14: -> ^( WHILESTAT whilestat )
                    {
                        dbg.location(97,17);
                        // /home/lizhongguo/antlr/c.g:97:17: ^( WHILESTAT whilestat )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(97,19);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(WHILESTAT, "WHILESTAT")
                        , root_1);

                        dbg.location(97,29);
                        adaptor.addChild(root_1, stream_whilestat.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/lizhongguo/antlr/c.g:98:4: declarefunc
                    {
                    dbg.location(98,4);
                    pushFollow(FOLLOW_declarefunc_in_stat1038);
                    declarefunc124=declarefunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declarefunc.add(declarefunc124.getTree());

                    // AST REWRITE
                    // elements: declarefunc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 98:16: -> ^( DECLAREFUNC declarefunc )
                    {
                        dbg.location(98,19);
                        // /home/lizhongguo/antlr/c.g:98:19: ^( DECLAREFUNC declarefunc )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(98,21);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(DECLAREFUNC, "DECLAREFUNC")
                        , root_1);

                        dbg.location(98,33);
                        adaptor.addChild(root_1, stream_declarefunc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/lizhongguo/antlr/c.g:99:4: callfunc END
                    {
                    dbg.location(99,4);
                    pushFollow(FOLLOW_callfunc_in_stat1051);
                    callfunc125=callfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_callfunc.add(callfunc125.getTree());
                    dbg.location(99,13);
                    END126=(Token)match(input,END,FOLLOW_END_in_stat1053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END126);


                    // AST REWRITE
                    // elements: callfunc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 99:17: -> ^( CALLFUNC callfunc )
                    {
                        dbg.location(99,20);
                        // /home/lizhongguo/antlr/c.g:99:20: ^( CALLFUNC callfunc )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(99,22);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CALLFUNC, "CALLFUNC")
                        , root_1);

                        dbg.location(99,31);
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
        dbg.location(100, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stat"


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/lizhongguo/antlr/c.g:102:1: prog : ( stat )* -> ^( PROG ( stat )* ) ;
    public final cParser.prog_return prog() throws RecognitionException {
        cParser.prog_return retval = new cParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        cParser.stat_return stat127 =null;


        RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 0);

        try {
            // /home/lizhongguo/antlr/c.g:102:6: ( ( stat )* -> ^( PROG ( stat )* ) )
            dbg.enterAlt(1);

            // /home/lizhongguo/antlr/c.g:102:8: ( stat )*
            {
            dbg.location(102,8);
            // /home/lizhongguo/antlr/c.g:102:8: ( stat )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26, decisionCanBacktrack[26]);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==ID||(LA26_0 >= 42 && LA26_0 <= 45)||(LA26_0 >= 47 && LA26_0 <= 48)) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/lizhongguo/antlr/c.g:102:8: stat
            	    {
            	    dbg.location(102,8);
            	    pushFollow(FOLLOW_stat_in_prog1071);
            	    stat127=stat();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stat.add(stat127.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}


            // AST REWRITE
            // elements: stat
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 102:14: -> ^( PROG ( stat )* )
            {
                dbg.location(102,17);
                // /home/lizhongguo/antlr/c.g:102:17: ^( PROG ( stat )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(102,19);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PROG, "PROG")
                , root_1);

                dbg.location(102,24);
                // /home/lizhongguo/antlr/c.g:102:24: ( stat )*
                while ( stream_stat.hasNext() ) {
                    dbg.location(102,24);
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
        dbg.location(103, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"

    // $ANTLR start synpred1_c
    public final void synpred1_c_fragment() throws RecognitionException {
        cParser.stat_return s1 =null;

        cParser.stat_return s2 =null;


        // /home/lizhongguo/antlr/c.g:64:4: ( 'if' '(' boolexpr ')' '{' (s1= stat )* '}' 'else' '{' (s2= stat )* '}' )
        dbg.enterAlt(1);

        // /home/lizhongguo/antlr/c.g:64:4: 'if' '(' boolexpr ')' '{' (s1= stat )* '}' 'else' '{' (s2= stat )* '}'
        {
        dbg.location(64,4);
        match(input,44,FOLLOW_44_in_synpred1_c512); if (state.failed) return ;
        dbg.location(64,9);
        match(input,28,FOLLOW_28_in_synpred1_c514); if (state.failed) return ;
        dbg.location(64,13);
        pushFollow(FOLLOW_boolexpr_in_synpred1_c516);
        boolexpr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(64,22);
        match(input,29,FOLLOW_29_in_synpred1_c518); if (state.failed) return ;
        dbg.location(64,26);
        match(input,49,FOLLOW_49_in_synpred1_c520); if (state.failed) return ;
        dbg.location(64,32);
        // /home/lizhongguo/antlr/c.g:64:32: (s1= stat )*
        try { dbg.enterSubRule(27);

        loop27:
        do {
            int alt27=2;
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID||(LA27_0 >= 42 && LA27_0 <= 45)||(LA27_0 >= 47 && LA27_0 <= 48)) ) {
                alt27=1;
            }


            } finally {dbg.exitDecision(27);}

            switch (alt27) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // /home/lizhongguo/antlr/c.g:64:32: s1= stat
        	    {
        	    dbg.location(64,32);
        	    pushFollow(FOLLOW_stat_in_synpred1_c524);
        	    s1=stat();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop27;
            }
        } while (true);
        } finally {dbg.exitSubRule(27);}

        dbg.location(64,39);
        match(input,50,FOLLOW_50_in_synpred1_c527); if (state.failed) return ;
        dbg.location(64,43);
        match(input,41,FOLLOW_41_in_synpred1_c529); if (state.failed) return ;
        dbg.location(64,50);
        match(input,49,FOLLOW_49_in_synpred1_c531); if (state.failed) return ;
        dbg.location(64,56);
        // /home/lizhongguo/antlr/c.g:64:56: (s2= stat )*
        try { dbg.enterSubRule(28);

        loop28:
        do {
            int alt28=2;
            try { dbg.enterDecision(28, decisionCanBacktrack[28]);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID||(LA28_0 >= 42 && LA28_0 <= 45)||(LA28_0 >= 47 && LA28_0 <= 48)) ) {
                alt28=1;
            }


            } finally {dbg.exitDecision(28);}

            switch (alt28) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // /home/lizhongguo/antlr/c.g:64:56: s2= stat
        	    {
        	    dbg.location(64,56);
        	    pushFollow(FOLLOW_stat_in_synpred1_c535);
        	    s2=stat();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop28;
            }
        } while (true);
        } finally {dbg.exitSubRule(28);}

        dbg.location(64,63);
        match(input,50,FOLLOW_50_in_synpred1_c538); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_c

    // Delegated rules

    public final boolean synpred1_c() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_c_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_expr_in_boolexpr328 = new BitSet(new long[]{0x000001D808000000L});
    public static final BitSet FOLLOW_38_in_boolexpr331 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_27_in_boolexpr334 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_39_in_boolexpr337 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_35_in_boolexpr340 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_40_in_boolexpr343 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_36_in_boolexpr346 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_expr_in_boolexpr350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multexpr_in_expr359 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_31_in_expr363 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_33_in_expr368 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_multexpr_in_expr372 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_atom_in_multexpr383 = new BitSet(new long[]{0x0000000440000002L});
    public static final BitSet FOLLOW_30_in_multexpr387 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_34_in_multexpr390 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_atom_in_multexpr394 = new BitSet(new long[]{0x0000000440000002L});
    public static final BitSet FOLLOW_28_in_atom405 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_expr_in_atom407 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_atom409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_in_atom429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callfunc_in_atom439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_declarevar450 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_declarevar453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_declarevar458 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_declarevar461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_givevalue474 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_givevalue477 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_expr_in_givevalue479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ifstat512 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ifstat514 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_boolexpr_in_ifstat516 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ifstat518 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ifstat520 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_stat_in_ifstat524 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_50_in_ifstat527 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ifstat529 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ifstat531 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_stat_in_ifstat535 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_50_in_ifstat538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ifstat560 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ifstat562 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_boolexpr_in_ifstat564 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ifstat566 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ifstat568 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_stat_in_ifstat570 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_50_in_ifstat573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_whilestat607 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_whilestat609 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_boolexpr_in_whilestat611 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_whilestat613 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_whilestat615 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_stat_in_whilestat617 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_50_in_whilestat620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_forstat654 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_forstat656 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_givevalue_in_forstat660 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_END_in_forstat662 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_boolexpr_in_forstat666 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_END_in_forstat668 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_givevalue_in_forstat672 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_forstat674 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_forstat676 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_stat_in_forstat680 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_50_in_forstat683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_declarefunc717 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_declarefunc719 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_declarefunc721 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_declarefunc723 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_declarefunc725 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_stat_in_declarefunc727 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_50_in_declarefunc730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_declarefunc747 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_42_in_declarefunc749 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_declarefunc752 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_declarefunc754 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_declarefunc756 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_declarefunc758 = new BitSet(new long[]{0x0001FC0000080000L});
    public static final BitSet FOLLOW_stat_in_declarefunc760 = new BitSet(new long[]{0x0001FC0000080000L});
    public static final BitSet FOLLOW_46_in_declarefunc763 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_expr_in_declarefunc765 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_END_in_declarefunc767 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_declarefunc769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_declarefunc787 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_declarefunc789 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_declarefunc791 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_num_type_in_declarefunc794 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_declarefunc796 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_32_in_declarefunc800 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_num_type_in_declarefunc803 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_declarefunc805 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_29_in_declarefunc810 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_declarefunc812 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_stat_in_declarefunc814 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_50_in_declarefunc817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_declarefunc843 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_42_in_declarefunc845 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_declarefunc848 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_declarefunc850 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_num_type_in_declarefunc853 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_declarefunc855 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_32_in_declarefunc859 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_num_type_in_declarefunc862 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ID_in_declarefunc864 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_29_in_declarefunc869 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_declarefunc871 = new BitSet(new long[]{0x0001FC0000080000L});
    public static final BitSet FOLLOW_stat_in_declarefunc873 = new BitSet(new long[]{0x0001FC0000080000L});
    public static final BitSet FOLLOW_46_in_declarefunc876 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_expr_in_declarefunc878 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_END_in_declarefunc880 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_declarefunc882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callfunc915 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_callfunc917 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_callfunc919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_callfunc932 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_callfunc934 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_expr_in_callfunc936 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_32_in_callfunc939 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_expr_in_callfunc941 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_29_in_callfunc945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarevar_in_stat970 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_END_in_stat972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_givevalue_in_stat985 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_END_in_stat987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstat_in_stat999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstat_in_stat1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestat_in_stat1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarefunc_in_stat1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callfunc_in_stat1051 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_END_in_stat1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_prog1071 = new BitSet(new long[]{0x0001BC0000080002L});
    public static final BitSet FOLLOW_44_in_synpred1_c512 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred1_c514 = new BitSet(new long[]{0x0000000010481000L});
    public static final BitSet FOLLOW_boolexpr_in_synpred1_c516 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred1_c518 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred1_c520 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_stat_in_synpred1_c524 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_50_in_synpred1_c527 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred1_c529 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred1_c531 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_stat_in_synpred1_c535 = new BitSet(new long[]{0x0005BC0000080000L});
    public static final BitSet FOLLOW_50_in_synpred1_c538 = new BitSet(new long[]{0x0000000000000002L});

}