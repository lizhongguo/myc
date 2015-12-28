// $ANTLR 3.5.2 c.g 2015-12-24 14:21:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class cLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public cLexer() {} 
	public cLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public cLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "c.g"; }

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:2:7: ( '!=' )
			// c.g:2:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:3:7: ( '(' )
			// c.g:3:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:4:7: ( ')' )
			// c.g:4:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:5:7: ( '*' )
			// c.g:5:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:6:7: ( '+' )
			// c.g:6:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:7:7: ( ',' )
			// c.g:7:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:8:7: ( '-' )
			// c.g:8:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:9:7: ( '/' )
			// c.g:9:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:10:7: ( '<' )
			// c.g:10:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:11:7: ( '<=' )
			// c.g:11:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:12:7: ( '=' )
			// c.g:12:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:13:7: ( '==' )
			// c.g:13:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:14:7: ( '>' )
			// c.g:14:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:15:7: ( '>=' )
			// c.g:15:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:16:7: ( 'else' )
			// c.g:16:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:17:7: ( 'float' )
			// c.g:17:9: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:18:7: ( 'for' )
			// c.g:18:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:19:7: ( 'if' )
			// c.g:19:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:20:7: ( 'int' )
			// c.g:20:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:21:7: ( 'return' )
			// c.g:21:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:22:7: ( 'void' )
			// c.g:22:9: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:23:7: ( 'while' )
			// c.g:23:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:24:7: ( '{' )
			// c.g:24:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:25:7: ( '}' )
			// c.g:25:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:12:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// c.g:12:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// c.g:12:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// c.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:15:5: ( ( '0' .. '9' )+ )
			// c.g:15:7: ( '0' .. '9' )+
			{
			// c.g:15:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// c.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:19:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// c.g:19:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// c.g:19:9: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// c.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// c.g:19:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// c.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					// c.g:19:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// c.g:19:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// c.g:20:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// c.g:20:13: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// c.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// c.g:20:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// c.g:20:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// c.g:21:9: ( '0' .. '9' )+ EXPONENT
					{
					// c.g:21:9: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// c.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:33:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='/') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='/') ) {
					alt13=1;
				}
				else if ( (LA13_1=='*') ) {
					alt13=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// c.g:33:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// c.g:33:14: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// c.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop10;
						}
					}

					// c.g:33:28: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// c.g:33:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// c.g:34:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// c.g:34:14: ( options {greedy=false; } : . )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='*') ) {
							int LA12_1 = input.LA(2);
							if ( (LA12_1=='/') ) {
								alt12=2;
							}
							else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
								alt12=1;
							}

						}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// c.g:34:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop12;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:37:5: ( ( '\\r' | '\\n' | ' ' | '\\t' )+ )
			// c.g:37:9: ( '\\r' | '\\n' | ' ' | '\\t' )+
			{
			// c.g:37:9: ( '\\r' | '\\n' | ' ' | '\\t' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\t' && LA14_0 <= '\n')||LA14_0=='\r'||LA14_0==' ') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// c.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// c.g:38:5: ( ';' )
			// c.g:38:7: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// c.g:108:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// c.g:108:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// c.g:108:22: ( '+' | '-' )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='+'||LA15_0=='-') ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// c.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// c.g:108:33: ( '0' .. '9' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// c.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	@Override
	public void mTokens() throws RecognitionException {
		// c.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | ID | INT | FLOAT | COMMENT | WS | END )
		int alt17=30;
		alt17 = dfa17.predict(input);
		switch (alt17) {
			case 1 :
				// c.g:1:10: T__27
				{
				mT__27(); 

				}
				break;
			case 2 :
				// c.g:1:16: T__28
				{
				mT__28(); 

				}
				break;
			case 3 :
				// c.g:1:22: T__29
				{
				mT__29(); 

				}
				break;
			case 4 :
				// c.g:1:28: T__30
				{
				mT__30(); 

				}
				break;
			case 5 :
				// c.g:1:34: T__31
				{
				mT__31(); 

				}
				break;
			case 6 :
				// c.g:1:40: T__32
				{
				mT__32(); 

				}
				break;
			case 7 :
				// c.g:1:46: T__33
				{
				mT__33(); 

				}
				break;
			case 8 :
				// c.g:1:52: T__34
				{
				mT__34(); 

				}
				break;
			case 9 :
				// c.g:1:58: T__35
				{
				mT__35(); 

				}
				break;
			case 10 :
				// c.g:1:64: T__36
				{
				mT__36(); 

				}
				break;
			case 11 :
				// c.g:1:70: T__37
				{
				mT__37(); 

				}
				break;
			case 12 :
				// c.g:1:76: T__38
				{
				mT__38(); 

				}
				break;
			case 13 :
				// c.g:1:82: T__39
				{
				mT__39(); 

				}
				break;
			case 14 :
				// c.g:1:88: T__40
				{
				mT__40(); 

				}
				break;
			case 15 :
				// c.g:1:94: T__41
				{
				mT__41(); 

				}
				break;
			case 16 :
				// c.g:1:100: T__42
				{
				mT__42(); 

				}
				break;
			case 17 :
				// c.g:1:106: T__43
				{
				mT__43(); 

				}
				break;
			case 18 :
				// c.g:1:112: T__44
				{
				mT__44(); 

				}
				break;
			case 19 :
				// c.g:1:118: T__45
				{
				mT__45(); 

				}
				break;
			case 20 :
				// c.g:1:124: T__46
				{
				mT__46(); 

				}
				break;
			case 21 :
				// c.g:1:130: T__47
				{
				mT__47(); 

				}
				break;
			case 22 :
				// c.g:1:136: T__48
				{
				mT__48(); 

				}
				break;
			case 23 :
				// c.g:1:142: T__49
				{
				mT__49(); 

				}
				break;
			case 24 :
				// c.g:1:148: T__50
				{
				mT__50(); 

				}
				break;
			case 25 :
				// c.g:1:154: ID
				{
				mID(); 

				}
				break;
			case 26 :
				// c.g:1:157: INT
				{
				mINT(); 

				}
				break;
			case 27 :
				// c.g:1:161: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 28 :
				// c.g:1:167: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 29 :
				// c.g:1:175: WS
				{
				mWS(); 

				}
				break;
			case 30 :
				// c.g:1:178: END
				{
				mEND(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "18:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA17_eotS =
		"\10\uffff\1\32\1\34\1\36\1\40\6\24\3\uffff\1\51\13\uffff\3\24\1\55\4\24"+
		"\1\uffff\2\24\1\64\1\uffff\1\65\3\24\1\71\1\24\2\uffff\1\24\1\74\1\24"+
		"\1\uffff\1\76\1\24\1\uffff\1\100\1\uffff\1\101\2\uffff";
	static final String DFA17_eofS =
		"\102\uffff";
	static final String DFA17_minS =
		"\1\11\7\uffff\1\52\3\75\2\154\1\146\1\145\1\157\1\150\3\uffff\1\56\13"+
		"\uffff\1\163\1\157\1\162\1\60\2\164\2\151\1\uffff\1\145\1\141\1\60\1\uffff"+
		"\1\60\1\165\1\144\1\154\1\60\1\164\2\uffff\1\162\1\60\1\145\1\uffff\1"+
		"\60\1\156\1\uffff\1\60\1\uffff\1\60\2\uffff";
	static final String DFA17_maxS =
		"\1\175\7\uffff\1\57\3\75\1\154\1\157\1\156\1\145\1\157\1\150\3\uffff\1"+
		"\145\13\uffff\1\163\1\157\1\162\1\172\2\164\2\151\1\uffff\1\145\1\141"+
		"\1\172\1\uffff\1\172\1\165\1\144\1\154\1\172\1\164\2\uffff\1\162\1\172"+
		"\1\145\1\uffff\1\172\1\156\1\uffff\1\172\1\uffff\1\172\2\uffff";
	static final String DFA17_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\12\uffff\1\27\1\30\1\31\1\uffff\1"+
		"\33\1\35\1\36\1\34\1\10\1\12\1\11\1\14\1\13\1\16\1\15\10\uffff\1\32\3"+
		"\uffff\1\22\6\uffff\1\21\1\23\3\uffff\1\17\2\uffff\1\25\1\uffff\1\20\1"+
		"\uffff\1\26\1\24";
	static final String DFA17_specialS =
		"\102\uffff}>";
	static final String[] DFA17_transitionS = {
			"\2\27\2\uffff\1\27\22\uffff\1\27\1\1\6\uffff\1\2\1\3\1\4\1\5\1\6\1\7"+
			"\1\26\1\10\12\25\1\uffff\1\30\1\11\1\12\1\13\2\uffff\32\24\4\uffff\1"+
			"\24\1\uffff\4\24\1\14\1\15\2\24\1\16\10\24\1\17\3\24\1\20\1\21\3\24\1"+
			"\22\1\uffff\1\23",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\31\4\uffff\1\31",
			"\1\33",
			"\1\35",
			"\1\37",
			"\1\41",
			"\1\42\2\uffff\1\43",
			"\1\44\7\uffff\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"",
			"",
			"",
			"\1\26\1\uffff\12\25\13\uffff\1\26\37\uffff\1\26",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\52",
			"\1\53",
			"\1\54",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"",
			"\1\62",
			"\1\63",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\1\66",
			"\1\67",
			"\1\70",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\1\72",
			"",
			"",
			"\1\73",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\1\75",
			"",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"\1\77",
			"",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"",
			"\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
			"",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | ID | INT | FLOAT | COMMENT | WS | END );";
		}
	}

}
