package at.bestsolution.efxclipse.tooling.fxmlx.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFXMLDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=6;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int RULE_WS=7;

    // delegates
    // delegators

    public InternalFXMLDslLexer() {;} 
    public InternalFXMLDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFXMLDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:11:6: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:11:8: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:12:7: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:13:7: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:14:7: ( '<?xml' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:14:9: '<?xml'
            {
            match("<?xml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:15:7: ( '?>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:15:9: '?>'
            {
            match("?>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:16:7: ( '<?' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:16:9: '<?'
            {
            match("<?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:17:7: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:17:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:18:7: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:19:7: ( '</' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:19:9: '</'
            {
            match("</"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:20:7: ( '/>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:20:9: '/>'
            {
            match("/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:21:7: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:21:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2344:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2344:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2344:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2344:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2344:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2346:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2346:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2346:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2346:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2346:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2346:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2346:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2346:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2346:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2346:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2346:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2348:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2348:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2348:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2350:16: ( . )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2350:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2352:17: ( '<!--' ( options {greedy=false; } : . )* '-->' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2352:19: '<!--' ( options {greedy=false; } : . )* '-->'
            {
            match("<!--"); 

            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2352:26: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='-') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='-') ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3=='>') ) {
                            alt7=2;
                        }
                        else if ( ((LA7_3>='\u0000' && LA7_3<='=')||(LA7_3>='?' && LA7_3<='\uFFFF')) ) {
                            alt7=1;
                        }


                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<=',')||(LA7_1>='.' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=',')||(LA7_0>='.' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2352:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("-->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    public void mTokens() throws RecognitionException {
        // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER | RULE_ML_COMMENT )
        int alt8=16;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:75: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:83: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:95: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:103: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 16 :
                // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1:118: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\4\uffff\1\25\1\16\1\uffff\1\16\1\uffff\1\16\1\uffff\2\16\5\uffff"+
        "\1\36\14\uffff";
    static final String DFA8_eofS =
        "\37\uffff";
    static final String DFA8_minS =
        "\1\0\3\uffff\1\41\1\76\1\uffff\1\76\1\uffff\1\101\1\uffff\2\0\5"+
        "\uffff\1\170\14\uffff";
    static final String DFA8_maxS =
        "\1\uffff\3\uffff\1\77\1\76\1\uffff\1\76\1\uffff\1\172\1\uffff\2"+
        "\uffff\5\uffff\1\170\14\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\10\1\uffff\1\13\1\uffff\1\14\2\uffff"+
        "\1\16\1\17\1\1\1\2\1\3\1\uffff\1\11\1\20\1\7\1\5\1\10\1\12\1\13"+
        "\1\14\1\15\1\16\1\4\1\6";
    static final String DFA8_specialS =
        "\1\1\12\uffff\1\2\1\0\22\uffff}>";
    static final String[] DFA8_transitionS = {
            "\11\16\2\15\2\16\1\15\22\16\1\15\1\16\1\13\4\16\1\14\2\16\1"+
            "\10\3\16\1\1\1\7\12\16\1\2\1\16\1\4\1\3\1\6\1\5\1\16\32\12\3"+
            "\16\1\11\1\12\1\16\32\12\uff85\16",
            "",
            "",
            "",
            "\1\24\15\uffff\1\23\17\uffff\1\22",
            "\1\26",
            "",
            "\1\30",
            "",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\0\33",
            "\0\33",
            "",
            "",
            "",
            "",
            "",
            "\1\35",
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
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_ID | RULE_STRING | RULE_WS | RULE_ANY_OTHER | RULE_ML_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_12 = input.LA(1);

                        s = -1;
                        if ( ((LA8_12>='\u0000' && LA8_12<='\uFFFF')) ) {s = 27;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_0 = input.LA(1);

                        s = -1;
                        if ( (LA8_0=='.') ) {s = 1;}

                        else if ( (LA8_0==':') ) {s = 2;}

                        else if ( (LA8_0=='=') ) {s = 3;}

                        else if ( (LA8_0=='<') ) {s = 4;}

                        else if ( (LA8_0=='?') ) {s = 5;}

                        else if ( (LA8_0=='>') ) {s = 6;}

                        else if ( (LA8_0=='/') ) {s = 7;}

                        else if ( (LA8_0=='*') ) {s = 8;}

                        else if ( (LA8_0=='^') ) {s = 9;}

                        else if ( ((LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {s = 10;}

                        else if ( (LA8_0=='\"') ) {s = 11;}

                        else if ( (LA8_0=='\'') ) {s = 12;}

                        else if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {s = 13;}

                        else if ( ((LA8_0>='\u0000' && LA8_0<='\b')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\u001F')||LA8_0=='!'||(LA8_0>='#' && LA8_0<='&')||(LA8_0>='(' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='-')||(LA8_0>='0' && LA8_0<='9')||LA8_0==';'||LA8_0=='@'||(LA8_0>='[' && LA8_0<=']')||LA8_0=='`'||(LA8_0>='{' && LA8_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_11 = input.LA(1);

                        s = -1;
                        if ( ((LA8_11>='\u0000' && LA8_11<='\uFFFF')) ) {s = 27;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}