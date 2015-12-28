// $ANTLR 3.4 /home/lizhongguo/antlr/cTree.g 2015-11-26 02:13:22

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class cTree extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALLFUNC", "COMMENT", "DECLAREFUNC", "DECLAREVAR", "END", "EXPONENT", "FLOAT", "FORSTAT", "GIVEVALUE", "ID", "IFSTAT", "INT", "PROG", "STAT", "WHILESTAT", "WS", "'!='", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'else'", "'float'", "'for'", "'if'", "'int'", "'return'", "'void'", "'while'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
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
    public static final int CALLFUNC=4;
    public static final int COMMENT=5;
    public static final int DECLAREFUNC=6;
    public static final int DECLAREVAR=7;
    public static final int END=8;
    public static final int EXPONENT=9;
    public static final int FLOAT=10;
    public static final int FORSTAT=11;
    public static final int GIVEVALUE=12;
    public static final int ID=13;
    public static final int IFSTAT=14;
    public static final int INT=15;
    public static final int PROG=16;
    public static final int STAT=17;
    public static final int WHILESTAT=18;
    public static final int WS=19;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "prog", "declarevar", "stat"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public cTree(TreeNodeStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public cTree(TreeNodeStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, input.getTreeAdaptor());

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public cTree(TreeNodeStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
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
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return cTree.tokenNames; }
    public String getGrammarFileName() { return "/home/lizhongguo/antlr/cTree.g"; }


    int a=0;


    public static class prog_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "prog"
    // /home/lizhongguo/antlr/cTree.g:13:1: prog : ^( PROG ( stat )* ) ;
    public final cTree.prog_return prog() throws RecognitionException {
        cTree.prog_return retval = new cTree.prog_return();
        retval.start = input.LT(1);


        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // /home/lizhongguo/antlr/cTree.g:13:6: ( ^( PROG ( stat )* ) )
            dbg.enterAlt(1);

            // /home/lizhongguo/antlr/cTree.g:13:8: ^( PROG ( stat )* )
            {
            dbg.location(13,8);
            dbg.location(13,10);
            match(input,PROG,FOLLOW_PROG_in_prog38); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                dbg.location(13,15);
                // /home/lizhongguo/antlr/cTree.g:13:15: ( stat )*
                try { dbg.enterSubRule(1);

                loop1:
                do {
                    int alt1=2;
                    try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DECLAREVAR) ) {
                        alt1=1;
                    }


                    } finally {dbg.exitDecision(1);}

                    switch (alt1) {
                	case 1 :
                	    dbg.enterAlt(1);

                	    // /home/lizhongguo/antlr/cTree.g:13:15: stat
                	    {
                	    dbg.location(13,15);
                	    pushFollow(FOLLOW_stat_in_prog40);
                	    stat();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);
                } finally {dbg.exitSubRule(1);}


                match(input, Token.UP, null); 
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
        dbg.location(14, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"


    public static class stat_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "stat"
    // /home/lizhongguo/antlr/cTree.g:16:1: stat : ^( DECLAREVAR declarevar ) ;
    public final cTree.stat_return stat() throws RecognitionException {
        cTree.stat_return retval = new cTree.stat_return();
        retval.start = input.LT(1);


        try { dbg.enterRule(getGrammarFileName(), "stat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 0);

        try {
            // /home/lizhongguo/antlr/cTree.g:16:6: ( ^( DECLAREVAR declarevar ) )
            dbg.enterAlt(1);

            // /home/lizhongguo/antlr/cTree.g:16:8: ^( DECLAREVAR declarevar )
            {
            dbg.location(16,8);
            dbg.location(16,10);
            match(input,DECLAREVAR,FOLLOW_DECLAREVAR_in_stat54); 

            match(input, Token.DOWN, null); 
            dbg.location(16,21);
            pushFollow(FOLLOW_declarevar_in_stat56);
            declarevar();

            state._fsp--;


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
        dbg.location(17, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stat"


    public static class declarevar_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "declarevar"
    // /home/lizhongguo/antlr/cTree.g:19:1: declarevar : ( ^( 'int' ID ) | ^( 'float' ID ) );
    public final cTree.declarevar_return declarevar() throws RecognitionException {
        cTree.declarevar_return retval = new cTree.declarevar_return();
        retval.start = input.LT(1);


        try { dbg.enterRule(getGrammarFileName(), "declarevar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // /home/lizhongguo/antlr/cTree.g:19:12: ( ^( 'int' ID ) | ^( 'float' ID ) )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==38) ) {
                alt2=1;
            }
            else if ( (LA2_0==35) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/lizhongguo/antlr/cTree.g:19:14: ^( 'int' ID )
                    {
                    dbg.location(19,14);
                    dbg.location(19,16);
                    match(input,38,FOLLOW_38_in_declarevar69); 

                    match(input, Token.DOWN, null); 
                    dbg.location(19,22);
                    match(input,ID,FOLLOW_ID_in_declarevar71); 

                    match(input, Token.UP, null); 

                    dbg.location(19,25);
                    System.out.println(ID+"\n");

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/lizhongguo/antlr/cTree.g:20:4: ^( 'float' ID )
                    {
                    dbg.location(20,4);
                    dbg.location(20,6);
                    match(input,35,FOLLOW_35_in_declarevar79); 

                    match(input, Token.DOWN, null); 
                    dbg.location(20,14);
                    match(input,ID,FOLLOW_ID_in_declarevar81); 

                    match(input, Token.UP, null); 

                    dbg.location(20,17);
                    System.out.println(ID+"\n");

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
        dbg.location(21, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declarevar");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declarevar"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROG_in_prog38 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stat_in_prog40 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_DECLAREVAR_in_stat54 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declarevar_in_stat56 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_38_in_declarevar69 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declarevar71 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_35_in_declarevar79 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declarevar81 = new BitSet(new long[]{0x0000000000000008L});

}