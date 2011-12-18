package at.bestsolution.efxclipse.tooling.fxmlx.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.efxclipse.tooling.fxmlx.services.FXMLDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFXMLDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANY_OTHER", "RULE_WS", "RULE_ML_COMMENT", "'<?xml'", "'?>'", "'<?'", "'<'", "':'", "'>'", "'</'", "'/>'", "'='", "'.'", "'*'"
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
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g"; }



     	private FXMLDslGrammarAccess grammarAccess;
     	
        public InternalFXMLDslParser(TokenStream input, FXMLDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "FXML";	
       	}
       	
       	@Override
       	protected FXMLDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFXML"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:67:1: entryRuleFXML returns [EObject current=null] : iv_ruleFXML= ruleFXML EOF ;
    public final EObject entryRuleFXML() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFXML = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:68:2: (iv_ruleFXML= ruleFXML EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:69:2: iv_ruleFXML= ruleFXML EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFXMLRule()); 
            }
            pushFollow(FOLLOW_ruleFXML_in_entryRuleFXML75);
            iv_ruleFXML=ruleFXML();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFXML; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFXML85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFXML"


    // $ANTLR start "ruleFXML"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:76:1: ruleFXML returns [EObject current=null] : ( ( (lv_xmlDec_0_0= ruleXMLDec ) ) ( (lv_processingInstructions_1_0= ruleProcessingInstruction ) )* ( (lv_rootElement_2_0= ruleElementDefinition ) ) ) ;
    public final EObject ruleFXML() throws RecognitionException {
        EObject current = null;

        EObject lv_xmlDec_0_0 = null;

        EObject lv_processingInstructions_1_0 = null;

        EObject lv_rootElement_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:79:28: ( ( ( (lv_xmlDec_0_0= ruleXMLDec ) ) ( (lv_processingInstructions_1_0= ruleProcessingInstruction ) )* ( (lv_rootElement_2_0= ruleElementDefinition ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:80:1: ( ( (lv_xmlDec_0_0= ruleXMLDec ) ) ( (lv_processingInstructions_1_0= ruleProcessingInstruction ) )* ( (lv_rootElement_2_0= ruleElementDefinition ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:80:1: ( ( (lv_xmlDec_0_0= ruleXMLDec ) ) ( (lv_processingInstructions_1_0= ruleProcessingInstruction ) )* ( (lv_rootElement_2_0= ruleElementDefinition ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:80:2: ( (lv_xmlDec_0_0= ruleXMLDec ) ) ( (lv_processingInstructions_1_0= ruleProcessingInstruction ) )* ( (lv_rootElement_2_0= ruleElementDefinition ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:80:2: ( (lv_xmlDec_0_0= ruleXMLDec ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:81:1: (lv_xmlDec_0_0= ruleXMLDec )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:81:1: (lv_xmlDec_0_0= ruleXMLDec )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:82:3: lv_xmlDec_0_0= ruleXMLDec
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFXMLAccess().getXmlDecXMLDecParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXMLDec_in_ruleFXML131);
            lv_xmlDec_0_0=ruleXMLDec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFXMLRule());
              	        }
                     		set(
                     			current, 
                     			"xmlDec",
                      		lv_xmlDec_0_0, 
                      		"XMLDec");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:98:2: ( (lv_processingInstructions_1_0= ruleProcessingInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:99:1: (lv_processingInstructions_1_0= ruleProcessingInstruction )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:99:1: (lv_processingInstructions_1_0= ruleProcessingInstruction )
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:100:3: lv_processingInstructions_1_0= ruleProcessingInstruction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFXMLAccess().getProcessingInstructionsProcessingInstructionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProcessingInstruction_in_ruleFXML152);
            	    lv_processingInstructions_1_0=ruleProcessingInstruction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFXMLRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"processingInstructions",
            	              		lv_processingInstructions_1_0, 
            	              		"ProcessingInstruction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:116:3: ( (lv_rootElement_2_0= ruleElementDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:117:1: (lv_rootElement_2_0= ruleElementDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:117:1: (lv_rootElement_2_0= ruleElementDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:118:3: lv_rootElement_2_0= ruleElementDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFXMLAccess().getRootElementElementDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_ruleFXML174);
            lv_rootElement_2_0=ruleElementDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFXMLRule());
              	        }
                     		set(
                     			current, 
                     			"rootElement",
                      		lv_rootElement_2_0, 
                      		"ElementDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFXML"


    // $ANTLR start "entryRuleXMLDec"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:142:1: entryRuleXMLDec returns [EObject current=null] : iv_ruleXMLDec= ruleXMLDec EOF ;
    public final EObject entryRuleXMLDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMLDec = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:143:2: (iv_ruleXMLDec= ruleXMLDec EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:144:2: iv_ruleXMLDec= ruleXMLDec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMLDecRule()); 
            }
            pushFollow(FOLLOW_ruleXMLDec_in_entryRuleXMLDec210);
            iv_ruleXMLDec=ruleXMLDec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMLDec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLDec220); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMLDec"


    // $ANTLR start "ruleXMLDec"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:151:1: ruleXMLDec returns [EObject current=null] : (otherlv_0= '<?xml' ( (lv_props_1_0= ruleAttributePropertyDefinition ) )+ otherlv_2= '?>' ) ;
    public final EObject ruleXMLDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_props_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:154:28: ( (otherlv_0= '<?xml' ( (lv_props_1_0= ruleAttributePropertyDefinition ) )+ otherlv_2= '?>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:155:1: (otherlv_0= '<?xml' ( (lv_props_1_0= ruleAttributePropertyDefinition ) )+ otherlv_2= '?>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:155:1: (otherlv_0= '<?xml' ( (lv_props_1_0= ruleAttributePropertyDefinition ) )+ otherlv_2= '?>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:155:3: otherlv_0= '<?xml' ( (lv_props_1_0= ruleAttributePropertyDefinition ) )+ otherlv_2= '?>'
            {
            otherlv_0=(Token)match(input,9,FOLLOW_9_in_ruleXMLDec257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXMLDecAccess().getXmlKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:159:1: ( (lv_props_1_0= ruleAttributePropertyDefinition ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:160:1: (lv_props_1_0= ruleAttributePropertyDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:160:1: (lv_props_1_0= ruleAttributePropertyDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:161:3: lv_props_1_0= ruleAttributePropertyDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMLDecAccess().getPropsAttributePropertyDefinitionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_ruleXMLDec278);
            	    lv_props_1_0=ruleAttributePropertyDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMLDecRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"props",
            	              		lv_props_1_0, 
            	              		"AttributePropertyDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_2=(Token)match(input,10,FOLLOW_10_in_ruleXMLDec291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXMLDecAccess().getQuestionMarkGreaterThanSignKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMLDec"


    // $ANTLR start "entryRuleProcessingInstruction"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:189:1: entryRuleProcessingInstruction returns [EObject current=null] : iv_ruleProcessingInstruction= ruleProcessingInstruction EOF ;
    public final EObject entryRuleProcessingInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessingInstruction = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:190:2: (iv_ruleProcessingInstruction= ruleProcessingInstruction EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:191:2: iv_ruleProcessingInstruction= ruleProcessingInstruction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessingInstructionRule()); 
            }
            pushFollow(FOLLOW_ruleProcessingInstruction_in_entryRuleProcessingInstruction327);
            iv_ruleProcessingInstruction=ruleProcessingInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcessingInstruction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessingInstruction337); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessingInstruction"


    // $ANTLR start "ruleProcessingInstruction"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:198:1: ruleProcessingInstruction returns [EObject current=null] : (otherlv_0= '<?' ( (lv_type_1_0= RULE_ID ) ) ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) otherlv_3= '?>' ) ;
    public final EObject ruleProcessingInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:201:28: ( (otherlv_0= '<?' ( (lv_type_1_0= RULE_ID ) ) ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) otherlv_3= '?>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:202:1: (otherlv_0= '<?' ( (lv_type_1_0= RULE_ID ) ) ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) otherlv_3= '?>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:202:1: (otherlv_0= '<?' ( (lv_type_1_0= RULE_ID ) ) ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) otherlv_3= '?>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:202:3: otherlv_0= '<?' ( (lv_type_1_0= RULE_ID ) ) ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) ) otherlv_3= '?>'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProcessingInstruction374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProcessingInstructionAccess().getLessThanSignQuestionMarkKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:206:1: ( (lv_type_1_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:207:1: (lv_type_1_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:207:1: (lv_type_1_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:208:3: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessingInstruction391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_type_1_0, grammarAccess.getProcessingInstructionAccess().getTypeIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProcessingInstructionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:224:2: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:225:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:225:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:226:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProcessingInstructionAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleProcessingInstruction417);
            lv_importedNamespace_2_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProcessingInstructionRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_2_0, 
                      		"QualifiedNameWithWildCard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,10,FOLLOW_10_in_ruleProcessingInstruction429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProcessingInstructionAccess().getQuestionMarkGreaterThanSignKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessingInstruction"


    // $ANTLR start "entryRuleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:254:1: entryRuleElementDefinition returns [EObject current=null] : iv_ruleElementDefinition= ruleElementDefinition EOF ;
    public final EObject entryRuleElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:255:2: (iv_ruleElementDefinition= ruleElementDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:256:2: iv_ruleElementDefinition= ruleElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition465);
            iv_ruleElementDefinition=ruleElementDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDefinition475); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementDefinition"


    // $ANTLR start "ruleElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:263:1: ruleElementDefinition returns [EObject current=null] : (this_ContainerElementDefinition_0= ruleContainerElementDefinition | this_EmptyElementDefinition_1= ruleEmptyElementDefinition ) ;
    public final EObject ruleElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerElementDefinition_0 = null;

        EObject this_EmptyElementDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:266:28: ( (this_ContainerElementDefinition_0= ruleContainerElementDefinition | this_EmptyElementDefinition_1= ruleEmptyElementDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:267:1: (this_ContainerElementDefinition_0= ruleContainerElementDefinition | this_EmptyElementDefinition_1= ruleEmptyElementDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:267:1: (this_ContainerElementDefinition_0= ruleContainerElementDefinition | this_EmptyElementDefinition_1= ruleEmptyElementDefinition )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:268:5: this_ContainerElementDefinition_0= ruleContainerElementDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementDefinitionAccess().getContainerElementDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContainerElementDefinition_in_ruleElementDefinition522);
                    this_ContainerElementDefinition_0=ruleContainerElementDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ContainerElementDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:278:5: this_EmptyElementDefinition_1= ruleEmptyElementDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementDefinitionAccess().getEmptyElementDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmptyElementDefinition_in_ruleElementDefinition549);
                    this_EmptyElementDefinition_1=ruleEmptyElementDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EmptyElementDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementDefinition"


    // $ANTLR start "entryRuleContainerElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:294:1: entryRuleContainerElementDefinition returns [EObject current=null] : iv_ruleContainerElementDefinition= ruleContainerElementDefinition EOF ;
    public final EObject entryRuleContainerElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerElementDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:295:2: (iv_ruleContainerElementDefinition= ruleContainerElementDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:296:2: iv_ruleContainerElementDefinition= ruleContainerElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleContainerElementDefinition_in_entryRuleContainerElementDefinition584);
            iv_ruleContainerElementDefinition=ruleContainerElementDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerElementDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerElementDefinition594); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerElementDefinition"


    // $ANTLR start "ruleContainerElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:303:1: ruleContainerElementDefinition returns [EObject current=null] : (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '>' ( (lv_content_6_0= rulePCData ) )? ( (lv_children_7_0= ruleElementDefinition ) )* otherlv_8= '</' ( ( (lv_endnamespace_9_0= RULE_ID ) ) otherlv_10= ':' )? ( (lv_endname_11_0= ruleQualifiedName ) ) otherlv_12= '>' ) ;
    public final EObject ruleContainerElementDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_namespace_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token lv_endnamespace_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_properties_4_0 = null;

        EObject lv_content_6_0 = null;

        EObject lv_children_7_0 = null;

        AntlrDatatypeRuleToken lv_endname_11_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:306:28: ( (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '>' ( (lv_content_6_0= rulePCData ) )? ( (lv_children_7_0= ruleElementDefinition ) )* otherlv_8= '</' ( ( (lv_endnamespace_9_0= RULE_ID ) ) otherlv_10= ':' )? ( (lv_endname_11_0= ruleQualifiedName ) ) otherlv_12= '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:307:1: (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '>' ( (lv_content_6_0= rulePCData ) )? ( (lv_children_7_0= ruleElementDefinition ) )* otherlv_8= '</' ( ( (lv_endnamespace_9_0= RULE_ID ) ) otherlv_10= ':' )? ( (lv_endname_11_0= ruleQualifiedName ) ) otherlv_12= '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:307:1: (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '>' ( (lv_content_6_0= rulePCData ) )? ( (lv_children_7_0= ruleElementDefinition ) )* otherlv_8= '</' ( ( (lv_endnamespace_9_0= RULE_ID ) ) otherlv_10= ':' )? ( (lv_endname_11_0= ruleQualifiedName ) ) otherlv_12= '>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:307:3: otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '>' ( (lv_content_6_0= rulePCData ) )? ( (lv_children_7_0= ruleElementDefinition ) )* otherlv_8= '</' ( ( (lv_endnamespace_9_0= RULE_ID ) ) otherlv_10= ':' )? ( (lv_endname_11_0= ruleQualifiedName ) ) otherlv_12= '>'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleContainerElementDefinition631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContainerElementDefinitionAccess().getLessThanSignKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:311:1: ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==13) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:311:2: ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:311:2: ( (lv_namespace_1_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:312:1: (lv_namespace_1_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:312:1: (lv_namespace_1_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:313:3: lv_namespace_1_0= RULE_ID
                    {
                    lv_namespace_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainerElementDefinition649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_namespace_1_0, grammarAccess.getContainerElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainerElementDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"namespace",
                              		lv_namespace_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleContainerElementDefinition666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:333:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:334:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:334:1: (lv_name_3_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:335:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContainerElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContainerElementDefinition689);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContainerElementDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:351:2: ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:352:1: (lv_properties_4_0= ruleAttributePropertyDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:352:1: (lv_properties_4_0= ruleAttributePropertyDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:353:3: lv_properties_4_0= ruleAttributePropertyDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAttributePropertyDefinitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_ruleContainerElementDefinition710);
            	    lv_properties_4_0=ruleAttributePropertyDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContainerElementDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_4_0, 
            	              		"AttributePropertyDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleContainerElementDefinition723); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:373:1: ( (lv_content_6_0= rulePCData ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_ANY_OTHER)||LA6_0==13||LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:374:1: (lv_content_6_0= rulePCData )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:374:1: (lv_content_6_0= rulePCData )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:375:3: lv_content_6_0= rulePCData
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerElementDefinitionAccess().getContentPCDataParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePCData_in_ruleContainerElementDefinition744);
                    lv_content_6_0=rulePCData();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerElementDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"content",
                              		lv_content_6_0, 
                              		"PCData");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:391:3: ( (lv_children_7_0= ruleElementDefinition ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:392:1: (lv_children_7_0= ruleElementDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:392:1: (lv_children_7_0= ruleElementDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:393:3: lv_children_7_0= ruleElementDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContainerElementDefinitionAccess().getChildrenElementDefinitionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementDefinition_in_ruleContainerElementDefinition766);
            	    lv_children_7_0=ruleElementDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContainerElementDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"children",
            	              		lv_children_7_0, 
            	              		"ElementDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleContainerElementDefinition779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getContainerElementDefinitionAccess().getLessThanSignSolidusKeyword_7());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:413:1: ( ( (lv_endnamespace_9_0= RULE_ID ) ) otherlv_10= ':' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==13) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:413:2: ( (lv_endnamespace_9_0= RULE_ID ) ) otherlv_10= ':'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:413:2: ( (lv_endnamespace_9_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:414:1: (lv_endnamespace_9_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:414:1: (lv_endnamespace_9_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:415:3: lv_endnamespace_9_0= RULE_ID
                    {
                    lv_endnamespace_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainerElementDefinition797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_endnamespace_9_0, grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceIDTerminalRuleCall_8_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainerElementDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"endnamespace",
                              		lv_endnamespace_9_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleContainerElementDefinition814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_8_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:435:3: ( (lv_endname_11_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:436:1: (lv_endname_11_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:436:1: (lv_endname_11_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:437:3: lv_endname_11_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContainerElementDefinitionAccess().getEndnameQualifiedNameParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContainerElementDefinition837);
            lv_endname_11_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContainerElementDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"endname",
                      		lv_endname_11_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleContainerElementDefinition849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerElementDefinition"


    // $ANTLR start "entryRuleEmptyElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:465:1: entryRuleEmptyElementDefinition returns [EObject current=null] : iv_ruleEmptyElementDefinition= ruleEmptyElementDefinition EOF ;
    public final EObject entryRuleEmptyElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyElementDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:466:2: (iv_ruleEmptyElementDefinition= ruleEmptyElementDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:467:2: iv_ruleEmptyElementDefinition= ruleEmptyElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyElementDefinition_in_entryRuleEmptyElementDefinition885);
            iv_ruleEmptyElementDefinition=ruleEmptyElementDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyElementDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyElementDefinition895); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyElementDefinition"


    // $ANTLR start "ruleEmptyElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:474:1: ruleEmptyElementDefinition returns [EObject current=null] : (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_props_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '/>' ) ;
    public final EObject ruleEmptyElementDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_namespace_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_props_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:477:28: ( (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_props_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '/>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:478:1: (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_props_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '/>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:478:1: (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_props_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '/>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:478:3: otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_props_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '/>'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleEmptyElementDefinition932); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEmptyElementDefinitionAccess().getLessThanSignKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:482:1: ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==13) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:482:2: ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:482:2: ( (lv_namespace_1_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:483:1: (lv_namespace_1_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:483:1: (lv_namespace_1_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:484:3: lv_namespace_1_0= RULE_ID
                    {
                    lv_namespace_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmptyElementDefinition950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_namespace_1_0, grammarAccess.getEmptyElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEmptyElementDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"namespace",
                              		lv_namespace_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEmptyElementDefinition967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmptyElementDefinitionAccess().getColonKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:504:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:505:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:505:1: (lv_name_3_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:506:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmptyElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEmptyElementDefinition990);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEmptyElementDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:522:2: ( (lv_props_4_0= ruleAttributePropertyDefinition ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:523:1: (lv_props_4_0= ruleAttributePropertyDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:523:1: (lv_props_4_0= ruleAttributePropertyDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:524:3: lv_props_4_0= ruleAttributePropertyDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmptyElementDefinitionAccess().getPropsAttributePropertyDefinitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_ruleEmptyElementDefinition1011);
            	    lv_props_4_0=ruleAttributePropertyDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEmptyElementDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"props",
            	              		lv_props_4_0, 
            	              		"AttributePropertyDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleEmptyElementDefinition1024); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEmptyElementDefinitionAccess().getSolidusGreaterThanSignKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyElementDefinition"


    // $ANTLR start "entryRulePCData"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:552:1: entryRulePCData returns [EObject current=null] : iv_rulePCData= rulePCData EOF ;
    public final EObject entryRulePCData() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePCData = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:553:2: (iv_rulePCData= rulePCData EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:554:2: iv_rulePCData= rulePCData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPCDataRule()); 
            }
            pushFollow(FOLLOW_rulePCData_in_entryRulePCData1060);
            iv_rulePCData=rulePCData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePCData; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePCData1070); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePCData"


    // $ANTLR start "rulePCData"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:561:1: rulePCData returns [EObject current=null] : ( (lv_content_0_0= ruleContent ) ) ;
    public final EObject rulePCData() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_content_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:564:28: ( ( (lv_content_0_0= ruleContent ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:565:1: ( (lv_content_0_0= ruleContent ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:565:1: ( (lv_content_0_0= ruleContent ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:566:1: (lv_content_0_0= ruleContent )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:566:1: (lv_content_0_0= ruleContent )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:567:3: lv_content_0_0= ruleContent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPCDataAccess().getContentContentParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleContent_in_rulePCData1115);
            lv_content_0_0=ruleContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPCDataRule());
              	        }
                     		set(
                     			current, 
                     			"content",
                      		lv_content_0_0, 
                      		"Content");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePCData"


    // $ANTLR start "entryRuleAttributePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:591:1: entryRuleAttributePropertyDefinition returns [EObject current=null] : iv_ruleAttributePropertyDefinition= ruleAttributePropertyDefinition EOF ;
    public final EObject entryRuleAttributePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributePropertyDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:592:2: (iv_ruleAttributePropertyDefinition= ruleAttributePropertyDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:593:2: iv_ruleAttributePropertyDefinition= ruleAttributePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributePropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_entryRuleAttributePropertyDefinition1150);
            iv_ruleAttributePropertyDefinition=ruleAttributePropertyDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributePropertyDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributePropertyDefinition1160); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributePropertyDefinition"


    // $ANTLR start "ruleAttributePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:600:1: ruleAttributePropertyDefinition returns [EObject current=null] : ( ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttributePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_namespace_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:603:28: ( ( ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:604:1: ( ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:604:1: ( ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:604:2: ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:604:2: ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==13) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:604:3: ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:604:3: ( (lv_namespace_0_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:605:1: (lv_namespace_0_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:605:1: (lv_namespace_0_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:606:3: lv_namespace_0_0= RULE_ID
                    {
                    lv_namespace_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributePropertyDefinition1203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_namespace_0_0, grammarAccess.getAttributePropertyDefinitionAccess().getNamespaceIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributePropertyDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"namespace",
                              		lv_namespace_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleAttributePropertyDefinition1220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAttributePropertyDefinitionAccess().getColonKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:626:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:627:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:627:1: (lv_name_2_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:628:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributePropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttributePropertyDefinition1243);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributePropertyDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAttributePropertyDefinition1255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAttributePropertyDefinitionAccess().getEqualsSignKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:648:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:649:1: (lv_value_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:649:1: (lv_value_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:650:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttributePropertyDefinition1272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_4_0, grammarAccess.getAttributePropertyDefinitionAccess().getValueSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributePropertyDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributePropertyDefinition"


    // $ANTLR start "entryRuleContent"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:674:1: entryRuleContent returns [String current=null] : iv_ruleContent= ruleContent EOF ;
    public final String entryRuleContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContent = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:678:2: (iv_ruleContent= ruleContent EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:679:2: iv_ruleContent= ruleContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentRule()); 
            }
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent1320);
            iv_ruleContent=ruleContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContent.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent1331); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:689:1: ruleContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '.' | kw= ':' ) (this_ID_5= RULE_ID | this_STRING_6= RULE_STRING | this_ANY_OTHER_7= RULE_ANY_OTHER | this_WS_8= RULE_WS | kw= '.' | kw= ':' )* ) ;
    public final AntlrDatatypeRuleToken ruleContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_ANY_OTHER_2=null;
        Token kw=null;
        Token this_ID_5=null;
        Token this_STRING_6=null;
        Token this_ANY_OTHER_7=null;
        Token this_WS_8=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:693:28: ( ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '.' | kw= ':' ) (this_ID_5= RULE_ID | this_STRING_6= RULE_STRING | this_ANY_OTHER_7= RULE_ANY_OTHER | this_WS_8= RULE_WS | kw= '.' | kw= ':' )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:694:1: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '.' | kw= ':' ) (this_ID_5= RULE_ID | this_STRING_6= RULE_STRING | this_ANY_OTHER_7= RULE_ANY_OTHER | this_WS_8= RULE_WS | kw= '.' | kw= ':' )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:694:1: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '.' | kw= ':' ) (this_ID_5= RULE_ID | this_STRING_6= RULE_STRING | this_ANY_OTHER_7= RULE_ANY_OTHER | this_WS_8= RULE_WS | kw= '.' | kw= ':' )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:694:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '.' | kw= ':' ) (this_ID_5= RULE_ID | this_STRING_6= RULE_STRING | this_ANY_OTHER_7= RULE_ANY_OTHER | this_WS_8= RULE_WS | kw= '.' | kw= ':' )*
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:694:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | kw= '.' | kw= ':' )
            int alt12=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case RULE_STRING:
                {
                alt12=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt12=3;
                }
                break;
            case 18:
                {
                alt12=4;
                }
                break;
            case 13:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:694:7: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContent1376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getContentAccess().getIDTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:702:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContent1402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:710:10: this_ANY_OTHER_2= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleContent1428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ANY_OTHER_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ANY_OTHER_2, grammarAccess.getContentAccess().getANY_OTHERTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:719:2: kw= '.'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleContent1452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getContentAccess().getFullStopKeyword_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:726:2: kw= ':'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleContent1471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getContentAccess().getColonKeyword_0_4()); 
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:731:2: (this_ID_5= RULE_ID | this_STRING_6= RULE_STRING | this_ANY_OTHER_7= RULE_ANY_OTHER | this_WS_8= RULE_WS | kw= '.' | kw= ':' )*
            loop13:
            do {
                int alt13=7;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt13=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt13=2;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt13=3;
                    }
                    break;
                case RULE_WS:
                    {
                    alt13=4;
                    }
                    break;
                case 18:
                    {
                    alt13=5;
                    }
                    break;
                case 13:
                    {
                    alt13=6;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:731:7: this_ID_5= RULE_ID
            	    {
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContent1488); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_5, grammarAccess.getContentAccess().getIDTerminalRuleCall_1_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:739:10: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContent1514); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_STRING_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_STRING_6, grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:747:10: this_ANY_OTHER_7= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_7=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleContent1540); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ANY_OTHER_7);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ANY_OTHER_7, grammarAccess.getContentAccess().getANY_OTHERTerminalRuleCall_1_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:755:10: this_WS_8= RULE_WS
            	    {
            	    this_WS_8=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleContent1566); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_8, grammarAccess.getContentAccess().getWSTerminalRuleCall_1_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:764:2: kw= '.'
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleContent1590); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getContentAccess().getFullStopKeyword_1_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:771:2: kw= ':'
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleContent1609); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getContentAccess().getColonKeyword_1_5()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:787:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:788:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:789:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1656);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1667); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:796:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:799:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:800:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:800:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:800:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:807:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_ID) && (synpred1_InternalFXMLDsl())) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:807:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:807:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:807:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedName1735); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1751); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:830:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:831:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:832:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1799);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1810); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:839:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:842:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:843:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:843:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:844:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1857);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:854:1: (kw= '.' kw= '*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:855:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedNameWithWildCard1876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedNameWithWildCard1889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"

    // $ANTLR start synpred1_InternalFXMLDsl
    public final void synpred1_InternalFXMLDsl_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:807:3: ( '.' )
        // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:808:2: '.'
        {
        match(input,18,FOLLOW_18_in_synpred1_InternalFXMLDsl1726); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalFXMLDsl

    // Delegated rules

    public final boolean synpred1_InternalFXMLDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalFXMLDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\20\uffff";
    static final String DFA3_eofS =
        "\20\uffff";
    static final String DFA3_minS =
        "\1\14\4\4\1\15\2\uffff\4\4\1\5\2\21\1\4";
    static final String DFA3_maxS =
        "\1\14\1\4\1\22\2\4\1\22\2\uffff\2\22\2\4\1\5\2\22\1\20";
    static final String DFA3_acceptS =
        "\6\uffff\1\2\1\1\10\uffff";
    static final String DFA3_specialS =
        "\20\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2",
            "\1\5\10\uffff\1\3\1\7\1\uffff\1\6\1\uffff\1\4",
            "\1\10",
            "\1\11",
            "\1\12\3\uffff\1\14\1\13",
            "",
            "",
            "\1\5\11\uffff\1\7\1\uffff\1\6\1\uffff\1\4",
            "\1\5\11\uffff\1\7\1\uffff\1\6\1\uffff\1\4",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\14\1\13",
            "\1\14\1\13",
            "\1\5\11\uffff\1\7\1\uffff\1\6"
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
            return "267:1: (this_ContainerElementDefinition_0= ruleContainerElementDefinition | this_EmptyElementDefinition_1= ruleEmptyElementDefinition )";
        }
    }
 

    public static final BitSet FOLLOW_ruleFXML_in_entryRuleFXML75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFXML85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDec_in_ruleFXML131 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_ruleProcessingInstruction_in_ruleFXML152 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_ruleFXML174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDec_in_entryRuleXMLDec210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLDec220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleXMLDec257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_ruleXMLDec278 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_10_in_ruleXMLDec291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingInstruction_in_entryRuleProcessingInstruction327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessingInstruction337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProcessingInstruction374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessingInstruction391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleProcessingInstruction417 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleProcessingInstruction429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_entryRuleElementDefinition465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDefinition475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerElementDefinition_in_ruleElementDefinition522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyElementDefinition_in_ruleElementDefinition549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerElementDefinition_in_entryRuleContainerElementDefinition584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerElementDefinition594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleContainerElementDefinition631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainerElementDefinition649 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContainerElementDefinition666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContainerElementDefinition689 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_ruleContainerElementDefinition710 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleContainerElementDefinition723 = new BitSet(new long[]{0x000000000004B870L});
    public static final BitSet FOLLOW_rulePCData_in_ruleContainerElementDefinition744 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_ruleContainerElementDefinition766 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_15_in_ruleContainerElementDefinition779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainerElementDefinition797 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContainerElementDefinition814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContainerElementDefinition837 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContainerElementDefinition849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyElementDefinition_in_entryRuleEmptyElementDefinition885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyElementDefinition895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEmptyElementDefinition932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmptyElementDefinition950 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEmptyElementDefinition967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEmptyElementDefinition990 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_ruleEmptyElementDefinition1011 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleEmptyElementDefinition1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePCData_in_entryRulePCData1060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePCData1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rulePCData1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_entryRuleAttributePropertyDefinition1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributePropertyDefinition1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributePropertyDefinition1203 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttributePropertyDefinition1220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttributePropertyDefinition1243 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttributePropertyDefinition1255 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributePropertyDefinition1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContent1376 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContent1402 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleContent1428 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_18_in_ruleContent1452 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_13_in_ruleContent1471 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContent1488 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContent1514 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleContent1540 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleContent1566 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_18_in_ruleContent1590 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_13_in_ruleContent1609 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1707 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedName1735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1751 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1857 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedNameWithWildCard1876 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedNameWithWildCard1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred1_InternalFXMLDsl1726 = new BitSet(new long[]{0x0000000000000002L});

}