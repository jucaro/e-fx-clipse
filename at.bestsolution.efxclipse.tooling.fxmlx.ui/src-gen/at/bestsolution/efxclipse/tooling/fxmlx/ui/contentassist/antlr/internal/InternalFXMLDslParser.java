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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_WS", "RULE_ML_COMMENT", "'.'", "':'", "'='", "'<?xml'", "'?>'", "'<?'", "'<'", "'>'", "'</'", "'/>'", "'*'"
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:399:1: rule__Content__Alternatives_0 : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( '.' ) | ( ':' ) | ( '=' ) );
    public final void rule__Content__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:403:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( '.' ) | ( ':' ) | ( '=' ) )
            int alt2=6;
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
            case 11:
                {
                alt2=6;
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
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:438:6: ( '=' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:438:6: ( '=' )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:439:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getEqualsSignKeyword_0_5()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Content__Alternatives_0886); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getEqualsSignKeyword_0_5()); 
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:451:1: rule__Content__Alternatives_1 : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( RULE_WS ) | ( '.' ) | ( ':' ) | ( '=' ) );
    public final void rule__Content__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:455:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( RULE_WS ) | ( '.' ) | ( ':' ) | ( '=' ) )
            int alt3=7;
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
            case 11:
                {
                alt3=7;
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
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:456:1: ( RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:456:1: ( RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:457:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getIDTerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Content__Alternatives_1920); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getIDTerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:462:6: ( RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:462:6: ( RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:463:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Content__Alternatives_1937); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:468:6: ( RULE_ANY_OTHER )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:468:6: ( RULE_ANY_OTHER )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:469:1: RULE_ANY_OTHER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getANY_OTHERTerminalRuleCall_1_2()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__Content__Alternatives_1954); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getANY_OTHERTerminalRuleCall_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:474:6: ( RULE_WS )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:474:6: ( RULE_WS )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:475:1: RULE_WS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getWSTerminalRuleCall_1_3()); 
                    }
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Content__Alternatives_1971); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getWSTerminalRuleCall_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:480:6: ( '.' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:480:6: ( '.' )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:481:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getFullStopKeyword_1_4()); 
                    }
                    match(input,9,FOLLOW_9_in_rule__Content__Alternatives_1989); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getFullStopKeyword_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:488:6: ( ':' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:488:6: ( ':' )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:489:1: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getColonKeyword_1_5()); 
                    }
                    match(input,10,FOLLOW_10_in_rule__Content__Alternatives_11009); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getColonKeyword_1_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:496:6: ( '=' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:496:6: ( '=' )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:497:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getContentAccess().getEqualsSignKeyword_1_6()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Content__Alternatives_11029); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getContentAccess().getEqualsSignKeyword_1_6()); 
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:511:1: rule__FXML__Group__0 : rule__FXML__Group__0__Impl rule__FXML__Group__1 ;
    public final void rule__FXML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:515:1: ( rule__FXML__Group__0__Impl rule__FXML__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:516:2: rule__FXML__Group__0__Impl rule__FXML__Group__1
            {
            pushFollow(FOLLOW_rule__FXML__Group__0__Impl_in_rule__FXML__Group__01061);
            rule__FXML__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FXML__Group__1_in_rule__FXML__Group__01064);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:523:1: rule__FXML__Group__0__Impl : ( ( rule__FXML__XmlDecAssignment_0 ) ) ;
    public final void rule__FXML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:527:1: ( ( ( rule__FXML__XmlDecAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:528:1: ( ( rule__FXML__XmlDecAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:528:1: ( ( rule__FXML__XmlDecAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:529:1: ( rule__FXML__XmlDecAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getXmlDecAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:530:1: ( rule__FXML__XmlDecAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:530:2: rule__FXML__XmlDecAssignment_0
            {
            pushFollow(FOLLOW_rule__FXML__XmlDecAssignment_0_in_rule__FXML__Group__0__Impl1091);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:540:1: rule__FXML__Group__1 : rule__FXML__Group__1__Impl rule__FXML__Group__2 ;
    public final void rule__FXML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:544:1: ( rule__FXML__Group__1__Impl rule__FXML__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:545:2: rule__FXML__Group__1__Impl rule__FXML__Group__2
            {
            pushFollow(FOLLOW_rule__FXML__Group__1__Impl_in_rule__FXML__Group__11121);
            rule__FXML__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FXML__Group__2_in_rule__FXML__Group__11124);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:552:1: rule__FXML__Group__1__Impl : ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* ) ;
    public final void rule__FXML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:556:1: ( ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:557:1: ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:557:1: ( ( rule__FXML__ProcessingInstructionsAssignment_1 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:558:1: ( rule__FXML__ProcessingInstructionsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getProcessingInstructionsAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:559:1: ( rule__FXML__ProcessingInstructionsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:559:2: rule__FXML__ProcessingInstructionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__FXML__ProcessingInstructionsAssignment_1_in_rule__FXML__Group__1__Impl1151);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:569:1: rule__FXML__Group__2 : rule__FXML__Group__2__Impl ;
    public final void rule__FXML__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:573:1: ( rule__FXML__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:574:2: rule__FXML__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FXML__Group__2__Impl_in_rule__FXML__Group__21182);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:580:1: rule__FXML__Group__2__Impl : ( ( rule__FXML__RootElementAssignment_2 ) ) ;
    public final void rule__FXML__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:584:1: ( ( ( rule__FXML__RootElementAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:585:1: ( ( rule__FXML__RootElementAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:585:1: ( ( rule__FXML__RootElementAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:586:1: ( rule__FXML__RootElementAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getRootElementAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:587:1: ( rule__FXML__RootElementAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:587:2: rule__FXML__RootElementAssignment_2
            {
            pushFollow(FOLLOW_rule__FXML__RootElementAssignment_2_in_rule__FXML__Group__2__Impl1209);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:603:1: rule__XMLDec__Group__0 : rule__XMLDec__Group__0__Impl rule__XMLDec__Group__1 ;
    public final void rule__XMLDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:607:1: ( rule__XMLDec__Group__0__Impl rule__XMLDec__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:608:2: rule__XMLDec__Group__0__Impl rule__XMLDec__Group__1
            {
            pushFollow(FOLLOW_rule__XMLDec__Group__0__Impl_in_rule__XMLDec__Group__01245);
            rule__XMLDec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XMLDec__Group__1_in_rule__XMLDec__Group__01248);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:615:1: rule__XMLDec__Group__0__Impl : ( '<?xml' ) ;
    public final void rule__XMLDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:619:1: ( ( '<?xml' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:620:1: ( '<?xml' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:620:1: ( '<?xml' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:621:1: '<?xml'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getXmlKeyword_0()); 
            }
            match(input,12,FOLLOW_12_in_rule__XMLDec__Group__0__Impl1276); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:634:1: rule__XMLDec__Group__1 : rule__XMLDec__Group__1__Impl rule__XMLDec__Group__2 ;
    public final void rule__XMLDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:638:1: ( rule__XMLDec__Group__1__Impl rule__XMLDec__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:639:2: rule__XMLDec__Group__1__Impl rule__XMLDec__Group__2
            {
            pushFollow(FOLLOW_rule__XMLDec__Group__1__Impl_in_rule__XMLDec__Group__11307);
            rule__XMLDec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XMLDec__Group__2_in_rule__XMLDec__Group__11310);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:646:1: rule__XMLDec__Group__1__Impl : ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) ) ;
    public final void rule__XMLDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:650:1: ( ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:651:1: ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:651:1: ( ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:652:1: ( ( rule__XMLDec__PropsAssignment_1 ) ) ( ( rule__XMLDec__PropsAssignment_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:652:1: ( ( rule__XMLDec__PropsAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:653:1: ( rule__XMLDec__PropsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getPropsAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:654:1: ( rule__XMLDec__PropsAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:654:2: rule__XMLDec__PropsAssignment_1
            {
            pushFollow(FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1339);
            rule__XMLDec__PropsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMLDecAccess().getPropsAssignment_1()); 
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:657:1: ( ( rule__XMLDec__PropsAssignment_1 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:658:1: ( rule__XMLDec__PropsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getPropsAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:659:1: ( rule__XMLDec__PropsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:659:2: rule__XMLDec__PropsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1351);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:670:1: rule__XMLDec__Group__2 : rule__XMLDec__Group__2__Impl ;
    public final void rule__XMLDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:674:1: ( rule__XMLDec__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:675:2: rule__XMLDec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__XMLDec__Group__2__Impl_in_rule__XMLDec__Group__21384);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:681:1: rule__XMLDec__Group__2__Impl : ( '?>' ) ;
    public final void rule__XMLDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:685:1: ( ( '?>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:686:1: ( '?>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:686:1: ( '?>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:687:1: '?>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getQuestionMarkGreaterThanSignKeyword_2()); 
            }
            match(input,13,FOLLOW_13_in_rule__XMLDec__Group__2__Impl1412); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:706:1: rule__ProcessingInstruction__Group__0 : rule__ProcessingInstruction__Group__0__Impl rule__ProcessingInstruction__Group__1 ;
    public final void rule__ProcessingInstruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:710:1: ( rule__ProcessingInstruction__Group__0__Impl rule__ProcessingInstruction__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:711:2: rule__ProcessingInstruction__Group__0__Impl rule__ProcessingInstruction__Group__1
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__0__Impl_in_rule__ProcessingInstruction__Group__01449);
            rule__ProcessingInstruction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__1_in_rule__ProcessingInstruction__Group__01452);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:718:1: rule__ProcessingInstruction__Group__0__Impl : ( '<?' ) ;
    public final void rule__ProcessingInstruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:722:1: ( ( '<?' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:723:1: ( '<?' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:723:1: ( '<?' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:724:1: '<?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getLessThanSignQuestionMarkKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__ProcessingInstruction__Group__0__Impl1480); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:737:1: rule__ProcessingInstruction__Group__1 : rule__ProcessingInstruction__Group__1__Impl rule__ProcessingInstruction__Group__2 ;
    public final void rule__ProcessingInstruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:741:1: ( rule__ProcessingInstruction__Group__1__Impl rule__ProcessingInstruction__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:742:2: rule__ProcessingInstruction__Group__1__Impl rule__ProcessingInstruction__Group__2
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__1__Impl_in_rule__ProcessingInstruction__Group__11511);
            rule__ProcessingInstruction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__2_in_rule__ProcessingInstruction__Group__11514);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:749:1: rule__ProcessingInstruction__Group__1__Impl : ( ( rule__ProcessingInstruction__TypeAssignment_1 ) ) ;
    public final void rule__ProcessingInstruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:753:1: ( ( ( rule__ProcessingInstruction__TypeAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:754:1: ( ( rule__ProcessingInstruction__TypeAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:754:1: ( ( rule__ProcessingInstruction__TypeAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:755:1: ( rule__ProcessingInstruction__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getTypeAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:756:1: ( rule__ProcessingInstruction__TypeAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:756:2: rule__ProcessingInstruction__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__TypeAssignment_1_in_rule__ProcessingInstruction__Group__1__Impl1541);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:766:1: rule__ProcessingInstruction__Group__2 : rule__ProcessingInstruction__Group__2__Impl rule__ProcessingInstruction__Group__3 ;
    public final void rule__ProcessingInstruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:770:1: ( rule__ProcessingInstruction__Group__2__Impl rule__ProcessingInstruction__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:771:2: rule__ProcessingInstruction__Group__2__Impl rule__ProcessingInstruction__Group__3
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__2__Impl_in_rule__ProcessingInstruction__Group__21571);
            rule__ProcessingInstruction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__3_in_rule__ProcessingInstruction__Group__21574);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:778:1: rule__ProcessingInstruction__Group__2__Impl : ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__ProcessingInstruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:782:1: ( ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:783:1: ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:783:1: ( ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:784:1: ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getImportedNamespaceAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:785:1: ( rule__ProcessingInstruction__ImportedNamespaceAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:785:2: rule__ProcessingInstruction__ImportedNamespaceAssignment_2
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__ImportedNamespaceAssignment_2_in_rule__ProcessingInstruction__Group__2__Impl1601);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:795:1: rule__ProcessingInstruction__Group__3 : rule__ProcessingInstruction__Group__3__Impl ;
    public final void rule__ProcessingInstruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:799:1: ( rule__ProcessingInstruction__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:800:2: rule__ProcessingInstruction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ProcessingInstruction__Group__3__Impl_in_rule__ProcessingInstruction__Group__31631);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:806:1: rule__ProcessingInstruction__Group__3__Impl : ( '?>' ) ;
    public final void rule__ProcessingInstruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:810:1: ( ( '?>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:811:1: ( '?>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:811:1: ( '?>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:812:1: '?>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getQuestionMarkGreaterThanSignKeyword_3()); 
            }
            match(input,13,FOLLOW_13_in_rule__ProcessingInstruction__Group__3__Impl1659); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:833:1: rule__ContainerElementDefinition__Group__0 : rule__ContainerElementDefinition__Group__0__Impl rule__ContainerElementDefinition__Group__1 ;
    public final void rule__ContainerElementDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:837:1: ( rule__ContainerElementDefinition__Group__0__Impl rule__ContainerElementDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:838:2: rule__ContainerElementDefinition__Group__0__Impl rule__ContainerElementDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__0__Impl_in_rule__ContainerElementDefinition__Group__01698);
            rule__ContainerElementDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__1_in_rule__ContainerElementDefinition__Group__01701);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:845:1: rule__ContainerElementDefinition__Group__0__Impl : ( '<' ) ;
    public final void rule__ContainerElementDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:849:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:850:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:850:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:851:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__ContainerElementDefinition__Group__0__Impl1729); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:864:1: rule__ContainerElementDefinition__Group__1 : rule__ContainerElementDefinition__Group__1__Impl rule__ContainerElementDefinition__Group__2 ;
    public final void rule__ContainerElementDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:868:1: ( rule__ContainerElementDefinition__Group__1__Impl rule__ContainerElementDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:869:2: rule__ContainerElementDefinition__Group__1__Impl rule__ContainerElementDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__1__Impl_in_rule__ContainerElementDefinition__Group__11760);
            rule__ContainerElementDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__2_in_rule__ContainerElementDefinition__Group__11763);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:876:1: rule__ContainerElementDefinition__Group__1__Impl : ( ( rule__ContainerElementDefinition__Group_1__0 )? ) ;
    public final void rule__ContainerElementDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:880:1: ( ( ( rule__ContainerElementDefinition__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:881:1: ( ( rule__ContainerElementDefinition__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:881:1: ( ( rule__ContainerElementDefinition__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:882:1: ( rule__ContainerElementDefinition__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:883:1: ( rule__ContainerElementDefinition__Group_1__0 )?
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
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:883:2: rule__ContainerElementDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__0_in_rule__ContainerElementDefinition__Group__1__Impl1790);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:893:1: rule__ContainerElementDefinition__Group__2 : rule__ContainerElementDefinition__Group__2__Impl rule__ContainerElementDefinition__Group__3 ;
    public final void rule__ContainerElementDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:897:1: ( rule__ContainerElementDefinition__Group__2__Impl rule__ContainerElementDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:898:2: rule__ContainerElementDefinition__Group__2__Impl rule__ContainerElementDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__2__Impl_in_rule__ContainerElementDefinition__Group__21821);
            rule__ContainerElementDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__3_in_rule__ContainerElementDefinition__Group__21824);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:905:1: rule__ContainerElementDefinition__Group__2__Impl : ( ( rule__ContainerElementDefinition__NameAssignment_2 ) ) ;
    public final void rule__ContainerElementDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:909:1: ( ( ( rule__ContainerElementDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:910:1: ( ( rule__ContainerElementDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:910:1: ( ( rule__ContainerElementDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:911:1: ( rule__ContainerElementDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:912:1: ( rule__ContainerElementDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:912:2: rule__ContainerElementDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__NameAssignment_2_in_rule__ContainerElementDefinition__Group__2__Impl1851);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:922:1: rule__ContainerElementDefinition__Group__3 : rule__ContainerElementDefinition__Group__3__Impl rule__ContainerElementDefinition__Group__4 ;
    public final void rule__ContainerElementDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:926:1: ( rule__ContainerElementDefinition__Group__3__Impl rule__ContainerElementDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:927:2: rule__ContainerElementDefinition__Group__3__Impl rule__ContainerElementDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__3__Impl_in_rule__ContainerElementDefinition__Group__31881);
            rule__ContainerElementDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__4_in_rule__ContainerElementDefinition__Group__31884);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:934:1: rule__ContainerElementDefinition__Group__3__Impl : ( ( rule__ContainerElementDefinition__PropertiesAssignment_3 )* ) ;
    public final void rule__ContainerElementDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:938:1: ( ( ( rule__ContainerElementDefinition__PropertiesAssignment_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:939:1: ( ( rule__ContainerElementDefinition__PropertiesAssignment_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:939:1: ( ( rule__ContainerElementDefinition__PropertiesAssignment_3 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:940:1: ( rule__ContainerElementDefinition__PropertiesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:941:1: ( rule__ContainerElementDefinition__PropertiesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:941:2: rule__ContainerElementDefinition__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ContainerElementDefinition__PropertiesAssignment_3_in_rule__ContainerElementDefinition__Group__3__Impl1911);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:951:1: rule__ContainerElementDefinition__Group__4 : rule__ContainerElementDefinition__Group__4__Impl rule__ContainerElementDefinition__Group__5 ;
    public final void rule__ContainerElementDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:955:1: ( rule__ContainerElementDefinition__Group__4__Impl rule__ContainerElementDefinition__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:956:2: rule__ContainerElementDefinition__Group__4__Impl rule__ContainerElementDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__4__Impl_in_rule__ContainerElementDefinition__Group__41942);
            rule__ContainerElementDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__5_in_rule__ContainerElementDefinition__Group__41945);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:963:1: rule__ContainerElementDefinition__Group__4__Impl : ( '>' ) ;
    public final void rule__ContainerElementDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:967:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:968:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:968:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:969:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_4()); 
            }
            match(input,16,FOLLOW_16_in_rule__ContainerElementDefinition__Group__4__Impl1973); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:982:1: rule__ContainerElementDefinition__Group__5 : rule__ContainerElementDefinition__Group__5__Impl rule__ContainerElementDefinition__Group__6 ;
    public final void rule__ContainerElementDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:986:1: ( rule__ContainerElementDefinition__Group__5__Impl rule__ContainerElementDefinition__Group__6 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:987:2: rule__ContainerElementDefinition__Group__5__Impl rule__ContainerElementDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__5__Impl_in_rule__ContainerElementDefinition__Group__52004);
            rule__ContainerElementDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__6_in_rule__ContainerElementDefinition__Group__52007);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:994:1: rule__ContainerElementDefinition__Group__5__Impl : ( ( rule__ContainerElementDefinition__ContentAssignment_5 )? ) ;
    public final void rule__ContainerElementDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:998:1: ( ( ( rule__ContainerElementDefinition__ContentAssignment_5 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:999:1: ( ( rule__ContainerElementDefinition__ContentAssignment_5 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:999:1: ( ( rule__ContainerElementDefinition__ContentAssignment_5 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1000:1: ( rule__ContainerElementDefinition__ContentAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getContentAssignment_5()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1001:1: ( rule__ContainerElementDefinition__ContentAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_ANY_OTHER)||(LA8_0>=9 && LA8_0<=11)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1001:2: rule__ContainerElementDefinition__ContentAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__ContentAssignment_5_in_rule__ContainerElementDefinition__Group__5__Impl2034);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1011:1: rule__ContainerElementDefinition__Group__6 : rule__ContainerElementDefinition__Group__6__Impl rule__ContainerElementDefinition__Group__7 ;
    public final void rule__ContainerElementDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1015:1: ( rule__ContainerElementDefinition__Group__6__Impl rule__ContainerElementDefinition__Group__7 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1016:2: rule__ContainerElementDefinition__Group__6__Impl rule__ContainerElementDefinition__Group__7
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__6__Impl_in_rule__ContainerElementDefinition__Group__62065);
            rule__ContainerElementDefinition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__7_in_rule__ContainerElementDefinition__Group__62068);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1023:1: rule__ContainerElementDefinition__Group__6__Impl : ( ( rule__ContainerElementDefinition__ChildrenAssignment_6 )* ) ;
    public final void rule__ContainerElementDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1027:1: ( ( ( rule__ContainerElementDefinition__ChildrenAssignment_6 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1028:1: ( ( rule__ContainerElementDefinition__ChildrenAssignment_6 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1028:1: ( ( rule__ContainerElementDefinition__ChildrenAssignment_6 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1029:1: ( rule__ContainerElementDefinition__ChildrenAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getChildrenAssignment_6()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1030:1: ( rule__ContainerElementDefinition__ChildrenAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1030:2: rule__ContainerElementDefinition__ChildrenAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__ContainerElementDefinition__ChildrenAssignment_6_in_rule__ContainerElementDefinition__Group__6__Impl2095);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1040:1: rule__ContainerElementDefinition__Group__7 : rule__ContainerElementDefinition__Group__7__Impl rule__ContainerElementDefinition__Group__8 ;
    public final void rule__ContainerElementDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1044:1: ( rule__ContainerElementDefinition__Group__7__Impl rule__ContainerElementDefinition__Group__8 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1045:2: rule__ContainerElementDefinition__Group__7__Impl rule__ContainerElementDefinition__Group__8
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__7__Impl_in_rule__ContainerElementDefinition__Group__72126);
            rule__ContainerElementDefinition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__8_in_rule__ContainerElementDefinition__Group__72129);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1052:1: rule__ContainerElementDefinition__Group__7__Impl : ( '</' ) ;
    public final void rule__ContainerElementDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1056:1: ( ( '</' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1057:1: ( '</' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1057:1: ( '</' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1058:1: '</'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getLessThanSignSolidusKeyword_7()); 
            }
            match(input,17,FOLLOW_17_in_rule__ContainerElementDefinition__Group__7__Impl2157); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1071:1: rule__ContainerElementDefinition__Group__8 : rule__ContainerElementDefinition__Group__8__Impl rule__ContainerElementDefinition__Group__9 ;
    public final void rule__ContainerElementDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1075:1: ( rule__ContainerElementDefinition__Group__8__Impl rule__ContainerElementDefinition__Group__9 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1076:2: rule__ContainerElementDefinition__Group__8__Impl rule__ContainerElementDefinition__Group__9
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__8__Impl_in_rule__ContainerElementDefinition__Group__82188);
            rule__ContainerElementDefinition__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__9_in_rule__ContainerElementDefinition__Group__82191);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1083:1: rule__ContainerElementDefinition__Group__8__Impl : ( ( rule__ContainerElementDefinition__Group_8__0 )? ) ;
    public final void rule__ContainerElementDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1087:1: ( ( ( rule__ContainerElementDefinition__Group_8__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1088:1: ( ( rule__ContainerElementDefinition__Group_8__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1088:1: ( ( rule__ContainerElementDefinition__Group_8__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1089:1: ( rule__ContainerElementDefinition__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGroup_8()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1090:1: ( rule__ContainerElementDefinition__Group_8__0 )?
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
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1090:2: rule__ContainerElementDefinition__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_8__0_in_rule__ContainerElementDefinition__Group__8__Impl2218);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1100:1: rule__ContainerElementDefinition__Group__9 : rule__ContainerElementDefinition__Group__9__Impl rule__ContainerElementDefinition__Group__10 ;
    public final void rule__ContainerElementDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1104:1: ( rule__ContainerElementDefinition__Group__9__Impl rule__ContainerElementDefinition__Group__10 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1105:2: rule__ContainerElementDefinition__Group__9__Impl rule__ContainerElementDefinition__Group__10
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__9__Impl_in_rule__ContainerElementDefinition__Group__92249);
            rule__ContainerElementDefinition__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__10_in_rule__ContainerElementDefinition__Group__92252);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1112:1: rule__ContainerElementDefinition__Group__9__Impl : ( ( rule__ContainerElementDefinition__EndnameAssignment_9 ) ) ;
    public final void rule__ContainerElementDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1116:1: ( ( ( rule__ContainerElementDefinition__EndnameAssignment_9 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1117:1: ( ( rule__ContainerElementDefinition__EndnameAssignment_9 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1117:1: ( ( rule__ContainerElementDefinition__EndnameAssignment_9 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1118:1: ( rule__ContainerElementDefinition__EndnameAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnameAssignment_9()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1119:1: ( rule__ContainerElementDefinition__EndnameAssignment_9 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1119:2: rule__ContainerElementDefinition__EndnameAssignment_9
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__EndnameAssignment_9_in_rule__ContainerElementDefinition__Group__9__Impl2279);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1129:1: rule__ContainerElementDefinition__Group__10 : rule__ContainerElementDefinition__Group__10__Impl ;
    public final void rule__ContainerElementDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1133:1: ( rule__ContainerElementDefinition__Group__10__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1134:2: rule__ContainerElementDefinition__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group__10__Impl_in_rule__ContainerElementDefinition__Group__102309);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1140:1: rule__ContainerElementDefinition__Group__10__Impl : ( '>' ) ;
    public final void rule__ContainerElementDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1144:1: ( ( '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1145:1: ( '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1145:1: ( '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1146:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_10()); 
            }
            match(input,16,FOLLOW_16_in_rule__ContainerElementDefinition__Group__10__Impl2337); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1181:1: rule__ContainerElementDefinition__Group_1__0 : rule__ContainerElementDefinition__Group_1__0__Impl rule__ContainerElementDefinition__Group_1__1 ;
    public final void rule__ContainerElementDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1185:1: ( rule__ContainerElementDefinition__Group_1__0__Impl rule__ContainerElementDefinition__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1186:2: rule__ContainerElementDefinition__Group_1__0__Impl rule__ContainerElementDefinition__Group_1__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__0__Impl_in_rule__ContainerElementDefinition__Group_1__02390);
            rule__ContainerElementDefinition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__1_in_rule__ContainerElementDefinition__Group_1__02393);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1193:1: rule__ContainerElementDefinition__Group_1__0__Impl : ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_0 ) ) ;
    public final void rule__ContainerElementDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1197:1: ( ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1198:1: ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1198:1: ( ( rule__ContainerElementDefinition__NamespaceAssignment_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1199:1: ( rule__ContainerElementDefinition__NamespaceAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNamespaceAssignment_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1200:1: ( rule__ContainerElementDefinition__NamespaceAssignment_1_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1200:2: rule__ContainerElementDefinition__NamespaceAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__NamespaceAssignment_1_0_in_rule__ContainerElementDefinition__Group_1__0__Impl2420);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1210:1: rule__ContainerElementDefinition__Group_1__1 : rule__ContainerElementDefinition__Group_1__1__Impl ;
    public final void rule__ContainerElementDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1214:1: ( rule__ContainerElementDefinition__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1215:2: rule__ContainerElementDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_1__1__Impl_in_rule__ContainerElementDefinition__Group_1__12450);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1221:1: rule__ContainerElementDefinition__Group_1__1__Impl : ( ':' ) ;
    public final void rule__ContainerElementDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1225:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1226:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1226:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1227:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_1_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__ContainerElementDefinition__Group_1__1__Impl2478); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1244:1: rule__ContainerElementDefinition__Group_8__0 : rule__ContainerElementDefinition__Group_8__0__Impl rule__ContainerElementDefinition__Group_8__1 ;
    public final void rule__ContainerElementDefinition__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1248:1: ( rule__ContainerElementDefinition__Group_8__0__Impl rule__ContainerElementDefinition__Group_8__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1249:2: rule__ContainerElementDefinition__Group_8__0__Impl rule__ContainerElementDefinition__Group_8__1
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_8__0__Impl_in_rule__ContainerElementDefinition__Group_8__02513);
            rule__ContainerElementDefinition__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_8__1_in_rule__ContainerElementDefinition__Group_8__02516);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1256:1: rule__ContainerElementDefinition__Group_8__0__Impl : ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 ) ) ;
    public final void rule__ContainerElementDefinition__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1260:1: ( ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1261:1: ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1261:1: ( ( rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1262:1: ( rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceAssignment_8_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1263:1: ( rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1263:2: rule__ContainerElementDefinition__EndnamespaceAssignment_8_0
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__EndnamespaceAssignment_8_0_in_rule__ContainerElementDefinition__Group_8__0__Impl2543);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1273:1: rule__ContainerElementDefinition__Group_8__1 : rule__ContainerElementDefinition__Group_8__1__Impl ;
    public final void rule__ContainerElementDefinition__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1277:1: ( rule__ContainerElementDefinition__Group_8__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1278:2: rule__ContainerElementDefinition__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__ContainerElementDefinition__Group_8__1__Impl_in_rule__ContainerElementDefinition__Group_8__12573);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1284:1: rule__ContainerElementDefinition__Group_8__1__Impl : ( ':' ) ;
    public final void rule__ContainerElementDefinition__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1288:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1289:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1289:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1290:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_8_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__ContainerElementDefinition__Group_8__1__Impl2601); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1307:1: rule__EmptyElementDefinition__Group__0 : rule__EmptyElementDefinition__Group__0__Impl rule__EmptyElementDefinition__Group__1 ;
    public final void rule__EmptyElementDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1311:1: ( rule__EmptyElementDefinition__Group__0__Impl rule__EmptyElementDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1312:2: rule__EmptyElementDefinition__Group__0__Impl rule__EmptyElementDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__0__Impl_in_rule__EmptyElementDefinition__Group__02636);
            rule__EmptyElementDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__1_in_rule__EmptyElementDefinition__Group__02639);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1319:1: rule__EmptyElementDefinition__Group__0__Impl : ( '<' ) ;
    public final void rule__EmptyElementDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1323:1: ( ( '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1324:1: ( '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1324:1: ( '<' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1325:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getLessThanSignKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__EmptyElementDefinition__Group__0__Impl2667); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1338:1: rule__EmptyElementDefinition__Group__1 : rule__EmptyElementDefinition__Group__1__Impl rule__EmptyElementDefinition__Group__2 ;
    public final void rule__EmptyElementDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1342:1: ( rule__EmptyElementDefinition__Group__1__Impl rule__EmptyElementDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1343:2: rule__EmptyElementDefinition__Group__1__Impl rule__EmptyElementDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__1__Impl_in_rule__EmptyElementDefinition__Group__12698);
            rule__EmptyElementDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__2_in_rule__EmptyElementDefinition__Group__12701);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1350:1: rule__EmptyElementDefinition__Group__1__Impl : ( ( rule__EmptyElementDefinition__Group_1__0 )? ) ;
    public final void rule__EmptyElementDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1354:1: ( ( ( rule__EmptyElementDefinition__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1355:1: ( ( rule__EmptyElementDefinition__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1355:1: ( ( rule__EmptyElementDefinition__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1356:1: ( rule__EmptyElementDefinition__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1357:1: ( rule__EmptyElementDefinition__Group_1__0 )?
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
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1357:2: rule__EmptyElementDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__0_in_rule__EmptyElementDefinition__Group__1__Impl2728);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1367:1: rule__EmptyElementDefinition__Group__2 : rule__EmptyElementDefinition__Group__2__Impl rule__EmptyElementDefinition__Group__3 ;
    public final void rule__EmptyElementDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1371:1: ( rule__EmptyElementDefinition__Group__2__Impl rule__EmptyElementDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1372:2: rule__EmptyElementDefinition__Group__2__Impl rule__EmptyElementDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__2__Impl_in_rule__EmptyElementDefinition__Group__22759);
            rule__EmptyElementDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__3_in_rule__EmptyElementDefinition__Group__22762);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1379:1: rule__EmptyElementDefinition__Group__2__Impl : ( ( rule__EmptyElementDefinition__NameAssignment_2 ) ) ;
    public final void rule__EmptyElementDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1383:1: ( ( ( rule__EmptyElementDefinition__NameAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1384:1: ( ( rule__EmptyElementDefinition__NameAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1384:1: ( ( rule__EmptyElementDefinition__NameAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1385:1: ( rule__EmptyElementDefinition__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNameAssignment_2()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1386:1: ( rule__EmptyElementDefinition__NameAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1386:2: rule__EmptyElementDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__NameAssignment_2_in_rule__EmptyElementDefinition__Group__2__Impl2789);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1396:1: rule__EmptyElementDefinition__Group__3 : rule__EmptyElementDefinition__Group__3__Impl rule__EmptyElementDefinition__Group__4 ;
    public final void rule__EmptyElementDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1400:1: ( rule__EmptyElementDefinition__Group__3__Impl rule__EmptyElementDefinition__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1401:2: rule__EmptyElementDefinition__Group__3__Impl rule__EmptyElementDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__3__Impl_in_rule__EmptyElementDefinition__Group__32819);
            rule__EmptyElementDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__4_in_rule__EmptyElementDefinition__Group__32822);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1408:1: rule__EmptyElementDefinition__Group__3__Impl : ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* ) ;
    public final void rule__EmptyElementDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1412:1: ( ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1413:1: ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1413:1: ( ( rule__EmptyElementDefinition__PropsAssignment_3 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1414:1: ( rule__EmptyElementDefinition__PropsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getPropsAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1415:1: ( rule__EmptyElementDefinition__PropsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1415:2: rule__EmptyElementDefinition__PropsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__EmptyElementDefinition__PropsAssignment_3_in_rule__EmptyElementDefinition__Group__3__Impl2849);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1425:1: rule__EmptyElementDefinition__Group__4 : rule__EmptyElementDefinition__Group__4__Impl ;
    public final void rule__EmptyElementDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1429:1: ( rule__EmptyElementDefinition__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1430:2: rule__EmptyElementDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group__4__Impl_in_rule__EmptyElementDefinition__Group__42880);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1436:1: rule__EmptyElementDefinition__Group__4__Impl : ( '/>' ) ;
    public final void rule__EmptyElementDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1440:1: ( ( '/>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1441:1: ( '/>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1441:1: ( '/>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1442:1: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getSolidusGreaterThanSignKeyword_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__EmptyElementDefinition__Group__4__Impl2908); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1465:1: rule__EmptyElementDefinition__Group_1__0 : rule__EmptyElementDefinition__Group_1__0__Impl rule__EmptyElementDefinition__Group_1__1 ;
    public final void rule__EmptyElementDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1469:1: ( rule__EmptyElementDefinition__Group_1__0__Impl rule__EmptyElementDefinition__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1470:2: rule__EmptyElementDefinition__Group_1__0__Impl rule__EmptyElementDefinition__Group_1__1
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__0__Impl_in_rule__EmptyElementDefinition__Group_1__02949);
            rule__EmptyElementDefinition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__1_in_rule__EmptyElementDefinition__Group_1__02952);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1477:1: rule__EmptyElementDefinition__Group_1__0__Impl : ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) ) ;
    public final void rule__EmptyElementDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1481:1: ( ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1482:1: ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1482:1: ( ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1483:1: ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNamespaceAssignment_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1484:1: ( rule__EmptyElementDefinition__NamespaceAssignment_1_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1484:2: rule__EmptyElementDefinition__NamespaceAssignment_1_0
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__NamespaceAssignment_1_0_in_rule__EmptyElementDefinition__Group_1__0__Impl2979);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1494:1: rule__EmptyElementDefinition__Group_1__1 : rule__EmptyElementDefinition__Group_1__1__Impl ;
    public final void rule__EmptyElementDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1498:1: ( rule__EmptyElementDefinition__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1499:2: rule__EmptyElementDefinition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EmptyElementDefinition__Group_1__1__Impl_in_rule__EmptyElementDefinition__Group_1__13009);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1505:1: rule__EmptyElementDefinition__Group_1__1__Impl : ( ':' ) ;
    public final void rule__EmptyElementDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1509:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1510:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1510:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1511:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getColonKeyword_1_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__EmptyElementDefinition__Group_1__1__Impl3037); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1528:1: rule__AttributePropertyDefinition__Group__0 : rule__AttributePropertyDefinition__Group__0__Impl rule__AttributePropertyDefinition__Group__1 ;
    public final void rule__AttributePropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1532:1: ( rule__AttributePropertyDefinition__Group__0__Impl rule__AttributePropertyDefinition__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1533:2: rule__AttributePropertyDefinition__Group__0__Impl rule__AttributePropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__0__Impl_in_rule__AttributePropertyDefinition__Group__03072);
            rule__AttributePropertyDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__1_in_rule__AttributePropertyDefinition__Group__03075);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1540:1: rule__AttributePropertyDefinition__Group__0__Impl : ( ( rule__AttributePropertyDefinition__Group_0__0 )? ) ;
    public final void rule__AttributePropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1544:1: ( ( ( rule__AttributePropertyDefinition__Group_0__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1545:1: ( ( rule__AttributePropertyDefinition__Group_0__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1545:1: ( ( rule__AttributePropertyDefinition__Group_0__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1546:1: ( rule__AttributePropertyDefinition__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getGroup_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1547:1: ( rule__AttributePropertyDefinition__Group_0__0 )?
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
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1547:2: rule__AttributePropertyDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__0_in_rule__AttributePropertyDefinition__Group__0__Impl3102);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1557:1: rule__AttributePropertyDefinition__Group__1 : rule__AttributePropertyDefinition__Group__1__Impl rule__AttributePropertyDefinition__Group__2 ;
    public final void rule__AttributePropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1561:1: ( rule__AttributePropertyDefinition__Group__1__Impl rule__AttributePropertyDefinition__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1562:2: rule__AttributePropertyDefinition__Group__1__Impl rule__AttributePropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__1__Impl_in_rule__AttributePropertyDefinition__Group__13133);
            rule__AttributePropertyDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__2_in_rule__AttributePropertyDefinition__Group__13136);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1569:1: rule__AttributePropertyDefinition__Group__1__Impl : ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) ) ;
    public final void rule__AttributePropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1573:1: ( ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1574:1: ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1574:1: ( ( rule__AttributePropertyDefinition__NameAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1575:1: ( rule__AttributePropertyDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNameAssignment_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1576:1: ( rule__AttributePropertyDefinition__NameAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1576:2: rule__AttributePropertyDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__NameAssignment_1_in_rule__AttributePropertyDefinition__Group__1__Impl3163);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1586:1: rule__AttributePropertyDefinition__Group__2 : rule__AttributePropertyDefinition__Group__2__Impl rule__AttributePropertyDefinition__Group__3 ;
    public final void rule__AttributePropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1590:1: ( rule__AttributePropertyDefinition__Group__2__Impl rule__AttributePropertyDefinition__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1591:2: rule__AttributePropertyDefinition__Group__2__Impl rule__AttributePropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__2__Impl_in_rule__AttributePropertyDefinition__Group__23193);
            rule__AttributePropertyDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__3_in_rule__AttributePropertyDefinition__Group__23196);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1598:1: rule__AttributePropertyDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__AttributePropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1602:1: ( ( '=' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1603:1: ( '=' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1603:1: ( '=' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1604:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,11,FOLLOW_11_in_rule__AttributePropertyDefinition__Group__2__Impl3224); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1617:1: rule__AttributePropertyDefinition__Group__3 : rule__AttributePropertyDefinition__Group__3__Impl ;
    public final void rule__AttributePropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1621:1: ( rule__AttributePropertyDefinition__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1622:2: rule__AttributePropertyDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group__3__Impl_in_rule__AttributePropertyDefinition__Group__33255);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1628:1: rule__AttributePropertyDefinition__Group__3__Impl : ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) ) ;
    public final void rule__AttributePropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1632:1: ( ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1633:1: ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1633:1: ( ( rule__AttributePropertyDefinition__ValueAssignment_3 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1634:1: ( rule__AttributePropertyDefinition__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getValueAssignment_3()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1635:1: ( rule__AttributePropertyDefinition__ValueAssignment_3 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1635:2: rule__AttributePropertyDefinition__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__ValueAssignment_3_in_rule__AttributePropertyDefinition__Group__3__Impl3282);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1653:1: rule__AttributePropertyDefinition__Group_0__0 : rule__AttributePropertyDefinition__Group_0__0__Impl rule__AttributePropertyDefinition__Group_0__1 ;
    public final void rule__AttributePropertyDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1657:1: ( rule__AttributePropertyDefinition__Group_0__0__Impl rule__AttributePropertyDefinition__Group_0__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1658:2: rule__AttributePropertyDefinition__Group_0__0__Impl rule__AttributePropertyDefinition__Group_0__1
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__0__Impl_in_rule__AttributePropertyDefinition__Group_0__03320);
            rule__AttributePropertyDefinition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__1_in_rule__AttributePropertyDefinition__Group_0__03323);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1665:1: rule__AttributePropertyDefinition__Group_0__0__Impl : ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) ) ;
    public final void rule__AttributePropertyDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1669:1: ( ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1670:1: ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1670:1: ( ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1671:1: ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNamespaceAssignment_0_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1672:1: ( rule__AttributePropertyDefinition__NamespaceAssignment_0_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1672:2: rule__AttributePropertyDefinition__NamespaceAssignment_0_0
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__NamespaceAssignment_0_0_in_rule__AttributePropertyDefinition__Group_0__0__Impl3350);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1682:1: rule__AttributePropertyDefinition__Group_0__1 : rule__AttributePropertyDefinition__Group_0__1__Impl ;
    public final void rule__AttributePropertyDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1686:1: ( rule__AttributePropertyDefinition__Group_0__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1687:2: rule__AttributePropertyDefinition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributePropertyDefinition__Group_0__1__Impl_in_rule__AttributePropertyDefinition__Group_0__13380);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1693:1: rule__AttributePropertyDefinition__Group_0__1__Impl : ( ':' ) ;
    public final void rule__AttributePropertyDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1697:1: ( ( ':' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1698:1: ( ':' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1698:1: ( ':' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1699:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getColonKeyword_0_1()); 
            }
            match(input,10,FOLLOW_10_in_rule__AttributePropertyDefinition__Group_0__1__Impl3408); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1716:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1720:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1721:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__03443);
            rule__Content__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Content__Group__1_in_rule__Content__Group__03446);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1728:1: rule__Content__Group__0__Impl : ( ( rule__Content__Alternatives_0 ) ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1732:1: ( ( ( rule__Content__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1733:1: ( ( rule__Content__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1733:1: ( ( rule__Content__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1734:1: ( rule__Content__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getAlternatives_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1735:1: ( rule__Content__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1735:2: rule__Content__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Content__Alternatives_0_in_rule__Content__Group__0__Impl3473);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1745:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1749:1: ( rule__Content__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1750:2: rule__Content__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__13503);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1756:1: rule__Content__Group__1__Impl : ( ( rule__Content__Alternatives_1 )* ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1760:1: ( ( ( rule__Content__Alternatives_1 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1761:1: ( ( rule__Content__Alternatives_1 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1761:1: ( ( rule__Content__Alternatives_1 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1762:1: ( rule__Content__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContentAccess().getAlternatives_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1763:1: ( rule__Content__Alternatives_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_WS)||(LA14_0>=9 && LA14_0<=11)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1763:2: rule__Content__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Content__Alternatives_1_in_rule__Content__Group__1__Impl3530);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1777:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1781:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1782:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03565);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03568);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1789:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1793:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1794:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1794:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1795:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3595); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1806:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1810:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1811:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13624);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1817:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1821:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1822:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1822:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1823:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1824:1: ( rule__QualifiedName__Group_1__0 )*
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
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1824:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3651);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1838:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1842:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1843:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03686);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03689);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1850:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1854:1: ( ( ( '.' ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1855:1: ( ( '.' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1855:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1856:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1857:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1858:2: '.'
            {
            match(input,9,FOLLOW_9_in_rule__QualifiedName__Group_1__0__Impl3718); if (state.failed) return ;

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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1869:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1873:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1874:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13750);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1880:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1884:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1885:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1885:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1886:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3777); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1901:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1905:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1906:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__03810);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__03813);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1913:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ( rule__QualifiedNameWithWildCard__ValueAssignment_0 ) ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1917:1: ( ( ( rule__QualifiedNameWithWildCard__ValueAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1918:1: ( ( rule__QualifiedNameWithWildCard__ValueAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1918:1: ( ( rule__QualifiedNameWithWildCard__ValueAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1919:1: ( rule__QualifiedNameWithWildCard__ValueAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getValueAssignment_0()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1920:1: ( rule__QualifiedNameWithWildCard__ValueAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1920:2: rule__QualifiedNameWithWildCard__ValueAssignment_0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__ValueAssignment_0_in_rule__QualifiedNameWithWildCard__Group__0__Impl3840);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1930:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1934:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1935:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__13870);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1941:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1945:1: ( ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1946:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1946:1: ( ( rule__QualifiedNameWithWildCard__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1947:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1()); 
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1948:1: ( rule__QualifiedNameWithWildCard__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==9) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1948:2: rule__QualifiedNameWithWildCard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl3897);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1962:1: rule__QualifiedNameWithWildCard__Group_1__0 : rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1966:1: ( rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1967:2: rule__QualifiedNameWithWildCard__Group_1__0__Impl rule__QualifiedNameWithWildCard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__03932);
            rule__QualifiedNameWithWildCard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__03935);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1974:1: rule__QualifiedNameWithWildCard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1978:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1979:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1979:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1980:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,9,FOLLOW_9_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl3963); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1993:1: rule__QualifiedNameWithWildCard__Group_1__1 : rule__QualifiedNameWithWildCard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1997:1: ( rule__QualifiedNameWithWildCard__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:1998:2: rule__QualifiedNameWithWildCard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__13994);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2004:1: rule__QualifiedNameWithWildCard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildCard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2008:1: ( ( '*' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2009:1: ( '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2009:1: ( '*' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2010:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl4022); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2028:1: rule__FXML__XmlDecAssignment_0 : ( ruleXMLDec ) ;
    public final void rule__FXML__XmlDecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2032:1: ( ( ruleXMLDec ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2033:1: ( ruleXMLDec )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2033:1: ( ruleXMLDec )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2034:1: ruleXMLDec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getXmlDecXMLDecParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleXMLDec_in_rule__FXML__XmlDecAssignment_04062);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2043:1: rule__FXML__ProcessingInstructionsAssignment_1 : ( ruleProcessingInstruction ) ;
    public final void rule__FXML__ProcessingInstructionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2047:1: ( ( ruleProcessingInstruction ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2048:1: ( ruleProcessingInstruction )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2048:1: ( ruleProcessingInstruction )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2049:1: ruleProcessingInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getProcessingInstructionsProcessingInstructionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleProcessingInstruction_in_rule__FXML__ProcessingInstructionsAssignment_14093);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2058:1: rule__FXML__RootElementAssignment_2 : ( ruleElementDefinition ) ;
    public final void rule__FXML__RootElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2062:1: ( ( ruleElementDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2063:1: ( ruleElementDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2063:1: ( ruleElementDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2064:1: ruleElementDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFXMLAccess().getRootElementElementDefinitionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_rule__FXML__RootElementAssignment_24124);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2073:1: rule__XMLDec__PropsAssignment_1 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__XMLDec__PropsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2077:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2078:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2078:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2079:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLDecAccess().getPropsAttributePropertyDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__XMLDec__PropsAssignment_14155);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2088:1: rule__ProcessingInstruction__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProcessingInstruction__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2092:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2093:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2093:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2094:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getTypeIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessingInstruction__TypeAssignment_14186); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2103:1: rule__ProcessingInstruction__ImportedNamespaceAssignment_2 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__ProcessingInstruction__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2107:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2108:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2108:1: ( ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2109:1: ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessingInstructionAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__ProcessingInstruction__ImportedNamespaceAssignment_24217);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2118:1: rule__ContainerElementDefinition__NamespaceAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__ContainerElementDefinition__NamespaceAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2122:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2123:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2123:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2124:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__NamespaceAssignment_1_04248); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2133:1: rule__ContainerElementDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__ContainerElementDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2137:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2138:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2138:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2139:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__NameAssignment_24279);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2148:1: rule__ContainerElementDefinition__PropertiesAssignment_3 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__ContainerElementDefinition__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2152:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2153:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2153:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2154:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAttributePropertyDefinitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__ContainerElementDefinition__PropertiesAssignment_34310);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2163:1: rule__ContainerElementDefinition__ContentAssignment_5 : ( rulePCData ) ;
    public final void rule__ContainerElementDefinition__ContentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2167:1: ( ( rulePCData ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2168:1: ( rulePCData )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2168:1: ( rulePCData )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2169:1: rulePCData
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getContentPCDataParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_rulePCData_in_rule__ContainerElementDefinition__ContentAssignment_54341);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2178:1: rule__ContainerElementDefinition__ChildrenAssignment_6 : ( ruleElementDefinition ) ;
    public final void rule__ContainerElementDefinition__ChildrenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2182:1: ( ( ruleElementDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2183:1: ( ruleElementDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2183:1: ( ruleElementDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2184:1: ruleElementDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getChildrenElementDefinitionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_rule__ContainerElementDefinition__ChildrenAssignment_64372);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2193:1: rule__ContainerElementDefinition__EndnamespaceAssignment_8_0 : ( RULE_ID ) ;
    public final void rule__ContainerElementDefinition__EndnamespaceAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2197:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2198:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2198:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2199:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceIDTerminalRuleCall_8_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__EndnamespaceAssignment_8_04403); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2208:1: rule__ContainerElementDefinition__EndnameAssignment_9 : ( ruleQualifiedName ) ;
    public final void rule__ContainerElementDefinition__EndnameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2212:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2213:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2213:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2214:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerElementDefinitionAccess().getEndnameQualifiedNameParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__EndnameAssignment_94434);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2223:1: rule__EmptyElementDefinition__NamespaceAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__EmptyElementDefinition__NamespaceAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2227:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2228:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2228:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2229:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EmptyElementDefinition__NamespaceAssignment_1_04465); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2238:1: rule__EmptyElementDefinition__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__EmptyElementDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2242:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2243:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2243:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2244:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EmptyElementDefinition__NameAssignment_24496);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2253:1: rule__EmptyElementDefinition__PropsAssignment_3 : ( ruleAttributePropertyDefinition ) ;
    public final void rule__EmptyElementDefinition__PropsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2257:1: ( ( ruleAttributePropertyDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2258:1: ( ruleAttributePropertyDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2258:1: ( ruleAttributePropertyDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2259:1: ruleAttributePropertyDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyElementDefinitionAccess().getPropsAttributePropertyDefinitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_rule__EmptyElementDefinition__PropsAssignment_34527);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2268:1: rule__PCData__ContentAssignment : ( ruleContent ) ;
    public final void rule__PCData__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2272:1: ( ( ruleContent ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2273:1: ( ruleContent )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2273:1: ( ruleContent )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2274:1: ruleContent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPCDataAccess().getContentContentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleContent_in_rule__PCData__ContentAssignment4558);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2283:1: rule__AttributePropertyDefinition__NamespaceAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__AttributePropertyDefinition__NamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2287:1: ( ( RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2288:1: ( RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2288:1: ( RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2289:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNamespaceIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributePropertyDefinition__NamespaceAssignment_0_04589); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2298:1: rule__AttributePropertyDefinition__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AttributePropertyDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2302:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2303:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2303:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2304:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AttributePropertyDefinition__NameAssignment_14620);
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2313:1: rule__AttributePropertyDefinition__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AttributePropertyDefinition__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2317:1: ( ( RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2318:1: ( RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2318:1: ( RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2319:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePropertyDefinitionAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttributePropertyDefinition__ValueAssignment_34651); if (state.failed) return ;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2328:1: rule__QualifiedNameWithWildCard__ValueAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2332:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2333:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2333:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx.ui/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/ui/contentassist/antlr/internal/InternalFXMLDsl.g:2334:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildCardAccess().getValueQualifiedNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__ValueAssignment_04682);
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
        "\1\17\4\4\1\11\2\uffff\3\4\1\5\1\4\1\11\1\4\1\11";
    static final String DFA1_maxS =
        "\1\17\1\4\1\22\2\4\1\13\2\uffff\2\22\1\4\1\5\1\4\1\13\1\22\1\13";
    static final String DFA1_acceptS =
        "\6\uffff\1\2\1\1\10\uffff";
    static final String DFA1_specialS =
        "\20\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\2",
            "\1\5\4\uffff\1\4\1\3\5\uffff\1\7\1\uffff\1\6",
            "\1\10",
            "\1\11",
            "\1\12\1\14\1\13",
            "",
            "",
            "\1\5\4\uffff\1\4\6\uffff\1\7\1\uffff\1\6",
            "\1\5\4\uffff\1\4\6\uffff\1\7\1\uffff\1\6",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\12\1\uffff\1\13",
            "\1\5\13\uffff\1\7\1\uffff\1\6",
            "\1\12\1\uffff\1\13"
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
    public static final BitSet FOLLOW_11_in_rule__Content__Alternatives_0886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Content__Alternatives_1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Content__Alternatives_1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__Content__Alternatives_1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Content__Alternatives_1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Content__Alternatives_1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Content__Alternatives_11009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Content__Alternatives_11029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__Group__0__Impl_in_rule__FXML__Group__01061 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__FXML__Group__1_in_rule__FXML__Group__01064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__XmlDecAssignment_0_in_rule__FXML__Group__0__Impl1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__Group__1__Impl_in_rule__FXML__Group__11121 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__FXML__Group__2_in_rule__FXML__Group__11124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__ProcessingInstructionsAssignment_1_in_rule__FXML__Group__1__Impl1151 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__FXML__Group__2__Impl_in_rule__FXML__Group__21182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FXML__RootElementAssignment_2_in_rule__FXML__Group__2__Impl1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__0__Impl_in_rule__XMLDec__Group__01245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__1_in_rule__XMLDec__Group__01248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__XMLDec__Group__0__Impl1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__1__Impl_in_rule__XMLDec__Group__11307 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__2_in_rule__XMLDec__Group__11310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1339 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XMLDec__PropsAssignment_1_in_rule__XMLDec__Group__1__Impl1351 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__XMLDec__Group__2__Impl_in_rule__XMLDec__Group__21384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__XMLDec__Group__2__Impl1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__0__Impl_in_rule__ProcessingInstruction__Group__01449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__1_in_rule__ProcessingInstruction__Group__01452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ProcessingInstruction__Group__0__Impl1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__1__Impl_in_rule__ProcessingInstruction__Group__11511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__2_in_rule__ProcessingInstruction__Group__11514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__TypeAssignment_1_in_rule__ProcessingInstruction__Group__1__Impl1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__2__Impl_in_rule__ProcessingInstruction__Group__21571 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__3_in_rule__ProcessingInstruction__Group__21574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__ImportedNamespaceAssignment_2_in_rule__ProcessingInstruction__Group__2__Impl1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessingInstruction__Group__3__Impl_in_rule__ProcessingInstruction__Group__31631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ProcessingInstruction__Group__3__Impl1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__0__Impl_in_rule__ContainerElementDefinition__Group__01698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__1_in_rule__ContainerElementDefinition__Group__01701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ContainerElementDefinition__Group__0__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__1__Impl_in_rule__ContainerElementDefinition__Group__11760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__2_in_rule__ContainerElementDefinition__Group__11763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__0_in_rule__ContainerElementDefinition__Group__1__Impl1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__2__Impl_in_rule__ContainerElementDefinition__Group__21821 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__3_in_rule__ContainerElementDefinition__Group__21824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__NameAssignment_2_in_rule__ContainerElementDefinition__Group__2__Impl1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__3__Impl_in_rule__ContainerElementDefinition__Group__31881 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__4_in_rule__ContainerElementDefinition__Group__31884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__PropertiesAssignment_3_in_rule__ContainerElementDefinition__Group__3__Impl1911 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__4__Impl_in_rule__ContainerElementDefinition__Group__41942 = new BitSet(new long[]{0x000000000002CE70L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__5_in_rule__ContainerElementDefinition__Group__41945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ContainerElementDefinition__Group__4__Impl1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__5__Impl_in_rule__ContainerElementDefinition__Group__52004 = new BitSet(new long[]{0x000000000002CE70L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__6_in_rule__ContainerElementDefinition__Group__52007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__ContentAssignment_5_in_rule__ContainerElementDefinition__Group__5__Impl2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__6__Impl_in_rule__ContainerElementDefinition__Group__62065 = new BitSet(new long[]{0x000000000002CE70L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__7_in_rule__ContainerElementDefinition__Group__62068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__ChildrenAssignment_6_in_rule__ContainerElementDefinition__Group__6__Impl2095 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__7__Impl_in_rule__ContainerElementDefinition__Group__72126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__8_in_rule__ContainerElementDefinition__Group__72129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ContainerElementDefinition__Group__7__Impl2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__8__Impl_in_rule__ContainerElementDefinition__Group__82188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__9_in_rule__ContainerElementDefinition__Group__82191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_8__0_in_rule__ContainerElementDefinition__Group__8__Impl2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__9__Impl_in_rule__ContainerElementDefinition__Group__92249 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__10_in_rule__ContainerElementDefinition__Group__92252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__EndnameAssignment_9_in_rule__ContainerElementDefinition__Group__9__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group__10__Impl_in_rule__ContainerElementDefinition__Group__102309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ContainerElementDefinition__Group__10__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__0__Impl_in_rule__ContainerElementDefinition__Group_1__02390 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__1_in_rule__ContainerElementDefinition__Group_1__02393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__NamespaceAssignment_1_0_in_rule__ContainerElementDefinition__Group_1__0__Impl2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_1__1__Impl_in_rule__ContainerElementDefinition__Group_1__12450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__ContainerElementDefinition__Group_1__1__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_8__0__Impl_in_rule__ContainerElementDefinition__Group_8__02513 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_8__1_in_rule__ContainerElementDefinition__Group_8__02516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__EndnamespaceAssignment_8_0_in_rule__ContainerElementDefinition__Group_8__0__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerElementDefinition__Group_8__1__Impl_in_rule__ContainerElementDefinition__Group_8__12573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__ContainerElementDefinition__Group_8__1__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__0__Impl_in_rule__EmptyElementDefinition__Group__02636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__1_in_rule__EmptyElementDefinition__Group__02639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EmptyElementDefinition__Group__0__Impl2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__1__Impl_in_rule__EmptyElementDefinition__Group__12698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__2_in_rule__EmptyElementDefinition__Group__12701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__0_in_rule__EmptyElementDefinition__Group__1__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__2__Impl_in_rule__EmptyElementDefinition__Group__22759 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__3_in_rule__EmptyElementDefinition__Group__22762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__NameAssignment_2_in_rule__EmptyElementDefinition__Group__2__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__3__Impl_in_rule__EmptyElementDefinition__Group__32819 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__4_in_rule__EmptyElementDefinition__Group__32822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__PropsAssignment_3_in_rule__EmptyElementDefinition__Group__3__Impl2849 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group__4__Impl_in_rule__EmptyElementDefinition__Group__42880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EmptyElementDefinition__Group__4__Impl2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__0__Impl_in_rule__EmptyElementDefinition__Group_1__02949 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__1_in_rule__EmptyElementDefinition__Group_1__02952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__NamespaceAssignment_1_0_in_rule__EmptyElementDefinition__Group_1__0__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElementDefinition__Group_1__1__Impl_in_rule__EmptyElementDefinition__Group_1__13009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__EmptyElementDefinition__Group_1__1__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__0__Impl_in_rule__AttributePropertyDefinition__Group__03072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__1_in_rule__AttributePropertyDefinition__Group__03075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__0_in_rule__AttributePropertyDefinition__Group__0__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__1__Impl_in_rule__AttributePropertyDefinition__Group__13133 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__2_in_rule__AttributePropertyDefinition__Group__13136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__NameAssignment_1_in_rule__AttributePropertyDefinition__Group__1__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__2__Impl_in_rule__AttributePropertyDefinition__Group__23193 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__3_in_rule__AttributePropertyDefinition__Group__23196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AttributePropertyDefinition__Group__2__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group__3__Impl_in_rule__AttributePropertyDefinition__Group__33255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__ValueAssignment_3_in_rule__AttributePropertyDefinition__Group__3__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__0__Impl_in_rule__AttributePropertyDefinition__Group_0__03320 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__1_in_rule__AttributePropertyDefinition__Group_0__03323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__NamespaceAssignment_0_0_in_rule__AttributePropertyDefinition__Group_0__0__Impl3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributePropertyDefinition__Group_0__1__Impl_in_rule__AttributePropertyDefinition__Group_0__13380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__AttributePropertyDefinition__Group_0__1__Impl3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__03443 = new BitSet(new long[]{0x0000000000000EF0L});
    public static final BitSet FOLLOW_rule__Content__Group__1_in_rule__Content__Group__03446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Alternatives_0_in_rule__Content__Group__0__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__13503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Alternatives_1_in_rule__Content__Group__1__Impl3530 = new BitSet(new long[]{0x0000000000000EF2L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03565 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3651 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__QualifiedName__Group_1__0__Impl3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__03810 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__03813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__ValueAssignment_0_in_rule__QualifiedNameWithWildCard__Group__0__Impl3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__13870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0_in_rule__QualifiedNameWithWildCard__Group__1__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__0__Impl_in_rule__QualifiedNameWithWildCard__Group_1__03932 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1_in_rule__QualifiedNameWithWildCard__Group_1__03935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__QualifiedNameWithWildCard__Group_1__0__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group_1__1__Impl_in_rule__QualifiedNameWithWildCard__Group_1__13994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedNameWithWildCard__Group_1__1__Impl4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDec_in_rule__FXML__XmlDecAssignment_04062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingInstruction_in_rule__FXML__ProcessingInstructionsAssignment_14093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_rule__FXML__RootElementAssignment_24124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__XMLDec__PropsAssignment_14155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessingInstruction__TypeAssignment_14186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__ProcessingInstruction__ImportedNamespaceAssignment_24217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__NamespaceAssignment_1_04248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__NameAssignment_24279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__ContainerElementDefinition__PropertiesAssignment_34310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePCData_in_rule__ContainerElementDefinition__ContentAssignment_54341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_rule__ContainerElementDefinition__ChildrenAssignment_64372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerElementDefinition__EndnamespaceAssignment_8_04403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ContainerElementDefinition__EndnameAssignment_94434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EmptyElementDefinition__NamespaceAssignment_1_04465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EmptyElementDefinition__NameAssignment_24496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_rule__EmptyElementDefinition__PropsAssignment_34527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rule__PCData__ContentAssignment4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributePropertyDefinition__NamespaceAssignment_0_04589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AttributePropertyDefinition__NameAssignment_14620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributePropertyDefinition__ValueAssignment_34651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__ValueAssignment_04682 = new BitSet(new long[]{0x0000000000000002L});

}