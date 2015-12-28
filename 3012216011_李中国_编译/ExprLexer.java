// $ANTLR 3.5.2 Expr.g 2015-06-12 19:32:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExprLexer() {} 
	public ExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Expr.g"; }

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:2:7: ( '(' )
			// Expr.g:2:9: '('
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:3:7: ( ')' )
			// Expr.g:3:9: ')'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:4:7: ( '*' )
			// Expr.g:4:9: '*'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:5:7: ( '+' )
			// Expr.g:5:9: '+'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:6:7: ( '-' )
			// Expr.g:6:9: '-'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:7:7: ( '=' )
			// Expr.g:7:9: '='
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:8:7: ( 'else' )
			// Expr.g:8:9: 'else'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:9:7: ( 'if' )
			// Expr.g:9:9: 'if'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:10:7: ( 'int' )
			// Expr.g:10:9: 'int'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:11:7: ( 'while' )
			// Expr.g:11:9: 'while'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:12:7: ( '{' )
			// Expr.g:12:9: '{'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:13:7: ( '}' )
			// Expr.g:13:9: '}'
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
	// $ANTLR end "T__26"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:35:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// Expr.g:35:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// Expr.g:35:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Expr.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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
			// Expr.g:36:5: ( ( '0' .. '9' )+ )
			// Expr.g:36:9: ( '0' .. '9' )+
			{
			// Expr.g:36:9: ( '0' .. '9' )+
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
					// Expr.g:
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

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:37:6: ( ';' )
			// Expr.g:37:8: ';'
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:38:5: ( ( '\\r' | '\\n' | ' ' | '\\t' )+ )
			// Expr.g:38:9: ( '\\r' | '\\n' | ' ' | '\\t' )+
			{
			// Expr.g:38:9: ( '\\r' | '\\n' | ' ' | '\\t' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Expr.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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

	@Override
	public void mTokens() throws RecognitionException {
		// Expr.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | INT | END | WS )
		int alt4=16;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt4=1;
			}
			break;
		case ')':
			{
			alt4=2;
			}
			break;
		case '*':
			{
			alt4=3;
			}
			break;
		case '+':
			{
			alt4=4;
			}
			break;
		case '-':
			{
			alt4=5;
			}
			break;
		case '=':
			{
			alt4=6;
			}
			break;
		case 'e':
			{
			int LA4_7 = input.LA(2);
			if ( (LA4_7=='l') ) {
				int LA4_16 = input.LA(3);
				if ( (LA4_16=='s') ) {
					int LA4_20 = input.LA(4);
					if ( (LA4_20=='e') ) {
						int LA4_24 = input.LA(5);
						if ( ((LA4_24 >= 'A' && LA4_24 <= 'Z')||(LA4_24 >= 'a' && LA4_24 <= 'z')) ) {
							alt4=13;
						}

						else {
							alt4=7;
						}

					}

					else {
						alt4=13;
					}

				}

				else {
					alt4=13;
				}

			}

			else {
				alt4=13;
			}

			}
			break;
		case 'i':
			{
			switch ( input.LA(2) ) {
			case 'f':
				{
				int LA4_17 = input.LA(3);
				if ( ((LA4_17 >= 'A' && LA4_17 <= 'Z')||(LA4_17 >= 'a' && LA4_17 <= 'z')) ) {
					alt4=13;
				}

				else {
					alt4=8;
				}

				}
				break;
			case 'n':
				{
				int LA4_18 = input.LA(3);
				if ( (LA4_18=='t') ) {
					int LA4_22 = input.LA(4);
					if ( ((LA4_22 >= 'A' && LA4_22 <= 'Z')||(LA4_22 >= 'a' && LA4_22 <= 'z')) ) {
						alt4=13;
					}

					else {
						alt4=9;
					}

				}

				else {
					alt4=13;
				}

				}
				break;
			default:
				alt4=13;
			}
			}
			break;
		case 'w':
			{
			int LA4_9 = input.LA(2);
			if ( (LA4_9=='h') ) {
				int LA4_19 = input.LA(3);
				if ( (LA4_19=='i') ) {
					int LA4_23 = input.LA(4);
					if ( (LA4_23=='l') ) {
						int LA4_26 = input.LA(5);
						if ( (LA4_26=='e') ) {
							int LA4_28 = input.LA(6);
							if ( ((LA4_28 >= 'A' && LA4_28 <= 'Z')||(LA4_28 >= 'a' && LA4_28 <= 'z')) ) {
								alt4=13;
							}

							else {
								alt4=10;
							}

						}

						else {
							alt4=13;
						}

					}

					else {
						alt4=13;
					}

				}

				else {
					alt4=13;
				}

			}

			else {
				alt4=13;
			}

			}
			break;
		case '{':
			{
			alt4=11;
			}
			break;
		case '}':
			{
			alt4=12;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=13;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=14;
			}
			break;
		case ';':
			{
			alt4=15;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=16;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// Expr.g:1:10: T__15
				{
				mT__15(); 

				}
				break;
			case 2 :
				// Expr.g:1:16: T__16
				{
				mT__16(); 

				}
				break;
			case 3 :
				// Expr.g:1:22: T__17
				{
				mT__17(); 

				}
				break;
			case 4 :
				// Expr.g:1:28: T__18
				{
				mT__18(); 

				}
				break;
			case 5 :
				// Expr.g:1:34: T__19
				{
				mT__19(); 

				}
				break;
			case 6 :
				// Expr.g:1:40: T__20
				{
				mT__20(); 

				}
				break;
			case 7 :
				// Expr.g:1:46: T__21
				{
				mT__21(); 

				}
				break;
			case 8 :
				// Expr.g:1:52: T__22
				{
				mT__22(); 

				}
				break;
			case 9 :
				// Expr.g:1:58: T__23
				{
				mT__23(); 

				}
				break;
			case 10 :
				// Expr.g:1:64: T__24
				{
				mT__24(); 

				}
				break;
			case 11 :
				// Expr.g:1:70: T__25
				{
				mT__25(); 

				}
				break;
			case 12 :
				// Expr.g:1:76: T__26
				{
				mT__26(); 

				}
				break;
			case 13 :
				// Expr.g:1:82: ID
				{
				mID(); 

				}
				break;
			case 14 :
				// Expr.g:1:85: INT
				{
				mINT(); 

				}
				break;
			case 15 :
				// Expr.g:1:89: END
				{
				mEND(); 

				}
				break;
			case 16 :
				// Expr.g:1:93: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
