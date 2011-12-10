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
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:303:1: ruleContainerElementDefinition returns [EObject current=null] : ( (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '>' ( (lv_children_6_0= ruleElementDefinition ) )+ otherlv_7= '</' ( ( (lv_endnamespace_8_0= RULE_ID ) ) otherlv_9= ':' )? ( (lv_endname_10_0= ruleQualifiedName ) ) otherlv_11= '>' ) | (otherlv_12= '<' ( ( (lv_namespace_13_0= RULE_ID ) ) otherlv_14= ':' )? ( (lv_name_15_0= ruleQualifiedName ) ) ( (lv_properties_16_0= ruleAttributePropertyDefinition ) )* otherlv_17= '>' ( (lv_content_18_0= ruleContent ) ) otherlv_19= '</' ( ( (lv_endnamespace_20_0= RULE_ID ) ) otherlv_21= ':' )? ( (lv_endname_22_0= ruleQualifiedName ) ) otherlv_23= '>' ) ) ;
    public final EObject ruleContainerElementDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_namespace_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_endnamespace_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_namespace_13_0=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_endnamespace_20_0=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_properties_4_0 = null;

        EObject lv_children_6_0 = null;

        AntlrDatatypeRuleToken lv_endname_10_0 = null;

        AntlrDatatypeRuleToken lv_name_15_0 = null;

        EObject lv_properties_16_0 = null;

        AntlrDatatypeRuleToken lv_content_18_0 = null;

        AntlrDatatypeRuleToken lv_endname_22_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:306:28: ( ( (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '>' ( (lv_children_6_0= ruleElementDefinition ) )+ otherlv_7= '</' ( ( (lv_endnamespace_8_0= RULE_ID ) ) otherlv_9= ':' )? ( (lv_endname_10_0= ruleQualifiedName ) ) otherlv_11= '>' ) | (otherlv_12= '<' ( ( (lv_namespace_13_0= RULE_ID ) ) otherlv_14= ':' )? ( (lv_name_15_0= ruleQualifiedName ) ) ( (lv_properties_16_0= ruleAttributePropertyDefinition ) )* otherlv_17= '>' ( (lv_content_18_0= ruleContent ) ) otherlv_19= '</' ( ( (lv_endnamespace_20_0= RULE_ID ) ) otherlv_21= ':' )? ( (lv_endname_22_0= ruleQualifiedName ) ) otherlv_23= '>' ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:307:1: ( (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '>' ( (lv_children_6_0= ruleElementDefinition ) )+ otherlv_7= '</' ( ( (lv_endnamespace_8_0= RULE_ID ) ) otherlv_9= ':' )? ( (lv_endname_10_0= ruleQualifiedName ) ) otherlv_11= '>' ) | (otherlv_12= '<' ( ( (lv_namespace_13_0= RULE_ID ) ) otherlv_14= ':' )? ( (lv_name_15_0= ruleQualifiedName ) ) ( (lv_properties_16_0= ruleAttributePropertyDefinition ) )* otherlv_17= '>' ( (lv_content_18_0= ruleContent ) ) otherlv_19= '</' ( ( (lv_endnamespace_20_0= RULE_ID ) ) otherlv_21= ':' )? ( (lv_endname_22_0= ruleQualifiedName ) ) otherlv_23= '>' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:307:1: ( (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '>' ( (lv_children_6_0= ruleElementDefinition ) )+ otherlv_7= '</' ( ( (lv_endnamespace_8_0= RULE_ID ) ) otherlv_9= ':' )? ( (lv_endname_10_0= ruleQualifiedName ) ) otherlv_11= '>' ) | (otherlv_12= '<' ( ( (lv_namespace_13_0= RULE_ID ) ) otherlv_14= ':' )? ( (lv_name_15_0= ruleQualifiedName ) ) ( (lv_properties_16_0= ruleAttributePropertyDefinition ) )* otherlv_17= '>' ( (lv_content_18_0= ruleContent ) ) otherlv_19= '</' ( ( (lv_endnamespace_20_0= RULE_ID ) ) otherlv_21= ':' )? ( (lv_endname_22_0= ruleQualifiedName ) ) otherlv_23= '>' ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:307:2: (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '>' ( (lv_children_6_0= ruleElementDefinition ) )+ otherlv_7= '</' ( ( (lv_endnamespace_8_0= RULE_ID ) ) otherlv_9= ':' )? ( (lv_endname_10_0= ruleQualifiedName ) ) otherlv_11= '>' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:307:2: (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '>' ( (lv_children_6_0= ruleElementDefinition ) )+ otherlv_7= '</' ( ( (lv_endnamespace_8_0= RULE_ID ) ) otherlv_9= ':' )? ( (lv_endname_10_0= ruleQualifiedName ) ) otherlv_11= '>' )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:307:4: otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '>' ( (lv_children_6_0= ruleElementDefinition ) )+ otherlv_7= '</' ( ( (lv_endnamespace_8_0= RULE_ID ) ) otherlv_9= ':' )? ( (lv_endname_10_0= ruleQualifiedName ) ) otherlv_11= '>'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleContainerElementDefinition632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getContainerElementDefinitionAccess().getLessThanSignKeyword_0_0());
                          
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
                            lv_namespace_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainerElementDefinition650); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_namespace_1_0, grammarAccess.getContainerElementDefinitionAccess().getNamespaceIDTerminalRuleCall_0_1_0_0()); 
                              		
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

                            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleContainerElementDefinition667); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_0_1_1());
                                  
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
                       
                      	        newCompositeNode(grammarAccess.getContainerElementDefinitionAccess().getNameQualifiedNameParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContainerElementDefinition690);
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
                    	       
                    	      	        newCompositeNode(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAttributePropertyDefinitionParserRuleCall_0_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_ruleContainerElementDefinition711);
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

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleContainerElementDefinition724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_0_4());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:373:1: ( (lv_children_6_0= ruleElementDefinition ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==12) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:374:1: (lv_children_6_0= ruleElementDefinition )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:374:1: (lv_children_6_0= ruleElementDefinition )
                    	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:375:3: lv_children_6_0= ruleElementDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getContainerElementDefinitionAccess().getChildrenElementDefinitionParserRuleCall_0_5_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleElementDefinition_in_ruleContainerElementDefinition745);
                    	    lv_children_6_0=ruleElementDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getContainerElementDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"children",
                    	              		lv_children_6_0, 
                    	              		"ElementDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleContainerElementDefinition758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getContainerElementDefinitionAccess().getLessThanSignSolidusKeyword_0_6());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:395:1: ( ( (lv_endnamespace_8_0= RULE_ID ) ) otherlv_9= ':' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1==13) ) {
                            alt7=1;
                        }
                    }
                    switch (alt7) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:395:2: ( (lv_endnamespace_8_0= RULE_ID ) ) otherlv_9= ':'
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:395:2: ( (lv_endnamespace_8_0= RULE_ID ) )
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:396:1: (lv_endnamespace_8_0= RULE_ID )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:396:1: (lv_endnamespace_8_0= RULE_ID )
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:397:3: lv_endnamespace_8_0= RULE_ID
                            {
                            lv_endnamespace_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainerElementDefinition776); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_endnamespace_8_0, grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceIDTerminalRuleCall_0_7_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getContainerElementDefinitionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"endnamespace",
                                      		lv_endnamespace_8_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }

                            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleContainerElementDefinition793); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_0_7_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:417:3: ( (lv_endname_10_0= ruleQualifiedName ) )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:418:1: (lv_endname_10_0= ruleQualifiedName )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:418:1: (lv_endname_10_0= ruleQualifiedName )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:419:3: lv_endname_10_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerElementDefinitionAccess().getEndnameQualifiedNameParserRuleCall_0_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContainerElementDefinition816);
                    lv_endname_10_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerElementDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"endname",
                              		lv_endname_10_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleContainerElementDefinition828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_0_9());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:440:6: (otherlv_12= '<' ( ( (lv_namespace_13_0= RULE_ID ) ) otherlv_14= ':' )? ( (lv_name_15_0= ruleQualifiedName ) ) ( (lv_properties_16_0= ruleAttributePropertyDefinition ) )* otherlv_17= '>' ( (lv_content_18_0= ruleContent ) ) otherlv_19= '</' ( ( (lv_endnamespace_20_0= RULE_ID ) ) otherlv_21= ':' )? ( (lv_endname_22_0= ruleQualifiedName ) ) otherlv_23= '>' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:440:6: (otherlv_12= '<' ( ( (lv_namespace_13_0= RULE_ID ) ) otherlv_14= ':' )? ( (lv_name_15_0= ruleQualifiedName ) ) ( (lv_properties_16_0= ruleAttributePropertyDefinition ) )* otherlv_17= '>' ( (lv_content_18_0= ruleContent ) ) otherlv_19= '</' ( ( (lv_endnamespace_20_0= RULE_ID ) ) otherlv_21= ':' )? ( (lv_endname_22_0= ruleQualifiedName ) ) otherlv_23= '>' )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:440:8: otherlv_12= '<' ( ( (lv_namespace_13_0= RULE_ID ) ) otherlv_14= ':' )? ( (lv_name_15_0= ruleQualifiedName ) ) ( (lv_properties_16_0= ruleAttributePropertyDefinition ) )* otherlv_17= '>' ( (lv_content_18_0= ruleContent ) ) otherlv_19= '</' ( ( (lv_endnamespace_20_0= RULE_ID ) ) otherlv_21= ':' )? ( (lv_endname_22_0= ruleQualifiedName ) ) otherlv_23= '>'
                    {
                    otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleContainerElementDefinition848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getContainerElementDefinitionAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:444:1: ( ( (lv_namespace_13_0= RULE_ID ) ) otherlv_14= ':' )?
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
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:444:2: ( (lv_namespace_13_0= RULE_ID ) ) otherlv_14= ':'
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:444:2: ( (lv_namespace_13_0= RULE_ID ) )
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:445:1: (lv_namespace_13_0= RULE_ID )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:445:1: (lv_namespace_13_0= RULE_ID )
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:446:3: lv_namespace_13_0= RULE_ID
                            {
                            lv_namespace_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainerElementDefinition866); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_namespace_13_0, grammarAccess.getContainerElementDefinitionAccess().getNamespaceIDTerminalRuleCall_1_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getContainerElementDefinitionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"namespace",
                                      		lv_namespace_13_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }

                            otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleContainerElementDefinition883); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_14, grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_1_1_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:466:3: ( (lv_name_15_0= ruleQualifiedName ) )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:467:1: (lv_name_15_0= ruleQualifiedName )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:467:1: (lv_name_15_0= ruleQualifiedName )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:468:3: lv_name_15_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerElementDefinitionAccess().getNameQualifiedNameParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContainerElementDefinition906);
                    lv_name_15_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerElementDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_15_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:484:2: ( (lv_properties_16_0= ruleAttributePropertyDefinition ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:485:1: (lv_properties_16_0= ruleAttributePropertyDefinition )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:485:1: (lv_properties_16_0= ruleAttributePropertyDefinition )
                    	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:486:3: lv_properties_16_0= ruleAttributePropertyDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getContainerElementDefinitionAccess().getPropertiesAttributePropertyDefinitionParserRuleCall_1_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_ruleContainerElementDefinition927);
                    	    lv_properties_16_0=ruleAttributePropertyDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getContainerElementDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"properties",
                    	              		lv_properties_16_0, 
                    	              		"AttributePropertyDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleContainerElementDefinition940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_1_4());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:506:1: ( (lv_content_18_0= ruleContent ) )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:507:1: (lv_content_18_0= ruleContent )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:507:1: (lv_content_18_0= ruleContent )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:508:3: lv_content_18_0= ruleContent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerElementDefinitionAccess().getContentContentParserRuleCall_1_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContent_in_ruleContainerElementDefinition961);
                    lv_content_18_0=ruleContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerElementDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"content",
                              		lv_content_18_0, 
                              		"Content");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleContainerElementDefinition973); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getContainerElementDefinitionAccess().getLessThanSignSolidusKeyword_1_6());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:528:1: ( ( (lv_endnamespace_20_0= RULE_ID ) ) otherlv_21= ':' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==13) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:528:2: ( (lv_endnamespace_20_0= RULE_ID ) ) otherlv_21= ':'
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:528:2: ( (lv_endnamespace_20_0= RULE_ID ) )
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:529:1: (lv_endnamespace_20_0= RULE_ID )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:529:1: (lv_endnamespace_20_0= RULE_ID )
                            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:530:3: lv_endnamespace_20_0= RULE_ID
                            {
                            lv_endnamespace_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainerElementDefinition991); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_endnamespace_20_0, grammarAccess.getContainerElementDefinitionAccess().getEndnamespaceIDTerminalRuleCall_1_7_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getContainerElementDefinitionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"endnamespace",
                                      		lv_endnamespace_20_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }

                            otherlv_21=(Token)match(input,13,FOLLOW_13_in_ruleContainerElementDefinition1008); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_21, grammarAccess.getContainerElementDefinitionAccess().getColonKeyword_1_7_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:550:3: ( (lv_endname_22_0= ruleQualifiedName ) )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:551:1: (lv_endname_22_0= ruleQualifiedName )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:551:1: (lv_endname_22_0= ruleQualifiedName )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:552:3: lv_endname_22_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerElementDefinitionAccess().getEndnameQualifiedNameParserRuleCall_1_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContainerElementDefinition1031);
                    lv_endname_22_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerElementDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"endname",
                              		lv_endname_22_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_23=(Token)match(input,14,FOLLOW_14_in_ruleContainerElementDefinition1043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getContainerElementDefinitionAccess().getGreaterThanSignKeyword_1_9());
                          
                    }

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
    // $ANTLR end "ruleContainerElementDefinition"


    // $ANTLR start "entryRuleEmptyElementDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:580:1: entryRuleEmptyElementDefinition returns [EObject current=null] : iv_ruleEmptyElementDefinition= ruleEmptyElementDefinition EOF ;
    public final EObject entryRuleEmptyElementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyElementDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:581:2: (iv_ruleEmptyElementDefinition= ruleEmptyElementDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:582:2: iv_ruleEmptyElementDefinition= ruleEmptyElementDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyElementDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyElementDefinition_in_entryRuleEmptyElementDefinition1080);
            iv_ruleEmptyElementDefinition=ruleEmptyElementDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyElementDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyElementDefinition1090); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:589:1: ruleEmptyElementDefinition returns [EObject current=null] : (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_props_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '/>' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:592:28: ( (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_props_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '/>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:593:1: (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_props_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '/>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:593:1: (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_props_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '/>' )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:593:3: otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_props_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '/>'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleEmptyElementDefinition1127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEmptyElementDefinitionAccess().getLessThanSignKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:597:1: ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==13) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:597:2: ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:597:2: ( (lv_namespace_1_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:598:1: (lv_namespace_1_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:598:1: (lv_namespace_1_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:599:3: lv_namespace_1_0= RULE_ID
                    {
                    lv_namespace_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmptyElementDefinition1145); if (state.failed) return current;
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

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEmptyElementDefinition1162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEmptyElementDefinitionAccess().getColonKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:619:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:620:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:620:1: (lv_name_3_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:621:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmptyElementDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEmptyElementDefinition1185);
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

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:637:2: ( (lv_props_4_0= ruleAttributePropertyDefinition ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:638:1: (lv_props_4_0= ruleAttributePropertyDefinition )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:638:1: (lv_props_4_0= ruleAttributePropertyDefinition )
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:639:3: lv_props_4_0= ruleAttributePropertyDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEmptyElementDefinitionAccess().getPropsAttributePropertyDefinitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_ruleEmptyElementDefinition1206);
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
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleEmptyElementDefinition1219); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAttributePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:667:1: entryRuleAttributePropertyDefinition returns [EObject current=null] : iv_ruleAttributePropertyDefinition= ruleAttributePropertyDefinition EOF ;
    public final EObject entryRuleAttributePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributePropertyDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:668:2: (iv_ruleAttributePropertyDefinition= ruleAttributePropertyDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:669:2: iv_ruleAttributePropertyDefinition= ruleAttributePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributePropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAttributePropertyDefinition_in_entryRuleAttributePropertyDefinition1255);
            iv_ruleAttributePropertyDefinition=ruleAttributePropertyDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributePropertyDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributePropertyDefinition1265); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:676:1: ruleAttributePropertyDefinition returns [EObject current=null] : ( ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttributePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_namespace_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:679:28: ( ( ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:680:1: ( ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:680:1: ( ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:680:2: ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:680:2: ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==13) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:680:3: ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:680:3: ( (lv_namespace_0_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:681:1: (lv_namespace_0_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:681:1: (lv_namespace_0_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:682:3: lv_namespace_0_0= RULE_ID
                    {
                    lv_namespace_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributePropertyDefinition1308); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleAttributePropertyDefinition1325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAttributePropertyDefinitionAccess().getColonKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:702:3: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:703:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:703:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:704:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributePropertyDefinition1344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getAttributePropertyDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributePropertyDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAttributePropertyDefinition1361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAttributePropertyDefinitionAccess().getEqualsSignKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:724:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:725:1: (lv_value_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:725:1: (lv_value_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:726:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttributePropertyDefinition1378); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:750:1: entryRuleContent returns [String current=null] : iv_ruleContent= ruleContent EOF ;
    public final String entryRuleContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContent = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:754:2: (iv_ruleContent= ruleContent EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:755:2: iv_ruleContent= ruleContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentRule()); 
            }
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent1426);
            iv_ruleContent=ruleContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContent.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent1437); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:765:1: ruleContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS | kw= '.' | kw= ':' )* ;
    public final AntlrDatatypeRuleToken ruleContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_ANY_OTHER_2=null;
        Token this_WS_3=null;
        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:769:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS | kw= '.' | kw= ':' )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:770:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS | kw= '.' | kw= ':' )*
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:770:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS | kw= '.' | kw= ':' )*
            loop15:
            do {
                int alt15=7;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt15=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt15=2;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt15=3;
                    }
                    break;
                case RULE_WS:
                    {
                    alt15=4;
                    }
                    break;
                case 18:
                    {
                    alt15=5;
                    }
                    break;
                case 13:
                    {
                    alt15=6;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:770:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContent1481); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getContentAccess().getIDTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:778:10: this_STRING_1= RULE_STRING
            	    {
            	    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContent1507); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_STRING_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_STRING_1, grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:786:10: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleContent1533); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ANY_OTHER_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ANY_OTHER_2, grammarAccess.getContentAccess().getANY_OTHERTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:794:10: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleContent1559); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_3, grammarAccess.getContentAccess().getWSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:803:2: kw= '.'
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleContent1583); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getContentAccess().getFullStopKeyword_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:810:2: kw= ':'
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleContent1602); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getContentAccess().getColonKeyword_5()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:826:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:827:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:828:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1648);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1659); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:835:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:838:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:839:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:839:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:839:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:846:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==RULE_ID) && (synpred1_InternalFXMLDsl())) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:846:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:846:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:846:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedName1727); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1743); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:869:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:870:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:871:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1791);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1802); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:878:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:881:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:882:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:882:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:883:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1849);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:893:1: (kw= '.' kw= '*' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:894:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedNameWithWildCard1868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleQualifiedNameWithWildCard1881); if (state.failed) return current;
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
        // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:846:3: ( '.' )
        // ../at.bestsolution.efxclipse.tooling.fxmlx/src-gen/at/bestsolution/efxclipse/tooling/fxmlx/parser/antlr/internal/InternalFXMLDsl.g:847:2: '.'
        {
        match(input,18,FOLLOW_18_in_synpred1_InternalFXMLDsl1718); if (state.failed) return ;

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
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA3_eotS =
        "\16\uffff";
    static final String DFA3_eofS =
        "\16\uffff";
    static final String DFA3_minS =
        "\1\14\3\4\1\15\1\uffff\1\4\1\uffff\2\4\1\5\1\4\1\21\1\4";
    static final String DFA3_maxS =
        "\1\14\1\4\1\22\1\4\1\21\1\uffff\1\4\1\uffff\1\22\1\4\1\5\1\22\1"+
        "\21\1\20";
    static final String DFA3_acceptS =
        "\5\uffff\1\1\1\uffff\1\2\6\uffff";
    static final String DFA3_specialS =
        "\16\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\10\uffff\1\6\1\5\1\uffff\1\7\1\uffff\1\3",
            "\1\10",
            "\1\11\3\uffff\1\12",
            "",
            "\1\13",
            "",
            "\1\4\11\uffff\1\5\1\uffff\1\7\1\uffff\1\3",
            "\1\14",
            "\1\15",
            "\1\4\11\uffff\1\5\1\uffff\1\7\1\uffff\1\3",
            "\1\12",
            "\1\4\11\uffff\1\5\1\uffff\1\7"
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
    static final String DFA11_eotS =
        "\17\uffff";
    static final String DFA11_eofS =
        "\17\uffff";
    static final String DFA11_minS =
        "\1\14\3\4\1\15\3\4\1\5\1\4\2\uffff\2\4\1\21";
    static final String DFA11_maxS =
        "\1\14\1\4\1\22\1\4\1\21\1\22\1\4\1\22\1\5\1\4\2\uffff\1\22\1\16"+
        "\1\21";
    static final String DFA11_acceptS =
        "\12\uffff\1\1\1\2\3\uffff";
    static final String DFA11_specialS =
        "\17\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\10\uffff\1\6\1\5\3\uffff\1\3",
            "\1\7",
            "\1\11\3\uffff\1\10",
            "\4\13\4\uffff\1\12\1\13\1\uffff\1\13\2\uffff\1\13",
            "\1\14",
            "\1\4\11\uffff\1\5\3\uffff\1\3",
            "\1\15",
            "\1\16",
            "",
            "",
            "\1\4\11\uffff\1\5\3\uffff\1\3",
            "\1\4\11\uffff\1\5",
            "\1\10"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "307:1: ( (otherlv_0= '<' ( ( (lv_namespace_1_0= RULE_ID ) ) otherlv_2= ':' )? ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_properties_4_0= ruleAttributePropertyDefinition ) )* otherlv_5= '>' ( (lv_children_6_0= ruleElementDefinition ) )+ otherlv_7= '</' ( ( (lv_endnamespace_8_0= RULE_ID ) ) otherlv_9= ':' )? ( (lv_endname_10_0= ruleQualifiedName ) ) otherlv_11= '>' ) | (otherlv_12= '<' ( ( (lv_namespace_13_0= RULE_ID ) ) otherlv_14= ':' )? ( (lv_name_15_0= ruleQualifiedName ) ) ( (lv_properties_16_0= ruleAttributePropertyDefinition ) )* otherlv_17= '>' ( (lv_content_18_0= ruleContent ) ) otherlv_19= '</' ( ( (lv_endnamespace_20_0= RULE_ID ) ) otherlv_21= ':' )? ( (lv_endname_22_0= ruleQualifiedName ) ) otherlv_23= '>' ) )";
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
    public static final BitSet FOLLOW_12_in_ruleContainerElementDefinition632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainerElementDefinition650 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContainerElementDefinition667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContainerElementDefinition690 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_ruleContainerElementDefinition711 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleContainerElementDefinition724 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_ruleElementDefinition_in_ruleContainerElementDefinition745 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_15_in_ruleContainerElementDefinition758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainerElementDefinition776 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContainerElementDefinition793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContainerElementDefinition816 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContainerElementDefinition828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleContainerElementDefinition848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainerElementDefinition866 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContainerElementDefinition883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContainerElementDefinition906 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_ruleContainerElementDefinition927 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleContainerElementDefinition940 = new BitSet(new long[]{0x000000000004A0F0L});
    public static final BitSet FOLLOW_ruleContent_in_ruleContainerElementDefinition961 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContainerElementDefinition973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainerElementDefinition991 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContainerElementDefinition1008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContainerElementDefinition1031 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContainerElementDefinition1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyElementDefinition_in_entryRuleEmptyElementDefinition1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyElementDefinition1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEmptyElementDefinition1127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmptyElementDefinition1145 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEmptyElementDefinition1162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEmptyElementDefinition1185 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_ruleEmptyElementDefinition1206 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleEmptyElementDefinition1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePropertyDefinition_in_entryRuleAttributePropertyDefinition1255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributePropertyDefinition1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributePropertyDefinition1308 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttributePropertyDefinition1325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributePropertyDefinition1344 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttributePropertyDefinition1361 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributePropertyDefinition1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent1426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContent1481 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContent1507 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleContent1533 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleContent1559 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_18_in_ruleContent1583 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_13_in_ruleContent1602 = new BitSet(new long[]{0x00000000000420F2L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1699 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedName1727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1743 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1849 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedNameWithWildCard1868 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualifiedNameWithWildCard1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred1_InternalFXMLDsl1718 = new BitSet(new long[]{0x0000000000000002L});

}