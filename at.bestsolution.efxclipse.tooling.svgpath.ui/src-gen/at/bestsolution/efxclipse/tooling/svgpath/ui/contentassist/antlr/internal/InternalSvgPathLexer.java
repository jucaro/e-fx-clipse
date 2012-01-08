package at.bestsolution.efxclipse.tooling.svgpath.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgPathLexer extends Lexer {
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int RULE_WSP=4;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int T__5=5;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int T__11=11;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int T__13=13;
    public static final int T__10=10;

    // delegates
    // delegators

    public InternalSvgPathLexer() {;} 
    public InternalSvgPathLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSvgPathLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g"; }

    // $ANTLR start "T__5"
    public final void mT__5() throws RecognitionException {
        try {
            int _type = T__5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:11:6: ( ',' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:11:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__5"

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:12:6: ( 'M' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:12:8: 'M'
            {
            match('M'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:13:6: ( 'm' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:13:8: 'm'
            {
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:14:6: ( 'Z' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:14:8: 'Z'
            {
            match('Z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:15:6: ( 'z' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:15:8: 'z'
            {
            match('z'); 

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
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:16:7: ( 'L' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:16:9: 'L'
            {
            match('L'); 

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
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:17:7: ( 'l' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:17:9: 'l'
            {
            match('l'); 

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
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:18:7: ( 'H' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:18:9: 'H'
            {
            match('H'); 

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
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:19:7: ( 'h' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:19:9: 'h'
            {
            match('h'); 

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
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:20:7: ( 'V' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:20:9: 'V'
            {
            match('V'); 

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
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:21:7: ( 'v' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:21:9: 'v'
            {
            match('v'); 

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
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:22:7: ( 'C' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:22:9: 'C'
            {
            match('C'); 

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
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:23:7: ( 'c' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:23:9: 'c'
            {
            match('c'); 

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
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:24:7: ( 'S' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:24:9: 'S'
            {
            match('S'); 

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
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:25:7: ( 's' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:25:9: 's'
            {
            match('s'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:26:7: ( 'Q' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:26:9: 'Q'
            {
            match('Q'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:27:7: ( 'q' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:27:9: 'q'
            {
            match('q'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:28:7: ( 'T' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:28:9: 'T'
            {
            match('T'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:29:7: ( 't' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:29:9: 't'
            {
            match('t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:30:7: ( 'A' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:30:9: 'A'
            {
            match('A'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:31:7: ( 'a' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:31:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:32:7: ( 'e' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:32:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:33:7: ( 'E' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:33:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:34:7: ( '0' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:34:9: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:35:7: ( '1' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:35:9: '1'
            {
            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:36:7: ( '2' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:36:9: '2'
            {
            match('2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:37:7: ( '3' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:37:9: '3'
            {
            match('3'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:38:7: ( '4' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:38:9: '4'
            {
            match('4'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:39:7: ( '5' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:39:9: '5'
            {
            match('5'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:40:7: ( '6' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:40:9: '6'
            {
            match('6'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:41:7: ( '7' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:41:9: '7'
            {
            match('7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:42:7: ( '8' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:42:9: '8'
            {
            match('8'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:43:7: ( '9' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:43:9: '9'
            {
            match('9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:44:7: ( '+' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:44:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:45:7: ( '-' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:45:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:46:7: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:46:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_WSP"
    public final void mRULE_WSP() throws RecognitionException {
        try {
            int _type = RULE_WSP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5185:10: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5185:12: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WSP"

    public void mTokens() throws RecognitionException {
        // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:8: ( T__5 | T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_WSP )
        int alt1=37;
        switch ( input.LA(1) ) {
        case ',':
            {
            alt1=1;
            }
            break;
        case 'M':
            {
            alt1=2;
            }
            break;
        case 'm':
            {
            alt1=3;
            }
            break;
        case 'Z':
            {
            alt1=4;
            }
            break;
        case 'z':
            {
            alt1=5;
            }
            break;
        case 'L':
            {
            alt1=6;
            }
            break;
        case 'l':
            {
            alt1=7;
            }
            break;
        case 'H':
            {
            alt1=8;
            }
            break;
        case 'h':
            {
            alt1=9;
            }
            break;
        case 'V':
            {
            alt1=10;
            }
            break;
        case 'v':
            {
            alt1=11;
            }
            break;
        case 'C':
            {
            alt1=12;
            }
            break;
        case 'c':
            {
            alt1=13;
            }
            break;
        case 'S':
            {
            alt1=14;
            }
            break;
        case 's':
            {
            alt1=15;
            }
            break;
        case 'Q':
            {
            alt1=16;
            }
            break;
        case 'q':
            {
            alt1=17;
            }
            break;
        case 'T':
            {
            alt1=18;
            }
            break;
        case 't':
            {
            alt1=19;
            }
            break;
        case 'A':
            {
            alt1=20;
            }
            break;
        case 'a':
            {
            alt1=21;
            }
            break;
        case 'e':
            {
            alt1=22;
            }
            break;
        case 'E':
            {
            alt1=23;
            }
            break;
        case '0':
            {
            alt1=24;
            }
            break;
        case '1':
            {
            alt1=25;
            }
            break;
        case '2':
            {
            alt1=26;
            }
            break;
        case '3':
            {
            alt1=27;
            }
            break;
        case '4':
            {
            alt1=28;
            }
            break;
        case '5':
            {
            alt1=29;
            }
            break;
        case '6':
            {
            alt1=30;
            }
            break;
        case '7':
            {
            alt1=31;
            }
            break;
        case '8':
            {
            alt1=32;
            }
            break;
        case '9':
            {
            alt1=33;
            }
            break;
        case '+':
            {
            alt1=34;
            }
            break;
        case '-':
            {
            alt1=35;
            }
            break;
        case '.':
            {
            alt1=36;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt1=37;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;
        }

        switch (alt1) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:10: T__5
                {
                mT__5(); 

                }
                break;
            case 2 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:15: T__6
                {
                mT__6(); 

                }
                break;
            case 3 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:20: T__7
                {
                mT__7(); 

                }
                break;
            case 4 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:25: T__8
                {
                mT__8(); 

                }
                break;
            case 5 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:30: T__9
                {
                mT__9(); 

                }
                break;
            case 6 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:35: T__10
                {
                mT__10(); 

                }
                break;
            case 7 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:41: T__11
                {
                mT__11(); 

                }
                break;
            case 8 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:47: T__12
                {
                mT__12(); 

                }
                break;
            case 9 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:53: T__13
                {
                mT__13(); 

                }
                break;
            case 10 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:59: T__14
                {
                mT__14(); 

                }
                break;
            case 11 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:65: T__15
                {
                mT__15(); 

                }
                break;
            case 12 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:71: T__16
                {
                mT__16(); 

                }
                break;
            case 13 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:77: T__17
                {
                mT__17(); 

                }
                break;
            case 14 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:83: T__18
                {
                mT__18(); 

                }
                break;
            case 15 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:89: T__19
                {
                mT__19(); 

                }
                break;
            case 16 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:95: T__20
                {
                mT__20(); 

                }
                break;
            case 17 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:101: T__21
                {
                mT__21(); 

                }
                break;
            case 18 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:107: T__22
                {
                mT__22(); 

                }
                break;
            case 19 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:113: T__23
                {
                mT__23(); 

                }
                break;
            case 20 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:119: T__24
                {
                mT__24(); 

                }
                break;
            case 21 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:125: T__25
                {
                mT__25(); 

                }
                break;
            case 22 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:131: T__26
                {
                mT__26(); 

                }
                break;
            case 23 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:137: T__27
                {
                mT__27(); 

                }
                break;
            case 24 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:143: T__28
                {
                mT__28(); 

                }
                break;
            case 25 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:149: T__29
                {
                mT__29(); 

                }
                break;
            case 26 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:155: T__30
                {
                mT__30(); 

                }
                break;
            case 27 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:161: T__31
                {
                mT__31(); 

                }
                break;
            case 28 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:167: T__32
                {
                mT__32(); 

                }
                break;
            case 29 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:173: T__33
                {
                mT__33(); 

                }
                break;
            case 30 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:179: T__34
                {
                mT__34(); 

                }
                break;
            case 31 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:185: T__35
                {
                mT__35(); 

                }
                break;
            case 32 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:191: T__36
                {
                mT__36(); 

                }
                break;
            case 33 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:197: T__37
                {
                mT__37(); 

                }
                break;
            case 34 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:203: T__38
                {
                mT__38(); 

                }
                break;
            case 35 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:209: T__39
                {
                mT__39(); 

                }
                break;
            case 36 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:215: T__40
                {
                mT__40(); 

                }
                break;
            case 37 :
                // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1:221: RULE_WSP
                {
                mRULE_WSP(); 

                }
                break;

        }

    }


 

}