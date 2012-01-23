package at.bestsolution.efxclipse.tooling.css.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_HASH", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_STRING", "RULE_COMMA", "RULE_INTEGER", "RULE_REAL", "RULE_WS", "RULE_ML_COMMENT", "'!important'", "'@charset'", "'@CHARSET'", "'@import'", "'@IMPORT'", "'@page'", "'@PAGE'", "'@media'", "'@MEDIA'", "'*'", "'='", "'+'", "'>'", "'/'", "'-'", "'px'", "'cm'", "'mm'", "'in'", "'pt'", "'pc'", "'deg'", "'rad'", "'grad'", "'ms'", "'s'", "'hz'", "'khz'", "'em'", "'ex'", "';'", "'{'", "'}'", "':'", "'.'", "'['", "']'", "'('", "')'", "'url'", "'%'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_INCLUDES=6;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_REAL=11;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_COMMA=9;
    public static final int RULE_HASH=5;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_DASHMATCH=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_IDENT=4;
    public static final int T__38=38;
    public static final int T__39=39;
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:60:1: entryRulestylesheet : rulestylesheet EOF ;
    public final void entryRulestylesheet() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:61:1: ( rulestylesheet EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:62:1: rulestylesheet EOF
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:69:1: rulestylesheet : ( ( rule__Stylesheet__Group__0 ) ) ;
    public final void rulestylesheet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:73:2: ( ( ( rule__Stylesheet__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:74:1: ( ( rule__Stylesheet__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:74:1: ( ( rule__Stylesheet__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:75:1: ( rule__Stylesheet__Group__0 )
            {
             before(grammarAccess.getStylesheetAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:76:1: ( rule__Stylesheet__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:76:2: rule__Stylesheet__Group__0
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__0_in_rulestylesheet94);
            rule__Stylesheet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStylesheetAccess().getGroup()); 

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


    // $ANTLR start "entryRulecharset"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:88:1: entryRulecharset : rulecharset EOF ;
    public final void entryRulecharset() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:89:1: ( rulecharset EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:90:1: rulecharset EOF
            {
             before(grammarAccess.getCharsetRule()); 
            pushFollow(FOLLOW_rulecharset_in_entryRulecharset121);
            rulecharset();

            state._fsp--;

             after(grammarAccess.getCharsetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecharset128); 

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
    // $ANTLR end "entryRulecharset"


    // $ANTLR start "rulecharset"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:97:1: rulecharset : ( ( rule__Charset__Group__0 ) ) ;
    public final void rulecharset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:101:2: ( ( ( rule__Charset__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:102:1: ( ( rule__Charset__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:102:1: ( ( rule__Charset__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:103:1: ( rule__Charset__Group__0 )
            {
             before(grammarAccess.getCharsetAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:104:1: ( rule__Charset__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:104:2: rule__Charset__Group__0
            {
            pushFollow(FOLLOW_rule__Charset__Group__0_in_rulecharset154);
            rule__Charset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharsetAccess().getGroup()); 

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
    // $ANTLR end "rulecharset"


    // $ANTLR start "entryRuleimportExpression"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:116:1: entryRuleimportExpression : ruleimportExpression EOF ;
    public final void entryRuleimportExpression() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:117:1: ( ruleimportExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:118:1: ruleimportExpression EOF
            {
             before(grammarAccess.getImportExpressionRule()); 
            pushFollow(FOLLOW_ruleimportExpression_in_entryRuleimportExpression181);
            ruleimportExpression();

            state._fsp--;

             after(grammarAccess.getImportExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleimportExpression188); 

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
    // $ANTLR end "entryRuleimportExpression"


    // $ANTLR start "ruleimportExpression"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:125:1: ruleimportExpression : ( ( rule__ImportExpression__Alternatives ) ) ;
    public final void ruleimportExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:129:2: ( ( ( rule__ImportExpression__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:130:1: ( ( rule__ImportExpression__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:130:1: ( ( rule__ImportExpression__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:131:1: ( rule__ImportExpression__Alternatives )
            {
             before(grammarAccess.getImportExpressionAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:132:1: ( rule__ImportExpression__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:132:2: rule__ImportExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ImportExpression__Alternatives_in_ruleimportExpression214);
            rule__ImportExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImportExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleimportExpression"


    // $ANTLR start "entryRulepage"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:144:1: entryRulepage : rulepage EOF ;
    public final void entryRulepage() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:145:1: ( rulepage EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:146:1: rulepage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulepage_in_entryRulepage241);
            rulepage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepage248); 

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
    // $ANTLR end "entryRulepage"


    // $ANTLR start "rulepage"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:153:1: rulepage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulepage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:157:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:158:1: ( ( rule__Page__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:158:1: ( ( rule__Page__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:159:1: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:160:1: ( rule__Page__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:160:2: rule__Page__Group__0
            {
            pushFollow(FOLLOW_rule__Page__Group__0_in_rulepage274);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

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
    // $ANTLR end "rulepage"


    // $ANTLR start "entryRulepseudo_page"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:172:1: entryRulepseudo_page : rulepseudo_page EOF ;
    public final void entryRulepseudo_page() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:173:1: ( rulepseudo_page EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:174:1: rulepseudo_page EOF
            {
             before(grammarAccess.getPseudo_pageRule()); 
            pushFollow(FOLLOW_rulepseudo_page_in_entryRulepseudo_page301);
            rulepseudo_page();

            state._fsp--;

             after(grammarAccess.getPseudo_pageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepseudo_page308); 

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
    // $ANTLR end "entryRulepseudo_page"


    // $ANTLR start "rulepseudo_page"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:181:1: rulepseudo_page : ( ( rule__Pseudo_page__Group__0 ) ) ;
    public final void rulepseudo_page() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:185:2: ( ( ( rule__Pseudo_page__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:186:1: ( ( rule__Pseudo_page__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:186:1: ( ( rule__Pseudo_page__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:187:1: ( rule__Pseudo_page__Group__0 )
            {
             before(grammarAccess.getPseudo_pageAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:188:1: ( rule__Pseudo_page__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:188:2: rule__Pseudo_page__Group__0
            {
            pushFollow(FOLLOW_rule__Pseudo_page__Group__0_in_rulepseudo_page334);
            rule__Pseudo_page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPseudo_pageAccess().getGroup()); 

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
    // $ANTLR end "rulepseudo_page"


    // $ANTLR start "entryRulemedia"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:200:1: entryRulemedia : rulemedia EOF ;
    public final void entryRulemedia() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:201:1: ( rulemedia EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:202:1: rulemedia EOF
            {
             before(grammarAccess.getMediaRule()); 
            pushFollow(FOLLOW_rulemedia_in_entryRulemedia361);
            rulemedia();

            state._fsp--;

             after(grammarAccess.getMediaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia368); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:209:1: rulemedia : ( ( rule__Media__Group__0 ) ) ;
    public final void rulemedia() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:213:2: ( ( ( rule__Media__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:214:1: ( ( rule__Media__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:214:1: ( ( rule__Media__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:215:1: ( rule__Media__Group__0 )
            {
             before(grammarAccess.getMediaAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:216:1: ( rule__Media__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:216:2: rule__Media__Group__0
            {
            pushFollow(FOLLOW_rule__Media__Group__0_in_rulemedia394);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:228:1: entryRulemedia_list : rulemedia_list EOF ;
    public final void entryRulemedia_list() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:229:1: ( rulemedia_list EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:230:1: rulemedia_list EOF
            {
             before(grammarAccess.getMedia_listRule()); 
            pushFollow(FOLLOW_rulemedia_list_in_entryRulemedia_list421);
            rulemedia_list();

            state._fsp--;

             after(grammarAccess.getMedia_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia_list428); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:237:1: rulemedia_list : ( ( rule__Media_list__Group__0 ) ) ;
    public final void rulemedia_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:241:2: ( ( ( rule__Media_list__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:242:1: ( ( rule__Media_list__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:242:1: ( ( rule__Media_list__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:243:1: ( rule__Media_list__Group__0 )
            {
             before(grammarAccess.getMedia_listAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:244:1: ( rule__Media_list__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:244:2: rule__Media_list__Group__0
            {
            pushFollow(FOLLOW_rule__Media_list__Group__0_in_rulemedia_list454);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:256:1: entryRulemedium : rulemedium EOF ;
    public final void entryRulemedium() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:257:1: ( rulemedium EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:258:1: rulemedium EOF
            {
             before(grammarAccess.getMediumRule()); 
            pushFollow(FOLLOW_rulemedium_in_entryRulemedium481);
            rulemedium();

            state._fsp--;

             after(grammarAccess.getMediumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedium488); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:265:1: rulemedium : ( RULE_IDENT ) ;
    public final void rulemedium() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:269:2: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:270:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:270:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:271:1: RULE_IDENT
            {
             before(grammarAccess.getMediumAccess().getIDENTTerminalRuleCall()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulemedium514); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:284:1: entryRuleruleset : ruleruleset EOF ;
    public final void entryRuleruleset() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:285:1: ( ruleruleset EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:286:1: ruleruleset EOF
            {
             before(grammarAccess.getRulesetRule()); 
            pushFollow(FOLLOW_ruleruleset_in_entryRuleruleset540);
            ruleruleset();

            state._fsp--;

             after(grammarAccess.getRulesetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleset547); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:293:1: ruleruleset : ( ( rule__Ruleset__Group__0 ) ) ;
    public final void ruleruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:297:2: ( ( ( rule__Ruleset__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:298:1: ( ( rule__Ruleset__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:298:1: ( ( rule__Ruleset__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:299:1: ( rule__Ruleset__Group__0 )
            {
             before(grammarAccess.getRulesetAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:300:1: ( rule__Ruleset__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:300:2: rule__Ruleset__Group__0
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__0_in_ruleruleset573);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:312:1: entryRuleselector : ruleselector EOF ;
    public final void entryRuleselector() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:316:1: ( ruleselector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:317:1: ruleselector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector605);
            ruleselector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector612); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:327:1: ruleselector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleselector() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:332:2: ( ( ( rule__Selector__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:333:1: ( ( rule__Selector__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:333:1: ( ( rule__Selector__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:334:1: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:335:1: ( rule__Selector__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:335:2: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_rule__Selector__Group__0_in_ruleselector642);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:348:1: entryRulesimple_selector : rulesimple_selector EOF ;
    public final void entryRulesimple_selector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:349:1: ( rulesimple_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:350:1: rulesimple_selector EOF
            {
             before(grammarAccess.getSimple_selectorRule()); 
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector669);
            rulesimple_selector();

            state._fsp--;

             after(grammarAccess.getSimple_selectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector676); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:357:1: rulesimple_selector : ( ( rule__Simple_selector__Alternatives ) ) ;
    public final void rulesimple_selector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:361:2: ( ( ( rule__Simple_selector__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:362:1: ( ( rule__Simple_selector__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:362:1: ( ( rule__Simple_selector__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:363:1: ( rule__Simple_selector__Alternatives )
            {
             before(grammarAccess.getSimple_selectorAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:364:1: ( rule__Simple_selector__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:364:2: rule__Simple_selector__Alternatives
            {
            pushFollow(FOLLOW_rule__Simple_selector__Alternatives_in_rulesimple_selector702);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:376:1: entryRuleelement_name : ruleelement_name EOF ;
    public final void entryRuleelement_name() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:377:1: ( ruleelement_name EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:378:1: ruleelement_name EOF
            {
             before(grammarAccess.getElement_nameRule()); 
            pushFollow(FOLLOW_ruleelement_name_in_entryRuleelement_name729);
            ruleelement_name();

            state._fsp--;

             after(grammarAccess.getElement_nameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement_name736); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:385:1: ruleelement_name : ( ( rule__Element_name__Alternatives ) ) ;
    public final void ruleelement_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:389:2: ( ( ( rule__Element_name__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:390:1: ( ( rule__Element_name__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:390:1: ( ( rule__Element_name__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:391:1: ( rule__Element_name__Alternatives )
            {
             before(grammarAccess.getElement_nameAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:392:1: ( rule__Element_name__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:392:2: rule__Element_name__Alternatives
            {
            pushFollow(FOLLOW_rule__Element_name__Alternatives_in_ruleelement_name762);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:404:1: entryRulesub_selector : rulesub_selector EOF ;
    public final void entryRulesub_selector() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:405:1: ( rulesub_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:406:1: rulesub_selector EOF
            {
             before(grammarAccess.getSub_selectorRule()); 
            pushFollow(FOLLOW_rulesub_selector_in_entryRulesub_selector789);
            rulesub_selector();

            state._fsp--;

             after(grammarAccess.getSub_selectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesub_selector796); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:413:1: rulesub_selector : ( ( rule__Sub_selector__Alternatives ) ) ;
    public final void rulesub_selector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:417:2: ( ( ( rule__Sub_selector__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:418:1: ( ( rule__Sub_selector__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:418:1: ( ( rule__Sub_selector__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:419:1: ( rule__Sub_selector__Alternatives )
            {
             before(grammarAccess.getSub_selectorAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:420:1: ( rule__Sub_selector__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:420:2: rule__Sub_selector__Alternatives
            {
            pushFollow(FOLLOW_rule__Sub_selector__Alternatives_in_rulesub_selector822);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:432:1: entryRulecss_class : rulecss_class EOF ;
    public final void entryRulecss_class() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:433:1: ( rulecss_class EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:434:1: rulecss_class EOF
            {
             before(grammarAccess.getCss_classRule()); 
            pushFollow(FOLLOW_rulecss_class_in_entryRulecss_class849);
            rulecss_class();

            state._fsp--;

             after(grammarAccess.getCss_classRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_class856); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:441:1: rulecss_class : ( ( rule__Css_class__Group__0 ) ) ;
    public final void rulecss_class() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:445:2: ( ( ( rule__Css_class__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:446:1: ( ( rule__Css_class__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:446:1: ( ( rule__Css_class__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:447:1: ( rule__Css_class__Group__0 )
            {
             before(grammarAccess.getCss_classAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:448:1: ( rule__Css_class__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:448:2: rule__Css_class__Group__0
            {
            pushFollow(FOLLOW_rule__Css_class__Group__0_in_rulecss_class882);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:460:1: entryRulecss_id : rulecss_id EOF ;
    public final void entryRulecss_id() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:461:1: ( rulecss_id EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:462:1: rulecss_id EOF
            {
             before(grammarAccess.getCss_idRule()); 
            pushFollow(FOLLOW_rulecss_id_in_entryRulecss_id909);
            rulecss_id();

            state._fsp--;

             after(grammarAccess.getCss_idRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_id916); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:469:1: rulecss_id : ( RULE_HASH ) ;
    public final void rulecss_id() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:473:2: ( ( RULE_HASH ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:474:1: ( RULE_HASH )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:474:1: ( RULE_HASH )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:475:1: RULE_HASH
            {
             before(grammarAccess.getCss_idAccess().getHASHTerminalRuleCall()); 
            match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulecss_id942); 
             after(grammarAccess.getCss_idAccess().getHASHTerminalRuleCall()); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:488:1: entryRulecss_attrib : rulecss_attrib EOF ;
    public final void entryRulecss_attrib() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:489:1: ( rulecss_attrib EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:490:1: rulecss_attrib EOF
            {
             before(grammarAccess.getCss_attribRule()); 
            pushFollow(FOLLOW_rulecss_attrib_in_entryRulecss_attrib968);
            rulecss_attrib();

            state._fsp--;

             after(grammarAccess.getCss_attribRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_attrib975); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:497:1: rulecss_attrib : ( ( rule__Css_attrib__Group__0 ) ) ;
    public final void rulecss_attrib() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:501:2: ( ( ( rule__Css_attrib__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:502:1: ( ( rule__Css_attrib__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:502:1: ( ( rule__Css_attrib__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:503:1: ( rule__Css_attrib__Group__0 )
            {
             before(grammarAccess.getCss_attribAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:504:1: ( rule__Css_attrib__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:504:2: rule__Css_attrib__Group__0
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__0_in_rulecss_attrib1001);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:516:1: entryRulecss_declaration : rulecss_declaration EOF ;
    public final void entryRulecss_declaration() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:517:1: ( rulecss_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:518:1: rulecss_declaration EOF
            {
             before(grammarAccess.getCss_declarationRule()); 
            pushFollow(FOLLOW_rulecss_declaration_in_entryRulecss_declaration1028);
            rulecss_declaration();

            state._fsp--;

             after(grammarAccess.getCss_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_declaration1035); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:525:1: rulecss_declaration : ( rulecss_generic_declaration ) ;
    public final void rulecss_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:529:2: ( ( rulecss_generic_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:530:1: ( rulecss_generic_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:530:1: ( rulecss_generic_declaration )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:531:1: rulecss_generic_declaration
            {
             before(grammarAccess.getCss_declarationAccess().getCss_generic_declarationParserRuleCall()); 
            pushFollow(FOLLOW_rulecss_generic_declaration_in_rulecss_declaration1061);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:544:1: entryRulecss_generic_declaration : rulecss_generic_declaration EOF ;
    public final void entryRulecss_generic_declaration() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:545:1: ( rulecss_generic_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:546:1: rulecss_generic_declaration EOF
            {
             before(grammarAccess.getCss_generic_declarationRule()); 
            pushFollow(FOLLOW_rulecss_generic_declaration_in_entryRulecss_generic_declaration1087);
            rulecss_generic_declaration();

            state._fsp--;

             after(grammarAccess.getCss_generic_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_generic_declaration1094); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:553:1: rulecss_generic_declaration : ( ( rule__Css_generic_declaration__Group__0 ) ) ;
    public final void rulecss_generic_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:557:2: ( ( ( rule__Css_generic_declaration__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:558:1: ( ( rule__Css_generic_declaration__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:558:1: ( ( rule__Css_generic_declaration__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:559:1: ( rule__Css_generic_declaration__Group__0 )
            {
             before(grammarAccess.getCss_generic_declarationAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:560:1: ( rule__Css_generic_declaration__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:560:2: rule__Css_generic_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__0_in_rulecss_generic_declaration1120);
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


    // $ANTLR start "entryRulecss_prio"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:572:1: entryRulecss_prio : rulecss_prio EOF ;
    public final void entryRulecss_prio() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:573:1: ( rulecss_prio EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:574:1: rulecss_prio EOF
            {
             before(grammarAccess.getCss_prioRule()); 
            pushFollow(FOLLOW_rulecss_prio_in_entryRulecss_prio1147);
            rulecss_prio();

            state._fsp--;

             after(grammarAccess.getCss_prioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_prio1154); 

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
    // $ANTLR end "entryRulecss_prio"


    // $ANTLR start "rulecss_prio"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:581:1: rulecss_prio : ( ruleIMPORTANT_SYM ) ;
    public final void rulecss_prio() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:585:2: ( ( ruleIMPORTANT_SYM ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:586:1: ( ruleIMPORTANT_SYM )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:586:1: ( ruleIMPORTANT_SYM )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:587:1: ruleIMPORTANT_SYM
            {
             before(grammarAccess.getCss_prioAccess().getIMPORTANT_SYMParserRuleCall()); 
            pushFollow(FOLLOW_ruleIMPORTANT_SYM_in_rulecss_prio1180);
            ruleIMPORTANT_SYM();

            state._fsp--;

             after(grammarAccess.getCss_prioAccess().getIMPORTANT_SYMParserRuleCall()); 

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
    // $ANTLR end "rulecss_prio"


    // $ANTLR start "entryRulecss_property"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:600:1: entryRulecss_property : rulecss_property EOF ;
    public final void entryRulecss_property() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:601:1: ( rulecss_property EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:602:1: rulecss_property EOF
            {
             before(grammarAccess.getCss_propertyRule()); 
            pushFollow(FOLLOW_rulecss_property_in_entryRulecss_property1206);
            rulecss_property();

            state._fsp--;

             after(grammarAccess.getCss_propertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_property1213); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:609:1: rulecss_property : ( ( rule__Css_property__Group__0 ) ) ;
    public final void rulecss_property() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:613:2: ( ( ( rule__Css_property__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:614:1: ( ( rule__Css_property__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:614:1: ( ( rule__Css_property__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:615:1: ( rule__Css_property__Group__0 )
            {
             before(grammarAccess.getCss_propertyAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:616:1: ( rule__Css_property__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:616:2: rule__Css_property__Group__0
            {
            pushFollow(FOLLOW_rule__Css_property__Group__0_in_rulecss_property1239);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:628:1: entryRulecss_pseudo : rulecss_pseudo EOF ;
    public final void entryRulecss_pseudo() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:629:1: ( rulecss_pseudo EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:630:1: rulecss_pseudo EOF
            {
             before(grammarAccess.getCss_pseudoRule()); 
            pushFollow(FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo1266);
            rulecss_pseudo();

            state._fsp--;

             after(grammarAccess.getCss_pseudoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_pseudo1273); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:637:1: rulecss_pseudo : ( ( rule__Css_pseudo__Group__0 ) ) ;
    public final void rulecss_pseudo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:641:2: ( ( ( rule__Css_pseudo__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:642:1: ( ( rule__Css_pseudo__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:642:1: ( ( rule__Css_pseudo__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:643:1: ( rule__Css_pseudo__Group__0 )
            {
             before(grammarAccess.getCss_pseudoAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:644:1: ( rule__Css_pseudo__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:644:2: rule__Css_pseudo__Group__0
            {
            pushFollow(FOLLOW_rule__Css_pseudo__Group__0_in_rulecss_pseudo1299);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:656:1: entryRulecombinator : rulecombinator EOF ;
    public final void entryRulecombinator() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:657:1: ( rulecombinator EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:658:1: rulecombinator EOF
            {
             before(grammarAccess.getCombinatorRule()); 
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator1326);
            rulecombinator();

            state._fsp--;

             after(grammarAccess.getCombinatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator1333); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:665:1: rulecombinator : ( ( rule__Combinator__Group__0 ) ) ;
    public final void rulecombinator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:669:2: ( ( ( rule__Combinator__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:670:1: ( ( rule__Combinator__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:670:1: ( ( rule__Combinator__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:671:1: ( rule__Combinator__Group__0 )
            {
             before(grammarAccess.getCombinatorAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:672:1: ( rule__Combinator__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:672:2: rule__Combinator__Group__0
            {
            pushFollow(FOLLOW_rule__Combinator__Group__0_in_rulecombinator1359);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:684:1: entryRuleoperator : ruleoperator EOF ;
    public final void entryRuleoperator() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:685:1: ( ruleoperator EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:686:1: ruleoperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleoperator_in_entryRuleoperator1386);
            ruleoperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoperator1393); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:693:1: ruleoperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleoperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:697:2: ( ( ( rule__Operator__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:698:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:698:1: ( ( rule__Operator__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:699:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:700:1: ( rule__Operator__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:700:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleoperator1419);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:712:1: entryRuleunary_operator : ruleunary_operator EOF ;
    public final void entryRuleunary_operator() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:713:1: ( ruleunary_operator EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:714:1: ruleunary_operator EOF
            {
             before(grammarAccess.getUnary_operatorRule()); 
            pushFollow(FOLLOW_ruleunary_operator_in_entryRuleunary_operator1446);
            ruleunary_operator();

            state._fsp--;

             after(grammarAccess.getUnary_operatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_operator1453); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:721:1: ruleunary_operator : ( ( rule__Unary_operator__Alternatives ) ) ;
    public final void ruleunary_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:725:2: ( ( ( rule__Unary_operator__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:726:1: ( ( rule__Unary_operator__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:726:1: ( ( rule__Unary_operator__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:727:1: ( rule__Unary_operator__Alternatives )
            {
             before(grammarAccess.getUnary_operatorAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:728:1: ( rule__Unary_operator__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:728:2: rule__Unary_operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Unary_operator__Alternatives_in_ruleunary_operator1479);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:740:1: entryRuleexpr : ruleexpr EOF ;
    public final void entryRuleexpr() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:744:1: ( ruleexpr EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:745:1: ruleexpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr1511);
            ruleexpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr1518); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:755:1: ruleexpr : ( ( rule__Expr__Group__0 ) ) ;
    public final void ruleexpr() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:760:2: ( ( ( rule__Expr__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:761:1: ( ( rule__Expr__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:761:1: ( ( rule__Expr__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:762:1: ( rule__Expr__Group__0 )
            {
             before(grammarAccess.getExprAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:763:1: ( rule__Expr__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:763:2: rule__Expr__Group__0
            {
            pushFollow(FOLLOW_rule__Expr__Group__0_in_ruleexpr1548);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:776:1: entryRuletermGroup : ruletermGroup EOF ;
    public final void entryRuletermGroup() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:777:1: ( ruletermGroup EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:778:1: ruletermGroup EOF
            {
             before(grammarAccess.getTermGroupRule()); 
            pushFollow(FOLLOW_ruletermGroup_in_entryRuletermGroup1575);
            ruletermGroup();

            state._fsp--;

             after(grammarAccess.getTermGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletermGroup1582); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:785:1: ruletermGroup : ( ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* ) ) ;
    public final void ruletermGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:789:2: ( ( ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:790:1: ( ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:790:1: ( ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:791:1: ( ( rule__TermGroup__TermsAssignment ) ) ( ( rule__TermGroup__TermsAssignment )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:791:1: ( ( rule__TermGroup__TermsAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:792:1: ( rule__TermGroup__TermsAssignment )
            {
             before(grammarAccess.getTermGroupAccess().getTermsAssignment()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:793:1: ( rule__TermGroup__TermsAssignment )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:793:2: rule__TermGroup__TermsAssignment
            {
            pushFollow(FOLLOW_rule__TermGroup__TermsAssignment_in_ruletermGroup1610);
            rule__TermGroup__TermsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTermGroupAccess().getTermsAssignment()); 

            }

            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:796:1: ( ( rule__TermGroup__TermsAssignment )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:797:1: ( rule__TermGroup__TermsAssignment )*
            {
             before(grammarAccess.getTermGroupAccess().getTermsAssignment()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:798:1: ( rule__TermGroup__TermsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_IDENT && LA1_0<=RULE_HASH)||LA1_0==RULE_STRING||(LA1_0>=RULE_INTEGER && LA1_0<=RULE_REAL)||LA1_0==25||LA1_0==28||LA1_0==53) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:798:2: rule__TermGroup__TermsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__TermGroup__TermsAssignment_in_ruletermGroup1622);
            	    rule__TermGroup__TermsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:811:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:812:1: ( ruleterm EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:813:1: ruleterm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm1652);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm1659); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:820:1: ruleterm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:824:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:825:1: ( ( rule__Term__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:825:1: ( ( rule__Term__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:826:1: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:827:1: ( rule__Term__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:827:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleterm1685);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:839:1: entryRulenumberTerm : rulenumberTerm EOF ;
    public final void entryRulenumberTerm() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:843:1: ( rulenumberTerm EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:844:1: rulenumberTerm EOF
            {
             before(grammarAccess.getNumberTermRule()); 
            pushFollow(FOLLOW_rulenumberTerm_in_entryRulenumberTerm1717);
            rulenumberTerm();

            state._fsp--;

             after(grammarAccess.getNumberTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumberTerm1724); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:854:1: rulenumberTerm : ( ( rule__NumberTerm__Group__0 ) ) ;
    public final void rulenumberTerm() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:859:2: ( ( ( rule__NumberTerm__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:860:1: ( ( rule__NumberTerm__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:860:1: ( ( rule__NumberTerm__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:861:1: ( rule__NumberTerm__Group__0 )
            {
             before(grammarAccess.getNumberTermAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:862:1: ( rule__NumberTerm__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:862:2: rule__NumberTerm__Group__0
            {
            pushFollow(FOLLOW_rule__NumberTerm__Group__0_in_rulenumberTerm1754);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:875:1: entryRulenum : rulenum EOF ;
    public final void entryRulenum() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:876:1: ( rulenum EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:877:1: rulenum EOF
            {
             before(grammarAccess.getNumRule()); 
            pushFollow(FOLLOW_rulenum_in_entryRulenum1781);
            rulenum();

            state._fsp--;

             after(grammarAccess.getNumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenum1788); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:884:1: rulenum : ( ( rule__Num__Alternatives ) ) ;
    public final void rulenum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:888:2: ( ( ( rule__Num__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:889:1: ( ( rule__Num__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:889:1: ( ( rule__Num__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:890:1: ( rule__Num__Alternatives )
            {
             before(grammarAccess.getNumAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:891:1: ( rule__Num__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:891:2: rule__Num__Alternatives
            {
            pushFollow(FOLLOW_rule__Num__Alternatives_in_rulenum1814);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:903:1: entryRulefunction : rulefunction EOF ;
    public final void entryRulefunction() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:907:1: ( rulefunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:908:1: rulefunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction1846);
            rulefunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction1853); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:918:1: rulefunction : ( ( rule__Function__Group__0 ) ) ;
    public final void rulefunction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:923:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:924:1: ( ( rule__Function__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:924:1: ( ( rule__Function__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:925:1: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:926:1: ( rule__Function__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:926:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_rulefunction1883);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:939:1: entryRuleHexColor : ruleHexColor EOF ;
    public final void entryRuleHexColor() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:943:1: ( ruleHexColor EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:944:1: ruleHexColor EOF
            {
             before(grammarAccess.getHexColorRule()); 
            pushFollow(FOLLOW_ruleHexColor_in_entryRuleHexColor1915);
            ruleHexColor();

            state._fsp--;

             after(grammarAccess.getHexColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexColor1922); 

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
    // $ANTLR end "entryRuleHexColor"


    // $ANTLR start "ruleHexColor"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:954:1: ruleHexColor : ( RULE_HASH ) ;
    public final void ruleHexColor() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:959:2: ( ( RULE_HASH ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:960:1: ( RULE_HASH )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:960:1: ( RULE_HASH )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:961:1: RULE_HASH
            {
             before(grammarAccess.getHexColorAccess().getHASHTerminalRuleCall()); 
            match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleHexColor1952); 
             after(grammarAccess.getHexColorAccess().getHASHTerminalRuleCall()); 

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
    // $ANTLR end "ruleHexColor"


    // $ANTLR start "entryRuleURLType"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:975:1: entryRuleURLType : ruleURLType EOF ;
    public final void entryRuleURLType() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:979:1: ( ruleURLType EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:980:1: ruleURLType EOF
            {
             before(grammarAccess.getURLTypeRule()); 
            pushFollow(FOLLOW_ruleURLType_in_entryRuleURLType1983);
            ruleURLType();

            state._fsp--;

             after(grammarAccess.getURLTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLType1990); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:990:1: ruleURLType : ( ( rule__URLType__Group__0 ) ) ;
    public final void ruleURLType() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:995:2: ( ( ( rule__URLType__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:996:1: ( ( rule__URLType__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:996:1: ( ( rule__URLType__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:997:1: ( rule__URLType__Group__0 )
            {
             before(grammarAccess.getURLTypeAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:998:1: ( rule__URLType__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:998:2: rule__URLType__Group__0
            {
            pushFollow(FOLLOW_rule__URLType__Group__0_in_ruleURLType2020);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1011:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1012:1: ( ruleNUMBER EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1013:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER2047);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER2054); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1020:1: ruleNUMBER : ( rulenum ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1024:2: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1025:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1025:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1026:1: rulenum
            {
             before(grammarAccess.getNUMBERAccess().getNumParserRuleCall()); 
            pushFollow(FOLLOW_rulenum_in_ruleNUMBER2080);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1039:1: entryRulePERCENTAGE : rulePERCENTAGE EOF ;
    public final void entryRulePERCENTAGE() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1040:1: ( rulePERCENTAGE EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1041:1: rulePERCENTAGE EOF
            {
             before(grammarAccess.getPERCENTAGERule()); 
            pushFollow(FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE2106);
            rulePERCENTAGE();

            state._fsp--;

             after(grammarAccess.getPERCENTAGERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePERCENTAGE2113); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1048:1: rulePERCENTAGE : ( ( rule__PERCENTAGE__Group__0 ) ) ;
    public final void rulePERCENTAGE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1052:2: ( ( ( rule__PERCENTAGE__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1053:1: ( ( rule__PERCENTAGE__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1053:1: ( ( rule__PERCENTAGE__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1054:1: ( rule__PERCENTAGE__Group__0 )
            {
             before(grammarAccess.getPERCENTAGEAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1055:1: ( rule__PERCENTAGE__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1055:2: rule__PERCENTAGE__Group__0
            {
            pushFollow(FOLLOW_rule__PERCENTAGE__Group__0_in_rulePERCENTAGE2139);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1067:1: entryRuleEMS : ruleEMS EOF ;
    public final void entryRuleEMS() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1068:1: ( ruleEMS EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1069:1: ruleEMS EOF
            {
             before(grammarAccess.getEMSRule()); 
            pushFollow(FOLLOW_ruleEMS_in_entryRuleEMS2166);
            ruleEMS();

            state._fsp--;

             after(grammarAccess.getEMSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMS2173); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1076:1: ruleEMS : ( ( rule__EMS__Group__0 ) ) ;
    public final void ruleEMS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1080:2: ( ( ( rule__EMS__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1081:1: ( ( rule__EMS__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1081:1: ( ( rule__EMS__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1082:1: ( rule__EMS__Group__0 )
            {
             before(grammarAccess.getEMSAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1083:1: ( rule__EMS__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1083:2: rule__EMS__Group__0
            {
            pushFollow(FOLLOW_rule__EMS__Group__0_in_ruleEMS2199);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1095:1: entryRuleEXS : ruleEXS EOF ;
    public final void entryRuleEXS() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1096:1: ( ruleEXS EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1097:1: ruleEXS EOF
            {
             before(grammarAccess.getEXSRule()); 
            pushFollow(FOLLOW_ruleEXS_in_entryRuleEXS2226);
            ruleEXS();

            state._fsp--;

             after(grammarAccess.getEXSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXS2233); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1104:1: ruleEXS : ( ( rule__EXS__Group__0 ) ) ;
    public final void ruleEXS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1108:2: ( ( ( rule__EXS__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1109:1: ( ( rule__EXS__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1109:1: ( ( rule__EXS__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1110:1: ( rule__EXS__Group__0 )
            {
             before(grammarAccess.getEXSAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1111:1: ( rule__EXS__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1111:2: rule__EXS__Group__0
            {
            pushFollow(FOLLOW_rule__EXS__Group__0_in_ruleEXS2259);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1123:1: entryRuleLENGTH : ruleLENGTH EOF ;
    public final void entryRuleLENGTH() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1127:1: ( ruleLENGTH EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1128:1: ruleLENGTH EOF
            {
             before(grammarAccess.getLENGTHRule()); 
            pushFollow(FOLLOW_ruleLENGTH_in_entryRuleLENGTH2291);
            ruleLENGTH();

            state._fsp--;

             after(grammarAccess.getLENGTHRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLENGTH2298); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1138:1: ruleLENGTH : ( ( rule__LENGTH__Group__0 ) ) ;
    public final void ruleLENGTH() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1143:2: ( ( ( rule__LENGTH__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1144:1: ( ( rule__LENGTH__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1144:1: ( ( rule__LENGTH__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1145:1: ( rule__LENGTH__Group__0 )
            {
             before(grammarAccess.getLENGTHAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1146:1: ( rule__LENGTH__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1146:2: rule__LENGTH__Group__0
            {
            pushFollow(FOLLOW_rule__LENGTH__Group__0_in_ruleLENGTH2328);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1159:1: entryRuleANGLE : ruleANGLE EOF ;
    public final void entryRuleANGLE() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1160:1: ( ruleANGLE EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1161:1: ruleANGLE EOF
            {
             before(grammarAccess.getANGLERule()); 
            pushFollow(FOLLOW_ruleANGLE_in_entryRuleANGLE2355);
            ruleANGLE();

            state._fsp--;

             after(grammarAccess.getANGLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANGLE2362); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1168:1: ruleANGLE : ( ( rule__ANGLE__Group__0 ) ) ;
    public final void ruleANGLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1172:2: ( ( ( rule__ANGLE__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1173:1: ( ( rule__ANGLE__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1173:1: ( ( rule__ANGLE__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1174:1: ( rule__ANGLE__Group__0 )
            {
             before(grammarAccess.getANGLEAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1175:1: ( rule__ANGLE__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1175:2: rule__ANGLE__Group__0
            {
            pushFollow(FOLLOW_rule__ANGLE__Group__0_in_ruleANGLE2388);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1187:1: entryRuleTIME : ruleTIME EOF ;
    public final void entryRuleTIME() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1188:1: ( ruleTIME EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1189:1: ruleTIME EOF
            {
             before(grammarAccess.getTIMERule()); 
            pushFollow(FOLLOW_ruleTIME_in_entryRuleTIME2415);
            ruleTIME();

            state._fsp--;

             after(grammarAccess.getTIMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTIME2422); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1196:1: ruleTIME : ( ( rule__TIME__Group__0 ) ) ;
    public final void ruleTIME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1200:2: ( ( ( rule__TIME__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1201:1: ( ( rule__TIME__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1201:1: ( ( rule__TIME__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1202:1: ( rule__TIME__Group__0 )
            {
             before(grammarAccess.getTIMEAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1203:1: ( rule__TIME__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1203:2: rule__TIME__Group__0
            {
            pushFollow(FOLLOW_rule__TIME__Group__0_in_ruleTIME2448);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1215:1: entryRuleFREQ : ruleFREQ EOF ;
    public final void entryRuleFREQ() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1216:1: ( ruleFREQ EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1217:1: ruleFREQ EOF
            {
             before(grammarAccess.getFREQRule()); 
            pushFollow(FOLLOW_ruleFREQ_in_entryRuleFREQ2475);
            ruleFREQ();

            state._fsp--;

             after(grammarAccess.getFREQRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFREQ2482); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1224:1: ruleFREQ : ( ( rule__FREQ__Group__0 ) ) ;
    public final void ruleFREQ() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1228:2: ( ( ( rule__FREQ__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1229:1: ( ( rule__FREQ__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1229:1: ( ( rule__FREQ__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1230:1: ( rule__FREQ__Group__0 )
            {
             before(grammarAccess.getFREQAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1231:1: ( rule__FREQ__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1231:2: rule__FREQ__Group__0
            {
            pushFollow(FOLLOW_rule__FREQ__Group__0_in_ruleFREQ2508);
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


    // $ANTLR start "entryRuleIMPORTANT_SYM"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1243:1: entryRuleIMPORTANT_SYM : ruleIMPORTANT_SYM EOF ;
    public final void entryRuleIMPORTANT_SYM() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1244:1: ( ruleIMPORTANT_SYM EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1245:1: ruleIMPORTANT_SYM EOF
            {
             before(grammarAccess.getIMPORTANT_SYMRule()); 
            pushFollow(FOLLOW_ruleIMPORTANT_SYM_in_entryRuleIMPORTANT_SYM2535);
            ruleIMPORTANT_SYM();

            state._fsp--;

             after(grammarAccess.getIMPORTANT_SYMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIMPORTANT_SYM2542); 

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
    // $ANTLR end "entryRuleIMPORTANT_SYM"


    // $ANTLR start "ruleIMPORTANT_SYM"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1252:1: ruleIMPORTANT_SYM : ( '!important' ) ;
    public final void ruleIMPORTANT_SYM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1256:2: ( ( '!important' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1257:1: ( '!important' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1257:1: ( '!important' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1258:1: '!important'
            {
             before(grammarAccess.getIMPORTANT_SYMAccess().getImportantKeyword()); 
            match(input,14,FOLLOW_14_in_ruleIMPORTANT_SYM2569); 
             after(grammarAccess.getIMPORTANT_SYMAccess().getImportantKeyword()); 

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
    // $ANTLR end "ruleIMPORTANT_SYM"


    // $ANTLR start "entryRuleReservedWords"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1273:1: entryRuleReservedWords : ruleReservedWords EOF ;
    public final void entryRuleReservedWords() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1274:1: ( ruleReservedWords EOF )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1275:1: ruleReservedWords EOF
            {
             before(grammarAccess.getReservedWordsRule()); 
            pushFollow(FOLLOW_ruleReservedWords_in_entryRuleReservedWords2597);
            ruleReservedWords();

            state._fsp--;

             after(grammarAccess.getReservedWordsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReservedWords2604); 

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
    // $ANTLR end "entryRuleReservedWords"


    // $ANTLR start "ruleReservedWords"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1282:1: ruleReservedWords : ( ( rule__ReservedWords__Alternatives ) ) ;
    public final void ruleReservedWords() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1286:2: ( ( ( rule__ReservedWords__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1287:1: ( ( rule__ReservedWords__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1287:1: ( ( rule__ReservedWords__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1288:1: ( rule__ReservedWords__Alternatives )
            {
             before(grammarAccess.getReservedWordsAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1289:1: ( rule__ReservedWords__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1289:2: rule__ReservedWords__Alternatives
            {
            pushFollow(FOLLOW_rule__ReservedWords__Alternatives_in_ruleReservedWords2630);
            rule__ReservedWords__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReservedWordsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleReservedWords"


    // $ANTLR start "rule__Stylesheet__Alternatives_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1301:1: rule__Stylesheet__Alternatives_2 : ( ( ( rule__Stylesheet__RulesetAssignment_2_0 ) ) | ( ( rule__Stylesheet__MediaAssignment_2_1 ) ) | ( ( rule__Stylesheet__PageAssignment_2_2 ) ) );
    public final void rule__Stylesheet__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1305:1: ( ( ( rule__Stylesheet__RulesetAssignment_2_0 ) ) | ( ( rule__Stylesheet__MediaAssignment_2_1 ) ) | ( ( rule__Stylesheet__PageAssignment_2_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
            case RULE_HASH:
            case 23:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 47:
            case 48:
            case 49:
                {
                alt2=1;
                }
                break;
            case 21:
            case 22:
                {
                alt2=2;
                }
                break;
            case 19:
            case 20:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1306:1: ( ( rule__Stylesheet__RulesetAssignment_2_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1306:1: ( ( rule__Stylesheet__RulesetAssignment_2_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1307:1: ( rule__Stylesheet__RulesetAssignment_2_0 )
                    {
                     before(grammarAccess.getStylesheetAccess().getRulesetAssignment_2_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1308:1: ( rule__Stylesheet__RulesetAssignment_2_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1308:2: rule__Stylesheet__RulesetAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__RulesetAssignment_2_0_in_rule__Stylesheet__Alternatives_22666);
                    rule__Stylesheet__RulesetAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStylesheetAccess().getRulesetAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1312:6: ( ( rule__Stylesheet__MediaAssignment_2_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1312:6: ( ( rule__Stylesheet__MediaAssignment_2_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1313:1: ( rule__Stylesheet__MediaAssignment_2_1 )
                    {
                     before(grammarAccess.getStylesheetAccess().getMediaAssignment_2_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1314:1: ( rule__Stylesheet__MediaAssignment_2_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1314:2: rule__Stylesheet__MediaAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__MediaAssignment_2_1_in_rule__Stylesheet__Alternatives_22684);
                    rule__Stylesheet__MediaAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStylesheetAccess().getMediaAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1318:6: ( ( rule__Stylesheet__PageAssignment_2_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1318:6: ( ( rule__Stylesheet__PageAssignment_2_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1319:1: ( rule__Stylesheet__PageAssignment_2_2 )
                    {
                     before(grammarAccess.getStylesheetAccess().getPageAssignment_2_2()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1320:1: ( rule__Stylesheet__PageAssignment_2_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1320:2: rule__Stylesheet__PageAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__PageAssignment_2_2_in_rule__Stylesheet__Alternatives_22702);
                    rule__Stylesheet__PageAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getStylesheetAccess().getPageAssignment_2_2()); 

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
    // $ANTLR end "rule__Stylesheet__Alternatives_2"


    // $ANTLR start "rule__Charset__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1329:1: rule__Charset__Alternatives_0 : ( ( '@charset' ) | ( '@CHARSET' ) );
    public final void rule__Charset__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1333:1: ( ( '@charset' ) | ( '@CHARSET' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1334:1: ( '@charset' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1334:1: ( '@charset' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1335:1: '@charset'
                    {
                     before(grammarAccess.getCharsetAccess().getCharsetKeyword_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__Charset__Alternatives_02736); 
                     after(grammarAccess.getCharsetAccess().getCharsetKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1342:6: ( '@CHARSET' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1342:6: ( '@CHARSET' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1343:1: '@CHARSET'
                    {
                     before(grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1()); 
                    match(input,16,FOLLOW_16_in_rule__Charset__Alternatives_02756); 
                     after(grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1()); 

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
    // $ANTLR end "rule__Charset__Alternatives_0"


    // $ANTLR start "rule__ImportExpression__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1355:1: rule__ImportExpression__Alternatives : ( ( ( rule__ImportExpression__Group_0__0 ) ) | ( ( rule__ImportExpression__Group_1__0 ) ) );
    public final void rule__ImportExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1359:1: ( ( ( rule__ImportExpression__Group_0__0 ) ) | ( ( rule__ImportExpression__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=17 && LA4_0<=18)) ) {
                alt4=1;
            }
            else if ( (LA4_0==53) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1360:1: ( ( rule__ImportExpression__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1360:1: ( ( rule__ImportExpression__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1361:1: ( rule__ImportExpression__Group_0__0 )
                    {
                     before(grammarAccess.getImportExpressionAccess().getGroup_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1362:1: ( rule__ImportExpression__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1362:2: rule__ImportExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ImportExpression__Group_0__0_in_rule__ImportExpression__Alternatives2790);
                    rule__ImportExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1366:6: ( ( rule__ImportExpression__Group_1__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1366:6: ( ( rule__ImportExpression__Group_1__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1367:1: ( rule__ImportExpression__Group_1__0 )
                    {
                     before(grammarAccess.getImportExpressionAccess().getGroup_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1368:1: ( rule__ImportExpression__Group_1__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1368:2: rule__ImportExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ImportExpression__Group_1__0_in_rule__ImportExpression__Alternatives2808);
                    rule__ImportExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ImportExpression__Alternatives"


    // $ANTLR start "rule__ImportExpression__Alternatives_0_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1377:1: rule__ImportExpression__Alternatives_0_0 : ( ( '@import' ) | ( '@IMPORT' ) );
    public final void rule__ImportExpression__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1381:1: ( ( '@import' ) | ( '@IMPORT' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1382:1: ( '@import' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1382:1: ( '@import' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1383:1: '@import'
                    {
                     before(grammarAccess.getImportExpressionAccess().getImportKeyword_0_0_0()); 
                    match(input,17,FOLLOW_17_in_rule__ImportExpression__Alternatives_0_02842); 
                     after(grammarAccess.getImportExpressionAccess().getImportKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1390:6: ( '@IMPORT' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1390:6: ( '@IMPORT' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1391:1: '@IMPORT'
                    {
                     before(grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_0_1()); 
                    match(input,18,FOLLOW_18_in_rule__ImportExpression__Alternatives_0_02862); 
                     after(grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_0_1()); 

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
    // $ANTLR end "rule__ImportExpression__Alternatives_0_0"


    // $ANTLR start "rule__Page__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1403:1: rule__Page__Alternatives_1 : ( ( '@page' ) | ( '@PAGE' ) );
    public final void rule__Page__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1407:1: ( ( '@page' ) | ( '@PAGE' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1408:1: ( '@page' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1408:1: ( '@page' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1409:1: '@page'
                    {
                     before(grammarAccess.getPageAccess().getPageKeyword_1_0()); 
                    match(input,19,FOLLOW_19_in_rule__Page__Alternatives_12897); 
                     after(grammarAccess.getPageAccess().getPageKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1416:6: ( '@PAGE' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1416:6: ( '@PAGE' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1417:1: '@PAGE'
                    {
                     before(grammarAccess.getPageAccess().getPAGEKeyword_1_1()); 
                    match(input,20,FOLLOW_20_in_rule__Page__Alternatives_12917); 
                     after(grammarAccess.getPageAccess().getPAGEKeyword_1_1()); 

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
    // $ANTLR end "rule__Page__Alternatives_1"


    // $ANTLR start "rule__Media__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1429:1: rule__Media__Alternatives_0 : ( ( '@media' ) | ( '@MEDIA' ) );
    public final void rule__Media__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1433:1: ( ( '@media' ) | ( '@MEDIA' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1434:1: ( '@media' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1434:1: ( '@media' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1435:1: '@media'
                    {
                     before(grammarAccess.getMediaAccess().getMediaKeyword_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__Media__Alternatives_02952); 
                     after(grammarAccess.getMediaAccess().getMediaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1442:6: ( '@MEDIA' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1442:6: ( '@MEDIA' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1443:1: '@MEDIA'
                    {
                     before(grammarAccess.getMediaAccess().getMEDIAKeyword_0_1()); 
                    match(input,22,FOLLOW_22_in_rule__Media__Alternatives_02972); 
                     after(grammarAccess.getMediaAccess().getMEDIAKeyword_0_1()); 

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
    // $ANTLR end "rule__Media__Alternatives_0"


    // $ANTLR start "rule__Selector__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1455:1: rule__Selector__Alternatives_1 : ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) );
    public final void rule__Selector__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1459:1: ( ( ( rule__Selector__Group_1_0__0 ) ) | ( ( rule__Selector__Group_1_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=25 && LA8_0<=26)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_WS) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1460:1: ( ( rule__Selector__Group_1_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1460:1: ( ( rule__Selector__Group_1_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1461:1: ( rule__Selector__Group_1_0__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1462:1: ( rule__Selector__Group_1_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1462:2: rule__Selector__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_0__0_in_rule__Selector__Alternatives_13006);
                    rule__Selector__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectorAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1466:6: ( ( rule__Selector__Group_1_1__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1466:6: ( ( rule__Selector__Group_1_1__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1467:1: ( rule__Selector__Group_1_1__0 )
                    {
                     before(grammarAccess.getSelectorAccess().getGroup_1_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1468:1: ( rule__Selector__Group_1_1__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1468:2: rule__Selector__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_1__0_in_rule__Selector__Alternatives_13024);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1477:1: rule__Simple_selector__Alternatives : ( ( ( rule__Simple_selector__Group_0__0 ) ) | ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) ) );
    public final void rule__Simple_selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1481:1: ( ( ( rule__Simple_selector__Group_0__0 ) ) | ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_IDENT||LA10_0==23||(LA10_0>=29 && LA10_0<=43)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_HASH||(LA10_0>=47 && LA10_0<=49)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1482:1: ( ( rule__Simple_selector__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1482:1: ( ( rule__Simple_selector__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1483:1: ( rule__Simple_selector__Group_0__0 )
                    {
                     before(grammarAccess.getSimple_selectorAccess().getGroup_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1484:1: ( rule__Simple_selector__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1484:2: rule__Simple_selector__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__Group_0__0_in_rule__Simple_selector__Alternatives3057);
                    rule__Simple_selector__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_selectorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1488:6: ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1488:6: ( ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1489:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) ) ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1489:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1490:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )
                    {
                     before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1491:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1491:2: rule__Simple_selector__SubSelectorsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives3077);
                    rule__Simple_selector__SubSelectorsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 

                    }

                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1494:1: ( ( rule__Simple_selector__SubSelectorsAssignment_1 )* )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1495:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )*
                    {
                     before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1496:1: ( rule__Simple_selector__SubSelectorsAssignment_1 )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_HASH||(LA9_0>=47 && LA9_0<=49)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1496:2: rule__Simple_selector__SubSelectorsAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives3089);
                    	    rule__Simple_selector__SubSelectorsAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1506:1: rule__Element_name__Alternatives : ( ( RULE_IDENT ) | ( ruleReservedWords ) | ( '*' ) );
    public final void rule__Element_name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1510:1: ( ( RULE_IDENT ) | ( ruleReservedWords ) | ( '*' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt11=1;
                }
                break;
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1511:1: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1511:1: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1512:1: RULE_IDENT
                    {
                     before(grammarAccess.getElement_nameAccess().getIDENTTerminalRuleCall_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Element_name__Alternatives3125); 
                     after(grammarAccess.getElement_nameAccess().getIDENTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1517:6: ( ruleReservedWords )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1517:6: ( ruleReservedWords )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1518:1: ruleReservedWords
                    {
                     before(grammarAccess.getElement_nameAccess().getReservedWordsParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReservedWords_in_rule__Element_name__Alternatives3142);
                    ruleReservedWords();

                    state._fsp--;

                     after(grammarAccess.getElement_nameAccess().getReservedWordsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1523:6: ( '*' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1523:6: ( '*' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1524:1: '*'
                    {
                     before(grammarAccess.getElement_nameAccess().getAsteriskKeyword_2()); 
                    match(input,23,FOLLOW_23_in_rule__Element_name__Alternatives3160); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1536:1: rule__Sub_selector__Alternatives : ( ( ( rule__Sub_selector__IdAssignment_0 ) ) | ( ( rule__Sub_selector__ClassAssignment_1 ) ) | ( ( rule__Sub_selector__AttribAssignment_2 ) ) | ( ( rule__Sub_selector__PseudoclassAssignment_3 ) ) );
    public final void rule__Sub_selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1540:1: ( ( ( rule__Sub_selector__IdAssignment_0 ) ) | ( ( rule__Sub_selector__ClassAssignment_1 ) ) | ( ( rule__Sub_selector__AttribAssignment_2 ) ) | ( ( rule__Sub_selector__PseudoclassAssignment_3 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_HASH:
                {
                alt12=1;
                }
                break;
            case 48:
                {
                alt12=2;
                }
                break;
            case 49:
                {
                alt12=3;
                }
                break;
            case 47:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1541:1: ( ( rule__Sub_selector__IdAssignment_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1541:1: ( ( rule__Sub_selector__IdAssignment_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1542:1: ( rule__Sub_selector__IdAssignment_0 )
                    {
                     before(grammarAccess.getSub_selectorAccess().getIdAssignment_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1543:1: ( rule__Sub_selector__IdAssignment_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1543:2: rule__Sub_selector__IdAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Sub_selector__IdAssignment_0_in_rule__Sub_selector__Alternatives3194);
                    rule__Sub_selector__IdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSub_selectorAccess().getIdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1547:6: ( ( rule__Sub_selector__ClassAssignment_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1547:6: ( ( rule__Sub_selector__ClassAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1548:1: ( rule__Sub_selector__ClassAssignment_1 )
                    {
                     before(grammarAccess.getSub_selectorAccess().getClassAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1549:1: ( rule__Sub_selector__ClassAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1549:2: rule__Sub_selector__ClassAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Sub_selector__ClassAssignment_1_in_rule__Sub_selector__Alternatives3212);
                    rule__Sub_selector__ClassAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSub_selectorAccess().getClassAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1553:6: ( ( rule__Sub_selector__AttribAssignment_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1553:6: ( ( rule__Sub_selector__AttribAssignment_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1554:1: ( rule__Sub_selector__AttribAssignment_2 )
                    {
                     before(grammarAccess.getSub_selectorAccess().getAttribAssignment_2()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1555:1: ( rule__Sub_selector__AttribAssignment_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1555:2: rule__Sub_selector__AttribAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Sub_selector__AttribAssignment_2_in_rule__Sub_selector__Alternatives3230);
                    rule__Sub_selector__AttribAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSub_selectorAccess().getAttribAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1559:6: ( ( rule__Sub_selector__PseudoclassAssignment_3 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1559:6: ( ( rule__Sub_selector__PseudoclassAssignment_3 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1560:1: ( rule__Sub_selector__PseudoclassAssignment_3 )
                    {
                     before(grammarAccess.getSub_selectorAccess().getPseudoclassAssignment_3()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1561:1: ( rule__Sub_selector__PseudoclassAssignment_3 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1561:2: rule__Sub_selector__PseudoclassAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Sub_selector__PseudoclassAssignment_3_in_rule__Sub_selector__Alternatives3248);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1570:1: rule__Css_class__Alternatives_1 : ( ( RULE_IDENT ) | ( ruleReservedWords ) );
    public final void rule__Css_class__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1574:1: ( ( RULE_IDENT ) | ( ruleReservedWords ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_IDENT) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=29 && LA13_0<=43)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1575:1: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1575:1: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1576:1: RULE_IDENT
                    {
                     before(grammarAccess.getCss_classAccess().getIDENTTerminalRuleCall_1_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_class__Alternatives_13281); 
                     after(grammarAccess.getCss_classAccess().getIDENTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1581:6: ( ruleReservedWords )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1581:6: ( ruleReservedWords )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1582:1: ruleReservedWords
                    {
                     before(grammarAccess.getCss_classAccess().getReservedWordsParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleReservedWords_in_rule__Css_class__Alternatives_13298);
                    ruleReservedWords();

                    state._fsp--;

                     after(grammarAccess.getCss_classAccess().getReservedWordsParserRuleCall_1_1()); 

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


    // $ANTLR start "rule__Css_attrib__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1592:1: rule__Css_attrib__Alternatives_1 : ( ( RULE_IDENT ) | ( ruleReservedWords ) );
    public final void rule__Css_attrib__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1596:1: ( ( RULE_IDENT ) | ( ruleReservedWords ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_IDENT) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=29 && LA14_0<=43)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1597:1: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1597:1: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1598:1: RULE_IDENT
                    {
                     before(grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_1_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_attrib__Alternatives_13330); 
                     after(grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1603:6: ( ruleReservedWords )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1603:6: ( ruleReservedWords )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1604:1: ruleReservedWords
                    {
                     before(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleReservedWords_in_rule__Css_attrib__Alternatives_13347);
                    ruleReservedWords();

                    state._fsp--;

                     after(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_1_1()); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1614:1: rule__Css_attrib__Alternatives_2_0 : ( ( '=' ) | ( RULE_INCLUDES ) | ( RULE_DASHMATCH ) );
    public final void rule__Css_attrib__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1618:1: ( ( '=' ) | ( RULE_INCLUDES ) | ( RULE_DASHMATCH ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt15=1;
                }
                break;
            case RULE_INCLUDES:
                {
                alt15=2;
                }
                break;
            case RULE_DASHMATCH:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1619:1: ( '=' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1619:1: ( '=' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1620:1: '='
                    {
                     before(grammarAccess.getCss_attribAccess().getEqualsSignKeyword_2_0_0()); 
                    match(input,24,FOLLOW_24_in_rule__Css_attrib__Alternatives_2_03380); 
                     after(grammarAccess.getCss_attribAccess().getEqualsSignKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1627:6: ( RULE_INCLUDES )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1627:6: ( RULE_INCLUDES )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1628:1: RULE_INCLUDES
                    {
                     before(grammarAccess.getCss_attribAccess().getINCLUDESTerminalRuleCall_2_0_1()); 
                    match(input,RULE_INCLUDES,FOLLOW_RULE_INCLUDES_in_rule__Css_attrib__Alternatives_2_03399); 
                     after(grammarAccess.getCss_attribAccess().getINCLUDESTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1633:6: ( RULE_DASHMATCH )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1633:6: ( RULE_DASHMATCH )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1634:1: RULE_DASHMATCH
                    {
                     before(grammarAccess.getCss_attribAccess().getDASHMATCHTerminalRuleCall_2_0_2()); 
                    match(input,RULE_DASHMATCH,FOLLOW_RULE_DASHMATCH_in_rule__Css_attrib__Alternatives_2_03416); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1644:1: rule__Css_attrib__Alternatives_2_1 : ( ( ( rule__Css_attrib__Alternatives_2_1_0 ) ) | ( RULE_STRING ) );
    public final void rule__Css_attrib__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1648:1: ( ( ( rule__Css_attrib__Alternatives_2_1_0 ) ) | ( RULE_STRING ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_IDENT||(LA16_0>=29 && LA16_0<=43)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_STRING) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1649:1: ( ( rule__Css_attrib__Alternatives_2_1_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1649:1: ( ( rule__Css_attrib__Alternatives_2_1_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1650:1: ( rule__Css_attrib__Alternatives_2_1_0 )
                    {
                     before(grammarAccess.getCss_attribAccess().getAlternatives_2_1_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1651:1: ( rule__Css_attrib__Alternatives_2_1_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1651:2: rule__Css_attrib__Alternatives_2_1_0
                    {
                    pushFollow(FOLLOW_rule__Css_attrib__Alternatives_2_1_0_in_rule__Css_attrib__Alternatives_2_13448);
                    rule__Css_attrib__Alternatives_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCss_attribAccess().getAlternatives_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1655:6: ( RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1655:6: ( RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1656:1: RULE_STRING
                    {
                     before(grammarAccess.getCss_attribAccess().getSTRINGTerminalRuleCall_2_1_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Css_attrib__Alternatives_2_13466); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1666:1: rule__Css_attrib__Alternatives_2_1_0 : ( ( RULE_IDENT ) | ( ruleReservedWords ) );
    public final void rule__Css_attrib__Alternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1670:1: ( ( RULE_IDENT ) | ( ruleReservedWords ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_IDENT) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=29 && LA17_0<=43)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1671:1: ( RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1671:1: ( RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1672:1: RULE_IDENT
                    {
                     before(grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_2_1_0_0()); 
                    match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_attrib__Alternatives_2_1_03498); 
                     after(grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1677:6: ( ruleReservedWords )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1677:6: ( ruleReservedWords )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1678:1: ruleReservedWords
                    {
                     before(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_2_1_0_1()); 
                    pushFollow(FOLLOW_ruleReservedWords_in_rule__Css_attrib__Alternatives_2_1_03515);
                    ruleReservedWords();

                    state._fsp--;

                     after(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_2_1_0_1()); 

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


    // $ANTLR start "rule__Combinator__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1688:1: rule__Combinator__Alternatives_0 : ( ( '+' ) | ( '>' ) );
    public final void rule__Combinator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1692:1: ( ( '+' ) | ( '>' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            else if ( (LA18_0==26) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1693:1: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1693:1: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1694:1: '+'
                    {
                     before(grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 
                    match(input,25,FOLLOW_25_in_rule__Combinator__Alternatives_03548); 
                     after(grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1701:6: ( '>' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1701:6: ( '>' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1702:1: '>'
                    {
                     before(grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_0_1()); 
                    match(input,26,FOLLOW_26_in_rule__Combinator__Alternatives_03568); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1714:1: rule__Operator__Alternatives : ( ( '/' ) | ( RULE_COMMA ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1718:1: ( ( '/' ) | ( RULE_COMMA ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_COMMA) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1719:1: ( '/' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1719:1: ( '/' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1720:1: '/'
                    {
                     before(grammarAccess.getOperatorAccess().getSolidusKeyword_0()); 
                    match(input,27,FOLLOW_27_in_rule__Operator__Alternatives3603); 
                     after(grammarAccess.getOperatorAccess().getSolidusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1727:6: ( RULE_COMMA )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1727:6: ( RULE_COMMA )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1728:1: RULE_COMMA
                    {
                     before(grammarAccess.getOperatorAccess().getCOMMATerminalRuleCall_1()); 
                    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Operator__Alternatives3622); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1738:1: rule__Unary_operator__Alternatives : ( ( '-' ) | ( '+' ) );
    public final void rule__Unary_operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1742:1: ( ( '-' ) | ( '+' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            else if ( (LA20_0==25) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1743:1: ( '-' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1743:1: ( '-' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1744:1: '-'
                    {
                     before(grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                    match(input,28,FOLLOW_28_in_rule__Unary_operator__Alternatives3655); 
                     after(grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1751:6: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1751:6: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1752:1: '+'
                    {
                     before(grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 
                    match(input,25,FOLLOW_25_in_rule__Unary_operator__Alternatives3675); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1764:1: rule__Term__Alternatives : ( ( ( rule__Term__NumberAssignment_0 ) ) | ( ( rule__Term__StringValueAssignment_1 ) ) | ( ( rule__Term__IdentifierAssignment_2 ) ) | ( ( rule__Term__UrlAssignment_3 ) ) | ( ( rule__Term__FunctionAssignment_4 ) ) | ( ( rule__Term__HexColorAssignment_5 ) ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1768:1: ( ( ( rule__Term__NumberAssignment_0 ) ) | ( ( rule__Term__StringValueAssignment_1 ) ) | ( ( rule__Term__IdentifierAssignment_2 ) ) | ( ( rule__Term__UrlAssignment_3 ) ) | ( ( rule__Term__FunctionAssignment_4 ) ) | ( ( rule__Term__HexColorAssignment_5 ) ) )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                int LA21_1 = input.LA(2);

                if ( ((LA21_1>=RULE_INTEGER && LA21_1<=RULE_REAL)) ) {
                    alt21=1;
                }
                else if ( (LA21_1==RULE_IDENT) ) {
                    int LA21_4 = input.LA(3);

                    if ( (LA21_4==51) ) {
                        alt21=5;
                    }
                    else if ( (LA21_4==EOF||(LA21_4>=RULE_IDENT && LA21_4<=RULE_HASH)||(LA21_4>=RULE_STRING && LA21_4<=RULE_WS)||LA21_4==14||LA21_4==25||(LA21_4>=27 && LA21_4<=28)||LA21_4==44||LA21_4==46||(LA21_4>=52 && LA21_4<=53)) ) {
                        alt21=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
            case RULE_REAL:
            case 25:
                {
                alt21=1;
                }
                break;
            case RULE_STRING:
                {
                alt21=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA21_4 = input.LA(2);

                if ( (LA21_4==51) ) {
                    alt21=5;
                }
                else if ( (LA21_4==EOF||(LA21_4>=RULE_IDENT && LA21_4<=RULE_HASH)||(LA21_4>=RULE_STRING && LA21_4<=RULE_WS)||LA21_4==14||LA21_4==25||(LA21_4>=27 && LA21_4<=28)||LA21_4==44||LA21_4==46||(LA21_4>=52 && LA21_4<=53)) ) {
                    alt21=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 4, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                alt21=4;
                }
                break;
            case RULE_HASH:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1769:1: ( ( rule__Term__NumberAssignment_0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1769:1: ( ( rule__Term__NumberAssignment_0 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1770:1: ( rule__Term__NumberAssignment_0 )
                    {
                     before(grammarAccess.getTermAccess().getNumberAssignment_0()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1771:1: ( rule__Term__NumberAssignment_0 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1771:2: rule__Term__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Term__NumberAssignment_0_in_rule__Term__Alternatives3709);
                    rule__Term__NumberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getNumberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1775:6: ( ( rule__Term__StringValueAssignment_1 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1775:6: ( ( rule__Term__StringValueAssignment_1 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1776:1: ( rule__Term__StringValueAssignment_1 )
                    {
                     before(grammarAccess.getTermAccess().getStringValueAssignment_1()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1777:1: ( rule__Term__StringValueAssignment_1 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1777:2: rule__Term__StringValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Term__StringValueAssignment_1_in_rule__Term__Alternatives3727);
                    rule__Term__StringValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getStringValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1781:6: ( ( rule__Term__IdentifierAssignment_2 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1781:6: ( ( rule__Term__IdentifierAssignment_2 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1782:1: ( rule__Term__IdentifierAssignment_2 )
                    {
                     before(grammarAccess.getTermAccess().getIdentifierAssignment_2()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1783:1: ( rule__Term__IdentifierAssignment_2 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1783:2: rule__Term__IdentifierAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Term__IdentifierAssignment_2_in_rule__Term__Alternatives3745);
                    rule__Term__IdentifierAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getIdentifierAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1787:6: ( ( rule__Term__UrlAssignment_3 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1787:6: ( ( rule__Term__UrlAssignment_3 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1788:1: ( rule__Term__UrlAssignment_3 )
                    {
                     before(grammarAccess.getTermAccess().getUrlAssignment_3()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1789:1: ( rule__Term__UrlAssignment_3 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1789:2: rule__Term__UrlAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Term__UrlAssignment_3_in_rule__Term__Alternatives3763);
                    rule__Term__UrlAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getUrlAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1793:6: ( ( rule__Term__FunctionAssignment_4 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1793:6: ( ( rule__Term__FunctionAssignment_4 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1794:1: ( rule__Term__FunctionAssignment_4 )
                    {
                     before(grammarAccess.getTermAccess().getFunctionAssignment_4()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1795:1: ( rule__Term__FunctionAssignment_4 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1795:2: rule__Term__FunctionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Term__FunctionAssignment_4_in_rule__Term__Alternatives3781);
                    rule__Term__FunctionAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getFunctionAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1799:6: ( ( rule__Term__HexColorAssignment_5 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1799:6: ( ( rule__Term__HexColorAssignment_5 ) )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1800:1: ( rule__Term__HexColorAssignment_5 )
                    {
                     before(grammarAccess.getTermAccess().getHexColorAssignment_5()); 
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1801:1: ( rule__Term__HexColorAssignment_5 )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1801:2: rule__Term__HexColorAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Term__HexColorAssignment_5_in_rule__Term__Alternatives3799);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1810:1: rule__NumberTerm__Alternatives_1 : ( ( ruleNUMBER ) | ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) );
    public final void rule__NumberTerm__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1814:1: ( ( ruleNUMBER ) | ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) )
            int alt22=8;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1815:1: ( ruleNUMBER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1815:1: ( ruleNUMBER )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1816:1: ruleNUMBER
                    {
                     before(grammarAccess.getNumberTermAccess().getNUMBERParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleNUMBER_in_rule__NumberTerm__Alternatives_13832);
                    ruleNUMBER();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getNUMBERParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1821:6: ( rulePERCENTAGE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1821:6: ( rulePERCENTAGE )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1822:1: rulePERCENTAGE
                    {
                     before(grammarAccess.getNumberTermAccess().getPERCENTAGEParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_rulePERCENTAGE_in_rule__NumberTerm__Alternatives_13849);
                    rulePERCENTAGE();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getPERCENTAGEParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1827:6: ( ruleLENGTH )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1827:6: ( ruleLENGTH )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1828:1: ruleLENGTH
                    {
                     before(grammarAccess.getNumberTermAccess().getLENGTHParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_ruleLENGTH_in_rule__NumberTerm__Alternatives_13866);
                    ruleLENGTH();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getLENGTHParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1833:6: ( ruleEMS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1833:6: ( ruleEMS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1834:1: ruleEMS
                    {
                     before(grammarAccess.getNumberTermAccess().getEMSParserRuleCall_1_3()); 
                    pushFollow(FOLLOW_ruleEMS_in_rule__NumberTerm__Alternatives_13883);
                    ruleEMS();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getEMSParserRuleCall_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1839:6: ( ruleEXS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1839:6: ( ruleEXS )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1840:1: ruleEXS
                    {
                     before(grammarAccess.getNumberTermAccess().getEXSParserRuleCall_1_4()); 
                    pushFollow(FOLLOW_ruleEXS_in_rule__NumberTerm__Alternatives_13900);
                    ruleEXS();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getEXSParserRuleCall_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1845:6: ( ruleANGLE )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1845:6: ( ruleANGLE )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1846:1: ruleANGLE
                    {
                     before(grammarAccess.getNumberTermAccess().getANGLEParserRuleCall_1_5()); 
                    pushFollow(FOLLOW_ruleANGLE_in_rule__NumberTerm__Alternatives_13917);
                    ruleANGLE();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getANGLEParserRuleCall_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1851:6: ( ruleTIME )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1851:6: ( ruleTIME )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1852:1: ruleTIME
                    {
                     before(grammarAccess.getNumberTermAccess().getTIMEParserRuleCall_1_6()); 
                    pushFollow(FOLLOW_ruleTIME_in_rule__NumberTerm__Alternatives_13934);
                    ruleTIME();

                    state._fsp--;

                     after(grammarAccess.getNumberTermAccess().getTIMEParserRuleCall_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1857:6: ( ruleFREQ )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1857:6: ( ruleFREQ )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1858:1: ruleFREQ
                    {
                     before(grammarAccess.getNumberTermAccess().getFREQParserRuleCall_1_7()); 
                    pushFollow(FOLLOW_ruleFREQ_in_rule__NumberTerm__Alternatives_13951);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1868:1: rule__Num__Alternatives : ( ( RULE_INTEGER ) | ( RULE_REAL ) );
    public final void rule__Num__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1872:1: ( ( RULE_INTEGER ) | ( RULE_REAL ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INTEGER) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_REAL) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1873:1: ( RULE_INTEGER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1873:1: ( RULE_INTEGER )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1874:1: RULE_INTEGER
                    {
                     before(grammarAccess.getNumAccess().getIntegerTerminalRuleCall_0()); 
                    match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__Num__Alternatives3983); 
                     after(grammarAccess.getNumAccess().getIntegerTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1879:6: ( RULE_REAL )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1879:6: ( RULE_REAL )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1880:1: RULE_REAL
                    {
                     before(grammarAccess.getNumAccess().getRealTerminalRuleCall_1()); 
                    match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Num__Alternatives4000); 
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


    // $ANTLR start "rule__LENGTH__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1890:1: rule__LENGTH__Alternatives_1 : ( ( 'px' ) | ( 'cm' ) | ( 'mm' ) | ( 'in' ) | ( 'pt' ) | ( 'pc' ) );
    public final void rule__LENGTH__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1894:1: ( ( 'px' ) | ( 'cm' ) | ( 'mm' ) | ( 'in' ) | ( 'pt' ) | ( 'pc' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt24=1;
                }
                break;
            case 30:
                {
                alt24=2;
                }
                break;
            case 31:
                {
                alt24=3;
                }
                break;
            case 32:
                {
                alt24=4;
                }
                break;
            case 33:
                {
                alt24=5;
                }
                break;
            case 34:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1895:1: ( 'px' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1895:1: ( 'px' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1896:1: 'px'
                    {
                     before(grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 
                    match(input,29,FOLLOW_29_in_rule__LENGTH__Alternatives_14033); 
                     after(grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1903:6: ( 'cm' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1903:6: ( 'cm' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1904:1: 'cm'
                    {
                     before(grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 
                    match(input,30,FOLLOW_30_in_rule__LENGTH__Alternatives_14053); 
                     after(grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1911:6: ( 'mm' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1911:6: ( 'mm' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1912:1: 'mm'
                    {
                     before(grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 
                    match(input,31,FOLLOW_31_in_rule__LENGTH__Alternatives_14073); 
                     after(grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1919:6: ( 'in' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1919:6: ( 'in' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1920:1: 'in'
                    {
                     before(grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 
                    match(input,32,FOLLOW_32_in_rule__LENGTH__Alternatives_14093); 
                     after(grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1927:6: ( 'pt' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1927:6: ( 'pt' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1928:1: 'pt'
                    {
                     before(grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 
                    match(input,33,FOLLOW_33_in_rule__LENGTH__Alternatives_14113); 
                     after(grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1935:6: ( 'pc' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1935:6: ( 'pc' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1936:1: 'pc'
                    {
                     before(grammarAccess.getLENGTHAccess().getPcKeyword_1_5()); 
                    match(input,34,FOLLOW_34_in_rule__LENGTH__Alternatives_14133); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1948:1: rule__ANGLE__Alternatives_1 : ( ( 'deg' ) | ( 'rad' ) | ( 'grad' ) );
    public final void rule__ANGLE__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1952:1: ( ( 'deg' ) | ( 'rad' ) | ( 'grad' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt25=1;
                }
                break;
            case 36:
                {
                alt25=2;
                }
                break;
            case 37:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1953:1: ( 'deg' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1953:1: ( 'deg' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1954:1: 'deg'
                    {
                     before(grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 
                    match(input,35,FOLLOW_35_in_rule__ANGLE__Alternatives_14168); 
                     after(grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1961:6: ( 'rad' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1961:6: ( 'rad' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1962:1: 'rad'
                    {
                     before(grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 
                    match(input,36,FOLLOW_36_in_rule__ANGLE__Alternatives_14188); 
                     after(grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1969:6: ( 'grad' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1969:6: ( 'grad' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1970:1: 'grad'
                    {
                     before(grammarAccess.getANGLEAccess().getGradKeyword_1_2()); 
                    match(input,37,FOLLOW_37_in_rule__ANGLE__Alternatives_14208); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1982:1: rule__TIME__Alternatives_1 : ( ( 'ms' ) | ( 's' ) );
    public final void rule__TIME__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1986:1: ( ( 'ms' ) | ( 's' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            else if ( (LA26_0==39) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1987:1: ( 'ms' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1987:1: ( 'ms' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1988:1: 'ms'
                    {
                     before(grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 
                    match(input,38,FOLLOW_38_in_rule__TIME__Alternatives_14243); 
                     after(grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1995:6: ( 's' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1995:6: ( 's' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:1996:1: 's'
                    {
                     before(grammarAccess.getTIMEAccess().getSKeyword_1_1()); 
                    match(input,39,FOLLOW_39_in_rule__TIME__Alternatives_14263); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2008:1: rule__FREQ__Alternatives_1 : ( ( 'hz' ) | ( 'khz' ) );
    public final void rule__FREQ__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2012:1: ( ( 'hz' ) | ( 'khz' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            else if ( (LA27_0==41) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2013:1: ( 'hz' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2013:1: ( 'hz' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2014:1: 'hz'
                    {
                     before(grammarAccess.getFREQAccess().getHzKeyword_1_0()); 
                    match(input,40,FOLLOW_40_in_rule__FREQ__Alternatives_14298); 
                     after(grammarAccess.getFREQAccess().getHzKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2021:6: ( 'khz' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2021:6: ( 'khz' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2022:1: 'khz'
                    {
                     before(grammarAccess.getFREQAccess().getKhzKeyword_1_1()); 
                    match(input,41,FOLLOW_41_in_rule__FREQ__Alternatives_14318); 
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


    // $ANTLR start "rule__ReservedWords__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2034:1: rule__ReservedWords__Alternatives : ( ( 'em' ) | ( 'ex' ) | ( 'px' ) | ( 'cm' ) | ( 'mm' ) | ( 'in' ) | ( 'pt' ) | ( 'pc' ) | ( 'deg' ) | ( 'rad' ) | ( 'grad' ) | ( 'ms' ) | ( 's' ) | ( 'hz' ) | ( 'khz' ) );
    public final void rule__ReservedWords__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2038:1: ( ( 'em' ) | ( 'ex' ) | ( 'px' ) | ( 'cm' ) | ( 'mm' ) | ( 'in' ) | ( 'pt' ) | ( 'pc' ) | ( 'deg' ) | ( 'rad' ) | ( 'grad' ) | ( 'ms' ) | ( 's' ) | ( 'hz' ) | ( 'khz' ) )
            int alt28=15;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt28=1;
                }
                break;
            case 43:
                {
                alt28=2;
                }
                break;
            case 29:
                {
                alt28=3;
                }
                break;
            case 30:
                {
                alt28=4;
                }
                break;
            case 31:
                {
                alt28=5;
                }
                break;
            case 32:
                {
                alt28=6;
                }
                break;
            case 33:
                {
                alt28=7;
                }
                break;
            case 34:
                {
                alt28=8;
                }
                break;
            case 35:
                {
                alt28=9;
                }
                break;
            case 36:
                {
                alt28=10;
                }
                break;
            case 37:
                {
                alt28=11;
                }
                break;
            case 38:
                {
                alt28=12;
                }
                break;
            case 39:
                {
                alt28=13;
                }
                break;
            case 40:
                {
                alt28=14;
                }
                break;
            case 41:
                {
                alt28=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2039:1: ( 'em' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2039:1: ( 'em' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2040:1: 'em'
                    {
                     before(grammarAccess.getReservedWordsAccess().getEmKeyword_0()); 
                    match(input,42,FOLLOW_42_in_rule__ReservedWords__Alternatives4353); 
                     after(grammarAccess.getReservedWordsAccess().getEmKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2047:6: ( 'ex' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2047:6: ( 'ex' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2048:1: 'ex'
                    {
                     before(grammarAccess.getReservedWordsAccess().getExKeyword_1()); 
                    match(input,43,FOLLOW_43_in_rule__ReservedWords__Alternatives4373); 
                     after(grammarAccess.getReservedWordsAccess().getExKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2055:6: ( 'px' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2055:6: ( 'px' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2056:1: 'px'
                    {
                     before(grammarAccess.getReservedWordsAccess().getPxKeyword_2()); 
                    match(input,29,FOLLOW_29_in_rule__ReservedWords__Alternatives4393); 
                     after(grammarAccess.getReservedWordsAccess().getPxKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2063:6: ( 'cm' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2063:6: ( 'cm' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2064:1: 'cm'
                    {
                     before(grammarAccess.getReservedWordsAccess().getCmKeyword_3()); 
                    match(input,30,FOLLOW_30_in_rule__ReservedWords__Alternatives4413); 
                     after(grammarAccess.getReservedWordsAccess().getCmKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2071:6: ( 'mm' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2071:6: ( 'mm' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2072:1: 'mm'
                    {
                     before(grammarAccess.getReservedWordsAccess().getMmKeyword_4()); 
                    match(input,31,FOLLOW_31_in_rule__ReservedWords__Alternatives4433); 
                     after(grammarAccess.getReservedWordsAccess().getMmKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2079:6: ( 'in' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2079:6: ( 'in' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2080:1: 'in'
                    {
                     before(grammarAccess.getReservedWordsAccess().getInKeyword_5()); 
                    match(input,32,FOLLOW_32_in_rule__ReservedWords__Alternatives4453); 
                     after(grammarAccess.getReservedWordsAccess().getInKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2087:6: ( 'pt' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2087:6: ( 'pt' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2088:1: 'pt'
                    {
                     before(grammarAccess.getReservedWordsAccess().getPtKeyword_6()); 
                    match(input,33,FOLLOW_33_in_rule__ReservedWords__Alternatives4473); 
                     after(grammarAccess.getReservedWordsAccess().getPtKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2095:6: ( 'pc' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2095:6: ( 'pc' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2096:1: 'pc'
                    {
                     before(grammarAccess.getReservedWordsAccess().getPcKeyword_7()); 
                    match(input,34,FOLLOW_34_in_rule__ReservedWords__Alternatives4493); 
                     after(grammarAccess.getReservedWordsAccess().getPcKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2103:6: ( 'deg' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2103:6: ( 'deg' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2104:1: 'deg'
                    {
                     before(grammarAccess.getReservedWordsAccess().getDegKeyword_8()); 
                    match(input,35,FOLLOW_35_in_rule__ReservedWords__Alternatives4513); 
                     after(grammarAccess.getReservedWordsAccess().getDegKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2111:6: ( 'rad' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2111:6: ( 'rad' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2112:1: 'rad'
                    {
                     before(grammarAccess.getReservedWordsAccess().getRadKeyword_9()); 
                    match(input,36,FOLLOW_36_in_rule__ReservedWords__Alternatives4533); 
                     after(grammarAccess.getReservedWordsAccess().getRadKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2119:6: ( 'grad' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2119:6: ( 'grad' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2120:1: 'grad'
                    {
                     before(grammarAccess.getReservedWordsAccess().getGradKeyword_10()); 
                    match(input,37,FOLLOW_37_in_rule__ReservedWords__Alternatives4553); 
                     after(grammarAccess.getReservedWordsAccess().getGradKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2127:6: ( 'ms' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2127:6: ( 'ms' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2128:1: 'ms'
                    {
                     before(grammarAccess.getReservedWordsAccess().getMsKeyword_11()); 
                    match(input,38,FOLLOW_38_in_rule__ReservedWords__Alternatives4573); 
                     after(grammarAccess.getReservedWordsAccess().getMsKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2135:6: ( 's' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2135:6: ( 's' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2136:1: 's'
                    {
                     before(grammarAccess.getReservedWordsAccess().getSKeyword_12()); 
                    match(input,39,FOLLOW_39_in_rule__ReservedWords__Alternatives4593); 
                     after(grammarAccess.getReservedWordsAccess().getSKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2143:6: ( 'hz' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2143:6: ( 'hz' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2144:1: 'hz'
                    {
                     before(grammarAccess.getReservedWordsAccess().getHzKeyword_13()); 
                    match(input,40,FOLLOW_40_in_rule__ReservedWords__Alternatives4613); 
                     after(grammarAccess.getReservedWordsAccess().getHzKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2151:6: ( 'khz' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2151:6: ( 'khz' )
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2152:1: 'khz'
                    {
                     before(grammarAccess.getReservedWordsAccess().getKhzKeyword_14()); 
                    match(input,41,FOLLOW_41_in_rule__ReservedWords__Alternatives4633); 
                     after(grammarAccess.getReservedWordsAccess().getKhzKeyword_14()); 

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
    // $ANTLR end "rule__ReservedWords__Alternatives"


    // $ANTLR start "rule__Stylesheet__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2166:1: rule__Stylesheet__Group__0 : rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 ;
    public final void rule__Stylesheet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2170:1: ( rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2171:2: rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__0__Impl_in_rule__Stylesheet__Group__04665);
            rule__Stylesheet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stylesheet__Group__1_in_rule__Stylesheet__Group__04668);
            rule__Stylesheet__Group__1();

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
    // $ANTLR end "rule__Stylesheet__Group__0"


    // $ANTLR start "rule__Stylesheet__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2178:1: rule__Stylesheet__Group__0__Impl : ( ( rule__Stylesheet__CharsetAssignment_0 )? ) ;
    public final void rule__Stylesheet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2182:1: ( ( ( rule__Stylesheet__CharsetAssignment_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2183:1: ( ( rule__Stylesheet__CharsetAssignment_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2183:1: ( ( rule__Stylesheet__CharsetAssignment_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2184:1: ( rule__Stylesheet__CharsetAssignment_0 )?
            {
             before(grammarAccess.getStylesheetAccess().getCharsetAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2185:1: ( rule__Stylesheet__CharsetAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=15 && LA29_0<=16)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2185:2: rule__Stylesheet__CharsetAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Stylesheet__CharsetAssignment_0_in_rule__Stylesheet__Group__0__Impl4695);
                    rule__Stylesheet__CharsetAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStylesheetAccess().getCharsetAssignment_0()); 

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
    // $ANTLR end "rule__Stylesheet__Group__0__Impl"


    // $ANTLR start "rule__Stylesheet__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2195:1: rule__Stylesheet__Group__1 : rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 ;
    public final void rule__Stylesheet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2199:1: ( rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2200:2: rule__Stylesheet__Group__1__Impl rule__Stylesheet__Group__2
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__1__Impl_in_rule__Stylesheet__Group__14726);
            rule__Stylesheet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Stylesheet__Group__2_in_rule__Stylesheet__Group__14729);
            rule__Stylesheet__Group__2();

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
    // $ANTLR end "rule__Stylesheet__Group__1"


    // $ANTLR start "rule__Stylesheet__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2207:1: rule__Stylesheet__Group__1__Impl : ( ( rule__Stylesheet__ImportsAssignment_1 )* ) ;
    public final void rule__Stylesheet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2211:1: ( ( ( rule__Stylesheet__ImportsAssignment_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2212:1: ( ( rule__Stylesheet__ImportsAssignment_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2212:1: ( ( rule__Stylesheet__ImportsAssignment_1 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2213:1: ( rule__Stylesheet__ImportsAssignment_1 )*
            {
             before(grammarAccess.getStylesheetAccess().getImportsAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2214:1: ( rule__Stylesheet__ImportsAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=17 && LA30_0<=18)||LA30_0==53) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2214:2: rule__Stylesheet__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Stylesheet__ImportsAssignment_1_in_rule__Stylesheet__Group__1__Impl4756);
            	    rule__Stylesheet__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getStylesheetAccess().getImportsAssignment_1()); 

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
    // $ANTLR end "rule__Stylesheet__Group__1__Impl"


    // $ANTLR start "rule__Stylesheet__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2224:1: rule__Stylesheet__Group__2 : rule__Stylesheet__Group__2__Impl ;
    public final void rule__Stylesheet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2228:1: ( rule__Stylesheet__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2229:2: rule__Stylesheet__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Stylesheet__Group__2__Impl_in_rule__Stylesheet__Group__24787);
            rule__Stylesheet__Group__2__Impl();

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
    // $ANTLR end "rule__Stylesheet__Group__2"


    // $ANTLR start "rule__Stylesheet__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2235:1: rule__Stylesheet__Group__2__Impl : ( ( rule__Stylesheet__Alternatives_2 )* ) ;
    public final void rule__Stylesheet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2239:1: ( ( ( rule__Stylesheet__Alternatives_2 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2240:1: ( ( rule__Stylesheet__Alternatives_2 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2240:1: ( ( rule__Stylesheet__Alternatives_2 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2241:1: ( rule__Stylesheet__Alternatives_2 )*
            {
             before(grammarAccess.getStylesheetAccess().getAlternatives_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2242:1: ( rule__Stylesheet__Alternatives_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_IDENT && LA31_0<=RULE_HASH)||(LA31_0>=19 && LA31_0<=23)||(LA31_0>=29 && LA31_0<=43)||(LA31_0>=47 && LA31_0<=49)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2242:2: rule__Stylesheet__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Stylesheet__Alternatives_2_in_rule__Stylesheet__Group__2__Impl4814);
            	    rule__Stylesheet__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getStylesheetAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Stylesheet__Group__2__Impl"


    // $ANTLR start "rule__Charset__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2258:1: rule__Charset__Group__0 : rule__Charset__Group__0__Impl rule__Charset__Group__1 ;
    public final void rule__Charset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2262:1: ( rule__Charset__Group__0__Impl rule__Charset__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2263:2: rule__Charset__Group__0__Impl rule__Charset__Group__1
            {
            pushFollow(FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__04851);
            rule__Charset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__04854);
            rule__Charset__Group__1();

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
    // $ANTLR end "rule__Charset__Group__0"


    // $ANTLR start "rule__Charset__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2270:1: rule__Charset__Group__0__Impl : ( ( rule__Charset__Alternatives_0 ) ) ;
    public final void rule__Charset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2274:1: ( ( ( rule__Charset__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2275:1: ( ( rule__Charset__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2275:1: ( ( rule__Charset__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2276:1: ( rule__Charset__Alternatives_0 )
            {
             before(grammarAccess.getCharsetAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2277:1: ( rule__Charset__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2277:2: rule__Charset__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Charset__Alternatives_0_in_rule__Charset__Group__0__Impl4881);
            rule__Charset__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCharsetAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Charset__Group__0__Impl"


    // $ANTLR start "rule__Charset__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2287:1: rule__Charset__Group__1 : rule__Charset__Group__1__Impl rule__Charset__Group__2 ;
    public final void rule__Charset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2291:1: ( rule__Charset__Group__1__Impl rule__Charset__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2292:2: rule__Charset__Group__1__Impl rule__Charset__Group__2
            {
            pushFollow(FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__14911);
            rule__Charset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__14914);
            rule__Charset__Group__2();

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
    // $ANTLR end "rule__Charset__Group__1"


    // $ANTLR start "rule__Charset__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2299:1: rule__Charset__Group__1__Impl : ( ( rule__Charset__CharsetAssignment_1 ) ) ;
    public final void rule__Charset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2303:1: ( ( ( rule__Charset__CharsetAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2304:1: ( ( rule__Charset__CharsetAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2304:1: ( ( rule__Charset__CharsetAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2305:1: ( rule__Charset__CharsetAssignment_1 )
            {
             before(grammarAccess.getCharsetAccess().getCharsetAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2306:1: ( rule__Charset__CharsetAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2306:2: rule__Charset__CharsetAssignment_1
            {
            pushFollow(FOLLOW_rule__Charset__CharsetAssignment_1_in_rule__Charset__Group__1__Impl4941);
            rule__Charset__CharsetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharsetAccess().getCharsetAssignment_1()); 

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
    // $ANTLR end "rule__Charset__Group__1__Impl"


    // $ANTLR start "rule__Charset__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2316:1: rule__Charset__Group__2 : rule__Charset__Group__2__Impl ;
    public final void rule__Charset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2320:1: ( rule__Charset__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2321:2: rule__Charset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__24971);
            rule__Charset__Group__2__Impl();

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
    // $ANTLR end "rule__Charset__Group__2"


    // $ANTLR start "rule__Charset__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2327:1: rule__Charset__Group__2__Impl : ( ';' ) ;
    public final void rule__Charset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2331:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2332:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2332:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2333:1: ';'
            {
             before(grammarAccess.getCharsetAccess().getSemicolonKeyword_2()); 
            match(input,44,FOLLOW_44_in_rule__Charset__Group__2__Impl4999); 
             after(grammarAccess.getCharsetAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Charset__Group__2__Impl"


    // $ANTLR start "rule__ImportExpression__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2352:1: rule__ImportExpression__Group_0__0 : rule__ImportExpression__Group_0__0__Impl rule__ImportExpression__Group_0__1 ;
    public final void rule__ImportExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2356:1: ( rule__ImportExpression__Group_0__0__Impl rule__ImportExpression__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2357:2: rule__ImportExpression__Group_0__0__Impl rule__ImportExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_0__0__Impl_in_rule__ImportExpression__Group_0__05036);
            rule__ImportExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportExpression__Group_0__1_in_rule__ImportExpression__Group_0__05039);
            rule__ImportExpression__Group_0__1();

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
    // $ANTLR end "rule__ImportExpression__Group_0__0"


    // $ANTLR start "rule__ImportExpression__Group_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2364:1: rule__ImportExpression__Group_0__0__Impl : ( ( rule__ImportExpression__Alternatives_0_0 ) ) ;
    public final void rule__ImportExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2368:1: ( ( ( rule__ImportExpression__Alternatives_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2369:1: ( ( rule__ImportExpression__Alternatives_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2369:1: ( ( rule__ImportExpression__Alternatives_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2370:1: ( rule__ImportExpression__Alternatives_0_0 )
            {
             before(grammarAccess.getImportExpressionAccess().getAlternatives_0_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2371:1: ( rule__ImportExpression__Alternatives_0_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2371:2: rule__ImportExpression__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__ImportExpression__Alternatives_0_0_in_rule__ImportExpression__Group_0__0__Impl5066);
            rule__ImportExpression__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getImportExpressionAccess().getAlternatives_0_0()); 

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
    // $ANTLR end "rule__ImportExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ImportExpression__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2381:1: rule__ImportExpression__Group_0__1 : rule__ImportExpression__Group_0__1__Impl ;
    public final void rule__ImportExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2385:1: ( rule__ImportExpression__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2386:2: rule__ImportExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_0__1__Impl_in_rule__ImportExpression__Group_0__15096);
            rule__ImportExpression__Group_0__1__Impl();

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
    // $ANTLR end "rule__ImportExpression__Group_0__1"


    // $ANTLR start "rule__ImportExpression__Group_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2392:1: rule__ImportExpression__Group_0__1__Impl : ( ( rule__ImportExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__ImportExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2396:1: ( ( ( rule__ImportExpression__ValueAssignment_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2397:1: ( ( rule__ImportExpression__ValueAssignment_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2397:1: ( ( rule__ImportExpression__ValueAssignment_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2398:1: ( rule__ImportExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getImportExpressionAccess().getValueAssignment_0_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2399:1: ( rule__ImportExpression__ValueAssignment_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2399:2: rule__ImportExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ImportExpression__ValueAssignment_0_1_in_rule__ImportExpression__Group_0__1__Impl5123);
            rule__ImportExpression__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getImportExpressionAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__ImportExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ImportExpression__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2413:1: rule__ImportExpression__Group_1__0 : rule__ImportExpression__Group_1__0__Impl rule__ImportExpression__Group_1__1 ;
    public final void rule__ImportExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2417:1: ( rule__ImportExpression__Group_1__0__Impl rule__ImportExpression__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2418:2: rule__ImportExpression__Group_1__0__Impl rule__ImportExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_1__0__Impl_in_rule__ImportExpression__Group_1__05157);
            rule__ImportExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportExpression__Group_1__1_in_rule__ImportExpression__Group_1__05160);
            rule__ImportExpression__Group_1__1();

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
    // $ANTLR end "rule__ImportExpression__Group_1__0"


    // $ANTLR start "rule__ImportExpression__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2425:1: rule__ImportExpression__Group_1__0__Impl : ( ruleURLType ) ;
    public final void rule__ImportExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2429:1: ( ( ruleURLType ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2430:1: ( ruleURLType )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2430:1: ( ruleURLType )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2431:1: ruleURLType
            {
             before(grammarAccess.getImportExpressionAccess().getURLTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleURLType_in_rule__ImportExpression__Group_1__0__Impl5187);
            ruleURLType();

            state._fsp--;

             after(grammarAccess.getImportExpressionAccess().getURLTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ImportExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ImportExpression__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2442:1: rule__ImportExpression__Group_1__1 : rule__ImportExpression__Group_1__1__Impl rule__ImportExpression__Group_1__2 ;
    public final void rule__ImportExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2446:1: ( rule__ImportExpression__Group_1__1__Impl rule__ImportExpression__Group_1__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2447:2: rule__ImportExpression__Group_1__1__Impl rule__ImportExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_1__1__Impl_in_rule__ImportExpression__Group_1__15216);
            rule__ImportExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportExpression__Group_1__2_in_rule__ImportExpression__Group_1__15219);
            rule__ImportExpression__Group_1__2();

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
    // $ANTLR end "rule__ImportExpression__Group_1__1"


    // $ANTLR start "rule__ImportExpression__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2454:1: rule__ImportExpression__Group_1__1__Impl : ( ( rule__ImportExpression__MediaListAssignment_1_1 )? ) ;
    public final void rule__ImportExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2458:1: ( ( ( rule__ImportExpression__MediaListAssignment_1_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2459:1: ( ( rule__ImportExpression__MediaListAssignment_1_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2459:1: ( ( rule__ImportExpression__MediaListAssignment_1_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2460:1: ( rule__ImportExpression__MediaListAssignment_1_1 )?
            {
             before(grammarAccess.getImportExpressionAccess().getMediaListAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2461:1: ( rule__ImportExpression__MediaListAssignment_1_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_IDENT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2461:2: rule__ImportExpression__MediaListAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ImportExpression__MediaListAssignment_1_1_in_rule__ImportExpression__Group_1__1__Impl5246);
                    rule__ImportExpression__MediaListAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportExpressionAccess().getMediaListAssignment_1_1()); 

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
    // $ANTLR end "rule__ImportExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ImportExpression__Group_1__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2471:1: rule__ImportExpression__Group_1__2 : rule__ImportExpression__Group_1__2__Impl ;
    public final void rule__ImportExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2475:1: ( rule__ImportExpression__Group_1__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2476:2: rule__ImportExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ImportExpression__Group_1__2__Impl_in_rule__ImportExpression__Group_1__25277);
            rule__ImportExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__ImportExpression__Group_1__2"


    // $ANTLR start "rule__ImportExpression__Group_1__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2482:1: rule__ImportExpression__Group_1__2__Impl : ( ';' ) ;
    public final void rule__ImportExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2486:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2487:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2487:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2488:1: ';'
            {
             before(grammarAccess.getImportExpressionAccess().getSemicolonKeyword_1_2()); 
            match(input,44,FOLLOW_44_in_rule__ImportExpression__Group_1__2__Impl5305); 
             after(grammarAccess.getImportExpressionAccess().getSemicolonKeyword_1_2()); 

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
    // $ANTLR end "rule__ImportExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2507:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2511:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2512:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__05342);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__05345);
            rule__Page__Group__1();

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
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2519:1: rule__Page__Group__0__Impl : ( () ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2523:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2524:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2524:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2525:1: ()
            {
             before(grammarAccess.getPageAccess().getPageAction_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2526:1: ()
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2528:1: 
            {
            }

             after(grammarAccess.getPageAccess().getPageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2538:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2542:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2543:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__15403);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__15406);
            rule__Page__Group__2();

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
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2550:1: rule__Page__Group__1__Impl : ( ( rule__Page__Alternatives_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2554:1: ( ( ( rule__Page__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2555:1: ( ( rule__Page__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2555:1: ( ( rule__Page__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2556:1: ( rule__Page__Alternatives_1 )
            {
             before(grammarAccess.getPageAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2557:1: ( rule__Page__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2557:2: rule__Page__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Page__Alternatives_1_in_rule__Page__Group__1__Impl5433);
            rule__Page__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2567:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2571:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2572:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__25463);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__25466);
            rule__Page__Group__3();

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
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2579:1: rule__Page__Group__2__Impl : ( ( rule__Page__PseudoPageAssignment_2 )? ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2583:1: ( ( ( rule__Page__PseudoPageAssignment_2 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2584:1: ( ( rule__Page__PseudoPageAssignment_2 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2584:1: ( ( rule__Page__PseudoPageAssignment_2 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2585:1: ( rule__Page__PseudoPageAssignment_2 )?
            {
             before(grammarAccess.getPageAccess().getPseudoPageAssignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2586:1: ( rule__Page__PseudoPageAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2586:2: rule__Page__PseudoPageAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Page__PseudoPageAssignment_2_in_rule__Page__Group__2__Impl5493);
                    rule__Page__PseudoPageAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getPseudoPageAssignment_2()); 

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
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2596:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2600:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2601:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__35524);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__35527);
            rule__Page__Group__4();

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
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2608:1: rule__Page__Group__3__Impl : ( '{' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2612:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2613:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2613:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2614:1: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,45,FOLLOW_45_in_rule__Page__Group__3__Impl5555); 
             after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2627:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2631:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2632:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__45586);
            rule__Page__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__5_in_rule__Page__Group__45589);
            rule__Page__Group__5();

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
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2639:1: rule__Page__Group__4__Impl : ( ( rule__Page__DeclarationsAssignment_4 )? ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2643:1: ( ( ( rule__Page__DeclarationsAssignment_4 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2644:1: ( ( rule__Page__DeclarationsAssignment_4 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2644:1: ( ( rule__Page__DeclarationsAssignment_4 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2645:1: ( rule__Page__DeclarationsAssignment_4 )?
            {
             before(grammarAccess.getPageAccess().getDeclarationsAssignment_4()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2646:1: ( rule__Page__DeclarationsAssignment_4 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_IDENT||LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2646:2: rule__Page__DeclarationsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Page__DeclarationsAssignment_4_in_rule__Page__Group__4__Impl5616);
                    rule__Page__DeclarationsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getDeclarationsAssignment_4()); 

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
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Page__Group__5"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2656:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2660:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2661:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__55647);
            rule__Page__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__6_in_rule__Page__Group__55650);
            rule__Page__Group__6();

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
    // $ANTLR end "rule__Page__Group__5"


    // $ANTLR start "rule__Page__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2668:1: rule__Page__Group__5__Impl : ( ( rule__Page__Group_5__0 )* ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2672:1: ( ( ( rule__Page__Group_5__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2673:1: ( ( rule__Page__Group_5__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2673:1: ( ( rule__Page__Group_5__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2674:1: ( rule__Page__Group_5__0 )*
            {
             before(grammarAccess.getPageAccess().getGroup_5()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2675:1: ( rule__Page__Group_5__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==44) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2675:2: rule__Page__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Page__Group_5__0_in_rule__Page__Group__5__Impl5677);
            	    rule__Page__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Page__Group__5__Impl"


    // $ANTLR start "rule__Page__Group__6"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2685:1: rule__Page__Group__6 : rule__Page__Group__6__Impl ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2689:1: ( rule__Page__Group__6__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2690:2: rule__Page__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__65708);
            rule__Page__Group__6__Impl();

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
    // $ANTLR end "rule__Page__Group__6"


    // $ANTLR start "rule__Page__Group__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2696:1: rule__Page__Group__6__Impl : ( '}' ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2700:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2701:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2701:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2702:1: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,46,FOLLOW_46_in_rule__Page__Group__6__Impl5736); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Page__Group__6__Impl"


    // $ANTLR start "rule__Page__Group_5__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2729:1: rule__Page__Group_5__0 : rule__Page__Group_5__0__Impl rule__Page__Group_5__1 ;
    public final void rule__Page__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2733:1: ( rule__Page__Group_5__0__Impl rule__Page__Group_5__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2734:2: rule__Page__Group_5__0__Impl rule__Page__Group_5__1
            {
            pushFollow(FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__05781);
            rule__Page__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__05784);
            rule__Page__Group_5__1();

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
    // $ANTLR end "rule__Page__Group_5__0"


    // $ANTLR start "rule__Page__Group_5__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2741:1: rule__Page__Group_5__0__Impl : ( ';' ) ;
    public final void rule__Page__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2745:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2746:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2746:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2747:1: ';'
            {
             before(grammarAccess.getPageAccess().getSemicolonKeyword_5_0()); 
            match(input,44,FOLLOW_44_in_rule__Page__Group_5__0__Impl5812); 
             after(grammarAccess.getPageAccess().getSemicolonKeyword_5_0()); 

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
    // $ANTLR end "rule__Page__Group_5__0__Impl"


    // $ANTLR start "rule__Page__Group_5__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2760:1: rule__Page__Group_5__1 : rule__Page__Group_5__1__Impl ;
    public final void rule__Page__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2764:1: ( rule__Page__Group_5__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2765:2: rule__Page__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__15843);
            rule__Page__Group_5__1__Impl();

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
    // $ANTLR end "rule__Page__Group_5__1"


    // $ANTLR start "rule__Page__Group_5__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2771:1: rule__Page__Group_5__1__Impl : ( ( rule__Page__DeclarationsAssignment_5_1 )? ) ;
    public final void rule__Page__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2775:1: ( ( ( rule__Page__DeclarationsAssignment_5_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2776:1: ( ( rule__Page__DeclarationsAssignment_5_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2776:1: ( ( rule__Page__DeclarationsAssignment_5_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2777:1: ( rule__Page__DeclarationsAssignment_5_1 )?
            {
             before(grammarAccess.getPageAccess().getDeclarationsAssignment_5_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2778:1: ( rule__Page__DeclarationsAssignment_5_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_IDENT||LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2778:2: rule__Page__DeclarationsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Page__DeclarationsAssignment_5_1_in_rule__Page__Group_5__1__Impl5870);
                    rule__Page__DeclarationsAssignment_5_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPageAccess().getDeclarationsAssignment_5_1()); 

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
    // $ANTLR end "rule__Page__Group_5__1__Impl"


    // $ANTLR start "rule__Pseudo_page__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2792:1: rule__Pseudo_page__Group__0 : rule__Pseudo_page__Group__0__Impl rule__Pseudo_page__Group__1 ;
    public final void rule__Pseudo_page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2796:1: ( rule__Pseudo_page__Group__0__Impl rule__Pseudo_page__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2797:2: rule__Pseudo_page__Group__0__Impl rule__Pseudo_page__Group__1
            {
            pushFollow(FOLLOW_rule__Pseudo_page__Group__0__Impl_in_rule__Pseudo_page__Group__05905);
            rule__Pseudo_page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pseudo_page__Group__1_in_rule__Pseudo_page__Group__05908);
            rule__Pseudo_page__Group__1();

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
    // $ANTLR end "rule__Pseudo_page__Group__0"


    // $ANTLR start "rule__Pseudo_page__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2804:1: rule__Pseudo_page__Group__0__Impl : ( ':' ) ;
    public final void rule__Pseudo_page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2808:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2809:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2809:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2810:1: ':'
            {
             before(grammarAccess.getPseudo_pageAccess().getColonKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Pseudo_page__Group__0__Impl5936); 
             after(grammarAccess.getPseudo_pageAccess().getColonKeyword_0()); 

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
    // $ANTLR end "rule__Pseudo_page__Group__0__Impl"


    // $ANTLR start "rule__Pseudo_page__Group__1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2823:1: rule__Pseudo_page__Group__1 : rule__Pseudo_page__Group__1__Impl ;
    public final void rule__Pseudo_page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2827:1: ( rule__Pseudo_page__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2828:2: rule__Pseudo_page__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Pseudo_page__Group__1__Impl_in_rule__Pseudo_page__Group__15967);
            rule__Pseudo_page__Group__1__Impl();

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
    // $ANTLR end "rule__Pseudo_page__Group__1"


    // $ANTLR start "rule__Pseudo_page__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2834:1: rule__Pseudo_page__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Pseudo_page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2838:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2839:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2839:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2840:1: RULE_IDENT
            {
             before(grammarAccess.getPseudo_pageAccess().getIDENTTerminalRuleCall_1()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Pseudo_page__Group__1__Impl5994); 
             after(grammarAccess.getPseudo_pageAccess().getIDENTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Pseudo_page__Group__1__Impl"


    // $ANTLR start "rule__Media__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2855:1: rule__Media__Group__0 : rule__Media__Group__0__Impl rule__Media__Group__1 ;
    public final void rule__Media__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2859:1: ( rule__Media__Group__0__Impl rule__Media__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2860:2: rule__Media__Group__0__Impl rule__Media__Group__1
            {
            pushFollow(FOLLOW_rule__Media__Group__0__Impl_in_rule__Media__Group__06027);
            rule__Media__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media__Group__1_in_rule__Media__Group__06030);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2867:1: rule__Media__Group__0__Impl : ( ( rule__Media__Alternatives_0 ) ) ;
    public final void rule__Media__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2871:1: ( ( ( rule__Media__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2872:1: ( ( rule__Media__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2872:1: ( ( rule__Media__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2873:1: ( rule__Media__Alternatives_0 )
            {
             before(grammarAccess.getMediaAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2874:1: ( rule__Media__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2874:2: rule__Media__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Media__Alternatives_0_in_rule__Media__Group__0__Impl6057);
            rule__Media__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMediaAccess().getAlternatives_0()); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2884:1: rule__Media__Group__1 : rule__Media__Group__1__Impl rule__Media__Group__2 ;
    public final void rule__Media__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2888:1: ( rule__Media__Group__1__Impl rule__Media__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2889:2: rule__Media__Group__1__Impl rule__Media__Group__2
            {
            pushFollow(FOLLOW_rule__Media__Group__1__Impl_in_rule__Media__Group__16087);
            rule__Media__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media__Group__2_in_rule__Media__Group__16090);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2896:1: rule__Media__Group__1__Impl : ( ( rule__Media__MedialistAssignment_1 ) ) ;
    public final void rule__Media__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2900:1: ( ( ( rule__Media__MedialistAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2901:1: ( ( rule__Media__MedialistAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2901:1: ( ( rule__Media__MedialistAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2902:1: ( rule__Media__MedialistAssignment_1 )
            {
             before(grammarAccess.getMediaAccess().getMedialistAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2903:1: ( rule__Media__MedialistAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2903:2: rule__Media__MedialistAssignment_1
            {
            pushFollow(FOLLOW_rule__Media__MedialistAssignment_1_in_rule__Media__Group__1__Impl6117);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2913:1: rule__Media__Group__2 : rule__Media__Group__2__Impl rule__Media__Group__3 ;
    public final void rule__Media__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2917:1: ( rule__Media__Group__2__Impl rule__Media__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2918:2: rule__Media__Group__2__Impl rule__Media__Group__3
            {
            pushFollow(FOLLOW_rule__Media__Group__2__Impl_in_rule__Media__Group__26147);
            rule__Media__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media__Group__3_in_rule__Media__Group__26150);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2925:1: rule__Media__Group__2__Impl : ( '{' ) ;
    public final void rule__Media__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2929:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2930:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2930:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2931:1: '{'
            {
             before(grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__Media__Group__2__Impl6178); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2944:1: rule__Media__Group__3 : rule__Media__Group__3__Impl rule__Media__Group__4 ;
    public final void rule__Media__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2948:1: ( rule__Media__Group__3__Impl rule__Media__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2949:2: rule__Media__Group__3__Impl rule__Media__Group__4
            {
            pushFollow(FOLLOW_rule__Media__Group__3__Impl_in_rule__Media__Group__36209);
            rule__Media__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media__Group__4_in_rule__Media__Group__36212);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2956:1: rule__Media__Group__3__Impl : ( ( rule__Media__RulesetsAssignment_3 )* ) ;
    public final void rule__Media__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2960:1: ( ( ( rule__Media__RulesetsAssignment_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2961:1: ( ( rule__Media__RulesetsAssignment_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2961:1: ( ( rule__Media__RulesetsAssignment_3 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2962:1: ( rule__Media__RulesetsAssignment_3 )*
            {
             before(grammarAccess.getMediaAccess().getRulesetsAssignment_3()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2963:1: ( rule__Media__RulesetsAssignment_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_IDENT && LA37_0<=RULE_HASH)||LA37_0==23||(LA37_0>=29 && LA37_0<=43)||(LA37_0>=47 && LA37_0<=49)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2963:2: rule__Media__RulesetsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Media__RulesetsAssignment_3_in_rule__Media__Group__3__Impl6239);
            	    rule__Media__RulesetsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2973:1: rule__Media__Group__4 : rule__Media__Group__4__Impl ;
    public final void rule__Media__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2977:1: ( rule__Media__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2978:2: rule__Media__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Media__Group__4__Impl_in_rule__Media__Group__46270);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2984:1: rule__Media__Group__4__Impl : ( '}' ) ;
    public final void rule__Media__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2988:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2989:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2989:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:2990:1: '}'
            {
             before(grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_46_in_rule__Media__Group__4__Impl6298); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3013:1: rule__Media_list__Group__0 : rule__Media_list__Group__0__Impl rule__Media_list__Group__1 ;
    public final void rule__Media_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3017:1: ( rule__Media_list__Group__0__Impl rule__Media_list__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3018:2: rule__Media_list__Group__0__Impl rule__Media_list__Group__1
            {
            pushFollow(FOLLOW_rule__Media_list__Group__0__Impl_in_rule__Media_list__Group__06339);
            rule__Media_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media_list__Group__1_in_rule__Media_list__Group__06342);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3025:1: rule__Media_list__Group__0__Impl : ( rulemedium ) ;
    public final void rule__Media_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3029:1: ( ( rulemedium ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3030:1: ( rulemedium )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3030:1: ( rulemedium )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3031:1: rulemedium
            {
             before(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulemedium_in_rule__Media_list__Group__0__Impl6369);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3042:1: rule__Media_list__Group__1 : rule__Media_list__Group__1__Impl ;
    public final void rule__Media_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3046:1: ( rule__Media_list__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3047:2: rule__Media_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Media_list__Group__1__Impl_in_rule__Media_list__Group__16398);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3053:1: rule__Media_list__Group__1__Impl : ( ( rule__Media_list__Group_1__0 )* ) ;
    public final void rule__Media_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3057:1: ( ( ( rule__Media_list__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3058:1: ( ( rule__Media_list__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3058:1: ( ( rule__Media_list__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3059:1: ( rule__Media_list__Group_1__0 )*
            {
             before(grammarAccess.getMedia_listAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3060:1: ( rule__Media_list__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3060:2: rule__Media_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Media_list__Group_1__0_in_rule__Media_list__Group__1__Impl6425);
            	    rule__Media_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3074:1: rule__Media_list__Group_1__0 : rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1 ;
    public final void rule__Media_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3078:1: ( rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3079:2: rule__Media_list__Group_1__0__Impl rule__Media_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Media_list__Group_1__0__Impl_in_rule__Media_list__Group_1__06460);
            rule__Media_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Media_list__Group_1__1_in_rule__Media_list__Group_1__06463);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3086:1: rule__Media_list__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Media_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3090:1: ( ( RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3091:1: ( RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3091:1: ( RULE_COMMA )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3092:1: RULE_COMMA
            {
             before(grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Media_list__Group_1__0__Impl6490); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3103:1: rule__Media_list__Group_1__1 : rule__Media_list__Group_1__1__Impl ;
    public final void rule__Media_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3107:1: ( rule__Media_list__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3108:2: rule__Media_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Media_list__Group_1__1__Impl_in_rule__Media_list__Group_1__16519);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3114:1: rule__Media_list__Group_1__1__Impl : ( rulemedium ) ;
    public final void rule__Media_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3118:1: ( ( rulemedium ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3119:1: ( rulemedium )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3119:1: ( rulemedium )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3120:1: rulemedium
            {
             before(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulemedium_in_rule__Media_list__Group_1__1__Impl6546);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3135:1: rule__Ruleset__Group__0 : rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 ;
    public final void rule__Ruleset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3139:1: ( rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3140:2: rule__Ruleset__Group__0__Impl rule__Ruleset__Group__1
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__0__Impl_in_rule__Ruleset__Group__06579);
            rule__Ruleset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group__1_in_rule__Ruleset__Group__06582);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3147:1: rule__Ruleset__Group__0__Impl : ( ( rule__Ruleset__SelectorsAssignment_0 ) ) ;
    public final void rule__Ruleset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3151:1: ( ( ( rule__Ruleset__SelectorsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3152:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3152:1: ( ( rule__Ruleset__SelectorsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3153:1: ( rule__Ruleset__SelectorsAssignment_0 )
            {
             before(grammarAccess.getRulesetAccess().getSelectorsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3154:1: ( rule__Ruleset__SelectorsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3154:2: rule__Ruleset__SelectorsAssignment_0
            {
            pushFollow(FOLLOW_rule__Ruleset__SelectorsAssignment_0_in_rule__Ruleset__Group__0__Impl6609);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3164:1: rule__Ruleset__Group__1 : rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 ;
    public final void rule__Ruleset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3168:1: ( rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3169:2: rule__Ruleset__Group__1__Impl rule__Ruleset__Group__2
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__1__Impl_in_rule__Ruleset__Group__16639);
            rule__Ruleset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group__2_in_rule__Ruleset__Group__16642);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3176:1: rule__Ruleset__Group__1__Impl : ( ( rule__Ruleset__Group_1__0 )* ) ;
    public final void rule__Ruleset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3180:1: ( ( ( rule__Ruleset__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3181:1: ( ( rule__Ruleset__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3181:1: ( ( rule__Ruleset__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3182:1: ( rule__Ruleset__Group_1__0 )*
            {
             before(grammarAccess.getRulesetAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3183:1: ( rule__Ruleset__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_COMMA) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3183:2: rule__Ruleset__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Ruleset__Group_1__0_in_rule__Ruleset__Group__1__Impl6669);
            	    rule__Ruleset__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3193:1: rule__Ruleset__Group__2 : rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 ;
    public final void rule__Ruleset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3197:1: ( rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3198:2: rule__Ruleset__Group__2__Impl rule__Ruleset__Group__3
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__2__Impl_in_rule__Ruleset__Group__26700);
            rule__Ruleset__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group__3_in_rule__Ruleset__Group__26703);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3205:1: rule__Ruleset__Group__2__Impl : ( '{' ) ;
    public final void rule__Ruleset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3209:1: ( ( '{' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3210:1: ( '{' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3210:1: ( '{' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3211:1: '{'
            {
             before(grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__Ruleset__Group__2__Impl6731); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3224:1: rule__Ruleset__Group__3 : rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 ;
    public final void rule__Ruleset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3228:1: ( rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3229:2: rule__Ruleset__Group__3__Impl rule__Ruleset__Group__4
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__3__Impl_in_rule__Ruleset__Group__36762);
            rule__Ruleset__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group__4_in_rule__Ruleset__Group__36765);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3236:1: rule__Ruleset__Group__3__Impl : ( ( rule__Ruleset__Group_3__0 )* ) ;
    public final void rule__Ruleset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3240:1: ( ( ( rule__Ruleset__Group_3__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3241:1: ( ( rule__Ruleset__Group_3__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3241:1: ( ( rule__Ruleset__Group_3__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3242:1: ( rule__Ruleset__Group_3__0 )*
            {
             before(grammarAccess.getRulesetAccess().getGroup_3()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3243:1: ( rule__Ruleset__Group_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_IDENT||LA40_0==28) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3243:2: rule__Ruleset__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Ruleset__Group_3__0_in_rule__Ruleset__Group__3__Impl6792);
            	    rule__Ruleset__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3253:1: rule__Ruleset__Group__4 : rule__Ruleset__Group__4__Impl ;
    public final void rule__Ruleset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3257:1: ( rule__Ruleset__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3258:2: rule__Ruleset__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Ruleset__Group__4__Impl_in_rule__Ruleset__Group__46823);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3264:1: rule__Ruleset__Group__4__Impl : ( '}' ) ;
    public final void rule__Ruleset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3268:1: ( ( '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3269:1: ( '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3269:1: ( '}' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3270:1: '}'
            {
             before(grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_4()); 
            match(input,46,FOLLOW_46_in_rule__Ruleset__Group__4__Impl6851); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3293:1: rule__Ruleset__Group_1__0 : rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 ;
    public final void rule__Ruleset__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3297:1: ( rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3298:2: rule__Ruleset__Group_1__0__Impl rule__Ruleset__Group_1__1
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_1__0__Impl_in_rule__Ruleset__Group_1__06892);
            rule__Ruleset__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group_1__1_in_rule__Ruleset__Group_1__06895);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3305:1: rule__Ruleset__Group_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Ruleset__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3309:1: ( ( RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3310:1: ( RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3310:1: ( RULE_COMMA )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3311:1: RULE_COMMA
            {
             before(grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Ruleset__Group_1__0__Impl6922); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3322:1: rule__Ruleset__Group_1__1 : rule__Ruleset__Group_1__1__Impl ;
    public final void rule__Ruleset__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3326:1: ( rule__Ruleset__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3327:2: rule__Ruleset__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_1__1__Impl_in_rule__Ruleset__Group_1__16951);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3333:1: rule__Ruleset__Group_1__1__Impl : ( ( rule__Ruleset__SelectorsAssignment_1_1 ) ) ;
    public final void rule__Ruleset__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3337:1: ( ( ( rule__Ruleset__SelectorsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3338:1: ( ( rule__Ruleset__SelectorsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3338:1: ( ( rule__Ruleset__SelectorsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3339:1: ( rule__Ruleset__SelectorsAssignment_1_1 )
            {
             before(grammarAccess.getRulesetAccess().getSelectorsAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3340:1: ( rule__Ruleset__SelectorsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3340:2: rule__Ruleset__SelectorsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Ruleset__SelectorsAssignment_1_1_in_rule__Ruleset__Group_1__1__Impl6978);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3354:1: rule__Ruleset__Group_3__0 : rule__Ruleset__Group_3__0__Impl rule__Ruleset__Group_3__1 ;
    public final void rule__Ruleset__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3358:1: ( rule__Ruleset__Group_3__0__Impl rule__Ruleset__Group_3__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3359:2: rule__Ruleset__Group_3__0__Impl rule__Ruleset__Group_3__1
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_3__0__Impl_in_rule__Ruleset__Group_3__07012);
            rule__Ruleset__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ruleset__Group_3__1_in_rule__Ruleset__Group_3__07015);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3366:1: rule__Ruleset__Group_3__0__Impl : ( ( rule__Ruleset__DeclarationsAssignment_3_0 ) ) ;
    public final void rule__Ruleset__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3370:1: ( ( ( rule__Ruleset__DeclarationsAssignment_3_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3371:1: ( ( rule__Ruleset__DeclarationsAssignment_3_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3371:1: ( ( rule__Ruleset__DeclarationsAssignment_3_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3372:1: ( rule__Ruleset__DeclarationsAssignment_3_0 )
            {
             before(grammarAccess.getRulesetAccess().getDeclarationsAssignment_3_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3373:1: ( rule__Ruleset__DeclarationsAssignment_3_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3373:2: rule__Ruleset__DeclarationsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Ruleset__DeclarationsAssignment_3_0_in_rule__Ruleset__Group_3__0__Impl7042);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3383:1: rule__Ruleset__Group_3__1 : rule__Ruleset__Group_3__1__Impl ;
    public final void rule__Ruleset__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3387:1: ( rule__Ruleset__Group_3__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3388:2: rule__Ruleset__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Ruleset__Group_3__1__Impl_in_rule__Ruleset__Group_3__17072);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3394:1: rule__Ruleset__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Ruleset__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3398:1: ( ( ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3399:1: ( ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3399:1: ( ';' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3400:1: ';'
            {
             before(grammarAccess.getRulesetAccess().getSemicolonKeyword_3_1()); 
            match(input,44,FOLLOW_44_in_rule__Ruleset__Group_3__1__Impl7100); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3417:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3421:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3422:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__07135);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__07138);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3429:1: rule__Selector__Group__0__Impl : ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3433:1: ( ( ( rule__Selector__SimpleselectorsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3434:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3434:1: ( ( rule__Selector__SimpleselectorsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3435:1: ( rule__Selector__SimpleselectorsAssignment_0 )
            {
             before(grammarAccess.getSelectorAccess().getSimpleselectorsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3436:1: ( rule__Selector__SimpleselectorsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3436:2: rule__Selector__SimpleselectorsAssignment_0
            {
            pushFollow(FOLLOW_rule__Selector__SimpleselectorsAssignment_0_in_rule__Selector__Group__0__Impl7165);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3446:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3450:1: ( rule__Selector__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3451:2: rule__Selector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__17195);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3457:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__Alternatives_1 )? ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3461:1: ( ( ( rule__Selector__Alternatives_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3462:1: ( ( rule__Selector__Alternatives_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3462:1: ( ( rule__Selector__Alternatives_1 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3463:1: ( rule__Selector__Alternatives_1 )?
            {
             before(grammarAccess.getSelectorAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3464:1: ( rule__Selector__Alternatives_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_WS||(LA41_0>=25 && LA41_0<=26)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3464:2: rule__Selector__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Selector__Alternatives_1_in_rule__Selector__Group__1__Impl7222);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3478:1: rule__Selector__Group_1_0__0 : rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 ;
    public final void rule__Selector__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3482:1: ( rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3483:2: rule__Selector__Group_1_0__0__Impl rule__Selector__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_0__0__Impl_in_rule__Selector__Group_1_0__07257);
            rule__Selector__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1_0__1_in_rule__Selector__Group_1_0__07260);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3490:1: rule__Selector__Group_1_0__0__Impl : ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) ;
    public final void rule__Selector__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3494:1: ( ( ( rule__Selector__CombinatorAssignment_1_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3495:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3495:1: ( ( rule__Selector__CombinatorAssignment_1_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3496:1: ( rule__Selector__CombinatorAssignment_1_0_0 )
            {
             before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_0_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3497:1: ( rule__Selector__CombinatorAssignment_1_0_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3497:2: rule__Selector__CombinatorAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Selector__CombinatorAssignment_1_0_0_in_rule__Selector__Group_1_0__0__Impl7287);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3507:1: rule__Selector__Group_1_0__1 : rule__Selector__Group_1_0__1__Impl ;
    public final void rule__Selector__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3511:1: ( rule__Selector__Group_1_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3512:2: rule__Selector__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_0__1__Impl_in_rule__Selector__Group_1_0__17317);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3518:1: rule__Selector__Group_1_0__1__Impl : ( ( rule__Selector__SelectorAssignment_1_0_1 ) ) ;
    public final void rule__Selector__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3522:1: ( ( ( rule__Selector__SelectorAssignment_1_0_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3523:1: ( ( rule__Selector__SelectorAssignment_1_0_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3523:1: ( ( rule__Selector__SelectorAssignment_1_0_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3524:1: ( rule__Selector__SelectorAssignment_1_0_1 )
            {
             before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_0_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3525:1: ( rule__Selector__SelectorAssignment_1_0_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3525:2: rule__Selector__SelectorAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Selector__SelectorAssignment_1_0_1_in_rule__Selector__Group_1_0__1__Impl7344);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3539:1: rule__Selector__Group_1_1__0 : rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 ;
    public final void rule__Selector__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3543:1: ( rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3544:2: rule__Selector__Group_1_1__0__Impl rule__Selector__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1__0__Impl_in_rule__Selector__Group_1_1__07378);
            rule__Selector__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1_1__1_in_rule__Selector__Group_1_1__07381);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3551:1: rule__Selector__Group_1_1__0__Impl : ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) ;
    public final void rule__Selector__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3555:1: ( ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3556:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3556:1: ( ( ( RULE_WS ) ) ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3557:1: ( ( RULE_WS ) ) ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3557:1: ( ( RULE_WS ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3558:1: ( RULE_WS )
            {
             before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3559:1: ( RULE_WS )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3559:3: RULE_WS
            {
            match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl7411); 

            }

             after(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 

            }

            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3562:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3563:1: ( RULE_WS )*
            {
             before(grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3564:1: ( RULE_WS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_WS) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3564:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl7424); 

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3575:1: rule__Selector__Group_1_1__1 : rule__Selector__Group_1_1__1__Impl ;
    public final void rule__Selector__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3579:1: ( rule__Selector__Group_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3580:2: rule__Selector__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1__1__Impl_in_rule__Selector__Group_1_1__17457);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3586:1: rule__Selector__Group_1_1__1__Impl : ( ( rule__Selector__Group_1_1_1__0 )? ) ;
    public final void rule__Selector__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3590:1: ( ( ( rule__Selector__Group_1_1_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3591:1: ( ( rule__Selector__Group_1_1_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3591:1: ( ( rule__Selector__Group_1_1_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3592:1: ( rule__Selector__Group_1_1_1__0 )?
            {
             before(grammarAccess.getSelectorAccess().getGroup_1_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3593:1: ( rule__Selector__Group_1_1_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_IDENT && LA43_0<=RULE_HASH)||LA43_0==23||(LA43_0>=25 && LA43_0<=26)||(LA43_0>=29 && LA43_0<=43)||(LA43_0>=47 && LA43_0<=49)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3593:2: rule__Selector__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Selector__Group_1_1_1__0_in_rule__Selector__Group_1_1__1__Impl7484);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3607:1: rule__Selector__Group_1_1_1__0 : rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 ;
    public final void rule__Selector__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3611:1: ( rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3612:2: rule__Selector__Group_1_1_1__0__Impl rule__Selector__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1_1__0__Impl_in_rule__Selector__Group_1_1_1__07519);
            rule__Selector__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Selector__Group_1_1_1__1_in_rule__Selector__Group_1_1_1__07522);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3619:1: rule__Selector__Group_1_1_1__0__Impl : ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? ) ;
    public final void rule__Selector__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3623:1: ( ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3624:1: ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3624:1: ( ( rule__Selector__CombinatorAssignment_1_1_1_0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3625:1: ( rule__Selector__CombinatorAssignment_1_1_1_0 )?
            {
             before(grammarAccess.getSelectorAccess().getCombinatorAssignment_1_1_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3626:1: ( rule__Selector__CombinatorAssignment_1_1_1_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=25 && LA44_0<=26)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3626:2: rule__Selector__CombinatorAssignment_1_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Selector__CombinatorAssignment_1_1_1_0_in_rule__Selector__Group_1_1_1__0__Impl7549);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3636:1: rule__Selector__Group_1_1_1__1 : rule__Selector__Group_1_1_1__1__Impl ;
    public final void rule__Selector__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3640:1: ( rule__Selector__Group_1_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3641:2: rule__Selector__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Selector__Group_1_1_1__1__Impl_in_rule__Selector__Group_1_1_1__17580);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3647:1: rule__Selector__Group_1_1_1__1__Impl : ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) ) ;
    public final void rule__Selector__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3651:1: ( ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3652:1: ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3652:1: ( ( rule__Selector__SelectorAssignment_1_1_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3653:1: ( rule__Selector__SelectorAssignment_1_1_1_1 )
            {
             before(grammarAccess.getSelectorAccess().getSelectorAssignment_1_1_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3654:1: ( rule__Selector__SelectorAssignment_1_1_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3654:2: rule__Selector__SelectorAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Selector__SelectorAssignment_1_1_1_1_in_rule__Selector__Group_1_1_1__1__Impl7607);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3668:1: rule__Simple_selector__Group_0__0 : rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1 ;
    public final void rule__Simple_selector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3672:1: ( rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3673:2: rule__Simple_selector__Group_0__0__Impl rule__Simple_selector__Group_0__1
            {
            pushFollow(FOLLOW_rule__Simple_selector__Group_0__0__Impl_in_rule__Simple_selector__Group_0__07641);
            rule__Simple_selector__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simple_selector__Group_0__1_in_rule__Simple_selector__Group_0__07644);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3680:1: rule__Simple_selector__Group_0__0__Impl : ( ( rule__Simple_selector__ElementAssignment_0_0 ) ) ;
    public final void rule__Simple_selector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3684:1: ( ( ( rule__Simple_selector__ElementAssignment_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3685:1: ( ( rule__Simple_selector__ElementAssignment_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3685:1: ( ( rule__Simple_selector__ElementAssignment_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3686:1: ( rule__Simple_selector__ElementAssignment_0_0 )
            {
             before(grammarAccess.getSimple_selectorAccess().getElementAssignment_0_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3687:1: ( rule__Simple_selector__ElementAssignment_0_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3687:2: rule__Simple_selector__ElementAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Simple_selector__ElementAssignment_0_0_in_rule__Simple_selector__Group_0__0__Impl7671);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3697:1: rule__Simple_selector__Group_0__1 : rule__Simple_selector__Group_0__1__Impl ;
    public final void rule__Simple_selector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3701:1: ( rule__Simple_selector__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3702:2: rule__Simple_selector__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Simple_selector__Group_0__1__Impl_in_rule__Simple_selector__Group_0__17701);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3708:1: rule__Simple_selector__Group_0__1__Impl : ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* ) ;
    public final void rule__Simple_selector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3712:1: ( ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3713:1: ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3713:1: ( ( rule__Simple_selector__SubSelectorsAssignment_0_1 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3714:1: ( rule__Simple_selector__SubSelectorsAssignment_0_1 )*
            {
             before(grammarAccess.getSimple_selectorAccess().getSubSelectorsAssignment_0_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3715:1: ( rule__Simple_selector__SubSelectorsAssignment_0_1 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_HASH||(LA45_0>=47 && LA45_0<=49)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3715:2: rule__Simple_selector__SubSelectorsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Simple_selector__SubSelectorsAssignment_0_1_in_rule__Simple_selector__Group_0__1__Impl7728);
            	    rule__Simple_selector__SubSelectorsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3729:1: rule__Css_class__Group__0 : rule__Css_class__Group__0__Impl rule__Css_class__Group__1 ;
    public final void rule__Css_class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3733:1: ( rule__Css_class__Group__0__Impl rule__Css_class__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3734:2: rule__Css_class__Group__0__Impl rule__Css_class__Group__1
            {
            pushFollow(FOLLOW_rule__Css_class__Group__0__Impl_in_rule__Css_class__Group__07763);
            rule__Css_class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_class__Group__1_in_rule__Css_class__Group__07766);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3741:1: rule__Css_class__Group__0__Impl : ( '.' ) ;
    public final void rule__Css_class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3745:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3746:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3746:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3747:1: '.'
            {
             before(grammarAccess.getCss_classAccess().getFullStopKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__Css_class__Group__0__Impl7794); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3760:1: rule__Css_class__Group__1 : rule__Css_class__Group__1__Impl ;
    public final void rule__Css_class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3764:1: ( rule__Css_class__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3765:2: rule__Css_class__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_class__Group__1__Impl_in_rule__Css_class__Group__17825);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3771:1: rule__Css_class__Group__1__Impl : ( ( rule__Css_class__Alternatives_1 ) ) ;
    public final void rule__Css_class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3775:1: ( ( ( rule__Css_class__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3776:1: ( ( rule__Css_class__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3776:1: ( ( rule__Css_class__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3777:1: ( rule__Css_class__Alternatives_1 )
            {
             before(grammarAccess.getCss_classAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3778:1: ( rule__Css_class__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3778:2: rule__Css_class__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Css_class__Alternatives_1_in_rule__Css_class__Group__1__Impl7852);
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


    // $ANTLR start "rule__Css_attrib__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3792:1: rule__Css_attrib__Group__0 : rule__Css_attrib__Group__0__Impl rule__Css_attrib__Group__1 ;
    public final void rule__Css_attrib__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3796:1: ( rule__Css_attrib__Group__0__Impl rule__Css_attrib__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3797:2: rule__Css_attrib__Group__0__Impl rule__Css_attrib__Group__1
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__0__Impl_in_rule__Css_attrib__Group__07886);
            rule__Css_attrib__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_attrib__Group__1_in_rule__Css_attrib__Group__07889);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3804:1: rule__Css_attrib__Group__0__Impl : ( '[' ) ;
    public final void rule__Css_attrib__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3808:1: ( ( '[' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3809:1: ( '[' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3809:1: ( '[' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3810:1: '['
            {
             before(grammarAccess.getCss_attribAccess().getLeftSquareBracketKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__Css_attrib__Group__0__Impl7917); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3823:1: rule__Css_attrib__Group__1 : rule__Css_attrib__Group__1__Impl rule__Css_attrib__Group__2 ;
    public final void rule__Css_attrib__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3827:1: ( rule__Css_attrib__Group__1__Impl rule__Css_attrib__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3828:2: rule__Css_attrib__Group__1__Impl rule__Css_attrib__Group__2
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__1__Impl_in_rule__Css_attrib__Group__17948);
            rule__Css_attrib__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_attrib__Group__2_in_rule__Css_attrib__Group__17951);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3835:1: rule__Css_attrib__Group__1__Impl : ( ( rule__Css_attrib__Alternatives_1 ) ) ;
    public final void rule__Css_attrib__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3839:1: ( ( ( rule__Css_attrib__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3840:1: ( ( rule__Css_attrib__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3840:1: ( ( rule__Css_attrib__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3841:1: ( rule__Css_attrib__Alternatives_1 )
            {
             before(grammarAccess.getCss_attribAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3842:1: ( rule__Css_attrib__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3842:2: rule__Css_attrib__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Css_attrib__Alternatives_1_in_rule__Css_attrib__Group__1__Impl7978);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3852:1: rule__Css_attrib__Group__2 : rule__Css_attrib__Group__2__Impl rule__Css_attrib__Group__3 ;
    public final void rule__Css_attrib__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3856:1: ( rule__Css_attrib__Group__2__Impl rule__Css_attrib__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3857:2: rule__Css_attrib__Group__2__Impl rule__Css_attrib__Group__3
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__2__Impl_in_rule__Css_attrib__Group__28008);
            rule__Css_attrib__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_attrib__Group__3_in_rule__Css_attrib__Group__28011);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3864:1: rule__Css_attrib__Group__2__Impl : ( ( rule__Css_attrib__Group_2__0 )? ) ;
    public final void rule__Css_attrib__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3868:1: ( ( ( rule__Css_attrib__Group_2__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3869:1: ( ( rule__Css_attrib__Group_2__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3869:1: ( ( rule__Css_attrib__Group_2__0 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3870:1: ( rule__Css_attrib__Group_2__0 )?
            {
             before(grammarAccess.getCss_attribAccess().getGroup_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3871:1: ( rule__Css_attrib__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_INCLUDES && LA46_0<=RULE_DASHMATCH)||LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3871:2: rule__Css_attrib__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Css_attrib__Group_2__0_in_rule__Css_attrib__Group__2__Impl8038);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3881:1: rule__Css_attrib__Group__3 : rule__Css_attrib__Group__3__Impl ;
    public final void rule__Css_attrib__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3885:1: ( rule__Css_attrib__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3886:2: rule__Css_attrib__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group__3__Impl_in_rule__Css_attrib__Group__38069);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3892:1: rule__Css_attrib__Group__3__Impl : ( ']' ) ;
    public final void rule__Css_attrib__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3896:1: ( ( ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3897:1: ( ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3897:1: ( ']' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3898:1: ']'
            {
             before(grammarAccess.getCss_attribAccess().getRightSquareBracketKeyword_3()); 
            match(input,50,FOLLOW_50_in_rule__Css_attrib__Group__3__Impl8097); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3919:1: rule__Css_attrib__Group_2__0 : rule__Css_attrib__Group_2__0__Impl rule__Css_attrib__Group_2__1 ;
    public final void rule__Css_attrib__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3923:1: ( rule__Css_attrib__Group_2__0__Impl rule__Css_attrib__Group_2__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3924:2: rule__Css_attrib__Group_2__0__Impl rule__Css_attrib__Group_2__1
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group_2__0__Impl_in_rule__Css_attrib__Group_2__08136);
            rule__Css_attrib__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_attrib__Group_2__1_in_rule__Css_attrib__Group_2__08139);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3931:1: rule__Css_attrib__Group_2__0__Impl : ( ( rule__Css_attrib__Alternatives_2_0 ) ) ;
    public final void rule__Css_attrib__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3935:1: ( ( ( rule__Css_attrib__Alternatives_2_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3936:1: ( ( rule__Css_attrib__Alternatives_2_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3936:1: ( ( rule__Css_attrib__Alternatives_2_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3937:1: ( rule__Css_attrib__Alternatives_2_0 )
            {
             before(grammarAccess.getCss_attribAccess().getAlternatives_2_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3938:1: ( rule__Css_attrib__Alternatives_2_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3938:2: rule__Css_attrib__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__Css_attrib__Alternatives_2_0_in_rule__Css_attrib__Group_2__0__Impl8166);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3948:1: rule__Css_attrib__Group_2__1 : rule__Css_attrib__Group_2__1__Impl ;
    public final void rule__Css_attrib__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3952:1: ( rule__Css_attrib__Group_2__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3953:2: rule__Css_attrib__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_attrib__Group_2__1__Impl_in_rule__Css_attrib__Group_2__18196);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3959:1: rule__Css_attrib__Group_2__1__Impl : ( ( rule__Css_attrib__Alternatives_2_1 ) ) ;
    public final void rule__Css_attrib__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3963:1: ( ( ( rule__Css_attrib__Alternatives_2_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3964:1: ( ( rule__Css_attrib__Alternatives_2_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3964:1: ( ( rule__Css_attrib__Alternatives_2_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3965:1: ( rule__Css_attrib__Alternatives_2_1 )
            {
             before(grammarAccess.getCss_attribAccess().getAlternatives_2_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3966:1: ( rule__Css_attrib__Alternatives_2_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3966:2: rule__Css_attrib__Alternatives_2_1
            {
            pushFollow(FOLLOW_rule__Css_attrib__Alternatives_2_1_in_rule__Css_attrib__Group_2__1__Impl8223);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3980:1: rule__Css_generic_declaration__Group__0 : rule__Css_generic_declaration__Group__0__Impl rule__Css_generic_declaration__Group__1 ;
    public final void rule__Css_generic_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3984:1: ( rule__Css_generic_declaration__Group__0__Impl rule__Css_generic_declaration__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3985:2: rule__Css_generic_declaration__Group__0__Impl rule__Css_generic_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__0__Impl_in_rule__Css_generic_declaration__Group__08257);
            rule__Css_generic_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__1_in_rule__Css_generic_declaration__Group__08260);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3992:1: rule__Css_generic_declaration__Group__0__Impl : ( ( rule__Css_generic_declaration__PropertyAssignment_0 ) ) ;
    public final void rule__Css_generic_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3996:1: ( ( ( rule__Css_generic_declaration__PropertyAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3997:1: ( ( rule__Css_generic_declaration__PropertyAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3997:1: ( ( rule__Css_generic_declaration__PropertyAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3998:1: ( rule__Css_generic_declaration__PropertyAssignment_0 )
            {
             before(grammarAccess.getCss_generic_declarationAccess().getPropertyAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3999:1: ( rule__Css_generic_declaration__PropertyAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:3999:2: rule__Css_generic_declaration__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__PropertyAssignment_0_in_rule__Css_generic_declaration__Group__0__Impl8287);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4009:1: rule__Css_generic_declaration__Group__1 : rule__Css_generic_declaration__Group__1__Impl rule__Css_generic_declaration__Group__2 ;
    public final void rule__Css_generic_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4013:1: ( rule__Css_generic_declaration__Group__1__Impl rule__Css_generic_declaration__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4014:2: rule__Css_generic_declaration__Group__1__Impl rule__Css_generic_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__1__Impl_in_rule__Css_generic_declaration__Group__18317);
            rule__Css_generic_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__2_in_rule__Css_generic_declaration__Group__18320);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4021:1: rule__Css_generic_declaration__Group__1__Impl : ( ':' ) ;
    public final void rule__Css_generic_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4025:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4026:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4026:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4027:1: ':'
            {
             before(grammarAccess.getCss_generic_declarationAccess().getColonKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__Css_generic_declaration__Group__1__Impl8348); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4040:1: rule__Css_generic_declaration__Group__2 : rule__Css_generic_declaration__Group__2__Impl rule__Css_generic_declaration__Group__3 ;
    public final void rule__Css_generic_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4044:1: ( rule__Css_generic_declaration__Group__2__Impl rule__Css_generic_declaration__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4045:2: rule__Css_generic_declaration__Group__2__Impl rule__Css_generic_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__2__Impl_in_rule__Css_generic_declaration__Group__28379);
            rule__Css_generic_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__3_in_rule__Css_generic_declaration__Group__28382);
            rule__Css_generic_declaration__Group__3();

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4052:1: rule__Css_generic_declaration__Group__2__Impl : ( ( rule__Css_generic_declaration__ExpressionAssignment_2 ) ) ;
    public final void rule__Css_generic_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4056:1: ( ( ( rule__Css_generic_declaration__ExpressionAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4057:1: ( ( rule__Css_generic_declaration__ExpressionAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4057:1: ( ( rule__Css_generic_declaration__ExpressionAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4058:1: ( rule__Css_generic_declaration__ExpressionAssignment_2 )
            {
             before(grammarAccess.getCss_generic_declarationAccess().getExpressionAssignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4059:1: ( rule__Css_generic_declaration__ExpressionAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4059:2: rule__Css_generic_declaration__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__ExpressionAssignment_2_in_rule__Css_generic_declaration__Group__2__Impl8409);
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


    // $ANTLR start "rule__Css_generic_declaration__Group__3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4069:1: rule__Css_generic_declaration__Group__3 : rule__Css_generic_declaration__Group__3__Impl ;
    public final void rule__Css_generic_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4073:1: ( rule__Css_generic_declaration__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4074:2: rule__Css_generic_declaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Css_generic_declaration__Group__3__Impl_in_rule__Css_generic_declaration__Group__38439);
            rule__Css_generic_declaration__Group__3__Impl();

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
    // $ANTLR end "rule__Css_generic_declaration__Group__3"


    // $ANTLR start "rule__Css_generic_declaration__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4080:1: rule__Css_generic_declaration__Group__3__Impl : ( ( rule__Css_generic_declaration__PrioAssignment_3 )? ) ;
    public final void rule__Css_generic_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4084:1: ( ( ( rule__Css_generic_declaration__PrioAssignment_3 )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4085:1: ( ( rule__Css_generic_declaration__PrioAssignment_3 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4085:1: ( ( rule__Css_generic_declaration__PrioAssignment_3 )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4086:1: ( rule__Css_generic_declaration__PrioAssignment_3 )?
            {
             before(grammarAccess.getCss_generic_declarationAccess().getPrioAssignment_3()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4087:1: ( rule__Css_generic_declaration__PrioAssignment_3 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==14) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4087:2: rule__Css_generic_declaration__PrioAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Css_generic_declaration__PrioAssignment_3_in_rule__Css_generic_declaration__Group__3__Impl8466);
                    rule__Css_generic_declaration__PrioAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCss_generic_declarationAccess().getPrioAssignment_3()); 

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
    // $ANTLR end "rule__Css_generic_declaration__Group__3__Impl"


    // $ANTLR start "rule__Css_property__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4105:1: rule__Css_property__Group__0 : rule__Css_property__Group__0__Impl rule__Css_property__Group__1 ;
    public final void rule__Css_property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4109:1: ( rule__Css_property__Group__0__Impl rule__Css_property__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4110:2: rule__Css_property__Group__0__Impl rule__Css_property__Group__1
            {
            pushFollow(FOLLOW_rule__Css_property__Group__0__Impl_in_rule__Css_property__Group__08505);
            rule__Css_property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_property__Group__1_in_rule__Css_property__Group__08508);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4117:1: rule__Css_property__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Css_property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4121:1: ( ( ( '-' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4122:1: ( ( '-' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4122:1: ( ( '-' )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4123:1: ( '-' )?
            {
             before(grammarAccess.getCss_propertyAccess().getHyphenMinusKeyword_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4124:1: ( '-' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==28) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4125:2: '-'
                    {
                    match(input,28,FOLLOW_28_in_rule__Css_property__Group__0__Impl8537); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4136:1: rule__Css_property__Group__1 : rule__Css_property__Group__1__Impl ;
    public final void rule__Css_property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4140:1: ( rule__Css_property__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4141:2: rule__Css_property__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_property__Group__1__Impl_in_rule__Css_property__Group__18570);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4147:1: rule__Css_property__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Css_property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4151:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4152:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4152:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4153:1: RULE_IDENT
            {
             before(grammarAccess.getCss_propertyAccess().getIDENTTerminalRuleCall_1()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_property__Group__1__Impl8597); 
             after(grammarAccess.getCss_propertyAccess().getIDENTTerminalRuleCall_1()); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4168:1: rule__Css_pseudo__Group__0 : rule__Css_pseudo__Group__0__Impl rule__Css_pseudo__Group__1 ;
    public final void rule__Css_pseudo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4172:1: ( rule__Css_pseudo__Group__0__Impl rule__Css_pseudo__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4173:2: rule__Css_pseudo__Group__0__Impl rule__Css_pseudo__Group__1
            {
            pushFollow(FOLLOW_rule__Css_pseudo__Group__0__Impl_in_rule__Css_pseudo__Group__08630);
            rule__Css_pseudo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Css_pseudo__Group__1_in_rule__Css_pseudo__Group__08633);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4180:1: rule__Css_pseudo__Group__0__Impl : ( ':' ) ;
    public final void rule__Css_pseudo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4184:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4185:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4185:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4186:1: ':'
            {
             before(grammarAccess.getCss_pseudoAccess().getColonKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Css_pseudo__Group__0__Impl8661); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4199:1: rule__Css_pseudo__Group__1 : rule__Css_pseudo__Group__1__Impl ;
    public final void rule__Css_pseudo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4203:1: ( rule__Css_pseudo__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4204:2: rule__Css_pseudo__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Css_pseudo__Group__1__Impl_in_rule__Css_pseudo__Group__18692);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4210:1: rule__Css_pseudo__Group__1__Impl : ( RULE_IDENT ) ;
    public final void rule__Css_pseudo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4214:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4215:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4215:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4216:1: RULE_IDENT
            {
             before(grammarAccess.getCss_pseudoAccess().getIDENTTerminalRuleCall_1()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Css_pseudo__Group__1__Impl8719); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4231:1: rule__Combinator__Group__0 : rule__Combinator__Group__0__Impl rule__Combinator__Group__1 ;
    public final void rule__Combinator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4235:1: ( rule__Combinator__Group__0__Impl rule__Combinator__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4236:2: rule__Combinator__Group__0__Impl rule__Combinator__Group__1
            {
            pushFollow(FOLLOW_rule__Combinator__Group__0__Impl_in_rule__Combinator__Group__08752);
            rule__Combinator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Combinator__Group__1_in_rule__Combinator__Group__08755);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4243:1: rule__Combinator__Group__0__Impl : ( ( rule__Combinator__Alternatives_0 ) ) ;
    public final void rule__Combinator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4247:1: ( ( ( rule__Combinator__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4248:1: ( ( rule__Combinator__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4248:1: ( ( rule__Combinator__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4249:1: ( rule__Combinator__Alternatives_0 )
            {
             before(grammarAccess.getCombinatorAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4250:1: ( rule__Combinator__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4250:2: rule__Combinator__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Combinator__Alternatives_0_in_rule__Combinator__Group__0__Impl8782);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4260:1: rule__Combinator__Group__1 : rule__Combinator__Group__1__Impl ;
    public final void rule__Combinator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4264:1: ( rule__Combinator__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4265:2: rule__Combinator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Combinator__Group__1__Impl_in_rule__Combinator__Group__18812);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4271:1: rule__Combinator__Group__1__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Combinator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4275:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4276:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4276:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4277:1: ( RULE_WS )*
            {
             before(grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4278:1: ( RULE_WS )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_WS) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4278:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Combinator__Group__1__Impl8840); 

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4292:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4296:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4297:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
            {
            pushFollow(FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__08875);
            rule__Expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__08878);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4304:1: rule__Expr__Group__0__Impl : ( ( rule__Expr__TermGroupsAssignment_0 ) ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4308:1: ( ( ( rule__Expr__TermGroupsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4309:1: ( ( rule__Expr__TermGroupsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4309:1: ( ( rule__Expr__TermGroupsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4310:1: ( rule__Expr__TermGroupsAssignment_0 )
            {
             before(grammarAccess.getExprAccess().getTermGroupsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4311:1: ( rule__Expr__TermGroupsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4311:2: rule__Expr__TermGroupsAssignment_0
            {
            pushFollow(FOLLOW_rule__Expr__TermGroupsAssignment_0_in_rule__Expr__Group__0__Impl8905);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4321:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4325:1: ( rule__Expr__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4326:2: rule__Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__18935);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4332:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__Group_1__0 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4336:1: ( ( ( rule__Expr__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4337:1: ( ( rule__Expr__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4337:1: ( ( rule__Expr__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4338:1: ( rule__Expr__Group_1__0 )*
            {
             before(grammarAccess.getExprAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4339:1: ( rule__Expr__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_COMMA||LA50_0==27) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4339:2: rule__Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl8962);
            	    rule__Expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4353:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4357:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4358:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__08997);
            rule__Expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__09000);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4365:1: rule__Expr__Group_1__0__Impl : ( ruleoperator ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4369:1: ( ( ruleoperator ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4370:1: ( ruleoperator )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4370:1: ( ruleoperator )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4371:1: ruleoperator
            {
             before(grammarAccess.getExprAccess().getOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleoperator_in_rule__Expr__Group_1__0__Impl9027);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4382:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4386:1: ( rule__Expr__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4387:2: rule__Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__19056);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4393:1: rule__Expr__Group_1__1__Impl : ( ( rule__Expr__TermGroupsAssignment_1_1 ) ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4397:1: ( ( ( rule__Expr__TermGroupsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4398:1: ( ( rule__Expr__TermGroupsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4398:1: ( ( rule__Expr__TermGroupsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4399:1: ( rule__Expr__TermGroupsAssignment_1_1 )
            {
             before(grammarAccess.getExprAccess().getTermGroupsAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4400:1: ( rule__Expr__TermGroupsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4400:2: rule__Expr__TermGroupsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expr__TermGroupsAssignment_1_1_in_rule__Expr__Group_1__1__Impl9083);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4414:1: rule__NumberTerm__Group__0 : rule__NumberTerm__Group__0__Impl rule__NumberTerm__Group__1 ;
    public final void rule__NumberTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4418:1: ( rule__NumberTerm__Group__0__Impl rule__NumberTerm__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4419:2: rule__NumberTerm__Group__0__Impl rule__NumberTerm__Group__1
            {
            pushFollow(FOLLOW_rule__NumberTerm__Group__0__Impl_in_rule__NumberTerm__Group__09117);
            rule__NumberTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberTerm__Group__1_in_rule__NumberTerm__Group__09120);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4426:1: rule__NumberTerm__Group__0__Impl : ( ( ruleunary_operator )? ) ;
    public final void rule__NumberTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4430:1: ( ( ( ruleunary_operator )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4431:1: ( ( ruleunary_operator )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4431:1: ( ( ruleunary_operator )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4432:1: ( ruleunary_operator )?
            {
             before(grammarAccess.getNumberTermAccess().getUnary_operatorParserRuleCall_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4433:1: ( ruleunary_operator )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==25||LA51_0==28) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4433:3: ruleunary_operator
                    {
                    pushFollow(FOLLOW_ruleunary_operator_in_rule__NumberTerm__Group__0__Impl9148);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4443:1: rule__NumberTerm__Group__1 : rule__NumberTerm__Group__1__Impl ;
    public final void rule__NumberTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4447:1: ( rule__NumberTerm__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4448:2: rule__NumberTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberTerm__Group__1__Impl_in_rule__NumberTerm__Group__19179);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4454:1: rule__NumberTerm__Group__1__Impl : ( ( rule__NumberTerm__Alternatives_1 ) ) ;
    public final void rule__NumberTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4458:1: ( ( ( rule__NumberTerm__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4459:1: ( ( rule__NumberTerm__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4459:1: ( ( rule__NumberTerm__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4460:1: ( rule__NumberTerm__Alternatives_1 )
            {
             before(grammarAccess.getNumberTermAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4461:1: ( rule__NumberTerm__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4461:2: rule__NumberTerm__Alternatives_1
            {
            pushFollow(FOLLOW_rule__NumberTerm__Alternatives_1_in_rule__NumberTerm__Group__1__Impl9206);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4475:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4479:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4480:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__09240);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__09243);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4487:1: rule__Function__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4491:1: ( ( ( '-' )? ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4492:1: ( ( '-' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4492:1: ( ( '-' )? )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4493:1: ( '-' )?
            {
             before(grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4494:1: ( '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==28) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4495:2: '-'
                    {
                    match(input,28,FOLLOW_28_in_rule__Function__Group__0__Impl9272); 

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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4506:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4510:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4511:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__19305);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__19308);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4518:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4522:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4523:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4523:1: ( ( rule__Function__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4524:1: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4525:1: ( rule__Function__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4525:2: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl9335);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4535:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4539:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4540:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__29365);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__29368);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4547:1: rule__Function__Group__2__Impl : ( '(' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4551:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4552:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4552:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4553:1: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,51,FOLLOW_51_in_rule__Function__Group__2__Impl9396); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4566:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4570:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4571:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__39427);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__39430);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4578:1: rule__Function__Group__3__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4582:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4583:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4583:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4584:1: ( RULE_WS )*
            {
             before(grammarAccess.getFunctionAccess().getWSTerminalRuleCall_3()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4585:1: ( RULE_WS )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_WS) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4585:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Function__Group__3__Impl9458); 

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4595:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4599:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4600:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__49489);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__49492);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4607:1: rule__Function__Group__4__Impl : ( ( rule__Function__ExpressionAssignment_4 ) ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4611:1: ( ( ( rule__Function__ExpressionAssignment_4 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4612:1: ( ( rule__Function__ExpressionAssignment_4 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4612:1: ( ( rule__Function__ExpressionAssignment_4 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4613:1: ( rule__Function__ExpressionAssignment_4 )
            {
             before(grammarAccess.getFunctionAccess().getExpressionAssignment_4()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4614:1: ( rule__Function__ExpressionAssignment_4 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4614:2: rule__Function__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_rule__Function__ExpressionAssignment_4_in_rule__Function__Group__4__Impl9519);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4624:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4628:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4629:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__59549);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Function__Group__6_in_rule__Function__Group__59552);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4636:1: rule__Function__Group__5__Impl : ( ( RULE_WS )* ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4640:1: ( ( ( RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4641:1: ( ( RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4641:1: ( ( RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4642:1: ( RULE_WS )*
            {
             before(grammarAccess.getFunctionAccess().getWSTerminalRuleCall_5()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4643:1: ( RULE_WS )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_WS) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4643:3: RULE_WS
            	    {
            	    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Function__Group__5__Impl9580); 

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4653:1: rule__Function__Group__6 : rule__Function__Group__6__Impl ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4657:1: ( rule__Function__Group__6__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4658:2: rule__Function__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__69611);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4664:1: rule__Function__Group__6__Impl : ( ')' ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4668:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4669:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4669:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4670:1: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6()); 
            match(input,52,FOLLOW_52_in_rule__Function__Group__6__Impl9639); 
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


    // $ANTLR start "rule__URLType__Group__0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4697:1: rule__URLType__Group__0 : rule__URLType__Group__0__Impl rule__URLType__Group__1 ;
    public final void rule__URLType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4701:1: ( rule__URLType__Group__0__Impl rule__URLType__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4702:2: rule__URLType__Group__0__Impl rule__URLType__Group__1
            {
            pushFollow(FOLLOW_rule__URLType__Group__0__Impl_in_rule__URLType__Group__09684);
            rule__URLType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URLType__Group__1_in_rule__URLType__Group__09687);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4709:1: rule__URLType__Group__0__Impl : ( 'url' ) ;
    public final void rule__URLType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4713:1: ( ( 'url' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4714:1: ( 'url' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4714:1: ( 'url' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4715:1: 'url'
            {
             before(grammarAccess.getURLTypeAccess().getUrlKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__URLType__Group__0__Impl9715); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4728:1: rule__URLType__Group__1 : rule__URLType__Group__1__Impl rule__URLType__Group__2 ;
    public final void rule__URLType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4732:1: ( rule__URLType__Group__1__Impl rule__URLType__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4733:2: rule__URLType__Group__1__Impl rule__URLType__Group__2
            {
            pushFollow(FOLLOW_rule__URLType__Group__1__Impl_in_rule__URLType__Group__19746);
            rule__URLType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URLType__Group__2_in_rule__URLType__Group__19749);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4740:1: rule__URLType__Group__1__Impl : ( '(' ) ;
    public final void rule__URLType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4744:1: ( ( '(' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4745:1: ( '(' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4745:1: ( '(' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4746:1: '('
            {
             before(grammarAccess.getURLTypeAccess().getLeftParenthesisKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__URLType__Group__1__Impl9777); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4759:1: rule__URLType__Group__2 : rule__URLType__Group__2__Impl rule__URLType__Group__3 ;
    public final void rule__URLType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4763:1: ( rule__URLType__Group__2__Impl rule__URLType__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4764:2: rule__URLType__Group__2__Impl rule__URLType__Group__3
            {
            pushFollow(FOLLOW_rule__URLType__Group__2__Impl_in_rule__URLType__Group__29808);
            rule__URLType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URLType__Group__3_in_rule__URLType__Group__29811);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4771:1: rule__URLType__Group__2__Impl : ( ( rule__URLType__UrlAssignment_2 ) ) ;
    public final void rule__URLType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4775:1: ( ( ( rule__URLType__UrlAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4776:1: ( ( rule__URLType__UrlAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4776:1: ( ( rule__URLType__UrlAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4777:1: ( rule__URLType__UrlAssignment_2 )
            {
             before(grammarAccess.getURLTypeAccess().getUrlAssignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4778:1: ( rule__URLType__UrlAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4778:2: rule__URLType__UrlAssignment_2
            {
            pushFollow(FOLLOW_rule__URLType__UrlAssignment_2_in_rule__URLType__Group__2__Impl9838);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4788:1: rule__URLType__Group__3 : rule__URLType__Group__3__Impl ;
    public final void rule__URLType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4792:1: ( rule__URLType__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4793:2: rule__URLType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__URLType__Group__3__Impl_in_rule__URLType__Group__39868);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4799:1: rule__URLType__Group__3__Impl : ( ')' ) ;
    public final void rule__URLType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4803:1: ( ( ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4804:1: ( ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4804:1: ( ')' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4805:1: ')'
            {
             before(grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_3()); 
            match(input,52,FOLLOW_52_in_rule__URLType__Group__3__Impl9896); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4826:1: rule__PERCENTAGE__Group__0 : rule__PERCENTAGE__Group__0__Impl rule__PERCENTAGE__Group__1 ;
    public final void rule__PERCENTAGE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4830:1: ( rule__PERCENTAGE__Group__0__Impl rule__PERCENTAGE__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4831:2: rule__PERCENTAGE__Group__0__Impl rule__PERCENTAGE__Group__1
            {
            pushFollow(FOLLOW_rule__PERCENTAGE__Group__0__Impl_in_rule__PERCENTAGE__Group__09935);
            rule__PERCENTAGE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PERCENTAGE__Group__1_in_rule__PERCENTAGE__Group__09938);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4838:1: rule__PERCENTAGE__Group__0__Impl : ( rulenum ) ;
    public final void rule__PERCENTAGE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4842:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4843:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4843:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4844:1: rulenum
            {
             before(grammarAccess.getPERCENTAGEAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__PERCENTAGE__Group__0__Impl9965);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4855:1: rule__PERCENTAGE__Group__1 : rule__PERCENTAGE__Group__1__Impl ;
    public final void rule__PERCENTAGE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4859:1: ( rule__PERCENTAGE__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4860:2: rule__PERCENTAGE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PERCENTAGE__Group__1__Impl_in_rule__PERCENTAGE__Group__19994);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4866:1: rule__PERCENTAGE__Group__1__Impl : ( '%' ) ;
    public final void rule__PERCENTAGE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4870:1: ( ( '%' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4871:1: ( '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4871:1: ( '%' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4872:1: '%'
            {
             before(grammarAccess.getPERCENTAGEAccess().getPercentSignKeyword_1()); 
            match(input,54,FOLLOW_54_in_rule__PERCENTAGE__Group__1__Impl10022); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4889:1: rule__EMS__Group__0 : rule__EMS__Group__0__Impl rule__EMS__Group__1 ;
    public final void rule__EMS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4893:1: ( rule__EMS__Group__0__Impl rule__EMS__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4894:2: rule__EMS__Group__0__Impl rule__EMS__Group__1
            {
            pushFollow(FOLLOW_rule__EMS__Group__0__Impl_in_rule__EMS__Group__010057);
            rule__EMS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EMS__Group__1_in_rule__EMS__Group__010060);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4901:1: rule__EMS__Group__0__Impl : ( rulenum ) ;
    public final void rule__EMS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4905:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4906:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4906:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4907:1: rulenum
            {
             before(grammarAccess.getEMSAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__EMS__Group__0__Impl10087);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4918:1: rule__EMS__Group__1 : rule__EMS__Group__1__Impl ;
    public final void rule__EMS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4922:1: ( rule__EMS__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4923:2: rule__EMS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EMS__Group__1__Impl_in_rule__EMS__Group__110116);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4929:1: rule__EMS__Group__1__Impl : ( 'em' ) ;
    public final void rule__EMS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4933:1: ( ( 'em' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4934:1: ( 'em' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4934:1: ( 'em' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4935:1: 'em'
            {
             before(grammarAccess.getEMSAccess().getEmKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__EMS__Group__1__Impl10144); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4952:1: rule__EXS__Group__0 : rule__EXS__Group__0__Impl rule__EXS__Group__1 ;
    public final void rule__EXS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4956:1: ( rule__EXS__Group__0__Impl rule__EXS__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4957:2: rule__EXS__Group__0__Impl rule__EXS__Group__1
            {
            pushFollow(FOLLOW_rule__EXS__Group__0__Impl_in_rule__EXS__Group__010179);
            rule__EXS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EXS__Group__1_in_rule__EXS__Group__010182);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4964:1: rule__EXS__Group__0__Impl : ( rulenum ) ;
    public final void rule__EXS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4968:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4969:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4969:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4970:1: rulenum
            {
             before(grammarAccess.getEXSAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__EXS__Group__0__Impl10209);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4981:1: rule__EXS__Group__1 : rule__EXS__Group__1__Impl ;
    public final void rule__EXS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4985:1: ( rule__EXS__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4986:2: rule__EXS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EXS__Group__1__Impl_in_rule__EXS__Group__110238);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4992:1: rule__EXS__Group__1__Impl : ( 'ex' ) ;
    public final void rule__EXS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4996:1: ( ( 'ex' ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4997:1: ( 'ex' )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4997:1: ( 'ex' )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:4998:1: 'ex'
            {
             before(grammarAccess.getEXSAccess().getExKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__EXS__Group__1__Impl10266); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5015:1: rule__LENGTH__Group__0 : rule__LENGTH__Group__0__Impl rule__LENGTH__Group__1 ;
    public final void rule__LENGTH__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5019:1: ( rule__LENGTH__Group__0__Impl rule__LENGTH__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5020:2: rule__LENGTH__Group__0__Impl rule__LENGTH__Group__1
            {
            pushFollow(FOLLOW_rule__LENGTH__Group__0__Impl_in_rule__LENGTH__Group__010301);
            rule__LENGTH__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LENGTH__Group__1_in_rule__LENGTH__Group__010304);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5027:1: rule__LENGTH__Group__0__Impl : ( rulenum ) ;
    public final void rule__LENGTH__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5031:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5032:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5032:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5033:1: rulenum
            {
             before(grammarAccess.getLENGTHAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__LENGTH__Group__0__Impl10331);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5044:1: rule__LENGTH__Group__1 : rule__LENGTH__Group__1__Impl ;
    public final void rule__LENGTH__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5048:1: ( rule__LENGTH__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5049:2: rule__LENGTH__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LENGTH__Group__1__Impl_in_rule__LENGTH__Group__110360);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5055:1: rule__LENGTH__Group__1__Impl : ( ( rule__LENGTH__Alternatives_1 ) ) ;
    public final void rule__LENGTH__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5059:1: ( ( ( rule__LENGTH__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5060:1: ( ( rule__LENGTH__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5060:1: ( ( rule__LENGTH__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5061:1: ( rule__LENGTH__Alternatives_1 )
            {
             before(grammarAccess.getLENGTHAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5062:1: ( rule__LENGTH__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5062:2: rule__LENGTH__Alternatives_1
            {
            pushFollow(FOLLOW_rule__LENGTH__Alternatives_1_in_rule__LENGTH__Group__1__Impl10387);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5076:1: rule__ANGLE__Group__0 : rule__ANGLE__Group__0__Impl rule__ANGLE__Group__1 ;
    public final void rule__ANGLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5080:1: ( rule__ANGLE__Group__0__Impl rule__ANGLE__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5081:2: rule__ANGLE__Group__0__Impl rule__ANGLE__Group__1
            {
            pushFollow(FOLLOW_rule__ANGLE__Group__0__Impl_in_rule__ANGLE__Group__010421);
            rule__ANGLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ANGLE__Group__1_in_rule__ANGLE__Group__010424);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5088:1: rule__ANGLE__Group__0__Impl : ( rulenum ) ;
    public final void rule__ANGLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5092:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5093:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5093:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5094:1: rulenum
            {
             before(grammarAccess.getANGLEAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__ANGLE__Group__0__Impl10451);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5105:1: rule__ANGLE__Group__1 : rule__ANGLE__Group__1__Impl ;
    public final void rule__ANGLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5109:1: ( rule__ANGLE__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5110:2: rule__ANGLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ANGLE__Group__1__Impl_in_rule__ANGLE__Group__110480);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5116:1: rule__ANGLE__Group__1__Impl : ( ( rule__ANGLE__Alternatives_1 ) ) ;
    public final void rule__ANGLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5120:1: ( ( ( rule__ANGLE__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5121:1: ( ( rule__ANGLE__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5121:1: ( ( rule__ANGLE__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5122:1: ( rule__ANGLE__Alternatives_1 )
            {
             before(grammarAccess.getANGLEAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5123:1: ( rule__ANGLE__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5123:2: rule__ANGLE__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ANGLE__Alternatives_1_in_rule__ANGLE__Group__1__Impl10507);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5137:1: rule__TIME__Group__0 : rule__TIME__Group__0__Impl rule__TIME__Group__1 ;
    public final void rule__TIME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5141:1: ( rule__TIME__Group__0__Impl rule__TIME__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5142:2: rule__TIME__Group__0__Impl rule__TIME__Group__1
            {
            pushFollow(FOLLOW_rule__TIME__Group__0__Impl_in_rule__TIME__Group__010541);
            rule__TIME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TIME__Group__1_in_rule__TIME__Group__010544);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5149:1: rule__TIME__Group__0__Impl : ( rulenum ) ;
    public final void rule__TIME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5153:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5154:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5154:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5155:1: rulenum
            {
             before(grammarAccess.getTIMEAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__TIME__Group__0__Impl10571);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5166:1: rule__TIME__Group__1 : rule__TIME__Group__1__Impl ;
    public final void rule__TIME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5170:1: ( rule__TIME__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5171:2: rule__TIME__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TIME__Group__1__Impl_in_rule__TIME__Group__110600);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5177:1: rule__TIME__Group__1__Impl : ( ( rule__TIME__Alternatives_1 ) ) ;
    public final void rule__TIME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5181:1: ( ( ( rule__TIME__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5182:1: ( ( rule__TIME__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5182:1: ( ( rule__TIME__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5183:1: ( rule__TIME__Alternatives_1 )
            {
             before(grammarAccess.getTIMEAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5184:1: ( rule__TIME__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5184:2: rule__TIME__Alternatives_1
            {
            pushFollow(FOLLOW_rule__TIME__Alternatives_1_in_rule__TIME__Group__1__Impl10627);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5198:1: rule__FREQ__Group__0 : rule__FREQ__Group__0__Impl rule__FREQ__Group__1 ;
    public final void rule__FREQ__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5202:1: ( rule__FREQ__Group__0__Impl rule__FREQ__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5203:2: rule__FREQ__Group__0__Impl rule__FREQ__Group__1
            {
            pushFollow(FOLLOW_rule__FREQ__Group__0__Impl_in_rule__FREQ__Group__010661);
            rule__FREQ__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FREQ__Group__1_in_rule__FREQ__Group__010664);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5210:1: rule__FREQ__Group__0__Impl : ( rulenum ) ;
    public final void rule__FREQ__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5214:1: ( ( rulenum ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5215:1: ( rulenum )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5215:1: ( rulenum )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5216:1: rulenum
            {
             before(grammarAccess.getFREQAccess().getNumParserRuleCall_0()); 
            pushFollow(FOLLOW_rulenum_in_rule__FREQ__Group__0__Impl10691);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5227:1: rule__FREQ__Group__1 : rule__FREQ__Group__1__Impl ;
    public final void rule__FREQ__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5231:1: ( rule__FREQ__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5232:2: rule__FREQ__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FREQ__Group__1__Impl_in_rule__FREQ__Group__110720);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5238:1: rule__FREQ__Group__1__Impl : ( ( rule__FREQ__Alternatives_1 ) ) ;
    public final void rule__FREQ__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5242:1: ( ( ( rule__FREQ__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5243:1: ( ( rule__FREQ__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5243:1: ( ( rule__FREQ__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5244:1: ( rule__FREQ__Alternatives_1 )
            {
             before(grammarAccess.getFREQAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5245:1: ( rule__FREQ__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5245:2: rule__FREQ__Alternatives_1
            {
            pushFollow(FOLLOW_rule__FREQ__Alternatives_1_in_rule__FREQ__Group__1__Impl10747);
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


    // $ANTLR start "rule__Stylesheet__CharsetAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5260:1: rule__Stylesheet__CharsetAssignment_0 : ( rulecharset ) ;
    public final void rule__Stylesheet__CharsetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5264:1: ( ( rulecharset ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5265:1: ( rulecharset )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5265:1: ( rulecharset )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5266:1: rulecharset
            {
             before(grammarAccess.getStylesheetAccess().getCharsetCharsetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecharset_in_rule__Stylesheet__CharsetAssignment_010786);
            rulecharset();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getCharsetCharsetParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Stylesheet__CharsetAssignment_0"


    // $ANTLR start "rule__Stylesheet__ImportsAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5275:1: rule__Stylesheet__ImportsAssignment_1 : ( ruleimportExpression ) ;
    public final void rule__Stylesheet__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5279:1: ( ( ruleimportExpression ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5280:1: ( ruleimportExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5280:1: ( ruleimportExpression )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5281:1: ruleimportExpression
            {
             before(grammarAccess.getStylesheetAccess().getImportsImportExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleimportExpression_in_rule__Stylesheet__ImportsAssignment_110817);
            ruleimportExpression();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getImportsImportExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Stylesheet__ImportsAssignment_1"


    // $ANTLR start "rule__Stylesheet__RulesetAssignment_2_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5290:1: rule__Stylesheet__RulesetAssignment_2_0 : ( ruleruleset ) ;
    public final void rule__Stylesheet__RulesetAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5294:1: ( ( ruleruleset ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5295:1: ( ruleruleset )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5295:1: ( ruleruleset )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5296:1: ruleruleset
            {
             before(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleruleset_in_rule__Stylesheet__RulesetAssignment_2_010848);
            ruleruleset();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Stylesheet__RulesetAssignment_2_0"


    // $ANTLR start "rule__Stylesheet__MediaAssignment_2_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5305:1: rule__Stylesheet__MediaAssignment_2_1 : ( rulemedia ) ;
    public final void rule__Stylesheet__MediaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5309:1: ( ( rulemedia ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5310:1: ( rulemedia )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5310:1: ( rulemedia )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5311:1: rulemedia
            {
             before(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulemedia_in_rule__Stylesheet__MediaAssignment_2_110879);
            rulemedia();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Stylesheet__MediaAssignment_2_1"


    // $ANTLR start "rule__Stylesheet__PageAssignment_2_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5320:1: rule__Stylesheet__PageAssignment_2_2 : ( rulepage ) ;
    public final void rule__Stylesheet__PageAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5324:1: ( ( rulepage ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5325:1: ( rulepage )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5325:1: ( rulepage )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5326:1: rulepage
            {
             before(grammarAccess.getStylesheetAccess().getPagePageParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_rulepage_in_rule__Stylesheet__PageAssignment_2_210910);
            rulepage();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getPagePageParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Stylesheet__PageAssignment_2_2"


    // $ANTLR start "rule__Charset__CharsetAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5335:1: rule__Charset__CharsetAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Charset__CharsetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5339:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5340:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5340:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5341:1: RULE_STRING
            {
             before(grammarAccess.getCharsetAccess().getCharsetSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Charset__CharsetAssignment_110941); 
             after(grammarAccess.getCharsetAccess().getCharsetSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Charset__CharsetAssignment_1"


    // $ANTLR start "rule__ImportExpression__ValueAssignment_0_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5350:1: rule__ImportExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__ImportExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5354:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5355:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5355:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5356:1: RULE_STRING
            {
             before(grammarAccess.getImportExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImportExpression__ValueAssignment_0_110972); 
             after(grammarAccess.getImportExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__ImportExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__ImportExpression__MediaListAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5365:1: rule__ImportExpression__MediaListAssignment_1_1 : ( rulemedia_list ) ;
    public final void rule__ImportExpression__MediaListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5369:1: ( ( rulemedia_list ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5370:1: ( rulemedia_list )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5370:1: ( rulemedia_list )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5371:1: rulemedia_list
            {
             before(grammarAccess.getImportExpressionAccess().getMediaListMedia_listParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulemedia_list_in_rule__ImportExpression__MediaListAssignment_1_111003);
            rulemedia_list();

            state._fsp--;

             after(grammarAccess.getImportExpressionAccess().getMediaListMedia_listParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ImportExpression__MediaListAssignment_1_1"


    // $ANTLR start "rule__Page__PseudoPageAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5380:1: rule__Page__PseudoPageAssignment_2 : ( rulepseudo_page ) ;
    public final void rule__Page__PseudoPageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5384:1: ( ( rulepseudo_page ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5385:1: ( rulepseudo_page )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5385:1: ( rulepseudo_page )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5386:1: rulepseudo_page
            {
             before(grammarAccess.getPageAccess().getPseudoPagePseudo_pageParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulepseudo_page_in_rule__Page__PseudoPageAssignment_211034);
            rulepseudo_page();

            state._fsp--;

             after(grammarAccess.getPageAccess().getPseudoPagePseudo_pageParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Page__PseudoPageAssignment_2"


    // $ANTLR start "rule__Page__DeclarationsAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5395:1: rule__Page__DeclarationsAssignment_4 : ( rulecss_generic_declaration ) ;
    public final void rule__Page__DeclarationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5399:1: ( ( rulecss_generic_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5400:1: ( rulecss_generic_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5400:1: ( rulecss_generic_declaration )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5401:1: rulecss_generic_declaration
            {
             before(grammarAccess.getPageAccess().getDeclarationsCss_generic_declarationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulecss_generic_declaration_in_rule__Page__DeclarationsAssignment_411065);
            rulecss_generic_declaration();

            state._fsp--;

             after(grammarAccess.getPageAccess().getDeclarationsCss_generic_declarationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Page__DeclarationsAssignment_4"


    // $ANTLR start "rule__Page__DeclarationsAssignment_5_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5410:1: rule__Page__DeclarationsAssignment_5_1 : ( rulecss_generic_declaration ) ;
    public final void rule__Page__DeclarationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5414:1: ( ( rulecss_generic_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5415:1: ( rulecss_generic_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5415:1: ( rulecss_generic_declaration )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5416:1: rulecss_generic_declaration
            {
             before(grammarAccess.getPageAccess().getDeclarationsCss_generic_declarationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_rulecss_generic_declaration_in_rule__Page__DeclarationsAssignment_5_111096);
            rulecss_generic_declaration();

            state._fsp--;

             after(grammarAccess.getPageAccess().getDeclarationsCss_generic_declarationParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Page__DeclarationsAssignment_5_1"


    // $ANTLR start "rule__Media__MedialistAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5425:1: rule__Media__MedialistAssignment_1 : ( rulemedia_list ) ;
    public final void rule__Media__MedialistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5429:1: ( ( rulemedia_list ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5430:1: ( rulemedia_list )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5430:1: ( rulemedia_list )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5431:1: rulemedia_list
            {
             before(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulemedia_list_in_rule__Media__MedialistAssignment_111127);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5440:1: rule__Media__RulesetsAssignment_3 : ( ruleruleset ) ;
    public final void rule__Media__RulesetsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5444:1: ( ( ruleruleset ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5445:1: ( ruleruleset )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5445:1: ( ruleruleset )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5446:1: ruleruleset
            {
             before(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleruleset_in_rule__Media__RulesetsAssignment_311158);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5455:1: rule__Ruleset__SelectorsAssignment_0 : ( ruleselector ) ;
    public final void rule__Ruleset__SelectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5459:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5460:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5460:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5461:1: ruleselector
            {
             before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_011189);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5470:1: rule__Ruleset__SelectorsAssignment_1_1 : ( ruleselector ) ;
    public final void rule__Ruleset__SelectorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5474:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5475:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5475:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5476:1: ruleselector
            {
             before(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_1_111220);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5485:1: rule__Ruleset__DeclarationsAssignment_3_0 : ( rulecss_declaration ) ;
    public final void rule__Ruleset__DeclarationsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5489:1: ( ( rulecss_declaration ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5490:1: ( rulecss_declaration )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5490:1: ( rulecss_declaration )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5491:1: rulecss_declaration
            {
             before(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_rulecss_declaration_in_rule__Ruleset__DeclarationsAssignment_3_011251);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5500:1: rule__Selector__SimpleselectorsAssignment_0 : ( rulesimple_selector ) ;
    public final void rule__Selector__SimpleselectorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5504:1: ( ( rulesimple_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5505:1: ( rulesimple_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5505:1: ( rulesimple_selector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5506:1: rulesimple_selector
            {
             before(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulesimple_selector_in_rule__Selector__SimpleselectorsAssignment_011282);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5515:1: rule__Selector__CombinatorAssignment_1_0_0 : ( rulecombinator ) ;
    public final void rule__Selector__CombinatorAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5519:1: ( ( rulecombinator ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5520:1: ( rulecombinator )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5520:1: ( rulecombinator )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5521:1: rulecombinator
            {
             before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_0_011313);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5530:1: rule__Selector__SelectorAssignment_1_0_1 : ( ruleselector ) ;
    public final void rule__Selector__SelectorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5534:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5535:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5535:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5536:1: ruleselector
            {
             before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_0_111344);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5545:1: rule__Selector__CombinatorAssignment_1_1_1_0 : ( rulecombinator ) ;
    public final void rule__Selector__CombinatorAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5549:1: ( ( rulecombinator ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5550:1: ( rulecombinator )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5550:1: ( rulecombinator )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5551:1: rulecombinator
            {
             before(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 
            pushFollow(FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_1_1_011375);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5560:1: rule__Selector__SelectorAssignment_1_1_1_1 : ( ruleselector ) ;
    public final void rule__Selector__SelectorAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5564:1: ( ( ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5565:1: ( ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5565:1: ( ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5566:1: ruleselector
            {
             before(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_1_1_111406);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5575:1: rule__Simple_selector__ElementAssignment_0_0 : ( ruleelement_name ) ;
    public final void rule__Simple_selector__ElementAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5579:1: ( ( ruleelement_name ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5580:1: ( ruleelement_name )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5580:1: ( ruleelement_name )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5581:1: ruleelement_name
            {
             before(grammarAccess.getSimple_selectorAccess().getElementElement_nameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleelement_name_in_rule__Simple_selector__ElementAssignment_0_011437);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5590:1: rule__Simple_selector__SubSelectorsAssignment_0_1 : ( rulesub_selector ) ;
    public final void rule__Simple_selector__SubSelectorsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5594:1: ( ( rulesub_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5595:1: ( rulesub_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5595:1: ( rulesub_selector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5596:1: rulesub_selector
            {
             before(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulesub_selector_in_rule__Simple_selector__SubSelectorsAssignment_0_111468);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5605:1: rule__Simple_selector__SubSelectorsAssignment_1 : ( rulesub_selector ) ;
    public final void rule__Simple_selector__SubSelectorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5609:1: ( ( rulesub_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5610:1: ( rulesub_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5610:1: ( rulesub_selector )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5611:1: rulesub_selector
            {
             before(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulesub_selector_in_rule__Simple_selector__SubSelectorsAssignment_111499);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5620:1: rule__Sub_selector__IdAssignment_0 : ( rulecss_id ) ;
    public final void rule__Sub_selector__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5624:1: ( ( rulecss_id ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5625:1: ( rulecss_id )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5625:1: ( rulecss_id )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5626:1: rulecss_id
            {
             before(grammarAccess.getSub_selectorAccess().getIdCss_idParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecss_id_in_rule__Sub_selector__IdAssignment_011530);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5635:1: rule__Sub_selector__ClassAssignment_1 : ( rulecss_class ) ;
    public final void rule__Sub_selector__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5639:1: ( ( rulecss_class ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5640:1: ( rulecss_class )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5640:1: ( rulecss_class )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5641:1: rulecss_class
            {
             before(grammarAccess.getSub_selectorAccess().getClassCss_classParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulecss_class_in_rule__Sub_selector__ClassAssignment_111561);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5650:1: rule__Sub_selector__AttribAssignment_2 : ( rulecss_attrib ) ;
    public final void rule__Sub_selector__AttribAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5654:1: ( ( rulecss_attrib ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5655:1: ( rulecss_attrib )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5655:1: ( rulecss_attrib )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5656:1: rulecss_attrib
            {
             before(grammarAccess.getSub_selectorAccess().getAttribCss_attribParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulecss_attrib_in_rule__Sub_selector__AttribAssignment_211592);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5665:1: rule__Sub_selector__PseudoclassAssignment_3 : ( rulecss_pseudo ) ;
    public final void rule__Sub_selector__PseudoclassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5669:1: ( ( rulecss_pseudo ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5670:1: ( rulecss_pseudo )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5670:1: ( rulecss_pseudo )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5671:1: rulecss_pseudo
            {
             before(grammarAccess.getSub_selectorAccess().getPseudoclassCss_pseudoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulecss_pseudo_in_rule__Sub_selector__PseudoclassAssignment_311623);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5680:1: rule__Css_generic_declaration__PropertyAssignment_0 : ( rulecss_property ) ;
    public final void rule__Css_generic_declaration__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5684:1: ( ( rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5685:1: ( rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5685:1: ( rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5686:1: rulecss_property
            {
             before(grammarAccess.getCss_generic_declarationAccess().getPropertyCss_propertyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecss_property_in_rule__Css_generic_declaration__PropertyAssignment_011654);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5695:1: rule__Css_generic_declaration__ExpressionAssignment_2 : ( ruleexpr ) ;
    public final void rule__Css_generic_declaration__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5699:1: ( ( ruleexpr ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5700:1: ( ruleexpr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5700:1: ( ruleexpr )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5701:1: ruleexpr
            {
             before(grammarAccess.getCss_generic_declarationAccess().getExpressionExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleexpr_in_rule__Css_generic_declaration__ExpressionAssignment_211685);
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


    // $ANTLR start "rule__Css_generic_declaration__PrioAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5710:1: rule__Css_generic_declaration__PrioAssignment_3 : ( rulecss_prio ) ;
    public final void rule__Css_generic_declaration__PrioAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5714:1: ( ( rulecss_prio ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5715:1: ( rulecss_prio )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5715:1: ( rulecss_prio )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5716:1: rulecss_prio
            {
             before(grammarAccess.getCss_generic_declarationAccess().getPrioCss_prioParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulecss_prio_in_rule__Css_generic_declaration__PrioAssignment_311716);
            rulecss_prio();

            state._fsp--;

             after(grammarAccess.getCss_generic_declarationAccess().getPrioCss_prioParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Css_generic_declaration__PrioAssignment_3"


    // $ANTLR start "rule__Expr__TermGroupsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5725:1: rule__Expr__TermGroupsAssignment_0 : ( ruletermGroup ) ;
    public final void rule__Expr__TermGroupsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5729:1: ( ( ruletermGroup ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5730:1: ( ruletermGroup )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5730:1: ( ruletermGroup )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5731:1: ruletermGroup
            {
             before(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruletermGroup_in_rule__Expr__TermGroupsAssignment_011747);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5740:1: rule__Expr__TermGroupsAssignment_1_1 : ( ruletermGroup ) ;
    public final void rule__Expr__TermGroupsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5744:1: ( ( ruletermGroup ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5745:1: ( ruletermGroup )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5745:1: ( ruletermGroup )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5746:1: ruletermGroup
            {
             before(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruletermGroup_in_rule__Expr__TermGroupsAssignment_1_111778);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5755:1: rule__TermGroup__TermsAssignment : ( ruleterm ) ;
    public final void rule__TermGroup__TermsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5759:1: ( ( ruleterm ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5760:1: ( ruleterm )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5760:1: ( ruleterm )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5761:1: ruleterm
            {
             before(grammarAccess.getTermGroupAccess().getTermsTermParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleterm_in_rule__TermGroup__TermsAssignment11809);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5770:1: rule__Term__NumberAssignment_0 : ( rulenumberTerm ) ;
    public final void rule__Term__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5774:1: ( ( rulenumberTerm ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5775:1: ( rulenumberTerm )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5775:1: ( rulenumberTerm )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5776:1: rulenumberTerm
            {
             before(grammarAccess.getTermAccess().getNumberNumberTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulenumberTerm_in_rule__Term__NumberAssignment_011840);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5785:1: rule__Term__StringValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Term__StringValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5789:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5790:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5790:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5791:1: RULE_STRING
            {
             before(grammarAccess.getTermAccess().getStringValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Term__StringValueAssignment_111871); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5800:1: rule__Term__IdentifierAssignment_2 : ( rulecss_property ) ;
    public final void rule__Term__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5804:1: ( ( rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5805:1: ( rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5805:1: ( rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5806:1: rulecss_property
            {
             before(grammarAccess.getTermAccess().getIdentifierCss_propertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulecss_property_in_rule__Term__IdentifierAssignment_211902);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5815:1: rule__Term__UrlAssignment_3 : ( ruleURLType ) ;
    public final void rule__Term__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5819:1: ( ( ruleURLType ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5820:1: ( ruleURLType )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5820:1: ( ruleURLType )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5821:1: ruleURLType
            {
             before(grammarAccess.getTermAccess().getUrlURLTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleURLType_in_rule__Term__UrlAssignment_311933);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5830:1: rule__Term__FunctionAssignment_4 : ( rulefunction ) ;
    public final void rule__Term__FunctionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5834:1: ( ( rulefunction ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5835:1: ( rulefunction )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5835:1: ( rulefunction )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5836:1: rulefunction
            {
             before(grammarAccess.getTermAccess().getFunctionFunctionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulefunction_in_rule__Term__FunctionAssignment_411964);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5845:1: rule__Term__HexColorAssignment_5 : ( ruleHexColor ) ;
    public final void rule__Term__HexColorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5849:1: ( ( ruleHexColor ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5850:1: ( ruleHexColor )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5850:1: ( ruleHexColor )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5851:1: ruleHexColor
            {
             before(grammarAccess.getTermAccess().getHexColorHexColorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleHexColor_in_rule__Term__HexColorAssignment_511995);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5860:1: rule__Function__NameAssignment_1 : ( RULE_IDENT ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5864:1: ( ( RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5865:1: ( RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5865:1: ( RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5866:1: RULE_IDENT
            {
             before(grammarAccess.getFunctionAccess().getNameIDENTTerminalRuleCall_1_0()); 
            match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rule__Function__NameAssignment_112026); 
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5875:1: rule__Function__ExpressionAssignment_4 : ( ruleexpr ) ;
    public final void rule__Function__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5879:1: ( ( ruleexpr ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5880:1: ( ruleexpr )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5880:1: ( ruleexpr )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5881:1: ruleexpr
            {
             before(grammarAccess.getFunctionAccess().getExpressionExprParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleexpr_in_rule__Function__ExpressionAssignment_412057);
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
    // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5890:1: rule__URLType__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__URLType__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5894:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5895:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5895:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css.ui/src-gen/at/bestsolution/efxclipse/tooling/css/ui/contentassist/antlr/internal/InternalCssDsl.g:5896:1: RULE_STRING
            {
             before(grammarAccess.getURLTypeAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__URLType__UrlAssignment_212088); 
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


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\13\uffff";
    static final String DFA22_eofS =
        "\1\uffff\2\4\10\uffff";
    static final String DFA22_minS =
        "\1\12\2\4\10\uffff";
    static final String DFA22_maxS =
        "\1\13\2\66\10\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\10\1\1\1\5\1\3\1\7\1\6\1\2\1\4";
    static final String DFA22_specialS =
        "\13\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\2",
            "\2\4\2\uffff\5\4\1\uffff\1\4\12\uffff\1\4\1\uffff\2\4\6\6"+
            "\3\10\2\7\2\3\1\12\1\5\1\4\1\uffff\1\4\5\uffff\2\4\1\11",
            "\2\4\2\uffff\5\4\1\uffff\1\4\12\uffff\1\4\1\uffff\2\4\6\6"+
            "\3\10\2\7\2\3\1\12\1\5\1\4\1\uffff\1\4\5\uffff\2\4\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1810:1: rule__NumberTerm__Alternatives_1 : ( ( ruleNUMBER ) | ( rulePERCENTAGE ) | ( ruleLENGTH ) | ( ruleEMS ) | ( ruleEXS ) | ( ruleANGLE ) | ( ruleTIME ) | ( ruleFREQ ) );";
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__0_in_rulestylesheet94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharset_in_entryRulecharset121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecharset128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__0_in_rulecharset154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportExpression_in_entryRuleimportExpression181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimportExpression188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Alternatives_in_ruleimportExpression214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepage_in_entryRulepage241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepage248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0_in_rulepage274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_page_in_entryRulepseudo_page301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepseudo_page308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo_page__Group__0_in_rulepseudo_page334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_in_entryRulemedia361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__0_in_rulemedia394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_entryRulemedia_list421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia_list428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group__0_in_rulemedia_list454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_entryRulemedium481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedium488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulemedium514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_entryRuleruleset540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleset547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__0_in_ruleruleset573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0_in_ruleselector642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Alternatives_in_rulesimple_selector702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_entryRuleelement_name729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement_name736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element_name__Alternatives_in_ruleelement_name762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_entryRulesub_selector789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesub_selector796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__Alternatives_in_rulesub_selector822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_entryRulecss_class849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_class856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_class__Group__0_in_rulecss_class882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_entryRulecss_id909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_id916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulecss_id942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_entryRulecss_attrib968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_attrib975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__0_in_rulecss_attrib1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_entryRulecss_declaration1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_declaration1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_rulecss_declaration1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_entryRulecss_generic_declaration1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_generic_declaration1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__0_in_rulecss_generic_declaration1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_prio_in_entryRulecss_prio1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_prio1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIMPORTANT_SYM_in_rulecss_prio1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_entryRulecss_property1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_property1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__Group__0_in_rulecss_property1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_pseudo1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__0_in_rulecss_pseudo1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Group__0_in_rulecombinator1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoperator_in_entryRuleoperator1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoperator1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleoperator1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary_operator__Alternatives_in_ruleunary_operator1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr1511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0_in_ruleexpr1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_entryRuletermGroup1575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermGroup1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermGroup__TermsAssignment_in_ruletermGroup1610 = new BitSet(new long[]{0x0020000012000D32L});
    public static final BitSet FOLLOW_rule__TermGroup__TermsAssignment_in_ruletermGroup1622 = new BitSet(new long[]{0x0020000012000D32L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm1652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleterm1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_entryRulenumberTerm1717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumberTerm1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTerm__Group__0_in_rulenumberTerm1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_entryRulenum1781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenum1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Num__Alternatives_in_rulenum1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction1846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_rulefunction1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_entryRuleHexColor1915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexColor1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleHexColor1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_entryRuleURLType1983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLType1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__0_in_ruleURLType2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER2047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleNUMBER2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE2106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePERCENTAGE2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__0_in_rulePERCENTAGE2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_entryRuleEMS2166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMS2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMS__Group__0_in_ruleEMS2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_entryRuleEXS2226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXS2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXS__Group__0_in_ruleEXS2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_entryRuleLENGTH2291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLENGTH2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__0_in_ruleLENGTH2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_entryRuleANGLE2355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANGLE2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__0_in_ruleANGLE2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_entryRuleTIME2415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTIME2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Group__0_in_ruleTIME2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_entryRuleFREQ2475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFREQ2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Group__0_in_ruleFREQ2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIMPORTANT_SYM_in_entryRuleIMPORTANT_SYM2535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIMPORTANT_SYM2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleIMPORTANT_SYM2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_entryRuleReservedWords2597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReservedWords2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReservedWords__Alternatives_in_ruleReservedWords2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__RulesetAssignment_2_0_in_rule__Stylesheet__Alternatives_22666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__MediaAssignment_2_1_in_rule__Stylesheet__Alternatives_22684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__PageAssignment_2_2_in_rule__Stylesheet__Alternatives_22702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Charset__Alternatives_02736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Charset__Alternatives_02756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_0__0_in_rule__ImportExpression__Alternatives2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__0_in_rule__ImportExpression__Alternatives2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ImportExpression__Alternatives_0_02842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ImportExpression__Alternatives_0_02862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Page__Alternatives_12897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Page__Alternatives_12917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Media__Alternatives_02952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Media__Alternatives_02972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__0_in_rule__Selector__Alternatives_13006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__0_in_rule__Selector__Alternatives_13024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__0_in_rule__Simple_selector__Alternatives3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives3077 = new BitSet(new long[]{0x0003800000000022L});
    public static final BitSet FOLLOW_rule__Simple_selector__SubSelectorsAssignment_1_in_rule__Simple_selector__Alternatives3089 = new BitSet(new long[]{0x0003800000000022L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Element_name__Alternatives3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rule__Element_name__Alternatives3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Element_name__Alternatives3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__IdAssignment_0_in_rule__Sub_selector__Alternatives3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__ClassAssignment_1_in_rule__Sub_selector__Alternatives3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__AttribAssignment_2_in_rule__Sub_selector__Alternatives3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub_selector__PseudoclassAssignment_3_in_rule__Sub_selector__Alternatives3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_class__Alternatives_13281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rule__Css_class__Alternatives_13298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_attrib__Alternatives_13330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rule__Css_attrib__Alternatives_13347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Css_attrib__Alternatives_2_03380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDES_in_rule__Css_attrib__Alternatives_2_03399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASHMATCH_in_rule__Css_attrib__Alternatives_2_03416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Alternatives_2_1_0_in_rule__Css_attrib__Alternatives_2_13448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Css_attrib__Alternatives_2_13466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_attrib__Alternatives_2_1_03498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rule__Css_attrib__Alternatives_2_1_03515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Combinator__Alternatives_03548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Combinator__Alternatives_03568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Operator__Alternatives3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Operator__Alternatives3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Unary_operator__Alternatives3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Unary_operator__Alternatives3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__NumberAssignment_0_in_rule__Term__Alternatives3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__StringValueAssignment_1_in_rule__Term__Alternatives3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__IdentifierAssignment_2_in_rule__Term__Alternatives3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__UrlAssignment_3_in_rule__Term__Alternatives3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__FunctionAssignment_4_in_rule__Term__Alternatives3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__HexColorAssignment_5_in_rule__Term__Alternatives3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__NumberTerm__Alternatives_13832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_rule__NumberTerm__Alternatives_13849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_rule__NumberTerm__Alternatives_13866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_rule__NumberTerm__Alternatives_13883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_rule__NumberTerm__Alternatives_13900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_rule__NumberTerm__Alternatives_13917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_rule__NumberTerm__Alternatives_13934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_rule__NumberTerm__Alternatives_13951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__Num__Alternatives3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Num__Alternatives4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__LENGTH__Alternatives_14033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__LENGTH__Alternatives_14053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LENGTH__Alternatives_14073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__LENGTH__Alternatives_14093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__LENGTH__Alternatives_14113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__LENGTH__Alternatives_14133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ANGLE__Alternatives_14168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ANGLE__Alternatives_14188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ANGLE__Alternatives_14208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__TIME__Alternatives_14243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TIME__Alternatives_14263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FREQ__Alternatives_14298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__FREQ__Alternatives_14318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ReservedWords__Alternatives4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ReservedWords__Alternatives4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ReservedWords__Alternatives4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ReservedWords__Alternatives4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ReservedWords__Alternatives4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ReservedWords__Alternatives4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ReservedWords__Alternatives4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ReservedWords__Alternatives4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ReservedWords__Alternatives4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ReservedWords__Alternatives4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ReservedWords__Alternatives4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ReservedWords__Alternatives4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ReservedWords__Alternatives4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ReservedWords__Alternatives4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ReservedWords__Alternatives4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__0__Impl_in_rule__Stylesheet__Group__04665 = new BitSet(new long[]{0x00238FFFE0FE0030L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__1_in_rule__Stylesheet__Group__04668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__CharsetAssignment_0_in_rule__Stylesheet__Group__0__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__1__Impl_in_rule__Stylesheet__Group__14726 = new BitSet(new long[]{0x00238FFFE0FE0030L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__2_in_rule__Stylesheet__Group__14729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__ImportsAssignment_1_in_rule__Stylesheet__Group__1__Impl4756 = new BitSet(new long[]{0x0020000000060002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Group__2__Impl_in_rule__Stylesheet__Group__24787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stylesheet__Alternatives_2_in_rule__Stylesheet__Group__2__Impl4814 = new BitSet(new long[]{0x00038FFFE0F80032L});
    public static final BitSet FOLLOW_rule__Charset__Group__0__Impl_in_rule__Charset__Group__04851 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Charset__Group__1_in_rule__Charset__Group__04854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Alternatives_0_in_rule__Charset__Group__0__Impl4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__1__Impl_in_rule__Charset__Group__14911 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Charset__Group__2_in_rule__Charset__Group__14914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__CharsetAssignment_1_in_rule__Charset__Group__1__Impl4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Charset__Group__2__Impl_in_rule__Charset__Group__24971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Charset__Group__2__Impl4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_0__0__Impl_in_rule__ImportExpression__Group_0__05036 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_0__1_in_rule__ImportExpression__Group_0__05039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Alternatives_0_0_in_rule__ImportExpression__Group_0__0__Impl5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_0__1__Impl_in_rule__ImportExpression__Group_0__15096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__ValueAssignment_0_1_in_rule__ImportExpression__Group_0__1__Impl5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__0__Impl_in_rule__ImportExpression__Group_1__05157 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__1_in_rule__ImportExpression__Group_1__05160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_rule__ImportExpression__Group_1__0__Impl5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__1__Impl_in_rule__ImportExpression__Group_1__15216 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__2_in_rule__ImportExpression__Group_1__15219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__MediaListAssignment_1_1_in_rule__ImportExpression__Group_1__1__Impl5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportExpression__Group_1__2__Impl_in_rule__ImportExpression__Group_1__25277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ImportExpression__Group_1__2__Impl5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__05342 = new BitSet(new long[]{0x00038FFFE0F80030L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__05345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__15403 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__15406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Alternatives_1_in_rule__Page__Group__1__Impl5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__25463 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__25466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__PseudoPageAssignment_2_in_rule__Page__Group__2__Impl5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__35524 = new BitSet(new long[]{0x0000500010000010L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__35527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Page__Group__3__Impl5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__45586 = new BitSet(new long[]{0x0000500010000010L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__45589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__DeclarationsAssignment_4_in_rule__Page__Group__4__Impl5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__55647 = new BitSet(new long[]{0x0000500010000010L});
    public static final BitSet FOLLOW_rule__Page__Group__6_in_rule__Page__Group__55650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0_in_rule__Page__Group__5__Impl5677 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__65708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Page__Group__6__Impl5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__0__Impl_in_rule__Page__Group_5__05781 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1_in_rule__Page__Group_5__05784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Page__Group_5__0__Impl5812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_5__1__Impl_in_rule__Page__Group_5__15843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__DeclarationsAssignment_5_1_in_rule__Page__Group_5__1__Impl5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo_page__Group__0__Impl_in_rule__Pseudo_page__Group__05905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pseudo_page__Group__1_in_rule__Pseudo_page__Group__05908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Pseudo_page__Group__0__Impl5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pseudo_page__Group__1__Impl_in_rule__Pseudo_page__Group__15967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Pseudo_page__Group__1__Impl5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__0__Impl_in_rule__Media__Group__06027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Media__Group__1_in_rule__Media__Group__06030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Alternatives_0_in_rule__Media__Group__0__Impl6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__1__Impl_in_rule__Media__Group__16087 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Media__Group__2_in_rule__Media__Group__16090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__MedialistAssignment_1_in_rule__Media__Group__1__Impl6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__2__Impl_in_rule__Media__Group__26147 = new BitSet(new long[]{0x0003CFFFE0800030L});
    public static final BitSet FOLLOW_rule__Media__Group__3_in_rule__Media__Group__26150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Media__Group__2__Impl6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__Group__3__Impl_in_rule__Media__Group__36209 = new BitSet(new long[]{0x0003CFFFE0800030L});
    public static final BitSet FOLLOW_rule__Media__Group__4_in_rule__Media__Group__36212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media__RulesetsAssignment_3_in_rule__Media__Group__3__Impl6239 = new BitSet(new long[]{0x00038FFFE0800032L});
    public static final BitSet FOLLOW_rule__Media__Group__4__Impl_in_rule__Media__Group__46270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Media__Group__4__Impl6298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group__0__Impl_in_rule__Media_list__Group__06339 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Media_list__Group__1_in_rule__Media_list__Group__06342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rule__Media_list__Group__0__Impl6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group__1__Impl_in_rule__Media_list__Group__16398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__0_in_rule__Media_list__Group__1__Impl6425 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__0__Impl_in_rule__Media_list__Group_1__06460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__1_in_rule__Media_list__Group_1__06463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Media_list__Group_1__0__Impl6490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Media_list__Group_1__1__Impl_in_rule__Media_list__Group_1__16519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rule__Media_list__Group_1__1__Impl6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__0__Impl_in_rule__Ruleset__Group__06579 = new BitSet(new long[]{0x0000200000000200L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__1_in_rule__Ruleset__Group__06582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__SelectorsAssignment_0_in_rule__Ruleset__Group__0__Impl6609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__1__Impl_in_rule__Ruleset__Group__16639 = new BitSet(new long[]{0x0000200000000200L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__2_in_rule__Ruleset__Group__16642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__0_in_rule__Ruleset__Group__1__Impl6669 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__2__Impl_in_rule__Ruleset__Group__26700 = new BitSet(new long[]{0x0000400010000010L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__3_in_rule__Ruleset__Group__26703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Ruleset__Group__2__Impl6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__3__Impl_in_rule__Ruleset__Group__36762 = new BitSet(new long[]{0x0000400010000010L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__4_in_rule__Ruleset__Group__36765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_3__0_in_rule__Ruleset__Group__3__Impl6792 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_rule__Ruleset__Group__4__Impl_in_rule__Ruleset__Group__46823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Ruleset__Group__4__Impl6851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__0__Impl_in_rule__Ruleset__Group_1__06892 = new BitSet(new long[]{0x00038FFFE0800030L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__1_in_rule__Ruleset__Group_1__06895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Ruleset__Group_1__0__Impl6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_1__1__Impl_in_rule__Ruleset__Group_1__16951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__SelectorsAssignment_1_1_in_rule__Ruleset__Group_1__1__Impl6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_3__0__Impl_in_rule__Ruleset__Group_3__07012 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_3__1_in_rule__Ruleset__Group_3__07015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__DeclarationsAssignment_3_0_in_rule__Ruleset__Group_3__0__Impl7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ruleset__Group_3__1__Impl_in_rule__Ruleset__Group_3__17072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Ruleset__Group_3__1__Impl7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__0__Impl_in_rule__Selector__Group__07135 = new BitSet(new long[]{0x0000000006001000L});
    public static final BitSet FOLLOW_rule__Selector__Group__1_in_rule__Selector__Group__07138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SimpleselectorsAssignment_0_in_rule__Selector__Group__0__Impl7165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group__1__Impl_in_rule__Selector__Group__17195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Alternatives_1_in_rule__Selector__Group__1__Impl7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__0__Impl_in_rule__Selector__Group_1_0__07257 = new BitSet(new long[]{0x00038FFFE0800030L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__1_in_rule__Selector__Group_1_0__07260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__CombinatorAssignment_1_0_0_in_rule__Selector__Group_1_0__0__Impl7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_0__1__Impl_in_rule__Selector__Group_1_0__17317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SelectorAssignment_1_0_1_in_rule__Selector__Group_1_0__1__Impl7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__0__Impl_in_rule__Selector__Group_1_1__07378 = new BitSet(new long[]{0x00038FFFE6800030L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__1_in_rule__Selector__Group_1_1__07381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl7411 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Selector__Group_1_1__0__Impl7424 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1__1__Impl_in_rule__Selector__Group_1_1__17457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__0_in_rule__Selector__Group_1_1__1__Impl7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__0__Impl_in_rule__Selector__Group_1_1_1__07519 = new BitSet(new long[]{0x00038FFFE6800030L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__1_in_rule__Selector__Group_1_1_1__07522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__CombinatorAssignment_1_1_1_0_in_rule__Selector__Group_1_1_1__0__Impl7549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__Group_1_1_1__1__Impl_in_rule__Selector__Group_1_1_1__17580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selector__SelectorAssignment_1_1_1_1_in_rule__Selector__Group_1_1_1__1__Impl7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__0__Impl_in_rule__Simple_selector__Group_0__07641 = new BitSet(new long[]{0x0003800000000020L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__1_in_rule__Simple_selector__Group_0__07644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__ElementAssignment_0_0_in_rule__Simple_selector__Group_0__0__Impl7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__Group_0__1__Impl_in_rule__Simple_selector__Group_0__17701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simple_selector__SubSelectorsAssignment_0_1_in_rule__Simple_selector__Group_0__1__Impl7728 = new BitSet(new long[]{0x0003800000000022L});
    public static final BitSet FOLLOW_rule__Css_class__Group__0__Impl_in_rule__Css_class__Group__07763 = new BitSet(new long[]{0x00000FFFE0000010L});
    public static final BitSet FOLLOW_rule__Css_class__Group__1_in_rule__Css_class__Group__07766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Css_class__Group__0__Impl7794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_class__Group__1__Impl_in_rule__Css_class__Group__17825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_class__Alternatives_1_in_rule__Css_class__Group__1__Impl7852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__0__Impl_in_rule__Css_attrib__Group__07886 = new BitSet(new long[]{0x00000FFFE0000010L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__1_in_rule__Css_attrib__Group__07889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Css_attrib__Group__0__Impl7917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__1__Impl_in_rule__Css_attrib__Group__17948 = new BitSet(new long[]{0x00040000010000C0L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__2_in_rule__Css_attrib__Group__17951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Alternatives_1_in_rule__Css_attrib__Group__1__Impl7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__2__Impl_in_rule__Css_attrib__Group__28008 = new BitSet(new long[]{0x00040000010000C0L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__3_in_rule__Css_attrib__Group__28011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group_2__0_in_rule__Css_attrib__Group__2__Impl8038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group__3__Impl_in_rule__Css_attrib__Group__38069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Css_attrib__Group__3__Impl8097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group_2__0__Impl_in_rule__Css_attrib__Group_2__08136 = new BitSet(new long[]{0x00000FFFE0000110L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group_2__1_in_rule__Css_attrib__Group_2__08139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Alternatives_2_0_in_rule__Css_attrib__Group_2__0__Impl8166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Group_2__1__Impl_in_rule__Css_attrib__Group_2__18196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_attrib__Alternatives_2_1_in_rule__Css_attrib__Group_2__1__Impl8223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__0__Impl_in_rule__Css_generic_declaration__Group__08257 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__1_in_rule__Css_generic_declaration__Group__08260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__PropertyAssignment_0_in_rule__Css_generic_declaration__Group__0__Impl8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__1__Impl_in_rule__Css_generic_declaration__Group__18317 = new BitSet(new long[]{0x0020000012000D30L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__2_in_rule__Css_generic_declaration__Group__18320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Css_generic_declaration__Group__1__Impl8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__2__Impl_in_rule__Css_generic_declaration__Group__28379 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__3_in_rule__Css_generic_declaration__Group__28382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__ExpressionAssignment_2_in_rule__Css_generic_declaration__Group__2__Impl8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__Group__3__Impl_in_rule__Css_generic_declaration__Group__38439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_generic_declaration__PrioAssignment_3_in_rule__Css_generic_declaration__Group__3__Impl8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__Group__0__Impl_in_rule__Css_property__Group__08505 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Css_property__Group__1_in_rule__Css_property__Group__08508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Css_property__Group__0__Impl8537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_property__Group__1__Impl_in_rule__Css_property__Group__18570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_property__Group__1__Impl8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__0__Impl_in_rule__Css_pseudo__Group__08630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__1_in_rule__Css_pseudo__Group__08633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Css_pseudo__Group__0__Impl8661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Css_pseudo__Group__1__Impl_in_rule__Css_pseudo__Group__18692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Css_pseudo__Group__1__Impl8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Group__0__Impl_in_rule__Combinator__Group__08752 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Combinator__Group__1_in_rule__Combinator__Group__08755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Alternatives_0_in_rule__Combinator__Group__0__Impl8782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Combinator__Group__1__Impl_in_rule__Combinator__Group__18812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Combinator__Group__1__Impl8840 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__08875 = new BitSet(new long[]{0x0000000008000200L});
    public static final BitSet FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__08878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__TermGroupsAssignment_0_in_rule__Expr__Group__0__Impl8905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__18935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl8962 = new BitSet(new long[]{0x0000000008000202L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__08997 = new BitSet(new long[]{0x0020000012000D30L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__09000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoperator_in_rule__Expr__Group_1__0__Impl9027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__19056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__TermGroupsAssignment_1_1_in_rule__Expr__Group_1__1__Impl9083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTerm__Group__0__Impl_in_rule__NumberTerm__Group__09117 = new BitSet(new long[]{0x0000000012000C00L});
    public static final BitSet FOLLOW_rule__NumberTerm__Group__1_in_rule__NumberTerm__Group__09120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_rule__NumberTerm__Group__0__Impl9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTerm__Group__1__Impl_in_rule__NumberTerm__Group__19179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberTerm__Alternatives_1_in_rule__NumberTerm__Group__1__Impl9206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__09240 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__09243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Function__Group__0__Impl9272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__19305 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__19308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NameAssignment_1_in_rule__Function__Group__1__Impl9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__29365 = new BitSet(new long[]{0x0020000012001D30L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__29368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Function__Group__2__Impl9396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__39427 = new BitSet(new long[]{0x0020000012001D30L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__39430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Function__Group__3__Impl9458 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__49489 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__49492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__ExpressionAssignment_4_in_rule__Function__Group__4__Impl9519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__59549 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_rule__Function__Group__6_in_rule__Function__Group__59552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Function__Group__5__Impl9580 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Function__Group__6__Impl_in_rule__Function__Group__69611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Function__Group__6__Impl9639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__0__Impl_in_rule__URLType__Group__09684 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__URLType__Group__1_in_rule__URLType__Group__09687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__URLType__Group__0__Impl9715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__1__Impl_in_rule__URLType__Group__19746 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__URLType__Group__2_in_rule__URLType__Group__19749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__URLType__Group__1__Impl9777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__2__Impl_in_rule__URLType__Group__29808 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__URLType__Group__3_in_rule__URLType__Group__29811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__UrlAssignment_2_in_rule__URLType__Group__2__Impl9838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URLType__Group__3__Impl_in_rule__URLType__Group__39868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__URLType__Group__3__Impl9896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__0__Impl_in_rule__PERCENTAGE__Group__09935 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__1_in_rule__PERCENTAGE__Group__09938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__PERCENTAGE__Group__0__Impl9965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PERCENTAGE__Group__1__Impl_in_rule__PERCENTAGE__Group__19994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__PERCENTAGE__Group__1__Impl10022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMS__Group__0__Impl_in_rule__EMS__Group__010057 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EMS__Group__1_in_rule__EMS__Group__010060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__EMS__Group__0__Impl10087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EMS__Group__1__Impl_in_rule__EMS__Group__110116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EMS__Group__1__Impl10144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXS__Group__0__Impl_in_rule__EXS__Group__010179 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__EXS__Group__1_in_rule__EXS__Group__010182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__EXS__Group__0__Impl10209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXS__Group__1__Impl_in_rule__EXS__Group__110238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EXS__Group__1__Impl10266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__0__Impl_in_rule__LENGTH__Group__010301 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__1_in_rule__LENGTH__Group__010304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__LENGTH__Group__0__Impl10331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Group__1__Impl_in_rule__LENGTH__Group__110360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LENGTH__Alternatives_1_in_rule__LENGTH__Group__1__Impl10387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__0__Impl_in_rule__ANGLE__Group__010421 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__1_in_rule__ANGLE__Group__010424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__ANGLE__Group__0__Impl10451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Group__1__Impl_in_rule__ANGLE__Group__110480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANGLE__Alternatives_1_in_rule__ANGLE__Group__1__Impl10507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Group__0__Impl_in_rule__TIME__Group__010541 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__TIME__Group__1_in_rule__TIME__Group__010544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__TIME__Group__0__Impl10571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Group__1__Impl_in_rule__TIME__Group__110600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TIME__Alternatives_1_in_rule__TIME__Group__1__Impl10627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Group__0__Impl_in_rule__FREQ__Group__010661 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__FREQ__Group__1_in_rule__FREQ__Group__010664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rule__FREQ__Group__0__Impl10691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Group__1__Impl_in_rule__FREQ__Group__110720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FREQ__Alternatives_1_in_rule__FREQ__Group__1__Impl10747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharset_in_rule__Stylesheet__CharsetAssignment_010786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportExpression_in_rule__Stylesheet__ImportsAssignment_110817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_rule__Stylesheet__RulesetAssignment_2_010848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_in_rule__Stylesheet__MediaAssignment_2_110879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepage_in_rule__Stylesheet__PageAssignment_2_210910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Charset__CharsetAssignment_110941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImportExpression__ValueAssignment_0_110972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_rule__ImportExpression__MediaListAssignment_1_111003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_page_in_rule__Page__PseudoPageAssignment_211034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_rule__Page__DeclarationsAssignment_411065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_rule__Page__DeclarationsAssignment_5_111096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_rule__Media__MedialistAssignment_111127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_rule__Media__RulesetsAssignment_311158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_011189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Ruleset__SelectorsAssignment_1_111220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_rule__Ruleset__DeclarationsAssignment_3_011251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_rule__Selector__SimpleselectorsAssignment_011282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_0_011313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_0_111344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_rule__Selector__CombinatorAssignment_1_1_1_011375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_rule__Selector__SelectorAssignment_1_1_1_111406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_rule__Simple_selector__ElementAssignment_0_011437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_rule__Simple_selector__SubSelectorsAssignment_0_111468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_rule__Simple_selector__SubSelectorsAssignment_111499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_rule__Sub_selector__IdAssignment_011530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_rule__Sub_selector__ClassAssignment_111561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_rule__Sub_selector__AttribAssignment_211592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_rule__Sub_selector__PseudoclassAssignment_311623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_rule__Css_generic_declaration__PropertyAssignment_011654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Css_generic_declaration__ExpressionAssignment_211685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_prio_in_rule__Css_generic_declaration__PrioAssignment_311716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_rule__Expr__TermGroupsAssignment_011747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_rule__Expr__TermGroupsAssignment_1_111778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_rule__TermGroup__TermsAssignment11809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_rule__Term__NumberAssignment_011840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Term__StringValueAssignment_111871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_rule__Term__IdentifierAssignment_211902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_rule__Term__UrlAssignment_311933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_rule__Term__FunctionAssignment_411964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_rule__Term__HexColorAssignment_511995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rule__Function__NameAssignment_112026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Function__ExpressionAssignment_412057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__URLType__UrlAssignment_212088 = new BitSet(new long[]{0x0000000000000002L});

}