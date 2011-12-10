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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_WS", "RULE_ML_COMMENT", "'.'", "':'", "'<?xml'", "'?>'", "'<?'", "'<'", "'>'", "'</'", "'/>'", "'='", "'*'"
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_WS)||(LA1_0>=9 && LA1_0<=10)) ) {
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:393:1: rule__Content__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( RULE_WS ) | ( '.' ) | ( ':' ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:397:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( RULE_WS ) | ( '.' ) | ( ':' ) )
            int alt4=6;
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
            case 10:
                {
                alt4=6;
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
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:430:6: ( ':' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:430:6: ( ':' )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:431:1: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getColonKeyword_5()); 
                    }
                    match(input,10,FOLLOW_10_in_rule__Content__Alternatives875); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getColonKeyword_5()); 
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:445:1: rule__FXML__Group__0 : rule__FXML__Group__0__Impl rule__FXML__Group__1 ;
    public final void rule__FXML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:449:1: ( rule__FXML__Group__0__Impl rule__FXML__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:450:2: rule__FXML__Group__0__Impl rule__FXML__Group__1
            {
            pushFollow(FOLLOW_rule__FXML__Group__0__Impl_in_rule__FXML__Group__0907);
            rule__FXML__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FXML__Group__1_in_rule__FXML__Group__0910);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:457:1: rule__FXML__Group__0__Impl : ( ( rule__FXML__XmlDecAssignment_0 ) ) ;
    public final void rule__FXML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:461:1: ( ( ( rule__FXML__XmlDecAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:462:1: ( ( rule__FXML__XmlDecAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:462:1: ( ( rule__FXML__XmlDecAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:463:1: ( rule__FXML__XmlDecAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getXmlDecAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:464:1: ( rule__FXML__XmlDecAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:464:2: rule__FXML__XmlDecAssignment_0
            {
            pushFollow(FOLLOW_rule__FXML__XmlDecAssignment_0_in_rule__FXML__Group__0__Impl937);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:474:1: rule__FXML__Group__1 : rule__FXML__Group__1__Impl rule__FXML__Group__2 ;
    public final void rule__FXML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:478:1: ( rule__FXML__Group__1__Impl rule__FXML__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:479:2: rule__FXML__Group__1__Impl rule__FXML__Group__2
            {
            pushFollow(FOLLOW_rule__FXML__Group__1__Impl_in_rule__FXML__Group__1967);
            rule__FXML__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FXML__Group__2_in_rule__FXML__Group__1970);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:486:1: rule__FXML__Group__1__Impl : ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* ) ;
    public final void rule__FXML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:490:1: ( ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:491:1: ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:491:1: ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:492:1: ( rule__FXML__ProcessingInstructionsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getProcessingInstructionsAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:493:1: ( rule__FXML__ProcessingInstructionsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:493:2: rule__FXML__ProcessingInstructionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__FXML__ProcessingInstructionsAssignment_1_in_rule__FXML__Group__1__Impl997);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:503:1: rule__FXML__Group__2 : rule__FXML__Group__2__Impl ;
    public final void rule__FXML__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:507:1: ( rule__FXML__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:508:2: rule__FXML__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FXML__Group__2__Impl_in_rule__FXML__Group__21028);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:514:1: rule__FXML__Group__2__Impl : ( ( rule__FXML__RootElementAssignment_2 ) ) ;
    public final void rule__FXML__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:518:1: ( ( ( rule__FXML__RootElementAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:519:1: ( ( rule__FXML__RootElementAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:519:1: ( ( rule__FXML__RootElementAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:520:1: ( rule__FXML__RootElementAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getRootElementAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:521:1: ( rule__FXML__RootElementAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:521:2: rule__FXML__RootElementAssignment_2
            {
            pushFollow(FOLLOW_rule__FXML__RootElementAssignment_2_in_rule__FXML__Group__2__Impl1055);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:537:1: rule__XMLDec__Group__0 : rule__XMLDec__Group__0__Impl rule__XMLDec__Group__1 ;
    public final void rule__XMLDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:541:1: ( rule__XMLDec__Group__0__Impl rule__XMLDec__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:542:2: rule__XMLDec__Group__0__Impl rule__XMLDec__Group__1
            {
            pushFollow(FOLLOW_rule__XMLDec__Group__0__Impl_in_rule__XMLDec__Group__01091);
            rule__XMLDec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XMLDec__Group__1_in_rule__XMLDec__Group__01094);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:549:1: rule__XMLDec__Group__0__Impl : ( '<?xml' ) ;
    public final void rule__XMLDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:553:1: ( ( '<?xml' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:554:1: ( '<?xml' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:554:1: ( '<?xml' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:555:1: '<?xml'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getXmlKeyword_0()); 
            }
            match(input,11,FOLLOW_11_in_rule__XMLDec__Group__0__Impl1122); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:568:1: rule__XMLDec__Group__1 : rule__XMLDec__Group__1__Impl rule__XMLDec__Group__2 ;
    public final void rule__XMLDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:572:1: ( rule__XMLDec__Group__1__Impl rule__XMLDec__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:573:2: rule__XMLDec__Group__1__Impl rule__XMLDec__Group__2
            {
            pushFollow(FOLLOW_rule__XMLDec__Group__1__Impl_in_rule__XMLDec__Group__11153);
            rule__XMLDec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XMLDec__Group__2_in_rule__XMLDec__Group__11156);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:580:1: rule__XMLDec__Group__1__Impl : ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) ) ;
    public final void rule__XMLDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:584:1: ( ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:585:1: ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:585:1: ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:586:1: ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:586:1: ( ( rule__XMLDec__PropsAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:587:1: ( rule__XMLDec__PropsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getPropsAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:588:1: ( rule__XMLDec__PropsAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:588:2: rule__XMLDec__PropsAssignment_1
            {
            pushFollow(FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1185);
            rule__XMLDec__PropsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMLDecAccess().getPropsAssignment_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:591:1: ( ( rule__XMLDec__PropsAssignment_1 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:592:1: ( rule__XMLDec__PropsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getPropsAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:593:1: ( rule__XMLDec__PropsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:593:2: rule__XMLDec__PropsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1197);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:604:1: rule__XMLDec__Group__2 : rule__XMLDec__Group__2__Impl ;
    public final void rule__XMLDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:608:1: ( rule__XMLDec__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:609:2: rule__XMLDec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__XMLDec__Group__2__Impl_in_rule__XMLDec__Group__21230);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:615:1: rule__XMLDec__Group__2__Impl : ( '?>' ) ;
    public final void rule__XMLDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:619:1: ( ( '?>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:620:1: ( '?>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:620:1: ( '?>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:621:1: '?>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getQuestionMarkGreaterThanSignKeyword_2()); 
            }
            match(input,12,FOLLOW_12_in_rule__XMLDec__Group__2__Impl1258); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:640:1: rule__ProcessingInstruction__Group__0 : rule__ProcessingInstruction__Group__0__Impl rule__ProcessingInstruction__Group__1 ;
    public final void rule__ProcessingInstruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:644:1: ( rule__ProcessingInstruction__Group__0__Impl rule__ProcessingInstruction__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:645:2: rule__ProcessingInstruction__Group__0__Impl rule__ProcessingInstruction__Group__1
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__0__Impl_in_rule__ProcessingInstruction__Group__01295);
            rule__ProcessingInstruction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__1_in_rule__ProcessingInstruction__Group__01298);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:652:1: rule__ProcessingInstruction__Group__0__Impl : ( '<?' ) ;
    public final void rule__ProcessingInstruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:656:1: ( ( '<?' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:657:1: ( '<?' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:657:1: ( '<?' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:658:1: '<?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getLessThanSignQuestionMarkKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__ProcessingInstruction__Group__0__Impl1326); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:671:1: rule__ProcessingInstruction__Group__1 : rule__ProcessingInstruction__Group__1__Impl rule__ProcessingInstruction__Group__2 ;
    public final void rule__ProcessingInstruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:675:1: ( rule__ProcessingInstruction__Group__1__Impl rule__ProcessingInstruction__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:676:2: rule__ProcessingInstruction__Group__1__Impl rule__ProcessingInstruction__Group__2
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__1__Impl_in_rule__ProcessingInstruction__Group__11357);
            rule__ProcessingInstruction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__2_in_rule__ProcessingInstruction__Group__11360);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:683:1: rule__ProcessingInstruction__Group__1__Impl : ( ( rule__ProcessingInstruction__TypeAssignment_1 ) ) ;
    public final void rule__ProcessingInstruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:687:1: ( ( ( rule__ProcessingInstruction__TypeAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:688:1: ( ( rule__ProcessingInstruction__TypeAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:688:1: ( ( rule__ProcessingInstruction__TypeAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:689:1: ( rule__ProcessingInstruction__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getTypeAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:690:1: ( rule__ProcessingInstruction__TypeAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:690:2: rule__ProcessingInstruction__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__TypeAssignment_1_in_rule__ProcessingInstruction__Group__1__Impl1387);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:700:1: rule__ProcessingInstruction__Group__2 : rule__ProcessingInstruction__Group__2__Impl rule__ProcessingInstruction__Group__3 ;
    public final void rule__ProcessingInstruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:704:1: ( rule__ProcessingInstruction__Group__2__Impl rule__ProcessingInstruction__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:705:2: rule__ProcessingInstruction__Group__2__Impl rule__ProcessingInstruction__Group__3
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__2__Impl_in_rule__ProcessingInstruction__Group__21417);
            rule__ProcessingInstruction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__3_in_rule__ProcessingInstruction__Group__21420);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:712:1: rule__ProcessingInstruction__Group__2__Impl : ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__ProcessingInstruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:716:1: ( ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:717:1: ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:717:1: ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:718:1: ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getImportedNamespaceAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:719:1: ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:719:2: rule__ProcessingInstruction__ImportedNamespaceAssignment_2
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__ImportedNamespaceAssignment_2_in_rule__ProcessingInstruction__Group__2__Impl1447);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:729:1: rule__ProcessingInstruction__Group__3 : rule__ProcessingInstruction__Group__3__Impl ;
    public final void rule__ProcessingInstruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:733:1: ( rule__ProcessingInstruction__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:734:2: rule__ProcessingInstruction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__3__Impl_in_rule__ProcessingInstruction__Group__31477);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:740:1: rule__ProcessingInstruction__Group__3__Impl : ( '?>' ) ;
    public final void rule__ProcessingInstruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:744:1: ( ( '?>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:745:1: ( '?>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:745:1: ( '?>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:746:1: '?>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getQuestionMarkGreaterThanSignKeyword_3()); 
            }
            match(input,12,FOLLOW_12_in_rule__ProcessingInstruction__Group__3__Impl1505); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:767:1: rule__ContainerElementDefinition__Group_0__0 : rule__ContainerElementDefinition__Group_0__0__Impl rule__ContainerElementDefinition__Group_0__1 ;
    public final void rule__ContainerElementDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:771:1: ( rule__ContainerElementDefinition__Group_0__0__Impl rule__ContainerElementDefinition__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:772:2: rule__ContainerElementDefinition__Group_0__0__Impl rule__ContainerElementDefinition__Group_0__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__0__Impl_in_rule__ContainerElementDefinition__Group_0__01544);
            rule__ContainerElementDefinition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__1_in_rule__ContainerElementDefinition__Group_0__01547);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:779:1: rule__ContainerElementDefinition__Group_0__0__Impl : ( '<' ) ;
    public final void rule__ContainerElementDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:783:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:784:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:784:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:785:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignKeyword_0_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__ContainerElementDefinition__Group_0__0__Impl1575); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:798:1: rule__ContainerElementDefinition__Group_0__1 : rule__ContainerElementDefinition__Group_0__1__Impl rule__ContainerElementDefinition__Group_0__2 ;
    public final void rule__ContainerElementDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:802:1: ( rule__ContainerElementDefinition__Group_0__1__Impl rule__ContainerElementDefinition__Group_0__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:803:2: rule__ContainerElementDefinition__Group_0__1__Impl rule__ContainerElementDefinition__Group_0__2
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__1__Impl_in_rule__ContainerElementDefinition__Group_0__11606);
            rule__ContainerElementDefinition__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__2_in_rule__ContainerElementDefinition__Group_0__11609);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:810:1: rule__ContainerElementDefinition__Group_0__1__Impl : ( ( rule__ContainerElementDefinition__Group_0_1__0 )? ) ;
    public final void rule__ContainerElementDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:814:1: ( ( ( rule__ContainerElementDefinition__Group_0_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:815:1: ( ( rule__ContainerElementDefinition__Group_0_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:815:1: ( ( rule__ContainerElementDefinition__Group_0_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:816:1: ( rule__ContainerElementDefinition__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGroup_0_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:817:1: ( rule__ContainerElementDefinition__Group_0_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==10) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:817:2: rule__ContainerElementDefinition__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_1__0_in_rule__ContainerElementDefinition__Group_0__1__Impl1636);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:827:1: rule__ContainerElementDefinition__Group_0__2 : rule__ContainerElementDefinition__Group_0__2__Impl rule__ContainerElementDefinition__Group_0__3 ;
    public final void rule__ContainerElementDefinition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:831:1: ( rule__ContainerElementDefinition__Group_0__2__Impl rule__ContainerElementDefinition__Group_0__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:832:2: rule__ContainerElementDefinition__Group_0__2__Impl rule__ContainerElementDefinition__Group_0__3
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__2__Impl_in_rule__ContainerElementDefinition__Group_0__21667);
            rule__ContainerElementDefinition__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__3_in_rule__ContainerElementDefinition__Group_0__21670);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:839:1: rule__ContainerElementDefinition__Group_0__2__Impl : ( ( rule__ContainerElementDefinition__NameAssignment_0_2 ) ) ;
    public final void rule__ContainerElementDefinition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:843:1: ( ( ( rule__ContainerElementDefinition__NameAssignment_0_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:844:1: ( ( rule__ContainerElementDefinition__NameAssignment_0_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:844:1: ( ( rule__ContainerElementDefinition__NameAssignment_0_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:845:1: ( rule__ContainerElementDefinition__NameAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNameAssignment_0_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:846:1: ( rule__ContainerElementDefinition__NameAssignment_0_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:846:2: rule__ContainerElementDefinition__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__NameAssignment_0_2_in_rule__ContainerElementDefinition__Group_0__2__Impl1697);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:856:1: rule__ContainerElementDefinition__Group_0__3 : rule__ContainerElementDefinition__Group_0__3__Impl rule__ContainerElementDefinition__Group_0__4 ;
    public final void rule__ContainerElementDefinition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:860:1: ( rule__ContainerElementDefinition__Group_0__3__Impl rule__ContainerElementDefinition__Group_0__4 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:861:2: rule__ContainerElementDefinition__Group_0__3__Impl rule__ContainerElementDefinition__Group_0__4
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__3__Impl_in_rule__ContainerElementDefinition__Group_0__31727);
            rule__ContainerElementDefinition__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__4_in_rule__ContainerElementDefinition__Group_0__31730);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:868:1: rule__ContainerElementDefinition__Group_0__3__Impl : ( ( rule__ContainerElementDefinition__PropertiesAssignment_0_3 )* ) ;
    public final void rule__ContainerElementDefinition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:872:1: ( ( ( rule__ContainerElementDefinition__PropertiesAssignment_0_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:873:1: ( ( rule__ContainerElementDefinition__PropertiesAssignment_0_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:873:1: ( ( rule__ContainerElementDefinition__PropertiesAssignment_0_3 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:874:1: ( rule__ContainerElementDefinition__PropertiesAssignment_0_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAssignment_0_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:875:1: ( rule__ContainerElementDefinition__PropertiesAssignment_0_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:875:2: rule__ContainerElementDefinition__PropertiesAssignment_0_3
            	    {
            	    pushFollow(FOLLOW_rule__ContainerElementDefinition__PropertiesAssignment_0_3_in_rule__ContainerElementDefinition__Group_0__3__Impl1757);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:885:1: rule__ContainerElementDefinition__Group_0__4 : rule__ContainerElementDefinition__Group_0__4__Impl rule__ContainerElementDefinition__Group_0__5 ;
    public final void rule__ContainerElementDefinition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:889:1: ( rule__ContainerElementDefinition__Group_0__4__Impl rule__ContainerElementDefinition__Group_0__5 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:890:2: rule__ContainerElementDefinition__Group_0__4__Impl rule__ContainerElementDefinition__Group_0__5
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__4__Impl_in_rule__ContainerElementDefinition__Group_0__41788);
            rule__ContainerElementDefinition__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__5_in_rule__ContainerElementDefinition__Group_0__41791);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:897:1: rule__ContainerElementDefinition__Group_0__4__Impl : ( '>' ) ;
    public final void rule__ContainerElementDefinition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:901:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:902:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:902:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:903:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_0_4()); 
            }
            match(input,15,FOLLOW_15_in_rule__ContainerElementDefinition__Group_0__4__Impl1819); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:916:1: rule__ContainerElementDefinition__Group_0__5 : rule__ContainerElementDefinition__Group_0__5__Impl rule__ContainerElementDefinition__Group_0__6 ;
    public final void rule__ContainerElementDefinition__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:920:1: ( rule__ContainerElementDefinition__Group_0__5__Impl rule__ContainerElementDefinition__Group_0__6 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:921:2: rule__ContainerElementDefinition__Group_0__5__Impl rule__ContainerElementDefinition__Group_0__6
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__5__Impl_in_rule__ContainerElementDefinition__Group_0__51850);
            rule__ContainerElementDefinition__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__6_in_rule__ContainerElementDefinition__Group_0__51853);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:928:1: rule__ContainerElementDefinition__Group_0__5__Impl : ( ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 ) ) ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )* ) ) ;
    public final void rule__ContainerElementDefinition__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:932:1: ( ( ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 ) ) ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:933:1: ( ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 ) ) ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:933:1: ( ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 ) ) ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:934:1: ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 ) ) ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:934:1: ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:935:1: ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getChildrenAssignment_0_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:936:1: ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:936:2: rule__ContainerElementDefinition__ChildrenAssignment_0_5
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__ChildrenAssignment_0_5_in_rule__ContainerElementDefinition__Group_0__5__Impl1882);
            rule__ContainerElementDefinition__ChildrenAssignment_0_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getChildrenAssignment_0_5()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:939:1: ( ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:940:1: ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getChildrenAssignment_0_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:941:1: ( rule__ContainerElementDefinition__ChildrenAssignment_0_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:941:2: rule__ContainerElementDefinition__ChildrenAssignment_0_5
            	    {
            	    pushFollow(FOLLOW_rule__ContainerElementDefinition__ChildrenAssignment_0_5_in_rule__ContainerElementDefinition__Group_0__5__Impl1894);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:952:1: rule__ContainerElementDefinition__Group_0__6 : rule__ContainerElementDefinition__Group_0__6__Impl rule__ContainerElementDefinition__Group_0__7 ;
    public final void rule__ContainerElementDefinition__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:956:1: ( rule__ContainerElementDefinition__Group_0__6__Impl rule__ContainerElementDefinition__Group_0__7 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:957:2: rule__ContainerElementDefinition__Group_0__6__Impl rule__ContainerElementDefinition__Group_0__7
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__6__Impl_in_rule__ContainerElementDefinition__Group_0__61927);
            rule__ContainerElementDefinition__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__7_in_rule__ContainerElementDefinition__Group_0__61930);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:964:1: rule__ContainerElementDefinition__Group_0__6__Impl : ( '</' ) ;
    public final void rule__ContainerElementDefinition__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:968:1: ( ( '</' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:969:1: ( '</' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:969:1: ( '</' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:970:1: '</'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignSolidusKeyword_0_6()); 
            }
            match(input,16,FOLLOW_16_in_rule__ContainerElementDefinition__Group_0__6__Impl1958); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:983:1: rule__ContainerElementDefinition__Group_0__7 : rule__ContainerElementDefinition__Group_0__7__Impl rule__ContainerElementDefinition__Group_0__8 ;
    public final void rule__ContainerElementDefinition__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:987:1: ( rule__ContainerElementDefinition__Group_0__7__Impl rule__ContainerElementDefinition__Group_0__8 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:988:2: rule__ContainerElementDefinition__Group_0__7__Impl rule__ContainerElementDefinition__Group_0__8
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__7__Impl_in_rule__ContainerElementDefinition__Group_0__71989);
            rule__ContainerElementDefinition__Group_0__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__8_in_rule__ContainerElementDefinition__Group_0__71992);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:995:1: rule__ContainerElementDefinition__Group_0__7__Impl : ( ( rule__ContainerElementDefinition__Group_0_7__0 )? ) ;
    public final void rule__ContainerElementDefinition__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:999:1: ( ( ( rule__ContainerElementDefinition__Group_0_7__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1000:1: ( ( rule__ContainerElementDefinition__Group_0_7__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1000:1: ( ( rule__ContainerElementDefinition__Group_0_7__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1001:1: ( rule__ContainerElementDefinition__Group_0_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGroup_0_7()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1002:1: ( rule__ContainerElementDefinition__Group_0_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==10) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1002:2: rule__ContainerElementDefinition__Group_0_7__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_7__0_in_rule__ContainerElementDefinition__Group_0__7__Impl2019);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1012:1: rule__ContainerElementDefinition__Group_0__8 : rule__ContainerElementDefinition__Group_0__8__Impl rule__ContainerElementDefinition__Group_0__9 ;
    public final void rule__ContainerElementDefinition__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1016:1: ( rule__ContainerElementDefinition__Group_0__8__Impl rule__ContainerElementDefinition__Group_0__9 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1017:2: rule__ContainerElementDefinition__Group_0__8__Impl rule__ContainerElementDefinition__Group_0__9
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__8__Impl_in_rule__ContainerElementDefinition__Group_0__82050);
            rule__ContainerElementDefinition__Group_0__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__9_in_rule__ContainerElementDefinition__Group_0__82053);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1024:1: rule__ContainerElementDefinition__Group_0__8__Impl : ( ( rule__ContainerElementDefinition__EndnameAssignment_0_8 ) ) ;
    public final void rule__ContainerElementDefinition__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1028:1: ( ( ( rule__ContainerElementDefinition__EndnameAssignment_0_8 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1029:1: ( ( rule__ContainerElementDefinition__EndnameAssignment_0_8 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1029:1: ( ( rule__ContainerElementDefinition__EndnameAssignment_0_8 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1030:1: ( rule__ContainerElementDefinition__EndnameAssignment_0_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnameAssignment_0_8()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1031:1: ( rule__ContainerElementDefinition__EndnameAssignment_0_8 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1031:2: rule__ContainerElementDefinition__EndnameAssignment_0_8
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__EndnameAssignment_0_8_in_rule__ContainerElementDefinition__Group_0__8__Impl2080);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1041:1: rule__ContainerElementDefinition__Group_0__9 : rule__ContainerElementDefinition__Group_0__9__Impl ;
    public final void rule__ContainerElementDefinition__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1045:1: ( rule__ContainerElementDefinition__Group_0__9__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1046:2: rule__ContainerElementDefinition__Group_0__9__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0__9__Impl_in_rule__ContainerElementDefinition__Group_0__92110);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1052:1: rule__ContainerElementDefinition__Group_0__9__Impl : ( '>' ) ;
    public final void rule__ContainerElementDefinition__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1056:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1057:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1057:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1058:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_0_9()); 
            }
            match(input,15,FOLLOW_15_in_rule__ContainerElementDefinition__Group_0__9__Impl2138); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1091:1: rule__ContainerElementDefinition__Group_0_1__0 : rule__ContainerElementDefinition__Group_0_1__0__Impl rule__ContainerElementDefinition__Group_0_1__1 ;
    public final void rule__ContainerElementDefinition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1095:1: ( rule__ContainerElementDefinition__Group_0_1__0__Impl rule__ContainerElementDefinition__Group_0_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1096:2: rule__ContainerElementDefinition__Group_0_1__0__Impl rule__ContainerElementDefinition__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_1__0__Impl_in_rule__ContainerElementDefinition__Group_0_1__02189);
            rule__ContainerElementDefinition__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_1__1_in_rule__ContainerElementDefinition__Group_0_1__02192);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1103:1: rule__ContainerElementDefinition__Group_0_1__0__Impl : ( ( rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 ) ) ;
    public final void rule__ContainerElementDefinition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1107:1: ( ( ( rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1108:1: ( ( rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1108:1: ( ( rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1109:1: ( rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNamespaceAssignment_0_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1110:1: ( rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1110:2: rule__ContainerElementDefinition__NamespaceAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__NamespaceAssignment_0_1_0_in_rule__ContainerElementDefinition__Group_0_1__0__Impl2219);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1120:1: rule__ContainerElementDefinition__Group_0_1__1 : rule__ContainerElementDefinition__Group_0_1__1__Impl ;
    public final void rule__ContainerElementDefinition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1124:1: ( rule__ContainerElementDefinition__Group_0_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1125:2: rule__ContainerElementDefinition__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_1__1__Impl_in_rule__ContainerElementDefinition__Group_0_1__12249);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1131:1: rule__ContainerElementDefinition__Group_0_1__1__Impl : ( ':' ) ;
    public final void rule__ContainerElementDefinition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1135:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1136:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1136:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1137:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_0_1_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__ContainerElementDefinition__Group_0_1__1__Impl2277); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1154:1: rule__ContainerElementDefinition__Group_0_7__0 : rule__ContainerElementDefinition__Group_0_7__0__Impl rule__ContainerElementDefinition__Group_0_7__1 ;
    public final void rule__ContainerElementDefinition__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1158:1: ( rule__ContainerElementDefinition__Group_0_7__0__Impl rule__ContainerElementDefinition__Group_0_7__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1159:2: rule__ContainerElementDefinition__Group_0_7__0__Impl rule__ContainerElementDefinition__Group_0_7__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_7__0__Impl_in_rule__ContainerElementDefinition__Group_0_7__02312);
            rule__ContainerElementDefinition__Group_0_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_7__1_in_rule__ContainerElementDefinition__Group_0_7__02315);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1166:1: rule__ContainerElementDefinition__Group_0_7__0__Impl : ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 ) ) ;
    public final void rule__ContainerElementDefinition__Group_0_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1170:1: ( ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1171:1: ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1171:1: ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1172:1: ( rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceAssignment_0_7_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1173:1: ( rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1173:2: rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0_in_rule__ContainerElementDefinition__Group_0_7__0__Impl2342);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1183:1: rule__ContainerElementDefinition__Group_0_7__1 : rule__ContainerElementDefinition__Group_0_7__1__Impl ;
    public final void rule__ContainerElementDefinition__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1187:1: ( rule__ContainerElementDefinition__Group_0_7__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1188:2: rule__ContainerElementDefinition__Group_0_7__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_0_7__1__Impl_in_rule__ContainerElementDefinition__Group_0_7__12372);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1194:1: rule__ContainerElementDefinition__Group_0_7__1__Impl : ( ':' ) ;
    public final void rule__ContainerElementDefinition__Group_0_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1198:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1199:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1199:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1200:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_0_7_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__ContainerElementDefinition__Group_0_7__1__Impl2400); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1217:1: rule__ContainerElementDefinition__Group_1__0 : rule__ContainerElementDefinition__Group_1__0__Impl rule__ContainerElementDefinition__Group_1__1 ;
    public final void rule__ContainerElementDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1221:1: ( rule__ContainerElementDefinition__Group_1__0__Impl rule__ContainerElementDefinition__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1222:2: rule__ContainerElementDefinition__Group_1__0__Impl rule__ContainerElementDefinition__Group_1__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__0__Impl_in_rule__ContainerElementDefinition__Group_1__02435);
            rule__ContainerElementDefinition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__1_in_rule__ContainerElementDefinition__Group_1__02438);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1229:1: rule__ContainerElementDefinition__Group_1__0__Impl : ( '<' ) ;
    public final void rule__ContainerElementDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1233:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1234:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1234:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1235:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignKeyword_1_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__ContainerElementDefinition__Group_1__0__Impl2466); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1248:1: rule__ContainerElementDefinition__Group_1__1 : rule__ContainerElementDefinition__Group_1__1__Impl rule__ContainerElementDefinition__Group_1__2 ;
    public final void rule__ContainerElementDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1252:1: ( rule__ContainerElementDefinition__Group_1__1__Impl rule__ContainerElementDefinition__Group_1__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1253:2: rule__ContainerElementDefinition__Group_1__1__Impl rule__ContainerElementDefinition__Group_1__2
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__1__Impl_in_rule__ContainerElementDefinition__Group_1__12497);
            rule__ContainerElementDefinition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__2_in_rule__ContainerElementDefinition__Group_1__12500);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1260:1: rule__ContainerElementDefinition__Group_1__1__Impl : ( ( rule__ContainerElementDefinition__Group_1_1__0 )? ) ;
    public final void rule__ContainerElementDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1264:1: ( ( ( rule__ContainerElementDefinition__Group_1_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1265:1: ( ( rule__ContainerElementDefinition__Group_1_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1265:1: ( ( rule__ContainerElementDefinition__Group_1_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1266:1: ( rule__ContainerElementDefinition__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGroup_1_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1267:1: ( rule__ContainerElementDefinition__Group_1_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==10) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1267:2: rule__ContainerElementDefinition__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_1__0_in_rule__ContainerElementDefinition__Group_1__1__Impl2527);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1277:1: rule__ContainerElementDefinition__Group_1__2 : rule__ContainerElementDefinition__Group_1__2__Impl rule__ContainerElementDefinition__Group_1__3 ;
    public final void rule__ContainerElementDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1281:1: ( rule__ContainerElementDefinition__Group_1__2__Impl rule__ContainerElementDefinition__Group_1__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1282:2: rule__ContainerElementDefinition__Group_1__2__Impl rule__ContainerElementDefinition__Group_1__3
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__2__Impl_in_rule__ContainerElementDefinition__Group_1__22558);
            rule__ContainerElementDefinition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__3_in_rule__ContainerElementDefinition__Group_1__22561);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1289:1: rule__ContainerElementDefinition__Group_1__2__Impl : ( ( rule__ContainerElementDefinition__NameAssignment_1_2 ) ) ;
    public final void rule__ContainerElementDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1293:1: ( ( ( rule__ContainerElementDefinition__NameAssignment_1_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1294:1: ( ( rule__ContainerElementDefinition__NameAssignment_1_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1294:1: ( ( rule__ContainerElementDefinition__NameAssignment_1_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1295:1: ( rule__ContainerElementDefinition__NameAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNameAssignment_1_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1296:1: ( rule__ContainerElementDefinition__NameAssignment_1_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1296:2: rule__ContainerElementDefinition__NameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__NameAssignment_1_2_in_rule__ContainerElementDefinition__Group_1__2__Impl2588);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1306:1: rule__ContainerElementDefinition__Group_1__3 : rule__ContainerElementDefinition__Group_1__3__Impl rule__ContainerElementDefinition__Group_1__4 ;
    public final void rule__ContainerElementDefinition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1310:1: ( rule__ContainerElementDefinition__Group_1__3__Impl rule__ContainerElementDefinition__Group_1__4 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1311:2: rule__ContainerElementDefinition__Group_1__3__Impl rule__ContainerElementDefinition__Group_1__4
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__3__Impl_in_rule__ContainerElementDefinition__Group_1__32618);
            rule__ContainerElementDefinition__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__4_in_rule__ContainerElementDefinition__Group_1__32621);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1318:1: rule__ContainerElementDefinition__Group_1__3__Impl : ( ( rule__ContainerElementDefinition__PropertiesAssignment_1_3 )* ) ;
    public final void rule__ContainerElementDefinition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1322:1: ( ( ( rule__ContainerElementDefinition__PropertiesAssignment_1_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1323:1: ( ( rule__ContainerElementDefinition__PropertiesAssignment_1_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1323:1: ( ( rule__ContainerElementDefinition__PropertiesAssignment_1_3 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1324:1: ( rule__ContainerElementDefinition__PropertiesAssignment_1_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAssignment_1_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1325:1: ( rule__ContainerElementDefinition__PropertiesAssignment_1_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1325:2: rule__ContainerElementDefinition__PropertiesAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_rule__ContainerElementDefinition__PropertiesAssignment_1_3_in_rule__ContainerElementDefinition__Group_1__3__Impl2648);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1335:1: rule__ContainerElementDefinition__Group_1__4 : rule__ContainerElementDefinition__Group_1__4__Impl rule__ContainerElementDefinition__Group_1__5 ;
    public final void rule__ContainerElementDefinition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1339:1: ( rule__ContainerElementDefinition__Group_1__4__Impl rule__ContainerElementDefinition__Group_1__5 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1340:2: rule__ContainerElementDefinition__Group_1__4__Impl rule__ContainerElementDefinition__Group_1__5
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__4__Impl_in_rule__ContainerElementDefinition__Group_1__42679);
            rule__ContainerElementDefinition__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__5_in_rule__ContainerElementDefinition__Group_1__42682);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1347:1: rule__ContainerElementDefinition__Group_1__4__Impl : ( '>' ) ;
    public final void rule__ContainerElementDefinition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1351:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1352:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1352:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1353:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_1_4()); 
            }
            match(input,15,FOLLOW_15_in_rule__ContainerElementDefinition__Group_1__4__Impl2710); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1366:1: rule__ContainerElementDefinition__Group_1__5 : rule__ContainerElementDefinition__Group_1__5__Impl rule__ContainerElementDefinition__Group_1__6 ;
    public final void rule__ContainerElementDefinition__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1370:1: ( rule__ContainerElementDefinition__Group_1__5__Impl rule__ContainerElementDefinition__Group_1__6 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1371:2: rule__ContainerElementDefinition__Group_1__5__Impl rule__ContainerElementDefinition__Group_1__6
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__5__Impl_in_rule__ContainerElementDefinition__Group_1__52741);
            rule__ContainerElementDefinition__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__6_in_rule__ContainerElementDefinition__Group_1__52744);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1378:1: rule__ContainerElementDefinition__Group_1__5__Impl : ( ( rule__ContainerElementDefinition__ContentAssignment_1_5 ) ) ;
    public final void rule__ContainerElementDefinition__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1382:1: ( ( ( rule__ContainerElementDefinition__ContentAssignment_1_5 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1383:1: ( ( rule__ContainerElementDefinition__ContentAssignment_1_5 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1383:1: ( ( rule__ContainerElementDefinition__ContentAssignment_1_5 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1384:1: ( rule__ContainerElementDefinition__ContentAssignment_1_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getContentAssignment_1_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1385:1: ( rule__ContainerElementDefinition__ContentAssignment_1_5 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1385:2: rule__ContainerElementDefinition__ContentAssignment_1_5
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__ContentAssignment_1_5_in_rule__ContainerElementDefinition__Group_1__5__Impl2771);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1395:1: rule__ContainerElementDefinition__Group_1__6 : rule__ContainerElementDefinition__Group_1__6__Impl rule__ContainerElementDefinition__Group_1__7 ;
    public final void rule__ContainerElementDefinition__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1399:1: ( rule__ContainerElementDefinition__Group_1__6__Impl rule__ContainerElementDefinition__Group_1__7 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1400:2: rule__ContainerElementDefinition__Group_1__6__Impl rule__ContainerElementDefinition__Group_1__7
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__6__Impl_in_rule__ContainerElementDefinition__Group_1__62801);
            rule__ContainerElementDefinition__Group_1__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__7_in_rule__ContainerElementDefinition__Group_1__62804);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1407:1: rule__ContainerElementDefinition__Group_1__6__Impl : ( '</' ) ;
    public final void rule__ContainerElementDefinition__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1411:1: ( ( '</' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1412:1: ( '</' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1412:1: ( '</' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1413:1: '</'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignSolidusKeyword_1_6()); 
            }
            match(input,16,FOLLOW_16_in_rule__ContainerElementDefinition__Group_1__6__Impl2832); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1426:1: rule__ContainerElementDefinition__Group_1__7 : rule__ContainerElementDefinition__Group_1__7__Impl rule__ContainerElementDefinition__Group_1__8 ;
    public final void rule__ContainerElementDefinition__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1430:1: ( rule__ContainerElementDefinition__Group_1__7__Impl rule__ContainerElementDefinition__Group_1__8 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1431:2: rule__ContainerElementDefinition__Group_1__7__Impl rule__ContainerElementDefinition__Group_1__8
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__7__Impl_in_rule__ContainerElementDefinition__Group_1__72863);
            rule__ContainerElementDefinition__Group_1__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__8_in_rule__ContainerElementDefinition__Group_1__72866);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1438:1: rule__ContainerElementDefinition__Group_1__7__Impl : ( ( rule__ContainerElementDefinition__Group_1_7__0 )? ) ;
    public final void rule__ContainerElementDefinition__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1442:1: ( ( ( rule__ContainerElementDefinition__Group_1_7__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1443:1: ( ( rule__ContainerElementDefinition__Group_1_7__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1443:1: ( ( rule__ContainerElementDefinition__Group_1_7__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1444:1: ( rule__ContainerElementDefinition__Group_1_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGroup_1_7()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1445:1: ( rule__ContainerElementDefinition__Group_1_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==10) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1445:2: rule__ContainerElementDefinition__Group_1_7__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_7__0_in_rule__ContainerElementDefinition__Group_1__7__Impl2893);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1455:1: rule__ContainerElementDefinition__Group_1__8 : rule__ContainerElementDefinition__Group_1__8__Impl rule__ContainerElementDefinition__Group_1__9 ;
    public final void rule__ContainerElementDefinition__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1459:1: ( rule__ContainerElementDefinition__Group_1__8__Impl rule__ContainerElementDefinition__Group_1__9 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1460:2: rule__ContainerElementDefinition__Group_1__8__Impl rule__ContainerElementDefinition__Group_1__9
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__8__Impl_in_rule__ContainerElementDefinition__Group_1__82924);
            rule__ContainerElementDefinition__Group_1__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__9_in_rule__ContainerElementDefinition__Group_1__82927);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1467:1: rule__ContainerElementDefinition__Group_1__8__Impl : ( ( rule__ContainerElementDefinition__EndnameAssignment_1_8 ) ) ;
    public final void rule__ContainerElementDefinition__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1471:1: ( ( ( rule__ContainerElementDefinition__EndnameAssignment_1_8 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1472:1: ( ( rule__ContainerElementDefinition__EndnameAssignment_1_8 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1472:1: ( ( rule__ContainerElementDefinition__EndnameAssignment_1_8 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1473:1: ( rule__ContainerElementDefinition__EndnameAssignment_1_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnameAssignment_1_8()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1474:1: ( rule__ContainerElementDefinition__EndnameAssignment_1_8 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1474:2: rule__ContainerElementDefinition__EndnameAssignment_1_8
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__EndnameAssignment_1_8_in_rule__ContainerElementDefinition__Group_1__8__Impl2954);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1484:1: rule__ContainerElementDefinition__Group_1__9 : rule__ContainerElementDefinition__Group_1__9__Impl ;
    public final void rule__ContainerElementDefinition__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1488:1: ( rule__ContainerElementDefinition__Group_1__9__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1489:2: rule__ContainerElementDefinition__Group_1__9__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__9__Impl_in_rule__ContainerElementDefinition__Group_1__92984);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1495:1: rule__ContainerElementDefinition__Group_1__9__Impl : ( '>' ) ;
    public final void rule__ContainerElementDefinition__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1499:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1500:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1500:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1501:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_1_9()); 
            }
            match(input,15,FOLLOW_15_in_rule__ContainerElementDefinition__Group_1__9__Impl3012); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1534:1: rule__ContainerElementDefinition__Group_1_1__0 : rule__ContainerElementDefinition__Group_1_1__0__Impl rule__ContainerElementDefinition__Group_1_1__1 ;
    public final void rule__ContainerElementDefinition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1538:1: ( rule__ContainerElementDefinition__Group_1_1__0__Impl rule__ContainerElementDefinition__Group_1_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1539:2: rule__ContainerElementDefinition__Group_1_1__0__Impl rule__ContainerElementDefinition__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_1__0__Impl_in_rule__ContainerElementDefinition__Group_1_1__03063);
            rule__ContainerElementDefinition__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_1__1_in_rule__ContainerElementDefinition__Group_1_1__03066);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1546:1: rule__ContainerElementDefinition__Group_1_1__0__Impl : ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 ) ) ;
    public final void rule__ContainerElementDefinition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1550:1: ( ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1551:1: ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1551:1: ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1552:1: ( rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNamespaceAssignment_1_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1553:1: ( rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1553:2: rule__ContainerElementDefinition__NamespaceAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__NamespaceAssignment_1_1_0_in_rule__ContainerElementDefinition__Group_1_1__0__Impl3093);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1563:1: rule__ContainerElementDefinition__Group_1_1__1 : rule__ContainerElementDefinition__Group_1_1__1__Impl ;
    public final void rule__ContainerElementDefinition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1567:1: ( rule__ContainerElementDefinition__Group_1_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1568:2: rule__ContainerElementDefinition__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_1__1__Impl_in_rule__ContainerElementDefinition__Group_1_1__13123);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1574:1: rule__ContainerElementDefinition__Group_1_1__1__Impl : ( ':' ) ;
    public final void rule__ContainerElementDefinition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1578:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1579:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1579:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1580:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_1_1_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__ContainerElementDefinition__Group_1_1__1__Impl3151); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1597:1: rule__ContainerElementDefinition__Group_1_7__0 : rule__ContainerElementDefinition__Group_1_7__0__Impl rule__ContainerElementDefinition__Group_1_7__1 ;
    public final void rule__ContainerElementDefinition__Group_1_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1601:1: ( rule__ContainerElementDefinition__Group_1_7__0__Impl rule__ContainerElementDefinition__Group_1_7__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1602:2: rule__ContainerElementDefinition__Group_1_7__0__Impl rule__ContainerElementDefinition__Group_1_7__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_7__0__Impl_in_rule__ContainerElementDefinition__Group_1_7__03186);
            rule__ContainerElementDefinition__Group_1_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_7__1_in_rule__ContainerElementDefinition__Group_1_7__03189);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1609:1: rule__ContainerElementDefinition__Group_1_7__0__Impl : ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 ) ) ;
    public final void rule__ContainerElementDefinition__Group_1_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1613:1: ( ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1614:1: ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1614:1: ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1615:1: ( rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceAssignment_1_7_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1616:1: ( rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1616:2: rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0_in_rule__ContainerElementDefinition__Group_1_7__0__Impl3216);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1626:1: rule__ContainerElementDefinition__Group_1_7__1 : rule__ContainerElementDefinition__Group_1_7__1__Impl ;
    public final void rule__ContainerElementDefinition__Group_1_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1630:1: ( rule__ContainerElementDefinition__Group_1_7__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1631:2: rule__ContainerElementDefinition__Group_1_7__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1_7__1__Impl_in_rule__ContainerElementDefinition__Group_1_7__13246);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1637:1: rule__ContainerElementDefinition__Group_1_7__1__Impl : ( ':' ) ;
    public final void rule__ContainerElementDefinition__Group_1_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1641:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1642:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1642:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1643:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_1_7_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__ContainerElementDefinition__Group_1_7__1__Impl3274); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1660:1: rule__EmptyElementDefinition__Group__0 : rule__EmptyElementDefinition__Group__0__Impl rule__EmptyElementDefinition__Group__1 ;
    public final void rule__EmptyElementDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1664:1: ( rule__EmptyElementDefinition__Group__0__Impl rule__EmptyElementDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1665:2: rule__EmptyElementDefinition__Group__0__Impl rule__EmptyElementDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__0__Impl_in_rule__EmptyElementDefinition__Group__03309);
            rule__EmptyElementDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__1_in_rule__EmptyElementDefinition__Group__03312);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1672:1: rule__EmptyElementDefinition__Group__0__Impl : ( '<' ) ;
    public final void rule__EmptyElementDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1676:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1677:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1677:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1678:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getLessThanSignKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__EmptyElementDefinition__Group__0__Impl3340); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1691:1: rule__EmptyElementDefinition__Group__1 : rule__EmptyElementDefinition__Group__1__Impl rule__EmptyElementDefinition__Group__2 ;
    public final void rule__EmptyElementDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1695:1: ( rule__EmptyElementDefinition__Group__1__Impl rule__EmptyElementDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1696:2: rule__EmptyElementDefinition__Group__1__Impl rule__EmptyElementDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__1__Impl_in_rule__EmptyElementDefinition__Group__13371);
            rule__EmptyElementDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__2_in_rule__EmptyElementDefinition__Group__13374);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1703:1: rule__EmptyElementDefinition__Group__1__Impl : ( ( rule__EmptyElementDefinition__Group_1__0 )? ) ;
    public final void rule__EmptyElementDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1707:1: ( ( ( rule__EmptyElementDefinition__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1708:1: ( ( rule__EmptyElementDefinition__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1708:1: ( ( rule__EmptyElementDefinition__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1709:1: ( rule__EmptyElementDefinition__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1710:1: ( rule__EmptyElementDefinition__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==10) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1710:2: rule__EmptyElementDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__0_in_rule__EmptyElementDefinition__Group__1__Impl3401);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1720:1: rule__EmptyElementDefinition__Group__2 : rule__EmptyElementDefinition__Group__2__Impl rule__EmptyElementDefinition__Group__3 ;
    public final void rule__EmptyElementDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1724:1: ( rule__EmptyElementDefinition__Group__2__Impl rule__EmptyElementDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1725:2: rule__EmptyElementDefinition__Group__2__Impl rule__EmptyElementDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__2__Impl_in_rule__EmptyElementDefinition__Group__23432);
            rule__EmptyElementDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__3_in_rule__EmptyElementDefinition__Group__23435);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1732:1: rule__EmptyElementDefinition__Group__2__Impl : ( ( rule__EmptyElementDefinition__NameAssignment_2 ) ) ;
    public final void rule__EmptyElementDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1736:1: ( ( ( rule__EmptyElementDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1737:1: ( ( rule__EmptyElementDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1737:1: ( ( rule__EmptyElementDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1738:1: ( rule__EmptyElementDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1739:1: ( rule__EmptyElementDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1739:2: rule__EmptyElementDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__NameAssignment_2_in_rule__EmptyElementDefinition__Group__2__Impl3462);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1749:1: rule__EmptyElementDefinition__Group__3 : rule__EmptyElementDefinition__Group__3__Impl rule__EmptyElementDefinition__Group__4 ;
    public final void rule__EmptyElementDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1753:1: ( rule__EmptyElementDefinition__Group__3__Impl rule__EmptyElementDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1754:2: rule__EmptyElementDefinition__Group__3__Impl rule__EmptyElementDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__3__Impl_in_rule__EmptyElementDefinition__Group__33492);
            rule__EmptyElementDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__4_in_rule__EmptyElementDefinition__Group__33495);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1761:1: rule__EmptyElementDefinition__Group__3__Impl : ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* ) ;
    public final void rule__EmptyElementDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1765:1: ( ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1766:1: ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1766:1: ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1767:1: ( rule__EmptyElementDefinition__PropsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getPropsAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1768:1: ( rule__EmptyElementDefinition__PropsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1768:2: rule__EmptyElementDefinition__PropsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__EmptyElementDefinition__PropsAssignment_3_in_rule__EmptyElementDefinition__Group__3__Impl3522);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1778:1: rule__EmptyElementDefinition__Group__4 : rule__EmptyElementDefinition__Group__4__Impl ;
    public final void rule__EmptyElementDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1782:1: ( rule__EmptyElementDefinition__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1783:2: rule__EmptyElementDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__4__Impl_in_rule__EmptyElementDefinition__Group__43553);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1789:1: rule__EmptyElementDefinition__Group__4__Impl : ( '/>' ) ;
    public final void rule__EmptyElementDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1793:1: ( ( '/>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1794:1: ( '/>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1794:1: ( '/>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1795:1: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getSolidusGreaterThanSignKeyword_4()); 
            }
            match(input,17,FOLLOW_17_in_rule__EmptyElementDefinition__Group__4__Impl3581); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1818:1: rule__EmptyElementDefinition__Group_1__0 : rule__EmptyElementDefinition__Group_1__0__Impl rule__EmptyElementDefinition__Group_1__1 ;
    public final void rule__EmptyElementDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1822:1: ( rule__EmptyElementDefinition__Group_1__0__Impl rule__EmptyElementDefinition__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1823:2: rule__EmptyElementDefinition__Group_1__0__Impl rule__EmptyElementDefinition__Group_1__1
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__0__Impl_in_rule__EmptyElementDefinition__Group_1__03622);
            rule__EmptyElementDefinition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__1_in_rule__EmptyElementDefinition__Group_1__03625);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1830:1: rule__EmptyElementDefinition__Group_1__0__Impl : ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) ) ;
    public final void rule__EmptyElementDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1834:1: ( ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1835:1: ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1835:1: ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1836:1: ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNamespaceAssignment_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1837:1: ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1837:2: rule__EmptyElementDefinition__NamespaceAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__NamespaceAssignment_1_0_in_rule__EmptyElementDefinition__Group_1__0__Impl3652);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1847:1: rule__EmptyElementDefinition__Group_1__1 : rule__EmptyElementDefinition__Group_1__1__Impl ;
    public final void rule__EmptyElementDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1851:1: ( rule__EmptyElementDefinition__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1852:2: rule__EmptyElementDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__1__Impl_in_rule__EmptyElementDefinition__Group_1__13682);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1858:1: rule__EmptyElementDefinition__Group_1__1__Impl : ( ':' ) ;
    public final void rule__EmptyElementDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1862:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1863:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1863:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1864:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getColonKeyword_1_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__EmptyElementDefinition__Group_1__1__Impl3710); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1881:1: rule__AttributePropertyDefinition__Group__0 : rule__AttributePropertyDefinition__Group__0__Impl rule__AttributePropertyDefinition__Group__1 ;
    public final void rule__AttributePropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1885:1: ( rule__AttributePropertyDefinition__Group__0__Impl rule__AttributePropertyDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1886:2: rule__AttributePropertyDefinition__Group__0__Impl rule__AttributePropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__0__Impl_in_rule__AttributePropertyDefinition__Group__03745);
            rule__AttributePropertyDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__1_in_rule__AttributePropertyDefinition__Group__03748);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1893:1: rule__AttributePropertyDefinition__Group__0__Impl : ( ( rule__AttributePropertyDefinition__Group_0__0 )? ) ;
    public final void rule__AttributePropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1897:1: ( ( ( rule__AttributePropertyDefinition__Group_0__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1898:1: ( ( rule__AttributePropertyDefinition__Group_0__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1898:1: ( ( rule__AttributePropertyDefinition__Group_0__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1899:1: ( rule__AttributePropertyDefinition__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getGroup_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1900:1: ( rule__AttributePropertyDefinition__Group_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==10) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1900:2: rule__AttributePropertyDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__0_in_rule__AttributePropertyDefinition__Group__0__Impl3775);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1910:1: rule__AttributePropertyDefinition__Group__1 : rule__AttributePropertyDefinition__Group__1__Impl rule__AttributePropertyDefinition__Group__2 ;
    public final void rule__AttributePropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1914:1: ( rule__AttributePropertyDefinition__Group__1__Impl rule__AttributePropertyDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1915:2: rule__AttributePropertyDefinition__Group__1__Impl rule__AttributePropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__1__Impl_in_rule__AttributePropertyDefinition__Group__13806);
            rule__AttributePropertyDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__2_in_rule__AttributePropertyDefinition__Group__13809);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1922:1: rule__AttributePropertyDefinition__Group__1__Impl : ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) ) ;
    public final void rule__AttributePropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1926:1: ( ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1927:1: ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1927:1: ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1928:1: ( rule__AttributePropertyDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1929:1: ( rule__AttributePropertyDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1929:2: rule__AttributePropertyDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__NameAssignment_1_in_rule__AttributePropertyDefinition__Group__1__Impl3836);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1939:1: rule__AttributePropertyDefinition__Group__2 : rule__AttributePropertyDefinition__Group__2__Impl rule__AttributePropertyDefinition__Group__3 ;
    public final void rule__AttributePropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1943:1: ( rule__AttributePropertyDefinition__Group__2__Impl rule__AttributePropertyDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1944:2: rule__AttributePropertyDefinition__Group__2__Impl rule__AttributePropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__2__Impl_in_rule__AttributePropertyDefinition__Group__23866);
            rule__AttributePropertyDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__3_in_rule__AttributePropertyDefinition__Group__23869);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1951:1: rule__AttributePropertyDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__AttributePropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1955:1: ( ( '=' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1956:1: ( '=' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1956:1: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1957:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__AttributePropertyDefinition__Group__2__Impl3897); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1970:1: rule__AttributePropertyDefinition__Group__3 : rule__AttributePropertyDefinition__Group__3__Impl ;
    public final void rule__AttributePropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1974:1: ( rule__AttributePropertyDefinition__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1975:2: rule__AttributePropertyDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__3__Impl_in_rule__AttributePropertyDefinition__Group__33928);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1981:1: rule__AttributePropertyDefinition__Group__3__Impl : ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) ) ;
    public final void rule__AttributePropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1985:1: ( ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1986:1: ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1986:1: ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1987:1: ( rule__AttributePropertyDefinition__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getValueAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1988:1: ( rule__AttributePropertyDefinition__ValueAssignment_3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1988:2: rule__AttributePropertyDefinition__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__ValueAssignment_3_in_rule__AttributePropertyDefinition__Group__3__Impl3955);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2006:1: rule__AttributePropertyDefinition__Group_0__0 : rule__AttributePropertyDefinition__Group_0__0__Impl rule__AttributePropertyDefinition__Group_0__1 ;
    public final void rule__AttributePropertyDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2010:1: ( rule__AttributePropertyDefinition__Group_0__0__Impl rule__AttributePropertyDefinition__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2011:2: rule__AttributePropertyDefinition__Group_0__0__Impl rule__AttributePropertyDefinition__Group_0__1
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__0__Impl_in_rule__AttributePropertyDefinition__Group_0__03993);
            rule__AttributePropertyDefinition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__1_in_rule__AttributePropertyDefinition__Group_0__03996);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2018:1: rule__AttributePropertyDefinition__Group_0__0__Impl : ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) ) ;
    public final void rule__AttributePropertyDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2022:1: ( ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2023:1: ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2023:1: ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2024:1: ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNamespaceAssignment_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2025:1: ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2025:2: rule__AttributePropertyDefinition__NamespaceAssignment_0_0
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__NamespaceAssignment_0_0_in_rule__AttributePropertyDefinition__Group_0__0__Impl4023);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2035:1: rule__AttributePropertyDefinition__Group_0__1 : rule__AttributePropertyDefinition__Group_0__1__Impl ;
    public final void rule__AttributePropertyDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2039:1: ( rule__AttributePropertyDefinition__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2040:2: rule__AttributePropertyDefinition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__1__Impl_in_rule__AttributePropertyDefinition__Group_0__14053);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2046:1: rule__AttributePropertyDefinition__Group_0__1__Impl : ( ':' ) ;
    public final void rule__AttributePropertyDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2050:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2051:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2051:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2052:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getColonKeyword_0_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__AttributePropertyDefinition__Group_0__1__Impl4081); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2069:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2073:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2074:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04116);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04119);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2081:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2085:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2086:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2086:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2087:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4146); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2098:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2102:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2103:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14175);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2109:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2113:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2114:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2114:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2115:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2116:1: ( rule__QualifiedName__Group_1__0 )*
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
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2116:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4202);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2130:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2134:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2135:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04237);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04240);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2142:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2146:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2147:1: ( ( '.' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2147:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2148:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2149:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2150:2: '.'
            {
            match(input,9,FOLLOW_9_in_rule__QualifiedName__Group_1__0__Impl4269); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2161:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2165:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2166:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14301);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2172:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2176:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2177:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2177:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2178:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4328); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2193:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2197:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2198:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__04361);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__04364);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2205:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2209:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2210:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2210:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2211:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl4391);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2222:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2226:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2227:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__14420);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2233:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2237:1: ( ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2238:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2238:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2239:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2240:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==9) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2240:2: rule__QualifiedNameWithWildCard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl4447);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2254:1: rule__QualifiedNameWithWildCard__Group_1__0 : rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2258:1: ( rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2259:2: rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__04482);
            rule__QualifiedNameWithWildCard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__04485);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2266:1: rule__QualifiedNameWithWildCard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2270:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2271:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2271:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2272:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,9,FOLLOW_9_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl4513); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2285:1: rule__QualifiedNameWithWildCard__Group_1__1 : rule__QualifiedNameWithWildCard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2289:1: ( rule__QualifiedNameWithWildCard__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2290:2: rule__QualifiedNameWithWildCard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__14544);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2296:1: rule__QualifiedNameWithWildCard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2300:1: ( ( '*' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2301:1: ( '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2301:1: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2302:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl4572); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2320:1: rule__FXML__XmlDecAssignment_0 : ( ruleXMLDec ) ;
    public final void rule__FXML__XmlDecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2324:1: ( ( ruleXMLDec ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2325:1: ( ruleXMLDec )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2325:1: ( ruleXMLDec )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2326:1: ruleXMLDec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getXmlDecXMLDecParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleXMLDec_in_rule__FXML__XmlDecAssignment_04612);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2335:1: rule__FXML__ProcessingInstructionsAssignment_1 : ( ruleProcessingInstruction ) ;
    public final void rule__FXML__ProcessingInstructionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2339:1: ( ( ruleProcessingInstruction ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2340:1: ( ruleProcessingInstruction )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2340:1: ( ruleProcessingInstruction )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2341:1: ruleProcessingInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getProcessingInstructionsProcessingInstructionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleProcessingInstruction_in_rule__FXML__ProcessingInstructionsAssignment_14643);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2350:1: rule__FXML__RootElementAssignment_2 : ( ruleElementDefinition ) ;
    public final void rule__FXML__RootElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2354:1: ( ( ruleElementDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2355:1: ( ruleElementDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2355:1: ( ruleElementDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2356:1: ruleElementDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getRootElementElementDefinitionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_rule__FXML__RootElementAssignment_24674);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2365:1: rule__XMLDec__PropsAssignment_1 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__XMLDec__PropsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2369:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2370:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2370:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2371:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getPropsAttributePropertyDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__XMLDec__PropsAssignment_14705);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2380:1: rule__ProcessingInstruction__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProcessingInstruction__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2384:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2385:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2385:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2386:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getTypeIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessingInstruction__TypeAssignment_14736); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2395:1: rule__ProcessingInstruction__ImportedNamespaceAssignment_2 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__ProcessingInstruction__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2399:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2400:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2400:1: ( ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2401:1: ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__ProcessingInstruction__ImportedNamespaceAssignment_24767);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2410:1: rule__ContainerElementDefinition__NamespaceAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__ContainerElementDefinition__NamespaceAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2414:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2415:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2415:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2416:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNamespaceIDTerminalRuleCall_0_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__NamespaceAssignment_0_1_04798); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2425:1: rule__ContainerElementDefinition__NameAssignment_0_2 : ( ruleQualifiedName ) ;
    public final void rule__ContainerElementDefinition__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2429:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2430:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2430:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2431:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNameQualifiedNameParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__NameAssignment_0_24829);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2440:1: rule__ContainerElementDefinition__PropertiesAssignment_0_3 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__ContainerElementDefinition__PropertiesAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2444:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2445:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2445:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2446:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAttributePropertyDefinitionParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__ContainerElementDefinition__PropertiesAssignment_0_34860);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2455:1: rule__ContainerElementDefinition__ChildrenAssignment_0_5 : ( ruleElementDefinition ) ;
    public final void rule__ContainerElementDefinition__ChildrenAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2459:1: ( ( ruleElementDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2460:1: ( ruleElementDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2460:1: ( ruleElementDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2461:1: ruleElementDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getChildrenElementDefinitionParserRuleCall_0_5_0()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_rule__ContainerElementDefinition__ChildrenAssignment_0_54891);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2470:1: rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0 : ( RULE_ID ) ;
    public final void rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2474:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2475:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2475:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2476:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceIDTerminalRuleCall_0_7_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_04922); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2485:1: rule__ContainerElementDefinition__EndnameAssignment_0_8 : ( ruleQualifiedName ) ;
    public final void rule__ContainerElementDefinition__EndnameAssignment_0_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2489:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2490:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2490:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2491:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnameQualifiedNameParserRuleCall_0_8_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__EndnameAssignment_0_84953);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2500:1: rule__ContainerElementDefinition__NamespaceAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__ContainerElementDefinition__NamespaceAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2504:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2505:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2505:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2506:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__NamespaceAssignment_1_1_04984); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2515:1: rule__ContainerElementDefinition__NameAssignment_1_2 : ( ruleQualifiedName ) ;
    public final void rule__ContainerElementDefinition__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2519:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2520:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2520:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2521:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNameQualifiedNameParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__NameAssignment_1_25015);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2530:1: rule__ContainerElementDefinition__PropertiesAssignment_1_3 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__ContainerElementDefinition__PropertiesAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2534:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2535:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2535:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2536:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAttributePropertyDefinitionParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__ContainerElementDefinition__PropertiesAssignment_1_35046);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2545:1: rule__ContainerElementDefinition__ContentAssignment_1_5 : ( ruleContent ) ;
    public final void rule__ContainerElementDefinition__ContentAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2549:1: ( ( ruleContent ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2550:1: ( ruleContent )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2550:1: ( ruleContent )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2551:1: ruleContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getContentContentParserRuleCall_1_5_0()); 
            }
            pushFollow(FOLLOW_ruleContent_in_rule__ContainerElementDefinition__ContentAssignment_1_55077);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2560:1: rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0 : ( RULE_ID ) ;
    public final void rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2564:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2565:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2565:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2566:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceIDTerminalRuleCall_1_7_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_05108); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2575:1: rule__ContainerElementDefinition__EndnameAssignment_1_8 : ( ruleQualifiedName ) ;
    public final void rule__ContainerElementDefinition__EndnameAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2579:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2580:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2580:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2581:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnameQualifiedNameParserRuleCall_1_8_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__EndnameAssignment_1_85139);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2590:1: rule__EmptyElementDefinition__NamespaceAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__EmptyElementDefinition__NamespaceAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2594:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2595:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2595:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2596:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EmptyElementDefinition__NamespaceAssignment_1_05170); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2605:1: rule__EmptyElementDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__EmptyElementDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2609:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2610:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2610:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2611:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EmptyElementDefinition__NameAssignment_25201);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2620:1: rule__EmptyElementDefinition__PropsAssignment_3 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__EmptyElementDefinition__PropsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2624:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2625:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2625:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2626:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getPropsAttributePropertyDefinitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__EmptyElementDefinition__PropsAssignment_35232);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2635:1: rule__AttributePropertyDefinition__NamespaceAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__AttributePropertyDefinition__NamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2639:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2640:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2640:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2641:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNamespaceIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributePropertyDefinition__NamespaceAssignment_0_05263); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2650:1: rule__AttributePropertyDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributePropertyDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2654:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2655:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2655:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2656:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributePropertyDefinition__NameAssignment_15294); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2665:1: rule__AttributePropertyDefinition__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AttributePropertyDefinition__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2669:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2670:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2670:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2671:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttributePropertyDefinition__ValueAssignment_35325); if (state.failed) return ;
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
        "\1\16\3\4\1\12\2\uffff\2\4\1\5\3\4\1\22";
    static final String DFA2_maxS =
        "\1\16\1\4\1\21\1\4\1\22\2\uffff\1\4\1\21\1\5\1\4\2\21\1\22";
    static final String DFA2_acceptS =
        "\5\uffff\1\1\1\2\7\uffff";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\4\uffff\1\3\1\7\4\uffff\1\5\1\uffff\1\6",
            "\1\10",
            "\1\12\7\uffff\1\11",
            "",
            "",
            "\1\13",
            "\1\4\4\uffff\1\3\5\uffff\1\5\1\uffff\1\6",
            "\1\14",
            "\1\15",
            "\1\4\4\uffff\1\3\5\uffff\1\5\1\uffff\1\6",
            "\1\4\12\uffff\1\5\1\uffff\1\6",
            "\1\11"
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
        "\1\16\3\4\1\12\3\4\1\5\1\4\2\uffff\2\4\1\22";
    static final String DFA3_maxS =
        "\1\16\1\4\1\17\1\4\1\22\1\20\1\4\1\17\1\5\1\4\2\uffff\2\17\1\22";
    static final String DFA3_acceptS =
        "\12\uffff\1\1\1\2\3\uffff";
    static final String DFA3_specialS =
        "\17\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\4\uffff\1\3\1\6\4\uffff\1\5",
            "\1\7",
            "\1\11\7\uffff\1\10",
            "\4\13\1\uffff\2\13\3\uffff\1\12\1\uffff\1\13",
            "\1\14",
            "\1\4\4\uffff\1\3\5\uffff\1\5",
            "\1\15",
            "\1\16",
            "",
            "",
            "\1\4\4\uffff\1\3\5\uffff\1\5",
            "\1\4\12\uffff\1\5",
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
    public static final BitSet FOLLOW_rule__Content__Alternatives_in_ruleContent529 = new BitSet(new long[]{0x00000000000006F2L});
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
    public static final BitSet FOLLOW_10_in_rule__Content__Alternatives875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__Group__0__Impl_in_rule__FXML__Group__0907 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__FXML__Group__1_in_rule__FXML__Group__0910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__XmlDecAssignment_0_in_rule__FXML__Group__0__Impl937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__Group__1__Impl_in_rule__FXML__Group__1967 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__FXML__Group__2_in_rule__FXML__Group__1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__ProcessingInstructionsAssignment_1_in_rule__FXML__Group__1__Impl997 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__FXML__Group__2__Impl_in_rule__FXML__Group__21028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__RootElementAssignment_2_in_rule__FXML__Group__2__Impl1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__0__Impl_in_rule__XMLDec__Group__01091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__1_in_rule__XMLDec__Group__01094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__XMLDec__Group__0__Impl1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__1__Impl_in_rule__XMLDec__Group__11153 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__2_in_rule__XMLDec__Group__11156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1185 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1197 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__2__Impl_in_rule__XMLDec__Group__21230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__XMLDec__Group__2__Impl1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__0__Impl_in_rule__ProcessingInstruction__Group__01295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__1_in_rule__ProcessingInstruction__Group__01298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ProcessingInstruction__Group__0__Impl1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__1__Impl_in_rule__ProcessingInstruction__Group__11357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__2_in_rule__ProcessingInstruction__Group__11360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__TypeAssignment_1_in_rule__ProcessingInstruction__Group__1__Impl1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__2__Impl_in_rule__ProcessingInstruction__Group__21417 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__3_in_rule__ProcessingInstruction__Group__21420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__ImportedNamespaceAssignment_2_in_rule__ProcessingInstruction__Group__2__Impl1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__3__Impl_in_rule__ProcessingInstruction__Group__31477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ProcessingInstruction__Group__3__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__0__Impl_in_rule__ContainerElementDefinition__Group_0__01544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__1_in_rule__ContainerElementDefinition__Group_0__01547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ContainerElementDefinition__Group_0__0__Impl1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__1__Impl_in_rule__ContainerElementDefinition__Group_0__11606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__2_in_rule__ContainerElementDefinition__Group_0__11609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_1__0_in_rule__ContainerElementDefinition__Group_0__1__Impl1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__2__Impl_in_rule__ContainerElementDefinition__Group_0__21667 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__3_in_rule__ContainerElementDefinition__Group_0__21670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__NameAssignment_0_2_in_rule__ContainerElementDefinition__Group_0__2__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__3__Impl_in_rule__ContainerElementDefinition__Group_0__31727 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__4_in_rule__ContainerElementDefinition__Group_0__31730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__PropertiesAssignment_0_3_in_rule__ContainerElementDefinition__Group_0__3__Impl1757 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__4__Impl_in_rule__ContainerElementDefinition__Group_0__41788 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__5_in_rule__ContainerElementDefinition__Group_0__41791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ContainerElementDefinition__Group_0__4__Impl1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__5__Impl_in_rule__ContainerElementDefinition__Group_0__51850 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__6_in_rule__ContainerElementDefinition__Group_0__51853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__ChildrenAssignment_0_5_in_rule__ContainerElementDefinition__Group_0__5__Impl1882 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__ChildrenAssignment_0_5_in_rule__ContainerElementDefinition__Group_0__5__Impl1894 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__6__Impl_in_rule__ContainerElementDefinition__Group_0__61927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__7_in_rule__ContainerElementDefinition__Group_0__61930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ContainerElementDefinition__Group_0__6__Impl1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__7__Impl_in_rule__ContainerElementDefinition__Group_0__71989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__8_in_rule__ContainerElementDefinition__Group_0__71992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_7__0_in_rule__ContainerElementDefinition__Group_0__7__Impl2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__8__Impl_in_rule__ContainerElementDefinition__Group_0__82050 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__9_in_rule__ContainerElementDefinition__Group_0__82053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__EndnameAssignment_0_8_in_rule__ContainerElementDefinition__Group_0__8__Impl2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0__9__Impl_in_rule__ContainerElementDefinition__Group_0__92110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ContainerElementDefinition__Group_0__9__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_1__0__Impl_in_rule__ContainerElementDefinition__Group_0_1__02189 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_1__1_in_rule__ContainerElementDefinition__Group_0_1__02192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__NamespaceAssignment_0_1_0_in_rule__ContainerElementDefinition__Group_0_1__0__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_1__1__Impl_in_rule__ContainerElementDefinition__Group_0_1__12249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__ContainerElementDefinition__Group_0_1__1__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_7__0__Impl_in_rule__ContainerElementDefinition__Group_0_7__02312 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_7__1_in_rule__ContainerElementDefinition__Group_0_7__02315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_0_in_rule__ContainerElementDefinition__Group_0_7__0__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_0_7__1__Impl_in_rule__ContainerElementDefinition__Group_0_7__12372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__ContainerElementDefinition__Group_0_7__1__Impl2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__0__Impl_in_rule__ContainerElementDefinition__Group_1__02435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__1_in_rule__ContainerElementDefinition__Group_1__02438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ContainerElementDefinition__Group_1__0__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__1__Impl_in_rule__ContainerElementDefinition__Group_1__12497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__2_in_rule__ContainerElementDefinition__Group_1__12500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_1__0_in_rule__ContainerElementDefinition__Group_1__1__Impl2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__2__Impl_in_rule__ContainerElementDefinition__Group_1__22558 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__3_in_rule__ContainerElementDefinition__Group_1__22561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__NameAssignment_1_2_in_rule__ContainerElementDefinition__Group_1__2__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__3__Impl_in_rule__ContainerElementDefinition__Group_1__32618 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__4_in_rule__ContainerElementDefinition__Group_1__32621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__PropertiesAssignment_1_3_in_rule__ContainerElementDefinition__Group_1__3__Impl2648 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__4__Impl_in_rule__ContainerElementDefinition__Group_1__42679 = new BitSet(new long[]{0x00000000000006F0L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__5_in_rule__ContainerElementDefinition__Group_1__42682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ContainerElementDefinition__Group_1__4__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__5__Impl_in_rule__ContainerElementDefinition__Group_1__52741 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__6_in_rule__ContainerElementDefinition__Group_1__52744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__ContentAssignment_1_5_in_rule__ContainerElementDefinition__Group_1__5__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__6__Impl_in_rule__ContainerElementDefinition__Group_1__62801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__7_in_rule__ContainerElementDefinition__Group_1__62804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ContainerElementDefinition__Group_1__6__Impl2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__7__Impl_in_rule__ContainerElementDefinition__Group_1__72863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__8_in_rule__ContainerElementDefinition__Group_1__72866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_7__0_in_rule__ContainerElementDefinition__Group_1__7__Impl2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__8__Impl_in_rule__ContainerElementDefinition__Group_1__82924 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__9_in_rule__ContainerElementDefinition__Group_1__82927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__EndnameAssignment_1_8_in_rule__ContainerElementDefinition__Group_1__8__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__9__Impl_in_rule__ContainerElementDefinition__Group_1__92984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ContainerElementDefinition__Group_1__9__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_1__0__Impl_in_rule__ContainerElementDefinition__Group_1_1__03063 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_1__1_in_rule__ContainerElementDefinition__Group_1_1__03066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__NamespaceAssignment_1_1_0_in_rule__ContainerElementDefinition__Group_1_1__0__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_1__1__Impl_in_rule__ContainerElementDefinition__Group_1_1__13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__ContainerElementDefinition__Group_1_1__1__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_7__0__Impl_in_rule__ContainerElementDefinition__Group_1_7__03186 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_7__1_in_rule__ContainerElementDefinition__Group_1_7__03189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_0_in_rule__ContainerElementDefinition__Group_1_7__0__Impl3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1_7__1__Impl_in_rule__ContainerElementDefinition__Group_1_7__13246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__ContainerElementDefinition__Group_1_7__1__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__0__Impl_in_rule__EmptyElementDefinition__Group__03309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__1_in_rule__EmptyElementDefinition__Group__03312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EmptyElementDefinition__Group__0__Impl3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__1__Impl_in_rule__EmptyElementDefinition__Group__13371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__2_in_rule__EmptyElementDefinition__Group__13374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__0_in_rule__EmptyElementDefinition__Group__1__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__2__Impl_in_rule__EmptyElementDefinition__Group__23432 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__3_in_rule__EmptyElementDefinition__Group__23435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__NameAssignment_2_in_rule__EmptyElementDefinition__Group__2__Impl3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__3__Impl_in_rule__EmptyElementDefinition__Group__33492 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__4_in_rule__EmptyElementDefinition__Group__33495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__PropsAssignment_3_in_rule__EmptyElementDefinition__Group__3__Impl3522 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__4__Impl_in_rule__EmptyElementDefinition__Group__43553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EmptyElementDefinition__Group__4__Impl3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__0__Impl_in_rule__EmptyElementDefinition__Group_1__03622 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__1_in_rule__EmptyElementDefinition__Group_1__03625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__NamespaceAssignment_1_0_in_rule__EmptyElementDefinition__Group_1__0__Impl3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__1__Impl_in_rule__EmptyElementDefinition__Group_1__13682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__EmptyElementDefinition__Group_1__1__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__0__Impl_in_rule__AttributePropertyDefinition__Group__03745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__1_in_rule__AttributePropertyDefinition__Group__03748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__0_in_rule__AttributePropertyDefinition__Group__0__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__1__Impl_in_rule__AttributePropertyDefinition__Group__13806 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__2_in_rule__AttributePropertyDefinition__Group__13809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__NameAssignment_1_in_rule__AttributePropertyDefinition__Group__1__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__2__Impl_in_rule__AttributePropertyDefinition__Group__23866 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__3_in_rule__AttributePropertyDefinition__Group__23869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AttributePropertyDefinition__Group__2__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__3__Impl_in_rule__AttributePropertyDefinition__Group__33928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__ValueAssignment_3_in_rule__AttributePropertyDefinition__Group__3__Impl3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__0__Impl_in_rule__AttributePropertyDefinition__Group_0__03993 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__1_in_rule__AttributePropertyDefinition__Group_0__03996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__NamespaceAssignment_0_0_in_rule__AttributePropertyDefinition__Group_0__0__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__1__Impl_in_rule__AttributePropertyDefinition__Group_0__14053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__AttributePropertyDefinition__Group_0__1__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04116 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4202 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__QualifiedName__Group_1__0__Impl4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__04361 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__04364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__14420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__04482 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__04485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__14544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDec_in_rule__FXML__XmlDecAssignment_04612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingInstruction_in_rule__FXML__ProcessingInstructionsAssignment_14643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_rule__FXML__RootElementAssignment_24674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__XMLDec__PropsAssignment_14705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessingInstruction__TypeAssignment_14736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__ProcessingInstruction__ImportedNamespaceAssignment_24767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__NamespaceAssignment_0_1_04798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__NameAssignment_0_24829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__ContainerElementDefinition__PropertiesAssignment_0_34860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_rule__ContainerElementDefinition__ChildrenAssignment_0_54891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__EndnamespaceAssignment_0_7_04922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__EndnameAssignment_0_84953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__NamespaceAssignment_1_1_04984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__NameAssignment_1_25015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__ContainerElementDefinition__PropertiesAssignment_1_35046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rule__ContainerElementDefinition__ContentAssignment_1_55077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__EndnamespaceAssignment_1_7_05108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__EndnameAssignment_1_85139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EmptyElementDefinition__NamespaceAssignment_1_05170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EmptyElementDefinition__NameAssignment_25201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__EmptyElementDefinition__PropsAssignment_35232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributePropertyDefinition__NamespaceAssignment_0_05263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributePropertyDefinition__NameAssignment_15294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributePropertyDefinition__ValueAssignment_35325 = new BitSet(new long[]{0x0000000000000002L});

}