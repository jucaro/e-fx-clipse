package at.bestsolution.efxclipse.tooling.css.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.bestsolution.efxclipse.tooling.css.services.CssDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCssDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_HEXDIGITS", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_STRING", "RULE_COMMA", "RULE_INTEGER", "RULE_REAL", "RULE_WS", "RULE_ML_COMMENT", "'*'", "'='", "'+'", "'>'", "'/'", "'-'", "'px'", "'cm'", "'mm'", "'in'", "'pt'", "'pc'", "'deg'", "'rad'", "'grad'", "'ms'", "'s'", "'hz'", "'khz'", "'media'", "'{'", "'}'", "';'", "'.'", "'#'", "'['", "']'", "':'", "'('", "')'", "'url'", "'%'", "'em'", "'ex'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_INCLUDES=6;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_REAL=11;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_COMMA=9;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_DASHMATCH=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_IDENT=4;
    public static final int T__39=39;
    public static final int RULE_HEXDIGITS=5;
    public static final int RULE_WS=12;
    public static final int RULE_INTEGER=10;

    // delegates
    // delegators


        public InternalCssDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCssDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCssDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g"; }


     
     	private CssDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CssDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulestylesheet"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:61:1: entryRulestylesheet : rulestylesheet EOF ;
    public final void entryRulestylesheet() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:62:1: ( rulestylesheet EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:63:1: rulestylesheet EOF
            {
             before(grammarAccess.getStylesheetRule()); 
            pushFollow(FOLLOW_rulestylesheet_in_entryRulestylesheet61);
            rulestylesheet();

            state._fsp--;

             after(grammarAccess.getStylesheetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestylesheet68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestylesheet"


    // $ANTLR start "rulestylesheet"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:70:1: rulestylesheet : ( ( rule__Stylesheet__Alternatives )* ) ;
    public final void rulestylesheet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:74:2: ( ( ( rule__Stylesheet__Alternatives )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:75:1: ( ( rule__Stylesheet__Alternatives )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:75:1: ( ( rule__Stylesheet__Alternatives )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:76:1: ( rule__Stylesheet__Alternatives )*
            {
             before(grammarAccess.getStylesheetAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:77:1: ( rule__Stylesheet__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_IDENT && LA1_0<=RULE_HEXDIGITS)||LA1_0==14||LA1_0==33||(LA1_0>=37 && LA1_0<=39)||LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:77:2: rule__Stylesheet__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Stylesheet__Alternatives_in_rulestylesheet94);
            	    rule__Stylesheet__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStylesheetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestylesheet"


    // $ANTLR start "entryRulemedia"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:89:1: entryRulemedia : rulemedia EOF ;
    public final void entryRulemedia() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:90:1: ( rulemedia EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:91:1: rulemedia EOF
            {
             before(grammarAccess.getMediaRule()); 
            pushFollow(FOLLOW_rulemedia_in_entryRulemedia122);
            rulemedia();

            state._fsp--;

             after(grammarAccess.getMediaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemedia"


    // $ANTLR start "rulemedia"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:98:1: rulemedia : ( ( rule__Media__Group__0 ) ) ;
    public final void rulemedia() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:102:2: ( ( ( rule__Media__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:103:1: ( ( rule__Media__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:103:1: ( ( rule__Media__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:104:1: ( rule__Media__Group__0 )
            {
             before(grammarAccess.getMediaAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:105:1: ( rule__Media__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:105:2: rule__Media__Group__0
            {
            pushFollow(FOLLOW_rule__Media__Group__0_in_rulemedia155);
            rule__Media__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMediaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemedia"


    // $ANTLR start "entryRulemedia_list"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:117:1: entryRulemedia_list : rulemedia_list EOF ;
    public final void entryRulemedia_list() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:118:1: ( rulemedia_list EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:119:1: rulemedia_list EOF
            {
             before(grammarAccess.getMedia_listRule()); 
            pushFollow(FOLLOW_rulemedia_list_in_entryRulemedia_list182);
            rulemedia_list();

            state._fsp--;

             after(grammarAccess.getMedia_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia_list189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemedia_list"


    // $ANTLR start "rulemedia_list"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:126:1: rulemedia_list : ( ( rule__Media_list__Group__0 ) ) ;
    public final void rulemedia_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:130:2: ( ( ( rule__Media_list__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:131:1: ( ( rule__Media_list__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:131:1: ( ( rule__Media_list__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:132:1: ( rule__Media_list__Group__0 )
            {
             before(grammarAccess.getMedia_listAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:133:1: ( rule__Media_list__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:133:2: rule__Media_list__Group__0
            {
            pushFollow(FOLLOW_rule__Media_list__Group__0_in_rulemedia_list215);
            rule__Media_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMedia_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemedia_list"


    // $ANTLR start "entryRulemedium"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:145:1: entryRulemedium : rulemedium EOF ;
    public final void entryRulemedium() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:146:1: ( rulemedium EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:147:1: rulemedium EOF
            {
             before(grammarAccess.getMediumRule()); 
            pushFollow(FOLLOW_rulemedium_in_entryRulemedium242);
            rulemedium();

            state._fsp--;

             after(grammarAccess.getMediumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedium249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemedium"


    // $ANTLR start "rulemedium"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:154:1: rulemedium : ( RULE_IDENT ) ;
    public final void rulemedium() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:158:2: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:159:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:159:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:160:1: RULE_IDENT
            {
             before(grammarAccess.getMediumAccess().getIDENTTerminalRuleCall()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulemedium275); 
             after(grammarAccess.getMediumAccess().getIDENTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemedium"


    // $ANTLR start "entryRuleruleset"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:173:1: entryRuleruleset : ruleruleset EOF ;
    public final void entryRuleruleset() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:174:1: ( ruleruleset EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:175:1: ruleruleset EOF
            {
             before(grammarAccess.getRulesetRule()); 
            pushFollow(FOLLOW_ruleruleset_in_entryRuleruleset301);
            ruleruleset();

            state._fsp--;

             after(grammarAccess.getRulesetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleset308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleruleset"


    // $ANTLR start "ruleruleset"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:182:1: ruleruleset : ( ( rule__Ruleset__Group__0 ) ) ;
    public final void ruleruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:186:2: ( ( ( rule__Ruleset__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:187:1: ( ( rule__Ruleset__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:187:1: ( ( rule__Ruleset__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:188:1: ( rule__Ruleset__Group__0 )
            {
             before(grammarAccess.getRulesetAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:189:1: ( rule__Ruleset__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:189:2: rule__Ruleset__Group__0
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__0_in_ruleruleset334);
            rule__Ruleset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRulesetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleruleset"


    // $ANTLR start "entryRuleselector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:201:1: entryRuleselector : ruleselector EOF ;
    public final void entryRuleselector() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:205:1: ( ruleselector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:206:1: ruleselector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector366);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector373); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleselector"


    // $ANTLR start "ruleselector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:216:1: ruleselector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleselector() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:221:2: ( ( ( rule__Selector__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:222:1: ( ( rule__Selector__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:222:1: ( ( rule__Selector__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:223:1: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:224:1: ( rule__Selector__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:224:2: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_rule__Selector__Group__0_in_ruleselector403);
            rule__Selector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleselector"


    // $ANTLR start "entryRulesimple_selector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:237:1: entryRulesimple_selector : rulesimple_selector EOF ;
    public final void entryRulesimple_selector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:238:1: ( rulesimple_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:239:1: rulesimple_selector EOF
            {
             before(grammarAccess.getSimple_selectorRule()); 
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector430);
            rulesimple_selector();

            state._fsp--;

             after(grammarAccess.getSimple_selectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector437); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesimple_selector"


    // $ANTLR start "rulesimple_selector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:246:1: rulesimple_selector : ( ( rule__Simple_selector__Alternatives ) ) ;
    public final void rulesimple_selector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:250:2: ( ( ( rule__Simple_selector__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:251:1: ( ( rule__Simple_selector__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:251:1: ( ( rule__Simple_selector__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:252:1: ( rule__Simple_selector__Alternatives )
            {
             before(grammarAccess.getSimple_selectorAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:253:1: ( rule__Simple_selector__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:253:2: rule__Simple_selector__Alternatives
            {
            pushFollow(FOLLOW_rule__Simple_selector__Alternatives_in_rulesimple_selector463);
            rule__Simple_selector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimple_selectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesimple_selector"


    // $ANTLR start "entryRuleelement_name"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:265:1: entryRuleelement_name : ruleelement_name EOF ;
    public final void entryRuleelement_name() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:266:1: ( ruleelement_name EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:267:1: ruleelement_name EOF
            {
             before(grammarAccess.getElement_nameRule()); 
            pushFollow(FOLLOW_ruleelement_name_in_entryRuleelement_name490);
            ruleelement_name();

            state._fsp--;

             after(grammarAccess.getElement_nameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement_name497); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleelement_name"


    // $ANTLR start "ruleelement_name"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:274:1: ruleelement_name : ( ( rule__Element_name__Alternatives ) ) ;
    public final void ruleelement_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:278:2: ( ( ( rule__Element_name__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:279:1: ( ( rule__Element_name__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:279:1: ( ( rule__Element_name__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:280:1: ( rule__Element_name__Alternatives )
            {
             before(grammarAccess.getElement_nameAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:281:1: ( rule__Element_name__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:281:2: rule__Element_name__Alternatives
            {
            pushFollow(FOLLOW_rule__Element_name__Alternatives_in_ruleelement_name523);
            rule__Element_name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElement_nameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleelement_name"


    // $ANTLR start "entryRulesub_selector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:293:1: entryRulesub_selector : rulesub_selector EOF ;
    public final void entryRulesub_selector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:294:1: ( rulesub_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:295:1: rulesub_selector EOF
            {
             before(grammarAccess.getSub_selectorRule()); 
            pushFollow(FOLLOW_rulesub_selector_in_entryRulesub_selector550);
            rulesub_selector();

            state._fsp--;

             after(grammarAccess.getSub_selectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesub_selector557); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesub_selector"


    // $ANTLR start "rulesub_selector"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:302:1: rulesub_selector : ( ( rule__Sub_selector__Alternatives ) ) ;
    public final void rulesub_selector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:306:2: ( ( ( rule__Sub_selector__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:307:1: ( ( rule__Sub_selector__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:307:1: ( ( rule__Sub_selector__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:308:1: ( rule__Sub_selector__Alternatives )
            {
             before(grammarAccess.getSub_selectorAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:309:1: ( rule__Sub_selector__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:309:2: rule__Sub_selector__Alternatives
            {
            pushFollow(FOLLOW_rule__Sub_selector__Alternatives_in_rulesub_selector583);
            rule__Sub_selector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSub_selectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesub_selector"


    // $ANTLR start "entryRulecss_class"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:321:1: entryRulecss_class : rulecss_class EOF ;
    public final void entryRulecss_class() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:322:1: ( rulecss_class EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:323:1: rulecss_class EOF
            {
             before(grammarAccess.getCss_classRule()); 
            pushFollow(FOLLOW_rulecss_class_in_entryRulecss_class610);
            rulecss_class();

            state._fsp--;

             after(grammarAccess.getCss_classRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_class617); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_class"


    // $ANTLR start "rulecss_class"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:330:1: rulecss_class : ( ( rule__Css_class__Group__0 ) ) ;
    public final void rulecss_class() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:334:2: ( ( ( rule__Css_class__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:335:1: ( ( rule__Css_class__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:335:1: ( ( rule__Css_class__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:336:1: ( rule__Css_class__Group__0 )
            {
             before(grammarAccess.getCss_classAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:337:1: ( rule__Css_class__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:337:2: rule__Css_class__Group__0
            {
            pushFollow(FOLLOW_rule__Css_class__Group__0_in_rulecss_class643);
            rule__Css_class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_classAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_class"


    // $ANTLR start "entryRulecss_id"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:349:1: entryRulecss_id : rulecss_id EOF ;
    public final void entryRulecss_id() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:350:1: ( rulecss_id EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:351:1: rulecss_id EOF
            {
             before(grammarAccess.getCss_idRule()); 
            pushFollow(FOLLOW_rulecss_id_in_entryRulecss_id670);
            rulecss_id();

            state._fsp--;

             after(grammarAccess.getCss_idRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_id677); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_id"


    // $ANTLR start "rulecss_id"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:358:1: rulecss_id : ( ( rule__Css_id__Group__0 ) ) ;
    public final void rulecss_id() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:362:2: ( ( ( rule__Css_id__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:363:1: ( ( rule__Css_id__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:363:1: ( ( rule__Css_id__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:364:1: ( rule__Css_id__Group__0 )
            {
             before(grammarAccess.getCss_idAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:365:1: ( rule__Css_id__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:365:2: rule__Css_id__Group__0
            {
            pushFollow(FOLLOW_rule__Css_id__Group__0_in_rulecss_id703);
            rule__Css_id__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_idAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_id"


    // $ANTLR start "entryRulecss_attrib"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:377:1: entryRulecss_attrib : rulecss_attrib EOF ;
    public final void entryRulecss_attrib() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:378:1: ( rulecss_attrib EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:379:1: rulecss_attrib EOF
            {
             before(grammarAccess.getCss_attribRule()); 
            pushFollow(FOLLOW_rulecss_attrib_in_entryRulecss_attrib730);
            rulecss_attrib();

            state._fsp--;

             after(grammarAccess.getCss_attribRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_attrib737); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_attrib"


    // $ANTLR start "rulecss_attrib"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:386:1: rulecss_attrib : ( ( rule__Css_attrib__Group__0 ) ) ;
    public final void rulecss_attrib() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:390:2: ( ( ( rule__Css_attrib__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:391:1: ( ( rule__Css_attrib__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:391:1: ( ( rule__Css_attrib__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:392:1: ( rule__Css_attrib__Group__0 )
            {
             before(grammarAccess.getCss_attribAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:393:1: ( rule__Css_attrib__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:393:2: rule__Css_attrib__Group__0
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__0_in_rulecss_attrib763);
            rule__Css_attrib__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_attribAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_attrib"


    // $ANTLR start "entryRulecss_declaration"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:405:1: entryRulecss_declaration : rulecss_declaration EOF ;
    public final void entryRulecss_declaration() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:406:1: ( rulecss_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:407:1: rulecss_declaration EOF
            {
             before(grammarAccess.getCss_declarationRule()); 
            pushFollow(FOLLOW_rulecss_declaration_in_entryRulecss_declaration790);
            rulecss_declaration();

            state._fsp--;

             after(grammarAccess.getCss_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_declaration797); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_declaration"


    // $ANTLR start "rulecss_declaration"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:414:1: rulecss_declaration : ( rulecss_generic_declaration ) ;
    public final void rulecss_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:418:2: ( ( rulecss_generic_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:419:1: ( rulecss_generic_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:419:1: ( rulecss_generic_declaration )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:420:1: rulecss_generic_declaration
            {
             before(grammarAccess.getCss_declarationAccess().getCss_generic_declarationParserRuleCall()); 
            pushFollow(FOLLOW_rulecss_generic_declaration_in_rulecss_declaration823);
            rulecss_generic_declaration();

            state._fsp--;

             after(grammarAccess.getCss_declarationAccess().getCss_generic_declarationParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_declaration"


    // $ANTLR start "entryRulecss_generic_declaration"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:433:1: entryRulecss_generic_declaration : rulecss_generic_declaration EOF ;
    public final void entryRulecss_generic_declaration() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:434:1: ( rulecss_generic_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:435:1: rulecss_generic_declaration EOF
            {
             before(grammarAccess.getCss_generic_declarationRule()); 
            pushFollow(FOLLOW_rulecss_generic_declaration_in_entryRulecss_generic_declaration849);
            rulecss_generic_declaration();

            state._fsp--;

             after(grammarAccess.getCss_generic_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_generic_declaration856); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_generic_declaration"


    // $ANTLR start "rulecss_generic_declaration"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:442:1: rulecss_generic_declaration : ( ( rule__Css_generic_declaration__Group__0 ) ) ;
    public final void rulecss_generic_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:446:2: ( ( ( rule__Css_generic_declaration__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:447:1: ( ( rule__Css_generic_declaration__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:447:1: ( ( rule__Css_generic_declaration__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:448:1: ( rule__Css_generic_declaration__Group__0 )
            {
             before(grammarAccess.getCss_generic_declarationAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:449:1: ( rule__Css_generic_declaration__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:449:2: rule__Css_generic_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__0_in_rulecss_generic_declaration882);
            rule__Css_generic_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_generic_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_generic_declaration"


    // $ANTLR start "entryRulecss_property"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:461:1: entryRulecss_property : rulecss_property EOF ;
    public final void entryRulecss_property() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:462:1: ( rulecss_property EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:463:1: rulecss_property EOF
            {
             before(grammarAccess.getCss_propertyRule()); 
            pushFollow(FOLLOW_rulecss_property_in_entryRulecss_property909);
            rulecss_property();

            state._fsp--;

             after(grammarAccess.getCss_propertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_property916); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_property"


    // $ANTLR start "rulecss_property"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:470:1: rulecss_property : ( ( rule__Css_property__Group__0 ) ) ;
    public final void rulecss_property() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:474:2: ( ( ( rule__Css_property__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:475:1: ( ( rule__Css_property__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:475:1: ( ( rule__Css_property__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:476:1: ( rule__Css_property__Group__0 )
            {
             before(grammarAccess.getCss_propertyAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:477:1: ( rule__Css_property__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:477:2: rule__Css_property__Group__0
            {
            pushFollow(FOLLOW_rule__Css_property__Group__0_in_rulecss_property942);
            rule__Css_property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_propertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_property"


    // $ANTLR start "entryRulecss_pseudo"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:489:1: entryRulecss_pseudo : rulecss_pseudo EOF ;
    public final void entryRulecss_pseudo() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:490:1: ( rulecss_pseudo EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:491:1: rulecss_pseudo EOF
            {
             before(grammarAccess.getCss_pseudoRule()); 
            pushFollow(FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo969);
            rulecss_pseudo();

            state._fsp--;

             after(grammarAccess.getCss_pseudoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_pseudo976); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecss_pseudo"


    // $ANTLR start "rulecss_pseudo"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:498:1: rulecss_pseudo : ( ( rule__Css_pseudo__Group__0 ) ) ;
    public final void rulecss_pseudo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:502:2: ( ( ( rule__Css_pseudo__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:503:1: ( ( rule__Css_pseudo__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:503:1: ( ( rule__Css_pseudo__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:504:1: ( rule__Css_pseudo__Group__0 )
            {
             before(grammarAccess.getCss_pseudoAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:505:1: ( rule__Css_pseudo__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:505:2: rule__Css_pseudo__Group__0
            {
            pushFollow(FOLLOW_rule__Css_pseudo__Group__0_in_rulecss_pseudo1002);
            rule__Css_pseudo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCss_pseudoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecss_pseudo"


    // $ANTLR start "entryRulecombinator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:517:1: entryRulecombinator : rulecombinator EOF ;
    public final void entryRulecombinator() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:518:1: ( rulecombinator EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:519:1: rulecombinator EOF
            {
             before(grammarAccess.getCombinatorRule()); 
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator1029);
            rulecombinator();

            state._fsp--;

             after(grammarAccess.getCombinatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator1036); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecombinator"


    // $ANTLR start "rulecombinator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:526:1: rulecombinator : ( ( rule__Combinator__Group__0 ) ) ;
    public final void rulecombinator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:530:2: ( ( ( rule__Combinator__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:531:1: ( ( rule__Combinator__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:531:1: ( ( rule__Combinator__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:532:1: ( rule__Combinator__Group__0 )
            {
             before(grammarAccess.getCombinatorAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:533:1: ( rule__Combinator__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:533:2: rule__Combinator__Group__0
            {
            pushFollow(FOLLOW_rule__Combinator__Group__0_in_rulecombinator1062);
            rule__Combinator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCombinatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecombinator"


    // $ANTLR start "entryRuleoperator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:545:1: entryRuleoperator : ruleoperator EOF ;
    public final void entryRuleoperator() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:546:1: ( ruleoperator EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:547:1: ruleoperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleoperator_in_entryRuleoperator1089);
            ruleoperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoperator1096); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleoperator"


    // $ANTLR start "ruleoperator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:554:1: ruleoperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleoperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:558:2: ( ( ( rule__Operator__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:559:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:559:1: ( ( rule__Operator__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:560:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:561:1: ( rule__Operator__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:561:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleoperator1122);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleoperator"


    // $ANTLR start "entryRuleunary_operator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:573:1: entryRuleunary_operator : ruleunary_operator EOF ;
    public final void entryRuleunary_operator() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:574:1: ( ruleunary_operator EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:575:1: ruleunary_operator EOF
            {
             before(grammarAccess.getUnary_operatorRule()); 
            pushFollow(FOLLOW_ruleunary_operator_in_entryRuleunary_operator1149);
            ruleunary_operator();

            state._fsp--;

             after(grammarAccess.getUnary_operatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_operator1156); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunary_operator"


    // $ANTLR start "ruleunary_operator"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:582:1: ruleunary_operator : ( ( rule__Unary_operator__Alternatives ) ) ;
    public final void ruleunary_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:586:2: ( ( ( rule__Unary_operator__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:587:1: ( ( rule__Unary_operator__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:587:1: ( ( rule__Unary_operator__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:588:1: ( rule__Unary_operator__Alternatives )
            {
             before(grammarAccess.getUnary_operatorAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:589:1: ( rule__Unary_operator__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:589:2: rule__Unary_operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Unary_operator__Alternatives_in_ruleunary_operator1182);
            rule__Unary_operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnary_operatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunary_operator"


    // $ANTLR start "entryRuleexpr"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:601:1: entryRuleexpr : ruleexpr EOF ;
    public final void entryRuleexpr() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:605:1: ( ruleexpr EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:606:1: ruleexpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr1214);
            ruleexpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr1221); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleexpr"


    // $ANTLR start "ruleexpr"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:616:1: ruleexpr : ( ( rule__Expr__Group__0 ) ) ;
    public final void ruleexpr() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:621:2: ( ( ( rule__Expr__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:622:1: ( ( rule__Expr__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:622:1: ( ( rule__Expr__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:623:1: ( rule__Expr__Group__0 )
            {
             before(grammarAccess.getExprAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:624:1: ( rule__Expr__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:624:2: rule__Expr__Group__0
            {
            pushFollow(FOLLOW_rule__Expr__Group__0_in_ruleexpr1251);
            rule__Expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleexpr"


    // $ANTLR start "entryRuletermGroup"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:637:1: entryRuletermGroup : ruletermGroup EOF ;
    public final void entryRuletermGroup() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:638:1: ( ruletermGroup EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:639:1: ruletermGroup EOF
            {
             before(grammarAccess.getTermGroupRule()); 
            pushFollow(FOLLOW_ruletermGroup_in_entryRuletermGroup1278);
            ruletermGroup();

            state._fsp--;

             after(grammarAccess.getTermGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletermGroup1285); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletermGroup"


    // $ANTLR start "ruletermGroup"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:646:1: ruletermGroup : ( ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* ) ) ;
    public final void ruletermGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:650:2: ( ( ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:651:1: ( ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:651:1: ( ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:652:1: ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:652:1: ( ( rule__TermGroup__TermsAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:653:1: ( rule__TermGroup__TermsAssignment )
            {
             before(grammarAccess.getTermGroupAccess().getTermsAssignment()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:654:1: ( rule__TermGroup__TermsAssignment )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:654:2: rule__TermGroup__TermsAssignment
            {
            pushFollow(FOLLOW_rule__TermGroup__TermsAssignment_in_ruletermGroup1313);
            rule__TermGroup__TermsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTermGroupAccess().getTermsAssignment()); 

            }

            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:657:1: ( ( rule__TermGroup__TermsAssignment )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:658:1: ( rule__TermGroup__TermsAssignment )*
            {
             before(grammarAccess.getTermGroupAccess().getTermsAssignment()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:659:1: ( rule__TermGroup__TermsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_IDENT && LA2_0<=RULE_HEXDIGITS)||LA2_0==RULE_STRING||(LA2_0>=RULE_INTEGER && LA2_0<=RULE_REAL)||LA2_0==16||LA2_0==19||LA2_0==38||LA2_0==44) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:659:2: rule__TermGroup__TermsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__TermGroup__TermsAssignment_in_ruletermGroup1325);
            	    rule__TermGroup__TermsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTermGroupAccess().getTermsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletermGroup"


    // $ANTLR start "entryRuleterm"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:672:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:673:1: ( ruleterm EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:674:1: ruleterm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm1355);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm1362); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:681:1: ruleterm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:685:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:686:1: ( ( rule__Term__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:686:1: ( ( rule__Term__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:687:1: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:688:1: ( rule__Term__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:688:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleterm1388);
            rule__Term__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulenumberTerm"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:700:1: entryRulenumberTerm : rulenumberTerm EOF ;
    public final void entryRulenumberTerm() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:704:1: ( rulenumberTerm EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:705:1: rulenumberTerm EOF
            {
             before(grammarAccess.getNumberTermRule()); 
            pushFollow(FOLLOW_rulenumberTerm_in_entryRulenumberTerm1420);
            rulenumberTerm();

            state._fsp--;

             after(grammarAccess.getNumberTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumberTerm1427); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulenumberTerm"


    // $ANTLR start "rulenumberTerm"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:715:1: rulenumberTerm : ( ( rule__NumberTerm__Group__0 ) ) ;
    public final void rulenumberTerm() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:720:2: ( ( ( rule__NumberTerm__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:721:1: ( ( rule__NumberTerm__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:721:1: ( ( rule__NumberTerm__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:722:1: ( rule__NumberTerm__Group__0 )
            {
             before(grammarAccess.getNumberTermAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:723:1: ( rule__NumberTerm__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:723:2: rule__NumberTerm__Group__0
            {
            pushFollow(FOLLOW_rule__NumberTerm__Group__0_in_rulenumberTerm1457);
            rule__NumberTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulenumberTerm"


    // $ANTLR start "entryRulenum"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:736:1: entryRulenum : rulenum EOF ;
    public final void entryRulenum() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:737:1: ( rulenum EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:738:1: rulenum EOF
            {
             before(grammarAccess.getNumRule()); 
            pushFollow(FOLLOW_rulenum_in_entryRulenum1484);
            rulenum();

            state._fsp--;

             after(grammarAccess.getNumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenum1491); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenum"


    // $ANTLR start "rulenum"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:745:1: rulenum : ( ( rule__Num__Alternatives ) ) ;
    public final void rulenum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:749:2: ( ( ( rule__Num__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:750:1: ( ( rule__Num__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:750:1: ( ( rule__Num__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:751:1: ( rule__Num__Alternatives )
            {
             before(grammarAccess.getNumAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:752:1: ( rule__Num__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:752:2: rule__Num__Alternatives
            {
            pushFollow(FOLLOW_rule__Num__Alternatives_in_rulenum1517);
            rule__Num__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenum"


    // $ANTLR start "entryRulefunction"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:764:1: entryRulefunction : rulefunction EOF ;
    public final void entryRulefunction() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:768:1: ( rulefunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:769:1: rulefunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction1549);
            rulefunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction1556); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:779:1: rulefunction : ( ( rule__Function__Group__0 ) ) ;
    public final void rulefunction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:784:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:785:1: ( ( rule__Function__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:785:1: ( ( rule__Function__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:786:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:787:1: ( rule__Function__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:787:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_rulefunction1586);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRuleHexColor"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:800:1: entryRuleHexColor : ruleHexColor EOF ;
    public final void entryRuleHexColor() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:801:1: ( ruleHexColor EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:802:1: ruleHexColor EOF
            {
             before(grammarAccess.getHexColorRule()); 
            pushFollow(FOLLOW_ruleHexColor_in_entryRuleHexColor1613);
            ruleHexColor();

            state._fsp--;

             after(grammarAccess.getHexColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexColor1620); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHexColor"


    // $ANTLR start "ruleHexColor"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:809:1: ruleHexColor : ( ( rule__HexColor__Group__0 ) ) ;
    public final void ruleHexColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:813:2: ( ( ( rule__HexColor__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:814:1: ( ( rule__HexColor__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:814:1: ( ( rule__HexColor__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:815:1: ( rule__HexColor__Group__0 )
            {
             before(grammarAccess.getHexColorAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:816:1: ( rule__HexColor__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:816:2: rule__HexColor__Group__0
            {
            pushFollow(FOLLOW_rule__HexColor__Group__0_in_ruleHexColor1646);
            rule__HexColor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHexColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHexColor"


    // $ANTLR start "entryRuleURLType"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:828:1: entryRuleURLType : ruleURLType EOF ;
    public final void entryRuleURLType() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:832:1: ( ruleURLType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:833:1: ruleURLType EOF
            {
             before(grammarAccess.getURLTypeRule()); 
            pushFollow(FOLLOW_ruleURLType_in_entryRuleURLType1678);
            ruleURLType();

            state._fsp--;

             after(grammarAccess.getURLTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLType1685); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleURLType"


    // $ANTLR start "ruleURLType"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:843:1: ruleURLType : ( ( rule__URLType__Group__0 ) ) ;
    public final void ruleURLType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:848:2: ( ( ( rule__URLType__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:849:1: ( ( rule__URLType__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:849:1: ( ( rule__URLType__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:850:1: ( rule__URLType__Group__0 )
            {
             before(grammarAccess.getURLTypeAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:851:1: ( rule__URLType__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:851:2: rule__URLType__Group__0
            {
            pushFollow(FOLLOW_rule__URLType__Group__0_in_ruleURLType1715);
            rule__URLType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getURLTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleURLType"


    // $ANTLR start "entryRuleNUMBER"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:864:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:865:1: ( ruleNUMBER EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:866:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER1742);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER1749); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:873:1: ruleNUMBER : ( rulenum ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:877:2: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:878:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:878:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:879:1: rulenum
            {
             before(grammarAccess.getNUMBERAccess().getNumParserRuleCall()); 
            pushFollow(FOLLOW_rulenum_in_ruleNUMBER1775);
            rulenum();

            state._fsp--;

             after(grammarAccess.getNUMBERAccess().getNumParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRulePERCENTAGE"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:892:1: entryRulePERCENTAGE : rulePERCENTAGE EOF ;
    public final void entryRulePERCENTAGE() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:893:1: ( rulePERCENTAGE EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:894:1: rulePERCENTAGE EOF
            {
             before(grammarAccess.getPERCENTAGERule()); 
            pushFollow(FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE1801);
            rulePERCENTAGE();

            state._fsp--;

             after(grammarAccess.getPERCENTAGERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePERCENTAGE1808); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePERCENTAGE"


    // $ANTLR start "rulePERCENTAGE"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:901:1: rulePERCENTAGE : ( ( rule__PERCENTAGE__Group__0 ) ) ;
    public final void rulePERCENTAGE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:905:2: ( ( ( rule__PERCENTAGE__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:906:1: ( ( rule__PERCENTAGE__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:906:1: ( ( rule__PERCENTAGE__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:907:1: ( rule__PERCENTAGE__Group__0 )
            {
             before(grammarAccess.getPERCENTAGEAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:908:1: ( rule__PERCENTAGE__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:908:2: rule__PERCENTAGE__Group__0
            {
            pushFollow(FOLLOW_rule__PERCENTAGE__Group__0_in_rulePERCENTAGE1834);
            rule__PERCENTAGE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPERCENTAGEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePERCENTAGE"


    // $ANTLR start "entryRuleEMS"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:920:1: entryRuleEMS : ruleEMS EOF ;
    public final void entryRuleEMS() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:921:1: ( ruleEMS EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:922:1: ruleEMS EOF
            {
             before(grammarAccess.getEMSRule()); 
            pushFollow(FOLLOW_ruleEMS_in_entryRuleEMS1861);
            ruleEMS();

            state._fsp--;

             after(grammarAccess.getEMSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMS1868); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEMS"


    // $ANTLR start "ruleEMS"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:929:1: ruleEMS : ( ( rule__EMS__Group__0 ) ) ;
    public final void ruleEMS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:933:2: ( ( ( rule__EMS__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:934:1: ( ( rule__EMS__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:934:1: ( ( rule__EMS__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:935:1: ( rule__EMS__Group__0 )
            {
             before(grammarAccess.getEMSAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:936:1: ( rule__EMS__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:936:2: rule__EMS__Group__0
            {
            pushFollow(FOLLOW_rule__EMS__Group__0_in_ruleEMS1894);
            rule__EMS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEMSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEMS"


    // $ANTLR start "entryRuleEXS"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:948:1: entryRuleEXS : ruleEXS EOF ;
    public final void entryRuleEXS() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:949:1: ( ruleEXS EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:950:1: ruleEXS EOF
            {
             before(grammarAccess.getEXSRule()); 
            pushFollow(FOLLOW_ruleEXS_in_entryRuleEXS1921);
            ruleEXS();

            state._fsp--;

             after(grammarAccess.getEXSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXS1928); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXS"


    // $ANTLR start "ruleEXS"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:957:1: ruleEXS : ( ( rule__EXS__Group__0 ) ) ;
    public final void ruleEXS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:961:2: ( ( ( rule__EXS__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:962:1: ( ( rule__EXS__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:962:1: ( ( rule__EXS__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:963:1: ( rule__EXS__Group__0 )
            {
             before(grammarAccess.getEXSAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:964:1: ( rule__EXS__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:964:2: rule__EXS__Group__0
            {
            pushFollow(FOLLOW_rule__EXS__Group__0_in_ruleEXS1954);
            rule__EXS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEXSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXS"


    // $ANTLR start "entryRuleLENGTH"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:976:1: entryRuleLENGTH : ruleLENGTH EOF ;
    public final void entryRuleLENGTH() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:980:1: ( ruleLENGTH EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:981:1: ruleLENGTH EOF
            {
             before(grammarAccess.getLENGTHRule()); 
            pushFollow(FOLLOW_ruleLENGTH_in_entryRuleLENGTH1986);
            ruleLENGTH();

            state._fsp--;

             after(grammarAccess.getLENGTHRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLENGTH1993); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleLENGTH"


    // $ANTLR start "ruleLENGTH"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:991:1: ruleLENGTH : ( ( rule__LENGTH__Group__0 ) ) ;
    public final void ruleLENGTH() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:996:2: ( ( ( rule__LENGTH__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:997:1: ( ( rule__LENGTH__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:997:1: ( ( rule__LENGTH__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:998:1: ( rule__LENGTH__Group__0 )
            {
             before(grammarAccess.getLENGTHAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:999:1: ( rule__LENGTH__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:999:2: rule__LENGTH__Group__0
            {
            pushFollow(FOLLOW_rule__LENGTH__Group__0_in_ruleLENGTH2023);
            rule__LENGTH__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLENGTHAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleLENGTH"


    // $ANTLR start "entryRuleANGLE"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1012:1: entryRuleANGLE : ruleANGLE EOF ;
    public final void entryRuleANGLE() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1013:1: ( ruleANGLE EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1014:1: ruleANGLE EOF
            {
             before(grammarAccess.getANGLERule()); 
            pushFollow(FOLLOW_ruleANGLE_in_entryRuleANGLE2050);
            ruleANGLE();

            state._fsp--;

             after(grammarAccess.getANGLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANGLE2057); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleANGLE"


    // $ANTLR start "ruleANGLE"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1021:1: ruleANGLE : ( ( rule__ANGLE__Group__0 ) ) ;
    public final void ruleANGLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1025:2: ( ( ( rule__ANGLE__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1026:1: ( ( rule__ANGLE__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1026:1: ( ( rule__ANGLE__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1027:1: ( rule__ANGLE__Group__0 )
            {
             before(grammarAccess.getANGLEAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1028:1: ( rule__ANGLE__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1028:2: rule__ANGLE__Group__0
            {
            pushFollow(FOLLOW_rule__ANGLE__Group__0_in_ruleANGLE2083);
            rule__ANGLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getANGLEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleANGLE"


    // $ANTLR start "entryRuleTIME"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1040:1: entryRuleTIME : ruleTIME EOF ;
    public final void entryRuleTIME() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1041:1: ( ruleTIME EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1042:1: ruleTIME EOF
            {
             before(grammarAccess.getTIMERule()); 
            pushFollow(FOLLOW_ruleTIME_in_entryRuleTIME2110);
            ruleTIME();

            state._fsp--;

             after(grammarAccess.getTIMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTIME2117); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTIME"


    // $ANTLR start "ruleTIME"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1049:1: ruleTIME : ( ( rule__TIME__Group__0 ) ) ;
    public final void ruleTIME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1053:2: ( ( ( rule__TIME__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1054:1: ( ( rule__TIME__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1054:1: ( ( rule__TIME__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1055:1: ( rule__TIME__Group__0 )
            {
             before(grammarAccess.getTIMEAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1056:1: ( rule__TIME__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1056:2: rule__TIME__Group__0
            {
            pushFollow(FOLLOW_rule__TIME__Group__0_in_ruleTIME2143);
            rule__TIME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTIMEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTIME"


    // $ANTLR start "entryRuleFREQ"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1068:1: entryRuleFREQ : ruleFREQ EOF ;
    public final void entryRuleFREQ() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1069:1: ( ruleFREQ EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1070:1: ruleFREQ EOF
            {
             before(grammarAccess.getFREQRule()); 
            pushFollow(FOLLOW_ruleFREQ_in_entryRuleFREQ2170);
            ruleFREQ();

            state._fsp--;

             after(grammarAccess.getFREQRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFREQ2177); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFREQ"


    // $ANTLR start "ruleFREQ"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1077:1: ruleFREQ : ( ( rule__FREQ__Group__0 ) ) ;
    public final void ruleFREQ() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1081:2: ( ( ( rule__FREQ__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1082:1: ( ( rule__FREQ__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1082:1: ( ( rule__FREQ__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1083:1: ( rule__FREQ__Group__0 )
            {
             before(grammarAccess.getFREQAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1084:1: ( rule__FREQ__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1084:2: rule__FREQ__Group__0
            {
            pushFollow(FOLLOW_rule__FREQ__Group__0_in_ruleFREQ2203);
            rule__FREQ__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFREQAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFREQ"


    // $ANTLR start "rule__Stylesheet__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1096:1: rule__Stylesheet__Alternatives : ( ( ( rule__Stylesheet__RulesetAssignment_0 ) ) | ( ( rule__Stylesheet__MediaAssignment_1 ) ) );
    public final void rule__Stylesheet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1100:1: ( ( ( rule__Stylesheet__RulesetAssignment_0 ) ) | ( ( rule__Stylesheet__MediaAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_IDENT && LA3_0<=RULE_HEXDIGITS)||LA3_0==14||(LA3_0>=37 && LA3_0<=39)||LA3_0==41) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1101:1: ( ( rule__Stylesheet__RulesetAssignment_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1101:1: ( ( rule__Stylesheet__RulesetAssignment_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1102:1: ( rule__Stylesheet__RulesetAssignment_0 )
                    {
                     before(grammarAccess.getStylesheetAccess().getRulesetAssignment_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1103:1: ( rule__Stylesheet__RulesetAssignment_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1103:2: rule__Stylesheet__RulesetAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__RulesetAssignment_0_in_rule__Stylesheet__Alternatives2239);
                    rule__Stylesheet__RulesetAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStylesheetAccess().getRulesetAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1107:6: ( ( rule__Stylesheet__MediaAssignment_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1107:6: ( ( rule__Stylesheet__MediaAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1108:1: ( rule__Stylesheet__MediaAssignment_1 )
                    {
                     before(grammarAccess.getStylesheetAccess().getMediaAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1109:1: ( rule__Stylesheet__MediaAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1109:2: rule__Stylesheet__MediaAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__MediaAssignment_1_in_rule__Stylesheet__Alternatives2257);
                    rule__Stylesheet__MediaAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStylesheetAccess().getMediaAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__Alternatives"


    // $ANTLR start "rule__Selector__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1118:1: rule__Selector__Alternatives_1 : ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) );
    public final void rule__Selector__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1122:1: ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=16 && LA4_0<=17)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_WS) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1123:1: ( ( rule__Selector__Group_1_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1123:1: ( ( rule__Selector__Group_1_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1124:1: ( rule__Selector__Group_1_0__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1125:1: ( rule__Selector__Group_1_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1125:2: rule__Selector__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_0__0_in_rule__Selector__Alternatives_12290);
                    rule__Selector__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1129:6: ( ( rule__Selector__Group_1_1__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1129:6: ( ( rule__Selector__Group_1_1__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1130:1: ( rule__Selector__Group_1_1__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1131:1: ( rule__Selector__Group_1_1__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1131:2: rule__Selector__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_1__0_in_rule__Selector__Alternatives_12308);
                    rule__Selector__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Alternatives_1"


    // $ANTLR start "rule__Simple_selector__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1140:1: rule__Simple_selector__Alternatives : ( ( ( rule__Simple_selector__Group_0__0 ) ) | ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) ) );
    public final void rule__Simple_selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1144:1: ( ( ( rule__Simple_selector__Group_0__0 ) ) | ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_IDENT && LA6_0<=RULE_HEXDIGITS)||LA6_0==14) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=37 && LA6_0<=39)||LA6_0==41) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1145:1: ( ( rule__Simple_selector__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1145:1: ( ( rule__Simple_selector__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1146:1: ( rule__Simple_selector__Group_0__0 )
                    {
                     before(grammarAccess.getSimple_selectorAccess().getGroup_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1147:1: ( rule__Simple_selector__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1147:2: rule__Simple_selector__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__Group_0__0_in_rule__Simple_selector__Alternatives2341);
                    rule__Simple_selector__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_selectorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1151:6: ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1151:6: ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1152:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1152:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1153:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )
                    {
                     before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1154:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1154:2: rule__Simple_selector__SubSelectorsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives2361);
                    rule__Simple_selector__SubSelectorsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1157:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1158:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )*
                    {
                     before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1159:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=37 && LA5_0<=39)||LA5_0==41) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1159:2: rule__Simple_selector__SubSelectorsAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives2373);
                    	    rule__Simple_selector__SubSelectorsAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Alternatives"


    // $ANTLR start "rule__Element_name__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1169:1: rule__Element_name__Alternatives : ( ( RULE_HEXDIGITS ) | ( RULE_IDENT ) | ( '*' ) );
    public final void rule__Element_name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1173:1: ( ( RULE_HEXDIGITS ) | ( RULE_IDENT ) | ( '*' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_HEXDIGITS:
                {
                alt7=1;
                }
                break;
            case RULE_IDENT:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1174:1: ( RULE_HEXDIGITS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1174:1: ( RULE_HEXDIGITS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1175:1: RULE_HEXDIGITS
                    {
                     before(grammarAccess.getElement_nameAccess().getHexdigitsTerminalRuleCall_0()); 
                    match(input,RULE_HEXDIGITS,FOLLOW_RULE_HEXDIGITS_in_rule__Element_name__Alternatives2409); 
                     after(grammarAccess.getElement_nameAccess().getHexdigitsTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1180:6: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1180:6: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1181:1: RULE_IDENT
                    {
                     before(grammarAccess.getElement_nameAccess().getIDENTTerminalRuleCall_1()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Element_name__Alternatives2426); 
                     after(grammarAccess.getElement_nameAccess().getIDENTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1186:6: ( '*' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1186:6: ( '*' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1187:1: '*'
                    {
                     before(grammarAccess.getElement_nameAccess().getAsteriskKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__Element_name__Alternatives2444); 
                     after(grammarAccess.getElement_nameAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element_name__Alternatives"


    // $ANTLR start "rule__Sub_selector__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1199:1: rule__Sub_selector__Alternatives : ( ( ( rule__Sub_selector__IdAssignment_0 ) ) | ( ( rule__Sub_selector__ClassAssignment_1 ) ) | ( ( rule__Sub_selector__AttribAssignment_2 ) ) | ( ( rule__Sub_selector__PseudoclassAssignment_3 ) ) );
    public final void rule__Sub_selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1203:1: ( ( ( rule__Sub_selector__IdAssignment_0 ) ) | ( ( rule__Sub_selector__ClassAssignment_1 ) ) | ( ( rule__Sub_selector__AttribAssignment_2 ) ) | ( ( rule__Sub_selector__PseudoclassAssignment_3 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt8=1;
                }
                break;
            case 37:
                {
                alt8=2;
                }
                break;
            case 39:
                {
                alt8=3;
                }
                break;
            case 41:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1204:1: ( ( rule__Sub_selector__IdAssignment_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1204:1: ( ( rule__Sub_selector__IdAssignment_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1205:1: ( rule__Sub_selector__IdAssignment_0 )
                    {
                     before(grammarAccess.getSub_selectorAccess().getIdAssignment_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1206:1: ( rule__Sub_selector__IdAssignment_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1206:2: rule__Sub_selector__IdAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Sub_selector__IdAssignment_0_in_rule__Sub_selector__Alternatives2478);
                    rule__Sub_selector__IdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSub_selectorAccess().getIdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1210:6: ( ( rule__Sub_selector__ClassAssignment_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1210:6: ( ( rule__Sub_selector__ClassAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1211:1: ( rule__Sub_selector__ClassAssignment_1 )
                    {
                     before(grammarAccess.getSub_selectorAccess().getClassAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1212:1: ( rule__Sub_selector__ClassAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1212:2: rule__Sub_selector__ClassAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Sub_selector__ClassAssignment_1_in_rule__Sub_selector__Alternatives2496);
                    rule__Sub_selector__ClassAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSub_selectorAccess().getClassAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1216:6: ( ( rule__Sub_selector__AttribAssignment_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1216:6: ( ( rule__Sub_selector__AttribAssignment_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1217:1: ( rule__Sub_selector__AttribAssignment_2 )
                    {
                     before(grammarAccess.getSub_selectorAccess().getAttribAssignment_2()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1218:1: ( rule__Sub_selector__AttribAssignment_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1218:2: rule__Sub_selector__AttribAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Sub_selector__AttribAssignment_2_in_rule__Sub_selector__Alternatives2514);
                    rule__Sub_selector__AttribAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSub_selectorAccess().getAttribAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1222:6: ( ( rule__Sub_selector__PseudoclassAssignment_3 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1222:6: ( ( rule__Sub_selector__PseudoclassAssignment_3 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1223:1: ( rule__Sub_selector__PseudoclassAssignment_3 )
                    {
                     before(grammarAccess.getSub_selectorAccess().getPseudoclassAssignment_3()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1224:1: ( rule__Sub_selector__PseudoclassAssignment_3 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1224:2: rule__Sub_selector__PseudoclassAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Sub_selector__PseudoclassAssignment_3_in_rule__Sub_selector__Alternatives2532);
                    rule__Sub_selector__PseudoclassAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSub_selectorAccess().getPseudoclassAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sub_selector__Alternatives"


    // $ANTLR start "rule__Css_class__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1233:1: rule__Css_class__Alternatives_1 : ( ( RULE_HEXDIGITS ) | ( RULE_IDENT ) );
    public final void rule__Css_class__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1237:1: ( ( RULE_HEXDIGITS ) | ( RULE_IDENT ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_HEXDIGITS) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_IDENT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1238:1: ( RULE_HEXDIGITS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1238:1: ( RULE_HEXDIGITS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1239:1: RULE_HEXDIGITS
                    {
                     before(grammarAccess.getCss_classAccess().getHexdigitsTerminalRuleCall_1_0()); 
                    match(input,RULE_HEXDIGITS,FOLLOW_RULE_HEXDIGITS_in_rule__Css_class__Alternatives_12565); 
                     after(grammarAccess.getCss_classAccess().getHexdigitsTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1244:6: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1244:6: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1245:1: RULE_IDENT
                    {
                     before(grammarAccess.getCss_classAccess().getIDENTTerminalRuleCall_1_1()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_class__Alternatives_12582); 
                     after(grammarAccess.getCss_classAccess().getIDENTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_class__Alternatives_1"


    // $ANTLR start "rule__Css_id__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1255:1: rule__Css_id__Alternatives_1 : ( ( RULE_HEXDIGITS ) | ( RULE_IDENT ) );
    public final void rule__Css_id__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1259:1: ( ( RULE_HEXDIGITS ) | ( RULE_IDENT ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_HEXDIGITS) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_IDENT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1260:1: ( RULE_HEXDIGITS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1260:1: ( RULE_HEXDIGITS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1261:1: RULE_HEXDIGITS
                    {
                     before(grammarAccess.getCss_idAccess().getHexdigitsTerminalRuleCall_1_0()); 
                    match(input,RULE_HEXDIGITS,FOLLOW_RULE_HEXDIGITS_in_rule__Css_id__Alternatives_12614); 
                     after(grammarAccess.getCss_idAccess().getHexdigitsTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1266:6: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1266:6: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1267:1: RULE_IDENT
                    {
                     before(grammarAccess.getCss_idAccess().getIDENTTerminalRuleCall_1_1()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_id__Alternatives_12631); 
                     after(grammarAccess.getCss_idAccess().getIDENTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_id__Alternatives_1"


    // $ANTLR start "rule__Css_attrib__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1277:1: rule__Css_attrib__Alternatives_1 : ( ( RULE_HEXDIGITS ) | ( RULE_IDENT ) );
    public final void rule__Css_attrib__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1281:1: ( ( RULE_HEXDIGITS ) | ( RULE_IDENT ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_HEXDIGITS) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_IDENT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1282:1: ( RULE_HEXDIGITS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1282:1: ( RULE_HEXDIGITS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1283:1: RULE_HEXDIGITS
                    {
                     before(grammarAccess.getCss_attribAccess().getHexdigitsTerminalRuleCall_1_0()); 
                    match(input,RULE_HEXDIGITS,FOLLOW_RULE_HEXDIGITS_in_rule__Css_attrib__Alternatives_12663); 
                     after(grammarAccess.getCss_attribAccess().getHexdigitsTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1288:6: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1288:6: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1289:1: RULE_IDENT
                    {
                     before(grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_1_1()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_attrib__Alternatives_12680); 
                     after(grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Alternatives_1"


    // $ANTLR start "rule__Css_attrib__Alternatives_2_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1299:1: rule__Css_attrib__Alternatives_2_0 : ( ( '=' ) | ( RULE_INCLUDES ) | ( RULE_DASHMATCH ) );
    public final void rule__Css_attrib__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1303:1: ( ( '=' ) | ( RULE_INCLUDES ) | ( RULE_DASHMATCH ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt12=1;
                }
                break;
            case RULE_INCLUDES:
                {
                alt12=2;
                }
                break;
            case RULE_DASHMATCH:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1304:1: ( '=' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1304:1: ( '=' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1305:1: '='
                    {
                     before(grammarAccess.getCss_attribAccess().getEqualsSignKeyword_2_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__Css_attrib__Alternatives_2_02713); 
                     after(grammarAccess.getCss_attribAccess().getEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1312:6: ( RULE_INCLUDES )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1312:6: ( RULE_INCLUDES )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1313:1: RULE_INCLUDES
                    {
                     before(grammarAccess.getCss_attribAccess().getINCLUDESTerminalRuleCall_2_0_1()); 
                    match(input,RULE_INCLUDES,FOLLOW_RULE_INCLUDES_in_rule__Css_attrib__Alternatives_2_02732); 
                     after(grammarAccess.getCss_attribAccess().getINCLUDESTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1318:6: ( RULE_DASHMATCH )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1318:6: ( RULE_DASHMATCH )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1319:1: RULE_DASHMATCH
                    {
                     before(grammarAccess.getCss_attribAccess().getDASHMATCHTerminalRuleCall_2_0_2()); 
                    match(input,RULE_DASHMATCH,FOLLOW_RULE_DASHMATCH_in_rule__Css_attrib__Alternatives_2_02749); 
                     after(grammarAccess.getCss_attribAccess().getDASHMATCHTerminalRuleCall_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Alternatives_2_0"


    // $ANTLR start "rule__Css_attrib__Alternatives_2_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1329:1: rule__Css_attrib__Alternatives_2_1 : ( ( ( rule__Css_attrib__Alternatives_2_1_0 ) ) | ( RULE_STRING ) );
    public final void rule__Css_attrib__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1333:1: ( ( ( rule__Css_attrib__Alternatives_2_1_0 ) ) | ( RULE_STRING ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_IDENT && LA13_0<=RULE_HEXDIGITS)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1334:1: ( ( rule__Css_attrib__Alternatives_2_1_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1334:1: ( ( rule__Css_attrib__Alternatives_2_1_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1335:1: ( rule__Css_attrib__Alternatives_2_1_0 )
                    {
                     before(grammarAccess.getCss_attribAccess().getAlternatives_2_1_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1336:1: ( rule__Css_attrib__Alternatives_2_1_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1336:2: rule__Css_attrib__Alternatives_2_1_0
                    {
                    pushFollow(FOLLOW_rule__Css_attrib__Alternatives_2_1_0_in_rule__Css_attrib__Alternatives_2_12781);
                    rule__Css_attrib__Alternatives_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCss_attribAccess().getAlternatives_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1340:6: ( RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1340:6: ( RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1341:1: RULE_STRING
                    {
                     before(grammarAccess.getCss_attribAccess().getSTRINGTerminalRuleCall_2_1_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Css_attrib__Alternatives_2_12799); 
                     after(grammarAccess.getCss_attribAccess().getSTRINGTerminalRuleCall_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Alternatives_2_1"


    // $ANTLR start "rule__Css_attrib__Alternatives_2_1_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1351:1: rule__Css_attrib__Alternatives_2_1_0 : ( ( RULE_HEXDIGITS ) | ( RULE_IDENT ) );
    public final void rule__Css_attrib__Alternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1355:1: ( ( RULE_HEXDIGITS ) | ( RULE_IDENT ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_HEXDIGITS) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_IDENT) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1356:1: ( RULE_HEXDIGITS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1356:1: ( RULE_HEXDIGITS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1357:1: RULE_HEXDIGITS
                    {
                     before(grammarAccess.getCss_attribAccess().getHexdigitsTerminalRuleCall_2_1_0_0()); 
                    match(input,RULE_HEXDIGITS,FOLLOW_RULE_HEXDIGITS_in_rule__Css_attrib__Alternatives_2_1_02831); 
                     after(grammarAccess.getCss_attribAccess().getHexdigitsTerminalRuleCall_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1362:6: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1362:6: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1363:1: RULE_IDENT
                    {
                     before(grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_2_1_0_1()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_attrib__Alternatives_2_1_02848); 
                     after(grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Alternatives_2_1_0"


    // $ANTLR start "rule__Css_property__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1373:1: rule__Css_property__Alternatives_1 : ( ( RULE_IDENT ) | ( RULE_HEXDIGITS ) );
    public final void rule__Css_property__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1377:1: ( ( RULE_IDENT ) | ( RULE_HEXDIGITS ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_IDENT) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_HEXDIGITS) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1378:1: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1378:1: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1379:1: RULE_IDENT
                    {
                     before(grammarAccess.getCss_propertyAccess().getIDENTTerminalRuleCall_1_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_property__Alternatives_12880); 
                     after(grammarAccess.getCss_propertyAccess().getIDENTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1384:6: ( RULE_HEXDIGITS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1384:6: ( RULE_HEXDIGITS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1385:1: RULE_HEXDIGITS
                    {
                     before(grammarAccess.getCss_propertyAccess().getHexdigitsTerminalRuleCall_1_1()); 
                    match(input,RULE_HEXDIGITS,FOLLOW_RULE_HEXDIGITS_in_rule__Css_property__Alternatives_12897); 
                     after(grammarAccess.getCss_propertyAccess().getHexdigitsTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_property__Alternatives_1"


    // $ANTLR start "rule__Combinator__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1395:1: rule__Combinator__Alternatives_0 : ( ( '+' ) | ( '>' ) );
    public final void rule__Combinator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1399:1: ( ( '+' ) | ( '>' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            else if ( (LA16_0==17) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1400:1: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1400:1: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1401:1: '+'
                    {
                     before(grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Combinator__Alternatives_02930); 
                     after(grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1408:6: ( '>' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1408:6: ( '>' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1409:1: '>'
                    {
                     before(grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Combinator__Alternatives_02950); 
                     after(grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combinator__Alternatives_0"


    // $ANTLR start "rule__Operator__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1421:1: rule__Operator__Alternatives : ( ( '/' ) | ( RULE_COMMA ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1425:1: ( ( '/' ) | ( RULE_COMMA ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_COMMA) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1426:1: ( '/' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1426:1: ( '/' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1427:1: '/'
                    {
                     before(grammarAccess.getOperatorAccess().getSolidusKeyword_0()); 
                    match(input,18,FOLLOW_18_in_rule__Operator__Alternatives2985); 
                     after(grammarAccess.getOperatorAccess().getSolidusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1434:6: ( RULE_COMMA )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1434:6: ( RULE_COMMA )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1435:1: RULE_COMMA
                    {
                     before(grammarAccess.getOperatorAccess().getCOMMATerminalRuleCall_1()); 
                    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Operator__Alternatives3004); 
                     after(grammarAccess.getOperatorAccess().getCOMMATerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Unary_operator__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1445:1: rule__Unary_operator__Alternatives : ( ( '-' ) | ( '+' ) );
    public final void rule__Unary_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1449:1: ( ( '-' ) | ( '+' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            else if ( (LA18_0==16) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1450:1: ( '-' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1450:1: ( '-' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1451:1: '-'
                    {
                     before(grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__Unary_operator__Alternatives3037); 
                     after(grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1458:6: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1458:6: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1459:1: '+'
                    {
                     before(grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__Unary_operator__Alternatives3057); 
                     after(grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary_operator__Alternatives"


    // $ANTLR start "rule__Term__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1471:1: rule__Term__Alternatives : ( ( ( rule__Term__NumberAssignment_0 ) ) | ( ( rule__Term__StringValueAssignment_1 ) ) | ( ( rule__Term__IdentifierAssignment_2 ) ) | ( ( rule__Term__UrlAssignment_3 ) ) | ( ( rule__Term__FunctionAssignment_4 ) ) | ( ( rule__Term__HexColorAssignment_5 ) ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1475:1: ( ( ( rule__Term__NumberAssignment_0 ) ) | ( ( rule__Term__StringValueAssignment_1 ) ) | ( ( rule__Term__IdentifierAssignment_2 ) ) | ( ( rule__Term__UrlAssignment_3 ) ) | ( ( rule__Term__FunctionAssignment_4 ) ) | ( ( rule__Term__HexColorAssignment_5 ) ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                switch ( input.LA(2) ) {
                case RULE_INTEGER:
                case RULE_REAL:
                    {
                    alt19=1;
                    }
                    break;
                case RULE_IDENT:
                    {
                    int LA19_4 = input.LA(3);

                    if ( (LA19_4==EOF||(LA19_4>=RULE_IDENT && LA19_4<=RULE_HEXDIGITS)||(LA19_4>=RULE_STRING && LA19_4<=RULE_WS)||LA19_4==16||(LA19_4>=18 && LA19_4<=19)||LA19_4==36||LA19_4==38||(LA19_4>=43 && LA19_4<=44)) ) {
                        alt19=3;
                    }
                    else if ( (LA19_4==42) ) {
                        alt19=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_HEXDIGITS:
                    {
                    alt19=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_INTEGER:
            case RULE_REAL:
            case 16:
                {
                alt19=1;
                }
                break;
            case RULE_STRING:
                {
                alt19=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA19_4 = input.LA(2);

                if ( (LA19_4==EOF||(LA19_4>=RULE_IDENT && LA19_4<=RULE_HEXDIGITS)||(LA19_4>=RULE_STRING && LA19_4<=RULE_WS)||LA19_4==16||(LA19_4>=18 && LA19_4<=19)||LA19_4==36||LA19_4==38||(LA19_4>=43 && LA19_4<=44)) ) {
                    alt19=3;
                }
                else if ( (LA19_4==42) ) {
                    alt19=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HEXDIGITS:
                {
                alt19=3;
                }
                break;
            case 44:
                {
                alt19=4;
                }
                break;
            case 38:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1476:1: ( ( rule__Term__NumberAssignment_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1476:1: ( ( rule__Term__NumberAssignment_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1477:1: ( rule__Term__NumberAssignment_0 )
                    {
                     before(grammarAccess.getTermAccess().getNumberAssignment_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1478:1: ( rule__Term__NumberAssignment_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1478:2: rule__Term__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Term__NumberAssignment_0_in_rule__Term__Alternatives3091);
                    rule__Term__NumberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getNumberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1482:6: ( ( rule__Term__StringValueAssignment_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1482:6: ( ( rule__Term__StringValueAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1483:1: ( rule__Term__StringValueAssignment_1 )
                    {
                     before(grammarAccess.getTermAccess().getStringValueAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1484:1: ( rule__Term__StringValueAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1484:2: rule__Term__StringValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Term__StringValueAssignment_1_in_rule__Term__Alternatives3109);
                    rule__Term__StringValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getStringValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1488:6: ( ( rule__Term__IdentifierAssignment_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1488:6: ( ( rule__Term__IdentifierAssignment_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1489:1: ( rule__Term__IdentifierAssignment_2 )
                    {
                     before(grammarAccess.getTermAccess().getIdentifierAssignment_2()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1490:1: ( rule__Term__IdentifierAssignment_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1490:2: rule__Term__IdentifierAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Term__IdentifierAssignment_2_in_rule__Term__Alternatives3127);
                    rule__Term__IdentifierAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getIdentifierAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1494:6: ( ( rule__Term__UrlAssignment_3 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1494:6: ( ( rule__Term__UrlAssignment_3 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1495:1: ( rule__Term__UrlAssignment_3 )
                    {
                     before(grammarAccess.getTermAccess().getUrlAssignment_3()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1496:1: ( rule__Term__UrlAssignment_3 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1496:2: rule__Term__UrlAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Term__UrlAssignment_3_in_rule__Term__Alternatives3145);
                    rule__Term__UrlAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getUrlAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1500:6: ( ( rule__Term__FunctionAssignment_4 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1500:6: ( ( rule__Term__FunctionAssignment_4 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1501:1: ( rule__Term__FunctionAssignment_4 )
                    {
                     before(grammarAccess.getTermAccess().getFunctionAssignment_4()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1502:1: ( rule__Term__FunctionAssignment_4 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1502:2: rule__Term__FunctionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Term__FunctionAssignment_4_in_rule__Term__Alternatives3163);
                    rule__Term__FunctionAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getFunctionAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1506:6: ( ( rule__Term__HexColorAssignment_5 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1506:6: ( ( rule__Term__HexColorAssignment_5 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1507:1: ( rule__Term__HexColorAssignment_5 )
                    {
                     before(grammarAccess.getTermAccess().getHexColorAssignment_5()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1508:1: ( rule__Term__HexColorAssignment_5 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1508:2: rule__Term__HexColorAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Term__HexColorAssignment_5_in_rule__Term__Alternatives3181);
                    rule__Term__HexColorAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getHexColorAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__NumberTerm__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1517:1: rule__NumberTerm__Alternatives_1 : ( ( ruleNUMBER ) | ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) );
    public final void rule__NumberTerm__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1521:1: ( ( ruleNUMBER ) | ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) )
            int alt20=8;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1522:1: ( ruleNUMBER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1522:1: ( ruleNUMBER )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1523:1: ruleNUMBER
                    {
                     before(grammarAccess.getNumberTermAccess().getNUMBERParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleNUMBER_in_rule__NumberTerm__Alternatives_13214);
                    ruleNUMBER();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getNUMBERParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1528:6: ( rulePERCENTAGE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1528:6: ( rulePERCENTAGE )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1529:1: rulePERCENTAGE
                    {
                     before(grammarAccess.getNumberTermAccess().getPERCENTAGEParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_rulePERCENTAGE_in_rule__NumberTerm__Alternatives_13231);
                    rulePERCENTAGE();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getPERCENTAGEParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1534:6: ( ruleLENGTH )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1534:6: ( ruleLENGTH )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1535:1: ruleLENGTH
                    {
                     before(grammarAccess.getNumberTermAccess().getLENGTHParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_ruleLENGTH_in_rule__NumberTerm__Alternatives_13248);
                    ruleLENGTH();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getLENGTHParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1540:6: ( ruleEMS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1540:6: ( ruleEMS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1541:1: ruleEMS
                    {
                     before(grammarAccess.getNumberTermAccess().getEMSParserRuleCall_1_3()); 
                    pushFollow(FOLLOW_ruleEMS_in_rule__NumberTerm__Alternatives_13265);
                    ruleEMS();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getEMSParserRuleCall_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1546:6: ( ruleEXS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1546:6: ( ruleEXS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1547:1: ruleEXS
                    {
                     before(grammarAccess.getNumberTermAccess().getEXSParserRuleCall_1_4()); 
                    pushFollow(FOLLOW_ruleEXS_in_rule__NumberTerm__Alternatives_13282);
                    ruleEXS();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getEXSParserRuleCall_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1552:6: ( ruleANGLE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1552:6: ( ruleANGLE )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1553:1: ruleANGLE
                    {
                     before(grammarAccess.getNumberTermAccess().getANGLEParserRuleCall_1_5()); 
                    pushFollow(FOLLOW_ruleANGLE_in_rule__NumberTerm__Alternatives_13299);
                    ruleANGLE();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getANGLEParserRuleCall_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1558:6: ( ruleTIME )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1558:6: ( ruleTIME )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1559:1: ruleTIME
                    {
                     before(grammarAccess.getNumberTermAccess().getTIMEParserRuleCall_1_6()); 
                    pushFollow(FOLLOW_ruleTIME_in_rule__NumberTerm__Alternatives_13316);
                    ruleTIME();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getTIMEParserRuleCall_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1564:6: ( ruleFREQ )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1564:6: ( ruleFREQ )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1565:1: ruleFREQ
                    {
                     before(grammarAccess.getNumberTermAccess().getFREQParserRuleCall_1_7()); 
                    pushFollow(FOLLOW_ruleFREQ_in_rule__NumberTerm__Alternatives_13333);
                    ruleFREQ();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getFREQParserRuleCall_1_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTerm__Alternatives_1"


    // $ANTLR start "rule__Num__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1575:1: rule__Num__Alternatives : ( ( RULE_INTEGER ) | ( RULE_REAL ) );
    public final void rule__Num__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1579:1: ( ( RULE_INTEGER ) | ( RULE_REAL ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INTEGER) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_REAL) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1580:1: ( RULE_INTEGER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1580:1: ( RULE_INTEGER )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1581:1: RULE_INTEGER
                    {
                     before(grammarAccess.getNumAccess().getIntegerTerminalRuleCall_0()); 
                    match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__Num__Alternatives3365); 
                     after(grammarAccess.getNumAccess().getIntegerTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1586:6: ( RULE_REAL )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1586:6: ( RULE_REAL )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1587:1: RULE_REAL
                    {
                     before(grammarAccess.getNumAccess().getRealTerminalRuleCall_1()); 
                    match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Num__Alternatives3382); 
                     after(grammarAccess.getNumAccess().getRealTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__Alternatives"


    // $ANTLR start "rule__HexColor__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1597:1: rule__HexColor__Alternatives_1 : ( ( RULE_HEXDIGITS ) | ( RULE_INTEGER ) );
    public final void rule__HexColor__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1601:1: ( ( RULE_HEXDIGITS ) | ( RULE_INTEGER ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_HEXDIGITS) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_INTEGER) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1602:1: ( RULE_HEXDIGITS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1602:1: ( RULE_HEXDIGITS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1603:1: RULE_HEXDIGITS
                    {
                     before(grammarAccess.getHexColorAccess().getHexdigitsTerminalRuleCall_1_0()); 
                    match(input,RULE_HEXDIGITS,FOLLOW_RULE_HEXDIGITS_in_rule__HexColor__Alternatives_13414); 
                     after(grammarAccess.getHexColorAccess().getHexdigitsTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1608:6: ( RULE_INTEGER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1608:6: ( RULE_INTEGER )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1609:1: RULE_INTEGER
                    {
                     before(grammarAccess.getHexColorAccess().getIntegerTerminalRuleCall_1_1()); 
                    match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__HexColor__Alternatives_13431); 
                     after(grammarAccess.getHexColorAccess().getIntegerTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HexColor__Alternatives_1"


    // $ANTLR start "rule__LENGTH__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1619:1: rule__LENGTH__Alternatives_1 : ( ( 'px' ) | ( 'cm' ) | ( 'mm' ) | ( 'in' ) | ( 'pt' ) | ( 'pc' ) );
    public final void rule__LENGTH__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1623:1: ( ( 'px' ) | ( 'cm' ) | ( 'mm' ) | ( 'in' ) | ( 'pt' ) | ( 'pc' ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt23=1;
                }
                break;
            case 21:
                {
                alt23=2;
                }
                break;
            case 22:
                {
                alt23=3;
                }
                break;
            case 23:
                {
                alt23=4;
                }
                break;
            case 24:
                {
                alt23=5;
                }
                break;
            case 25:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1624:1: ( 'px' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1624:1: ( 'px' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1625:1: 'px'
                    {
                     before(grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 
                    match(input,20,FOLLOW_20_in_rule__LENGTH__Alternatives_13464); 
                     after(grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1632:6: ( 'cm' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1632:6: ( 'cm' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1633:1: 'cm'
                    {
                     before(grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 
                    match(input,21,FOLLOW_21_in_rule__LENGTH__Alternatives_13484); 
                     after(grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1640:6: ( 'mm' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1640:6: ( 'mm' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1641:1: 'mm'
                    {
                     before(grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 
                    match(input,22,FOLLOW_22_in_rule__LENGTH__Alternatives_13504); 
                     after(grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1648:6: ( 'in' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1648:6: ( 'in' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1649:1: 'in'
                    {
                     before(grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 
                    match(input,23,FOLLOW_23_in_rule__LENGTH__Alternatives_13524); 
                     after(grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1656:6: ( 'pt' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1656:6: ( 'pt' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1657:1: 'pt'
                    {
                     before(grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 
                    match(input,24,FOLLOW_24_in_rule__LENGTH__Alternatives_13544); 
                     after(grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1664:6: ( 'pc' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1664:6: ( 'pc' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1665:1: 'pc'
                    {
                     before(grammarAccess.getLENGTHAccess().getPcKeyword_1_5()); 
                    match(input,25,FOLLOW_25_in_rule__LENGTH__Alternatives_13564); 
                     after(grammarAccess.getLENGTHAccess().getPcKeyword_1_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Alternatives_1"


    // $ANTLR start "rule__ANGLE__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1677:1: rule__ANGLE__Alternatives_1 : ( ( 'deg' ) | ( 'rad' ) | ( 'grad' ) );
    public final void rule__ANGLE__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1681:1: ( ( 'deg' ) | ( 'rad' ) | ( 'grad' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt24=1;
                }
                break;
            case 27:
                {
                alt24=2;
                }
                break;
            case 28:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1682:1: ( 'deg' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1682:1: ( 'deg' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1683:1: 'deg'
                    {
                     before(grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 
                    match(input,26,FOLLOW_26_in_rule__ANGLE__Alternatives_13599); 
                     after(grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1690:6: ( 'rad' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1690:6: ( 'rad' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1691:1: 'rad'
                    {
                     before(grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 
                    match(input,27,FOLLOW_27_in_rule__ANGLE__Alternatives_13619); 
                     after(grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1698:6: ( 'grad' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1698:6: ( 'grad' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1699:1: 'grad'
                    {
                     before(grammarAccess.getANGLEAccess().getGradKeyword_1_2()); 
                    match(input,28,FOLLOW_28_in_rule__ANGLE__Alternatives_13639); 
                     after(grammarAccess.getANGLEAccess().getGradKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Alternatives_1"


    // $ANTLR start "rule__TIME__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1711:1: rule__TIME__Alternatives_1 : ( ( 'ms' ) | ( 's' ) );
    public final void rule__TIME__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1715:1: ( ( 'ms' ) | ( 's' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            else if ( (LA25_0==30) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1716:1: ( 'ms' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1716:1: ( 'ms' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1717:1: 'ms'
                    {
                     before(grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 
                    match(input,29,FOLLOW_29_in_rule__TIME__Alternatives_13674); 
                     after(grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1724:6: ( 's' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1724:6: ( 's' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1725:1: 's'
                    {
                     before(grammarAccess.getTIMEAccess().getSKeyword_1_1()); 
                    match(input,30,FOLLOW_30_in_rule__TIME__Alternatives_13694); 
                     after(grammarAccess.getTIMEAccess().getSKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Alternatives_1"


    // $ANTLR start "rule__FREQ__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1737:1: rule__FREQ__Alternatives_1 : ( ( 'hz' ) | ( 'khz' ) );
    public final void rule__FREQ__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1741:1: ( ( 'hz' ) | ( 'khz' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            else if ( (LA26_0==32) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1742:1: ( 'hz' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1742:1: ( 'hz' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1743:1: 'hz'
                    {
                     before(grammarAccess.getFREQAccess().getHzKeyword_1_0()); 
                    match(input,31,FOLLOW_31_in_rule__FREQ__Alternatives_13729); 
                     after(grammarAccess.getFREQAccess().getHzKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1750:6: ( 'khz' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1750:6: ( 'khz' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1751:1: 'khz'
                    {
                     before(grammarAccess.getFREQAccess().getKhzKeyword_1_1()); 
                    match(input,32,FOLLOW_32_in_rule__FREQ__Alternatives_13749); 
                     after(grammarAccess.getFREQAccess().getKhzKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Alternatives_1"


    // $ANTLR start "rule__Media__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1765:1: rule__Media__Group__0 : rule__Media__Group__0__Impl rule__Media__Group__1 ;
    public final void rule__Media__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1769:1: ( rule__Media__Group__0__Impl rule__Media__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1770:2: rule__Media__Group__0__Impl rule__Media__Group__1
            {
            pushFollow(FOLLOW_rule__Media__Group__0__Impl_in_rule__Media__Group__03781);
            rule__Media__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media__Group__1_in_rule__Media__Group__03784);
            rule__Media__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__0"


    // $ANTLR start "rule__Media__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1777:1: rule__Media__Group__0__Impl : ( 'media' ) ;
    public final void rule__Media__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1781:1: ( ( 'media' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1782:1: ( 'media' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1782:1: ( 'media' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1783:1: 'media'
            {
             before(grammarAccess.getMediaAccess().getMediaKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Media__Group__0__Impl3812); 
             after(grammarAccess.getMediaAccess().getMediaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__0__Impl"


    // $ANTLR start "rule__Media__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1796:1: rule__Media__Group__1 : rule__Media__Group__1__Impl rule__Media__Group__2 ;
    public final void rule__Media__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1800:1: ( rule__Media__Group__1__Impl rule__Media__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1801:2: rule__Media__Group__1__Impl rule__Media__Group__2
            {
            pushFollow(FOLLOW_rule__Media__Group__1__Impl_in_rule__Media__Group__13843);
            rule__Media__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media__Group__2_in_rule__Media__Group__13846);
            rule__Media__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__1"


    // $ANTLR start "rule__Media__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1808:1: rule__Media__Group__1__Impl : ( ( rule__Media__MedialistAssignment_1 ) ) ;
    public final void rule__Media__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1812:1: ( ( ( rule__Media__MedialistAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1813:1: ( ( rule__Media__MedialistAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1813:1: ( ( rule__Media__MedialistAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1814:1: ( rule__Media__MedialistAssignment_1 )
            {
             before(grammarAccess.getMediaAccess().getMedialistAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1815:1: ( rule__Media__MedialistAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1815:2: rule__Media__MedialistAssignment_1
            {
            pushFollow(FOLLOW_rule__Media__MedialistAssignment_1_in_rule__Media__Group__1__Impl3873);
            rule__Media__MedialistAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMediaAccess().getMedialistAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__1__Impl"


    // $ANTLR start "rule__Media__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1825:1: rule__Media__Group__2 : rule__Media__Group__2__Impl rule__Media__Group__3 ;
    public final void rule__Media__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1829:1: ( rule__Media__Group__2__Impl rule__Media__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1830:2: rule__Media__Group__2__Impl rule__Media__Group__3
            {
            pushFollow(FOLLOW_rule__Media__Group__2__Impl_in_rule__Media__Group__23903);
            rule__Media__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media__Group__3_in_rule__Media__Group__23906);
            rule__Media__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__2"


    // $ANTLR start "rule__Media__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1837:1: rule__Media__Group__2__Impl : ( '{' ) ;
    public final void rule__Media__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1841:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1842:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1842:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1843:1: '{'
            {
             before(grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Media__Group__2__Impl3934); 
             after(grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__2__Impl"


    // $ANTLR start "rule__Media__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1856:1: rule__Media__Group__3 : rule__Media__Group__3__Impl rule__Media__Group__4 ;
    public final void rule__Media__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1860:1: ( rule__Media__Group__3__Impl rule__Media__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1861:2: rule__Media__Group__3__Impl rule__Media__Group__4
            {
            pushFollow(FOLLOW_rule__Media__Group__3__Impl_in_rule__Media__Group__33965);
            rule__Media__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media__Group__4_in_rule__Media__Group__33968);
            rule__Media__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__3"


    // $ANTLR start "rule__Media__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1868:1: rule__Media__Group__3__Impl : ( ( rule__Media__RulesetsAssignment_3 )* ) ;
    public final void rule__Media__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1872:1: ( ( ( rule__Media__RulesetsAssignment_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1873:1: ( ( rule__Media__RulesetsAssignment_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1873:1: ( ( rule__Media__RulesetsAssignment_3 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1874:1: ( rule__Media__RulesetsAssignment_3 )*
            {
             before(grammarAccess.getMediaAccess().getRulesetsAssignment_3()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1875:1: ( rule__Media__RulesetsAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_IDENT && LA27_0<=RULE_HEXDIGITS)||LA27_0==14||(LA27_0>=37 && LA27_0<=39)||LA27_0==41) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1875:2: rule__Media__RulesetsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Media__RulesetsAssignment_3_in_rule__Media__Group__3__Impl3995);
            	    rule__Media__RulesetsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMediaAccess().getRulesetsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__3__Impl"


    // $ANTLR start "rule__Media__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1885:1: rule__Media__Group__4 : rule__Media__Group__4__Impl ;
    public final void rule__Media__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1889:1: ( rule__Media__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1890:2: rule__Media__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Media__Group__4__Impl_in_rule__Media__Group__44026);
            rule__Media__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__4"


    // $ANTLR start "rule__Media__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1896:1: rule__Media__Group__4__Impl : ( '}' ) ;
    public final void rule__Media__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1900:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1901:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1901:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1902:1: '}'
            {
             before(grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__Media__Group__4__Impl4054); 
             after(grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Group__4__Impl"


    // $ANTLR start "rule__Media_list__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1925:1: rule__Media_list__Group__0 : rule__Media_list__Group__0__Impl rule__Media_list__Group__1 ;
    public final void rule__Media_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1929:1: ( rule__Media_list__Group__0__Impl rule__Media_list__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1930:2: rule__Media_list__Group__0__Impl rule__Media_list__Group__1
            {
            pushFollow(FOLLOW_rule__Media_list__Group__0__Impl_in_rule__Media_list__Group__04095);
            rule__Media_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media_list__Group__1_in_rule__Media_list__Group__04098);
            rule__Media_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group__0"


    // $ANTLR start "rule__Media_list__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1937:1: rule__Media_list__Group__0__Impl : ( rulemedium ) ;
    public final void rule__Media_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1941:1: ( ( rulemedium ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1942:1: ( rulemedium )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1942:1: ( rulemedium )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1943:1: rulemedium
            {
             before(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulemedium_in_rule__Media_list__Group__0__Impl4125);
            rulemedium();

            state._fsp--;

             after(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group__0__Impl"


    // $ANTLR start "rule__Media_list__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1954:1: rule__Media_list__Group__1 : rule__Media_list__Group__1__Impl ;
    public final void rule__Media_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1958:1: ( rule__Media_list__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1959:2: rule__Media_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Media_list__Group__1__Impl_in_rule__Media_list__Group__14154);
            rule__Media_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group__1"


    // $ANTLR start "rule__Media_list__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1965:1: rule__Media_list__Group__1__Impl : ( ( rule__Media_list__Group_1__0 )* ) ;
    public final void rule__Media_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1969:1: ( ( ( rule__Media_list__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1970:1: ( ( rule__Media_list__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1970:1: ( ( rule__Media_list__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1971:1: ( rule__Media_list__Group_1__0 )*
            {
             before(grammarAccess.getMedia_listAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1972:1: ( rule__Media_list__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_COMMA) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1972:2: rule__Media_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Media_list__Group_1__0_in_rule__Media_list__Group__1__Impl4181);
            	    rule__Media_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMedia_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group__1__Impl"


    // $ANTLR start "rule__Media_list__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1986:1: rule__Media_list__Group_1__0 : rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1 ;
    public final void rule__Media_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1990:1: ( rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1991:2: rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Media_list__Group_1__0__Impl_in_rule__Media_list__Group_1__04216);
            rule__Media_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media_list__Group_1__1_in_rule__Media_list__Group_1__04219);
            rule__Media_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group_1__0"


    // $ANTLR start "rule__Media_list__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1998:1: rule__Media_list__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Media_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2002:1: ( ( RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2003:1: ( RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2003:1: ( RULE_COMMA )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2004:1: RULE_COMMA
            {
             before(grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Media_list__Group_1__0__Impl4246); 
             after(grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group_1__0__Impl"


    // $ANTLR start "rule__Media_list__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2015:1: rule__Media_list__Group_1__1 : rule__Media_list__Group_1__1__Impl ;
    public final void rule__Media_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2019:1: ( rule__Media_list__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2020:2: rule__Media_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Media_list__Group_1__1__Impl_in_rule__Media_list__Group_1__14275);
            rule__Media_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group_1__1"


    // $ANTLR start "rule__Media_list__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2026:1: rule__Media_list__Group_1__1__Impl : ( rulemedium ) ;
    public final void rule__Media_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2030:1: ( ( rulemedium ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2031:1: ( rulemedium )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2031:1: ( rulemedium )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2032:1: rulemedium
            {
             before(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulemedium_in_rule__Media_list__Group_1__1__Impl4302);
            rulemedium();

            state._fsp--;

             after(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media_list__Group_1__1__Impl"


    // $ANTLR start "rule__Ruleset__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2047:1: rule__Ruleset__Group__0 : rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 ;
    public final void rule__Ruleset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2051:1: ( rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2052:2: rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__0__Impl_in_rule__Ruleset__Group__04335);
            rule__Ruleset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group__1_in_rule__Ruleset__Group__04338);
            rule__Ruleset__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__0"


    // $ANTLR start "rule__Ruleset__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2059:1: rule__Ruleset__Group__0__Impl : ( ( rule__Ruleset__SelectorsAssignment_0 ) ) ;
    public final void rule__Ruleset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2063:1: ( ( ( rule__Ruleset__SelectorsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2064:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2064:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2065:1: ( rule__Ruleset__SelectorsAssignment_0 )
            {
             before(grammarAccess.getRulesetAccess().getSelectorsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2066:1: ( rule__Ruleset__SelectorsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2066:2: rule__Ruleset__SelectorsAssignment_0
            {
            pushFollow(FOLLOW_rule__Ruleset__SelectorsAssignment_0_in_rule__Ruleset__Group__0__Impl4365);
            rule__Ruleset__SelectorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRulesetAccess().getSelectorsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__0__Impl"


    // $ANTLR start "rule__Ruleset__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2076:1: rule__Ruleset__Group__1 : rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 ;
    public final void rule__Ruleset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2080:1: ( rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2081:2: rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__1__Impl_in_rule__Ruleset__Group__14395);
            rule__Ruleset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group__2_in_rule__Ruleset__Group__14398);
            rule__Ruleset__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__1"


    // $ANTLR start "rule__Ruleset__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2088:1: rule__Ruleset__Group__1__Impl : ( ( rule__Ruleset__Group_1__0 )* ) ;
    public final void rule__Ruleset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2092:1: ( ( ( rule__Ruleset__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2093:1: ( ( rule__Ruleset__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2093:1: ( ( rule__Ruleset__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2094:1: ( rule__Ruleset__Group_1__0 )*
            {
             before(grammarAccess.getRulesetAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2095:1: ( rule__Ruleset__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2095:2: rule__Ruleset__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Ruleset__Group_1__0_in_rule__Ruleset__Group__1__Impl4425);
            	    rule__Ruleset__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getRulesetAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__1__Impl"


    // $ANTLR start "rule__Ruleset__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2105:1: rule__Ruleset__Group__2 : rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 ;
    public final void rule__Ruleset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2109:1: ( rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2110:2: rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__2__Impl_in_rule__Ruleset__Group__24456);
            rule__Ruleset__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group__3_in_rule__Ruleset__Group__24459);
            rule__Ruleset__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__2"


    // $ANTLR start "rule__Ruleset__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2117:1: rule__Ruleset__Group__2__Impl : ( '{' ) ;
    public final void rule__Ruleset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2121:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2122:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2122:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2123:1: '{'
            {
             before(grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Ruleset__Group__2__Impl4487); 
             after(grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__2__Impl"


    // $ANTLR start "rule__Ruleset__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2136:1: rule__Ruleset__Group__3 : rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 ;
    public final void rule__Ruleset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2140:1: ( rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2141:2: rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__3__Impl_in_rule__Ruleset__Group__34518);
            rule__Ruleset__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group__4_in_rule__Ruleset__Group__34521);
            rule__Ruleset__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__3"


    // $ANTLR start "rule__Ruleset__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2148:1: rule__Ruleset__Group__3__Impl : ( ( rule__Ruleset__Group_3__0 )* ) ;
    public final void rule__Ruleset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2152:1: ( ( ( rule__Ruleset__Group_3__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2153:1: ( ( rule__Ruleset__Group_3__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2153:1: ( ( rule__Ruleset__Group_3__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2154:1: ( rule__Ruleset__Group_3__0 )*
            {
             before(grammarAccess.getRulesetAccess().getGroup_3()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2155:1: ( rule__Ruleset__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_IDENT && LA30_0<=RULE_HEXDIGITS)||LA30_0==19) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2155:2: rule__Ruleset__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Ruleset__Group_3__0_in_rule__Ruleset__Group__3__Impl4548);
            	    rule__Ruleset__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getRulesetAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__3__Impl"


    // $ANTLR start "rule__Ruleset__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2165:1: rule__Ruleset__Group__4 : rule__Ruleset__Group__4__Impl ;
    public final void rule__Ruleset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2169:1: ( rule__Ruleset__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2170:2: rule__Ruleset__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__4__Impl_in_rule__Ruleset__Group__44579);
            rule__Ruleset__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__4"


    // $ANTLR start "rule__Ruleset__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2176:1: rule__Ruleset__Group__4__Impl : ( '}' ) ;
    public final void rule__Ruleset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2180:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2181:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2181:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2182:1: '}'
            {
             before(grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__Ruleset__Group__4__Impl4607); 
             after(grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group__4__Impl"


    // $ANTLR start "rule__Ruleset__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2205:1: rule__Ruleset__Group_1__0 : rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 ;
    public final void rule__Ruleset__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2209:1: ( rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2210:2: rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_1__0__Impl_in_rule__Ruleset__Group_1__04648);
            rule__Ruleset__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group_1__1_in_rule__Ruleset__Group_1__04651);
            rule__Ruleset__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__0"


    // $ANTLR start "rule__Ruleset__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2217:1: rule__Ruleset__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Ruleset__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2221:1: ( ( RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2222:1: ( RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2222:1: ( RULE_COMMA )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2223:1: RULE_COMMA
            {
             before(grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Ruleset__Group_1__0__Impl4678); 
             after(grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__0__Impl"


    // $ANTLR start "rule__Ruleset__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2234:1: rule__Ruleset__Group_1__1 : rule__Ruleset__Group_1__1__Impl ;
    public final void rule__Ruleset__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2238:1: ( rule__Ruleset__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2239:2: rule__Ruleset__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_1__1__Impl_in_rule__Ruleset__Group_1__14707);
            rule__Ruleset__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__1"


    // $ANTLR start "rule__Ruleset__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2245:1: rule__Ruleset__Group_1__1__Impl : ( ( rule__Ruleset__SelectorsAssignment_1_1 ) ) ;
    public final void rule__Ruleset__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2249:1: ( ( ( rule__Ruleset__SelectorsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2250:1: ( ( rule__Ruleset__SelectorsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2250:1: ( ( rule__Ruleset__SelectorsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2251:1: ( rule__Ruleset__SelectorsAssignment_1_1 )
            {
             before(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2252:1: ( rule__Ruleset__SelectorsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2252:2: rule__Ruleset__SelectorsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Ruleset__SelectorsAssignment_1_1_in_rule__Ruleset__Group_1__1__Impl4734);
            rule__Ruleset__SelectorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_1__1__Impl"


    // $ANTLR start "rule__Ruleset__Group_3__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2266:1: rule__Ruleset__Group_3__0 : rule__Ruleset__Group_3__0__Impl rule__Ruleset__Group_3__1 ;
    public final void rule__Ruleset__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2270:1: ( rule__Ruleset__Group_3__0__Impl rule__Ruleset__Group_3__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2271:2: rule__Ruleset__Group_3__0__Impl rule__Ruleset__Group_3__1
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_3__0__Impl_in_rule__Ruleset__Group_3__04768);
            rule__Ruleset__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group_3__1_in_rule__Ruleset__Group_3__04771);
            rule__Ruleset__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_3__0"


    // $ANTLR start "rule__Ruleset__Group_3__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2278:1: rule__Ruleset__Group_3__0__Impl : ( ( rule__Ruleset__DeclarationsAssignment_3_0 ) ) ;
    public final void rule__Ruleset__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2282:1: ( ( ( rule__Ruleset__DeclarationsAssignment_3_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2283:1: ( ( rule__Ruleset__DeclarationsAssignment_3_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2283:1: ( ( rule__Ruleset__DeclarationsAssignment_3_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2284:1: ( rule__Ruleset__DeclarationsAssignment_3_0 )
            {
             before(grammarAccess.getRulesetAccess().getDeclarationsAssignment_3_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2285:1: ( rule__Ruleset__DeclarationsAssignment_3_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2285:2: rule__Ruleset__DeclarationsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Ruleset__DeclarationsAssignment_3_0_in_rule__Ruleset__Group_3__0__Impl4798);
            rule__Ruleset__DeclarationsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRulesetAccess().getDeclarationsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_3__0__Impl"


    // $ANTLR start "rule__Ruleset__Group_3__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2295:1: rule__Ruleset__Group_3__1 : rule__Ruleset__Group_3__1__Impl ;
    public final void rule__Ruleset__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2299:1: ( rule__Ruleset__Group_3__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2300:2: rule__Ruleset__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_3__1__Impl_in_rule__Ruleset__Group_3__14828);
            rule__Ruleset__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_3__1"


    // $ANTLR start "rule__Ruleset__Group_3__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2306:1: rule__Ruleset__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Ruleset__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2310:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2311:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2311:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2312:1: ';'
            {
             before(grammarAccess.getRulesetAccess().getSemicolonKeyword_3_1()); 
            match(input,36,FOLLOW_36_in_rule__Ruleset__Group_3__1__Impl4856); 
             after(grammarAccess.getRulesetAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__Group_3__1__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2329:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2333:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2334:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__04891);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__04894);
            rule__Selector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0"


    // $ANTLR start "rule__Selector__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2341:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2345:1: ( ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2346:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2346:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2347:1: ( rule__Selector__SimpleselectorsAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2348:1: ( rule__Selector__SimpleselectorsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2348:2: rule__Selector__SimpleselectorsAssignment_0
            {
            pushFollow(FOLLOW_rule__Selector__SimpleselectorsAssignment_0_in_rule__Selector__Group__0__Impl4921);
            rule__Selector__SimpleselectorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2358:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2362:1: ( rule__Selector__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2363:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__14951);
            rule__Selector__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1"


    // $ANTLR start "rule__Selector__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2369:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Alternatives_1 )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2373:1: ( ( ( rule__Selector__Alternatives_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2374:1: ( ( rule__Selector__Alternatives_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2374:1: ( ( rule__Selector__Alternatives_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2375:1: ( rule__Selector__Alternatives_1 )?
            {
             before(grammarAccess.getSelectorAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2376:1: ( rule__Selector__Alternatives_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_WS||(LA31_0>=16 && LA31_0<=17)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2376:2: rule__Selector__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Selector__Alternatives_1_in_rule__Selector__Group__1__Impl4978);
                    rule__Selector__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2390:1: rule__Selector__Group_1_0__0 : rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 ;
    public final void rule__Selector__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2394:1: ( rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2395:2: rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_0__0__Impl_in_rule__Selector__Group_1_0__05013);
            rule__Selector__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1_0__1_in_rule__Selector__Group_1_0__05016);
            rule__Selector__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__0"


    // $ANTLR start "rule__Selector__Group_1_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2402:1: rule__Selector__Group_1_0__0__Impl : ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) ;
    public final void rule__Selector__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2406:1: ( ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2407:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2407:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2408:1: ( rule__Selector__CombinatorAssignment_1_0_0 )
            {
             before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2409:1: ( rule__Selector__CombinatorAssignment_1_0_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2409:2: rule__Selector__CombinatorAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Selector__CombinatorAssignment_1_0_0_in_rule__Selector__Group_1_0__0__Impl5043);
            rule__Selector__CombinatorAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2419:1: rule__Selector__Group_1_0__1 : rule__Selector__Group_1_0__1__Impl ;
    public final void rule__Selector__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2423:1: ( rule__Selector__Group_1_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2424:2: rule__Selector__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_0__1__Impl_in_rule__Selector__Group_1_0__15073);
            rule__Selector__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__1"


    // $ANTLR start "rule__Selector__Group_1_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2430:1: rule__Selector__Group_1_0__1__Impl : ( ( rule__Selector__SelectorAssignment_1_0_1 ) ) ;
    public final void rule__Selector__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2434:1: ( ( ( rule__Selector__SelectorAssignment_1_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2435:1: ( ( rule__Selector__SelectorAssignment_1_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2435:1: ( ( rule__Selector__SelectorAssignment_1_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2436:1: ( rule__Selector__SelectorAssignment_1_0_1 )
            {
             before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2437:1: ( rule__Selector__SelectorAssignment_1_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2437:2: rule__Selector__SelectorAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Selector__SelectorAssignment_1_0_1_in_rule__Selector__Group_1_0__1__Impl5100);
            rule__Selector__SelectorAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_0__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2451:1: rule__Selector__Group_1_1__0 : rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 ;
    public final void rule__Selector__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2455:1: ( rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2456:2: rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1__0__Impl_in_rule__Selector__Group_1_1__05134);
            rule__Selector__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1_1__1_in_rule__Selector__Group_1_1__05137);
            rule__Selector__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__0"


    // $ANTLR start "rule__Selector__Group_1_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2463:1: rule__Selector__Group_1_1__0__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__Selector__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2467:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2468:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2468:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2469:1: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2469:1: ( ( RULE_WS ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2470:1: ( RULE_WS )
            {
             before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2471:1: ( RULE_WS )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2471:3: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl5167); 

            }

             after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 

            }

            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2474:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2475:1: ( RULE_WS )*
            {
             before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2476:1: ( RULE_WS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2476:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl5180); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2487:1: rule__Selector__Group_1_1__1 : rule__Selector__Group_1_1__1__Impl ;
    public final void rule__Selector__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2491:1: ( rule__Selector__Group_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2492:2: rule__Selector__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1__1__Impl_in_rule__Selector__Group_1_1__15213);
            rule__Selector__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__1"


    // $ANTLR start "rule__Selector__Group_1_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2498:1: rule__Selector__Group_1_1__1__Impl : ( ( rule__Selector__Group_1_1_1__0 )? ) ;
    public final void rule__Selector__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2502:1: ( ( ( rule__Selector__Group_1_1_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2503:1: ( ( rule__Selector__Group_1_1_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2503:1: ( ( rule__Selector__Group_1_1_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2504:1: ( rule__Selector__Group_1_1_1__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_1_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2505:1: ( rule__Selector__Group_1_1_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_IDENT && LA33_0<=RULE_HEXDIGITS)||LA33_0==14||(LA33_0>=16 && LA33_0<=17)||(LA33_0>=37 && LA33_0<=39)||LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2505:2: rule__Selector__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_1_1__0_in_rule__Selector__Group_1_1__1__Impl5240);
                    rule__Selector__Group_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1__1__Impl"


    // $ANTLR start "rule__Selector__Group_1_1_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2519:1: rule__Selector__Group_1_1_1__0 : rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 ;
    public final void rule__Selector__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2523:1: ( rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2524:2: rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1_1__0__Impl_in_rule__Selector__Group_1_1_1__05275);
            rule__Selector__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1_1_1__1_in_rule__Selector__Group_1_1_1__05278);
            rule__Selector__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__0"


    // $ANTLR start "rule__Selector__Group_1_1_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2531:1: rule__Selector__Group_1_1_1__0__Impl : ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? ) ;
    public final void rule__Selector__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2535:1: ( ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2536:1: ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2536:1: ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2537:1: ( rule__Selector__CombinatorAssignment_1_1_1_0 )?
            {
             before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2538:1: ( rule__Selector__CombinatorAssignment_1_1_1_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=16 && LA34_0<=17)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2538:2: rule__Selector__CombinatorAssignment_1_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Selector__CombinatorAssignment_1_1_1_0_in_rule__Selector__Group_1_1_1__0__Impl5305);
                    rule__Selector__CombinatorAssignment_1_1_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Selector__Group_1_1_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2548:1: rule__Selector__Group_1_1_1__1 : rule__Selector__Group_1_1_1__1__Impl ;
    public final void rule__Selector__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2552:1: ( rule__Selector__Group_1_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2553:2: rule__Selector__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1_1__1__Impl_in_rule__Selector__Group_1_1_1__15336);
            rule__Selector__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__1"


    // $ANTLR start "rule__Selector__Group_1_1_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2559:1: rule__Selector__Group_1_1_1__1__Impl : ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) ) ;
    public final void rule__Selector__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2563:1: ( ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2564:1: ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2564:1: ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2565:1: ( rule__Selector__SelectorAssignment_1_1_1_1 )
            {
             before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2566:1: ( rule__Selector__SelectorAssignment_1_1_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2566:2: rule__Selector__SelectorAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Selector__SelectorAssignment_1_1_1_1_in_rule__Selector__Group_1_1_1__1__Impl5363);
            rule__Selector__SelectorAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Simple_selector__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2580:1: rule__Simple_selector__Group_0__0 : rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1 ;
    public final void rule__Simple_selector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2584:1: ( rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2585:2: rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1
            {
            pushFollow(FOLLOW_rule__Simple_selector__Group_0__0__Impl_in_rule__Simple_selector__Group_0__05397);
            rule__Simple_selector__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_selector__Group_0__1_in_rule__Simple_selector__Group_0__05400);
            rule__Simple_selector__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__0"


    // $ANTLR start "rule__Simple_selector__Group_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2592:1: rule__Simple_selector__Group_0__0__Impl : ( ( rule__Simple_selector__ElementAssignment_0_0 ) ) ;
    public final void rule__Simple_selector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2596:1: ( ( ( rule__Simple_selector__ElementAssignment_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2597:1: ( ( rule__Simple_selector__ElementAssignment_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2597:1: ( ( rule__Simple_selector__ElementAssignment_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2598:1: ( rule__Simple_selector__ElementAssignment_0_0 )
            {
             before(grammarAccess.getSimple_selectorAccess().getElementAssignment_0_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2599:1: ( rule__Simple_selector__ElementAssignment_0_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2599:2: rule__Simple_selector__ElementAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Simple_selector__ElementAssignment_0_0_in_rule__Simple_selector__Group_0__0__Impl5427);
            rule__Simple_selector__ElementAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_selectorAccess().getElementAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__0__Impl"


    // $ANTLR start "rule__Simple_selector__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2609:1: rule__Simple_selector__Group_0__1 : rule__Simple_selector__Group_0__1__Impl ;
    public final void rule__Simple_selector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2613:1: ( rule__Simple_selector__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2614:2: rule__Simple_selector__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Simple_selector__Group_0__1__Impl_in_rule__Simple_selector__Group_0__15457);
            rule__Simple_selector__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__1"


    // $ANTLR start "rule__Simple_selector__Group_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2620:1: rule__Simple_selector__Group_0__1__Impl : ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* ) ;
    public final void rule__Simple_selector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2624:1: ( ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2625:1: ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2625:1: ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2626:1: ( rule__Simple_selector__SubSelectorsAssignment_0_1 )*
            {
             before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_0_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2627:1: ( rule__Simple_selector__SubSelectorsAssignment_0_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=37 && LA35_0<=39)||LA35_0==41) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2627:2: rule__Simple_selector__SubSelectorsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Simple_selector__SubSelectorsAssignment_0_1_in_rule__Simple_selector__Group_0__1__Impl5484);
            	    rule__Simple_selector__SubSelectorsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__Group_0__1__Impl"


    // $ANTLR start "rule__Css_class__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2641:1: rule__Css_class__Group__0 : rule__Css_class__Group__0__Impl rule__Css_class__Group__1 ;
    public final void rule__Css_class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2645:1: ( rule__Css_class__Group__0__Impl rule__Css_class__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2646:2: rule__Css_class__Group__0__Impl rule__Css_class__Group__1
            {
            pushFollow(FOLLOW_rule__Css_class__Group__0__Impl_in_rule__Css_class__Group__05519);
            rule__Css_class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_class__Group__1_in_rule__Css_class__Group__05522);
            rule__Css_class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_class__Group__0"


    // $ANTLR start "rule__Css_class__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2653:1: rule__Css_class__Group__0__Impl : ( '.' ) ;
    public final void rule__Css_class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2657:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2658:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2658:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2659:1: '.'
            {
             before(grammarAccess.getCss_classAccess().getFullStopKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Css_class__Group__0__Impl5550); 
             after(grammarAccess.getCss_classAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_class__Group__0__Impl"


    // $ANTLR start "rule__Css_class__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2672:1: rule__Css_class__Group__1 : rule__Css_class__Group__1__Impl ;
    public final void rule__Css_class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2676:1: ( rule__Css_class__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2677:2: rule__Css_class__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_class__Group__1__Impl_in_rule__Css_class__Group__15581);
            rule__Css_class__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_class__Group__1"


    // $ANTLR start "rule__Css_class__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2683:1: rule__Css_class__Group__1__Impl : ( ( rule__Css_class__Alternatives_1 ) ) ;
    public final void rule__Css_class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2687:1: ( ( ( rule__Css_class__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2688:1: ( ( rule__Css_class__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2688:1: ( ( rule__Css_class__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2689:1: ( rule__Css_class__Alternatives_1 )
            {
             before(grammarAccess.getCss_classAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2690:1: ( rule__Css_class__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2690:2: rule__Css_class__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Css_class__Alternatives_1_in_rule__Css_class__Group__1__Impl5608);
            rule__Css_class__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCss_classAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_class__Group__1__Impl"


    // $ANTLR start "rule__Css_id__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2704:1: rule__Css_id__Group__0 : rule__Css_id__Group__0__Impl rule__Css_id__Group__1 ;
    public final void rule__Css_id__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2708:1: ( rule__Css_id__Group__0__Impl rule__Css_id__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2709:2: rule__Css_id__Group__0__Impl rule__Css_id__Group__1
            {
            pushFollow(FOLLOW_rule__Css_id__Group__0__Impl_in_rule__Css_id__Group__05642);
            rule__Css_id__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_id__Group__1_in_rule__Css_id__Group__05645);
            rule__Css_id__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_id__Group__0"


    // $ANTLR start "rule__Css_id__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2716:1: rule__Css_id__Group__0__Impl : ( '#' ) ;
    public final void rule__Css_id__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2720:1: ( ( '#' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2721:1: ( '#' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2721:1: ( '#' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2722:1: '#'
            {
             before(grammarAccess.getCss_idAccess().getNumberSignKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Css_id__Group__0__Impl5673); 
             after(grammarAccess.getCss_idAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_id__Group__0__Impl"


    // $ANTLR start "rule__Css_id__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2735:1: rule__Css_id__Group__1 : rule__Css_id__Group__1__Impl ;
    public final void rule__Css_id__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2739:1: ( rule__Css_id__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2740:2: rule__Css_id__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_id__Group__1__Impl_in_rule__Css_id__Group__15704);
            rule__Css_id__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_id__Group__1"


    // $ANTLR start "rule__Css_id__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2746:1: rule__Css_id__Group__1__Impl : ( ( rule__Css_id__Alternatives_1 ) ) ;
    public final void rule__Css_id__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2750:1: ( ( ( rule__Css_id__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2751:1: ( ( rule__Css_id__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2751:1: ( ( rule__Css_id__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2752:1: ( rule__Css_id__Alternatives_1 )
            {
             before(grammarAccess.getCss_idAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2753:1: ( rule__Css_id__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2753:2: rule__Css_id__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Css_id__Alternatives_1_in_rule__Css_id__Group__1__Impl5731);
            rule__Css_id__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCss_idAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_id__Group__1__Impl"


    // $ANTLR start "rule__Css_attrib__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2767:1: rule__Css_attrib__Group__0 : rule__Css_attrib__Group__0__Impl rule__Css_attrib__Group__1 ;
    public final void rule__Css_attrib__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2771:1: ( rule__Css_attrib__Group__0__Impl rule__Css_attrib__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2772:2: rule__Css_attrib__Group__0__Impl rule__Css_attrib__Group__1
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__0__Impl_in_rule__Css_attrib__Group__05765);
            rule__Css_attrib__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_attrib__Group__1_in_rule__Css_attrib__Group__05768);
            rule__Css_attrib__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__0"


    // $ANTLR start "rule__Css_attrib__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2779:1: rule__Css_attrib__Group__0__Impl : ( '[' ) ;
    public final void rule__Css_attrib__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2783:1: ( ( '[' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2784:1: ( '[' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2784:1: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2785:1: '['
            {
             before(grammarAccess.getCss_attribAccess().getLeftSquareBracketKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Css_attrib__Group__0__Impl5796); 
             after(grammarAccess.getCss_attribAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__0__Impl"


    // $ANTLR start "rule__Css_attrib__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2798:1: rule__Css_attrib__Group__1 : rule__Css_attrib__Group__1__Impl rule__Css_attrib__Group__2 ;
    public final void rule__Css_attrib__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2802:1: ( rule__Css_attrib__Group__1__Impl rule__Css_attrib__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2803:2: rule__Css_attrib__Group__1__Impl rule__Css_attrib__Group__2
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__1__Impl_in_rule__Css_attrib__Group__15827);
            rule__Css_attrib__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_attrib__Group__2_in_rule__Css_attrib__Group__15830);
            rule__Css_attrib__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__1"


    // $ANTLR start "rule__Css_attrib__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2810:1: rule__Css_attrib__Group__1__Impl : ( ( rule__Css_attrib__Alternatives_1 ) ) ;
    public final void rule__Css_attrib__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2814:1: ( ( ( rule__Css_attrib__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2815:1: ( ( rule__Css_attrib__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2815:1: ( ( rule__Css_attrib__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2816:1: ( rule__Css_attrib__Alternatives_1 )
            {
             before(grammarAccess.getCss_attribAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2817:1: ( rule__Css_attrib__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2817:2: rule__Css_attrib__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Css_attrib__Alternatives_1_in_rule__Css_attrib__Group__1__Impl5857);
            rule__Css_attrib__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCss_attribAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__1__Impl"


    // $ANTLR start "rule__Css_attrib__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2827:1: rule__Css_attrib__Group__2 : rule__Css_attrib__Group__2__Impl rule__Css_attrib__Group__3 ;
    public final void rule__Css_attrib__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2831:1: ( rule__Css_attrib__Group__2__Impl rule__Css_attrib__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2832:2: rule__Css_attrib__Group__2__Impl rule__Css_attrib__Group__3
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__2__Impl_in_rule__Css_attrib__Group__25887);
            rule__Css_attrib__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_attrib__Group__3_in_rule__Css_attrib__Group__25890);
            rule__Css_attrib__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__2"


    // $ANTLR start "rule__Css_attrib__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2839:1: rule__Css_attrib__Group__2__Impl : ( ( rule__Css_attrib__Group_2__0 )? ) ;
    public final void rule__Css_attrib__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2843:1: ( ( ( rule__Css_attrib__Group_2__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2844:1: ( ( rule__Css_attrib__Group_2__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2844:1: ( ( rule__Css_attrib__Group_2__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2845:1: ( rule__Css_attrib__Group_2__0 )?
            {
             before(grammarAccess.getCss_attribAccess().getGroup_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2846:1: ( rule__Css_attrib__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_INCLUDES && LA36_0<=RULE_DASHMATCH)||LA36_0==15) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2846:2: rule__Css_attrib__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Css_attrib__Group_2__0_in_rule__Css_attrib__Group__2__Impl5917);
                    rule__Css_attrib__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCss_attribAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__2__Impl"


    // $ANTLR start "rule__Css_attrib__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2856:1: rule__Css_attrib__Group__3 : rule__Css_attrib__Group__3__Impl ;
    public final void rule__Css_attrib__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2860:1: ( rule__Css_attrib__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2861:2: rule__Css_attrib__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__3__Impl_in_rule__Css_attrib__Group__35948);
            rule__Css_attrib__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__3"


    // $ANTLR start "rule__Css_attrib__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2867:1: rule__Css_attrib__Group__3__Impl : ( ']' ) ;
    public final void rule__Css_attrib__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2871:1: ( ( ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2872:1: ( ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2872:1: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2873:1: ']'
            {
             before(grammarAccess.getCss_attribAccess().getRightSquareBracketKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__Css_attrib__Group__3__Impl5976); 
             after(grammarAccess.getCss_attribAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group__3__Impl"


    // $ANTLR start "rule__Css_attrib__Group_2__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2894:1: rule__Css_attrib__Group_2__0 : rule__Css_attrib__Group_2__0__Impl rule__Css_attrib__Group_2__1 ;
    public final void rule__Css_attrib__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2898:1: ( rule__Css_attrib__Group_2__0__Impl rule__Css_attrib__Group_2__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2899:2: rule__Css_attrib__Group_2__0__Impl rule__Css_attrib__Group_2__1
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group_2__0__Impl_in_rule__Css_attrib__Group_2__06015);
            rule__Css_attrib__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_attrib__Group_2__1_in_rule__Css_attrib__Group_2__06018);
            rule__Css_attrib__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group_2__0"


    // $ANTLR start "rule__Css_attrib__Group_2__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2906:1: rule__Css_attrib__Group_2__0__Impl : ( ( rule__Css_attrib__Alternatives_2_0 ) ) ;
    public final void rule__Css_attrib__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2910:1: ( ( ( rule__Css_attrib__Alternatives_2_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2911:1: ( ( rule__Css_attrib__Alternatives_2_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2911:1: ( ( rule__Css_attrib__Alternatives_2_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2912:1: ( rule__Css_attrib__Alternatives_2_0 )
            {
             before(grammarAccess.getCss_attribAccess().getAlternatives_2_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2913:1: ( rule__Css_attrib__Alternatives_2_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2913:2: rule__Css_attrib__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__Css_attrib__Alternatives_2_0_in_rule__Css_attrib__Group_2__0__Impl6045);
            rule__Css_attrib__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCss_attribAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group_2__0__Impl"


    // $ANTLR start "rule__Css_attrib__Group_2__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2923:1: rule__Css_attrib__Group_2__1 : rule__Css_attrib__Group_2__1__Impl ;
    public final void rule__Css_attrib__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2927:1: ( rule__Css_attrib__Group_2__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2928:2: rule__Css_attrib__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group_2__1__Impl_in_rule__Css_attrib__Group_2__16075);
            rule__Css_attrib__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group_2__1"


    // $ANTLR start "rule__Css_attrib__Group_2__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2934:1: rule__Css_attrib__Group_2__1__Impl : ( ( rule__Css_attrib__Alternatives_2_1 ) ) ;
    public final void rule__Css_attrib__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2938:1: ( ( ( rule__Css_attrib__Alternatives_2_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2939:1: ( ( rule__Css_attrib__Alternatives_2_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2939:1: ( ( rule__Css_attrib__Alternatives_2_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2940:1: ( rule__Css_attrib__Alternatives_2_1 )
            {
             before(grammarAccess.getCss_attribAccess().getAlternatives_2_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2941:1: ( rule__Css_attrib__Alternatives_2_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2941:2: rule__Css_attrib__Alternatives_2_1
            {
            pushFollow(FOLLOW_rule__Css_attrib__Alternatives_2_1_in_rule__Css_attrib__Group_2__1__Impl6102);
            rule__Css_attrib__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCss_attribAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_attrib__Group_2__1__Impl"


    // $ANTLR start "rule__Css_generic_declaration__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2955:1: rule__Css_generic_declaration__Group__0 : rule__Css_generic_declaration__Group__0__Impl rule__Css_generic_declaration__Group__1 ;
    public final void rule__Css_generic_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2959:1: ( rule__Css_generic_declaration__Group__0__Impl rule__Css_generic_declaration__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2960:2: rule__Css_generic_declaration__Group__0__Impl rule__Css_generic_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__0__Impl_in_rule__Css_generic_declaration__Group__06136);
            rule__Css_generic_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__1_in_rule__Css_generic_declaration__Group__06139);
            rule__Css_generic_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__0"


    // $ANTLR start "rule__Css_generic_declaration__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2967:1: rule__Css_generic_declaration__Group__0__Impl : ( ( rule__Css_generic_declaration__PropertyAssignment_0 ) ) ;
    public final void rule__Css_generic_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2971:1: ( ( ( rule__Css_generic_declaration__PropertyAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2972:1: ( ( rule__Css_generic_declaration__PropertyAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2972:1: ( ( rule__Css_generic_declaration__PropertyAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2973:1: ( rule__Css_generic_declaration__PropertyAssignment_0 )
            {
             before(grammarAccess.getCss_generic_declarationAccess().getPropertyAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2974:1: ( rule__Css_generic_declaration__PropertyAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2974:2: rule__Css_generic_declaration__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__PropertyAssignment_0_in_rule__Css_generic_declaration__Group__0__Impl6166);
            rule__Css_generic_declaration__PropertyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCss_generic_declarationAccess().getPropertyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__0__Impl"


    // $ANTLR start "rule__Css_generic_declaration__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2984:1: rule__Css_generic_declaration__Group__1 : rule__Css_generic_declaration__Group__1__Impl rule__Css_generic_declaration__Group__2 ;
    public final void rule__Css_generic_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2988:1: ( rule__Css_generic_declaration__Group__1__Impl rule__Css_generic_declaration__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2989:2: rule__Css_generic_declaration__Group__1__Impl rule__Css_generic_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__1__Impl_in_rule__Css_generic_declaration__Group__16196);
            rule__Css_generic_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__2_in_rule__Css_generic_declaration__Group__16199);
            rule__Css_generic_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__1"


    // $ANTLR start "rule__Css_generic_declaration__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2996:1: rule__Css_generic_declaration__Group__1__Impl : ( ':' ) ;
    public final void rule__Css_generic_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3000:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3001:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3001:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3002:1: ':'
            {
             before(grammarAccess.getCss_generic_declarationAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__Css_generic_declaration__Group__1__Impl6227); 
             after(grammarAccess.getCss_generic_declarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__1__Impl"


    // $ANTLR start "rule__Css_generic_declaration__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3015:1: rule__Css_generic_declaration__Group__2 : rule__Css_generic_declaration__Group__2__Impl ;
    public final void rule__Css_generic_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3019:1: ( rule__Css_generic_declaration__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3020:2: rule__Css_generic_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__2__Impl_in_rule__Css_generic_declaration__Group__26258);
            rule__Css_generic_declaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__2"


    // $ANTLR start "rule__Css_generic_declaration__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3026:1: rule__Css_generic_declaration__Group__2__Impl : ( ( rule__Css_generic_declaration__ExpressionAssignment_2 ) ) ;
    public final void rule__Css_generic_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3030:1: ( ( ( rule__Css_generic_declaration__ExpressionAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3031:1: ( ( rule__Css_generic_declaration__ExpressionAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3031:1: ( ( rule__Css_generic_declaration__ExpressionAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3032:1: ( rule__Css_generic_declaration__ExpressionAssignment_2 )
            {
             before(grammarAccess.getCss_generic_declarationAccess().getExpressionAssignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3033:1: ( rule__Css_generic_declaration__ExpressionAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3033:2: rule__Css_generic_declaration__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__ExpressionAssignment_2_in_rule__Css_generic_declaration__Group__2__Impl6285);
            rule__Css_generic_declaration__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCss_generic_declarationAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__Group__2__Impl"


    // $ANTLR start "rule__Css_property__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3049:1: rule__Css_property__Group__0 : rule__Css_property__Group__0__Impl rule__Css_property__Group__1 ;
    public final void rule__Css_property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3053:1: ( rule__Css_property__Group__0__Impl rule__Css_property__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3054:2: rule__Css_property__Group__0__Impl rule__Css_property__Group__1
            {
            pushFollow(FOLLOW_rule__Css_property__Group__0__Impl_in_rule__Css_property__Group__06321);
            rule__Css_property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_property__Group__1_in_rule__Css_property__Group__06324);
            rule__Css_property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_property__Group__0"


    // $ANTLR start "rule__Css_property__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3061:1: rule__Css_property__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Css_property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3065:1: ( ( ( '-' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3066:1: ( ( '-' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3066:1: ( ( '-' )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3067:1: ( '-' )?
            {
             before(grammarAccess.getCss_propertyAccess().getHyphenMinusKeyword_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3068:1: ( '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3069:2: '-'
                    {
                    match(input,19,FOLLOW_19_in_rule__Css_property__Group__0__Impl6353); 

                    }
                    break;

            }

             after(grammarAccess.getCss_propertyAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_property__Group__0__Impl"


    // $ANTLR start "rule__Css_property__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3080:1: rule__Css_property__Group__1 : rule__Css_property__Group__1__Impl ;
    public final void rule__Css_property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3084:1: ( rule__Css_property__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3085:2: rule__Css_property__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_property__Group__1__Impl_in_rule__Css_property__Group__16386);
            rule__Css_property__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_property__Group__1"


    // $ANTLR start "rule__Css_property__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3091:1: rule__Css_property__Group__1__Impl : ( ( rule__Css_property__Alternatives_1 ) ) ;
    public final void rule__Css_property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3095:1: ( ( ( rule__Css_property__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3096:1: ( ( rule__Css_property__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3096:1: ( ( rule__Css_property__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3097:1: ( rule__Css_property__Alternatives_1 )
            {
             before(grammarAccess.getCss_propertyAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3098:1: ( rule__Css_property__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3098:2: rule__Css_property__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Css_property__Alternatives_1_in_rule__Css_property__Group__1__Impl6413);
            rule__Css_property__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCss_propertyAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_property__Group__1__Impl"


    // $ANTLR start "rule__Css_pseudo__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3112:1: rule__Css_pseudo__Group__0 : rule__Css_pseudo__Group__0__Impl rule__Css_pseudo__Group__1 ;
    public final void rule__Css_pseudo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3116:1: ( rule__Css_pseudo__Group__0__Impl rule__Css_pseudo__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3117:2: rule__Css_pseudo__Group__0__Impl rule__Css_pseudo__Group__1
            {
            pushFollow(FOLLOW_rule__Css_pseudo__Group__0__Impl_in_rule__Css_pseudo__Group__06447);
            rule__Css_pseudo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_pseudo__Group__1_in_rule__Css_pseudo__Group__06450);
            rule__Css_pseudo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_pseudo__Group__0"


    // $ANTLR start "rule__Css_pseudo__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3124:1: rule__Css_pseudo__Group__0__Impl : ( ':' ) ;
    public final void rule__Css_pseudo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3128:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3129:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3129:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3130:1: ':'
            {
             before(grammarAccess.getCss_pseudoAccess().getColonKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Css_pseudo__Group__0__Impl6478); 
             after(grammarAccess.getCss_pseudoAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_pseudo__Group__0__Impl"


    // $ANTLR start "rule__Css_pseudo__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3143:1: rule__Css_pseudo__Group__1 : rule__Css_pseudo__Group__1__Impl ;
    public final void rule__Css_pseudo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3147:1: ( rule__Css_pseudo__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3148:2: rule__Css_pseudo__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_pseudo__Group__1__Impl_in_rule__Css_pseudo__Group__16509);
            rule__Css_pseudo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_pseudo__Group__1"


    // $ANTLR start "rule__Css_pseudo__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3154:1: rule__Css_pseudo__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Css_pseudo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3158:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3159:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3159:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3160:1: RULE_IDENT
            {
             before(grammarAccess.getCss_pseudoAccess().getIDENTTerminalRuleCall_1()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_pseudo__Group__1__Impl6536); 
             after(grammarAccess.getCss_pseudoAccess().getIDENTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_pseudo__Group__1__Impl"


    // $ANTLR start "rule__Combinator__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3175:1: rule__Combinator__Group__0 : rule__Combinator__Group__0__Impl rule__Combinator__Group__1 ;
    public final void rule__Combinator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3179:1: ( rule__Combinator__Group__0__Impl rule__Combinator__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3180:2: rule__Combinator__Group__0__Impl rule__Combinator__Group__1
            {
            pushFollow(FOLLOW_rule__Combinator__Group__0__Impl_in_rule__Combinator__Group__06569);
            rule__Combinator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Combinator__Group__1_in_rule__Combinator__Group__06572);
            rule__Combinator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combinator__Group__0"


    // $ANTLR start "rule__Combinator__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3187:1: rule__Combinator__Group__0__Impl : ( ( rule__Combinator__Alternatives_0 ) ) ;
    public final void rule__Combinator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3191:1: ( ( ( rule__Combinator__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3192:1: ( ( rule__Combinator__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3192:1: ( ( rule__Combinator__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3193:1: ( rule__Combinator__Alternatives_0 )
            {
             before(grammarAccess.getCombinatorAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3194:1: ( rule__Combinator__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3194:2: rule__Combinator__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Combinator__Alternatives_0_in_rule__Combinator__Group__0__Impl6599);
            rule__Combinator__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCombinatorAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combinator__Group__0__Impl"


    // $ANTLR start "rule__Combinator__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3204:1: rule__Combinator__Group__1 : rule__Combinator__Group__1__Impl ;
    public final void rule__Combinator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3208:1: ( rule__Combinator__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3209:2: rule__Combinator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Combinator__Group__1__Impl_in_rule__Combinator__Group__16629);
            rule__Combinator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combinator__Group__1"


    // $ANTLR start "rule__Combinator__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3215:1: rule__Combinator__Group__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Combinator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3219:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3220:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3220:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3221:1: ( RULE_WS )*
            {
             before(grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3222:1: ( RULE_WS )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_WS) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3222:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Combinator__Group__1__Impl6657); 

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Combinator__Group__1__Impl"


    // $ANTLR start "rule__Expr__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3236:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3240:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3241:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
            {
            pushFollow(FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__06692);
            rule__Expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__06695);
            rule__Expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__0"


    // $ANTLR start "rule__Expr__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3248:1: rule__Expr__Group__0__Impl : ( ( rule__Expr__TermGroupsAssignment_0 ) ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3252:1: ( ( ( rule__Expr__TermGroupsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3253:1: ( ( rule__Expr__TermGroupsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3253:1: ( ( rule__Expr__TermGroupsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3254:1: ( rule__Expr__TermGroupsAssignment_0 )
            {
             before(grammarAccess.getExprAccess().getTermGroupsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3255:1: ( rule__Expr__TermGroupsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3255:2: rule__Expr__TermGroupsAssignment_0
            {
            pushFollow(FOLLOW_rule__Expr__TermGroupsAssignment_0_in_rule__Expr__Group__0__Impl6722);
            rule__Expr__TermGroupsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getTermGroupsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__0__Impl"


    // $ANTLR start "rule__Expr__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3265:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3269:1: ( rule__Expr__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3270:2: rule__Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__16752);
            rule__Expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__1"


    // $ANTLR start "rule__Expr__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3276:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__Group_1__0 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3280:1: ( ( ( rule__Expr__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3281:1: ( ( rule__Expr__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3281:1: ( ( rule__Expr__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3282:1: ( rule__Expr__Group_1__0 )*
            {
             before(grammarAccess.getExprAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3283:1: ( rule__Expr__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_COMMA||LA39_0==18) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3283:2: rule__Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl6779);
            	    rule__Expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__1__Impl"


    // $ANTLR start "rule__Expr__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3297:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3301:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3302:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__06814);
            rule__Expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__06817);
            rule__Expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0"


    // $ANTLR start "rule__Expr__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3309:1: rule__Expr__Group_1__0__Impl : ( ruleoperator ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3313:1: ( ( ruleoperator ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3314:1: ( ruleoperator )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3314:1: ( ruleoperator )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3315:1: ruleoperator
            {
             before(grammarAccess.getExprAccess().getOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleoperator_in_rule__Expr__Group_1__0__Impl6844);
            ruleoperator();

            state._fsp--;

             after(grammarAccess.getExprAccess().getOperatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0__Impl"


    // $ANTLR start "rule__Expr__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3326:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3330:1: ( rule__Expr__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3331:2: rule__Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__16873);
            rule__Expr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1"


    // $ANTLR start "rule__Expr__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3337:1: rule__Expr__Group_1__1__Impl : ( ( rule__Expr__TermGroupsAssignment_1_1 ) ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3341:1: ( ( ( rule__Expr__TermGroupsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3342:1: ( ( rule__Expr__TermGroupsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3342:1: ( ( rule__Expr__TermGroupsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3343:1: ( rule__Expr__TermGroupsAssignment_1_1 )
            {
             before(grammarAccess.getExprAccess().getTermGroupsAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3344:1: ( rule__Expr__TermGroupsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3344:2: rule__Expr__TermGroupsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expr__TermGroupsAssignment_1_1_in_rule__Expr__Group_1__1__Impl6900);
            rule__Expr__TermGroupsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getTermGroupsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1__Impl"


    // $ANTLR start "rule__NumberTerm__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3358:1: rule__NumberTerm__Group__0 : rule__NumberTerm__Group__0__Impl rule__NumberTerm__Group__1 ;
    public final void rule__NumberTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3362:1: ( rule__NumberTerm__Group__0__Impl rule__NumberTerm__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3363:2: rule__NumberTerm__Group__0__Impl rule__NumberTerm__Group__1
            {
            pushFollow(FOLLOW_rule__NumberTerm__Group__0__Impl_in_rule__NumberTerm__Group__06934);
            rule__NumberTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberTerm__Group__1_in_rule__NumberTerm__Group__06937);
            rule__NumberTerm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTerm__Group__0"


    // $ANTLR start "rule__NumberTerm__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3370:1: rule__NumberTerm__Group__0__Impl : ( ( ruleunary_operator )? ) ;
    public final void rule__NumberTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3374:1: ( ( ( ruleunary_operator )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3375:1: ( ( ruleunary_operator )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3375:1: ( ( ruleunary_operator )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3376:1: ( ruleunary_operator )?
            {
             before(grammarAccess.getNumberTermAccess().getUnary_operatorParserRuleCall_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3377:1: ( ruleunary_operator )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==16||LA40_0==19) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3377:3: ruleunary_operator
                    {
                    pushFollow(FOLLOW_ruleunary_operator_in_rule__NumberTerm__Group__0__Impl6965);
                    ruleunary_operator();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberTermAccess().getUnary_operatorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTerm__Group__0__Impl"


    // $ANTLR start "rule__NumberTerm__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3387:1: rule__NumberTerm__Group__1 : rule__NumberTerm__Group__1__Impl ;
    public final void rule__NumberTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3391:1: ( rule__NumberTerm__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3392:2: rule__NumberTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberTerm__Group__1__Impl_in_rule__NumberTerm__Group__16996);
            rule__NumberTerm__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTerm__Group__1"


    // $ANTLR start "rule__NumberTerm__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3398:1: rule__NumberTerm__Group__1__Impl : ( ( rule__NumberTerm__Alternatives_1 ) ) ;
    public final void rule__NumberTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3402:1: ( ( ( rule__NumberTerm__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3403:1: ( ( rule__NumberTerm__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3403:1: ( ( rule__NumberTerm__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3404:1: ( rule__NumberTerm__Alternatives_1 )
            {
             before(grammarAccess.getNumberTermAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3405:1: ( rule__NumberTerm__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3405:2: rule__NumberTerm__Alternatives_1
            {
            pushFollow(FOLLOW_rule__NumberTerm__Alternatives_1_in_rule__NumberTerm__Group__1__Impl7023);
            rule__NumberTerm__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberTermAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberTerm__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3419:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3423:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3424:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__07057);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__07060);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3431:1: rule__Function__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3435:1: ( ( ( '-' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3436:1: ( ( '-' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3436:1: ( ( '-' )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3437:1: ( '-' )?
            {
             before(grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3438:1: ( '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==19) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3439:2: '-'
                    {
                    match(input,19,FOLLOW_19_in_rule__Function__Group__0__Impl7089); 

                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3450:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3454:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3455:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__17122);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__17125);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3462:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3466:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3467:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3467:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3468:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3469:1: ( rule__Function__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3469:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl7152);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3479:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3483:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3484:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__27182);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__27185);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3491:1: rule__Function__Group__2__Impl : ( '(' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3495:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3496:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3496:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3497:1: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Function__Group__2__Impl7213); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3510:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3514:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3515:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__37244);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__37247);
            rule__Function__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3522:1: rule__Function__Group__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3526:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3527:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3527:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3528:1: ( RULE_WS )*
            {
             before(grammarAccess.getFunctionAccess().getWSTerminalRuleCall_3()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3529:1: ( RULE_WS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_WS) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3529:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Function__Group__3__Impl7275); 

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getWSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3539:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3543:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3544:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__47306);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__47309);
            rule__Function__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3551:1: rule__Function__Group__4__Impl : ( ( rule__Function__ExpressionAssignment_4 ) ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3555:1: ( ( ( rule__Function__ExpressionAssignment_4 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3556:1: ( ( rule__Function__ExpressionAssignment_4 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3556:1: ( ( rule__Function__ExpressionAssignment_4 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3557:1: ( rule__Function__ExpressionAssignment_4 )
            {
             before(grammarAccess.getFunctionAccess().getExpressionAssignment_4()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3558:1: ( rule__Function__ExpressionAssignment_4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3558:2: rule__Function__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_rule__Function__ExpressionAssignment_4_in_rule__Function__Group__4__Impl7336);
            rule__Function__ExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3568:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3572:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3573:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__57366);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__6_in_rule__Function__Group__57369);
            rule__Function__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3580:1: rule__Function__Group__5__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3584:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3585:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3585:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3586:1: ( RULE_WS )*
            {
             before(grammarAccess.getFunctionAccess().getWSTerminalRuleCall_5()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3587:1: ( RULE_WS )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_WS) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3587:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Function__Group__5__Impl7397); 

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getWSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3597:1: rule__Function__Group__6 : rule__Function__Group__6__Impl ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3601:1: ( rule__Function__Group__6__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3602:2: rule__Function__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__67428);
            rule__Function__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3608:1: rule__Function__Group__6__Impl : ( ')' ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3612:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3613:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3613:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3614:1: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6()); 
            match(input,43,FOLLOW_43_in_rule__Function__Group__6__Impl7456); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__HexColor__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3641:1: rule__HexColor__Group__0 : rule__HexColor__Group__0__Impl rule__HexColor__Group__1 ;
    public final void rule__HexColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3645:1: ( rule__HexColor__Group__0__Impl rule__HexColor__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3646:2: rule__HexColor__Group__0__Impl rule__HexColor__Group__1
            {
            pushFollow(FOLLOW_rule__HexColor__Group__0__Impl_in_rule__HexColor__Group__07501);
            rule__HexColor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HexColor__Group__1_in_rule__HexColor__Group__07504);
            rule__HexColor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HexColor__Group__0"


    // $ANTLR start "rule__HexColor__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3653:1: rule__HexColor__Group__0__Impl : ( '#' ) ;
    public final void rule__HexColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3657:1: ( ( '#' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3658:1: ( '#' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3658:1: ( '#' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3659:1: '#'
            {
             before(grammarAccess.getHexColorAccess().getNumberSignKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__HexColor__Group__0__Impl7532); 
             after(grammarAccess.getHexColorAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HexColor__Group__0__Impl"


    // $ANTLR start "rule__HexColor__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3672:1: rule__HexColor__Group__1 : rule__HexColor__Group__1__Impl ;
    public final void rule__HexColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3676:1: ( rule__HexColor__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3677:2: rule__HexColor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__HexColor__Group__1__Impl_in_rule__HexColor__Group__17563);
            rule__HexColor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HexColor__Group__1"


    // $ANTLR start "rule__HexColor__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3683:1: rule__HexColor__Group__1__Impl : ( ( rule__HexColor__Alternatives_1 ) ) ;
    public final void rule__HexColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3687:1: ( ( ( rule__HexColor__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3688:1: ( ( rule__HexColor__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3688:1: ( ( rule__HexColor__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3689:1: ( rule__HexColor__Alternatives_1 )
            {
             before(grammarAccess.getHexColorAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3690:1: ( rule__HexColor__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3690:2: rule__HexColor__Alternatives_1
            {
            pushFollow(FOLLOW_rule__HexColor__Alternatives_1_in_rule__HexColor__Group__1__Impl7590);
            rule__HexColor__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getHexColorAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HexColor__Group__1__Impl"


    // $ANTLR start "rule__URLType__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3704:1: rule__URLType__Group__0 : rule__URLType__Group__0__Impl rule__URLType__Group__1 ;
    public final void rule__URLType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3708:1: ( rule__URLType__Group__0__Impl rule__URLType__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3709:2: rule__URLType__Group__0__Impl rule__URLType__Group__1
            {
            pushFollow(FOLLOW_rule__URLType__Group__0__Impl_in_rule__URLType__Group__07624);
            rule__URLType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URLType__Group__1_in_rule__URLType__Group__07627);
            rule__URLType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__0"


    // $ANTLR start "rule__URLType__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3716:1: rule__URLType__Group__0__Impl : ( 'url' ) ;
    public final void rule__URLType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3720:1: ( ( 'url' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3721:1: ( 'url' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3721:1: ( 'url' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3722:1: 'url'
            {
             before(grammarAccess.getURLTypeAccess().getUrlKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__URLType__Group__0__Impl7655); 
             after(grammarAccess.getURLTypeAccess().getUrlKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__0__Impl"


    // $ANTLR start "rule__URLType__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3735:1: rule__URLType__Group__1 : rule__URLType__Group__1__Impl rule__URLType__Group__2 ;
    public final void rule__URLType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3739:1: ( rule__URLType__Group__1__Impl rule__URLType__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3740:2: rule__URLType__Group__1__Impl rule__URLType__Group__2
            {
            pushFollow(FOLLOW_rule__URLType__Group__1__Impl_in_rule__URLType__Group__17686);
            rule__URLType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URLType__Group__2_in_rule__URLType__Group__17689);
            rule__URLType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__1"


    // $ANTLR start "rule__URLType__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3747:1: rule__URLType__Group__1__Impl : ( '(' ) ;
    public final void rule__URLType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3751:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3752:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3752:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3753:1: '('
            {
             before(grammarAccess.getURLTypeAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__URLType__Group__1__Impl7717); 
             after(grammarAccess.getURLTypeAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__1__Impl"


    // $ANTLR start "rule__URLType__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3766:1: rule__URLType__Group__2 : rule__URLType__Group__2__Impl rule__URLType__Group__3 ;
    public final void rule__URLType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3770:1: ( rule__URLType__Group__2__Impl rule__URLType__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3771:2: rule__URLType__Group__2__Impl rule__URLType__Group__3
            {
            pushFollow(FOLLOW_rule__URLType__Group__2__Impl_in_rule__URLType__Group__27748);
            rule__URLType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URLType__Group__3_in_rule__URLType__Group__27751);
            rule__URLType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__2"


    // $ANTLR start "rule__URLType__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3778:1: rule__URLType__Group__2__Impl : ( ( rule__URLType__UrlAssignment_2 ) ) ;
    public final void rule__URLType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3782:1: ( ( ( rule__URLType__UrlAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3783:1: ( ( rule__URLType__UrlAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3783:1: ( ( rule__URLType__UrlAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3784:1: ( rule__URLType__UrlAssignment_2 )
            {
             before(grammarAccess.getURLTypeAccess().getUrlAssignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3785:1: ( rule__URLType__UrlAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3785:2: rule__URLType__UrlAssignment_2
            {
            pushFollow(FOLLOW_rule__URLType__UrlAssignment_2_in_rule__URLType__Group__2__Impl7778);
            rule__URLType__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getURLTypeAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__2__Impl"


    // $ANTLR start "rule__URLType__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3795:1: rule__URLType__Group__3 : rule__URLType__Group__3__Impl ;
    public final void rule__URLType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3799:1: ( rule__URLType__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3800:2: rule__URLType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__URLType__Group__3__Impl_in_rule__URLType__Group__37808);
            rule__URLType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__3"


    // $ANTLR start "rule__URLType__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3806:1: rule__URLType__Group__3__Impl : ( ')' ) ;
    public final void rule__URLType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3810:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3811:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3811:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3812:1: ')'
            {
             before(grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_43_in_rule__URLType__Group__3__Impl7836); 
             after(grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__Group__3__Impl"


    // $ANTLR start "rule__PERCENTAGE__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3833:1: rule__PERCENTAGE__Group__0 : rule__PERCENTAGE__Group__0__Impl rule__PERCENTAGE__Group__1 ;
    public final void rule__PERCENTAGE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3837:1: ( rule__PERCENTAGE__Group__0__Impl rule__PERCENTAGE__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3838:2: rule__PERCENTAGE__Group__0__Impl rule__PERCENTAGE__Group__1
            {
            pushFollow(FOLLOW_rule__PERCENTAGE__Group__0__Impl_in_rule__PERCENTAGE__Group__07875);
            rule__PERCENTAGE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PERCENTAGE__Group__1_in_rule__PERCENTAGE__Group__07878);
            rule__PERCENTAGE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PERCENTAGE__Group__0"


    // $ANTLR start "rule__PERCENTAGE__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3845:1: rule__PERCENTAGE__Group__0__Impl : ( rulenum ) ;
    public final void rule__PERCENTAGE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3849:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3850:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3850:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3851:1: rulenum
            {
             before(grammarAccess.getPERCENTAGEAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__PERCENTAGE__Group__0__Impl7905);
            rulenum();

            state._fsp--;

             after(grammarAccess.getPERCENTAGEAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PERCENTAGE__Group__0__Impl"


    // $ANTLR start "rule__PERCENTAGE__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3862:1: rule__PERCENTAGE__Group__1 : rule__PERCENTAGE__Group__1__Impl ;
    public final void rule__PERCENTAGE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3866:1: ( rule__PERCENTAGE__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3867:2: rule__PERCENTAGE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PERCENTAGE__Group__1__Impl_in_rule__PERCENTAGE__Group__17934);
            rule__PERCENTAGE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PERCENTAGE__Group__1"


    // $ANTLR start "rule__PERCENTAGE__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3873:1: rule__PERCENTAGE__Group__1__Impl : ( '%' ) ;
    public final void rule__PERCENTAGE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3877:1: ( ( '%' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3878:1: ( '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3878:1: ( '%' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3879:1: '%'
            {
             before(grammarAccess.getPERCENTAGEAccess().getPercentSignKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__PERCENTAGE__Group__1__Impl7962); 
             after(grammarAccess.getPERCENTAGEAccess().getPercentSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PERCENTAGE__Group__1__Impl"


    // $ANTLR start "rule__EMS__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3896:1: rule__EMS__Group__0 : rule__EMS__Group__0__Impl rule__EMS__Group__1 ;
    public final void rule__EMS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3900:1: ( rule__EMS__Group__0__Impl rule__EMS__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3901:2: rule__EMS__Group__0__Impl rule__EMS__Group__1
            {
            pushFollow(FOLLOW_rule__EMS__Group__0__Impl_in_rule__EMS__Group__07997);
            rule__EMS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EMS__Group__1_in_rule__EMS__Group__08000);
            rule__EMS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMS__Group__0"


    // $ANTLR start "rule__EMS__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3908:1: rule__EMS__Group__0__Impl : ( rulenum ) ;
    public final void rule__EMS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3912:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3913:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3913:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3914:1: rulenum
            {
             before(grammarAccess.getEMSAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__EMS__Group__0__Impl8027);
            rulenum();

            state._fsp--;

             after(grammarAccess.getEMSAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMS__Group__0__Impl"


    // $ANTLR start "rule__EMS__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3925:1: rule__EMS__Group__1 : rule__EMS__Group__1__Impl ;
    public final void rule__EMS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3929:1: ( rule__EMS__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3930:2: rule__EMS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EMS__Group__1__Impl_in_rule__EMS__Group__18056);
            rule__EMS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMS__Group__1"


    // $ANTLR start "rule__EMS__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3936:1: rule__EMS__Group__1__Impl : ( 'em' ) ;
    public final void rule__EMS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3940:1: ( ( 'em' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3941:1: ( 'em' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3941:1: ( 'em' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3942:1: 'em'
            {
             before(grammarAccess.getEMSAccess().getEmKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__EMS__Group__1__Impl8084); 
             after(grammarAccess.getEMSAccess().getEmKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EMS__Group__1__Impl"


    // $ANTLR start "rule__EXS__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3959:1: rule__EXS__Group__0 : rule__EXS__Group__0__Impl rule__EXS__Group__1 ;
    public final void rule__EXS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3963:1: ( rule__EXS__Group__0__Impl rule__EXS__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3964:2: rule__EXS__Group__0__Impl rule__EXS__Group__1
            {
            pushFollow(FOLLOW_rule__EXS__Group__0__Impl_in_rule__EXS__Group__08119);
            rule__EXS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EXS__Group__1_in_rule__EXS__Group__08122);
            rule__EXS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXS__Group__0"


    // $ANTLR start "rule__EXS__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3971:1: rule__EXS__Group__0__Impl : ( rulenum ) ;
    public final void rule__EXS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3975:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3976:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3976:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3977:1: rulenum
            {
             before(grammarAccess.getEXSAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__EXS__Group__0__Impl8149);
            rulenum();

            state._fsp--;

             after(grammarAccess.getEXSAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXS__Group__0__Impl"


    // $ANTLR start "rule__EXS__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3988:1: rule__EXS__Group__1 : rule__EXS__Group__1__Impl ;
    public final void rule__EXS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3992:1: ( rule__EXS__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3993:2: rule__EXS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EXS__Group__1__Impl_in_rule__EXS__Group__18178);
            rule__EXS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXS__Group__1"


    // $ANTLR start "rule__EXS__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3999:1: rule__EXS__Group__1__Impl : ( 'ex' ) ;
    public final void rule__EXS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4003:1: ( ( 'ex' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4004:1: ( 'ex' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4004:1: ( 'ex' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4005:1: 'ex'
            {
             before(grammarAccess.getEXSAccess().getExKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__EXS__Group__1__Impl8206); 
             after(grammarAccess.getEXSAccess().getExKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXS__Group__1__Impl"


    // $ANTLR start "rule__LENGTH__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4022:1: rule__LENGTH__Group__0 : rule__LENGTH__Group__0__Impl rule__LENGTH__Group__1 ;
    public final void rule__LENGTH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4026:1: ( rule__LENGTH__Group__0__Impl rule__LENGTH__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4027:2: rule__LENGTH__Group__0__Impl rule__LENGTH__Group__1
            {
            pushFollow(FOLLOW_rule__LENGTH__Group__0__Impl_in_rule__LENGTH__Group__08241);
            rule__LENGTH__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LENGTH__Group__1_in_rule__LENGTH__Group__08244);
            rule__LENGTH__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Group__0"


    // $ANTLR start "rule__LENGTH__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4034:1: rule__LENGTH__Group__0__Impl : ( rulenum ) ;
    public final void rule__LENGTH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4038:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4039:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4039:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4040:1: rulenum
            {
             before(grammarAccess.getLENGTHAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__LENGTH__Group__0__Impl8271);
            rulenum();

            state._fsp--;

             after(grammarAccess.getLENGTHAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Group__0__Impl"


    // $ANTLR start "rule__LENGTH__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4051:1: rule__LENGTH__Group__1 : rule__LENGTH__Group__1__Impl ;
    public final void rule__LENGTH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4055:1: ( rule__LENGTH__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4056:2: rule__LENGTH__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LENGTH__Group__1__Impl_in_rule__LENGTH__Group__18300);
            rule__LENGTH__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Group__1"


    // $ANTLR start "rule__LENGTH__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4062:1: rule__LENGTH__Group__1__Impl : ( ( rule__LENGTH__Alternatives_1 ) ) ;
    public final void rule__LENGTH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4066:1: ( ( ( rule__LENGTH__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4067:1: ( ( rule__LENGTH__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4067:1: ( ( rule__LENGTH__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4068:1: ( rule__LENGTH__Alternatives_1 )
            {
             before(grammarAccess.getLENGTHAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4069:1: ( rule__LENGTH__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4069:2: rule__LENGTH__Alternatives_1
            {
            pushFollow(FOLLOW_rule__LENGTH__Alternatives_1_in_rule__LENGTH__Group__1__Impl8327);
            rule__LENGTH__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLENGTHAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LENGTH__Group__1__Impl"


    // $ANTLR start "rule__ANGLE__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4083:1: rule__ANGLE__Group__0 : rule__ANGLE__Group__0__Impl rule__ANGLE__Group__1 ;
    public final void rule__ANGLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4087:1: ( rule__ANGLE__Group__0__Impl rule__ANGLE__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4088:2: rule__ANGLE__Group__0__Impl rule__ANGLE__Group__1
            {
            pushFollow(FOLLOW_rule__ANGLE__Group__0__Impl_in_rule__ANGLE__Group__08361);
            rule__ANGLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANGLE__Group__1_in_rule__ANGLE__Group__08364);
            rule__ANGLE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Group__0"


    // $ANTLR start "rule__ANGLE__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4095:1: rule__ANGLE__Group__0__Impl : ( rulenum ) ;
    public final void rule__ANGLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4099:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4100:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4100:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4101:1: rulenum
            {
             before(grammarAccess.getANGLEAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__ANGLE__Group__0__Impl8391);
            rulenum();

            state._fsp--;

             after(grammarAccess.getANGLEAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Group__0__Impl"


    // $ANTLR start "rule__ANGLE__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4112:1: rule__ANGLE__Group__1 : rule__ANGLE__Group__1__Impl ;
    public final void rule__ANGLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4116:1: ( rule__ANGLE__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4117:2: rule__ANGLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ANGLE__Group__1__Impl_in_rule__ANGLE__Group__18420);
            rule__ANGLE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Group__1"


    // $ANTLR start "rule__ANGLE__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4123:1: rule__ANGLE__Group__1__Impl : ( ( rule__ANGLE__Alternatives_1 ) ) ;
    public final void rule__ANGLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4127:1: ( ( ( rule__ANGLE__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4128:1: ( ( rule__ANGLE__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4128:1: ( ( rule__ANGLE__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4129:1: ( rule__ANGLE__Alternatives_1 )
            {
             before(grammarAccess.getANGLEAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4130:1: ( rule__ANGLE__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4130:2: rule__ANGLE__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ANGLE__Alternatives_1_in_rule__ANGLE__Group__1__Impl8447);
            rule__ANGLE__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getANGLEAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANGLE__Group__1__Impl"


    // $ANTLR start "rule__TIME__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4144:1: rule__TIME__Group__0 : rule__TIME__Group__0__Impl rule__TIME__Group__1 ;
    public final void rule__TIME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4148:1: ( rule__TIME__Group__0__Impl rule__TIME__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4149:2: rule__TIME__Group__0__Impl rule__TIME__Group__1
            {
            pushFollow(FOLLOW_rule__TIME__Group__0__Impl_in_rule__TIME__Group__08481);
            rule__TIME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TIME__Group__1_in_rule__TIME__Group__08484);
            rule__TIME__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Group__0"


    // $ANTLR start "rule__TIME__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4156:1: rule__TIME__Group__0__Impl : ( rulenum ) ;
    public final void rule__TIME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4160:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4161:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4161:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4162:1: rulenum
            {
             before(grammarAccess.getTIMEAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__TIME__Group__0__Impl8511);
            rulenum();

            state._fsp--;

             after(grammarAccess.getTIMEAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Group__0__Impl"


    // $ANTLR start "rule__TIME__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4173:1: rule__TIME__Group__1 : rule__TIME__Group__1__Impl ;
    public final void rule__TIME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4177:1: ( rule__TIME__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4178:2: rule__TIME__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TIME__Group__1__Impl_in_rule__TIME__Group__18540);
            rule__TIME__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Group__1"


    // $ANTLR start "rule__TIME__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4184:1: rule__TIME__Group__1__Impl : ( ( rule__TIME__Alternatives_1 ) ) ;
    public final void rule__TIME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4188:1: ( ( ( rule__TIME__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4189:1: ( ( rule__TIME__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4189:1: ( ( rule__TIME__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4190:1: ( rule__TIME__Alternatives_1 )
            {
             before(grammarAccess.getTIMEAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4191:1: ( rule__TIME__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4191:2: rule__TIME__Alternatives_1
            {
            pushFollow(FOLLOW_rule__TIME__Alternatives_1_in_rule__TIME__Group__1__Impl8567);
            rule__TIME__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTIMEAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TIME__Group__1__Impl"


    // $ANTLR start "rule__FREQ__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4205:1: rule__FREQ__Group__0 : rule__FREQ__Group__0__Impl rule__FREQ__Group__1 ;
    public final void rule__FREQ__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4209:1: ( rule__FREQ__Group__0__Impl rule__FREQ__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4210:2: rule__FREQ__Group__0__Impl rule__FREQ__Group__1
            {
            pushFollow(FOLLOW_rule__FREQ__Group__0__Impl_in_rule__FREQ__Group__08601);
            rule__FREQ__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FREQ__Group__1_in_rule__FREQ__Group__08604);
            rule__FREQ__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Group__0"


    // $ANTLR start "rule__FREQ__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4217:1: rule__FREQ__Group__0__Impl : ( rulenum ) ;
    public final void rule__FREQ__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4221:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4222:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4222:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4223:1: rulenum
            {
             before(grammarAccess.getFREQAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__FREQ__Group__0__Impl8631);
            rulenum();

            state._fsp--;

             after(grammarAccess.getFREQAccess().getNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Group__0__Impl"


    // $ANTLR start "rule__FREQ__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4234:1: rule__FREQ__Group__1 : rule__FREQ__Group__1__Impl ;
    public final void rule__FREQ__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4238:1: ( rule__FREQ__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4239:2: rule__FREQ__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FREQ__Group__1__Impl_in_rule__FREQ__Group__18660);
            rule__FREQ__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Group__1"


    // $ANTLR start "rule__FREQ__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4245:1: rule__FREQ__Group__1__Impl : ( ( rule__FREQ__Alternatives_1 ) ) ;
    public final void rule__FREQ__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4249:1: ( ( ( rule__FREQ__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4250:1: ( ( rule__FREQ__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4250:1: ( ( rule__FREQ__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4251:1: ( rule__FREQ__Alternatives_1 )
            {
             before(grammarAccess.getFREQAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4252:1: ( rule__FREQ__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4252:2: rule__FREQ__Alternatives_1
            {
            pushFollow(FOLLOW_rule__FREQ__Alternatives_1_in_rule__FREQ__Group__1__Impl8687);
            rule__FREQ__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFREQAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FREQ__Group__1__Impl"


    // $ANTLR start "rule__Stylesheet__RulesetAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4267:1: rule__Stylesheet__RulesetAssignment_0 : ( ruleruleset ) ;
    public final void rule__Stylesheet__RulesetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4271:1: ( ( ruleruleset ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4272:1: ( ruleruleset )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4272:1: ( ruleruleset )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4273:1: ruleruleset
            {
             before(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleruleset_in_rule__Stylesheet__RulesetAssignment_08726);
            ruleruleset();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__RulesetAssignment_0"


    // $ANTLR start "rule__Stylesheet__MediaAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4282:1: rule__Stylesheet__MediaAssignment_1 : ( rulemedia ) ;
    public final void rule__Stylesheet__MediaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4286:1: ( ( rulemedia ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4287:1: ( rulemedia )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4287:1: ( rulemedia )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4288:1: rulemedia
            {
             before(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulemedia_in_rule__Stylesheet__MediaAssignment_18757);
            rulemedia();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stylesheet__MediaAssignment_1"


    // $ANTLR start "rule__Media__MedialistAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4297:1: rule__Media__MedialistAssignment_1 : ( rulemedia_list ) ;
    public final void rule__Media__MedialistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4301:1: ( ( rulemedia_list ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4302:1: ( rulemedia_list )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4302:1: ( rulemedia_list )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4303:1: rulemedia_list
            {
             before(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulemedia_list_in_rule__Media__MedialistAssignment_18788);
            rulemedia_list();

            state._fsp--;

             after(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__MedialistAssignment_1"


    // $ANTLR start "rule__Media__RulesetsAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4312:1: rule__Media__RulesetsAssignment_3 : ( ruleruleset ) ;
    public final void rule__Media__RulesetsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4316:1: ( ( ruleruleset ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4317:1: ( ruleruleset )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4317:1: ( ruleruleset )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4318:1: ruleruleset
            {
             before(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleruleset_in_rule__Media__RulesetsAssignment_38819);
            ruleruleset();

            state._fsp--;

             after(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__RulesetsAssignment_3"


    // $ANTLR start "rule__Ruleset__SelectorsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4327:1: rule__Ruleset__SelectorsAssignment_0 : ( ruleselector ) ;
    public final void rule__Ruleset__SelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4331:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4332:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4332:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4333:1: ruleselector
            {
             before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_08850);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__SelectorsAssignment_0"


    // $ANTLR start "rule__Ruleset__SelectorsAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4342:1: rule__Ruleset__SelectorsAssignment_1_1 : ( ruleselector ) ;
    public final void rule__Ruleset__SelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4346:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4347:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4347:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4348:1: ruleselector
            {
             before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_1_18881);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__SelectorsAssignment_1_1"


    // $ANTLR start "rule__Ruleset__DeclarationsAssignment_3_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4357:1: rule__Ruleset__DeclarationsAssignment_3_0 : ( rulecss_declaration ) ;
    public final void rule__Ruleset__DeclarationsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4361:1: ( ( rulecss_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4362:1: ( rulecss_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4362:1: ( rulecss_declaration )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4363:1: rulecss_declaration
            {
             before(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_rulecss_declaration_in_rule__Ruleset__DeclarationsAssignment_3_08912);
            rulecss_declaration();

            state._fsp--;

             after(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ruleset__DeclarationsAssignment_3_0"


    // $ANTLR start "rule__Selector__SimpleselectorsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4372:1: rule__Selector__SimpleselectorsAssignment_0 : ( rulesimple_selector ) ;
    public final void rule__Selector__SimpleselectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4376:1: ( ( rulesimple_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4377:1: ( rulesimple_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4377:1: ( rulesimple_selector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4378:1: rulesimple_selector
            {
             before(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulesimple_selector_in_rule__Selector__SimpleselectorsAssignment_08943);
            rulesimple_selector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SimpleselectorsAssignment_0"


    // $ANTLR start "rule__Selector__CombinatorAssignment_1_0_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4387:1: rule__Selector__CombinatorAssignment_1_0_0 : ( rulecombinator ) ;
    public final void rule__Selector__CombinatorAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4391:1: ( ( rulecombinator ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4392:1: ( rulecombinator )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4392:1: ( rulecombinator )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4393:1: rulecombinator
            {
             before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_0_08974);
            rulecombinator();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__CombinatorAssignment_1_0_0"


    // $ANTLR start "rule__Selector__SelectorAssignment_1_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4402:1: rule__Selector__SelectorAssignment_1_0_1 : ( ruleselector ) ;
    public final void rule__Selector__SelectorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4406:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4407:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4407:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4408:1: ruleselector
            {
             before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_0_19005);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SelectorAssignment_1_0_1"


    // $ANTLR start "rule__Selector__CombinatorAssignment_1_1_1_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4417:1: rule__Selector__CombinatorAssignment_1_1_1_0 : ( rulecombinator ) ;
    public final void rule__Selector__CombinatorAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4421:1: ( ( rulecombinator ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4422:1: ( rulecombinator )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4422:1: ( rulecombinator )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4423:1: rulecombinator
            {
             before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 
            pushFollow(FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_1_1_09036);
            rulecombinator();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__CombinatorAssignment_1_1_1_0"


    // $ANTLR start "rule__Selector__SelectorAssignment_1_1_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4432:1: rule__Selector__SelectorAssignment_1_1_1_1 : ( ruleselector ) ;
    public final void rule__Selector__SelectorAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4436:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4437:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4437:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4438:1: ruleselector
            {
             before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_1_1_19067);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__SelectorAssignment_1_1_1_1"


    // $ANTLR start "rule__Simple_selector__ElementAssignment_0_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4447:1: rule__Simple_selector__ElementAssignment_0_0 : ( ruleelement_name ) ;
    public final void rule__Simple_selector__ElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4451:1: ( ( ruleelement_name ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4452:1: ( ruleelement_name )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4452:1: ( ruleelement_name )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4453:1: ruleelement_name
            {
             before(grammarAccess.getSimple_selectorAccess().getElementElement_nameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleelement_name_in_rule__Simple_selector__ElementAssignment_0_09098);
            ruleelement_name();

            state._fsp--;

             after(grammarAccess.getSimple_selectorAccess().getElementElement_nameParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__ElementAssignment_0_0"


    // $ANTLR start "rule__Simple_selector__SubSelectorsAssignment_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4462:1: rule__Simple_selector__SubSelectorsAssignment_0_1 : ( rulesub_selector ) ;
    public final void rule__Simple_selector__SubSelectorsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4466:1: ( ( rulesub_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4467:1: ( rulesub_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4467:1: ( rulesub_selector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4468:1: rulesub_selector
            {
             before(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulesub_selector_in_rule__Simple_selector__SubSelectorsAssignment_0_19129);
            rulesub_selector();

            state._fsp--;

             after(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__SubSelectorsAssignment_0_1"


    // $ANTLR start "rule__Simple_selector__SubSelectorsAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4477:1: rule__Simple_selector__SubSelectorsAssignment_1 : ( rulesub_selector ) ;
    public final void rule__Simple_selector__SubSelectorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4481:1: ( ( rulesub_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4482:1: ( rulesub_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4482:1: ( rulesub_selector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4483:1: rulesub_selector
            {
             before(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulesub_selector_in_rule__Simple_selector__SubSelectorsAssignment_19160);
            rulesub_selector();

            state._fsp--;

             after(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_selector__SubSelectorsAssignment_1"


    // $ANTLR start "rule__Sub_selector__IdAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4492:1: rule__Sub_selector__IdAssignment_0 : ( rulecss_id ) ;
    public final void rule__Sub_selector__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4496:1: ( ( rulecss_id ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4497:1: ( rulecss_id )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4497:1: ( rulecss_id )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4498:1: rulecss_id
            {
             before(grammarAccess.getSub_selectorAccess().getIdCss_idParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecss_id_in_rule__Sub_selector__IdAssignment_09191);
            rulecss_id();

            state._fsp--;

             after(grammarAccess.getSub_selectorAccess().getIdCss_idParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sub_selector__IdAssignment_0"


    // $ANTLR start "rule__Sub_selector__ClassAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4507:1: rule__Sub_selector__ClassAssignment_1 : ( rulecss_class ) ;
    public final void rule__Sub_selector__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4511:1: ( ( rulecss_class ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4512:1: ( rulecss_class )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4512:1: ( rulecss_class )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4513:1: rulecss_class
            {
             before(grammarAccess.getSub_selectorAccess().getClassCss_classParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulecss_class_in_rule__Sub_selector__ClassAssignment_19222);
            rulecss_class();

            state._fsp--;

             after(grammarAccess.getSub_selectorAccess().getClassCss_classParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sub_selector__ClassAssignment_1"


    // $ANTLR start "rule__Sub_selector__AttribAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4522:1: rule__Sub_selector__AttribAssignment_2 : ( rulecss_attrib ) ;
    public final void rule__Sub_selector__AttribAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4526:1: ( ( rulecss_attrib ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4527:1: ( rulecss_attrib )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4527:1: ( rulecss_attrib )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4528:1: rulecss_attrib
            {
             before(grammarAccess.getSub_selectorAccess().getAttribCss_attribParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulecss_attrib_in_rule__Sub_selector__AttribAssignment_29253);
            rulecss_attrib();

            state._fsp--;

             after(grammarAccess.getSub_selectorAccess().getAttribCss_attribParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sub_selector__AttribAssignment_2"


    // $ANTLR start "rule__Sub_selector__PseudoclassAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4537:1: rule__Sub_selector__PseudoclassAssignment_3 : ( rulecss_pseudo ) ;
    public final void rule__Sub_selector__PseudoclassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4541:1: ( ( rulecss_pseudo ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4542:1: ( rulecss_pseudo )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4542:1: ( rulecss_pseudo )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4543:1: rulecss_pseudo
            {
             before(grammarAccess.getSub_selectorAccess().getPseudoclassCss_pseudoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulecss_pseudo_in_rule__Sub_selector__PseudoclassAssignment_39284);
            rulecss_pseudo();

            state._fsp--;

             after(grammarAccess.getSub_selectorAccess().getPseudoclassCss_pseudoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sub_selector__PseudoclassAssignment_3"


    // $ANTLR start "rule__Css_generic_declaration__PropertyAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4552:1: rule__Css_generic_declaration__PropertyAssignment_0 : ( rulecss_property ) ;
    public final void rule__Css_generic_declaration__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4556:1: ( ( rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4557:1: ( rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4557:1: ( rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4558:1: rulecss_property
            {
             before(grammarAccess.getCss_generic_declarationAccess().getPropertyCss_propertyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecss_property_in_rule__Css_generic_declaration__PropertyAssignment_09315);
            rulecss_property();

            state._fsp--;

             after(grammarAccess.getCss_generic_declarationAccess().getPropertyCss_propertyParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__PropertyAssignment_0"


    // $ANTLR start "rule__Css_generic_declaration__ExpressionAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4567:1: rule__Css_generic_declaration__ExpressionAssignment_2 : ( ruleexpr ) ;
    public final void rule__Css_generic_declaration__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4571:1: ( ( ruleexpr ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4572:1: ( ruleexpr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4572:1: ( ruleexpr )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4573:1: ruleexpr
            {
             before(grammarAccess.getCss_generic_declarationAccess().getExpressionExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleexpr_in_rule__Css_generic_declaration__ExpressionAssignment_29346);
            ruleexpr();

            state._fsp--;

             after(grammarAccess.getCss_generic_declarationAccess().getExpressionExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Css_generic_declaration__ExpressionAssignment_2"


    // $ANTLR start "rule__Expr__TermGroupsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4582:1: rule__Expr__TermGroupsAssignment_0 : ( ruletermGroup ) ;
    public final void rule__Expr__TermGroupsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4586:1: ( ( ruletermGroup ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4587:1: ( ruletermGroup )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4587:1: ( ruletermGroup )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4588:1: ruletermGroup
            {
             before(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruletermGroup_in_rule__Expr__TermGroupsAssignment_09377);
            ruletermGroup();

            state._fsp--;

             after(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__TermGroupsAssignment_0"


    // $ANTLR start "rule__Expr__TermGroupsAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4597:1: rule__Expr__TermGroupsAssignment_1_1 : ( ruletermGroup ) ;
    public final void rule__Expr__TermGroupsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4601:1: ( ( ruletermGroup ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4602:1: ( ruletermGroup )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4602:1: ( ruletermGroup )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4603:1: ruletermGroup
            {
             before(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruletermGroup_in_rule__Expr__TermGroupsAssignment_1_19408);
            ruletermGroup();

            state._fsp--;

             after(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__TermGroupsAssignment_1_1"


    // $ANTLR start "rule__TermGroup__TermsAssignment"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4612:1: rule__TermGroup__TermsAssignment : ( ruleterm ) ;
    public final void rule__TermGroup__TermsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4616:1: ( ( ruleterm ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4617:1: ( ruleterm )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4617:1: ( ruleterm )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4618:1: ruleterm
            {
             before(grammarAccess.getTermGroupAccess().getTermsTermParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleterm_in_rule__TermGroup__TermsAssignment9439);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermGroupAccess().getTermsTermParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermGroup__TermsAssignment"


    // $ANTLR start "rule__Term__NumberAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4627:1: rule__Term__NumberAssignment_0 : ( rulenumberTerm ) ;
    public final void rule__Term__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4631:1: ( ( rulenumberTerm ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4632:1: ( rulenumberTerm )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4632:1: ( rulenumberTerm )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4633:1: rulenumberTerm
            {
             before(grammarAccess.getTermAccess().getNumberNumberTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulenumberTerm_in_rule__Term__NumberAssignment_09470);
            rulenumberTerm();

            state._fsp--;

             after(grammarAccess.getTermAccess().getNumberNumberTermParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__NumberAssignment_0"


    // $ANTLR start "rule__Term__StringValueAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4642:1: rule__Term__StringValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Term__StringValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4646:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4647:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4647:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4648:1: RULE_STRING
            {
             before(grammarAccess.getTermAccess().getStringValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Term__StringValueAssignment_19501); 
             after(grammarAccess.getTermAccess().getStringValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__StringValueAssignment_1"


    // $ANTLR start "rule__Term__IdentifierAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4657:1: rule__Term__IdentifierAssignment_2 : ( rulecss_property ) ;
    public final void rule__Term__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4661:1: ( ( rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4662:1: ( rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4662:1: ( rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4663:1: rulecss_property
            {
             before(grammarAccess.getTermAccess().getIdentifierCss_propertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulecss_property_in_rule__Term__IdentifierAssignment_29532);
            rulecss_property();

            state._fsp--;

             after(grammarAccess.getTermAccess().getIdentifierCss_propertyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__IdentifierAssignment_2"


    // $ANTLR start "rule__Term__UrlAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4672:1: rule__Term__UrlAssignment_3 : ( ruleURLType ) ;
    public final void rule__Term__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4676:1: ( ( ruleURLType ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4677:1: ( ruleURLType )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4677:1: ( ruleURLType )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4678:1: ruleURLType
            {
             before(grammarAccess.getTermAccess().getUrlURLTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleURLType_in_rule__Term__UrlAssignment_39563);
            ruleURLType();

            state._fsp--;

             after(grammarAccess.getTermAccess().getUrlURLTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__UrlAssignment_3"


    // $ANTLR start "rule__Term__FunctionAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4687:1: rule__Term__FunctionAssignment_4 : ( rulefunction ) ;
    public final void rule__Term__FunctionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4691:1: ( ( rulefunction ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4692:1: ( rulefunction )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4692:1: ( rulefunction )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4693:1: rulefunction
            {
             before(grammarAccess.getTermAccess().getFunctionFunctionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulefunction_in_rule__Term__FunctionAssignment_49594);
            rulefunction();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFunctionFunctionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__FunctionAssignment_4"


    // $ANTLR start "rule__Term__HexColorAssignment_5"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4702:1: rule__Term__HexColorAssignment_5 : ( ruleHexColor ) ;
    public final void rule__Term__HexColorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4706:1: ( ( ruleHexColor ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4707:1: ( ruleHexColor )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4707:1: ( ruleHexColor )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4708:1: ruleHexColor
            {
             before(grammarAccess.getTermAccess().getHexColorHexColorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleHexColor_in_rule__Term__HexColorAssignment_59625);
            ruleHexColor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getHexColorHexColorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__HexColorAssignment_5"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4717:1: rule__Function__NameAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4721:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4722:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4722:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4723:1: RULE_IDENT
            {
             before(grammarAccess.getFunctionAccess().getNameIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Function__NameAssignment_19656); 
             after(grammarAccess.getFunctionAccess().getNameIDENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__ExpressionAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4732:1: rule__Function__ExpressionAssignment_4 : ( ruleexpr ) ;
    public final void rule__Function__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4736:1: ( ( ruleexpr ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4737:1: ( ruleexpr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4737:1: ( ruleexpr )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4738:1: ruleexpr
            {
             before(grammarAccess.getFunctionAccess().getExpressionExprParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleexpr_in_rule__Function__ExpressionAssignment_49687);
            ruleexpr();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getExpressionExprParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ExpressionAssignment_4"


    // $ANTLR start "rule__URLType__UrlAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4747:1: rule__URLType__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__URLType__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4751:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4752:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4752:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4753:1: RULE_STRING
            {
             before(grammarAccess.getURLTypeAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__URLType__UrlAssignment_29718); 
             after(grammarAccess.getURLTypeAccess().getUrlSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URLType__UrlAssignment_2"

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\13\uffff";
    static final String DFA20_eofS =
        "\1\uffff\2\12\10\uffff";
    static final String DFA20_minS =
        "\1\12\2\4\10\uffff";
    static final String DFA20_maxS =
        "\1\13\2\57\10\uffff";
    static final String DFA20_acceptS =
        "\3\uffff\1\6\1\4\1\3\1\2\1\10\1\5\1\7\1\1";
    static final String DFA20_specialS =
        "\13\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\1\2",
            "\2\12\2\uffff\5\12\3\uffff\1\12\1\uffff\2\12\6\5\3\3\2\11"+
            "\2\7\3\uffff\1\12\1\uffff\1\12\4\uffff\2\12\1\6\1\4\1\10",
            "\2\12\2\uffff\5\12\3\uffff\1\12\1\uffff\2\12\6\5\3\3\2\11"+
            "\2\7\3\uffff\1\12\1\uffff\1\12\4\uffff\2\12\1\6\1\4\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1517:1: rule__NumberTerm__Alternatives_1 : ( ( ruleNUMBER ) | ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) );";
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Alternatives_in_rulestylesheet94 = new BitSet(new long[]{0x000002E200004032L});
    public static final BitSet FOLLOW_rulemedia_in_entryRulemedia122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__0_in_rulemedia155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_entryRulemedia_list182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia_list189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group__0_in_rulemedia_list215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_entryRulemedium242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedium249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulemedium275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_entryRuleruleset301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleset308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__0_in_ruleruleset334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0_in_ruleselector403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Alternatives_in_rulesimple_selector463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_entryRuleelement_name490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement_name497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element_name__Alternatives_in_ruleelement_name523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_entryRulesub_selector550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesub_selector557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__Alternatives_in_rulesub_selector583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_entryRulecss_class610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_class617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_class__Group__0_in_rulecss_class643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_entryRulecss_id670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_id677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_id__Group__0_in_rulecss_id703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_entryRulecss_attrib730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_attrib737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__0_in_rulecss_attrib763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_entryRulecss_declaration790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_declaration797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_rulecss_declaration823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_entryRulecss_generic_declaration849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_generic_declaration856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__0_in_rulecss_generic_declaration882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_entryRulecss_property909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_property916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__Group__0_in_rulecss_property942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_pseudo976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__0_in_rulecss_pseudo1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Group__0_in_rulecombinator1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoperator_in_entryRuleoperator1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoperator1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleoperator1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary_operator__Alternatives_in_ruleunary_operator1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr1214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0_in_ruleexpr1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_entryRuletermGroup1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermGroup1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermGroup__TermsAssignment_in_ruletermGroup1313 = new BitSet(new long[]{0x0000104000090D32L});
    public static final BitSet FOLLOW_rule__TermGroup__TermsAssignment_in_ruletermGroup1325 = new BitSet(new long[]{0x0000104000090D32L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm1355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleterm1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_entryRulenumberTerm1420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumberTerm1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTerm__Group__0_in_rulenumberTerm1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_entryRulenum1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenum1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Num__Alternatives_in_rulenum1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction1549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_rulefunction1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_entryRuleHexColor1613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexColor1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexColor__Group__0_in_ruleHexColor1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_entryRuleURLType1678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLType1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__0_in_ruleURLType1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleNUMBER1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePERCENTAGE1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__0_in_rulePERCENTAGE1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_entryRuleEMS1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMS1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMS__Group__0_in_ruleEMS1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_entryRuleEXS1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXS1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXS__Group__0_in_ruleEXS1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_entryRuleLENGTH1986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLENGTH1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__0_in_ruleLENGTH2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_entryRuleANGLE2050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANGLE2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__0_in_ruleANGLE2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_entryRuleTIME2110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTIME2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Group__0_in_ruleTIME2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_entryRuleFREQ2170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFREQ2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Group__0_in_ruleFREQ2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__RulesetAssignment_0_in_rule__Stylesheet__Alternatives2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__MediaAssignment_1_in_rule__Stylesheet__Alternatives2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__0_in_rule__Selector__Alternatives_12290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__0_in_rule__Selector__Alternatives_12308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__0_in_rule__Simple_selector__Alternatives2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives2361 = new BitSet(new long[]{0x000002E000004032L});
    public static final BitSet FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives2373 = new BitSet(new long[]{0x000002E000004032L});
    public static final BitSet FOLLOW_RULE_HEXDIGITS_in_rule__Element_name__Alternatives2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Element_name__Alternatives2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Element_name__Alternatives2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__IdAssignment_0_in_rule__Sub_selector__Alternatives2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__ClassAssignment_1_in_rule__Sub_selector__Alternatives2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__AttribAssignment_2_in_rule__Sub_selector__Alternatives2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__PseudoclassAssignment_3_in_rule__Sub_selector__Alternatives2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXDIGITS_in_rule__Css_class__Alternatives_12565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_class__Alternatives_12582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXDIGITS_in_rule__Css_id__Alternatives_12614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_id__Alternatives_12631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXDIGITS_in_rule__Css_attrib__Alternatives_12663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_attrib__Alternatives_12680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Css_attrib__Alternatives_2_02713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDES_in_rule__Css_attrib__Alternatives_2_02732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASHMATCH_in_rule__Css_attrib__Alternatives_2_02749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Alternatives_2_1_0_in_rule__Css_attrib__Alternatives_2_12781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Css_attrib__Alternatives_2_12799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXDIGITS_in_rule__Css_attrib__Alternatives_2_1_02831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_attrib__Alternatives_2_1_02848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_property__Alternatives_12880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXDIGITS_in_rule__Css_property__Alternatives_12897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Combinator__Alternatives_02930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Combinator__Alternatives_02950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Operator__Alternatives2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Operator__Alternatives3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Unary_operator__Alternatives3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Unary_operator__Alternatives3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__NumberAssignment_0_in_rule__Term__Alternatives3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__StringValueAssignment_1_in_rule__Term__Alternatives3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__IdentifierAssignment_2_in_rule__Term__Alternatives3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__UrlAssignment_3_in_rule__Term__Alternatives3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__FunctionAssignment_4_in_rule__Term__Alternatives3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__HexColorAssignment_5_in_rule__Term__Alternatives3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__NumberTerm__Alternatives_13214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_rule__NumberTerm__Alternatives_13231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_rule__NumberTerm__Alternatives_13248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_rule__NumberTerm__Alternatives_13265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_rule__NumberTerm__Alternatives_13282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_rule__NumberTerm__Alternatives_13299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_rule__NumberTerm__Alternatives_13316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_rule__NumberTerm__Alternatives_13333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__Num__Alternatives3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Num__Alternatives3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXDIGITS_in_rule__HexColor__Alternatives_13414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__HexColor__Alternatives_13431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LENGTH__Alternatives_13464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LENGTH__Alternatives_13484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LENGTH__Alternatives_13504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LENGTH__Alternatives_13524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LENGTH__Alternatives_13544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LENGTH__Alternatives_13564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ANGLE__Alternatives_13599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ANGLE__Alternatives_13619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ANGLE__Alternatives_13639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TIME__Alternatives_13674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TIME__Alternatives_13694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FREQ__Alternatives_13729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FREQ__Alternatives_13749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__0__Impl_in_rule__Media__Group__03781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Media__Group__1_in_rule__Media__Group__03784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Media__Group__0__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__1__Impl_in_rule__Media__Group__13843 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Media__Group__2_in_rule__Media__Group__13846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__MedialistAssignment_1_in_rule__Media__Group__1__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__2__Impl_in_rule__Media__Group__23903 = new BitSet(new long[]{0x000002E800004030L});
    public static final BitSet FOLLOW_rule__Media__Group__3_in_rule__Media__Group__23906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Media__Group__2__Impl3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__3__Impl_in_rule__Media__Group__33965 = new BitSet(new long[]{0x000002E800004030L});
    public static final BitSet FOLLOW_rule__Media__Group__4_in_rule__Media__Group__33968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__RulesetsAssignment_3_in_rule__Media__Group__3__Impl3995 = new BitSet(new long[]{0x000002E000004032L});
    public static final BitSet FOLLOW_rule__Media__Group__4__Impl_in_rule__Media__Group__44026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Media__Group__4__Impl4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group__0__Impl_in_rule__Media_list__Group__04095 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Media_list__Group__1_in_rule__Media_list__Group__04098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rule__Media_list__Group__0__Impl4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group__1__Impl_in_rule__Media_list__Group__14154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__0_in_rule__Media_list__Group__1__Impl4181 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__0__Impl_in_rule__Media_list__Group_1__04216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__1_in_rule__Media_list__Group_1__04219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Media_list__Group_1__0__Impl4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__1__Impl_in_rule__Media_list__Group_1__14275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rule__Media_list__Group_1__1__Impl4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__0__Impl_in_rule__Ruleset__Group__04335 = new BitSet(new long[]{0x0000000400000200L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__1_in_rule__Ruleset__Group__04338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__SelectorsAssignment_0_in_rule__Ruleset__Group__0__Impl4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__1__Impl_in_rule__Ruleset__Group__14395 = new BitSet(new long[]{0x0000000400000200L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__2_in_rule__Ruleset__Group__14398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__0_in_rule__Ruleset__Group__1__Impl4425 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__2__Impl_in_rule__Ruleset__Group__24456 = new BitSet(new long[]{0x0000000800080030L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__3_in_rule__Ruleset__Group__24459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Ruleset__Group__2__Impl4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__3__Impl_in_rule__Ruleset__Group__34518 = new BitSet(new long[]{0x0000000800080030L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__4_in_rule__Ruleset__Group__34521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_3__0_in_rule__Ruleset__Group__3__Impl4548 = new BitSet(new long[]{0x0000000000080032L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__4__Impl_in_rule__Ruleset__Group__44579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Ruleset__Group__4__Impl4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__0__Impl_in_rule__Ruleset__Group_1__04648 = new BitSet(new long[]{0x000002E000004030L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__1_in_rule__Ruleset__Group_1__04651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Ruleset__Group_1__0__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__1__Impl_in_rule__Ruleset__Group_1__14707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__SelectorsAssignment_1_1_in_rule__Ruleset__Group_1__1__Impl4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_3__0__Impl_in_rule__Ruleset__Group_3__04768 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_3__1_in_rule__Ruleset__Group_3__04771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__DeclarationsAssignment_3_0_in_rule__Ruleset__Group_3__0__Impl4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_3__1__Impl_in_rule__Ruleset__Group_3__14828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Ruleset__Group_3__1__Impl4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__04891 = new BitSet(new long[]{0x0000000000031000L});
    public static final BitSet FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__04894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SimpleselectorsAssignment_0_in_rule__Selector__Group__0__Impl4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__14951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Alternatives_1_in_rule__Selector__Group__1__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__0__Impl_in_rule__Selector__Group_1_0__05013 = new BitSet(new long[]{0x000002E000004030L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__1_in_rule__Selector__Group_1_0__05016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__CombinatorAssignment_1_0_0_in_rule__Selector__Group_1_0__0__Impl5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__1__Impl_in_rule__Selector__Group_1_0__15073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SelectorAssignment_1_0_1_in_rule__Selector__Group_1_0__1__Impl5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__0__Impl_in_rule__Selector__Group_1_1__05134 = new BitSet(new long[]{0x000002E000034030L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__1_in_rule__Selector__Group_1_1__05137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl5167 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl5180 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__1__Impl_in_rule__Selector__Group_1_1__15213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__0_in_rule__Selector__Group_1_1__1__Impl5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__0__Impl_in_rule__Selector__Group_1_1_1__05275 = new BitSet(new long[]{0x000002E000034030L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__1_in_rule__Selector__Group_1_1_1__05278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__CombinatorAssignment_1_1_1_0_in_rule__Selector__Group_1_1_1__0__Impl5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__1__Impl_in_rule__Selector__Group_1_1_1__15336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SelectorAssignment_1_1_1_1_in_rule__Selector__Group_1_1_1__1__Impl5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__0__Impl_in_rule__Simple_selector__Group_0__05397 = new BitSet(new long[]{0x000002E000004030L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__1_in_rule__Simple_selector__Group_0__05400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__ElementAssignment_0_0_in_rule__Simple_selector__Group_0__0__Impl5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__1__Impl_in_rule__Simple_selector__Group_0__15457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__SubSelectorsAssignment_0_1_in_rule__Simple_selector__Group_0__1__Impl5484 = new BitSet(new long[]{0x000002E000004032L});
    public static final BitSet FOLLOW_rule__Css_class__Group__0__Impl_in_rule__Css_class__Group__05519 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Css_class__Group__1_in_rule__Css_class__Group__05522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Css_class__Group__0__Impl5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_class__Group__1__Impl_in_rule__Css_class__Group__15581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_class__Alternatives_1_in_rule__Css_class__Group__1__Impl5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_id__Group__0__Impl_in_rule__Css_id__Group__05642 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Css_id__Group__1_in_rule__Css_id__Group__05645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Css_id__Group__0__Impl5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_id__Group__1__Impl_in_rule__Css_id__Group__15704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_id__Alternatives_1_in_rule__Css_id__Group__1__Impl5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__0__Impl_in_rule__Css_attrib__Group__05765 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__1_in_rule__Css_attrib__Group__05768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Css_attrib__Group__0__Impl5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__1__Impl_in_rule__Css_attrib__Group__15827 = new BitSet(new long[]{0x00000100000080C0L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__2_in_rule__Css_attrib__Group__15830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Alternatives_1_in_rule__Css_attrib__Group__1__Impl5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__2__Impl_in_rule__Css_attrib__Group__25887 = new BitSet(new long[]{0x00000100000080C0L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__3_in_rule__Css_attrib__Group__25890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group_2__0_in_rule__Css_attrib__Group__2__Impl5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__3__Impl_in_rule__Css_attrib__Group__35948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Css_attrib__Group__3__Impl5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group_2__0__Impl_in_rule__Css_attrib__Group_2__06015 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group_2__1_in_rule__Css_attrib__Group_2__06018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Alternatives_2_0_in_rule__Css_attrib__Group_2__0__Impl6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group_2__1__Impl_in_rule__Css_attrib__Group_2__16075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Alternatives_2_1_in_rule__Css_attrib__Group_2__1__Impl6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__0__Impl_in_rule__Css_generic_declaration__Group__06136 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__1_in_rule__Css_generic_declaration__Group__06139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__PropertyAssignment_0_in_rule__Css_generic_declaration__Group__0__Impl6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__1__Impl_in_rule__Css_generic_declaration__Group__16196 = new BitSet(new long[]{0x0000104000090D30L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__2_in_rule__Css_generic_declaration__Group__16199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Css_generic_declaration__Group__1__Impl6227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__2__Impl_in_rule__Css_generic_declaration__Group__26258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__ExpressionAssignment_2_in_rule__Css_generic_declaration__Group__2__Impl6285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__Group__0__Impl_in_rule__Css_property__Group__06321 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_rule__Css_property__Group__1_in_rule__Css_property__Group__06324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Css_property__Group__0__Impl6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__Group__1__Impl_in_rule__Css_property__Group__16386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__Alternatives_1_in_rule__Css_property__Group__1__Impl6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__0__Impl_in_rule__Css_pseudo__Group__06447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__1_in_rule__Css_pseudo__Group__06450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Css_pseudo__Group__0__Impl6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__1__Impl_in_rule__Css_pseudo__Group__16509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_pseudo__Group__1__Impl6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Group__0__Impl_in_rule__Combinator__Group__06569 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Combinator__Group__1_in_rule__Combinator__Group__06572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Alternatives_0_in_rule__Combinator__Group__0__Impl6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Group__1__Impl_in_rule__Combinator__Group__16629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Combinator__Group__1__Impl6657 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__06692 = new BitSet(new long[]{0x0000000000040200L});
    public static final BitSet FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__06695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__TermGroupsAssignment_0_in_rule__Expr__Group__0__Impl6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__16752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl6779 = new BitSet(new long[]{0x0000000000040202L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__06814 = new BitSet(new long[]{0x0000104000090D30L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__06817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoperator_in_rule__Expr__Group_1__0__Impl6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__16873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__TermGroupsAssignment_1_1_in_rule__Expr__Group_1__1__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTerm__Group__0__Impl_in_rule__NumberTerm__Group__06934 = new BitSet(new long[]{0x0000000000090C00L});
    public static final BitSet FOLLOW_rule__NumberTerm__Group__1_in_rule__NumberTerm__Group__06937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_rule__NumberTerm__Group__0__Impl6965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTerm__Group__1__Impl_in_rule__NumberTerm__Group__16996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTerm__Alternatives_1_in_rule__NumberTerm__Group__1__Impl7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__07057 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__07060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Function__Group__0__Impl7089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__17122 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__17125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__27182 = new BitSet(new long[]{0x0000104000091D30L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__27185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Function__Group__2__Impl7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__37244 = new BitSet(new long[]{0x0000104000091D30L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__37247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Function__Group__3__Impl7275 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__47306 = new BitSet(new long[]{0x0000080000001000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__47309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__ExpressionAssignment_4_in_rule__Function__Group__4__Impl7336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__57366 = new BitSet(new long[]{0x0000080000001000L});
    public static final BitSet FOLLOW_rule__Function__Group__6_in_rule__Function__Group__57369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Function__Group__5__Impl7397 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__67428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Function__Group__6__Impl7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexColor__Group__0__Impl_in_rule__HexColor__Group__07501 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_rule__HexColor__Group__1_in_rule__HexColor__Group__07504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__HexColor__Group__0__Impl7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexColor__Group__1__Impl_in_rule__HexColor__Group__17563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HexColor__Alternatives_1_in_rule__HexColor__Group__1__Impl7590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__0__Impl_in_rule__URLType__Group__07624 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__URLType__Group__1_in_rule__URLType__Group__07627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__URLType__Group__0__Impl7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__1__Impl_in_rule__URLType__Group__17686 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__URLType__Group__2_in_rule__URLType__Group__17689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__URLType__Group__1__Impl7717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__2__Impl_in_rule__URLType__Group__27748 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__URLType__Group__3_in_rule__URLType__Group__27751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__UrlAssignment_2_in_rule__URLType__Group__2__Impl7778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__3__Impl_in_rule__URLType__Group__37808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__URLType__Group__3__Impl7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__0__Impl_in_rule__PERCENTAGE__Group__07875 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__1_in_rule__PERCENTAGE__Group__07878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__PERCENTAGE__Group__0__Impl7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__1__Impl_in_rule__PERCENTAGE__Group__17934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__PERCENTAGE__Group__1__Impl7962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMS__Group__0__Impl_in_rule__EMS__Group__07997 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__EMS__Group__1_in_rule__EMS__Group__08000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__EMS__Group__0__Impl8027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMS__Group__1__Impl_in_rule__EMS__Group__18056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EMS__Group__1__Impl8084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXS__Group__0__Impl_in_rule__EXS__Group__08119 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__EXS__Group__1_in_rule__EXS__Group__08122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__EXS__Group__0__Impl8149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXS__Group__1__Impl_in_rule__EXS__Group__18178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EXS__Group__1__Impl8206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__0__Impl_in_rule__LENGTH__Group__08241 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__1_in_rule__LENGTH__Group__08244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__LENGTH__Group__0__Impl8271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__1__Impl_in_rule__LENGTH__Group__18300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Alternatives_1_in_rule__LENGTH__Group__1__Impl8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__0__Impl_in_rule__ANGLE__Group__08361 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__1_in_rule__ANGLE__Group__08364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__ANGLE__Group__0__Impl8391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__1__Impl_in_rule__ANGLE__Group__18420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Alternatives_1_in_rule__ANGLE__Group__1__Impl8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Group__0__Impl_in_rule__TIME__Group__08481 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__TIME__Group__1_in_rule__TIME__Group__08484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__TIME__Group__0__Impl8511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Group__1__Impl_in_rule__TIME__Group__18540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Alternatives_1_in_rule__TIME__Group__1__Impl8567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Group__0__Impl_in_rule__FREQ__Group__08601 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__FREQ__Group__1_in_rule__FREQ__Group__08604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__FREQ__Group__0__Impl8631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Group__1__Impl_in_rule__FREQ__Group__18660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Alternatives_1_in_rule__FREQ__Group__1__Impl8687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_rule__Stylesheet__RulesetAssignment_08726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_in_rule__Stylesheet__MediaAssignment_18757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_rule__Media__MedialistAssignment_18788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_rule__Media__RulesetsAssignment_38819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_08850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_1_18881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rule__Ruleset__DeclarationsAssignment_3_08912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_rule__Selector__SimpleselectorsAssignment_08943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_0_08974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_0_19005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_1_1_09036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_1_1_19067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_rule__Simple_selector__ElementAssignment_0_09098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_rule__Simple_selector__SubSelectorsAssignment_0_19129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_rule__Simple_selector__SubSelectorsAssignment_19160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_rule__Sub_selector__IdAssignment_09191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_rule__Sub_selector__ClassAssignment_19222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_rule__Sub_selector__AttribAssignment_29253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_rule__Sub_selector__PseudoclassAssignment_39284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_rule__Css_generic_declaration__PropertyAssignment_09315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Css_generic_declaration__ExpressionAssignment_29346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_rule__Expr__TermGroupsAssignment_09377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_rule__Expr__TermGroupsAssignment_1_19408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rule__TermGroup__TermsAssignment9439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_rule__Term__NumberAssignment_09470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Term__StringValueAssignment_19501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_rule__Term__IdentifierAssignment_29532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_rule__Term__UrlAssignment_39563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_rule__Term__FunctionAssignment_49594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_rule__Term__HexColorAssignment_59625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Function__NameAssignment_19656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Function__ExpressionAssignment_49687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__URLType__UrlAssignment_29718 = new BitSet(new long[]{0x0000000000000002L});

}