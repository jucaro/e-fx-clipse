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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:182:1: ruleContainerElementDefinition : ( ( rule__ContainerElementDefinition__Group__0 ) ) ;
    public final void ruleContainerElementDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:186:2: ( ( ( rule__ContainerElementDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:187:1: ( ( rule__ContainerElementDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:187:1: ( ( rule__ContainerElementDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:188:1: ( rule__ContainerElementDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:189:1: ( rule__ContainerElementDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:189:2: rule__ContainerElementDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__0_in_ruleContainerElementDefinition340);
            rule__ContainerElementDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getGroup()); 
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


    // $ANTLR start "entryRulePCData"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:229:1: entryRulePCData : rulePCData EOF ;
    public final void entryRulePCData() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:230:1: ( rulePCData EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:231:1: rulePCData EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPCDataRule()); 
            }
            pushFollow(FOLLOW_rulePCData_in_entryRulePCData427);
            rulePCData();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPCDataRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePCData434); if (state.failed) return ;

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
    // $ANTLR end "entryRulePCData"


    // $ANTLR start "rulePCData"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:238:1: rulePCData : ( ( rule__PCData__ContentAssignment ) ) ;
    public final void rulePCData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:242:2: ( ( ( rule__PCData__ContentAssignment ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:243:1: ( ( rule__PCData__ContentAssignment ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:243:1: ( ( rule__PCData__ContentAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:244:1: ( rule__PCData__ContentAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPCDataAccess().getContentAssignment()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:245:1: ( rule__PCData__ContentAssignment )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:245:2: rule__PCData__ContentAssignment
            {
            pushFollow(FOLLOW_rule__PCData__ContentAssignment_in_rulePCData460);
            rule__PCData__ContentAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPCDataAccess().getContentAssignment()); 
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
    // $ANTLR end "rulePCData"


    // $ANTLR start "entryRuleAttributePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:257:1: entryRuleAttributePropertyDefinition : ruleAttributePropertyDefinition EOF ;
    public final void entryRuleAttributePropertyDefinition() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:258:1: ( ruleAttributePropertyDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:259:1: ruleAttributePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_entryRuleAttributePropertyDefinition487);
            ruleAttributePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePropertyDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributePropertyDefinition494); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:266:1: ruleAttributePropertyDefinition : ( ( rule__AttributePropertyDefinition__Group__0 ) ) ;
    public final void ruleAttributePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:270:2: ( ( ( rule__AttributePropertyDefinition__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:271:1: ( ( rule__AttributePropertyDefinition__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:271:1: ( ( rule__AttributePropertyDefinition__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:272:1: ( rule__AttributePropertyDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:273:1: ( rule__AttributePropertyDefinition__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:273:2: rule__AttributePropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__0_in_ruleAttributePropertyDefinition520);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:285:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");

        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:289:1: ( ruleContent EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:290:1: ruleContent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentRule()); 
            }
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent552);
            ruleContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent559); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:300:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:305:2: ( ( ( rule__Content__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:306:1: ( ( rule__Content__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:306:1: ( ( rule__Content__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:307:1: ( rule__Content__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:308:1: ( rule__Content__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:308:2: rule__Content__Group__0
            {
            pushFollow(FOLLOW_rule__Content__Group__0_in_ruleContent589);
            rule__Content__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContentAccess().getGroup()); 
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:321:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:322:1: ( ruleQualifiedName EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:323:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName616);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName623); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:330:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:334:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:335:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:335:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:336:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:337:1: ( rule__QualifiedName__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:337:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName649);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:349:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:350:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:351:1: ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard676);
            ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard683); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:358:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:362:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:363:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:363:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:364:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:365:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:365:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard709);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:377:1: rule__ElementDefinition__Alternatives : ( ( ruleContainerElementDefinition ) | ( ruleEmptyElementDefinition ) );
    public final void rule__ElementDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:381:1: ( ( ruleContainerElementDefinition ) | ( ruleEmptyElementDefinition ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:382:1: ( ruleContainerElementDefinition )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:382:1: ( ruleContainerElementDefinition )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:383:1: ruleContainerElementDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getContainerElementDefinitionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleContainerElementDefinition_in_rule__ElementDefinition__Alternatives745);
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
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:388:6: ( ruleEmptyElementDefinition )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:388:6: ( ruleEmptyElementDefinition )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:389:1: ruleEmptyElementDefinition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementDefinitionAccess().getEmptyElementDefinitionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleEmptyElementDefinition_in_rule__ElementDefinition__Alternatives762);
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


    // $ANTLR start "rule__Content__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:399:1: rule__Content__Alternatives_0 : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( '.' ) | ( ':' ) );
    public final void rule__Content__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:403:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( '.' ) | ( ':' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
                {
                alt2=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt2=3;
                }
                break;
            case 9:
                {
                alt2=4;
                }
                break;
            case 10:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:404:1: ( RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:404:1: ( RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:405:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getIDTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Content__Alternatives_0794); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getIDTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:410:6: ( RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:410:6: ( RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:411:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Content__Alternatives_0811); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:416:6: ( RULE_ANY_OTHER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:416:6: ( RULE_ANY_OTHER )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:417:1: RULE_ANY_OTHER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getANY_OTHERTerminalRuleCall_0_2()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__Content__Alternatives_0828); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getANY_OTHERTerminalRuleCall_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:422:6: ( '.' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:422:6: ( '.' )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:423:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getFullStopKeyword_0_3()); 
                    }
                    match(input,9,FOLLOW_9_in_rule__Content__Alternatives_0846); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getFullStopKeyword_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:430:6: ( ':' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:430:6: ( ':' )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:431:1: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getColonKeyword_0_4()); 
                    }
                    match(input,10,FOLLOW_10_in_rule__Content__Alternatives_0866); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getColonKeyword_0_4()); 
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
    // $ANTLR end "rule__Content__Alternatives_0"


    // $ANTLR start "rule__Content__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:443:1: rule__Content__Alternatives_1 : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( RULE_WS ) | ( '.' ) | ( ':' ) );
    public final void rule__Content__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:447:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( RULE_WS ) | ( '.' ) | ( ':' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt3=3;
                }
                break;
            case RULE_WS:
                {
                alt3=4;
                }
                break;
            case 9:
                {
                alt3=5;
                }
                break;
            case 10:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:448:1: ( RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:448:1: ( RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:449:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getIDTerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Content__Alternatives_1900); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getIDTerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:454:6: ( RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:454:6: ( RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:455:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Content__Alternatives_1917); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:460:6: ( RULE_ANY_OTHER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:460:6: ( RULE_ANY_OTHER )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:461:1: RULE_ANY_OTHER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getANY_OTHERTerminalRuleCall_1_2()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__Content__Alternatives_1934); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getANY_OTHERTerminalRuleCall_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:466:6: ( RULE_WS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:466:6: ( RULE_WS )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:467:1: RULE_WS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getWSTerminalRuleCall_1_3()); 
                    }
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Content__Alternatives_1951); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getWSTerminalRuleCall_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:472:6: ( '.' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:472:6: ( '.' )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:473:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getFullStopKeyword_1_4()); 
                    }
                    match(input,9,FOLLOW_9_in_rule__Content__Alternatives_1969); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getFullStopKeyword_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:480:6: ( ':' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:480:6: ( ':' )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:481:1: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getColonKeyword_1_5()); 
                    }
                    match(input,10,FOLLOW_10_in_rule__Content__Alternatives_1989); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getColonKeyword_1_5()); 
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
    // $ANTLR end "rule__Content__Alternatives_1"


    // $ANTLR start "rule__FXML__Group__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:495:1: rule__FXML__Group__0 : rule__FXML__Group__0__Impl rule__FXML__Group__1 ;
    public final void rule__FXML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:499:1: ( rule__FXML__Group__0__Impl rule__FXML__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:500:2: rule__FXML__Group__0__Impl rule__FXML__Group__1
            {
            pushFollow(FOLLOW_rule__FXML__Group__0__Impl_in_rule__FXML__Group__01021);
            rule__FXML__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FXML__Group__1_in_rule__FXML__Group__01024);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:507:1: rule__FXML__Group__0__Impl : ( ( rule__FXML__XmlDecAssignment_0 ) ) ;
    public final void rule__FXML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:511:1: ( ( ( rule__FXML__XmlDecAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:512:1: ( ( rule__FXML__XmlDecAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:512:1: ( ( rule__FXML__XmlDecAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:513:1: ( rule__FXML__XmlDecAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getXmlDecAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:514:1: ( rule__FXML__XmlDecAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:514:2: rule__FXML__XmlDecAssignment_0
            {
            pushFollow(FOLLOW_rule__FXML__XmlDecAssignment_0_in_rule__FXML__Group__0__Impl1051);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:524:1: rule__FXML__Group__1 : rule__FXML__Group__1__Impl rule__FXML__Group__2 ;
    public final void rule__FXML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:528:1: ( rule__FXML__Group__1__Impl rule__FXML__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:529:2: rule__FXML__Group__1__Impl rule__FXML__Group__2
            {
            pushFollow(FOLLOW_rule__FXML__Group__1__Impl_in_rule__FXML__Group__11081);
            rule__FXML__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FXML__Group__2_in_rule__FXML__Group__11084);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:536:1: rule__FXML__Group__1__Impl : ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* ) ;
    public final void rule__FXML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:540:1: ( ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:541:1: ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:541:1: ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:542:1: ( rule__FXML__ProcessingInstructionsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getProcessingInstructionsAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:543:1: ( rule__FXML__ProcessingInstructionsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:543:2: rule__FXML__ProcessingInstructionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__FXML__ProcessingInstructionsAssignment_1_in_rule__FXML__Group__1__Impl1111);
            	    rule__FXML__ProcessingInstructionsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:553:1: rule__FXML__Group__2 : rule__FXML__Group__2__Impl ;
    public final void rule__FXML__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:557:1: ( rule__FXML__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:558:2: rule__FXML__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FXML__Group__2__Impl_in_rule__FXML__Group__21142);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:564:1: rule__FXML__Group__2__Impl : ( ( rule__FXML__RootElementAssignment_2 ) ) ;
    public final void rule__FXML__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:568:1: ( ( ( rule__FXML__RootElementAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:569:1: ( ( rule__FXML__RootElementAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:569:1: ( ( rule__FXML__RootElementAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:570:1: ( rule__FXML__RootElementAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getRootElementAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:571:1: ( rule__FXML__RootElementAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:571:2: rule__FXML__RootElementAssignment_2
            {
            pushFollow(FOLLOW_rule__FXML__RootElementAssignment_2_in_rule__FXML__Group__2__Impl1169);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:587:1: rule__XMLDec__Group__0 : rule__XMLDec__Group__0__Impl rule__XMLDec__Group__1 ;
    public final void rule__XMLDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:591:1: ( rule__XMLDec__Group__0__Impl rule__XMLDec__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:592:2: rule__XMLDec__Group__0__Impl rule__XMLDec__Group__1
            {
            pushFollow(FOLLOW_rule__XMLDec__Group__0__Impl_in_rule__XMLDec__Group__01205);
            rule__XMLDec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XMLDec__Group__1_in_rule__XMLDec__Group__01208);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:599:1: rule__XMLDec__Group__0__Impl : ( '<?xml' ) ;
    public final void rule__XMLDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:603:1: ( ( '<?xml' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:604:1: ( '<?xml' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:604:1: ( '<?xml' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:605:1: '<?xml'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getXmlKeyword_0()); 
            }
            match(input,11,FOLLOW_11_in_rule__XMLDec__Group__0__Impl1236); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:618:1: rule__XMLDec__Group__1 : rule__XMLDec__Group__1__Impl rule__XMLDec__Group__2 ;
    public final void rule__XMLDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:622:1: ( rule__XMLDec__Group__1__Impl rule__XMLDec__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:623:2: rule__XMLDec__Group__1__Impl rule__XMLDec__Group__2
            {
            pushFollow(FOLLOW_rule__XMLDec__Group__1__Impl_in_rule__XMLDec__Group__11267);
            rule__XMLDec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XMLDec__Group__2_in_rule__XMLDec__Group__11270);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:630:1: rule__XMLDec__Group__1__Impl : ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) ) ;
    public final void rule__XMLDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:634:1: ( ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:635:1: ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:635:1: ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:636:1: ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:636:1: ( ( rule__XMLDec__PropsAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:637:1: ( rule__XMLDec__PropsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getPropsAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:638:1: ( rule__XMLDec__PropsAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:638:2: rule__XMLDec__PropsAssignment_1
            {
            pushFollow(FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1299);
            rule__XMLDec__PropsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMLDecAccess().getPropsAssignment_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:641:1: ( ( rule__XMLDec__PropsAssignment_1 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:642:1: ( rule__XMLDec__PropsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getPropsAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:643:1: ( rule__XMLDec__PropsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:643:2: rule__XMLDec__PropsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1311);
            	    rule__XMLDec__PropsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:654:1: rule__XMLDec__Group__2 : rule__XMLDec__Group__2__Impl ;
    public final void rule__XMLDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:658:1: ( rule__XMLDec__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:659:2: rule__XMLDec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__XMLDec__Group__2__Impl_in_rule__XMLDec__Group__21344);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:665:1: rule__XMLDec__Group__2__Impl : ( '?>' ) ;
    public final void rule__XMLDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:669:1: ( ( '?>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:670:1: ( '?>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:670:1: ( '?>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:671:1: '?>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getQuestionMarkGreaterThanSignKeyword_2()); 
            }
            match(input,12,FOLLOW_12_in_rule__XMLDec__Group__2__Impl1372); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:690:1: rule__ProcessingInstruction__Group__0 : rule__ProcessingInstruction__Group__0__Impl rule__ProcessingInstruction__Group__1 ;
    public final void rule__ProcessingInstruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:694:1: ( rule__ProcessingInstruction__Group__0__Impl rule__ProcessingInstruction__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:695:2: rule__ProcessingInstruction__Group__0__Impl rule__ProcessingInstruction__Group__1
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__0__Impl_in_rule__ProcessingInstruction__Group__01409);
            rule__ProcessingInstruction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__1_in_rule__ProcessingInstruction__Group__01412);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:702:1: rule__ProcessingInstruction__Group__0__Impl : ( '<?' ) ;
    public final void rule__ProcessingInstruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:706:1: ( ( '<?' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:707:1: ( '<?' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:707:1: ( '<?' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:708:1: '<?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getLessThanSignQuestionMarkKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__ProcessingInstruction__Group__0__Impl1440); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:721:1: rule__ProcessingInstruction__Group__1 : rule__ProcessingInstruction__Group__1__Impl rule__ProcessingInstruction__Group__2 ;
    public final void rule__ProcessingInstruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:725:1: ( rule__ProcessingInstruction__Group__1__Impl rule__ProcessingInstruction__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:726:2: rule__ProcessingInstruction__Group__1__Impl rule__ProcessingInstruction__Group__2
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__1__Impl_in_rule__ProcessingInstruction__Group__11471);
            rule__ProcessingInstruction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__2_in_rule__ProcessingInstruction__Group__11474);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:733:1: rule__ProcessingInstruction__Group__1__Impl : ( ( rule__ProcessingInstruction__TypeAssignment_1 ) ) ;
    public final void rule__ProcessingInstruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:737:1: ( ( ( rule__ProcessingInstruction__TypeAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:738:1: ( ( rule__ProcessingInstruction__TypeAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:738:1: ( ( rule__ProcessingInstruction__TypeAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:739:1: ( rule__ProcessingInstruction__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getTypeAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:740:1: ( rule__ProcessingInstruction__TypeAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:740:2: rule__ProcessingInstruction__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__TypeAssignment_1_in_rule__ProcessingInstruction__Group__1__Impl1501);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:750:1: rule__ProcessingInstruction__Group__2 : rule__ProcessingInstruction__Group__2__Impl rule__ProcessingInstruction__Group__3 ;
    public final void rule__ProcessingInstruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:754:1: ( rule__ProcessingInstruction__Group__2__Impl rule__ProcessingInstruction__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:755:2: rule__ProcessingInstruction__Group__2__Impl rule__ProcessingInstruction__Group__3
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__2__Impl_in_rule__ProcessingInstruction__Group__21531);
            rule__ProcessingInstruction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__3_in_rule__ProcessingInstruction__Group__21534);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:762:1: rule__ProcessingInstruction__Group__2__Impl : ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__ProcessingInstruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:766:1: ( ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:767:1: ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:767:1: ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:768:1: ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getImportedNamespaceAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:769:1: ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:769:2: rule__ProcessingInstruction__ImportedNamespaceAssignment_2
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__ImportedNamespaceAssignment_2_in_rule__ProcessingInstruction__Group__2__Impl1561);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:779:1: rule__ProcessingInstruction__Group__3 : rule__ProcessingInstruction__Group__3__Impl ;
    public final void rule__ProcessingInstruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:783:1: ( rule__ProcessingInstruction__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:784:2: rule__ProcessingInstruction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__3__Impl_in_rule__ProcessingInstruction__Group__31591);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:790:1: rule__ProcessingInstruction__Group__3__Impl : ( '?>' ) ;
    public final void rule__ProcessingInstruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:794:1: ( ( '?>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:795:1: ( '?>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:795:1: ( '?>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:796:1: '?>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getQuestionMarkGreaterThanSignKeyword_3()); 
            }
            match(input,12,FOLLOW_12_in_rule__ProcessingInstruction__Group__3__Impl1619); if (state.failed) return ;
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


    // $ANTLR start "rule__ContainerElementDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:817:1: rule__ContainerElementDefinition__Group__0 : rule__ContainerElementDefinition__Group__0__Impl rule__ContainerElementDefinition__Group__1 ;
    public final void rule__ContainerElementDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:821:1: ( rule__ContainerElementDefinition__Group__0__Impl rule__ContainerElementDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:822:2: rule__ContainerElementDefinition__Group__0__Impl rule__ContainerElementDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__0__Impl_in_rule__ContainerElementDefinition__Group__01658);
            rule__ContainerElementDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__1_in_rule__ContainerElementDefinition__Group__01661);
            rule__ContainerElementDefinition__Group__1();

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
    // $ANTLR end "rule__ContainerElementDefinition__Group__0"


    // $ANTLR start "rule__ContainerElementDefinition__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:829:1: rule__ContainerElementDefinition__Group__0__Impl : ( '<' ) ;
    public final void rule__ContainerElementDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:833:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:834:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:834:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:835:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__ContainerElementDefinition__Group__0__Impl1689); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignKeyword_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group__0__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:848:1: rule__ContainerElementDefinition__Group__1 : rule__ContainerElementDefinition__Group__1__Impl rule__ContainerElementDefinition__Group__2 ;
    public final void rule__ContainerElementDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:852:1: ( rule__ContainerElementDefinition__Group__1__Impl rule__ContainerElementDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:853:2: rule__ContainerElementDefinition__Group__1__Impl rule__ContainerElementDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__1__Impl_in_rule__ContainerElementDefinition__Group__11720);
            rule__ContainerElementDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__2_in_rule__ContainerElementDefinition__Group__11723);
            rule__ContainerElementDefinition__Group__2();

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
    // $ANTLR end "rule__ContainerElementDefinition__Group__1"


    // $ANTLR start "rule__ContainerElementDefinition__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:860:1: rule__ContainerElementDefinition__Group__1__Impl : ( ( rule__ContainerElementDefinition__Group_1__0 )? ) ;
    public final void rule__ContainerElementDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:864:1: ( ( ( rule__ContainerElementDefinition__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:865:1: ( ( rule__ContainerElementDefinition__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:865:1: ( ( rule__ContainerElementDefinition__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:866:1: ( rule__ContainerElementDefinition__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:867:1: ( rule__ContainerElementDefinition__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==10) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:867:2: rule__ContainerElementDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__0_in_rule__ContainerElementDefinition__Group__1__Impl1750);
                    rule__ContainerElementDefinition__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group__1__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group__2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:877:1: rule__ContainerElementDefinition__Group__2 : rule__ContainerElementDefinition__Group__2__Impl rule__ContainerElementDefinition__Group__3 ;
    public final void rule__ContainerElementDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:881:1: ( rule__ContainerElementDefinition__Group__2__Impl rule__ContainerElementDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:882:2: rule__ContainerElementDefinition__Group__2__Impl rule__ContainerElementDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__2__Impl_in_rule__ContainerElementDefinition__Group__21781);
            rule__ContainerElementDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__3_in_rule__ContainerElementDefinition__Group__21784);
            rule__ContainerElementDefinition__Group__3();

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
    // $ANTLR end "rule__ContainerElementDefinition__Group__2"


    // $ANTLR start "rule__ContainerElementDefinition__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:889:1: rule__ContainerElementDefinition__Group__2__Impl : ( ( rule__ContainerElementDefinition__NameAssignment_2 ) ) ;
    public final void rule__ContainerElementDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:893:1: ( ( ( rule__ContainerElementDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:894:1: ( ( rule__ContainerElementDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:894:1: ( ( rule__ContainerElementDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:895:1: ( rule__ContainerElementDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:896:1: ( rule__ContainerElementDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:896:2: rule__ContainerElementDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__NameAssignment_2_in_rule__ContainerElementDefinition__Group__2__Impl1811);
            rule__ContainerElementDefinition__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group__2__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group__3"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:906:1: rule__ContainerElementDefinition__Group__3 : rule__ContainerElementDefinition__Group__3__Impl rule__ContainerElementDefinition__Group__4 ;
    public final void rule__ContainerElementDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:910:1: ( rule__ContainerElementDefinition__Group__3__Impl rule__ContainerElementDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:911:2: rule__ContainerElementDefinition__Group__3__Impl rule__ContainerElementDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__3__Impl_in_rule__ContainerElementDefinition__Group__31841);
            rule__ContainerElementDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__4_in_rule__ContainerElementDefinition__Group__31844);
            rule__ContainerElementDefinition__Group__4();

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
    // $ANTLR end "rule__ContainerElementDefinition__Group__3"


    // $ANTLR start "rule__ContainerElementDefinition__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:918:1: rule__ContainerElementDefinition__Group__3__Impl : ( ( rule__ContainerElementDefinition__PropertiesAssignment_3 )* ) ;
    public final void rule__ContainerElementDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:922:1: ( ( ( rule__ContainerElementDefinition__PropertiesAssignment_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:923:1: ( ( rule__ContainerElementDefinition__PropertiesAssignment_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:923:1: ( ( rule__ContainerElementDefinition__PropertiesAssignment_3 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:924:1: ( rule__ContainerElementDefinition__PropertiesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:925:1: ( rule__ContainerElementDefinition__PropertiesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:925:2: rule__ContainerElementDefinition__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ContainerElementDefinition__PropertiesAssignment_3_in_rule__ContainerElementDefinition__Group__3__Impl1871);
            	    rule__ContainerElementDefinition__PropertiesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAssignment_3()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group__3__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group__4"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:935:1: rule__ContainerElementDefinition__Group__4 : rule__ContainerElementDefinition__Group__4__Impl rule__ContainerElementDefinition__Group__5 ;
    public final void rule__ContainerElementDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:939:1: ( rule__ContainerElementDefinition__Group__4__Impl rule__ContainerElementDefinition__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:940:2: rule__ContainerElementDefinition__Group__4__Impl rule__ContainerElementDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__4__Impl_in_rule__ContainerElementDefinition__Group__41902);
            rule__ContainerElementDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__5_in_rule__ContainerElementDefinition__Group__41905);
            rule__ContainerElementDefinition__Group__5();

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
    // $ANTLR end "rule__ContainerElementDefinition__Group__4"


    // $ANTLR start "rule__ContainerElementDefinition__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:947:1: rule__ContainerElementDefinition__Group__4__Impl : ( '>' ) ;
    public final void rule__ContainerElementDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:951:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:952:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:952:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:953:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_4()); 
            }
            match(input,15,FOLLOW_15_in_rule__ContainerElementDefinition__Group__4__Impl1933); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_4()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group__4__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group__5"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:966:1: rule__ContainerElementDefinition__Group__5 : rule__ContainerElementDefinition__Group__5__Impl rule__ContainerElementDefinition__Group__6 ;
    public final void rule__ContainerElementDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:970:1: ( rule__ContainerElementDefinition__Group__5__Impl rule__ContainerElementDefinition__Group__6 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:971:2: rule__ContainerElementDefinition__Group__5__Impl rule__ContainerElementDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__5__Impl_in_rule__ContainerElementDefinition__Group__51964);
            rule__ContainerElementDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__6_in_rule__ContainerElementDefinition__Group__51967);
            rule__ContainerElementDefinition__Group__6();

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
    // $ANTLR end "rule__ContainerElementDefinition__Group__5"


    // $ANTLR start "rule__ContainerElementDefinition__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:978:1: rule__ContainerElementDefinition__Group__5__Impl : ( ( rule__ContainerElementDefinition__ContentAssignment_5 )? ) ;
    public final void rule__ContainerElementDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:982:1: ( ( ( rule__ContainerElementDefinition__ContentAssignment_5 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:983:1: ( ( rule__ContainerElementDefinition__ContentAssignment_5 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:983:1: ( ( rule__ContainerElementDefinition__ContentAssignment_5 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:984:1: ( rule__ContainerElementDefinition__ContentAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getContentAssignment_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:985:1: ( rule__ContainerElementDefinition__ContentAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_ANY_OTHER)||(LA8_0>=9 && LA8_0<=10)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:985:2: rule__ContainerElementDefinition__ContentAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__ContentAssignment_5_in_rule__ContainerElementDefinition__Group__5__Impl1994);
                    rule__ContainerElementDefinition__ContentAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getContentAssignment_5()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group__5__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group__6"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:995:1: rule__ContainerElementDefinition__Group__6 : rule__ContainerElementDefinition__Group__6__Impl rule__ContainerElementDefinition__Group__7 ;
    public final void rule__ContainerElementDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:999:1: ( rule__ContainerElementDefinition__Group__6__Impl rule__ContainerElementDefinition__Group__7 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1000:2: rule__ContainerElementDefinition__Group__6__Impl rule__ContainerElementDefinition__Group__7
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__6__Impl_in_rule__ContainerElementDefinition__Group__62025);
            rule__ContainerElementDefinition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__7_in_rule__ContainerElementDefinition__Group__62028);
            rule__ContainerElementDefinition__Group__7();

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
    // $ANTLR end "rule__ContainerElementDefinition__Group__6"


    // $ANTLR start "rule__ContainerElementDefinition__Group__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1007:1: rule__ContainerElementDefinition__Group__6__Impl : ( ( rule__ContainerElementDefinition__ChildrenAssignment_6 )* ) ;
    public final void rule__ContainerElementDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1011:1: ( ( ( rule__ContainerElementDefinition__ChildrenAssignment_6 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1012:1: ( ( rule__ContainerElementDefinition__ChildrenAssignment_6 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1012:1: ( ( rule__ContainerElementDefinition__ChildrenAssignment_6 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1013:1: ( rule__ContainerElementDefinition__ChildrenAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getChildrenAssignment_6()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1014:1: ( rule__ContainerElementDefinition__ChildrenAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1014:2: rule__ContainerElementDefinition__ChildrenAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ContainerElementDefinition__ChildrenAssignment_6_in_rule__ContainerElementDefinition__Group__6__Impl2055);
            	    rule__ContainerElementDefinition__ChildrenAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getChildrenAssignment_6()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group__6__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group__7"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1024:1: rule__ContainerElementDefinition__Group__7 : rule__ContainerElementDefinition__Group__7__Impl rule__ContainerElementDefinition__Group__8 ;
    public final void rule__ContainerElementDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1028:1: ( rule__ContainerElementDefinition__Group__7__Impl rule__ContainerElementDefinition__Group__8 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1029:2: rule__ContainerElementDefinition__Group__7__Impl rule__ContainerElementDefinition__Group__8
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__7__Impl_in_rule__ContainerElementDefinition__Group__72086);
            rule__ContainerElementDefinition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__8_in_rule__ContainerElementDefinition__Group__72089);
            rule__ContainerElementDefinition__Group__8();

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
    // $ANTLR end "rule__ContainerElementDefinition__Group__7"


    // $ANTLR start "rule__ContainerElementDefinition__Group__7__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1036:1: rule__ContainerElementDefinition__Group__7__Impl : ( '</' ) ;
    public final void rule__ContainerElementDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1040:1: ( ( '</' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1041:1: ( '</' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1041:1: ( '</' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1042:1: '</'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignSolidusKeyword_7()); 
            }
            match(input,16,FOLLOW_16_in_rule__ContainerElementDefinition__Group__7__Impl2117); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignSolidusKeyword_7()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group__7__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group__8"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1055:1: rule__ContainerElementDefinition__Group__8 : rule__ContainerElementDefinition__Group__8__Impl rule__ContainerElementDefinition__Group__9 ;
    public final void rule__ContainerElementDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1059:1: ( rule__ContainerElementDefinition__Group__8__Impl rule__ContainerElementDefinition__Group__9 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1060:2: rule__ContainerElementDefinition__Group__8__Impl rule__ContainerElementDefinition__Group__9
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__8__Impl_in_rule__ContainerElementDefinition__Group__82148);
            rule__ContainerElementDefinition__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__9_in_rule__ContainerElementDefinition__Group__82151);
            rule__ContainerElementDefinition__Group__9();

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
    // $ANTLR end "rule__ContainerElementDefinition__Group__8"


    // $ANTLR start "rule__ContainerElementDefinition__Group__8__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1067:1: rule__ContainerElementDefinition__Group__8__Impl : ( ( rule__ContainerElementDefinition__Group_8__0 )? ) ;
    public final void rule__ContainerElementDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1071:1: ( ( ( rule__ContainerElementDefinition__Group_8__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1072:1: ( ( rule__ContainerElementDefinition__Group_8__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1072:1: ( ( rule__ContainerElementDefinition__Group_8__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1073:1: ( rule__ContainerElementDefinition__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGroup_8()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1074:1: ( rule__ContainerElementDefinition__Group_8__0 )?
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
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1074:2: rule__ContainerElementDefinition__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_8__0_in_rule__ContainerElementDefinition__Group__8__Impl2178);
                    rule__ContainerElementDefinition__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getGroup_8()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group__8__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group__9"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1084:1: rule__ContainerElementDefinition__Group__9 : rule__ContainerElementDefinition__Group__9__Impl rule__ContainerElementDefinition__Group__10 ;
    public final void rule__ContainerElementDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1088:1: ( rule__ContainerElementDefinition__Group__9__Impl rule__ContainerElementDefinition__Group__10 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1089:2: rule__ContainerElementDefinition__Group__9__Impl rule__ContainerElementDefinition__Group__10
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__9__Impl_in_rule__ContainerElementDefinition__Group__92209);
            rule__ContainerElementDefinition__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__10_in_rule__ContainerElementDefinition__Group__92212);
            rule__ContainerElementDefinition__Group__10();

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
    // $ANTLR end "rule__ContainerElementDefinition__Group__9"


    // $ANTLR start "rule__ContainerElementDefinition__Group__9__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1096:1: rule__ContainerElementDefinition__Group__9__Impl : ( ( rule__ContainerElementDefinition__EndnameAssignment_9 ) ) ;
    public final void rule__ContainerElementDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1100:1: ( ( ( rule__ContainerElementDefinition__EndnameAssignment_9 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1101:1: ( ( rule__ContainerElementDefinition__EndnameAssignment_9 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1101:1: ( ( rule__ContainerElementDefinition__EndnameAssignment_9 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1102:1: ( rule__ContainerElementDefinition__EndnameAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnameAssignment_9()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1103:1: ( rule__ContainerElementDefinition__EndnameAssignment_9 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1103:2: rule__ContainerElementDefinition__EndnameAssignment_9
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__EndnameAssignment_9_in_rule__ContainerElementDefinition__Group__9__Impl2239);
            rule__ContainerElementDefinition__EndnameAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getEndnameAssignment_9()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group__9__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group__10"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1113:1: rule__ContainerElementDefinition__Group__10 : rule__ContainerElementDefinition__Group__10__Impl ;
    public final void rule__ContainerElementDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1117:1: ( rule__ContainerElementDefinition__Group__10__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1118:2: rule__ContainerElementDefinition__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__10__Impl_in_rule__ContainerElementDefinition__Group__102269);
            rule__ContainerElementDefinition__Group__10__Impl();

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
    // $ANTLR end "rule__ContainerElementDefinition__Group__10"


    // $ANTLR start "rule__ContainerElementDefinition__Group__10__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1124:1: rule__ContainerElementDefinition__Group__10__Impl : ( '>' ) ;
    public final void rule__ContainerElementDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1128:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1129:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1129:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1130:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_10()); 
            }
            match(input,15,FOLLOW_15_in_rule__ContainerElementDefinition__Group__10__Impl2297); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_10()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group__10__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1165:1: rule__ContainerElementDefinition__Group_1__0 : rule__ContainerElementDefinition__Group_1__0__Impl rule__ContainerElementDefinition__Group_1__1 ;
    public final void rule__ContainerElementDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1169:1: ( rule__ContainerElementDefinition__Group_1__0__Impl rule__ContainerElementDefinition__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1170:2: rule__ContainerElementDefinition__Group_1__0__Impl rule__ContainerElementDefinition__Group_1__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__0__Impl_in_rule__ContainerElementDefinition__Group_1__02350);
            rule__ContainerElementDefinition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__1_in_rule__ContainerElementDefinition__Group_1__02353);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1177:1: rule__ContainerElementDefinition__Group_1__0__Impl : ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_0 ) ) ;
    public final void rule__ContainerElementDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1181:1: ( ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1182:1: ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1182:1: ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1183:1: ( rule__ContainerElementDefinition__NamespaceAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNamespaceAssignment_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1184:1: ( rule__ContainerElementDefinition__NamespaceAssignment_1_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1184:2: rule__ContainerElementDefinition__NamespaceAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__NamespaceAssignment_1_0_in_rule__ContainerElementDefinition__Group_1__0__Impl2380);
            rule__ContainerElementDefinition__NamespaceAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getNamespaceAssignment_1_0()); 
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1194:1: rule__ContainerElementDefinition__Group_1__1 : rule__ContainerElementDefinition__Group_1__1__Impl ;
    public final void rule__ContainerElementDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1198:1: ( rule__ContainerElementDefinition__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1199:2: rule__ContainerElementDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__1__Impl_in_rule__ContainerElementDefinition__Group_1__12410);
            rule__ContainerElementDefinition__Group_1__1__Impl();

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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1205:1: rule__ContainerElementDefinition__Group_1__1__Impl : ( ':' ) ;
    public final void rule__ContainerElementDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1209:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1210:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1210:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1211:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_1_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__ContainerElementDefinition__Group_1__1__Impl2438); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_1_1()); 
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


    // $ANTLR start "rule__ContainerElementDefinition__Group_8__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1228:1: rule__ContainerElementDefinition__Group_8__0 : rule__ContainerElementDefinition__Group_8__0__Impl rule__ContainerElementDefinition__Group_8__1 ;
    public final void rule__ContainerElementDefinition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1232:1: ( rule__ContainerElementDefinition__Group_8__0__Impl rule__ContainerElementDefinition__Group_8__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1233:2: rule__ContainerElementDefinition__Group_8__0__Impl rule__ContainerElementDefinition__Group_8__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_8__0__Impl_in_rule__ContainerElementDefinition__Group_8__02473);
            rule__ContainerElementDefinition__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_8__1_in_rule__ContainerElementDefinition__Group_8__02476);
            rule__ContainerElementDefinition__Group_8__1();

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
    // $ANTLR end "rule__ContainerElementDefinition__Group_8__0"


    // $ANTLR start "rule__ContainerElementDefinition__Group_8__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1240:1: rule__ContainerElementDefinition__Group_8__0__Impl : ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 ) ) ;
    public final void rule__ContainerElementDefinition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1244:1: ( ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1245:1: ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1245:1: ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1246:1: ( rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceAssignment_8_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1247:1: ( rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1247:2: rule__ContainerElementDefinition__EndnamespaceAssignment_8_0
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__EndnamespaceAssignment_8_0_in_rule__ContainerElementDefinition__Group_8__0__Impl2503);
            rule__ContainerElementDefinition__EndnamespaceAssignment_8_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceAssignment_8_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_8__0__Impl"


    // $ANTLR start "rule__ContainerElementDefinition__Group_8__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1257:1: rule__ContainerElementDefinition__Group_8__1 : rule__ContainerElementDefinition__Group_8__1__Impl ;
    public final void rule__ContainerElementDefinition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1261:1: ( rule__ContainerElementDefinition__Group_8__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1262:2: rule__ContainerElementDefinition__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_8__1__Impl_in_rule__ContainerElementDefinition__Group_8__12533);
            rule__ContainerElementDefinition__Group_8__1__Impl();

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
    // $ANTLR end "rule__ContainerElementDefinition__Group_8__1"


    // $ANTLR start "rule__ContainerElementDefinition__Group_8__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1268:1: rule__ContainerElementDefinition__Group_8__1__Impl : ( ':' ) ;
    public final void rule__ContainerElementDefinition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1272:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1273:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1273:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1274:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_8_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__ContainerElementDefinition__Group_8__1__Impl2561); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_8_1()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__Group_8__1__Impl"


    // $ANTLR start "rule__EmptyElementDefinition__Group__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1291:1: rule__EmptyElementDefinition__Group__0 : rule__EmptyElementDefinition__Group__0__Impl rule__EmptyElementDefinition__Group__1 ;
    public final void rule__EmptyElementDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1295:1: ( rule__EmptyElementDefinition__Group__0__Impl rule__EmptyElementDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1296:2: rule__EmptyElementDefinition__Group__0__Impl rule__EmptyElementDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__0__Impl_in_rule__EmptyElementDefinition__Group__02596);
            rule__EmptyElementDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__1_in_rule__EmptyElementDefinition__Group__02599);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1303:1: rule__EmptyElementDefinition__Group__0__Impl : ( '<' ) ;
    public final void rule__EmptyElementDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1307:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1308:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1308:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1309:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getLessThanSignKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__EmptyElementDefinition__Group__0__Impl2627); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1322:1: rule__EmptyElementDefinition__Group__1 : rule__EmptyElementDefinition__Group__1__Impl rule__EmptyElementDefinition__Group__2 ;
    public final void rule__EmptyElementDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1326:1: ( rule__EmptyElementDefinition__Group__1__Impl rule__EmptyElementDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1327:2: rule__EmptyElementDefinition__Group__1__Impl rule__EmptyElementDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__1__Impl_in_rule__EmptyElementDefinition__Group__12658);
            rule__EmptyElementDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__2_in_rule__EmptyElementDefinition__Group__12661);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1334:1: rule__EmptyElementDefinition__Group__1__Impl : ( ( rule__EmptyElementDefinition__Group_1__0 )? ) ;
    public final void rule__EmptyElementDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1338:1: ( ( ( rule__EmptyElementDefinition__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1339:1: ( ( rule__EmptyElementDefinition__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1339:1: ( ( rule__EmptyElementDefinition__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1340:1: ( rule__EmptyElementDefinition__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1341:1: ( rule__EmptyElementDefinition__Group_1__0 )?
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
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1341:2: rule__EmptyElementDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__0_in_rule__EmptyElementDefinition__Group__1__Impl2688);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1351:1: rule__EmptyElementDefinition__Group__2 : rule__EmptyElementDefinition__Group__2__Impl rule__EmptyElementDefinition__Group__3 ;
    public final void rule__EmptyElementDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1355:1: ( rule__EmptyElementDefinition__Group__2__Impl rule__EmptyElementDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1356:2: rule__EmptyElementDefinition__Group__2__Impl rule__EmptyElementDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__2__Impl_in_rule__EmptyElementDefinition__Group__22719);
            rule__EmptyElementDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__3_in_rule__EmptyElementDefinition__Group__22722);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1363:1: rule__EmptyElementDefinition__Group__2__Impl : ( ( rule__EmptyElementDefinition__NameAssignment_2 ) ) ;
    public final void rule__EmptyElementDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1367:1: ( ( ( rule__EmptyElementDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1368:1: ( ( rule__EmptyElementDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1368:1: ( ( rule__EmptyElementDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1369:1: ( rule__EmptyElementDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1370:1: ( rule__EmptyElementDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1370:2: rule__EmptyElementDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__NameAssignment_2_in_rule__EmptyElementDefinition__Group__2__Impl2749);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1380:1: rule__EmptyElementDefinition__Group__3 : rule__EmptyElementDefinition__Group__3__Impl rule__EmptyElementDefinition__Group__4 ;
    public final void rule__EmptyElementDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1384:1: ( rule__EmptyElementDefinition__Group__3__Impl rule__EmptyElementDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1385:2: rule__EmptyElementDefinition__Group__3__Impl rule__EmptyElementDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__3__Impl_in_rule__EmptyElementDefinition__Group__32779);
            rule__EmptyElementDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__4_in_rule__EmptyElementDefinition__Group__32782);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1392:1: rule__EmptyElementDefinition__Group__3__Impl : ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* ) ;
    public final void rule__EmptyElementDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1396:1: ( ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1397:1: ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1397:1: ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1398:1: ( rule__EmptyElementDefinition__PropsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getPropsAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1399:1: ( rule__EmptyElementDefinition__PropsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1399:2: rule__EmptyElementDefinition__PropsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__EmptyElementDefinition__PropsAssignment_3_in_rule__EmptyElementDefinition__Group__3__Impl2809);
            	    rule__EmptyElementDefinition__PropsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1409:1: rule__EmptyElementDefinition__Group__4 : rule__EmptyElementDefinition__Group__4__Impl ;
    public final void rule__EmptyElementDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1413:1: ( rule__EmptyElementDefinition__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1414:2: rule__EmptyElementDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__4__Impl_in_rule__EmptyElementDefinition__Group__42840);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1420:1: rule__EmptyElementDefinition__Group__4__Impl : ( '/>' ) ;
    public final void rule__EmptyElementDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1424:1: ( ( '/>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1425:1: ( '/>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1425:1: ( '/>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1426:1: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getSolidusGreaterThanSignKeyword_4()); 
            }
            match(input,17,FOLLOW_17_in_rule__EmptyElementDefinition__Group__4__Impl2868); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1449:1: rule__EmptyElementDefinition__Group_1__0 : rule__EmptyElementDefinition__Group_1__0__Impl rule__EmptyElementDefinition__Group_1__1 ;
    public final void rule__EmptyElementDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1453:1: ( rule__EmptyElementDefinition__Group_1__0__Impl rule__EmptyElementDefinition__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1454:2: rule__EmptyElementDefinition__Group_1__0__Impl rule__EmptyElementDefinition__Group_1__1
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__0__Impl_in_rule__EmptyElementDefinition__Group_1__02909);
            rule__EmptyElementDefinition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__1_in_rule__EmptyElementDefinition__Group_1__02912);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1461:1: rule__EmptyElementDefinition__Group_1__0__Impl : ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) ) ;
    public final void rule__EmptyElementDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1465:1: ( ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1466:1: ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1466:1: ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1467:1: ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNamespaceAssignment_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1468:1: ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1468:2: rule__EmptyElementDefinition__NamespaceAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__NamespaceAssignment_1_0_in_rule__EmptyElementDefinition__Group_1__0__Impl2939);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1478:1: rule__EmptyElementDefinition__Group_1__1 : rule__EmptyElementDefinition__Group_1__1__Impl ;
    public final void rule__EmptyElementDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1482:1: ( rule__EmptyElementDefinition__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1483:2: rule__EmptyElementDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__1__Impl_in_rule__EmptyElementDefinition__Group_1__12969);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1489:1: rule__EmptyElementDefinition__Group_1__1__Impl : ( ':' ) ;
    public final void rule__EmptyElementDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1493:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1494:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1494:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1495:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getColonKeyword_1_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__EmptyElementDefinition__Group_1__1__Impl2997); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1512:1: rule__AttributePropertyDefinition__Group__0 : rule__AttributePropertyDefinition__Group__0__Impl rule__AttributePropertyDefinition__Group__1 ;
    public final void rule__AttributePropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1516:1: ( rule__AttributePropertyDefinition__Group__0__Impl rule__AttributePropertyDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1517:2: rule__AttributePropertyDefinition__Group__0__Impl rule__AttributePropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__0__Impl_in_rule__AttributePropertyDefinition__Group__03032);
            rule__AttributePropertyDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__1_in_rule__AttributePropertyDefinition__Group__03035);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1524:1: rule__AttributePropertyDefinition__Group__0__Impl : ( ( rule__AttributePropertyDefinition__Group_0__0 )? ) ;
    public final void rule__AttributePropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1528:1: ( ( ( rule__AttributePropertyDefinition__Group_0__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1529:1: ( ( rule__AttributePropertyDefinition__Group_0__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1529:1: ( ( rule__AttributePropertyDefinition__Group_0__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1530:1: ( rule__AttributePropertyDefinition__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getGroup_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1531:1: ( rule__AttributePropertyDefinition__Group_0__0 )?
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
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1531:2: rule__AttributePropertyDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__0_in_rule__AttributePropertyDefinition__Group__0__Impl3062);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1541:1: rule__AttributePropertyDefinition__Group__1 : rule__AttributePropertyDefinition__Group__1__Impl rule__AttributePropertyDefinition__Group__2 ;
    public final void rule__AttributePropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1545:1: ( rule__AttributePropertyDefinition__Group__1__Impl rule__AttributePropertyDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1546:2: rule__AttributePropertyDefinition__Group__1__Impl rule__AttributePropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__1__Impl_in_rule__AttributePropertyDefinition__Group__13093);
            rule__AttributePropertyDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__2_in_rule__AttributePropertyDefinition__Group__13096);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1553:1: rule__AttributePropertyDefinition__Group__1__Impl : ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) ) ;
    public final void rule__AttributePropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1557:1: ( ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1558:1: ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1558:1: ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1559:1: ( rule__AttributePropertyDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1560:1: ( rule__AttributePropertyDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1560:2: rule__AttributePropertyDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__NameAssignment_1_in_rule__AttributePropertyDefinition__Group__1__Impl3123);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1570:1: rule__AttributePropertyDefinition__Group__2 : rule__AttributePropertyDefinition__Group__2__Impl rule__AttributePropertyDefinition__Group__3 ;
    public final void rule__AttributePropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1574:1: ( rule__AttributePropertyDefinition__Group__2__Impl rule__AttributePropertyDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1575:2: rule__AttributePropertyDefinition__Group__2__Impl rule__AttributePropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__2__Impl_in_rule__AttributePropertyDefinition__Group__23153);
            rule__AttributePropertyDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__3_in_rule__AttributePropertyDefinition__Group__23156);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1582:1: rule__AttributePropertyDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__AttributePropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1586:1: ( ( '=' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1587:1: ( '=' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1587:1: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1588:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__AttributePropertyDefinition__Group__2__Impl3184); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1601:1: rule__AttributePropertyDefinition__Group__3 : rule__AttributePropertyDefinition__Group__3__Impl ;
    public final void rule__AttributePropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1605:1: ( rule__AttributePropertyDefinition__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1606:2: rule__AttributePropertyDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__3__Impl_in_rule__AttributePropertyDefinition__Group__33215);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1612:1: rule__AttributePropertyDefinition__Group__3__Impl : ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) ) ;
    public final void rule__AttributePropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1616:1: ( ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1617:1: ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1617:1: ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1618:1: ( rule__AttributePropertyDefinition__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getValueAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1619:1: ( rule__AttributePropertyDefinition__ValueAssignment_3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1619:2: rule__AttributePropertyDefinition__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__ValueAssignment_3_in_rule__AttributePropertyDefinition__Group__3__Impl3242);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1637:1: rule__AttributePropertyDefinition__Group_0__0 : rule__AttributePropertyDefinition__Group_0__0__Impl rule__AttributePropertyDefinition__Group_0__1 ;
    public final void rule__AttributePropertyDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1641:1: ( rule__AttributePropertyDefinition__Group_0__0__Impl rule__AttributePropertyDefinition__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1642:2: rule__AttributePropertyDefinition__Group_0__0__Impl rule__AttributePropertyDefinition__Group_0__1
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__0__Impl_in_rule__AttributePropertyDefinition__Group_0__03280);
            rule__AttributePropertyDefinition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__1_in_rule__AttributePropertyDefinition__Group_0__03283);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1649:1: rule__AttributePropertyDefinition__Group_0__0__Impl : ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) ) ;
    public final void rule__AttributePropertyDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1653:1: ( ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1654:1: ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1654:1: ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1655:1: ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNamespaceAssignment_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1656:1: ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1656:2: rule__AttributePropertyDefinition__NamespaceAssignment_0_0
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__NamespaceAssignment_0_0_in_rule__AttributePropertyDefinition__Group_0__0__Impl3310);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1666:1: rule__AttributePropertyDefinition__Group_0__1 : rule__AttributePropertyDefinition__Group_0__1__Impl ;
    public final void rule__AttributePropertyDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1670:1: ( rule__AttributePropertyDefinition__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1671:2: rule__AttributePropertyDefinition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__1__Impl_in_rule__AttributePropertyDefinition__Group_0__13340);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1677:1: rule__AttributePropertyDefinition__Group_0__1__Impl : ( ':' ) ;
    public final void rule__AttributePropertyDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1681:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1682:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1682:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1683:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getColonKeyword_0_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__AttributePropertyDefinition__Group_0__1__Impl3368); if (state.failed) return ;
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


    // $ANTLR start "rule__Content__Group__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1700:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1704:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1705:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__03403);
            rule__Content__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Content__Group__1_in_rule__Content__Group__03406);
            rule__Content__Group__1();

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
    // $ANTLR end "rule__Content__Group__0"


    // $ANTLR start "rule__Content__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1712:1: rule__Content__Group__0__Impl : ( ( rule__Content__Alternatives_0 ) ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1716:1: ( ( ( rule__Content__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1717:1: ( ( rule__Content__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1717:1: ( ( rule__Content__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1718:1: ( rule__Content__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getAlternatives_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1719:1: ( rule__Content__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1719:2: rule__Content__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Content__Alternatives_0_in_rule__Content__Group__0__Impl3433);
            rule__Content__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContentAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Content__Group__0__Impl"


    // $ANTLR start "rule__Content__Group__1"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1729:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1733:1: ( rule__Content__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1734:2: rule__Content__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__13463);
            rule__Content__Group__1__Impl();

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
    // $ANTLR end "rule__Content__Group__1"


    // $ANTLR start "rule__Content__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1740:1: rule__Content__Group__1__Impl : ( ( rule__Content__Alternatives_1 )* ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1744:1: ( ( ( rule__Content__Alternatives_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1745:1: ( ( rule__Content__Alternatives_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1745:1: ( ( rule__Content__Alternatives_1 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1746:1: ( rule__Content__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getAlternatives_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1747:1: ( rule__Content__Alternatives_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_WS)||(LA14_0>=9 && LA14_0<=10)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1747:2: rule__Content__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Content__Alternatives_1_in_rule__Content__Group__1__Impl3490);
            	    rule__Content__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContentAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Content__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1761:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1765:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1766:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03525);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03528);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1773:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1777:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1778:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1778:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1779:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3555); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1790:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1794:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1795:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13584);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1801:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1805:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1806:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1806:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1807:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1808:1: ( rule__QualifiedName__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==9) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_ID) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1808:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3611);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1822:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1826:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1827:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03646);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03649);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1834:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1838:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1839:1: ( ( '.' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1839:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1840:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1841:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1842:2: '.'
            {
            match(input,9,FOLLOW_9_in_rule__QualifiedName__Group_1__0__Impl3678); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1853:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1857:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1858:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13710);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1864:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1868:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1869:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1869:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1870:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3737); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1885:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1889:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1890:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__03770);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__03773);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1897:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ( rule__QualifiedNameWithWildCard__ValueAssignment_0 ) ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1901:1: ( ( ( rule__QualifiedNameWithWildCard__ValueAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1902:1: ( ( rule__QualifiedNameWithWildCard__ValueAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1902:1: ( ( rule__QualifiedNameWithWildCard__ValueAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1903:1: ( rule__QualifiedNameWithWildCard__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getValueAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1904:1: ( rule__QualifiedNameWithWildCard__ValueAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1904:2: rule__QualifiedNameWithWildCard__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__ValueAssignment_0_in_rule__QualifiedNameWithWildCard__Group__0__Impl3800);
            rule__QualifiedNameWithWildCard__ValueAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getValueAssignment_0()); 
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1914:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1918:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1919:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__13830);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1925:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1929:1: ( ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1930:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1930:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1931:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1932:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==9) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1932:2: rule__QualifiedNameWithWildCard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl3857);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1946:1: rule__QualifiedNameWithWildCard__Group_1__0 : rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1950:1: ( rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1951:2: rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__03892);
            rule__QualifiedNameWithWildCard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__03895);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1958:1: rule__QualifiedNameWithWildCard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1962:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1963:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1963:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1964:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,9,FOLLOW_9_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl3923); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1977:1: rule__QualifiedNameWithWildCard__Group_1__1 : rule__QualifiedNameWithWildCard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1981:1: ( rule__QualifiedNameWithWildCard__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1982:2: rule__QualifiedNameWithWildCard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__13954);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1988:1: rule__QualifiedNameWithWildCard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1992:1: ( ( '*' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1993:1: ( '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1993:1: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1994:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl3982); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2012:1: rule__FXML__XmlDecAssignment_0 : ( ruleXMLDec ) ;
    public final void rule__FXML__XmlDecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2016:1: ( ( ruleXMLDec ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2017:1: ( ruleXMLDec )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2017:1: ( ruleXMLDec )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2018:1: ruleXMLDec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getXmlDecXMLDecParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleXMLDec_in_rule__FXML__XmlDecAssignment_04022);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2027:1: rule__FXML__ProcessingInstructionsAssignment_1 : ( ruleProcessingInstruction ) ;
    public final void rule__FXML__ProcessingInstructionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2031:1: ( ( ruleProcessingInstruction ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2032:1: ( ruleProcessingInstruction )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2032:1: ( ruleProcessingInstruction )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2033:1: ruleProcessingInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getProcessingInstructionsProcessingInstructionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleProcessingInstruction_in_rule__FXML__ProcessingInstructionsAssignment_14053);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2042:1: rule__FXML__RootElementAssignment_2 : ( ruleElementDefinition ) ;
    public final void rule__FXML__RootElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2046:1: ( ( ruleElementDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2047:1: ( ruleElementDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2047:1: ( ruleElementDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2048:1: ruleElementDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getRootElementElementDefinitionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_rule__FXML__RootElementAssignment_24084);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2057:1: rule__XMLDec__PropsAssignment_1 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__XMLDec__PropsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2061:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2062:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2062:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2063:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getPropsAttributePropertyDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__XMLDec__PropsAssignment_14115);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2072:1: rule__ProcessingInstruction__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProcessingInstruction__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2076:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2077:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2077:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2078:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getTypeIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessingInstruction__TypeAssignment_14146); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2087:1: rule__ProcessingInstruction__ImportedNamespaceAssignment_2 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__ProcessingInstruction__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2091:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2092:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2092:1: ( ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2093:1: ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__ProcessingInstruction__ImportedNamespaceAssignment_24177);
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


    // $ANTLR start "rule__ContainerElementDefinition__NamespaceAssignment_1_0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2102:1: rule__ContainerElementDefinition__NamespaceAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__ContainerElementDefinition__NamespaceAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2106:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2107:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2107:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2108:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__NamespaceAssignment_1_04208); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__NamespaceAssignment_1_0"


    // $ANTLR start "rule__ContainerElementDefinition__NameAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2117:1: rule__ContainerElementDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__ContainerElementDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2121:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2122:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2122:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2123:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__NameAssignment_24239);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__NameAssignment_2"


    // $ANTLR start "rule__ContainerElementDefinition__PropertiesAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2132:1: rule__ContainerElementDefinition__PropertiesAssignment_3 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__ContainerElementDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2136:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2137:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2137:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2138:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAttributePropertyDefinitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__ContainerElementDefinition__PropertiesAssignment_34270);
            ruleAttributePropertyDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAttributePropertyDefinitionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__PropertiesAssignment_3"


    // $ANTLR start "rule__ContainerElementDefinition__ContentAssignment_5"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2147:1: rule__ContainerElementDefinition__ContentAssignment_5 : ( rulePCData ) ;
    public final void rule__ContainerElementDefinition__ContentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2151:1: ( ( rulePCData ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2152:1: ( rulePCData )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2152:1: ( rulePCData )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2153:1: rulePCData
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getContentPCDataParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_rulePCData_in_rule__ContainerElementDefinition__ContentAssignment_54301);
            rulePCData();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getContentPCDataParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__ContentAssignment_5"


    // $ANTLR start "rule__ContainerElementDefinition__ChildrenAssignment_6"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2162:1: rule__ContainerElementDefinition__ChildrenAssignment_6 : ( ruleElementDefinition ) ;
    public final void rule__ContainerElementDefinition__ChildrenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2166:1: ( ( ruleElementDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2167:1: ( ruleElementDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2167:1: ( ruleElementDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2168:1: ruleElementDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getChildrenElementDefinitionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_rule__ContainerElementDefinition__ChildrenAssignment_64332);
            ruleElementDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getChildrenElementDefinitionParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__ChildrenAssignment_6"


    // $ANTLR start "rule__ContainerElementDefinition__EndnamespaceAssignment_8_0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2177:1: rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 : ( RULE_ID ) ;
    public final void rule__ContainerElementDefinition__EndnamespaceAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2181:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2182:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2182:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2183:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceIDTerminalRuleCall_8_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__EndnamespaceAssignment_8_04363); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceIDTerminalRuleCall_8_0_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__EndnamespaceAssignment_8_0"


    // $ANTLR start "rule__ContainerElementDefinition__EndnameAssignment_9"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2192:1: rule__ContainerElementDefinition__EndnameAssignment_9 : ( ruleQualifiedName ) ;
    public final void rule__ContainerElementDefinition__EndnameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2196:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2197:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2197:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2198:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnameQualifiedNameParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__EndnameAssignment_94394);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerElementDefinitionAccess().getEndnameQualifiedNameParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__ContainerElementDefinition__EndnameAssignment_9"


    // $ANTLR start "rule__EmptyElementDefinition__NamespaceAssignment_1_0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2207:1: rule__EmptyElementDefinition__NamespaceAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__EmptyElementDefinition__NamespaceAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2211:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2212:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2212:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2213:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EmptyElementDefinition__NamespaceAssignment_1_04425); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2222:1: rule__EmptyElementDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__EmptyElementDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2226:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2227:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2227:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2228:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EmptyElementDefinition__NameAssignment_24456);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2237:1: rule__EmptyElementDefinition__PropsAssignment_3 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__EmptyElementDefinition__PropsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2241:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2242:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2242:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2243:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getPropsAttributePropertyDefinitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__EmptyElementDefinition__PropsAssignment_34487);
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


    // $ANTLR start "rule__PCData__ContentAssignment"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2252:1: rule__PCData__ContentAssignment : ( ruleContent ) ;
    public final void rule__PCData__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2256:1: ( ( ruleContent ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2257:1: ( ruleContent )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2257:1: ( ruleContent )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2258:1: ruleContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPCDataAccess().getContentContentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleContent_in_rule__PCData__ContentAssignment4518);
            ruleContent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPCDataAccess().getContentContentParserRuleCall_0()); 
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
    // $ANTLR end "rule__PCData__ContentAssignment"


    // $ANTLR start "rule__AttributePropertyDefinition__NamespaceAssignment_0_0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2267:1: rule__AttributePropertyDefinition__NamespaceAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__AttributePropertyDefinition__NamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2271:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2272:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2272:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2273:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNamespaceIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributePropertyDefinition__NamespaceAssignment_0_04549); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2282:1: rule__AttributePropertyDefinition__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AttributePropertyDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2286:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2287:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2287:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2288:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AttributePropertyDefinition__NameAssignment_14580);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2297:1: rule__AttributePropertyDefinition__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AttributePropertyDefinition__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2301:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2302:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2302:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2303:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttributePropertyDefinition__ValueAssignment_34611); if (state.failed) return ;
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


    // $ANTLR start "rule__QualifiedNameWithWildCard__ValueAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2312:1: rule__QualifiedNameWithWildCard__ValueAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2316:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2317:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2317:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2318:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getValueQualifiedNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__ValueAssignment_04642);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildCardAccess().getValueQualifiedNameParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildCard__ValueAssignment_0"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\20\uffff";
    static final String DFA1_eofS =
        "\20\uffff";
    static final String DFA1_minS =
        "\1\16\3\4\1\11\1\uffff\1\4\1\uffff\2\4\1\5\2\4\1\11\1\4\1\11";
    static final String DFA1_maxS =
        "\1\16\1\4\1\21\1\4\1\22\1\uffff\1\4\1\uffff\1\21\1\4\1\5\1\4\1"+
        "\21\1\22\1\21\1\22";
    static final String DFA1_acceptS =
        "\5\uffff\1\2\1\uffff\1\1\10\uffff";
    static final String DFA1_specialS =
        "\20\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\4\uffff\1\3\1\6\4\uffff\1\7\1\uffff\1\5",
            "\1\10",
            "\1\11\1\13\7\uffff\1\12",
            "",
            "\1\14",
            "",
            "\1\4\4\uffff\1\3\5\uffff\1\7\1\uffff\1\5",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\4\4\uffff\1\3\5\uffff\1\7\1\uffff\1\5",
            "\1\11\10\uffff\1\12",
            "\1\4\12\uffff\1\7\1\uffff\1\5",
            "\1\11\10\uffff\1\12"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "377:1: rule__ElementDefinition__Alternatives : ( ( ruleContainerElementDefinition ) | ( ruleEmptyElementDefinition ) );";
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
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__0_in_ruleContainerElementDefinition340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyElementDefinition_in_entryRuleEmptyElementDefinition367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyElementDefinition374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__0_in_ruleEmptyElementDefinition400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePCData_in_entryRulePCData427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePCData434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PCData__ContentAssignment_in_rulePCData460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_entryRuleAttributePropertyDefinition487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributePropertyDefinition494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__0_in_ruleAttributePropertyDefinition520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Group__0_in_ruleContent589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerElementDefinition_in_rule__ElementDefinition__Alternatives745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyElementDefinition_in_rule__ElementDefinition__Alternatives762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Content__Alternatives_0794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Content__Alternatives_0811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__Content__Alternatives_0828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Content__Alternatives_0846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Content__Alternatives_0866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Content__Alternatives_1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Content__Alternatives_1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__Content__Alternatives_1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Content__Alternatives_1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Content__Alternatives_1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Content__Alternatives_1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__Group__0__Impl_in_rule__FXML__Group__01021 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__FXML__Group__1_in_rule__FXML__Group__01024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__XmlDecAssignment_0_in_rule__FXML__Group__0__Impl1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__Group__1__Impl_in_rule__FXML__Group__11081 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__FXML__Group__2_in_rule__FXML__Group__11084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__ProcessingInstructionsAssignment_1_in_rule__FXML__Group__1__Impl1111 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__FXML__Group__2__Impl_in_rule__FXML__Group__21142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__RootElementAssignment_2_in_rule__FXML__Group__2__Impl1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__0__Impl_in_rule__XMLDec__Group__01205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__1_in_rule__XMLDec__Group__01208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__XMLDec__Group__0__Impl1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__1__Impl_in_rule__XMLDec__Group__11267 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__2_in_rule__XMLDec__Group__11270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1299 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1311 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__2__Impl_in_rule__XMLDec__Group__21344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__XMLDec__Group__2__Impl1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__0__Impl_in_rule__ProcessingInstruction__Group__01409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__1_in_rule__ProcessingInstruction__Group__01412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ProcessingInstruction__Group__0__Impl1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__1__Impl_in_rule__ProcessingInstruction__Group__11471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__2_in_rule__ProcessingInstruction__Group__11474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__TypeAssignment_1_in_rule__ProcessingInstruction__Group__1__Impl1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__2__Impl_in_rule__ProcessingInstruction__Group__21531 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__3_in_rule__ProcessingInstruction__Group__21534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__ImportedNamespaceAssignment_2_in_rule__ProcessingInstruction__Group__2__Impl1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__3__Impl_in_rule__ProcessingInstruction__Group__31591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ProcessingInstruction__Group__3__Impl1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__0__Impl_in_rule__ContainerElementDefinition__Group__01658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__1_in_rule__ContainerElementDefinition__Group__01661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ContainerElementDefinition__Group__0__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__1__Impl_in_rule__ContainerElementDefinition__Group__11720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__2_in_rule__ContainerElementDefinition__Group__11723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__0_in_rule__ContainerElementDefinition__Group__1__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__2__Impl_in_rule__ContainerElementDefinition__Group__21781 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__3_in_rule__ContainerElementDefinition__Group__21784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__NameAssignment_2_in_rule__ContainerElementDefinition__Group__2__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__3__Impl_in_rule__ContainerElementDefinition__Group__31841 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__4_in_rule__ContainerElementDefinition__Group__31844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__PropertiesAssignment_3_in_rule__ContainerElementDefinition__Group__3__Impl1871 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__4__Impl_in_rule__ContainerElementDefinition__Group__41902 = new BitSet(new long[]{0x0000000000016670L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__5_in_rule__ContainerElementDefinition__Group__41905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ContainerElementDefinition__Group__4__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__5__Impl_in_rule__ContainerElementDefinition__Group__51964 = new BitSet(new long[]{0x0000000000016670L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__6_in_rule__ContainerElementDefinition__Group__51967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__ContentAssignment_5_in_rule__ContainerElementDefinition__Group__5__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__6__Impl_in_rule__ContainerElementDefinition__Group__62025 = new BitSet(new long[]{0x0000000000016670L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__7_in_rule__ContainerElementDefinition__Group__62028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__ChildrenAssignment_6_in_rule__ContainerElementDefinition__Group__6__Impl2055 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__7__Impl_in_rule__ContainerElementDefinition__Group__72086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__8_in_rule__ContainerElementDefinition__Group__72089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ContainerElementDefinition__Group__7__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__8__Impl_in_rule__ContainerElementDefinition__Group__82148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__9_in_rule__ContainerElementDefinition__Group__82151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_8__0_in_rule__ContainerElementDefinition__Group__8__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__9__Impl_in_rule__ContainerElementDefinition__Group__92209 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__10_in_rule__ContainerElementDefinition__Group__92212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__EndnameAssignment_9_in_rule__ContainerElementDefinition__Group__9__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__10__Impl_in_rule__ContainerElementDefinition__Group__102269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ContainerElementDefinition__Group__10__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__0__Impl_in_rule__ContainerElementDefinition__Group_1__02350 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__1_in_rule__ContainerElementDefinition__Group_1__02353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__NamespaceAssignment_1_0_in_rule__ContainerElementDefinition__Group_1__0__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__1__Impl_in_rule__ContainerElementDefinition__Group_1__12410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__ContainerElementDefinition__Group_1__1__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_8__0__Impl_in_rule__ContainerElementDefinition__Group_8__02473 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_8__1_in_rule__ContainerElementDefinition__Group_8__02476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__EndnamespaceAssignment_8_0_in_rule__ContainerElementDefinition__Group_8__0__Impl2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_8__1__Impl_in_rule__ContainerElementDefinition__Group_8__12533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__ContainerElementDefinition__Group_8__1__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__0__Impl_in_rule__EmptyElementDefinition__Group__02596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__1_in_rule__EmptyElementDefinition__Group__02599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EmptyElementDefinition__Group__0__Impl2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__1__Impl_in_rule__EmptyElementDefinition__Group__12658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__2_in_rule__EmptyElementDefinition__Group__12661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__0_in_rule__EmptyElementDefinition__Group__1__Impl2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__2__Impl_in_rule__EmptyElementDefinition__Group__22719 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__3_in_rule__EmptyElementDefinition__Group__22722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__NameAssignment_2_in_rule__EmptyElementDefinition__Group__2__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__3__Impl_in_rule__EmptyElementDefinition__Group__32779 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__4_in_rule__EmptyElementDefinition__Group__32782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__PropsAssignment_3_in_rule__EmptyElementDefinition__Group__3__Impl2809 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__4__Impl_in_rule__EmptyElementDefinition__Group__42840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EmptyElementDefinition__Group__4__Impl2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__0__Impl_in_rule__EmptyElementDefinition__Group_1__02909 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__1_in_rule__EmptyElementDefinition__Group_1__02912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__NamespaceAssignment_1_0_in_rule__EmptyElementDefinition__Group_1__0__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__1__Impl_in_rule__EmptyElementDefinition__Group_1__12969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__EmptyElementDefinition__Group_1__1__Impl2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__0__Impl_in_rule__AttributePropertyDefinition__Group__03032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__1_in_rule__AttributePropertyDefinition__Group__03035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__0_in_rule__AttributePropertyDefinition__Group__0__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__1__Impl_in_rule__AttributePropertyDefinition__Group__13093 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__2_in_rule__AttributePropertyDefinition__Group__13096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__NameAssignment_1_in_rule__AttributePropertyDefinition__Group__1__Impl3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__2__Impl_in_rule__AttributePropertyDefinition__Group__23153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__3_in_rule__AttributePropertyDefinition__Group__23156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AttributePropertyDefinition__Group__2__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__3__Impl_in_rule__AttributePropertyDefinition__Group__33215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__ValueAssignment_3_in_rule__AttributePropertyDefinition__Group__3__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__0__Impl_in_rule__AttributePropertyDefinition__Group_0__03280 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__1_in_rule__AttributePropertyDefinition__Group_0__03283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__NamespaceAssignment_0_0_in_rule__AttributePropertyDefinition__Group_0__0__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__1__Impl_in_rule__AttributePropertyDefinition__Group_0__13340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__AttributePropertyDefinition__Group_0__1__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__03403 = new BitSet(new long[]{0x00000000000006F0L});
    public static final BitSet FOLLOW_rule__Content__Group__1_in_rule__Content__Group__03406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Alternatives_0_in_rule__Content__Group__0__Impl3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__13463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Alternatives_1_in_rule__Content__Group__1__Impl3490 = new BitSet(new long[]{0x00000000000006F2L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03525 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3611 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__QualifiedName__Group_1__0__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__03770 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__03773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__ValueAssignment_0_in_rule__QualifiedNameWithWildCard__Group__0__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__13830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__03892 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__03895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__13954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDec_in_rule__FXML__XmlDecAssignment_04022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingInstruction_in_rule__FXML__ProcessingInstructionsAssignment_14053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_rule__FXML__RootElementAssignment_24084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__XMLDec__PropsAssignment_14115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessingInstruction__TypeAssignment_14146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__ProcessingInstruction__ImportedNamespaceAssignment_24177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__NamespaceAssignment_1_04208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__NameAssignment_24239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__ContainerElementDefinition__PropertiesAssignment_34270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePCData_in_rule__ContainerElementDefinition__ContentAssignment_54301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_rule__ContainerElementDefinition__ChildrenAssignment_64332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__EndnamespaceAssignment_8_04363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__EndnameAssignment_94394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EmptyElementDefinition__NamespaceAssignment_1_04425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EmptyElementDefinition__NameAssignment_24456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__EmptyElementDefinition__PropsAssignment_34487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rule__PCData__ContentAssignment4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributePropertyDefinition__NamespaceAssignment_0_04549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AttributePropertyDefinition__NameAssignment_14580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributePropertyDefinition__ValueAssignment_34611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__ValueAssignment_04642 = new BitSet(new long[]{0x0000000000000002L});

}