package at.bestsolution.efxclipse.tooling.fxmlx.ui.contentassist.antlr.internal; 

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
import at.bestsolution.efxclipse.tooling.fxmlx.services.FXMLDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFXMLDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_WS", "RULE_ML_COMMENT", "'.'", "'<?xml'", "'?>'", "'<?'", "'<'", "'>'", "'</'", "':'", "'/>'", "'='", "'*'"
    };
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


        public InternalFXMLDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFXMLDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFXMLDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g"; }


     
     	private FXMLDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FXMLDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleFXML"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:61:1: entryRuleFXML : ruleFXML EOF ;
    public final void entryRuleFXML() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:62:1: ( ruleFXML EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:63:1: ruleFXML EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLRule()); 
            }
            pushFollow(FOLLOW_ruleFXML_in_entryRuleFXML67);
            ruleFXML();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFXMLRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFXML74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFXML"


    // $ANTLR start "ruleFXML"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:70:1: ruleFXML : ( ( rule__FXML__Group__0 ) ) ;
    public final void ruleFXML() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:74:2: ( ( ( rule__FXML__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:75:1: ( ( rule__FXML__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:75:1: ( ( rule__FXML__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:76:1: ( rule__FXML__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:77:1: ( rule__FXML__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:77:2: rule__FXML__Group__0
            {
            pushFollow(FOLLOW_rule__FXML__Group__0_in_ruleFXML100);
            rule__FXML__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFXMLAccess().getGroup()); 
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
    // $ANTLR end "ruleFXML"


    // $ANTLR start "entryRuleXMLDec"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:89:1: entryRuleXMLDec : ruleXMLDec EOF ;
    public final void entryRuleXMLDec() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:90:1: ( ruleXMLDec EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:91:1: ruleXMLDec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecRule()); 
            }
            pushFollow(FOLLOW_ruleXMLDec_in_entryRuleXMLDec127);
            ruleXMLDec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMLDecRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLDec134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXMLDec"


    // $ANTLR start "ruleXMLDec"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:98:1: ruleXMLDec : ( ( rule__XMLDec__Group__0 ) ) ;
    public final void ruleXMLDec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:102:2: ( ( ( rule__XMLDec__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:103:1: ( ( rule__XMLDec__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:103:1: ( ( rule__XMLDec__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:104:1: ( rule__XMLDec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:105:1: ( rule__XMLDec__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:105:2: rule__XMLDec__Group__0
            {
            pushFollow(FOLLOW_rule__XMLDec__Group__0_in_ruleXMLDec160);
            rule__XMLDec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMLDecAccess().getGroup()); 
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
    // $ANTLR end "ruleXMLDec"


    // $ANTLR start "entryRuleProcessingInstruction"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:117:1: entryRuleProcessingInstruction : ruleProcessingInstruction EOF ;
    public final void entryRuleProcessingInstruction() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:118:1: ( ruleProcessingInstruction EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:119:1: ruleProcessingInstruction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionRule()); 
            }
            pushFollow(FOLLOW_ruleProcessingInstruction_in_entryRuleProcessingInstruction187);
            ruleProcessingInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessingInstructionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessingInstruction194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProcessingInstruction"


    // $ANTLR start "ruleProcessingInstruction"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:126:1: ruleProcessingInstruction : ( ( rule__ProcessingInstruction__Group__0 ) ) ;
    public final void ruleProcessingInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:130:2: ( ( ( rule__ProcessingInstruction__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:131:1: ( ( rule__ProcessingInstruction__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:131:1: ( ( rule__ProcessingInstruction__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:132:1: ( rule__ProcessingInstruction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:133:1: ( rule__ProcessingInstruction__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:133:2: rule__ProcessingInstruction__Group__0
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__0_in_ruleProcessingInstruction220);
            rule__ProcessingInstruction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessingInstructionAccess().getGroup()); 
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
    // $ANTLR end "ruleProcessingInstruction"


    // $ANTLR start "entryRuleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:145:1: entryRuleElementDefinition : ruleElementDefinition EOF ;
    public final void entryRuleElementDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:146:1: ( ruleElementDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:147:1: ruleElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition247);
            ruleElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDefinition254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleElementDefinition"


    // $ANTLR start "ruleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:154:1: ruleElementDefinition : ( ( rule__ElementDefinition__Alternatives ) ) ;
    public final void ruleElementDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:158:2: ( ( ( rule__ElementDefinition__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:159:1: ( ( rule__ElementDefinition__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:159:1: ( ( rule__ElementDefinition__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:160:1: ( rule__ElementDefinition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementDefinitionAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:161:1: ( rule__ElementDefinition__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:161:2: rule__ElementDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__ElementDefinition__Alternatives_in_ruleElementDefinition280);
            rule__ElementDefinition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementDefinitionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleElementDefinition"


    // $ANTLR start "entryRuleContainerElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:173:1: entryRuleContainerElementDefinition : ruleContainerElementDefinition EOF ;
    public final void entryRuleContainerElementDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:174:1: ( ruleContainerElementDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:175:1: ruleContainerElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleContainerElementDefinition_in_entryRuleContainerElementDefinition307);
            ruleContainerElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerElementDefinition314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleContainerElementDefinition"


    // $ANTLR start "ruleContainerElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:182:1: ruleContainerElementDefinition : ( ( rule__ContainerElementDefinition__Alternatives ) ) ;
    public final void ruleContainerElementDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:186:2: ( ( ( rule__ContainerElementDefinition__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:187:1: ( ( rule__ContainerElementDefinition__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:187:1: ( ( rule__ContainerElementDefinition__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:188:1: ( rule__ContainerElementDefinition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:189:1: ( rule__ContainerElementDefinition__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:189:2: rule__ContainerElementDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Alternatives_in_ruleContainerElementDefinition340);
            rule__ContainerElementDefinition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleContainerElementDefinition"


    // $ANTLR start "entryRuleEmptyElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:201:1: entryRuleEmptyElementDefinition : ruleEmptyElementDefinition EOF ;
    public final void entryRuleEmptyElementDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:202:1: ( ruleEmptyElementDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:203:1: ruleEmptyElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyElementDefinition_in_entryRuleEmptyElementDefinition367);
            ruleEmptyElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyElementDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyElementDefinition374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEmptyElementDefinition"


    // $ANTLR start "ruleEmptyElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:210:1: ruleEmptyElementDefinition : ( ( rule__EmptyElementDefinition__Group__0 ) ) ;
    public final void ruleEmptyElementDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:214:2: ( ( ( rule__EmptyElementDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:215:1: ( ( rule__EmptyElementDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:215:1: ( ( rule__EmptyElementDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:216:1: ( rule__EmptyElementDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:217:1: ( rule__EmptyElementDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:217:2: rule__EmptyElementDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__0_in_ruleEmptyElementDefinition400);
            rule__EmptyElementDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyElementDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleEmptyElementDefinition"


    // $ANTLR start "entryRuleAttributePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:229:1: entryRuleAttributePropertyDefinition : ruleAttributePropertyDefinition EOF ;
    public final void entryRuleAttributePropertyDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:230:1: ( ruleAttributePropertyDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:231:1: ruleAttributePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_entryRuleAttributePropertyDefinition427);
            ruleAttributePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePropertyDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributePropertyDefinition434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttributePropertyDefinition"


    // $ANTLR start "ruleAttributePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:238:1: ruleAttributePropertyDefinition : ( ( rule__AttributePropertyDefinition__Group__0 ) ) ;
    public final void ruleAttributePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:242:2: ( ( ( rule__AttributePropertyDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:243:1: ( ( rule__AttributePropertyDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:243:1: ( ( rule__AttributePropertyDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:244:1: ( rule__AttributePropertyDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:245:1: ( rule__AttributePropertyDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:245:2: rule__AttributePropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__0_in_ruleAttributePropertyDefinition460);
            rule__AttributePropertyDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePropertyDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleAttributePropertyDefinition"


    // $ANTLR start "entryRuleContent"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:257:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:261:1: ( ruleContent EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:262:1: ruleContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentRule()); 
            }
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent492);
            ruleContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent499); if (state.failed) return ;

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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:272:1: ruleContent : ( ( rule__Content__Alternatives )* ) ;
    public final void ruleContent() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:277:2: ( ( ( rule__Content__Alternatives )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:278:1: ( ( rule__Content__Alternatives )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:278:1: ( ( rule__Content__Alternatives )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:279:1: ( rule__Content__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getAlternatives()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:280:1: ( rule__Content__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_WS)||LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:280:2: rule__Content__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Content__Alternatives_in_ruleContent529);
            	    rule__Content__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContentAccess().getAlternatives()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:293:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:294:1: ( ruleQualifiedName EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:295:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName557);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName564); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:302:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:306:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:307:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:307:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:308:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:309:1: ( rule__QualifiedName__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:309:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName590);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:321:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:322:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:323:1: ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard617);
            ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard624); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:330:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:334:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:335:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:335:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:336:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:337:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:337:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard650);
            rule__QualifiedNameWithWildCard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "rule__ElementDefinition__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:349:1: rule__ElementDefinition__Alternatives : ( ( ruleContainerElementDefinition ) | ( ruleEmptyElementDefinition ) );
    public final void rule__ElementDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:353:1: ( ( ruleContainerElementDefinition ) | ( ruleEmptyElementDefinition ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:354:1: ( ruleContainerElementDefinition )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:354:1: ( ruleContainerElementDefinition )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:355:1: ruleContainerElementDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getContainerElementDefinitionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleContainerElementDefinition_in_rule__ElementDefinition__Alternatives686);
                    ruleContainerElementDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDefinitionAccess().getContainerElementDefinitionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:360:6: ( ruleEmptyElementDefinition )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:360:6: ( ruleEmptyElementDefinition )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:361:1: ruleEmptyElementDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getEmptyElementDefinitionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleEmptyElementDefinition_in_rule__ElementDefinition__Alternatives703);
                    ruleEmptyElementDefinition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementDefinitionAccess().getEmptyElementDefinitionParserRuleCall_1()); 
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
    // $ANTLR end "rule__ElementDefinition__Alternatives"


    // $ANTLR start "rule__ContainerElementDefinition__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:371:1: rule__ContainerElementDefinition__Alternatives : ( ( ( rule__ContainerElementDefinition__Group_0__0 ) ) | ( ( rule__ContainerElementDefinition__Group_1__0 ) ) );
    public final void rule__ContainerElementDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:375:1: ( ( ( rule__ContainerElementDefinition__Group_0__0 ) ) | ( ( rule__ContainerElementDefinition__Group_1__0 ) ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:376:1: ( ( rule__ContainerElementDefinition__Group_0__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:376:1: ( ( rule__ContainerElementDefinition__Group_0__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:377:1: ( rule__ContainerElementDefinition__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContainerElementDefinitionAccess().getGroup_0()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:378:1: ( rule__ContainerElementDefinition__Group_0__0 )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:378:2: rule__ContainerElementDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__0_in_rule__ContainerElementDefinition__Alternatives735);
                    rule__ContainerElementDefinition__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContainerElementDefinitionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:382:6: ( ( rule__ContainerElementDefinition__Group_1__0 ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:382:6: ( ( rule__ContainerElementDefinition__Group_1__0 ) )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:383:1: ( rule__ContainerElementDefinition__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContainerElementDefinitionAccess().getGroup_1()); 
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:384:1: ( rule__ContainerElementDefinition__Group_1__0 )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:384:2: rule__ContainerElementDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__0_in_rule__ContainerElementDefinition__Alternatives753);
                    rule__ContainerElementDefinition__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContainerElementDefinitionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Alternatives"


    // $ANTLR start "rule__Content__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:393:1: rule__Content__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( RULE_WS ) | ( '.' ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:397:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( RULE_WS ) | ( '.' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt4=3;
                }
                break;
            case RULE_WS:
                {
                alt4=4;
                }
                break;
            case 9:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:398:1: ( RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:398:1: ( RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:399:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Content__Alternatives786); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:404:6: ( RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:404:6: ( RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:405:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Content__Alternatives803); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:410:6: ( RULE_ANY_OTHER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:410:6: ( RULE_ANY_OTHER )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:411:1: RULE_ANY_OTHER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getANY_OTHERTerminalRuleCall_2()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__Content__Alternatives820); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getANY_OTHERTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:416:6: ( RULE_WS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:416:6: ( RULE_WS )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:417:1: RULE_WS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getWSTerminalRuleCall_3()); 
                    }
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Content__Alternatives837); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getWSTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:422:6: ( '.' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:422:6: ( '.' )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:423:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getFullStopKeyword_4()); 
                    }
                    match(input,9,FOLLOW_9_in_rule__Content__Alternatives855); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getFullStopKeyword_4()); 
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
    // $ANTLR end "rule__Content__Alternatives"


    // $ANTLR start "rule__FXML__Group__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:437:1: rule__FXML__Group__0 : rule__FXML__Group__0__Impl rule__FXML__Group__1 ;
    public final void rule__FXML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:441:1: ( rule__FXML__Group__0__Impl rule__FXML__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:442:2: rule__FXML__Group__0__Impl rule__FXML__Group__1
            {
            pushFollow(FOLLOW_rule__FXML__Group__0__Impl_in_rule__FXML__Group__0887);
            rule__FXML__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FXML__Group__1_in_rule__FXML__Group__0890);
            rule__FXML__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXML__Group__0"


    // $ANTLR start "rule__FXML__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:449:1: rule__FXML__Group__0__Impl : ( ( rule__FXML__XmlDecAssignment_0 ) ) ;
    public final void rule__FXML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:453:1: ( ( ( rule__FXML__XmlDecAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:454:1: ( ( rule__FXML__XmlDecAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:454:1: ( ( rule__FXML__XmlDecAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:455:1: ( rule__FXML__XmlDecAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getXmlDecAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:456:1: ( rule__FXML__XmlDecAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:456:2: rule__FXML__XmlDecAssignment_0
            {
            pushFollow(FOLLOW_rule__FXML__XmlDecAssignment_0_in_rule__FXML__Group__0__Impl917);
            rule__FXML__XmlDecAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFXMLAccess().getXmlDecAssignment_0()); 
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
    // $ANTLR end "rule__FXML__Group__0__Impl"


    // $ANTLR start "rule__FXML__Group__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:466:1: rule__FXML__Group__1 : rule__FXML__Group__1__Impl rule__FXML__Group__2 ;
    public final void rule__FXML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:470:1: ( rule__FXML__Group__1__Impl rule__FXML__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:471:2: rule__FXML__Group__1__Impl rule__FXML__Group__2
            {
            pushFollow(FOLLOW_rule__FXML__Group__1__Impl_in_rule__FXML__Group__1947);
            rule__FXML__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FXML__Group__2_in_rule__FXML__Group__1950);
            rule__FXML__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXML__Group__1"


    // $ANTLR start "rule__FXML__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:478:1: rule__FXML__Group__1__Impl : ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* ) ;
    public final void rule__FXML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:482:1: ( ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:483:1: ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:483:1: ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:484:1: ( rule__FXML__ProcessingInstructionsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getProcessingInstructionsAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:485:1: ( rule__FXML__ProcessingInstructionsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:485:2: rule__FXML__ProcessingInstructionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__FXML__ProcessingInstructionsAssignment_1_in_rule__FXML__Group__1__Impl977);
            	    rule__FXML__ProcessingInstructionsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFXMLAccess().getProcessingInstructionsAssignment_1()); 
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
    // $ANTLR end "rule__FXML__Group__1__Impl"


    // $ANTLR start "rule__FXML__Group__2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:495:1: rule__FXML__Group__2 : rule__FXML__Group__2__Impl ;
    public final void rule__FXML__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:499:1: ( rule__FXML__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:500:2: rule__FXML__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FXML__Group__2__Impl_in_rule__FXML__Group__21008);
            rule__FXML__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FXML__Group__2"


    // $ANTLR start "rule__FXML__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:506:1: rule__FXML__Group__2__Impl : ( ( rule__FXML__RootElementAssignment_2 ) ) ;
    public final void rule__FXML__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:510:1: ( ( ( rule__FXML__RootElementAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:511:1: ( ( rule__FXML__RootElementAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:511:1: ( ( rule__FXML__RootElementAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:512:1: ( rule__FXML__RootElementAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getRootElementAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:513:1: ( rule__FXML__RootElementAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:513:2: rule__FXML__RootElementAssignment_2
            {
            pushFollow(FOLLOW_rule__FXML__RootElementAssignment_2_in_rule__FXML__Group__2__Impl1035);
            rule__FXML__RootElementAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFXMLAccess().getRootElementAssignment_2()); 
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
    // $ANTLR end "rule__FXML__Group__2__Impl"


    // $ANTLR start "rule__XMLDec__Group__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:529:1: rule__XMLDec__Group__0 : rule__XMLDec__Group__0__Impl rule__XMLDec__Group__1 ;
    public final void rule__XMLDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:533:1: ( rule__XMLDec__Group__0__Impl rule__XMLDec__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:534:2: rule__XMLDec__Group__0__Impl rule__XMLDec__Group__1
            {
            pushFollow(FOLLOW_rule__XMLDec__Group__0__Impl_in_rule__XMLDec__Group__01071);
            rule__XMLDec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XMLDec__Group__1_in_rule__XMLDec__Group__01074);
            rule__XMLDec__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMLDec__Group__0"


    // $ANTLR start "rule__XMLDec__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:541:1: rule__XMLDec__Group__0__Impl : ( '<?xml' ) ;
    public final void rule__XMLDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:545:1: ( ( '<?xml' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:546:1: ( '<?xml' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:546:1: ( '<?xml' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:547:1: '<?xml'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getXmlKeyword_0()); 
            }
            match(input,10,FOLLOW_10_in_rule__XMLDec__Group__0__Impl1102); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMLDecAccess().getXmlKeyword_0()); 
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
    // $ANTLR end "rule__XMLDec__Group__0__Impl"


    // $ANTLR start "rule__XMLDec__Group__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:560:1: rule__XMLDec__Group__1 : rule__XMLDec__Group__1__Impl rule__XMLDec__Group__2 ;
    public final void rule__XMLDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:564:1: ( rule__XMLDec__Group__1__Impl rule__XMLDec__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:565:2: rule__XMLDec__Group__1__Impl rule__XMLDec__Group__2
            {
            pushFollow(FOLLOW_rule__XMLDec__Group__1__Impl_in_rule__XMLDec__Group__11133);
            rule__XMLDec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XMLDec__Group__2_in_rule__XMLDec__Group__11136);
            rule__XMLDec__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMLDec__Group__1"


    // $ANTLR start "rule__XMLDec__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:572:1: rule__XMLDec__Group__1__Impl : ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) ) ;
    public final void rule__XMLDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:576:1: ( ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:577:1: ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:577:1: ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:578:1: ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:578:1: ( ( rule__XMLDec__PropsAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:579:1: ( rule__XMLDec__PropsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getPropsAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:580:1: ( rule__XMLDec__PropsAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:580:2: rule__XMLDec__PropsAssignment_1
            {
            pushFollow(FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1165);
            rule__XMLDec__PropsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMLDecAccess().getPropsAssignment_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:583:1: ( ( rule__XMLDec__PropsAssignment_1 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:584:1: ( rule__XMLDec__PropsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getPropsAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:585:1: ( rule__XMLDec__PropsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:585:2: rule__XMLDec__PropsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1177);
            	    rule__XMLDec__PropsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMLDecAccess().getPropsAssignment_1()); 
            }

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
    // $ANTLR end "rule__XMLDec__Group__1__Impl"


    // $ANTLR start "rule__XMLDec__Group__2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:596:1: rule__XMLDec__Group__2 : rule__XMLDec__Group__2__Impl ;
    public final void rule__XMLDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:600:1: ( rule__XMLDec__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:601:2: rule__XMLDec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__XMLDec__Group__2__Impl_in_rule__XMLDec__Group__21210);
            rule__XMLDec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XMLDec__Group__2"


    // $ANTLR start "rule__XMLDec__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:607:1: rule__XMLDec__Group__2__Impl : ( '?>' ) ;
    public final void rule__XMLDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:611:1: ( ( '?>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:612:1: ( '?>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:612:1: ( '?>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:613:1: '?>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getQuestionMarkGreaterThanSignKeyword_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__XMLDec__Group__2__Impl1238); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMLDecAccess().getQuestionMarkGreaterThanSignKeyword_2()); 
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
    // $ANTLR end "rule__XMLDec__Group__2__Impl"


    // $ANTLR start "rule__ProcessingInstruction__Group__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:632:1: rule__ProcessingInstruction__Group__0 : rule__ProcessingInstruction__Group__0__Impl rule__ProcessingInstruction__Group__1 ;
    public final void rule__ProcessingInstruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:636:1: ( rule__ProcessingInstruction__Group__0__Impl rule__ProcessingInstruction__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:637:2: rule__ProcessingInstruction__Group__0__Impl rule__ProcessingInstruction__Group__1
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__0__Impl_in_rule__ProcessingInstruction__Group__01275);
            rule__ProcessingInstruction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__1_in_rule__ProcessingInstruction__Group__01278);
            rule__ProcessingInstruction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingInstruction__Group__0"


    // $ANTLR start "rule__ProcessingInstruction__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:644:1: rule__ProcessingInstruction__Group__0__Impl : ( '<?' ) ;
    public final void rule__ProcessingInstruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:648:1: ( ( '<?' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:649:1: ( '<?' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:649:1: ( '<?' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:650:1: '<?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getLessThanSignQuestionMarkKeyword_0()); 
            }
            match(input,12,FOLLOW_12_in_rule__ProcessingInstruction__Group__0__Impl1306); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessingInstructionAccess().getLessThanSignQuestionMarkKeyword_0()); 
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
    // $ANTLR end "rule__ProcessingInstruction__Group__0__Impl"


    // $ANTLR start "rule__ProcessingInstruction__Group__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:663:1: rule__ProcessingInstruction__Group__1 : rule__ProcessingInstruction__Group__1__Impl rule__ProcessingInstruction__Group__2 ;
    public final void rule__ProcessingInstruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:667:1: ( rule__ProcessingInstruction__Group__1__Impl rule__ProcessingInstruction__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:668:2: rule__ProcessingInstruction__Group__1__Impl rule__ProcessingInstruction__Group__2
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__1__Impl_in_rule__ProcessingInstruction__Group__11337);
            rule__ProcessingInstruction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__2_in_rule__ProcessingInstruction__Group__11340);
            rule__ProcessingInstruction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingInstruction__Group__1"


    // $ANTLR start "rule__ProcessingInstruction__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:675:1: rule__ProcessingInstruction__Group__1__Impl : ( ( rule__ProcessingInstruction__TypeAssignment_1 ) ) ;
    public final void rule__ProcessingInstruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:679:1: ( ( ( rule__ProcessingInstruction__TypeAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:680:1: ( ( rule__ProcessingInstruction__TypeAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:680:1: ( ( rule__ProcessingInstruction__TypeAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:681:1: ( rule__ProcessingInstruction__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getTypeAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:682:1: ( rule__ProcessingInstruction__TypeAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:682:2: rule__ProcessingInstruction__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__TypeAssignment_1_in_rule__ProcessingInstruction__Group__1__Impl1367);
            rule__ProcessingInstruction__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessingInstructionAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__ProcessingInstruction__Group__1__Impl"


    // $ANTLR start "rule__ProcessingInstruction__Group__2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:692:1: rule__ProcessingInstruction__Group__2 : rule__ProcessingInstruction__Group__2__Impl rule__ProcessingInstruction__Group__3 ;
    public final void rule__ProcessingInstruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:696:1: ( rule__ProcessingInstruction__Group__2__Impl rule__ProcessingInstruction__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:697:2: rule__ProcessingInstruction__Group__2__Impl rule__ProcessingInstruction__Group__3
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__2__Impl_in_rule__ProcessingInstruction__Group__21397);
            rule__ProcessingInstruction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__3_in_rule__ProcessingInstruction__Group__21400);
            rule__ProcessingInstruction__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingInstruction__Group__2"


    // $ANTLR start "rule__ProcessingInstruction__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:704:1: rule__ProcessingInstruction__Group__2__Impl : ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__ProcessingInstruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:708:1: ( ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:709:1: ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:709:1: ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:710:1: ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getImportedNamespaceAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:711:1: ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:711:2: rule__ProcessingInstruction__ImportedNamespaceAssignment_2
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__ImportedNamespaceAssignment_2_in_rule__ProcessingInstruction__Group__2__Impl1427);
            rule__ProcessingInstruction__ImportedNamespaceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessingInstructionAccess().getImportedNamespaceAssignment_2()); 
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
    // $ANTLR end "rule__ProcessingInstruction__Group__2__Impl"


    // $ANTLR start "rule__ProcessingInstruction__Group__3"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:721:1: rule__ProcessingInstruction__Group__3 : rule__ProcessingInstruction__Group__3__Impl ;
    public final void rule__ProcessingInstruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:725:1: ( rule__ProcessingInstruction__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:726:2: rule__ProcessingInstruction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__3__Impl_in_rule__ProcessingInstruction__Group__31457);
            rule__ProcessingInstruction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessingInstruction__Group__3"


    // $ANTLR start "rule__ProcessingInstruction__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:732:1: rule__ProcessingInstruction__Group__3__Impl : ( '?>' ) ;
    public final void rule__ProcessingInstruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:736:1: ( ( '?>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:737:1: ( '?>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:737:1: ( '?>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:738:1: '?>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getQuestionMarkGreaterThanSignKeyword_3()); 
            }
            match(input,11,FOLLOW_11_in_rule__ProcessingInstruction__Group__3__Impl1485); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessingInstructionAccess().getQuestionMarkGreaterThanSignKeyword_3()); 
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
    // $ANTLR end "rule__ProcessingInstruction__Group__3__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:759:1: rule__ContainerElementDefinition__Group_0__0 : rule__ContainerElementDefinition__Group_0__0__Impl rule__ContainerElementDefinition__Group_0__1 ;
    public final void rule__ContainerElementDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:763:1: ( rule__ContainerElementDefinition__Group_0__0__Impl rule__ContainerElementDefinition__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:764:2: rule__ContainerElementDefinition__Group_0__0__Impl rule__ContainerElementDefinition__Group_0__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__0__Impl_in_rule__ContainerElementDefinition__Group_0__01524);
            rule__ContainerElementDefinition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__1_in_rule__ContainerElementDefinition__Group_0__01527);
            rule__ContainerElementDefinition__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__0"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:771:1: rule__ContainerElementDefinition__Group_0__0__Impl : ( '<' ) ;
    public final void rule__ContainerElementDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:775:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:776:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:776:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:777:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignKeyword_0_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__ContainerElementDefinition__Group_0__0__Impl1555); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignKeyword_0_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:790:1: rule__ContainerElementDefinition__Group_0__1 : rule__ContainerElementDefinition__Group_0__1__Impl rule__ContainerElementDefinition__Group_0__2 ;
    public final void rule__ContainerElementDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:794:1: ( rule__ContainerElementDefinition__Group_0__1__Impl rule__ContainerElementDefinition__Group_0__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:795:2: rule__ContainerElementDefinition__Group_0__1__Impl rule__ContainerElementDefinition__Group_0__2
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__1__Impl_in_rule__ContainerElementDefinition__Group_0__11586);
            rule__ContainerElementDefinition__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__2_in_rule__ContainerElementDefinition__Group_0__11589);
            rule__ContainerElementDefinition__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__1"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:802:1: rule__ContainerElementDefinition__Group_0__1__Impl : ( ( rule__ContainerElementDefinition__Group_0_1__0 )? ) ;
    public final void rule__ContainerElementDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:806:1: ( ( ( rule__ContainerElementDefinition__Group_0_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:807:1: ( ( rule__ContainerElementDefinition__Group_0_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:807:1: ( ( rule__ContainerElementDefinition__Group_0_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:808:1: ( rule__ContainerElementDefinition__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGroup_0_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:809:1: ( rule__ContainerElementDefinition__Group_0_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==16) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:809:2: rule__ContainerElementDefinition__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_1__0_in_rule__ContainerElementDefinition__Group_0__1__Impl1616);
                    rule__ContainerElementDefinition__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getGroup_0_1()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:819:1: rule__ContainerElementDefinition__Group_0__2 : rule__ContainerElementDefinition__Group_0__2__Impl rule__ContainerElementDefinition__Group_0__3 ;
    public final void rule__ContainerElementDefinition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:823:1: ( rule__ContainerElementDefinition__Group_0__2__Impl rule__ContainerElementDefinition__Group_0__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:824:2: rule__ContainerElementDefinition__Group_0__2__Impl rule__ContainerElementDefinition__Group_0__3
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__2__Impl_in_rule__ContainerElementDefinition__Group_0__21647);
            rule__ContainerElementDefinition__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__3_in_rule__ContainerElementDefinition__Group_0__21650);
            rule__ContainerElementDefinition__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__2"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:831:1: rule__ContainerElementDefinition__Group_0__2__Impl : ( ( rule__ContainerElementDefinition__NameAssignment_0_2 ) ) ;
    public final void rule__ContainerElementDefinition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:835:1: ( ( ( rule__ContainerElementDefinition__NameAssignment_0_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:836:1: ( ( rule__ContainerElementDefinition__NameAssignment_0_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:836:1: ( ( rule__ContainerElementDefinition__NameAssignment_0_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:837:1: ( rule__ContainerElementDefinition__NameAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNameAssignment_0_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:838:1: ( rule__ContainerElementDefinition__NameAssignment_0_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:838:2: rule__ContainerElementDefinition__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__NameAssignment_0_2_in_rule__ContainerElementDefinition__Group_0__2__Impl1677);
            rule__ContainerElementDefinition__NameAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getNameAssignment_0_2()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__2__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__3"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:848:1: rule__ContainerElementDefinition__Group_0__3 : rule__ContainerElementDefinition__Group_0__3__Impl rule__ContainerElementDefinition__Group_0__4 ;
    public final void rule__ContainerElementDefinition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:852:1: ( rule__ContainerElementDefinition__Group_0__3__Impl rule__ContainerElementDefinition__Group_0__4 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:853:2: rule__ContainerElementDefinition__Group_0__3__Impl rule__ContainerElementDefinition__Group_0__4
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__3__Impl_in_rule__ContainerElementDefinition__Group_0__31707);
            rule__ContainerElementDefinition__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__4_in_rule__ContainerElementDefinition__Group_0__31710);
            rule__ContainerElementDefinition__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__3"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:860:1: rule__ContainerElementDefinition__Group_0__3__Impl : ( ( rule__ContainerElementDefinition__PropertiesAssignment_0_3 )* ) ;
    public final void rule__ContainerElementDefinition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:864:1: ( ( ( rule__ContainerElementDefinition__PropertiesAssignment_0_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:865:1: ( ( rule__ContainerElementDefinition__PropertiesAssignment_0_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:865:1: ( ( rule__ContainerElementDefinition__PropertiesAssignment_0_3 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:866:1: ( rule__ContainerElementDefinition__PropertiesAssignment_0_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAssignment_0_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:867:1: ( rule__ContainerElementDefinition__PropertiesAssignment_0_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:867:2: rule__ContainerElementDefinition__PropertiesAssignment_0_3
            	    {
            	    pushFollow(FOLLOW_rule__ContainerElementDefinition__PropertiesAssignment_0_3_in_rule__ContainerElementDefinition__Group_0__3__Impl1737);
            	    rule__ContainerElementDefinition__PropertiesAssignment_0_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAssignment_0_3()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__3__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__4"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:877:1: rule__ContainerElementDefinition__Group_0__4 : rule__ContainerElementDefinition__Group_0__4__Impl rule__ContainerElementDefinition__Group_0__5 ;
    public final void rule__ContainerElementDefinition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:881:1: ( rule__ContainerElementDefinition__Group_0__4__Impl rule__ContainerElementDefinition__Group_0__5 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:882:2: rule__ContainerElementDefinition__Group_0__4__Impl rule__ContainerElementDefinition__Group_0__5
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__4__Impl_in_rule__ContainerElementDefinition__Group_0__41768);
            rule__ContainerElementDefinition__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__5_in_rule__ContainerElementDefinition__Group_0__41771);
            rule__ContainerElementDefinition__Group_0__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__4"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:889:1: rule__ContainerElementDefinition__Group_0__4__Impl : ( '>' ) ;
    public final void rule__ContainerElementDefinition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:893:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:894:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:894:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:895:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_0_4()); 
            }
            match(input,14,FOLLOW_14_in_rule__ContainerElementDefinition__Group_0__4__Impl1799); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_0_4()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__4__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__5"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:908:1: rule__ContainerElementDefinition__Group_0__5 : rule__ContainerElementDefinition__Group_0__5__Impl rule__ContainerElementDefinition__Group_0__6 ;
    public final void rule__ContainerElementDefinition__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:912:1: ( rule__ContainerElementDefinition__Group_0__5__Impl rule__ContainerElementDefinition__Group_0__6 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:913:2: rule__ContainerElementDefinition__Group_0__5__Impl rule__ContainerElementDefinition__Group_0__6
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__5__Impl_in_rule__ContainerElementDefinition__Group_0__51830);
            rule__ContainerElementDefinition__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__6_in_rule__ContainerElementDefinition__Group_0__51833);
            rule__ContainerElementDefinition__Group_0__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__5"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:920:1: rule__ContainerElementDefinition__Group_0__5__Impl : ( ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 ) ) ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )* ) ) ;
    public final void rule__ContainerElementDefinition__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:924:1: ( ( ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 ) ) ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:925:1: ( ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 ) ) ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:925:1: ( ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 ) ) ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:926:1: ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 ) ) ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:926:1: ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:927:1: ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getChildrenAssignment_0_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:928:1: ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:928:2: rule__ContainerElementDefinition__ChildrenAssignment_0_5
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__ChildrenAssignment_0_5_in_rule__ContainerElementDefinition__Group_0__5__Impl1862);
            rule__ContainerElementDefinition__ChildrenAssignment_0_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getChildrenAssignment_0_5()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:931:1: ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:932:1: ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getChildrenAssignment_0_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:933:1: ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:933:2: rule__ContainerElementDefinition__ChildrenAssignment_0_5
            	    {
            	    pushFollow(FOLLOW_rule__ContainerElementDefinition__ChildrenAssignment_0_5_in_rule__ContainerElementDefinition__Group_0__5__Impl1874);
            	    rule__ContainerElementDefinition__ChildrenAssignment_0_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getChildrenAssignment_0_5()); 
            }

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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__5__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__6"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:944:1: rule__ContainerElementDefinition__Group_0__6 : rule__ContainerElementDefinition__Group_0__6__Impl rule__ContainerElementDefinition__Group_0__7 ;
    public final void rule__ContainerElementDefinition__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:948:1: ( rule__ContainerElementDefinition__Group_0__6__Impl rule__ContainerElementDefinition__Group_0__7 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:949:2: rule__ContainerElementDefinition__Group_0__6__Impl rule__ContainerElementDefinition__Group_0__7
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__6__Impl_in_rule__ContainerElementDefinition__Group_0__61907);
            rule__ContainerElementDefinition__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__7_in_rule__ContainerElementDefinition__Group_0__61910);
            rule__ContainerElementDefinition__Group_0__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__6"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:956:1: rule__ContainerElementDefinition__Group_0__6__Impl : ( '</' ) ;
    public final void rule__ContainerElementDefinition__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:960:1: ( ( '</' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:961:1: ( '</' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:961:1: ( '</' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:962:1: '</'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignSolidusKeyword_0_6()); 
            }
            match(input,15,FOLLOW_15_in_rule__ContainerElementDefinition__Group_0__6__Impl1938); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignSolidusKeyword_0_6()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__6__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__7"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:975:1: rule__ContainerElementDefinition__Group_0__7 : rule__ContainerElementDefinition__Group_0__7__Impl rule__ContainerElementDefinition__Group_0__8 ;
    public final void rule__ContainerElementDefinition__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:979:1: ( rule__ContainerElementDefinition__Group_0__7__Impl rule__ContainerElementDefinition__Group_0__8 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:980:2: rule__ContainerElementDefinition__Group_0__7__Impl rule__ContainerElementDefinition__Group_0__8
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__7__Impl_in_rule__ContainerElementDefinition__Group_0__71969);
            rule__ContainerElementDefinition__Group_0__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__8_in_rule__ContainerElementDefinition__Group_0__71972);
            rule__ContainerElementDefinition__Group_0__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__7"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__7__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:987:1: rule__ContainerElementDefinition__Group_0__7__Impl : ( ( rule__ContainerElementDefinition__Group_0_7__0 )? ) ;
    public final void rule__ContainerElementDefinition__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:991:1: ( ( ( rule__ContainerElementDefinition__Group_0_7__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:992:1: ( ( rule__ContainerElementDefinition__Group_0_7__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:992:1: ( ( rule__ContainerElementDefinition__Group_0_7__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:993:1: ( rule__ContainerElementDefinition__Group_0_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGroup_0_7()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:994:1: ( rule__ContainerElementDefinition__Group_0_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==16) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:994:2: rule__ContainerElementDefinition__Group_0_7__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_7__0_in_rule__ContainerElementDefinition__Group_0__7__Impl1999);
                    rule__ContainerElementDefinition__Group_0_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getGroup_0_7()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__7__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__8"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1004:1: rule__ContainerElementDefinition__Group_0__8 : rule__ContainerElementDefinition__Group_0__8__Impl rule__ContainerElementDefinition__Group_0__9 ;
    public final void rule__ContainerElementDefinition__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1008:1: ( rule__ContainerElementDefinition__Group_0__8__Impl rule__ContainerElementDefinition__Group_0__9 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1009:2: rule__ContainerElementDefinition__Group_0__8__Impl rule__ContainerElementDefinition__Group_0__9
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__8__Impl_in_rule__ContainerElementDefinition__Group_0__82030);
            rule__ContainerElementDefinition__Group_0__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__9_in_rule__ContainerElementDefinition__Group_0__82033);
            rule__ContainerElementDefinition__Group_0__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__8"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__8__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1016:1: rule__ContainerElementDefinition__Group_0__8__Impl : ( ( rule__ContainerElementDefinition__EndnameAssignment_0_8 ) ) ;
    public final void rule__ContainerElementDefinition__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1020:1: ( ( ( rule__ContainerElementDefinition__EndnameAssignment_0_8 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1021:1: ( ( rule__ContainerElementDefinition__EndnameAssignment_0_8 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1021:1: ( ( rule__ContainerElementDefinition__EndnameAssignment_0_8 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1022:1: ( rule__ContainerElementDefinition__EndnameAssignment_0_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnameAssignment_0_8()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1023:1: ( rule__ContainerElementDefinition__EndnameAssignment_0_8 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1023:2: rule__ContainerElementDefinition__EndnameAssignment_0_8
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__EndnameAssignment_0_8_in_rule__ContainerElementDefinition__Group_0__8__Impl2060);
            rule__ContainerElementDefinition__EndnameAssignment_0_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getEndnameAssignment_0_8()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__8__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__9"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1033:1: rule__ContainerElementDefinition__Group_0__9 : rule__ContainerElementDefinition__Group_0__9__Impl ;
    public final void rule__ContainerElementDefinition__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1037:1: ( rule__ContainerElementDefinition__Group_0__9__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1038:2: rule__ContainerElementDefinition__Group_0__9__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__9__Impl_in_rule__ContainerElementDefinition__Group_0__92090);
            rule__ContainerElementDefinition__Group_0__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__9"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0__9__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1044:1: rule__ContainerElementDefinition__Group_0__9__Impl : ( '>' ) ;
    public final void rule__ContainerElementDefinition__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1048:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1049:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1049:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1050:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_0_9()); 
            }
            match(input,14,FOLLOW_14_in_rule__ContainerElementDefinition__Group_0__9__Impl2118); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_0_9()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0__9__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0_1__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1083:1: rule__ContainerElementDefinition__Group_0_1__0 : rule__ContainerElementDefinition__Group_0_1__0__Impl rule__ContainerElementDefinition__Group_0_1__1 ;
    public final void rule__ContainerElementDefinition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1087:1: ( rule__ContainerElementDefinition__Group_0_1__0__Impl rule__ContainerElementDefinition__Group_0_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1088:2: rule__ContainerElementDefinition__Group_0_1__0__Impl rule__ContainerElementDefinition__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_1__0__Impl_in_rule__ContainerElementDefinition__Group_0_1__02169);
            rule__ContainerElementDefinition__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_1__1_in_rule__ContainerElementDefinition__Group_0_1__02172);
            rule__ContainerElementDefinition__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0_1__0"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1095:1: rule__ContainerElementDefinition__Group_0_1__0__Impl : ( ( rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 ) ) ;
    public final void rule__ContainerElementDefinition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1099:1: ( ( ( rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1100:1: ( ( rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1100:1: ( ( rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1101:1: ( rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNamespaceAssignment_0_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1102:1: ( rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1102:2: rule__ContainerElementDefinition__NamespaceAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__NamespaceAssignment_0_1_0_in_rule__ContainerElementDefinition__Group_0_1__0__Impl2199);
            rule__ContainerElementDefinition__NamespaceAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getNamespaceAssignment_0_1_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0_1__0__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0_1__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1112:1: rule__ContainerElementDefinition__Group_0_1__1 : rule__ContainerElementDefinition__Group_0_1__1__Impl ;
    public final void rule__ContainerElementDefinition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1116:1: ( rule__ContainerElementDefinition__Group_0_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1117:2: rule__ContainerElementDefinition__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_1__1__Impl_in_rule__ContainerElementDefinition__Group_0_1__12229);
            rule__ContainerElementDefinition__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0_1__1"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1123:1: rule__ContainerElementDefinition__Group_0_1__1__Impl : ( ':' ) ;
    public final void rule__ContainerElementDefinition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1127:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1128:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1128:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1129:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_0_1_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__ContainerElementDefinition__Group_0_1__1__Impl2257); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_0_1_1()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0_1__1__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0_7__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1146:1: rule__ContainerElementDefinition__Group_0_7__0 : rule__ContainerElementDefinition__Group_0_7__0__Impl rule__ContainerElementDefinition__Group_0_7__1 ;
    public final void rule__ContainerElementDefinition__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1150:1: ( rule__ContainerElementDefinition__Group_0_7__0__Impl rule__ContainerElementDefinition__Group_0_7__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1151:2: rule__ContainerElementDefinition__Group_0_7__0__Impl rule__ContainerElementDefinition__Group_0_7__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_7__0__Impl_in_rule__ContainerElementDefinition__Group_0_7__02292);
            rule__ContainerElementDefinition__Group_0_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_7__1_in_rule__ContainerElementDefinition__Group_0_7__02295);
            rule__ContainerElementDefinition__Group_0_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0_7__0"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0_7__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1158:1: rule__ContainerElementDefinition__Group_0_7__0__Impl : ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 ) ) ;
    public final void rule__ContainerElementDefinition__Group_0_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1162:1: ( ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1163:1: ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1163:1: ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1164:1: ( rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceAssignment_0_7_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1165:1: ( rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1165:2: rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0_in_rule__ContainerElementDefinition__Group_0_7__0__Impl2322);
            rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceAssignment_0_7_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0_7__0__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0_7__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1175:1: rule__ContainerElementDefinition__Group_0_7__1 : rule__ContainerElementDefinition__Group_0_7__1__Impl ;
    public final void rule__ContainerElementDefinition__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1179:1: ( rule__ContainerElementDefinition__Group_0_7__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1180:2: rule__ContainerElementDefinition__Group_0_7__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_7__1__Impl_in_rule__ContainerElementDefinition__Group_0_7__12352);
            rule__ContainerElementDefinition__Group_0_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_0_7__1"


    // $ANTLR start "rule__ContainerElementDefinition__Group_0_7__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1186:1: rule__ContainerElementDefinition__Group_0_7__1__Impl : ( ':' ) ;
    public final void rule__ContainerElementDefinition__Group_0_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1190:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1191:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1191:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1192:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_0_7_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__ContainerElementDefinition__Group_0_7__1__Impl2380); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_0_7_1()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_0_7__1__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1209:1: rule__ContainerElementDefinition__Group_1__0 : rule__ContainerElementDefinition__Group_1__0__Impl rule__ContainerElementDefinition__Group_1__1 ;
    public final void rule__ContainerElementDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1213:1: ( rule__ContainerElementDefinition__Group_1__0__Impl rule__ContainerElementDefinition__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1214:2: rule__ContainerElementDefinition__Group_1__0__Impl rule__ContainerElementDefinition__Group_1__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__0__Impl_in_rule__ContainerElementDefinition__Group_1__02415);
            rule__ContainerElementDefinition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__1_in_rule__ContainerElementDefinition__Group_1__02418);
            rule__ContainerElementDefinition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__0"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1221:1: rule__ContainerElementDefinition__Group_1__0__Impl : ( '<' ) ;
    public final void rule__ContainerElementDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1225:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1226:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1226:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1227:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignKeyword_1_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__ContainerElementDefinition__Group_1__0__Impl2446); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignKeyword_1_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1240:1: rule__ContainerElementDefinition__Group_1__1 : rule__ContainerElementDefinition__Group_1__1__Impl rule__ContainerElementDefinition__Group_1__2 ;
    public final void rule__ContainerElementDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1244:1: ( rule__ContainerElementDefinition__Group_1__1__Impl rule__ContainerElementDefinition__Group_1__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1245:2: rule__ContainerElementDefinition__Group_1__1__Impl rule__ContainerElementDefinition__Group_1__2
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__1__Impl_in_rule__ContainerElementDefinition__Group_1__12477);
            rule__ContainerElementDefinition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__2_in_rule__ContainerElementDefinition__Group_1__12480);
            rule__ContainerElementDefinition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__1"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1252:1: rule__ContainerElementDefinition__Group_1__1__Impl : ( ( rule__ContainerElementDefinition__Group_1_1__0 )? ) ;
    public final void rule__ContainerElementDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1256:1: ( ( ( rule__ContainerElementDefinition__Group_1_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1257:1: ( ( rule__ContainerElementDefinition__Group_1_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1257:1: ( ( rule__ContainerElementDefinition__Group_1_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1258:1: ( rule__ContainerElementDefinition__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1259:1: ( rule__ContainerElementDefinition__Group_1_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==16) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1259:2: rule__ContainerElementDefinition__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_1__0_in_rule__ContainerElementDefinition__Group_1__1__Impl2507);
                    rule__ContainerElementDefinition__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1269:1: rule__ContainerElementDefinition__Group_1__2 : rule__ContainerElementDefinition__Group_1__2__Impl rule__ContainerElementDefinition__Group_1__3 ;
    public final void rule__ContainerElementDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1273:1: ( rule__ContainerElementDefinition__Group_1__2__Impl rule__ContainerElementDefinition__Group_1__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1274:2: rule__ContainerElementDefinition__Group_1__2__Impl rule__ContainerElementDefinition__Group_1__3
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__2__Impl_in_rule__ContainerElementDefinition__Group_1__22538);
            rule__ContainerElementDefinition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__3_in_rule__ContainerElementDefinition__Group_1__22541);
            rule__ContainerElementDefinition__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__2"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1281:1: rule__ContainerElementDefinition__Group_1__2__Impl : ( ( rule__ContainerElementDefinition__NameAssignment_1_2 ) ) ;
    public final void rule__ContainerElementDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1285:1: ( ( ( rule__ContainerElementDefinition__NameAssignment_1_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1286:1: ( ( rule__ContainerElementDefinition__NameAssignment_1_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1286:1: ( ( rule__ContainerElementDefinition__NameAssignment_1_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1287:1: ( rule__ContainerElementDefinition__NameAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNameAssignment_1_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1288:1: ( rule__ContainerElementDefinition__NameAssignment_1_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1288:2: rule__ContainerElementDefinition__NameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__NameAssignment_1_2_in_rule__ContainerElementDefinition__Group_1__2__Impl2568);
            rule__ContainerElementDefinition__NameAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getNameAssignment_1_2()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__2__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__3"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1298:1: rule__ContainerElementDefinition__Group_1__3 : rule__ContainerElementDefinition__Group_1__3__Impl rule__ContainerElementDefinition__Group_1__4 ;
    public final void rule__ContainerElementDefinition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1302:1: ( rule__ContainerElementDefinition__Group_1__3__Impl rule__ContainerElementDefinition__Group_1__4 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1303:2: rule__ContainerElementDefinition__Group_1__3__Impl rule__ContainerElementDefinition__Group_1__4
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__3__Impl_in_rule__ContainerElementDefinition__Group_1__32598);
            rule__ContainerElementDefinition__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__4_in_rule__ContainerElementDefinition__Group_1__32601);
            rule__ContainerElementDefinition__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__3"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1310:1: rule__ContainerElementDefinition__Group_1__3__Impl : ( ( rule__ContainerElementDefinition__PropertiesAssignment_1_3 )* ) ;
    public final void rule__ContainerElementDefinition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1314:1: ( ( ( rule__ContainerElementDefinition__PropertiesAssignment_1_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1315:1: ( ( rule__ContainerElementDefinition__PropertiesAssignment_1_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1315:1: ( ( rule__ContainerElementDefinition__PropertiesAssignment_1_3 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1316:1: ( rule__ContainerElementDefinition__PropertiesAssignment_1_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAssignment_1_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1317:1: ( rule__ContainerElementDefinition__PropertiesAssignment_1_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1317:2: rule__ContainerElementDefinition__PropertiesAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_rule__ContainerElementDefinition__PropertiesAssignment_1_3_in_rule__ContainerElementDefinition__Group_1__3__Impl2628);
            	    rule__ContainerElementDefinition__PropertiesAssignment_1_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAssignment_1_3()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__3__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__4"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1327:1: rule__ContainerElementDefinition__Group_1__4 : rule__ContainerElementDefinition__Group_1__4__Impl rule__ContainerElementDefinition__Group_1__5 ;
    public final void rule__ContainerElementDefinition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1331:1: ( rule__ContainerElementDefinition__Group_1__4__Impl rule__ContainerElementDefinition__Group_1__5 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1332:2: rule__ContainerElementDefinition__Group_1__4__Impl rule__ContainerElementDefinition__Group_1__5
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__4__Impl_in_rule__ContainerElementDefinition__Group_1__42659);
            rule__ContainerElementDefinition__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__5_in_rule__ContainerElementDefinition__Group_1__42662);
            rule__ContainerElementDefinition__Group_1__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__4"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1339:1: rule__ContainerElementDefinition__Group_1__4__Impl : ( '>' ) ;
    public final void rule__ContainerElementDefinition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1343:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1344:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1344:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1345:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_1_4()); 
            }
            match(input,14,FOLLOW_14_in_rule__ContainerElementDefinition__Group_1__4__Impl2690); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_1_4()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__4__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__5"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1358:1: rule__ContainerElementDefinition__Group_1__5 : rule__ContainerElementDefinition__Group_1__5__Impl rule__ContainerElementDefinition__Group_1__6 ;
    public final void rule__ContainerElementDefinition__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1362:1: ( rule__ContainerElementDefinition__Group_1__5__Impl rule__ContainerElementDefinition__Group_1__6 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1363:2: rule__ContainerElementDefinition__Group_1__5__Impl rule__ContainerElementDefinition__Group_1__6
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__5__Impl_in_rule__ContainerElementDefinition__Group_1__52721);
            rule__ContainerElementDefinition__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__6_in_rule__ContainerElementDefinition__Group_1__52724);
            rule__ContainerElementDefinition__Group_1__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__5"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1370:1: rule__ContainerElementDefinition__Group_1__5__Impl : ( ( rule__ContainerElementDefinition__ContentAssignment_1_5 ) ) ;
    public final void rule__ContainerElementDefinition__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1374:1: ( ( ( rule__ContainerElementDefinition__ContentAssignment_1_5 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1375:1: ( ( rule__ContainerElementDefinition__ContentAssignment_1_5 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1375:1: ( ( rule__ContainerElementDefinition__ContentAssignment_1_5 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1376:1: ( rule__ContainerElementDefinition__ContentAssignment_1_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getContentAssignment_1_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1377:1: ( rule__ContainerElementDefinition__ContentAssignment_1_5 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1377:2: rule__ContainerElementDefinition__ContentAssignment_1_5
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__ContentAssignment_1_5_in_rule__ContainerElementDefinition__Group_1__5__Impl2751);
            rule__ContainerElementDefinition__ContentAssignment_1_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getContentAssignment_1_5()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__5__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__6"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1387:1: rule__ContainerElementDefinition__Group_1__6 : rule__ContainerElementDefinition__Group_1__6__Impl rule__ContainerElementDefinition__Group_1__7 ;
    public final void rule__ContainerElementDefinition__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1391:1: ( rule__ContainerElementDefinition__Group_1__6__Impl rule__ContainerElementDefinition__Group_1__7 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1392:2: rule__ContainerElementDefinition__Group_1__6__Impl rule__ContainerElementDefinition__Group_1__7
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__6__Impl_in_rule__ContainerElementDefinition__Group_1__62781);
            rule__ContainerElementDefinition__Group_1__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__7_in_rule__ContainerElementDefinition__Group_1__62784);
            rule__ContainerElementDefinition__Group_1__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__6"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1399:1: rule__ContainerElementDefinition__Group_1__6__Impl : ( '</' ) ;
    public final void rule__ContainerElementDefinition__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1403:1: ( ( '</' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1404:1: ( '</' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1404:1: ( '</' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1405:1: '</'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignSolidusKeyword_1_6()); 
            }
            match(input,15,FOLLOW_15_in_rule__ContainerElementDefinition__Group_1__6__Impl2812); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignSolidusKeyword_1_6()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__6__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__7"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1418:1: rule__ContainerElementDefinition__Group_1__7 : rule__ContainerElementDefinition__Group_1__7__Impl rule__ContainerElementDefinition__Group_1__8 ;
    public final void rule__ContainerElementDefinition__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1422:1: ( rule__ContainerElementDefinition__Group_1__7__Impl rule__ContainerElementDefinition__Group_1__8 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1423:2: rule__ContainerElementDefinition__Group_1__7__Impl rule__ContainerElementDefinition__Group_1__8
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__7__Impl_in_rule__ContainerElementDefinition__Group_1__72843);
            rule__ContainerElementDefinition__Group_1__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__8_in_rule__ContainerElementDefinition__Group_1__72846);
            rule__ContainerElementDefinition__Group_1__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__7"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__7__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1430:1: rule__ContainerElementDefinition__Group_1__7__Impl : ( ( rule__ContainerElementDefinition__Group_1_7__0 )? ) ;
    public final void rule__ContainerElementDefinition__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1434:1: ( ( ( rule__ContainerElementDefinition__Group_1_7__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1435:1: ( ( rule__ContainerElementDefinition__Group_1_7__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1435:1: ( ( rule__ContainerElementDefinition__Group_1_7__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1436:1: ( rule__ContainerElementDefinition__Group_1_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGroup_1_7()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1437:1: ( rule__ContainerElementDefinition__Group_1_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==16) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1437:2: rule__ContainerElementDefinition__Group_1_7__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_7__0_in_rule__ContainerElementDefinition__Group_1__7__Impl2873);
                    rule__ContainerElementDefinition__Group_1_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getGroup_1_7()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__7__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__8"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1447:1: rule__ContainerElementDefinition__Group_1__8 : rule__ContainerElementDefinition__Group_1__8__Impl rule__ContainerElementDefinition__Group_1__9 ;
    public final void rule__ContainerElementDefinition__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1451:1: ( rule__ContainerElementDefinition__Group_1__8__Impl rule__ContainerElementDefinition__Group_1__9 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1452:2: rule__ContainerElementDefinition__Group_1__8__Impl rule__ContainerElementDefinition__Group_1__9
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__8__Impl_in_rule__ContainerElementDefinition__Group_1__82904);
            rule__ContainerElementDefinition__Group_1__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__9_in_rule__ContainerElementDefinition__Group_1__82907);
            rule__ContainerElementDefinition__Group_1__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__8"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__8__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1459:1: rule__ContainerElementDefinition__Group_1__8__Impl : ( ( rule__ContainerElementDefinition__EndnameAssignment_1_8 ) ) ;
    public final void rule__ContainerElementDefinition__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1463:1: ( ( ( rule__ContainerElementDefinition__EndnameAssignment_1_8 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1464:1: ( ( rule__ContainerElementDefinition__EndnameAssignment_1_8 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1464:1: ( ( rule__ContainerElementDefinition__EndnameAssignment_1_8 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1465:1: ( rule__ContainerElementDefinition__EndnameAssignment_1_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnameAssignment_1_8()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1466:1: ( rule__ContainerElementDefinition__EndnameAssignment_1_8 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1466:2: rule__ContainerElementDefinition__EndnameAssignment_1_8
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__EndnameAssignment_1_8_in_rule__ContainerElementDefinition__Group_1__8__Impl2934);
            rule__ContainerElementDefinition__EndnameAssignment_1_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getEndnameAssignment_1_8()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__8__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__9"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1476:1: rule__ContainerElementDefinition__Group_1__9 : rule__ContainerElementDefinition__Group_1__9__Impl ;
    public final void rule__ContainerElementDefinition__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1480:1: ( rule__ContainerElementDefinition__Group_1__9__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1481:2: rule__ContainerElementDefinition__Group_1__9__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__9__Impl_in_rule__ContainerElementDefinition__Group_1__92964);
            rule__ContainerElementDefinition__Group_1__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__9"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__9__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1487:1: rule__ContainerElementDefinition__Group_1__9__Impl : ( '>' ) ;
    public final void rule__ContainerElementDefinition__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1491:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1492:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1492:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1493:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_1_9()); 
            }
            match(input,14,FOLLOW_14_in_rule__ContainerElementDefinition__Group_1__9__Impl2992); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_1_9()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1__9__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1_1__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1526:1: rule__ContainerElementDefinition__Group_1_1__0 : rule__ContainerElementDefinition__Group_1_1__0__Impl rule__ContainerElementDefinition__Group_1_1__1 ;
    public final void rule__ContainerElementDefinition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1530:1: ( rule__ContainerElementDefinition__Group_1_1__0__Impl rule__ContainerElementDefinition__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1531:2: rule__ContainerElementDefinition__Group_1_1__0__Impl rule__ContainerElementDefinition__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_1__0__Impl_in_rule__ContainerElementDefinition__Group_1_1__03043);
            rule__ContainerElementDefinition__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_1__1_in_rule__ContainerElementDefinition__Group_1_1__03046);
            rule__ContainerElementDefinition__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1_1__0"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1538:1: rule__ContainerElementDefinition__Group_1_1__0__Impl : ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 ) ) ;
    public final void rule__ContainerElementDefinition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1542:1: ( ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1543:1: ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1543:1: ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1544:1: ( rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNamespaceAssignment_1_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1545:1: ( rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1545:2: rule__ContainerElementDefinition__NamespaceAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__NamespaceAssignment_1_1_0_in_rule__ContainerElementDefinition__Group_1_1__0__Impl3073);
            rule__ContainerElementDefinition__NamespaceAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getNamespaceAssignment_1_1_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1_1__0__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1_1__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1555:1: rule__ContainerElementDefinition__Group_1_1__1 : rule__ContainerElementDefinition__Group_1_1__1__Impl ;
    public final void rule__ContainerElementDefinition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1559:1: ( rule__ContainerElementDefinition__Group_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1560:2: rule__ContainerElementDefinition__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_1__1__Impl_in_rule__ContainerElementDefinition__Group_1_1__13103);
            rule__ContainerElementDefinition__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1_1__1"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1566:1: rule__ContainerElementDefinition__Group_1_1__1__Impl : ( ':' ) ;
    public final void rule__ContainerElementDefinition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1570:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1571:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1571:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1572:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_1_1_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__ContainerElementDefinition__Group_1_1__1__Impl3131); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_1_1_1()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1_1__1__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1_7__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1589:1: rule__ContainerElementDefinition__Group_1_7__0 : rule__ContainerElementDefinition__Group_1_7__0__Impl rule__ContainerElementDefinition__Group_1_7__1 ;
    public final void rule__ContainerElementDefinition__Group_1_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1593:1: ( rule__ContainerElementDefinition__Group_1_7__0__Impl rule__ContainerElementDefinition__Group_1_7__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1594:2: rule__ContainerElementDefinition__Group_1_7__0__Impl rule__ContainerElementDefinition__Group_1_7__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_7__0__Impl_in_rule__ContainerElementDefinition__Group_1_7__03166);
            rule__ContainerElementDefinition__Group_1_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_7__1_in_rule__ContainerElementDefinition__Group_1_7__03169);
            rule__ContainerElementDefinition__Group_1_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1_7__0"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1_7__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1601:1: rule__ContainerElementDefinition__Group_1_7__0__Impl : ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 ) ) ;
    public final void rule__ContainerElementDefinition__Group_1_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1605:1: ( ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1606:1: ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1606:1: ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1607:1: ( rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceAssignment_1_7_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1608:1: ( rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1608:2: rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0_in_rule__ContainerElementDefinition__Group_1_7__0__Impl3196);
            rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceAssignment_1_7_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1_7__0__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1_7__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1618:1: rule__ContainerElementDefinition__Group_1_7__1 : rule__ContainerElementDefinition__Group_1_7__1__Impl ;
    public final void rule__ContainerElementDefinition__Group_1_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1622:1: ( rule__ContainerElementDefinition__Group_1_7__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1623:2: rule__ContainerElementDefinition__Group_1_7__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_7__1__Impl_in_rule__ContainerElementDefinition__Group_1_7__13226);
            rule__ContainerElementDefinition__Group_1_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerElementDefinition__Group_1_7__1"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1_7__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1629:1: rule__ContainerElementDefinition__Group_1_7__1__Impl : ( ':' ) ;
    public final void rule__ContainerElementDefinition__Group_1_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1633:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1634:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1634:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1635:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_1_7_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__ContainerElementDefinition__Group_1_7__1__Impl3254); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_1_7_1()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_1_7__1__Impl"


    // $ANTLR start "rule__EmptyElementDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1652:1: rule__EmptyElementDefinition__Group__0 : rule__EmptyElementDefinition__Group__0__Impl rule__EmptyElementDefinition__Group__1 ;
    public final void rule__EmptyElementDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1656:1: ( rule__EmptyElementDefinition__Group__0__Impl rule__EmptyElementDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1657:2: rule__EmptyElementDefinition__Group__0__Impl rule__EmptyElementDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__0__Impl_in_rule__EmptyElementDefinition__Group__03289);
            rule__EmptyElementDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__1_in_rule__EmptyElementDefinition__Group__03292);
            rule__EmptyElementDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyElementDefinition__Group__0"


    // $ANTLR start "rule__EmptyElementDefinition__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1664:1: rule__EmptyElementDefinition__Group__0__Impl : ( '<' ) ;
    public final void rule__EmptyElementDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1668:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1669:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1669:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1670:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getLessThanSignKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__EmptyElementDefinition__Group__0__Impl3320); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyElementDefinitionAccess().getLessThanSignKeyword_0()); 
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
    // $ANTLR end "rule__EmptyElementDefinition__Group__0__Impl"


    // $ANTLR start "rule__EmptyElementDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1683:1: rule__EmptyElementDefinition__Group__1 : rule__EmptyElementDefinition__Group__1__Impl rule__EmptyElementDefinition__Group__2 ;
    public final void rule__EmptyElementDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1687:1: ( rule__EmptyElementDefinition__Group__1__Impl rule__EmptyElementDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1688:2: rule__EmptyElementDefinition__Group__1__Impl rule__EmptyElementDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__1__Impl_in_rule__EmptyElementDefinition__Group__13351);
            rule__EmptyElementDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__2_in_rule__EmptyElementDefinition__Group__13354);
            rule__EmptyElementDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyElementDefinition__Group__1"


    // $ANTLR start "rule__EmptyElementDefinition__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1695:1: rule__EmptyElementDefinition__Group__1__Impl : ( ( rule__EmptyElementDefinition__Group_1__0 )? ) ;
    public final void rule__EmptyElementDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1699:1: ( ( ( rule__EmptyElementDefinition__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1700:1: ( ( rule__EmptyElementDefinition__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1700:1: ( ( rule__EmptyElementDefinition__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1701:1: ( rule__EmptyElementDefinition__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1702:1: ( rule__EmptyElementDefinition__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==16) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1702:2: rule__EmptyElementDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__0_in_rule__EmptyElementDefinition__Group__1__Impl3381);
                    rule__EmptyElementDefinition__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyElementDefinitionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__EmptyElementDefinition__Group__1__Impl"


    // $ANTLR start "rule__EmptyElementDefinition__Group__2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1712:1: rule__EmptyElementDefinition__Group__2 : rule__EmptyElementDefinition__Group__2__Impl rule__EmptyElementDefinition__Group__3 ;
    public final void rule__EmptyElementDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1716:1: ( rule__EmptyElementDefinition__Group__2__Impl rule__EmptyElementDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1717:2: rule__EmptyElementDefinition__Group__2__Impl rule__EmptyElementDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__2__Impl_in_rule__EmptyElementDefinition__Group__23412);
            rule__EmptyElementDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__3_in_rule__EmptyElementDefinition__Group__23415);
            rule__EmptyElementDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyElementDefinition__Group__2"


    // $ANTLR start "rule__EmptyElementDefinition__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1724:1: rule__EmptyElementDefinition__Group__2__Impl : ( ( rule__EmptyElementDefinition__NameAssignment_2 ) ) ;
    public final void rule__EmptyElementDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1728:1: ( ( ( rule__EmptyElementDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1729:1: ( ( rule__EmptyElementDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1729:1: ( ( rule__EmptyElementDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1730:1: ( rule__EmptyElementDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1731:1: ( rule__EmptyElementDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1731:2: rule__EmptyElementDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__NameAssignment_2_in_rule__EmptyElementDefinition__Group__2__Impl3442);
            rule__EmptyElementDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyElementDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__EmptyElementDefinition__Group__2__Impl"


    // $ANTLR start "rule__EmptyElementDefinition__Group__3"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1741:1: rule__EmptyElementDefinition__Group__3 : rule__EmptyElementDefinition__Group__3__Impl rule__EmptyElementDefinition__Group__4 ;
    public final void rule__EmptyElementDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1745:1: ( rule__EmptyElementDefinition__Group__3__Impl rule__EmptyElementDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1746:2: rule__EmptyElementDefinition__Group__3__Impl rule__EmptyElementDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__3__Impl_in_rule__EmptyElementDefinition__Group__33472);
            rule__EmptyElementDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__4_in_rule__EmptyElementDefinition__Group__33475);
            rule__EmptyElementDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyElementDefinition__Group__3"


    // $ANTLR start "rule__EmptyElementDefinition__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1753:1: rule__EmptyElementDefinition__Group__3__Impl : ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* ) ;
    public final void rule__EmptyElementDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1757:1: ( ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1758:1: ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1758:1: ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1759:1: ( rule__EmptyElementDefinition__PropsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getPropsAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1760:1: ( rule__EmptyElementDefinition__PropsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1760:2: rule__EmptyElementDefinition__PropsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__EmptyElementDefinition__PropsAssignment_3_in_rule__EmptyElementDefinition__Group__3__Impl3502);
            	    rule__EmptyElementDefinition__PropsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyElementDefinitionAccess().getPropsAssignment_3()); 
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
    // $ANTLR end "rule__EmptyElementDefinition__Group__3__Impl"


    // $ANTLR start "rule__EmptyElementDefinition__Group__4"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1770:1: rule__EmptyElementDefinition__Group__4 : rule__EmptyElementDefinition__Group__4__Impl ;
    public final void rule__EmptyElementDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1774:1: ( rule__EmptyElementDefinition__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1775:2: rule__EmptyElementDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__4__Impl_in_rule__EmptyElementDefinition__Group__43533);
            rule__EmptyElementDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyElementDefinition__Group__4"


    // $ANTLR start "rule__EmptyElementDefinition__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1781:1: rule__EmptyElementDefinition__Group__4__Impl : ( '/>' ) ;
    public final void rule__EmptyElementDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1785:1: ( ( '/>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1786:1: ( '/>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1786:1: ( '/>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1787:1: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getSolidusGreaterThanSignKeyword_4()); 
            }
            match(input,17,FOLLOW_17_in_rule__EmptyElementDefinition__Group__4__Impl3561); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyElementDefinitionAccess().getSolidusGreaterThanSignKeyword_4()); 
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
    // $ANTLR end "rule__EmptyElementDefinition__Group__4__Impl"


    // $ANTLR start "rule__EmptyElementDefinition__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1810:1: rule__EmptyElementDefinition__Group_1__0 : rule__EmptyElementDefinition__Group_1__0__Impl rule__EmptyElementDefinition__Group_1__1 ;
    public final void rule__EmptyElementDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1814:1: ( rule__EmptyElementDefinition__Group_1__0__Impl rule__EmptyElementDefinition__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1815:2: rule__EmptyElementDefinition__Group_1__0__Impl rule__EmptyElementDefinition__Group_1__1
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__0__Impl_in_rule__EmptyElementDefinition__Group_1__03602);
            rule__EmptyElementDefinition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__1_in_rule__EmptyElementDefinition__Group_1__03605);
            rule__EmptyElementDefinition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyElementDefinition__Group_1__0"


    // $ANTLR start "rule__EmptyElementDefinition__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1822:1: rule__EmptyElementDefinition__Group_1__0__Impl : ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) ) ;
    public final void rule__EmptyElementDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1826:1: ( ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1827:1: ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1827:1: ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1828:1: ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNamespaceAssignment_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1829:1: ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1829:2: rule__EmptyElementDefinition__NamespaceAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__NamespaceAssignment_1_0_in_rule__EmptyElementDefinition__Group_1__0__Impl3632);
            rule__EmptyElementDefinition__NamespaceAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyElementDefinitionAccess().getNamespaceAssignment_1_0()); 
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
    // $ANTLR end "rule__EmptyElementDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__EmptyElementDefinition__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1839:1: rule__EmptyElementDefinition__Group_1__1 : rule__EmptyElementDefinition__Group_1__1__Impl ;
    public final void rule__EmptyElementDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1843:1: ( rule__EmptyElementDefinition__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1844:2: rule__EmptyElementDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__1__Impl_in_rule__EmptyElementDefinition__Group_1__13662);
            rule__EmptyElementDefinition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyElementDefinition__Group_1__1"


    // $ANTLR start "rule__EmptyElementDefinition__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1850:1: rule__EmptyElementDefinition__Group_1__1__Impl : ( ':' ) ;
    public final void rule__EmptyElementDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1854:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1855:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1855:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1856:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getColonKeyword_1_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__EmptyElementDefinition__Group_1__1__Impl3690); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyElementDefinitionAccess().getColonKeyword_1_1()); 
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
    // $ANTLR end "rule__EmptyElementDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__AttributePropertyDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1873:1: rule__AttributePropertyDefinition__Group__0 : rule__AttributePropertyDefinition__Group__0__Impl rule__AttributePropertyDefinition__Group__1 ;
    public final void rule__AttributePropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1877:1: ( rule__AttributePropertyDefinition__Group__0__Impl rule__AttributePropertyDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1878:2: rule__AttributePropertyDefinition__Group__0__Impl rule__AttributePropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__0__Impl_in_rule__AttributePropertyDefinition__Group__03725);
            rule__AttributePropertyDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__1_in_rule__AttributePropertyDefinition__Group__03728);
            rule__AttributePropertyDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePropertyDefinition__Group__0"


    // $ANTLR start "rule__AttributePropertyDefinition__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1885:1: rule__AttributePropertyDefinition__Group__0__Impl : ( ( rule__AttributePropertyDefinition__Group_0__0 )? ) ;
    public final void rule__AttributePropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1889:1: ( ( ( rule__AttributePropertyDefinition__Group_0__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1890:1: ( ( rule__AttributePropertyDefinition__Group_0__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1890:1: ( ( rule__AttributePropertyDefinition__Group_0__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1891:1: ( rule__AttributePropertyDefinition__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getGroup_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1892:1: ( rule__AttributePropertyDefinition__Group_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==16) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1892:2: rule__AttributePropertyDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__0_in_rule__AttributePropertyDefinition__Group__0__Impl3755);
                    rule__AttributePropertyDefinition__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePropertyDefinitionAccess().getGroup_0()); 
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
    // $ANTLR end "rule__AttributePropertyDefinition__Group__0__Impl"


    // $ANTLR start "rule__AttributePropertyDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1902:1: rule__AttributePropertyDefinition__Group__1 : rule__AttributePropertyDefinition__Group__1__Impl rule__AttributePropertyDefinition__Group__2 ;
    public final void rule__AttributePropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1906:1: ( rule__AttributePropertyDefinition__Group__1__Impl rule__AttributePropertyDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1907:2: rule__AttributePropertyDefinition__Group__1__Impl rule__AttributePropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__1__Impl_in_rule__AttributePropertyDefinition__Group__13786);
            rule__AttributePropertyDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__2_in_rule__AttributePropertyDefinition__Group__13789);
            rule__AttributePropertyDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePropertyDefinition__Group__1"


    // $ANTLR start "rule__AttributePropertyDefinition__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1914:1: rule__AttributePropertyDefinition__Group__1__Impl : ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) ) ;
    public final void rule__AttributePropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1918:1: ( ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1919:1: ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1919:1: ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1920:1: ( rule__AttributePropertyDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1921:1: ( rule__AttributePropertyDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1921:2: rule__AttributePropertyDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__NameAssignment_1_in_rule__AttributePropertyDefinition__Group__1__Impl3816);
            rule__AttributePropertyDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePropertyDefinitionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__AttributePropertyDefinition__Group__1__Impl"


    // $ANTLR start "rule__AttributePropertyDefinition__Group__2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1931:1: rule__AttributePropertyDefinition__Group__2 : rule__AttributePropertyDefinition__Group__2__Impl rule__AttributePropertyDefinition__Group__3 ;
    public final void rule__AttributePropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1935:1: ( rule__AttributePropertyDefinition__Group__2__Impl rule__AttributePropertyDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1936:2: rule__AttributePropertyDefinition__Group__2__Impl rule__AttributePropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__2__Impl_in_rule__AttributePropertyDefinition__Group__23846);
            rule__AttributePropertyDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__3_in_rule__AttributePropertyDefinition__Group__23849);
            rule__AttributePropertyDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePropertyDefinition__Group__2"


    // $ANTLR start "rule__AttributePropertyDefinition__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1943:1: rule__AttributePropertyDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__AttributePropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1947:1: ( ( '=' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1948:1: ( '=' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1948:1: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1949:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__AttributePropertyDefinition__Group__2__Impl3877); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePropertyDefinitionAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__AttributePropertyDefinition__Group__2__Impl"


    // $ANTLR start "rule__AttributePropertyDefinition__Group__3"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1962:1: rule__AttributePropertyDefinition__Group__3 : rule__AttributePropertyDefinition__Group__3__Impl ;
    public final void rule__AttributePropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1966:1: ( rule__AttributePropertyDefinition__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1967:2: rule__AttributePropertyDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__3__Impl_in_rule__AttributePropertyDefinition__Group__33908);
            rule__AttributePropertyDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePropertyDefinition__Group__3"


    // $ANTLR start "rule__AttributePropertyDefinition__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1973:1: rule__AttributePropertyDefinition__Group__3__Impl : ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) ) ;
    public final void rule__AttributePropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1977:1: ( ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1978:1: ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1978:1: ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1979:1: ( rule__AttributePropertyDefinition__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getValueAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1980:1: ( rule__AttributePropertyDefinition__ValueAssignment_3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1980:2: rule__AttributePropertyDefinition__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__ValueAssignment_3_in_rule__AttributePropertyDefinition__Group__3__Impl3935);
            rule__AttributePropertyDefinition__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePropertyDefinitionAccess().getValueAssignment_3()); 
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
    // $ANTLR end "rule__AttributePropertyDefinition__Group__3__Impl"


    // $ANTLR start "rule__AttributePropertyDefinition__Group_0__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1998:1: rule__AttributePropertyDefinition__Group_0__0 : rule__AttributePropertyDefinition__Group_0__0__Impl rule__AttributePropertyDefinition__Group_0__1 ;
    public final void rule__AttributePropertyDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2002:1: ( rule__AttributePropertyDefinition__Group_0__0__Impl rule__AttributePropertyDefinition__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2003:2: rule__AttributePropertyDefinition__Group_0__0__Impl rule__AttributePropertyDefinition__Group_0__1
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__0__Impl_in_rule__AttributePropertyDefinition__Group_0__03973);
            rule__AttributePropertyDefinition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__1_in_rule__AttributePropertyDefinition__Group_0__03976);
            rule__AttributePropertyDefinition__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePropertyDefinition__Group_0__0"


    // $ANTLR start "rule__AttributePropertyDefinition__Group_0__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2010:1: rule__AttributePropertyDefinition__Group_0__0__Impl : ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) ) ;
    public final void rule__AttributePropertyDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2014:1: ( ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2015:1: ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2015:1: ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2016:1: ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNamespaceAssignment_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2017:1: ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2017:2: rule__AttributePropertyDefinition__NamespaceAssignment_0_0
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__NamespaceAssignment_0_0_in_rule__AttributePropertyDefinition__Group_0__0__Impl4003);
            rule__AttributePropertyDefinition__NamespaceAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePropertyDefinitionAccess().getNamespaceAssignment_0_0()); 
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
    // $ANTLR end "rule__AttributePropertyDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__AttributePropertyDefinition__Group_0__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2027:1: rule__AttributePropertyDefinition__Group_0__1 : rule__AttributePropertyDefinition__Group_0__1__Impl ;
    public final void rule__AttributePropertyDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2031:1: ( rule__AttributePropertyDefinition__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2032:2: rule__AttributePropertyDefinition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__1__Impl_in_rule__AttributePropertyDefinition__Group_0__14033);
            rule__AttributePropertyDefinition__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePropertyDefinition__Group_0__1"


    // $ANTLR start "rule__AttributePropertyDefinition__Group_0__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2038:1: rule__AttributePropertyDefinition__Group_0__1__Impl : ( ':' ) ;
    public final void rule__AttributePropertyDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2042:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2043:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2043:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2044:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getColonKeyword_0_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__AttributePropertyDefinition__Group_0__1__Impl4061); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePropertyDefinitionAccess().getColonKeyword_0_1()); 
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
    // $ANTLR end "rule__AttributePropertyDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2061:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2065:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2066:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04096);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04099);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2073:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2077:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2078:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2078:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2079:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4126); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2090:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2094:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2095:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14155);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2101:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2105:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2106:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2106:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2107:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2108:1: ( rule__QualifiedName__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==9) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==RULE_ID) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2108:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4182);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2122:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2126:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2127:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04217);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04220);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2134:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2138:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2139:1: ( ( '.' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2139:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2140:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2141:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2142:2: '.'
            {
            match(input,9,FOLLOW_9_in_rule__QualifiedName__Group_1__0__Impl4249); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2153:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2157:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2158:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14281);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2164:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2168:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2169:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2169:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2170:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4308); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2185:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2189:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2190:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__04341);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__04344);
            rule__QualifiedNameWithWildCard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2197:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2201:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2202:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2202:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2203:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl4371);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2214:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2218:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2219:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__14400);
            rule__QualifiedNameWithWildCard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2225:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2229:1: ( ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2230:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2230:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2231:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2232:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==9) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2232:2: rule__QualifiedNameWithWildCard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl4427);
                    rule__QualifiedNameWithWildCard__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2246:1: rule__QualifiedNameWithWildCard__Group_1__0 : rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2250:1: ( rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2251:2: rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__04462);
            rule__QualifiedNameWithWildCard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__04465);
            rule__QualifiedNameWithWildCard__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2258:1: rule__QualifiedNameWithWildCard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2262:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2263:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2263:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2264:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,9,FOLLOW_9_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl4493); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2277:1: rule__QualifiedNameWithWildCard__Group_1__1 : rule__QualifiedNameWithWildCard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2281:1: ( rule__QualifiedNameWithWildCard__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2282:2: rule__QualifiedNameWithWildCard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__14524);
            rule__QualifiedNameWithWildCard__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2288:1: rule__QualifiedNameWithWildCard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2292:1: ( ( '*' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2293:1: ( '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2293:1: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2294:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl4552); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group_1__1__Impl"


    // $ANTLR start "rule__FXML__XmlDecAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2312:1: rule__FXML__XmlDecAssignment_0 : ( ruleXMLDec ) ;
    public final void rule__FXML__XmlDecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2316:1: ( ( ruleXMLDec ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2317:1: ( ruleXMLDec )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2317:1: ( ruleXMLDec )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2318:1: ruleXMLDec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getXmlDecXMLDecParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleXMLDec_in_rule__FXML__XmlDecAssignment_04592);
            ruleXMLDec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFXMLAccess().getXmlDecXMLDecParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__FXML__XmlDecAssignment_0"


    // $ANTLR start "rule__FXML__ProcessingInstructionsAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2327:1: rule__FXML__ProcessingInstructionsAssignment_1 : ( ruleProcessingInstruction ) ;
    public final void rule__FXML__ProcessingInstructionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2331:1: ( ( ruleProcessingInstruction ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2332:1: ( ruleProcessingInstruction )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2332:1: ( ruleProcessingInstruction )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2333:1: ruleProcessingInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getProcessingInstructionsProcessingInstructionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleProcessingInstruction_in_rule__FXML__ProcessingInstructionsAssignment_14623);
            ruleProcessingInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFXMLAccess().getProcessingInstructionsProcessingInstructionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__FXML__ProcessingInstructionsAssignment_1"


    // $ANTLR start "rule__FXML__RootElementAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2342:1: rule__FXML__RootElementAssignment_2 : ( ruleElementDefinition ) ;
    public final void rule__FXML__RootElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2346:1: ( ( ruleElementDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2347:1: ( ruleElementDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2347:1: ( ruleElementDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2348:1: ruleElementDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getRootElementElementDefinitionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_rule__FXML__RootElementAssignment_24654);
            ruleElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFXMLAccess().getRootElementElementDefinitionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__FXML__RootElementAssignment_2"


    // $ANTLR start "rule__XMLDec__PropsAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2357:1: rule__XMLDec__PropsAssignment_1 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__XMLDec__PropsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2361:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2362:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2362:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2363:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getPropsAttributePropertyDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__XMLDec__PropsAssignment_14685);
            ruleAttributePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMLDecAccess().getPropsAttributePropertyDefinitionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__XMLDec__PropsAssignment_1"


    // $ANTLR start "rule__ProcessingInstruction__TypeAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2372:1: rule__ProcessingInstruction__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProcessingInstruction__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2376:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2377:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2377:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2378:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getTypeIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessingInstruction__TypeAssignment_14716); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessingInstructionAccess().getTypeIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ProcessingInstruction__TypeAssignment_1"


    // $ANTLR start "rule__ProcessingInstruction__ImportedNamespaceAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2387:1: rule__ProcessingInstruction__ImportedNamespaceAssignment_2 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__ProcessingInstruction__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2391:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2392:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2392:1: ( ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2393:1: ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__ProcessingInstruction__ImportedNamespaceAssignment_24747);
            ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessingInstructionAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ProcessingInstruction__ImportedNamespaceAssignment_2"


    // $ANTLR start "rule__ContainerElementDefinition__NamespaceAssignment_0_1_0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2402:1: rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__ContainerElementDefinition__NamespaceAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2406:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2407:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2407:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2408:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNamespaceIDTerminalRuleCall_0_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__NamespaceAssignment_0_1_04778); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getNamespaceIDTerminalRuleCall_0_1_0_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__NamespaceAssignment_0_1_0"


    // $ANTLR start "rule__ContainerElementDefinition__NameAssignment_0_2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2417:1: rule__ContainerElementDefinition__NameAssignment_0_2 : ( ruleQualifiedName ) ;
    public final void rule__ContainerElementDefinition__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2421:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2422:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2422:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2423:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNameQualifiedNameParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__NameAssignment_0_24809);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getNameQualifiedNameParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__NameAssignment_0_2"


    // $ANTLR start "rule__ContainerElementDefinition__PropertiesAssignment_0_3"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2432:1: rule__ContainerElementDefinition__PropertiesAssignment_0_3 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__ContainerElementDefinition__PropertiesAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2436:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2437:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2437:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2438:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAttributePropertyDefinitionParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__ContainerElementDefinition__PropertiesAssignment_0_34840);
            ruleAttributePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAttributePropertyDefinitionParserRuleCall_0_3_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__PropertiesAssignment_0_3"


    // $ANTLR start "rule__ContainerElementDefinition__ChildrenAssignment_0_5"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2447:1: rule__ContainerElementDefinition__ChildrenAssignment_0_5 : ( ruleElementDefinition ) ;
    public final void rule__ContainerElementDefinition__ChildrenAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2451:1: ( ( ruleElementDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2452:1: ( ruleElementDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2452:1: ( ruleElementDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2453:1: ruleElementDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getChildrenElementDefinitionParserRuleCall_0_5_0()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_rule__ContainerElementDefinition__ChildrenAssignment_0_54871);
            ruleElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getChildrenElementDefinitionParserRuleCall_0_5_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__ChildrenAssignment_0_5"


    // $ANTLR start "rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2462:1: rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 : ( RULE_ID ) ;
    public final void rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2466:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2467:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2467:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2468:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceIDTerminalRuleCall_0_7_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_04902); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceIDTerminalRuleCall_0_7_0_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0"


    // $ANTLR start "rule__ContainerElementDefinition__EndnameAssignment_0_8"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2477:1: rule__ContainerElementDefinition__EndnameAssignment_0_8 : ( ruleQualifiedName ) ;
    public final void rule__ContainerElementDefinition__EndnameAssignment_0_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2481:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2482:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2482:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2483:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnameQualifiedNameParserRuleCall_0_8_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__EndnameAssignment_0_84933);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getEndnameQualifiedNameParserRuleCall_0_8_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__EndnameAssignment_0_8"


    // $ANTLR start "rule__ContainerElementDefinition__NamespaceAssignment_1_1_0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2492:1: rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__ContainerElementDefinition__NamespaceAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2496:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2497:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2497:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2498:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__NamespaceAssignment_1_1_04964); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_1_0_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__NamespaceAssignment_1_1_0"


    // $ANTLR start "rule__ContainerElementDefinition__NameAssignment_1_2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2507:1: rule__ContainerElementDefinition__NameAssignment_1_2 : ( ruleQualifiedName ) ;
    public final void rule__ContainerElementDefinition__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2511:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2512:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2512:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2513:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNameQualifiedNameParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__NameAssignment_1_24995);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getNameQualifiedNameParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__NameAssignment_1_2"


    // $ANTLR start "rule__ContainerElementDefinition__PropertiesAssignment_1_3"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2522:1: rule__ContainerElementDefinition__PropertiesAssignment_1_3 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__ContainerElementDefinition__PropertiesAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2526:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2527:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2527:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2528:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAttributePropertyDefinitionParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__ContainerElementDefinition__PropertiesAssignment_1_35026);
            ruleAttributePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAttributePropertyDefinitionParserRuleCall_1_3_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__PropertiesAssignment_1_3"


    // $ANTLR start "rule__ContainerElementDefinition__ContentAssignment_1_5"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2537:1: rule__ContainerElementDefinition__ContentAssignment_1_5 : ( ruleContent ) ;
    public final void rule__ContainerElementDefinition__ContentAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2541:1: ( ( ruleContent ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2542:1: ( ruleContent )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2542:1: ( ruleContent )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2543:1: ruleContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getContentContentParserRuleCall_1_5_0()); 
            }
            pushFollow(FOLLOW_ruleContent_in_rule__ContainerElementDefinition__ContentAssignment_1_55057);
            ruleContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getContentContentParserRuleCall_1_5_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__ContentAssignment_1_5"


    // $ANTLR start "rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2552:1: rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 : ( RULE_ID ) ;
    public final void rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2556:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2557:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2557:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2558:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceIDTerminalRuleCall_1_7_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_05088); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceIDTerminalRuleCall_1_7_0_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0"


    // $ANTLR start "rule__ContainerElementDefinition__EndnameAssignment_1_8"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2567:1: rule__ContainerElementDefinition__EndnameAssignment_1_8 : ( ruleQualifiedName ) ;
    public final void rule__ContainerElementDefinition__EndnameAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2571:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2572:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2572:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2573:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnameQualifiedNameParserRuleCall_1_8_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__EndnameAssignment_1_85119);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getEndnameQualifiedNameParserRuleCall_1_8_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__EndnameAssignment_1_8"


    // $ANTLR start "rule__EmptyElementDefinition__NamespaceAssignment_1_0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2582:1: rule__EmptyElementDefinition__NamespaceAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__EmptyElementDefinition__NamespaceAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2586:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2587:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2587:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2588:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EmptyElementDefinition__NamespaceAssignment_1_05150); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__EmptyElementDefinition__NamespaceAssignment_1_0"


    // $ANTLR start "rule__EmptyElementDefinition__NameAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2597:1: rule__EmptyElementDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__EmptyElementDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2601:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2602:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2602:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2603:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EmptyElementDefinition__NameAssignment_25181);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__EmptyElementDefinition__NameAssignment_2"


    // $ANTLR start "rule__EmptyElementDefinition__PropsAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2612:1: rule__EmptyElementDefinition__PropsAssignment_3 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__EmptyElementDefinition__PropsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2616:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2617:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2617:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2618:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getPropsAttributePropertyDefinitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__EmptyElementDefinition__PropsAssignment_35212);
            ruleAttributePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyElementDefinitionAccess().getPropsAttributePropertyDefinitionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__EmptyElementDefinition__PropsAssignment_3"


    // $ANTLR start "rule__AttributePropertyDefinition__NamespaceAssignment_0_0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2627:1: rule__AttributePropertyDefinition__NamespaceAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__AttributePropertyDefinition__NamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2631:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2632:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2632:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2633:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNamespaceIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributePropertyDefinition__NamespaceAssignment_0_05243); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePropertyDefinitionAccess().getNamespaceIDTerminalRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__AttributePropertyDefinition__NamespaceAssignment_0_0"


    // $ANTLR start "rule__AttributePropertyDefinition__NameAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2642:1: rule__AttributePropertyDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributePropertyDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2646:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2647:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2647:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2648:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributePropertyDefinition__NameAssignment_15274); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePropertyDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__AttributePropertyDefinition__NameAssignment_1"


    // $ANTLR start "rule__AttributePropertyDefinition__ValueAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2657:1: rule__AttributePropertyDefinition__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AttributePropertyDefinition__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2661:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2662:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2662:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2663:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttributePropertyDefinition__ValueAssignment_35305); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePropertyDefinitionAccess().getValueSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__AttributePropertyDefinition__ValueAssignment_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA2_eotS =
        "\16\uffff";
    static final String DFA2_eofS =
        "\16\uffff";
    static final String DFA2_minS =
        "\1\15\4\4\1\20\2\uffff\3\4\1\5\1\22\1\4";
    static final String DFA2_maxS =
        "\1\15\1\4\1\21\2\4\1\22\2\uffff\2\21\1\4\1\5\1\22\1\21";
    static final String DFA2_acceptS =
        "\6\uffff\1\2\1\1\6\uffff";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\2",
            "\1\5\4\uffff\1\4\4\uffff\1\7\1\uffff\1\3\1\6",
            "\1\10",
            "\1\11",
            "\1\12\1\uffff\1\13",
            "",
            "",
            "\1\5\4\uffff\1\4\4\uffff\1\7\2\uffff\1\6",
            "\1\5\4\uffff\1\4\4\uffff\1\7\2\uffff\1\6",
            "\1\14",
            "\1\15",
            "\1\13",
            "\1\5\11\uffff\1\7\2\uffff\1\6"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "349:1: rule__ElementDefinition__Alternatives : ( ( ruleContainerElementDefinition ) | ( ruleEmptyElementDefinition ) );";
        }
    }
    static final String DFA3_eotS =
        "\17\uffff";
    static final String DFA3_eofS =
        "\17\uffff";
    static final String DFA3_minS =
        "\1\15\3\4\1\20\3\4\1\5\1\4\2\uffff\2\4\1\22";
    static final String DFA3_maxS =
        "\1\15\1\4\1\20\1\4\1\22\1\17\1\4\1\16\1\5\1\4\2\uffff\2\16\1\22";
    static final String DFA3_acceptS =
        "\12\uffff\1\1\1\2\3\uffff";
    static final String DFA3_specialS =
        "\17\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\4\uffff\1\3\4\uffff\1\5\1\uffff\1\6",
            "\1\7",
            "\1\11\1\uffff\1\10",
            "\4\13\1\uffff\1\13\3\uffff\1\12\1\uffff\1\13",
            "\1\14",
            "\1\4\4\uffff\1\3\4\uffff\1\5",
            "\1\15",
            "\1\16",
            "",
            "",
            "\1\4\4\uffff\1\3\4\uffff\1\5",
            "\1\4\11\uffff\1\5",
            "\1\10"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "371:1: rule__ContainerElementDefinition__Alternatives : ( ( ( rule__ContainerElementDefinition__Group_0__0 ) ) | ( ( rule__ContainerElementDefinition__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleFXML_in_entryRuleFXML67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFXML74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__Group__0_in_ruleFXML100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDec_in_entryRuleXMLDec127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLDec134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__0_in_ruleXMLDec160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingInstruction_in_entryRuleProcessingInstruction187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessingInstruction194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__0_in_ruleProcessingInstruction220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDefinition254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementDefinition__Alternatives_in_ruleElementDefinition280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerElementDefinition_in_entryRuleContainerElementDefinition307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerElementDefinition314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Alternatives_in_ruleContainerElementDefinition340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyElementDefinition_in_entryRuleEmptyElementDefinition367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyElementDefinition374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__0_in_ruleEmptyElementDefinition400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_entryRuleAttributePropertyDefinition427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributePropertyDefinition434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__0_in_ruleAttributePropertyDefinition460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Alternatives_in_ruleContent529 = new BitSet(new long[]{0x00000000000002F2L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerElementDefinition_in_rule__ElementDefinition__Alternatives686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyElementDefinition_in_rule__ElementDefinition__Alternatives703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__0_in_rule__ContainerElementDefinition__Alternatives735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__0_in_rule__ContainerElementDefinition__Alternatives753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Content__Alternatives786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Content__Alternatives803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__Content__Alternatives820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Content__Alternatives837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Content__Alternatives855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__Group__0__Impl_in_rule__FXML__Group__0887 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__FXML__Group__1_in_rule__FXML__Group__0890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__XmlDecAssignment_0_in_rule__FXML__Group__0__Impl917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__Group__1__Impl_in_rule__FXML__Group__1947 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__FXML__Group__2_in_rule__FXML__Group__1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__ProcessingInstructionsAssignment_1_in_rule__FXML__Group__1__Impl977 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__FXML__Group__2__Impl_in_rule__FXML__Group__21008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__RootElementAssignment_2_in_rule__FXML__Group__2__Impl1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__0__Impl_in_rule__XMLDec__Group__01071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__1_in_rule__XMLDec__Group__01074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__XMLDec__Group__0__Impl1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__1__Impl_in_rule__XMLDec__Group__11133 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__2_in_rule__XMLDec__Group__11136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1165 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1177 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__2__Impl_in_rule__XMLDec__Group__21210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__XMLDec__Group__2__Impl1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__0__Impl_in_rule__ProcessingInstruction__Group__01275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__1_in_rule__ProcessingInstruction__Group__01278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ProcessingInstruction__Group__0__Impl1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__1__Impl_in_rule__ProcessingInstruction__Group__11337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__2_in_rule__ProcessingInstruction__Group__11340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__TypeAssignment_1_in_rule__ProcessingInstruction__Group__1__Impl1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__2__Impl_in_rule__ProcessingInstruction__Group__21397 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__3_in_rule__ProcessingInstruction__Group__21400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__ImportedNamespaceAssignment_2_in_rule__ProcessingInstruction__Group__2__Impl1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__3__Impl_in_rule__ProcessingInstruction__Group__31457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ProcessingInstruction__Group__3__Impl1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__0__Impl_in_rule__ContainerElementDefinition__Group_0__01524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__1_in_rule__ContainerElementDefinition__Group_0__01527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ContainerElementDefinition__Group_0__0__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__1__Impl_in_rule__ContainerElementDefinition__Group_0__11586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__2_in_rule__ContainerElementDefinition__Group_0__11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_1__0_in_rule__ContainerElementDefinition__Group_0__1__Impl1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__2__Impl_in_rule__ContainerElementDefinition__Group_0__21647 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__3_in_rule__ContainerElementDefinition__Group_0__21650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__NameAssignment_0_2_in_rule__ContainerElementDefinition__Group_0__2__Impl1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__3__Impl_in_rule__ContainerElementDefinition__Group_0__31707 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__4_in_rule__ContainerElementDefinition__Group_0__31710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__PropertiesAssignment_0_3_in_rule__ContainerElementDefinition__Group_0__3__Impl1737 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__4__Impl_in_rule__ContainerElementDefinition__Group_0__41768 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__5_in_rule__ContainerElementDefinition__Group_0__41771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ContainerElementDefinition__Group_0__4__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__5__Impl_in_rule__ContainerElementDefinition__Group_0__51830 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__6_in_rule__ContainerElementDefinition__Group_0__51833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__ChildrenAssignment_0_5_in_rule__ContainerElementDefinition__Group_0__5__Impl1862 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__ChildrenAssignment_0_5_in_rule__ContainerElementDefinition__Group_0__5__Impl1874 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__6__Impl_in_rule__ContainerElementDefinition__Group_0__61907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__7_in_rule__ContainerElementDefinition__Group_0__61910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ContainerElementDefinition__Group_0__6__Impl1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__7__Impl_in_rule__ContainerElementDefinition__Group_0__71969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__8_in_rule__ContainerElementDefinition__Group_0__71972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_7__0_in_rule__ContainerElementDefinition__Group_0__7__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__8__Impl_in_rule__ContainerElementDefinition__Group_0__82030 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__9_in_rule__ContainerElementDefinition__Group_0__82033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__EndnameAssignment_0_8_in_rule__ContainerElementDefinition__Group_0__8__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__9__Impl_in_rule__ContainerElementDefinition__Group_0__92090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ContainerElementDefinition__Group_0__9__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_1__0__Impl_in_rule__ContainerElementDefinition__Group_0_1__02169 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_1__1_in_rule__ContainerElementDefinition__Group_0_1__02172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__NamespaceAssignment_0_1_0_in_rule__ContainerElementDefinition__Group_0_1__0__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_1__1__Impl_in_rule__ContainerElementDefinition__Group_0_1__12229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ContainerElementDefinition__Group_0_1__1__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_7__0__Impl_in_rule__ContainerElementDefinition__Group_0_7__02292 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_7__1_in_rule__ContainerElementDefinition__Group_0_7__02295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0_in_rule__ContainerElementDefinition__Group_0_7__0__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_7__1__Impl_in_rule__ContainerElementDefinition__Group_0_7__12352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ContainerElementDefinition__Group_0_7__1__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__0__Impl_in_rule__ContainerElementDefinition__Group_1__02415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__1_in_rule__ContainerElementDefinition__Group_1__02418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ContainerElementDefinition__Group_1__0__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__1__Impl_in_rule__ContainerElementDefinition__Group_1__12477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__2_in_rule__ContainerElementDefinition__Group_1__12480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_1__0_in_rule__ContainerElementDefinition__Group_1__1__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__2__Impl_in_rule__ContainerElementDefinition__Group_1__22538 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__3_in_rule__ContainerElementDefinition__Group_1__22541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__NameAssignment_1_2_in_rule__ContainerElementDefinition__Group_1__2__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__3__Impl_in_rule__ContainerElementDefinition__Group_1__32598 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__4_in_rule__ContainerElementDefinition__Group_1__32601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__PropertiesAssignment_1_3_in_rule__ContainerElementDefinition__Group_1__3__Impl2628 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__4__Impl_in_rule__ContainerElementDefinition__Group_1__42659 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__5_in_rule__ContainerElementDefinition__Group_1__42662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ContainerElementDefinition__Group_1__4__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__5__Impl_in_rule__ContainerElementDefinition__Group_1__52721 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__6_in_rule__ContainerElementDefinition__Group_1__52724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__ContentAssignment_1_5_in_rule__ContainerElementDefinition__Group_1__5__Impl2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__6__Impl_in_rule__ContainerElementDefinition__Group_1__62781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__7_in_rule__ContainerElementDefinition__Group_1__62784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ContainerElementDefinition__Group_1__6__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__7__Impl_in_rule__ContainerElementDefinition__Group_1__72843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__8_in_rule__ContainerElementDefinition__Group_1__72846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_7__0_in_rule__ContainerElementDefinition__Group_1__7__Impl2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__8__Impl_in_rule__ContainerElementDefinition__Group_1__82904 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__9_in_rule__ContainerElementDefinition__Group_1__82907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__EndnameAssignment_1_8_in_rule__ContainerElementDefinition__Group_1__8__Impl2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__9__Impl_in_rule__ContainerElementDefinition__Group_1__92964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ContainerElementDefinition__Group_1__9__Impl2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_1__0__Impl_in_rule__ContainerElementDefinition__Group_1_1__03043 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_1__1_in_rule__ContainerElementDefinition__Group_1_1__03046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__NamespaceAssignment_1_1_0_in_rule__ContainerElementDefinition__Group_1_1__0__Impl3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_1__1__Impl_in_rule__ContainerElementDefinition__Group_1_1__13103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ContainerElementDefinition__Group_1_1__1__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_7__0__Impl_in_rule__ContainerElementDefinition__Group_1_7__03166 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_7__1_in_rule__ContainerElementDefinition__Group_1_7__03169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0_in_rule__ContainerElementDefinition__Group_1_7__0__Impl3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_7__1__Impl_in_rule__ContainerElementDefinition__Group_1_7__13226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ContainerElementDefinition__Group_1_7__1__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__0__Impl_in_rule__EmptyElementDefinition__Group__03289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__1_in_rule__EmptyElementDefinition__Group__03292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EmptyElementDefinition__Group__0__Impl3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__1__Impl_in_rule__EmptyElementDefinition__Group__13351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__2_in_rule__EmptyElementDefinition__Group__13354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__0_in_rule__EmptyElementDefinition__Group__1__Impl3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__2__Impl_in_rule__EmptyElementDefinition__Group__23412 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__3_in_rule__EmptyElementDefinition__Group__23415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__NameAssignment_2_in_rule__EmptyElementDefinition__Group__2__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__3__Impl_in_rule__EmptyElementDefinition__Group__33472 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__4_in_rule__EmptyElementDefinition__Group__33475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__PropsAssignment_3_in_rule__EmptyElementDefinition__Group__3__Impl3502 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__4__Impl_in_rule__EmptyElementDefinition__Group__43533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EmptyElementDefinition__Group__4__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__0__Impl_in_rule__EmptyElementDefinition__Group_1__03602 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__1_in_rule__EmptyElementDefinition__Group_1__03605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__NamespaceAssignment_1_0_in_rule__EmptyElementDefinition__Group_1__0__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__1__Impl_in_rule__EmptyElementDefinition__Group_1__13662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EmptyElementDefinition__Group_1__1__Impl3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__0__Impl_in_rule__AttributePropertyDefinition__Group__03725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__1_in_rule__AttributePropertyDefinition__Group__03728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__0_in_rule__AttributePropertyDefinition__Group__0__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__1__Impl_in_rule__AttributePropertyDefinition__Group__13786 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__2_in_rule__AttributePropertyDefinition__Group__13789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__NameAssignment_1_in_rule__AttributePropertyDefinition__Group__1__Impl3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__2__Impl_in_rule__AttributePropertyDefinition__Group__23846 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__3_in_rule__AttributePropertyDefinition__Group__23849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AttributePropertyDefinition__Group__2__Impl3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__3__Impl_in_rule__AttributePropertyDefinition__Group__33908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__ValueAssignment_3_in_rule__AttributePropertyDefinition__Group__3__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__0__Impl_in_rule__AttributePropertyDefinition__Group_0__03973 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__1_in_rule__AttributePropertyDefinition__Group_0__03976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__NamespaceAssignment_0_0_in_rule__AttributePropertyDefinition__Group_0__0__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__1__Impl_in_rule__AttributePropertyDefinition__Group_0__14033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AttributePropertyDefinition__Group_0__1__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04096 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4182 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__QualifiedName__Group_1__0__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__04341 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__04344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__14400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__04462 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__04465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__14524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDec_in_rule__FXML__XmlDecAssignment_04592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingInstruction_in_rule__FXML__ProcessingInstructionsAssignment_14623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_rule__FXML__RootElementAssignment_24654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__XMLDec__PropsAssignment_14685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessingInstruction__TypeAssignment_14716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__ProcessingInstruction__ImportedNamespaceAssignment_24747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__NamespaceAssignment_0_1_04778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__NameAssignment_0_24809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__ContainerElementDefinition__PropertiesAssignment_0_34840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_rule__ContainerElementDefinition__ChildrenAssignment_0_54871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_04902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__EndnameAssignment_0_84933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__NamespaceAssignment_1_1_04964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__NameAssignment_1_24995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__ContainerElementDefinition__PropertiesAssignment_1_35026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rule__ContainerElementDefinition__ContentAssignment_1_55057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_05088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__EndnameAssignment_1_85119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EmptyElementDefinition__NamespaceAssignment_1_05150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EmptyElementDefinition__NameAssignment_25181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__EmptyElementDefinition__PropsAssignment_35212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributePropertyDefinition__NamespaceAssignment_0_05243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributePropertyDefinition__NameAssignment_15274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributePropertyDefinition__ValueAssignment_35305 = new BitSet(new long[]{0x0000000000000002L});

}