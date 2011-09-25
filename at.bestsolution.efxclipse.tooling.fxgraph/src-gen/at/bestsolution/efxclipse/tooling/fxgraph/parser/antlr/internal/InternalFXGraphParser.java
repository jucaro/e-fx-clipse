package at.bestsolution.efxclipse.tooling.fxgraph.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.efxclipse.tooling.fxgraph.services.FXGraphGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFXGraphParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'('", "'createdby'", "')'", "'id'", "'{'", "'|'", "','", "'}'", "':'", "'['", "']'", "'-'", "'idref'", "'include'", "'.'", "'*'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_REAL=6;
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
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalFXGraphParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFXGraphParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFXGraphParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g"; }



     	private FXGraphGrammarAccess grammarAccess;
     	
        public InternalFXGraphParser(TokenStream input, FXGraphGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected FXGraphGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rootNode_1_0= ruleElement ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_rootNode_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rootNode_1_0= ruleElement ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rootNode_1_0= ruleElement ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rootNode_1_0= ruleElement ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_rootNode_1_0= ruleElement ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:98:3: ( (lv_rootNode_1_0= ruleElement ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:99:1: (lv_rootNode_1_0= ruleElement )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:99:1: (lv_rootNode_1_0= ruleElement )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:100:3: lv_rootNode_1_0= ruleElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getRootNodeElementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElement_in_ruleModel153);
            lv_rootNode_1_0=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"rootNode",
                      		lv_rootNode_1_0, 
                      		"Element");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:126:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport189);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport199); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport257);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildCard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleElement"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:167:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:168:2: (iv_ruleElement= ruleElement EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:169:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement293);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement303); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:176:1: ruleElement returns [EObject current=null] : ( ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token lv_factory_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_defines_10_0 = null;

        EObject lv_defines_12_0 = null;

        EObject lv_properties_14_0 = null;

        EObject lv_properties_16_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:179:28: ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:180:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:180:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:180:2: ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:180:2: ( (lv_type_0_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:181:1: (lv_type_0_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:181:1: (lv_type_0_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:182:3: lv_type_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementAccess().getTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleElement349);
            lv_type_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:198:2: (otherlv_1= '(' ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:198:4: otherlv_1= '(' ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleElement362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getElementAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:202:1: ( ( (lv_value_2_0= RULE_STRING ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_STRING) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==14) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:202:2: ( (lv_value_2_0= RULE_STRING ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:202:2: ( (lv_value_2_0= RULE_STRING ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:203:1: (lv_value_2_0= RULE_STRING )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:203:1: (lv_value_2_0= RULE_STRING )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:204:3: lv_value_2_0= RULE_STRING
                            {
                            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElement380); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_value_2_0, grammarAccess.getElementAccess().getValueSTRINGTerminalRuleCall_1_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getElementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"value",
                                      		lv_value_2_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:221:6: (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:221:6: (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:221:8: otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleElement404); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getElementAccess().getCreatedbyKeyword_1_1_1_0());
                                  
                            }
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:225:1: ( (lv_factory_4_0= RULE_STRING ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:226:1: (lv_factory_4_0= RULE_STRING )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:226:1: (lv_factory_4_0= RULE_STRING )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:227:3: lv_factory_4_0= RULE_STRING
                            {
                            lv_factory_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElement421); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_factory_4_0, grammarAccess.getElementAccess().getFactorySTRINGTerminalRuleCall_1_1_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getElementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"factory",
                                      		lv_factory_4_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleElement440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getElementAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:247:3: (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:247:5: otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleElement455); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getElementAccess().getIdKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:251:1: ( (lv_name_7_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:252:1: (lv_name_7_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:252:1: (lv_name_7_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:253:3: lv_name_7_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleElement476);
                    lv_name_7_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_7_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:269:4: (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:269:6: otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}'
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleElement491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:273:1: (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==18) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:273:3: otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|'
                            {
                            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleElement504); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getElementAccess().getVerticalLineKeyword_3_1_0());
                                  
                            }
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:277:1: ( (lv_defines_10_0= ruleDefine ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:278:1: (lv_defines_10_0= ruleDefine )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:278:1: (lv_defines_10_0= ruleDefine )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:279:3: lv_defines_10_0= ruleDefine
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementAccess().getDefinesDefineParserRuleCall_3_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDefine_in_ruleElement525);
                            lv_defines_10_0=ruleDefine();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getElementRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"defines",
                                      		lv_defines_10_0, 
                                      		"Define");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:295:2: (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==19) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:295:4: otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) )
                            	    {
                            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleElement538); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getElementAccess().getCommaKeyword_3_1_2_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:299:1: ( (lv_defines_12_0= ruleDefine ) )
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:300:1: (lv_defines_12_0= ruleDefine )
                            	    {
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:300:1: (lv_defines_12_0= ruleDefine )
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:301:3: lv_defines_12_0= ruleDefine
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementAccess().getDefinesDefineParserRuleCall_3_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDefine_in_ruleElement559);
                            	    lv_defines_12_0=ruleDefine();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getElementRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"defines",
                            	              		lv_defines_12_0, 
                            	              		"Define");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);

                            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleElement573); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_13, grammarAccess.getElementAccess().getVerticalLineKeyword_3_1_3());
                                  
                            }

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:321:3: ( (lv_properties_14_0= ruleProperty ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:322:1: (lv_properties_14_0= ruleProperty )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:322:1: (lv_properties_14_0= ruleProperty )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:323:3: lv_properties_14_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementAccess().getPropertiesPropertyParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleProperty_in_ruleElement596);
                    lv_properties_14_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementRule());
                      	        }
                             		add(
                             			current, 
                             			"properties",
                              		lv_properties_14_0, 
                              		"Property");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:339:2: (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:339:4: otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleElement609); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_15, grammarAccess.getElementAccess().getCommaKeyword_3_3_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:343:1: ( (lv_properties_16_0= ruleProperty ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:344:1: (lv_properties_16_0= ruleProperty )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:344:1: (lv_properties_16_0= ruleProperty )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:345:3: lv_properties_16_0= ruleProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getElementAccess().getPropertiesPropertyParserRuleCall_3_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleElement630);
                    	    lv_properties_16_0=ruleProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"properties",
                    	              		lv_properties_16_0, 
                    	              		"Property");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleElement644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_3_4());
                          
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDefine"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:373:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:374:2: (iv_ruleDefine= ruleDefine EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:375:2: iv_ruleDefine= ruleDefine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineRule()); 
            }
            pushFollow(FOLLOW_ruleDefine_in_entryRuleDefine682);
            iv_ruleDefine=ruleDefine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefine692); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:382:1: ruleDefine returns [EObject current=null] : ( (lv_element_0_0= ruleElement ) ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:385:28: ( ( (lv_element_0_0= ruleElement ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:386:1: ( (lv_element_0_0= ruleElement ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:386:1: ( (lv_element_0_0= ruleElement ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:387:1: (lv_element_0_0= ruleElement )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:387:1: (lv_element_0_0= ruleElement )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:388:3: lv_element_0_0= ruleElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefineAccess().getElementElementParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElement_in_ruleDefine737);
            lv_element_0_0=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefineRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_0_0, 
                      		"Element");
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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:412:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:413:2: (iv_ruleProperty= ruleProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:414:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty772);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty782); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:421:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= rulePropertyValue ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:424:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= rulePropertyValue ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:425:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= rulePropertyValue ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:425:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= rulePropertyValue ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:425:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= rulePropertyValue ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:425:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:426:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:426:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:427:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleProperty841); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:447:1: ( (lv_value_2_0= rulePropertyValue ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:448:1: (lv_value_2_0= rulePropertyValue )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:448:1: (lv_value_2_0= rulePropertyValue )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:449:3: lv_value_2_0= rulePropertyValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty862);
            lv_value_2_0=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"PropertyValue");
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyValue"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:473:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:474:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:475:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValue_in_entryRulePropertyValue898);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValue908); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:482:1: rulePropertyValue returns [EObject current=null] : (this_ListProperty_0= ruleListProperty | this_ValueProperty_1= ruleValueProperty | this_Element_2= ruleElement | this_ReferenceProperty_3= ruleReferenceProperty | this_IncludeProperty_4= ruleIncludeProperty ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_ListProperty_0 = null;

        EObject this_ValueProperty_1 = null;

        EObject this_Element_2 = null;

        EObject this_ReferenceProperty_3 = null;

        EObject this_IncludeProperty_4 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:485:28: ( (this_ListProperty_0= ruleListProperty | this_ValueProperty_1= ruleValueProperty | this_Element_2= ruleElement | this_ReferenceProperty_3= ruleReferenceProperty | this_IncludeProperty_4= ruleIncludeProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:486:1: (this_ListProperty_0= ruleListProperty | this_ValueProperty_1= ruleValueProperty | this_Element_2= ruleElement | this_ReferenceProperty_3= ruleReferenceProperty | this_IncludeProperty_4= ruleIncludeProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:486:1: (this_ListProperty_0= ruleListProperty | this_ValueProperty_1= ruleValueProperty | this_Element_2= ruleElement | this_ReferenceProperty_3= ruleReferenceProperty | this_IncludeProperty_4= ruleIncludeProperty )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 24:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
            case 13:
            case 73:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            case 26:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:487:5: this_ListProperty_0= ruleListProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyValueAccess().getListPropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleListProperty_in_rulePropertyValue955);
                    this_ListProperty_0=ruleListProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ListProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:497:5: this_ValueProperty_1= ruleValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyValueAccess().getValuePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValueProperty_in_rulePropertyValue982);
                    this_ValueProperty_1=ruleValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValueProperty_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:507:5: this_Element_2= ruleElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyValueAccess().getElementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElement_in_rulePropertyValue1009);
                    this_Element_2=ruleElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Element_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:517:5: this_ReferenceProperty_3= ruleReferenceProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyValueAccess().getReferencePropertyParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceProperty_in_rulePropertyValue1036);
                    this_ReferenceProperty_3=ruleReferenceProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceProperty_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:527:5: this_IncludeProperty_4= ruleIncludeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyValueAccess().getIncludePropertyParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIncludeProperty_in_rulePropertyValue1063);
                    this_IncludeProperty_4=ruleIncludeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IncludeProperty_4; 
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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleListProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:543:1: entryRuleListProperty returns [EObject current=null] : iv_ruleListProperty= ruleListProperty EOF ;
    public final EObject entryRuleListProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:544:2: (iv_ruleListProperty= ruleListProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:545:2: iv_ruleListProperty= ruleListProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleListProperty_in_entryRuleListProperty1098);
            iv_ruleListProperty=ruleListProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListProperty1108); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListProperty"


    // $ANTLR start "ruleListProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:552:1: ruleListProperty returns [EObject current=null] : (otherlv_0= '[' ( (lv_value_1_0= rulePropertyValue ) ) (otherlv_2= ',' ( (lv_value_3_0= rulePropertyValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleListProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:555:28: ( (otherlv_0= '[' ( (lv_value_1_0= rulePropertyValue ) ) (otherlv_2= ',' ( (lv_value_3_0= rulePropertyValue ) ) )* otherlv_4= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:556:1: (otherlv_0= '[' ( (lv_value_1_0= rulePropertyValue ) ) (otherlv_2= ',' ( (lv_value_3_0= rulePropertyValue ) ) )* otherlv_4= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:556:1: (otherlv_0= '[' ( (lv_value_1_0= rulePropertyValue ) ) (otherlv_2= ',' ( (lv_value_3_0= rulePropertyValue ) ) )* otherlv_4= ']' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:556:3: otherlv_0= '[' ( (lv_value_1_0= rulePropertyValue ) ) (otherlv_2= ',' ( (lv_value_3_0= rulePropertyValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleListProperty1145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getListPropertyAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:560:1: ( (lv_value_1_0= rulePropertyValue ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:561:1: (lv_value_1_0= rulePropertyValue )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:561:1: (lv_value_1_0= rulePropertyValue )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:562:3: lv_value_1_0= rulePropertyValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListPropertyAccess().getValuePropertyValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyValue_in_ruleListProperty1166);
            lv_value_1_0=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getListPropertyRule());
              	        }
                     		add(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"PropertyValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:578:2: (otherlv_2= ',' ( (lv_value_3_0= rulePropertyValue ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:578:4: otherlv_2= ',' ( (lv_value_3_0= rulePropertyValue ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleListProperty1179); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getListPropertyAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:582:1: ( (lv_value_3_0= rulePropertyValue ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:583:1: (lv_value_3_0= rulePropertyValue )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:583:1: (lv_value_3_0= rulePropertyValue )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:584:3: lv_value_3_0= rulePropertyValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getListPropertyAccess().getValuePropertyValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyValue_in_ruleListProperty1200);
            	    lv_value_3_0=rulePropertyValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getListPropertyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"value",
            	              		lv_value_3_0, 
            	              		"PropertyValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleListProperty1214); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getListPropertyAccess().getRightSquareBracketKeyword_3());
                  
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
    // $ANTLR end "ruleListProperty"


    // $ANTLR start "entryRuleValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:612:1: entryRuleValueProperty returns [EObject current=null] : iv_ruleValueProperty= ruleValueProperty EOF ;
    public final EObject entryRuleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:613:2: (iv_ruleValueProperty= ruleValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:614:2: iv_ruleValueProperty= ruleValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleValueProperty_in_entryRuleValueProperty1250);
            iv_ruleValueProperty=ruleValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueProperty1260); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValueProperty"


    // $ANTLR start "ruleValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:621:1: ruleValueProperty returns [EObject current=null] : ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( ( ( (lv_negative_1_0= '-' ) ) ( (lv_realValue_2_0= RULE_REAL ) ) ) | ( (lv_intValue_3_0= RULE_INT ) ) ) ) ;
    public final EObject ruleValueProperty() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;
        Token lv_negative_1_0=null;
        Token lv_realValue_2_0=null;
        Token lv_intValue_3_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:624:28: ( ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( ( ( (lv_negative_1_0= '-' ) ) ( (lv_realValue_2_0= RULE_REAL ) ) ) | ( (lv_intValue_3_0= RULE_INT ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:625:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( ( ( (lv_negative_1_0= '-' ) ) ( (lv_realValue_2_0= RULE_REAL ) ) ) | ( (lv_intValue_3_0= RULE_INT ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:625:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( ( ( (lv_negative_1_0= '-' ) ) ( (lv_realValue_2_0= RULE_REAL ) ) ) | ( (lv_intValue_3_0= RULE_INT ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT||LA12_0==24) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:625:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:625:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:626:1: (lv_stringValue_0_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:626:1: (lv_stringValue_0_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:627:3: lv_stringValue_0_0= RULE_STRING
                    {
                    lv_stringValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueProperty1302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_stringValue_0_0, grammarAccess.getValuePropertyAccess().getStringValueSTRINGTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getValuePropertyRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"stringValue",
                              		lv_stringValue_0_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:644:6: ( ( ( (lv_negative_1_0= '-' ) ) ( (lv_realValue_2_0= RULE_REAL ) ) ) | ( (lv_intValue_3_0= RULE_INT ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:644:6: ( ( ( (lv_negative_1_0= '-' ) ) ( (lv_realValue_2_0= RULE_REAL ) ) ) | ( (lv_intValue_3_0= RULE_INT ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==RULE_INT) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:644:7: ( ( (lv_negative_1_0= '-' ) ) ( (lv_realValue_2_0= RULE_REAL ) ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:644:7: ( ( (lv_negative_1_0= '-' ) ) ( (lv_realValue_2_0= RULE_REAL ) ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:644:8: ( (lv_negative_1_0= '-' ) ) ( (lv_realValue_2_0= RULE_REAL ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:644:8: ( (lv_negative_1_0= '-' ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:645:1: (lv_negative_1_0= '-' )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:645:1: (lv_negative_1_0= '-' )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:646:3: lv_negative_1_0= '-'
                            {
                            lv_negative_1_0=(Token)match(input,24,FOLLOW_24_in_ruleValueProperty1333); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_negative_1_0, grammarAccess.getValuePropertyAccess().getNegativeHyphenMinusKeyword_1_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getValuePropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "negative", true, "-");
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:659:2: ( (lv_realValue_2_0= RULE_REAL ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:660:1: (lv_realValue_2_0= RULE_REAL )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:660:1: (lv_realValue_2_0= RULE_REAL )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:661:3: lv_realValue_2_0= RULE_REAL
                            {
                            lv_realValue_2_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleValueProperty1363); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_realValue_2_0, grammarAccess.getValuePropertyAccess().getRealValueREALTerminalRuleCall_1_0_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getValuePropertyRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"realValue",
                                      		lv_realValue_2_0, 
                                      		"REAL");
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:678:6: ( (lv_intValue_3_0= RULE_INT ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:678:6: ( (lv_intValue_3_0= RULE_INT ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:679:1: (lv_intValue_3_0= RULE_INT )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:679:1: (lv_intValue_3_0= RULE_INT )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:680:3: lv_intValue_3_0= RULE_INT
                            {
                            lv_intValue_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValueProperty1392); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_intValue_3_0, grammarAccess.getValuePropertyAccess().getIntValueINTTerminalRuleCall_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getValuePropertyRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"intValue",
                                      		lv_intValue_3_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleValueProperty"


    // $ANTLR start "entryRuleReferenceProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:704:1: entryRuleReferenceProperty returns [EObject current=null] : iv_ruleReferenceProperty= ruleReferenceProperty EOF ;
    public final EObject entryRuleReferenceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:705:2: (iv_ruleReferenceProperty= ruleReferenceProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:706:2: iv_ruleReferenceProperty= ruleReferenceProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferencePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty1434);
            iv_ruleReferenceProperty=ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceProperty1444); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceProperty"


    // $ANTLR start "ruleReferenceProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:713:1: ruleReferenceProperty returns [EObject current=null] : (otherlv_0= 'idref' ( ( ruleValidID ) ) ) ;
    public final EObject ruleReferenceProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:716:28: ( (otherlv_0= 'idref' ( ( ruleValidID ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:717:1: (otherlv_0= 'idref' ( ( ruleValidID ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:717:1: (otherlv_0= 'idref' ( ( ruleValidID ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:717:3: otherlv_0= 'idref' ( ( ruleValidID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleReferenceProperty1481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferencePropertyAccess().getIdrefKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:721:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:722:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:722:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:723:3: ruleValidID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferencePropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferencePropertyAccess().getReferenceElementCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleReferenceProperty1504);
            ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleReferenceProperty"


    // $ANTLR start "entryRuleIncludeProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:744:1: entryRuleIncludeProperty returns [EObject current=null] : iv_ruleIncludeProperty= ruleIncludeProperty EOF ;
    public final EObject entryRuleIncludeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:745:2: (iv_ruleIncludeProperty= ruleIncludeProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:746:2: iv_ruleIncludeProperty= ruleIncludeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleIncludeProperty_in_entryRuleIncludeProperty1540);
            iv_ruleIncludeProperty=ruleIncludeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIncludeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeProperty1550); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIncludeProperty"


    // $ANTLR start "ruleIncludeProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:753:1: ruleIncludeProperty returns [EObject current=null] : (otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleIncludeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_source_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:756:28: ( (otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:757:1: (otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:757:1: (otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:757:3: otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleIncludeProperty1587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludePropertyAccess().getIncludeKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:761:1: ( (lv_source_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:762:1: (lv_source_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:762:1: (lv_source_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:763:3: lv_source_1_0= RULE_STRING
            {
            lv_source_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIncludeProperty1604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_source_1_0, grammarAccess.getIncludePropertyAccess().getSourceSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIncludePropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"source",
                      		lv_source_1_0, 
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
    // $ANTLR end "ruleIncludeProperty"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:787:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:788:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:789:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1646);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1657); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:796:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:799:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:800:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:800:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:801:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1704);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:811:1: (kw= '.' kw= '*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:812:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleQualifiedNameWithWildCard1723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleQualifiedNameWithWildCard1736); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:831:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:832:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:833:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1778);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1788); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:840:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:843:28: (this_XAssignment_0= ruleXAssignment )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:845:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1834);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:861:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:862:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:863:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1868);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1878); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:870:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:873:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:874:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:874:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||(LA15_1>=RULE_STRING && LA15_1<=RULE_ID)||LA15_1==RULE_INT||LA15_1==13||LA15_1==15||LA15_1==17||(LA15_1>=19 && LA15_1<=24)||(LA15_1>=27 && LA15_1<=28)||(LA15_1>=30 && LA15_1<=73)) ) {
                    alt15=2;
                }
                else if ( (LA15_1==29) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0==RULE_STRING||LA15_0==RULE_INT||LA15_0==13||LA15_0==17||LA15_0==22||LA15_0==24||LA15_0==39||LA15_0==42||LA15_0==46||LA15_0==50||LA15_0==52||(LA15_0>=55 && LA15_0<=57)||LA15_0==61||(LA15_0>=63 && LA15_0<=70)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:874:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:874:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:874:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:874:3: ()
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:875:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:880:2: ( ( ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:881:1: ( ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:881:1: ( ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:882:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1936);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1952);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:903:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:904:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:904:1: (lv_value_3_0= ruleXAssignment )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:905:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1972);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:922:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:922:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:923:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2002);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:931:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==30) ) {
                        int LA14_1 = input.LA(2);

                        if ( (synpred1_InternalFXGraph()) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:931:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:931:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:931:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:936:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:936:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:936:7: ()
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:937:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:942:2: ( ( ruleOpMultiAssign ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:943:1: ( ruleOpMultiAssign )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:943:1: ( ruleOpMultiAssign )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:944:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2055);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:957:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:958:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:958:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:959:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2078);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:983:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:984:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:985:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2118);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2129); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:992:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:995:28: (kw= '=' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:997:2: kw= '='
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpSingleAssign2166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1010:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1011:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1012:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2206);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2217); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1019:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1022:28: (kw= '+=' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1024:2: kw= '+='
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleOpMultiAssign2254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1037:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1038:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1039:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2293);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2303); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1046:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1049:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1050:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1050:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1051:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2350);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1059:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred2_InternalFXGraph()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1059:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1059:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1059:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1064:6: ( () ( ( ruleOpOr ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1064:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1064:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1065:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1070:2: ( ( ruleOpOr ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1071:1: ( ruleOpOr )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1071:1: ( ruleOpOr )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1072:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2403);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1085:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1086:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1086:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1087:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2426);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1111:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1112:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1113:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2465);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2476); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1120:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1123:28: (kw= '||' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1125:2: kw= '||'
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOr2513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1138:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1139:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1140:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2552);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2562); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1147:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1150:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1151:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1151:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1152:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2609);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1160:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred3_InternalFXGraph()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1160:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1160:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1160:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1165:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1165:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1165:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1166:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1171:2: ( ( ruleOpAnd ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1172:1: ( ruleOpAnd )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1172:1: ( ruleOpAnd )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1173:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2662);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1186:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1187:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1187:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1188:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2685);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1212:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1213:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1214:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2724);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2735); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1221:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1224:28: (kw= '&&' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1226:2: kw= '&&'
            {
            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAnd2772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1239:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1240:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1241:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2811);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2821); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1248:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1251:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1252:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1252:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1253:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2868);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1261:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred4_InternalFXGraph()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==34) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred4_InternalFXGraph()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1261:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1261:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1261:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1266:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1266:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1266:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1267:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1272:2: ( ( ruleOpEquality ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1273:1: ( ruleOpEquality )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1273:1: ( ruleOpEquality )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1274:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2921);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1287:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1288:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1288:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1289:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2944);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1313:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1314:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1315:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2983);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2994); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1322:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1325:28: ( (kw= '==' | kw= '!=' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1326:1: (kw= '==' | kw= '!=' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1326:1: (kw= '==' | kw= '!=' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1327:2: kw= '=='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpEquality3032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1334:2: kw= '!='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpEquality3051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1347:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1348:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1349:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3091);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3101); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1356:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1359:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1360:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1360:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1361:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3148);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1369:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop20:
            do {
                int alt20=3;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA20_2 = input.LA(2);

                    if ( (synpred5_InternalFXGraph()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (synpred6_InternalFXGraph()) ) {
                        alt20=2;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (synpred6_InternalFXGraph()) ) {
                        alt20=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA20_5 = input.LA(2);

                    if ( (synpred6_InternalFXGraph()) ) {
                        alt20=2;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA20_6 = input.LA(2);

                    if ( (synpred6_InternalFXGraph()) ) {
                        alt20=2;
                    }


                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1369:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1369:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1369:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1369:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1369:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1371:5: ( () otherlv_2= 'instanceof' )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1371:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1371:6: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1372:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleXRelationalExpression3184); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1381:3: ( ( ruleQualifiedName ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1382:1: ( ruleQualifiedName )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1382:1: ( ruleQualifiedName )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1383:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3209);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1397:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1397:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1397:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1397:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1397:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1402:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1402:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1402:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1403:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1408:2: ( ( ruleOpCompare ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1409:1: ( ruleOpCompare )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1409:1: ( ruleOpCompare )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1410:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3270);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1423:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1424:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1424:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1425:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3293);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1449:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1450:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1451:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3333);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3344); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1458:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1461:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1462:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1462:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt21=1;
                }
                break;
            case 37:
                {
                alt21=2;
                }
                break;
            case 38:
                {
                alt21=3;
                }
                break;
            case 39:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1463:2: kw= '>='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare3382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1470:2: kw= '<='
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpCompare3401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1477:2: kw= '>'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpCompare3420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1484:2: kw= '<'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpCompare3439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1497:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1498:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1499:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3479);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3489); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1506:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1509:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1510:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1510:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1511:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3536);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1519:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==40) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred7_InternalFXGraph()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==41) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred7_InternalFXGraph()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1519:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1519:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1519:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1524:6: ( () ( ( ruleOpOther ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1524:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1524:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1525:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1530:2: ( ( ruleOpOther ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1531:1: ( ruleOpOther )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1531:1: ( ruleOpOther )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1532:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3589);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1545:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1546:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1546:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1547:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3612);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1571:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1572:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1573:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3651);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3662); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1580:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1583:28: ( (kw= '->' | kw= '..' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1584:1: (kw= '->' | kw= '..' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1584:1: (kw= '->' | kw= '..' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            else if ( (LA23_0==41) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1585:2: kw= '->'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpOther3700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1592:2: kw= '..'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther3719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1605:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1606:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1607:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3759);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3769); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1614:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1617:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1618:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1618:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1619:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3816);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1627:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==42) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred8_InternalFXGraph()) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==24) ) {
                    int LA24_3 = input.LA(2);

                    if ( (synpred8_InternalFXGraph()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1627:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1627:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1627:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1632:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1632:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1632:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1633:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1638:2: ( ( ruleOpAdd ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1639:1: ( ruleOpAdd )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1639:1: ( ruleOpAdd )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1640:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3869);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1653:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1654:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1654:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1655:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3892);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1679:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1680:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1681:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3931);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3942); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1688:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1691:28: ( (kw= '+' | kw= '-' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1692:1: (kw= '+' | kw= '-' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1692:1: (kw= '+' | kw= '-' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            else if ( (LA25_0==24) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1693:2: kw= '+'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpAdd3980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1700:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpAdd3999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1713:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1714:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1715:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4039);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4049); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1722:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1725:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1726:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1726:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1727:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4096);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1735:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    int LA26_2 = input.LA(2);

                    if ( (synpred9_InternalFXGraph()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA26_3 = input.LA(2);

                    if ( (synpred9_InternalFXGraph()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA26_4 = input.LA(2);

                    if ( (synpred9_InternalFXGraph()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA26_5 = input.LA(2);

                    if ( (synpred9_InternalFXGraph()) ) {
                        alt26=1;
                    }


                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1735:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1735:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1735:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1740:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1740:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1740:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1741:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1746:2: ( ( ruleOpMulti ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1747:1: ( ruleOpMulti )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1747:1: ( ruleOpMulti )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1748:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4149);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1761:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1762:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1762:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1763:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4172);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1787:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1788:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1789:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4211);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4222); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1796:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1799:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1800:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1800:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt27=1;
                }
                break;
            case 43:
                {
                alt27=2;
                }
                break;
            case 44:
                {
                alt27=3;
                }
                break;
            case 45:
                {
                alt27=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1801:2: kw= '*'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpMulti4260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1808:2: kw= '**'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpMulti4279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1815:2: kw= '/'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpMulti4298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1822:2: kw= '%'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpMulti4317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1835:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1836:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1837:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4357);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4367); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1844:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1847:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1848:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1848:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24||LA28_0==42||LA28_0==46) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||LA28_0==RULE_INT||LA28_0==13||LA28_0==17||LA28_0==22||LA28_0==39||LA28_0==50||LA28_0==52||(LA28_0>=55 && LA28_0<=57)||LA28_0==61||(LA28_0>=63 && LA28_0<=70)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1848:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1848:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1848:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1848:3: ()
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1849:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1854:2: ( ( ruleOpUnary ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1855:1: ( ruleOpUnary )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1855:1: ( ruleOpUnary )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1856:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4425);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1869:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1870:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1870:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1871:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4446);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1889:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4475);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1905:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1906:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1907:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4511);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4522); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1914:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1917:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1918:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1918:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt29=1;
                }
                break;
            case 24:
                {
                alt29=2;
                }
                break;
            case 42:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1919:2: kw= '!'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpUnary4560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1926:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpUnary4579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1933:2: kw= '+'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpUnary4598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1946:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1947:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1948:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4638);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4648); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1955:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1958:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1959:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1959:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1960:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4695);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1968:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred10_InternalFXGraph()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1968:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1968:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1968:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1970:5: ( () otherlv_2= 'as' )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1970:6: () otherlv_2= 'as'
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1970:6: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1971:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXCastedExpression4730); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1980:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1981:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1981:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1982:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4753);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2006:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2007:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2008:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4791);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4801); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2015:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2018:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2019:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2019:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2020:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4848);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2028:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop37:
            do {
                int alt37=3;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (synpred11_InternalFXGraph()) ) {
                        alt37=1;
                    }
                    else if ( (synpred12_InternalFXGraph()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (synpred12_InternalFXGraph()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA37_4 = input.LA(2);

                    if ( (synpred12_InternalFXGraph()) ) {
                        alt37=2;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2028:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2028:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2028:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2028:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2028:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2034:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2034:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2034:26: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2035:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4897); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2044:1: ( ( ruleValidID ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2045:1: ( ruleValidID )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2045:1: ( ruleValidID )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2046:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4920);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4936);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2067:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2068:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2068:1: (lv_value_5_0= ruleXAssignment )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2069:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4958);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2086:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2086:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2086:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2086:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2086:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2102:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2102:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2102:8: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2103:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2108:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt31=3;
            	    switch ( input.LA(1) ) {
            	    case 27:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2108:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall5044); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2113:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2113:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2114:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2114:1: (lv_nullSafe_8_0= '?.' )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2115:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall5068); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2129:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2129:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2130:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2130:1: (lv_spreading_9_0= '*.' )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2131:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall5105); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2144:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==39) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2144:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall5134); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2148:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2149:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2149:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2150:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5155);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2166:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop32:
            	            do {
            	                int alt32=2;
            	                int LA32_0 = input.LA(1);

            	                if ( (LA32_0==19) ) {
            	                    alt32=1;
            	                }


            	                switch (alt32) {
            	            	case 1 :
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2166:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall5168); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2170:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2171:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2171:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2172:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5189);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop32;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall5203); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2192:3: ( ( ruleValidID ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2193:1: ( ruleValidID )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2193:1: ( ruleValidID )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2194:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5228);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2207:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt36=2;
            	    alt36 = dfa36.predict(input);
            	    switch (alt36) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2207:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2207:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2207:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2214:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2215:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,13,FOLLOW_13_in_ruleXMemberFeatureCall5262); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2228:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt35=3;
            	            alt35 = dfa35.predict(input);
            	            switch (alt35) {
            	                case 1 :
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2228:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2228:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2228:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2240:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2241:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5337);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2258:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2258:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2258:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2258:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2259:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2259:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2260:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5365);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2276:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop34:
            	                    do {
            	                        int alt34=2;
            	                        int LA34_0 = input.LA(1);

            	                        if ( (LA34_0==19) ) {
            	                            alt34=1;
            	                        }


            	                        switch (alt34) {
            	                    	case 1 :
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2276:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall5378); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2280:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2281:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2281:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2282:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5399);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop34;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleXMemberFeatureCall5416); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2310:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2311:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2312:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5457);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5467); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2319:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2322:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2323:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2323:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt38=13;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt38=1;
                }
                break;
            case 17:
                {
                alt38=2;
                }
                break;
            case 52:
                {
                alt38=3;
                }
                break;
            case RULE_ID:
            case 39:
            case 61:
                {
                alt38=4;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 22:
            case 64:
            case 65:
            case 66:
            case 67:
                {
                alt38=5;
                }
                break;
            case 50:
                {
                alt38=6;
                }
                break;
            case 55:
                {
                alt38=7;
                }
                break;
            case 56:
                {
                alt38=8;
                }
                break;
            case 57:
                {
                alt38=9;
                }
                break;
            case 68:
                {
                alt38=10;
                }
                break;
            case 69:
                {
                alt38=11;
                }
                break;
            case 70:
                {
                alt38=12;
                }
                break;
            case 13:
                {
                alt38=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2324:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5514);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2334:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5541);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2344:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5568);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2354:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5595);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2364:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5622);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2374:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5649);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2384:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5676);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2394:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5703);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2404:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5730);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2414:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5757);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2424:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5784);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2434:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5811);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2444:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5838);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2460:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2461:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2462:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5873);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5883); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2469:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2472:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2473:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2473:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt39=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt39=1;
                }
                break;
            case 64:
            case 65:
                {
                alt39=2;
                }
                break;
            case RULE_INT:
                {
                alt39=3;
                }
                break;
            case 66:
                {
                alt39=4;
                }
                break;
            case RULE_STRING:
                {
                alt39=5;
                }
                break;
            case 67:
                {
                alt39=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2474:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5930);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2484:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5957);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2494:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5984);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2504:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral6011);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2514:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral6038);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2524:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6065);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2540:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2541:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2542:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6100);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6110); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2549:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_formalParameters_2_0 = null;

        EObject lv_formalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2552:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2553:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2553:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2553:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2553:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2554:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleXClosure6156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2563:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==13||LA41_0==73) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2563:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2563:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2564:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2564:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2565:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6178);
                    lv_formalParameters_2_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_2_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2581:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==19) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2581:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleXClosure6191); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2585:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2586:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2586:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2587:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6212);
                    	    lv_formalParameters_4_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_4_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleXClosure6228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2607:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2608:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2608:1: (lv_expression_6_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2609:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure6249);
            lv_expression_6_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleXClosure6261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_5());
                  
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2637:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2638:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2639:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6297);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6307); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2646:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2649:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2650:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2650:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2650:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2650:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2650:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2661:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2661:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2661:6: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2662:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2667:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==13||LA43_0==73) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2667:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2667:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2668:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2668:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2669:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6405);
                    lv_formalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2685:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==19) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2685:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXShortClosure6418); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2689:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2690:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2690:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2691:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6439);
                    	    lv_formalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXShortClosure6455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2711:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2712:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2712:1: (lv_expression_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2713:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6478);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2737:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2738:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2739:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6514);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6524); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2746:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2749:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2750:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2750:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2750:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleXParenthesizedExpression6561); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6583);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXParenthesizedExpression6594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2775:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2776:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2777:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6630);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6640); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2784:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2787:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2788:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2788:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2788:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2788:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2789:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression6686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXIfExpression6698); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2802:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2803:1: (lv_if_3_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2803:1: (lv_if_3_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2804:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6719);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleXIfExpression6731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2824:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2825:1: (lv_then_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2825:1: (lv_then_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2826:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6752);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2842:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==51) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred16_InternalFXGraph()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2842:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2842:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2842:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression6773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2847:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2848:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2848:1: (lv_else_7_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2849:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6795);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2873:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2874:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2875:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6833);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6843); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2882:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2885:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2886:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2886:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2886:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2886:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2887:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2896:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==21) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2896:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2896:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2897:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2897:1: (lv_localVarName_2_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2898:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6911);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression6923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2918:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2919:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2919:1: (lv_switch_4_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2920:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6946);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression6958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2940:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID||LA46_0==13||LA46_0==21||LA46_0==54||LA46_0==73) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2941:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2941:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2942:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6979);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2958:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2958:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression7005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2966:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2967:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2967:1: (lv_default_9_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2968:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7026);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleXSwitchExpression7040); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2996:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2997:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2998:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7076);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7086); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3005:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3008:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3009:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3009:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3009:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3009:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==13||LA48_0==73) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3010:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3010:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3011:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7132);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3027:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==54) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3027:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXCasePart7146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3031:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3032:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3032:1: (lv_case_2_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3033:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7167);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXCasePart7181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3053:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3054:1: (lv_then_4_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3054:1: (lv_then_4_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3055:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7202);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3079:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3080:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3081:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7238);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7248); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3088:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3091:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3092:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3092:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3092:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3092:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3093:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXForLoopExpression7294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXForLoopExpression7306); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3106:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3107:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3107:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3108:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7327);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXForLoopExpression7339); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3128:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3129:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3129:1: (lv_forExpression_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3130:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7360);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleXForLoopExpression7372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3150:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3151:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3151:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3152:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7393);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3176:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3177:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3178:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7429);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7439); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3185:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3188:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3189:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3189:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3189:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3189:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3190:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXWhileExpression7485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXWhileExpression7497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3203:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3204:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3204:1: (lv_predicate_3_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3205:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7518);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleXWhileExpression7530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3225:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3226:1: (lv_body_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3226:1: (lv_body_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3227:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7551);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3251:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3252:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3253:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7587);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7597); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3260:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3263:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3264:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3264:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3264:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3264:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3265:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXDoWhileExpression7643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3274:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3275:1: (lv_body_2_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3275:1: (lv_body_2_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3276:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7664);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXDoWhileExpression7676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleXDoWhileExpression7688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3300:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3301:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3301:1: (lv_predicate_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3302:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7709);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleXDoWhileExpression7721); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3330:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3331:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3332:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7757);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7767); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3339:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3342:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3343:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3343:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3343:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3343:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3344:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression7813); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3353:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_ID)||LA51_0==RULE_INT||LA51_0==13||LA51_0==17||LA51_0==22||LA51_0==24||LA51_0==39||LA51_0==42||LA51_0==46||LA51_0==50||LA51_0==52||(LA51_0>=55 && LA51_0<=57)||(LA51_0>=59 && LA51_0<=61)||(LA51_0>=63 && LA51_0<=70)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3353:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3353:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3354:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3354:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3355:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7835);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3371:2: (otherlv_3= ';' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==58) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3371:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXBlockExpression7848); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXBlockExpression7864); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3387:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3388:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3389:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7900);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7910); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3396:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3399:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3400:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3400:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=59 && LA52_0<=60)) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||LA52_0==RULE_INT||LA52_0==13||LA52_0==17||LA52_0==22||LA52_0==24||LA52_0==39||LA52_0==42||LA52_0==46||LA52_0==50||LA52_0==52||(LA52_0>=55 && LA52_0<=57)||LA52_0==61||(LA52_0>=63 && LA52_0<=70)) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3401:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7957);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3411:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7984);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
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
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3427:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3428:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3429:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8019);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8029); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3436:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3439:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3440:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3440:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3440:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3440:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3441:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3446:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==59) ) {
                alt53=1;
            }
            else if ( (LA53_0==60) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3446:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3446:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3447:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3447:1: (lv_writeable_1_0= 'var' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3448:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,59,FOLLOW_59_in_ruleXVariableDeclaration8082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3462:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration8113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3466:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred17_InternalFXGraph()) ) {
                    alt54=1;
                }
                else if ( (true) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==13) && (synpred17_InternalFXGraph())) {
                alt54=1;
            }
            else if ( (LA54_0==73) && (synpred17_InternalFXGraph())) {
                alt54=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3466:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3466:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3466:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3474:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3474:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3474:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3475:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3475:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3476:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8161);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3492:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3493:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3493:1: (lv_name_4_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3494:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8182);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3511:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3511:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3512:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3512:1: (lv_name_5_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3513:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8211);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3529:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==29) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3529:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleXVariableDeclaration8225); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3533:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3534:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3534:1: (lv_right_7_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3535:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8246);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3559:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3560:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3561:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8284);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8294); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3568:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3571:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3572:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3572:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3572:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3572:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==RULE_ID||LA56_1==27||LA56_1==39) ) {
                    alt56=1;
                }
            }
            else if ( (LA56_0==13||LA56_0==73) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3573:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3573:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3574:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8340);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3590:3: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3591:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3591:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3592:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8362);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3616:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3617:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3618:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8398);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8408); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3625:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3628:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3629:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3629:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3629:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3629:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3630:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3635:2: ( ( ruleStaticQualifier ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==62) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3636:1: ( ruleStaticQualifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3636:1: ( ruleStaticQualifier )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3637:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8465);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3650:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==39) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3650:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall8479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3654:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3655:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3655:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3656:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8500);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3672:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==19) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3672:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXFeatureCall8513); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3676:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3677:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3677:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3678:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8534);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleXFeatureCall8548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3698:3: ( ( ruleIdOrSuper ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3699:1: ( ruleIdOrSuper )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3699:1: ( ruleIdOrSuper )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3700:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8573);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3713:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3713:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3713:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3713:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3720:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3721:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,13,FOLLOW_13_in_ruleXFeatureCall8607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3734:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt61=3;
                    alt61 = dfa61.predict(input);
                    switch (alt61) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3734:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3734:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3734:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3746:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3747:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8682);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3764:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3764:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3764:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3764:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3765:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3765:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3766:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8710);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3782:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==19) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3782:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleXFeatureCall8723); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3786:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3787:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3787:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3788:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8744);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop60;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleXFeatureCall8761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3816:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3817:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3818:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8800);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8811); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3825:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3828:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3829:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3829:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                alt63=1;
            }
            else if ( (LA63_0==61) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3830:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8858);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3842:2: kw= 'super'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleIdOrSuper8882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3855:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3856:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3857:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8923);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8934); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3864:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3867:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3868:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3868:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID) ) {
                    int LA64_2 = input.LA(2);

                    if ( (LA64_2==62) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3869:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8981);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,62,FOLLOW_62_in_ruleStaticQualifier8999); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
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
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3893:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3894:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3895:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9040);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9050); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3902:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3905:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3906:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3906:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3906:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3906:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3907:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXConstructorCall9096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3916:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3917:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3917:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3918:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9119);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3931:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==39) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3931:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall9132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3935:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3936:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3936:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3937:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9153);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3953:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==19) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3953:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleXConstructorCall9166); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3957:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3958:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3958:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3959:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9187);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleXConstructorCall9201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleXConstructorCall9215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3983:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt68=3;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3983:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3983:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3983:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3995:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3996:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9277);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4013:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4013:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4013:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4013:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4014:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4014:1: (lv_arguments_10_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4015:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9305);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4031:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==19) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4031:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleXConstructorCall9318); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4035:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4036:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4036:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4037:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9339);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleXConstructorCall9356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4065:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4066:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4067:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9392);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9402); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4074:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4077:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4078:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4078:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4078:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4078:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4079:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4084:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==64) ) {
                alt69=1;
            }
            else if ( (LA69_0==65) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4084:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXBooleanLiteral9449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4089:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4089:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4090:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4090:1: (lv_isTrue_2_0= 'true' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4091:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral9473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4112:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4113:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4114:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9523);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9533); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4121:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4124:28: ( ( () otherlv_1= 'null' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4125:1: ( () otherlv_1= 'null' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4125:1: ( () otherlv_1= 'null' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4125:2: () otherlv_1= 'null'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4125:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4126:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXNullLiteral9579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4143:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4144:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4145:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9615);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9625); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4152:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4155:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4156:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4156:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4156:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4156:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4157:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4162:2: ( (lv_value_1_0= RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4163:1: (lv_value_1_0= RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4163:1: (lv_value_1_0= RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4164:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
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
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4188:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4189:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4190:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9717);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9727); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4197:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4200:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4201:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4201:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4201:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4201:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4202:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4207:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4208:1: (lv_value_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4208:1: (lv_value_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4209:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4233:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4234:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4235:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9819);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9829); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4242:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4245:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4246:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4246:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4246:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4246:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4247:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXTypeLiteral9875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXTypeLiteral9887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4260:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4261:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4261:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4262:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9910);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleXTypeLiteral9922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4287:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4288:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4289:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9958);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9968); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4296:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4299:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4300:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4300:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4300:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4300:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4301:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXThrowExpression10014); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4310:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4311:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4311:1: (lv_expression_2_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4312:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10035);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4336:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4337:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4338:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10071);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10081); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4345:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4348:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4349:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4349:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4349:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4349:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4350:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXReturnExpression10127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4359:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4359:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4364:1: (lv_expression_2_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4365:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10158);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4389:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4390:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4391:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10195);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10205); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4398:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4401:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4402:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4402:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4402:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4402:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4403:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTryCatchFinallyExpression10251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4412:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4413:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4413:1: (lv_expression_2_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4414:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10272);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4430:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==72) ) {
                alt73=1;
            }
            else if ( (LA73_0==71) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4430:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4430:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4430:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4430:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==72) ) {
                            int LA71_2 = input.LA(2);

                            if ( (synpred22_InternalFXGraph()) ) {
                                alt71=1;
                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4430:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4432:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4433:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10302);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt71 >= 1 ) break loop71;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4449:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==71) ) {
                        int LA72_1 = input.LA(2);

                        if ( (synpred23_InternalFXGraph()) ) {
                            alt72=1;
                        }
                    }
                    switch (alt72) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4449:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4449:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4449:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression10324); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4454:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4455:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4455:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4456:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10346);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4473:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4473:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4473:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression10368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4477:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4478:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4478:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4479:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10389);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4503:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4504:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4505:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10427);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10437); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4512:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4515:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4516:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4516:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4516:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4516:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4516:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleXCatchClause10482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleXCatchClause10495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4525:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4526:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4526:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4527:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause10516);
            lv_declaredParam_2_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleXCatchClause10528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4547:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4548:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4548:1: (lv_expression_4_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4549:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10549);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4573:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4574:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4575:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10586);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10597); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4582:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4585:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4586:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4586:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4587:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10644);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4597:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==27) ) {
                    int LA74_1 = input.LA(2);

                    if ( (LA74_1==RULE_ID) ) {
                        int LA74_3 = input.LA(3);

                        if ( (synpred25_InternalFXGraph()) ) {
                            alt74=1;
                        }


                    }


                }


                switch (alt74) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4597:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4597:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4597:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,27,FOLLOW_27_in_ruleQualifiedName10672); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10695);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
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


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4624:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4625:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4626:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10742);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10752); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4633:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4636:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4637:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4637:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            else if ( (LA75_0==13||LA75_0==73) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4638:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10799);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4648:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10826);
                    this_XFunctionTypeRef_1=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_1; 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4664:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4665:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4666:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10861);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10871); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4673:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4676:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4677:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4677:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4677:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4677:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==13) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4677:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleXFunctionTypeRef10909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4681:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4682:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4682:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4683:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10930);
                    lv_paramTypes_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                      	        }
                             		add(
                             			current, 
                             			"paramTypes",
                              		lv_paramTypes_1_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4699:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==19) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4699:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXFunctionTypeRef10943); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4703:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4704:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4704:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4705:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10964);
                    	    lv_paramTypes_3_0=ruleJvmTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"paramTypes",
                    	              		lv_paramTypes_3_0, 
                    	              		"JvmTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleXFunctionTypeRef10978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,73,FOLLOW_73_in_ruleXFunctionTypeRef10992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4729:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4730:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4730:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4731:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11013);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4755:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4756:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4757:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11049);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11059); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4764:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4767:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4768:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4768:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4768:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4768:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4769:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4769:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4770:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11107);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4783:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4783:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4783:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4783:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleJvmParameterizedTypeReference11128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4788:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4789:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4789:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4790:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11150);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4806:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==19) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4806:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleJvmParameterizedTypeReference11163); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4810:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4811:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4811:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4812:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11184);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleJvmParameterizedTypeReference11198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4840:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4841:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4842:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11236);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11246); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4849:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4852:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4853:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4853:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID||LA80_0==13||LA80_0==73) ) {
                alt80=1;
            }
            else if ( (LA80_0==74) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4854:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11293);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4864:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11320);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4880:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4881:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4882:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11355);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11365); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4889:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4892:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4893:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4893:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4893:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4893:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4894:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleJvmWildcardTypeReference11411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4903:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt81=3;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==75) ) {
                alt81=1;
            }
            else if ( (LA81_0==61) ) {
                alt81=2;
            }
            switch (alt81) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4903:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4903:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4904:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4904:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4905:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11433);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4922:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4922:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4923:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4923:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4924:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11460);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4948:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4949:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4950:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11498);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11508); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4957:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4960:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4961:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4961:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4961:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleJvmUpperBound11545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4965:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4966:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4966:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4967:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11566);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4991:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4992:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4993:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11602);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11612); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5000:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5003:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5004:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5004:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5004:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBoundAnded11649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5008:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5009:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5009:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5010:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11670);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5034:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5035:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5036:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11706);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11716); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5043:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5046:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5047:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5047:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5047:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleJvmLowerBound11753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5051:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5052:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5052:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5053:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11774);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5079:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5080:2: (iv_ruleValidID= ruleValidID EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5081:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11813);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11824); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5088:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5091:28: (this_ID_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5092:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalFXGraph
    public final void synpred1_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:931:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:931:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:931:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:931:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:931:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:932:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:932:2: ( ( ruleOpMultiAssign ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:933:1: ( ruleOpMultiAssign )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:933:1: ( ruleOpMultiAssign )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:934:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFXGraph2023);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalFXGraph

    // $ANTLR start synpred2_InternalFXGraph
    public final void synpred2_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1059:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1059:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1059:4: ( () ( ( ruleOpOr ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1059:5: () ( ( ruleOpOr ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1059:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1060:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1060:2: ( ( ruleOpOr ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1061:1: ( ruleOpOr )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1061:1: ( ruleOpOr )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1062:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalFXGraph2371);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalFXGraph

    // $ANTLR start synpred3_InternalFXGraph
    public final void synpred3_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1160:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1160:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1160:4: ( () ( ( ruleOpAnd ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1160:5: () ( ( ruleOpAnd ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1160:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1161:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1161:2: ( ( ruleOpAnd ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1162:1: ( ruleOpAnd )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1162:1: ( ruleOpAnd )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1163:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalFXGraph2630);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalFXGraph

    // $ANTLR start synpred4_InternalFXGraph
    public final void synpred4_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1261:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1261:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1261:4: ( () ( ( ruleOpEquality ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1261:5: () ( ( ruleOpEquality ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1261:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1262:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1262:2: ( ( ruleOpEquality ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1263:1: ( ruleOpEquality )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1263:1: ( ruleOpEquality )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1264:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalFXGraph2889);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalFXGraph

    // $ANTLR start synpred5_InternalFXGraph
    public final void synpred5_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1369:4: ( ( () 'instanceof' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1369:5: ( () 'instanceof' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1369:5: ( () 'instanceof' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1369:6: () 'instanceof'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1369:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1370:1: 
        {
        }

        match(input,35,FOLLOW_35_in_synpred5_InternalFXGraph3165); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalFXGraph

    // $ANTLR start synpred6_InternalFXGraph
    public final void synpred6_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1397:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1397:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1397:9: ( () ( ( ruleOpCompare ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1397:10: () ( ( ruleOpCompare ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1397:10: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1398:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1398:2: ( ( ruleOpCompare ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1399:1: ( ruleOpCompare )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1399:1: ( ruleOpCompare )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1400:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalFXGraph3238);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalFXGraph

    // $ANTLR start synpred7_InternalFXGraph
    public final void synpred7_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1519:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1519:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1519:4: ( () ( ( ruleOpOther ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1519:5: () ( ( ruleOpOther ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1519:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1520:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1520:2: ( ( ruleOpOther ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1521:1: ( ruleOpOther )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1521:1: ( ruleOpOther )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1522:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalFXGraph3557);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalFXGraph

    // $ANTLR start synpred8_InternalFXGraph
    public final void synpred8_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1627:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1627:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1627:4: ( () ( ( ruleOpAdd ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1627:5: () ( ( ruleOpAdd ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1627:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1628:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1628:2: ( ( ruleOpAdd ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1629:1: ( ruleOpAdd )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1629:1: ( ruleOpAdd )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1630:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalFXGraph3837);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalFXGraph

    // $ANTLR start synpred9_InternalFXGraph
    public final void synpred9_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1735:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1735:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1735:4: ( () ( ( ruleOpMulti ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1735:5: () ( ( ruleOpMulti ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1735:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1736:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1736:2: ( ( ruleOpMulti ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1737:1: ( ruleOpMulti )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1737:1: ( ruleOpMulti )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1738:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalFXGraph4117);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalFXGraph

    // $ANTLR start synpred10_InternalFXGraph
    public final void synpred10_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1968:3: ( ( () 'as' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1968:4: ( () 'as' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1968:4: ( () 'as' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1968:5: () 'as'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1968:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1969:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred10_InternalFXGraph4711); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalFXGraph

    // $ANTLR start synpred11_InternalFXGraph
    public final void synpred11_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2028:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2028:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2028:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2028:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2028:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2029:1: 
        {
        }

        match(input,27,FOLLOW_27_in_synpred11_InternalFXGraph4865); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2030:1: ( ( ruleValidID ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2031:1: ( ruleValidID )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2031:1: ( ruleValidID )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2032:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalFXGraph4874);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalFXGraph4880);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalFXGraph

    // $ANTLR start synpred12_InternalFXGraph
    public final void synpred12_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2086:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2086:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2086:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2086:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2086:10: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2087:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2087:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt82=3;
        switch ( input.LA(1) ) {
        case 27:
            {
            alt82=1;
            }
            break;
        case 48:
            {
            alt82=2;
            }
            break;
        case 49:
            {
            alt82=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 82, 0, input);

            throw nvae;
        }

        switch (alt82) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2087:4: '.'
                {
                match(input,27,FOLLOW_27_in_synpred12_InternalFXGraph4983); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2089:6: ( ( '?.' ) )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2089:6: ( ( '?.' ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2090:1: ( '?.' )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2090:1: ( '?.' )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2091:2: '?.'
                {
                match(input,48,FOLLOW_48_in_synpred12_InternalFXGraph4997); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2096:6: ( ( '*.' ) )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2096:6: ( ( '*.' ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2097:1: ( '*.' )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2097:1: ( '*.' )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2098:2: '*.'
                {
                match(input,49,FOLLOW_49_in_synpred12_InternalFXGraph5017); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalFXGraph

    // $ANTLR start synpred13_InternalFXGraph
    public final void synpred13_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2207:4: ( ( '(' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2208:1: ( '(' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2208:1: ( '(' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2209:2: '('
        {
        match(input,13,FOLLOW_13_in_synpred13_InternalFXGraph5244); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalFXGraph

    // $ANTLR start synpred14_InternalFXGraph
    public final void synpred14_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2228:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2228:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2228:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2228:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2228:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2229:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2229:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==RULE_ID||LA84_0==13||LA84_0==73) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2229:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2229:3: ( ( ruleJvmFormalParameter ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2230:1: ( ruleJvmFormalParameter )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2230:1: ( ruleJvmFormalParameter )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2231:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXGraph5296);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2233:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop83:
                do {
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==19) ) {
                        alt83=1;
                    }


                    switch (alt83) {
                	case 1 :
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2233:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,19,FOLLOW_19_in_synpred14_InternalFXGraph5303); if (state.failed) return ;
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2234:1: ( ( ruleJvmFormalParameter ) )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2235:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2235:1: ( ruleJvmFormalParameter )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2236:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXGraph5310);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop83;
                    }
                } while (true);


                }
                break;

        }

        match(input,18,FOLLOW_18_in_synpred14_InternalFXGraph5320); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalFXGraph

    // $ANTLR start synpred16_InternalFXGraph
    public final void synpred16_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2842:4: ( 'else' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2842:6: 'else'
        {
        match(input,51,FOLLOW_51_in_synpred16_InternalFXGraph6765); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalFXGraph

    // $ANTLR start synpred17_InternalFXGraph
    public final void synpred17_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3466:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3466:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3466:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3466:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3466:6: ( ( ruleJvmTypeReference ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3467:1: ( ruleJvmTypeReference )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3467:1: ( ruleJvmTypeReference )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3468:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalFXGraph8131);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3470:2: ( ( ruleValidID ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3471:1: ( ruleValidID )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3471:1: ( ruleValidID )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3472:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalFXGraph8140);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalFXGraph

    // $ANTLR start synpred18_InternalFXGraph
    public final void synpred18_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3713:4: ( ( '(' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3714:1: ( '(' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3714:1: ( '(' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3715:2: '('
        {
        match(input,13,FOLLOW_13_in_synpred18_InternalFXGraph8589); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalFXGraph

    // $ANTLR start synpred19_InternalFXGraph
    public final void synpred19_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3734:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3734:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3734:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3734:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3734:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3735:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3735:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==RULE_ID||LA88_0==13||LA88_0==73) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3735:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3735:3: ( ( ruleJvmFormalParameter ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3736:1: ( ruleJvmFormalParameter )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3736:1: ( ruleJvmFormalParameter )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3737:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalFXGraph8641);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3739:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==19) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3739:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,19,FOLLOW_19_in_synpred19_InternalFXGraph8648); if (state.failed) return ;
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3740:1: ( ( ruleJvmFormalParameter ) )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3741:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3741:1: ( ruleJvmFormalParameter )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3742:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalFXGraph8655);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop87;
                    }
                } while (true);


                }
                break;

        }

        match(input,18,FOLLOW_18_in_synpred19_InternalFXGraph8665); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalFXGraph

    // $ANTLR start synpred20_InternalFXGraph
    public final void synpred20_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3983:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3983:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3983:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3983:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3983:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3984:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3984:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==13||LA90_0==73) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3984:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3984:3: ( ( ruleJvmFormalParameter ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3985:1: ( ruleJvmFormalParameter )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3985:1: ( ruleJvmFormalParameter )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3986:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFXGraph9236);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3988:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==19) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3988:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,19,FOLLOW_19_in_synpred20_InternalFXGraph9243); if (state.failed) return ;
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3989:1: ( ( ruleJvmFormalParameter ) )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3990:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3990:1: ( ruleJvmFormalParameter )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3991:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFXGraph9250);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop89;
                    }
                } while (true);


                }
                break;

        }

        match(input,18,FOLLOW_18_in_synpred20_InternalFXGraph9260); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalFXGraph

    // $ANTLR start synpred21_InternalFXGraph
    public final void synpred21_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4359:2: ( ( ruleXExpression ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4360:1: ( ruleXExpression )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4360:1: ( ruleXExpression )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4361:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalFXGraph10141);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalFXGraph

    // $ANTLR start synpred22_InternalFXGraph
    public final void synpred22_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4430:5: ( 'catch' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4430:7: 'catch'
        {
        match(input,72,FOLLOW_72_in_synpred22_InternalFXGraph10286); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalFXGraph

    // $ANTLR start synpred23_InternalFXGraph
    public final void synpred23_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4449:5: ( 'finally' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4449:7: 'finally'
        {
        match(input,71,FOLLOW_71_in_synpred23_InternalFXGraph10316); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalFXGraph

    // $ANTLR start synpred25_InternalFXGraph
    public final void synpred25_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4597:3: ( '.' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4598:2: '.'
        {
        match(input,27,FOLLOW_27_in_synpred25_InternalFXGraph10663); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalFXGraph

    // $ANTLR start synpred26_InternalFXGraph
    public final void synpred26_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4783:4: ( '<' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4783:6: '<'
        {
        match(input,39,FOLLOW_39_in_synpred26_InternalFXGraph11120); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalFXGraph

    // Delegated rules

    public final boolean synpred7_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA36 dfa36 = new DFA36(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA79 dfa79 = new DFA79(this);
    static final String DFA36_eotS =
        "\74\uffff";
    static final String DFA36_eofS =
        "\1\2\73\uffff";
    static final String DFA36_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA36_maxS =
        "\1\111\1\0\72\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA36_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA36_transitionS = {
            "\2\2\1\uffff\1\2\5\uffff\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\6\2\2\uffff\2\2\1\uffff\40\2\1\uffff\13\2",
            "\1\uffff",
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
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2207:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\34\uffff";
    static final String DFA35_eofS =
        "\34\uffff";
    static final String DFA35_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA35_maxS =
        "\1\111\2\0\31\uffff";
    static final String DFA35_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA35_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\5\1\1\1\uffff\1\5\5\uffff\1\2\1\uffff\1\33\1\uffff\1\5\1"+
            "\4\3\uffff\1\5\1\uffff\1\5\16\uffff\1\5\2\uffff\1\5\3\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\1\5\2\uffff\3\5\3\uffff\1\5\1\uffff"+
            "\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2228:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA35_0==RULE_ID) ) {s = 1;}

                        else if ( (LA35_0==13) ) {s = 2;}

                        else if ( (LA35_0==73) && (synpred14_InternalFXGraph())) {s = 3;}

                        else if ( (LA35_0==18) && (synpred14_InternalFXGraph())) {s = 4;}

                        else if ( (LA35_0==RULE_STRING||LA35_0==RULE_INT||LA35_0==17||LA35_0==22||LA35_0==24||LA35_0==39||LA35_0==42||LA35_0==46||LA35_0==50||LA35_0==52||(LA35_0>=55 && LA35_0<=57)||LA35_0==61||(LA35_0>=63 && LA35_0<=70)) ) {s = 5;}

                        else if ( (LA35_0==15) ) {s = 27;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\74\uffff";
    static final String DFA62_eofS =
        "\1\2\73\uffff";
    static final String DFA62_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA62_maxS =
        "\1\111\1\0\72\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA62_transitionS = {
            "\2\2\1\uffff\1\2\5\uffff\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\6\2\2\uffff\2\2\1\uffff\40\2\1\uffff\13\2",
            "\1\uffff",
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
            "",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "3713:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\34\uffff";
    static final String DFA61_eofS =
        "\34\uffff";
    static final String DFA61_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA61_maxS =
        "\1\111\2\0\31\uffff";
    static final String DFA61_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA61_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\5\1\1\1\uffff\1\5\5\uffff\1\2\1\uffff\1\33\1\uffff\1\5\1"+
            "\4\3\uffff\1\5\1\uffff\1\5\16\uffff\1\5\2\uffff\1\5\3\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\1\5\2\uffff\3\5\3\uffff\1\5\1\uffff"+
            "\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "3734:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==RULE_ID) ) {s = 1;}

                        else if ( (LA61_0==13) ) {s = 2;}

                        else if ( (LA61_0==73) && (synpred19_InternalFXGraph())) {s = 3;}

                        else if ( (LA61_0==18) && (synpred19_InternalFXGraph())) {s = 4;}

                        else if ( (LA61_0==RULE_STRING||LA61_0==RULE_INT||LA61_0==17||LA61_0==22||LA61_0==24||LA61_0==39||LA61_0==42||LA61_0==46||LA61_0==50||LA61_0==52||(LA61_0>=55 && LA61_0<=57)||LA61_0==61||(LA61_0>=63 && LA61_0<=70)) ) {s = 5;}

                        else if ( (LA61_0==15) ) {s = 27;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\34\uffff";
    static final String DFA68_eofS =
        "\34\uffff";
    static final String DFA68_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA68_maxS =
        "\1\111\2\0\31\uffff";
    static final String DFA68_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA68_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\5\1\1\1\uffff\1\5\5\uffff\1\2\1\uffff\1\33\1\uffff\1\5\1"+
            "\4\3\uffff\1\5\1\uffff\1\5\16\uffff\1\5\2\uffff\1\5\3\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\1\5\2\uffff\3\5\3\uffff\1\5\1\uffff"+
            "\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3983:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_0 = input.LA(1);

                         
                        int index68_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA68_0==RULE_ID) ) {s = 1;}

                        else if ( (LA68_0==13) ) {s = 2;}

                        else if ( (LA68_0==73) && (synpred20_InternalFXGraph())) {s = 3;}

                        else if ( (LA68_0==18) && (synpred20_InternalFXGraph())) {s = 4;}

                        else if ( (LA68_0==RULE_STRING||LA68_0==RULE_INT||LA68_0==17||LA68_0==22||LA68_0==24||LA68_0==39||LA68_0==42||LA68_0==46||LA68_0==50||LA68_0==52||(LA68_0>=55 && LA68_0<=57)||LA68_0==61||(LA68_0>=63 && LA68_0<=70)) ) {s = 5;}

                        else if ( (LA68_0==15) ) {s = 27;}

                         
                        input.seek(index68_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA68_2 = input.LA(1);

                         
                        int index68_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index68_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\74\uffff";
    static final String DFA70_eofS =
        "\1\31\73\uffff";
    static final String DFA70_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA70_maxS =
        "\1\111\30\0\43\uffff";
    static final String DFA70_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\17\1\1\1\uffff\1\15\5\uffff\1\30\1\uffff\1\31\1\uffff\1"+
            "\6\1\uffff\3\31\1\12\1\31\1\3\2\uffff\2\31\1\uffff\11\31\1\10"+
            "\2\31\1\4\3\31\1\2\3\31\1\21\1\31\1\7\2\31\1\22\1\23\1\24\3"+
            "\31\1\11\1\uffff\1\5\1\13\1\14\1\16\1\20\1\25\1\26\1\27\3\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "4359:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_3 = input.LA(1);

                         
                        int index70_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA70_4 = input.LA(1);

                         
                        int index70_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA70_5 = input.LA(1);

                         
                        int index70_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA70_6 = input.LA(1);

                         
                        int index70_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA70_7 = input.LA(1);

                         
                        int index70_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA70_8 = input.LA(1);

                         
                        int index70_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA70_9 = input.LA(1);

                         
                        int index70_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA70_10 = input.LA(1);

                         
                        int index70_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA70_11 = input.LA(1);

                         
                        int index70_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA70_12 = input.LA(1);

                         
                        int index70_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA70_13 = input.LA(1);

                         
                        int index70_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA70_14 = input.LA(1);

                         
                        int index70_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA70_15 = input.LA(1);

                         
                        int index70_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA70_16 = input.LA(1);

                         
                        int index70_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA70_17 = input.LA(1);

                         
                        int index70_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA70_18 = input.LA(1);

                         
                        int index70_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA70_19 = input.LA(1);

                         
                        int index70_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA70_20 = input.LA(1);

                         
                        int index70_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA70_21 = input.LA(1);

                         
                        int index70_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA70_22 = input.LA(1);

                         
                        int index70_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA70_23 = input.LA(1);

                         
                        int index70_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA70_24 = input.LA(1);

                         
                        int index70_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\76\uffff";
    static final String DFA79_eofS =
        "\1\2\75\uffff";
    static final String DFA79_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA79_maxS =
        "\1\111\1\0\74\uffff";
    static final String DFA79_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA79_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA79_transitionS = {
            "\2\2\1\uffff\1\2\5\uffff\1\2\1\uffff\12\2\2\uffff\2\2\1\uffff"+
            "\11\2\1\1\26\2\1\uffff\13\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "4783:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXGraph()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x0000000000003020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleElement349 = new BitSet(new long[]{0x0000000000032002L});
    public static final BitSet FOLLOW_13_in_ruleElement362 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElement380 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14_in_ruleElement404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElement421 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleElement440 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_ruleElement455 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleElement476 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleElement491 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_ruleElement504 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDefine_in_ruleElement525 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleElement538 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDefine_in_ruleElement559 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleElement573 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleElement596 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleElement609 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleElement630 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleElement644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleDefine737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty824 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleProperty841 = new BitSet(new long[]{0x00000000074020B0L,0x0000000000000200L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListProperty_in_rulePropertyValue955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueProperty_in_rulePropertyValue982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rulePropertyValue1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_rulePropertyValue1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeProperty_in_rulePropertyValue1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListProperty_in_entryRuleListProperty1098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListProperty1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleListProperty1145 = new BitSet(new long[]{0x00000000074020B0L,0x0000000000000200L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleListProperty1166 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_19_in_ruleListProperty1179 = new BitSet(new long[]{0x00000000074020B0L,0x0000000000000200L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleListProperty1200 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_23_in_ruleListProperty1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueProperty_in_entryRuleValueProperty1250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueProperty1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueProperty1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleValueProperty1333 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleValueProperty1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValueProperty1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty1434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceProperty1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleReferenceProperty1481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleReferenceProperty1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeProperty_in_entryRuleIncludeProperty1540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeProperty1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleIncludeProperty1587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeProperty1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1704 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleQualifiedNameWithWildCard1723 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleQualifiedNameWithWildCard1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1936 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1952 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2002 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2055 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpSingleAssign2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpMultiAssign2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2350 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2403 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2426 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOr2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2609 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2662 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2685 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAnd2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2868 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2921 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2944 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpEquality3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpEquality3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3148 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_35_in_ruleXRelationalExpression3184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3209 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3270 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3293 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpCompare3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpCompare3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpCompare3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3536 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3589 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3612 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpOther3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpOther3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3816 = new BitSet(new long[]{0x0000040001000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3869 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3892 = new BitSet(new long[]{0x0000040001000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpAdd3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpAdd3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4096 = new BitSet(new long[]{0x0000380010000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4149 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4172 = new BitSet(new long[]{0x0000380010000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpMulti4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpMulti4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpMulti4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpMulti4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4425 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpUnary4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpUnary4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpUnary4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4695 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXCastedExpression4730 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4753 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4848 = new BitSet(new long[]{0x0003000008000002L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4897 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4920 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4936 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4958 = new BitSet(new long[]{0x0003000008000002L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall5044 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall5068 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall5105 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall5134 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5155 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall5168 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5189 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall5203 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5228 = new BitSet(new long[]{0x0003000008002002L});
    public static final BitSet FOLLOW_13_in_ruleXMemberFeatureCall5262 = new BitSet(new long[]{0xA39444800146A0B0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5337 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5365 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall5378 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5399 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleXMemberFeatureCall5416 = new BitSet(new long[]{0x0003000008000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleXClosure6156 = new BitSet(new long[]{0x0000000000042020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6178 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleXClosure6191 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6212 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleXClosure6228 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure6249 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXClosure6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6405 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleXShortClosure6418 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6439 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleXShortClosure6455 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXParenthesizedExpression6561 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6583 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXParenthesizedExpression6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression6686 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXIfExpression6698 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6719 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXIfExpression6731 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6752 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression6773 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6889 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6911 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression6923 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6946 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression6958 = new BitSet(new long[]{0x0040000000202020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6979 = new BitSet(new long[]{0x0060000000302020L,0x0000000000000200L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6993 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression7005 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7026 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXSwitchExpression7040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7132 = new BitSet(new long[]{0x0040000000200000L});
    public static final BitSet FOLLOW_54_in_ruleXCasePart7146 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7167 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXCasePart7181 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXForLoopExpression7294 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXForLoopExpression7306 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7327 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXForLoopExpression7339 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7360 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXForLoopExpression7372 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXWhileExpression7485 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXWhileExpression7497 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7518 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXWhileExpression7530 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXDoWhileExpression7643 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7664 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXDoWhileExpression7676 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXDoWhileExpression7688 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7709 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXDoWhileExpression7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression7813 = new BitSet(new long[]{0xBB944480015220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7835 = new BitSet(new long[]{0xBF944480015220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_58_in_ruleXBlockExpression7848 = new BitSet(new long[]{0xBB944480015220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_20_in_ruleXBlockExpression7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXVariableDeclaration8082 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration8113 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8161 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8182 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8211 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleXVariableDeclaration8225 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8465 = new BitSet(new long[]{0x2000008000000020L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall8479 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8500 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_19_in_ruleXFeatureCall8513 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8534 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_38_in_ruleXFeatureCall8548 = new BitSet(new long[]{0x2000008000000020L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8573 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleXFeatureCall8607 = new BitSet(new long[]{0xA39444800146A0B0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8682 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8710 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleXFeatureCall8723 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8744 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleXFeatureCall8761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleIdOrSuper8882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8981 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleStaticQualifier8999 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXConstructorCall9096 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9119 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall9132 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9153 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_19_in_ruleXConstructorCall9166 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9187 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_38_in_ruleXConstructorCall9201 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXConstructorCall9215 = new BitSet(new long[]{0xA39444800146A0B0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9277 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9305 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleXConstructorCall9318 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9339 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleXConstructorCall9356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXBooleanLiteral9449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXNullLiteral9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTypeLiteral9875 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXTypeLiteral9887 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9910 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXTypeLiteral9922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXThrowExpression10014 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXReturnExpression10127 = new BitSet(new long[]{0xA3944480014220B2L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTryCatchFinallyExpression10251 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10302 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression10324 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression10368 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXCatchClause10482 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXCatchClause10495 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause10516 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXCatchClause10528 = new BitSet(new long[]{0xA3944480014220B0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10644 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleQualifiedName10672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10695 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXFunctionTypeRef10909 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10930 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleXFunctionTypeRef10943 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10964 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleXFunctionTypeRef10978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleXFunctionTypeRef10992 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11107 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleJvmParameterizedTypeReference11128 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11150 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_19_in_ruleJvmParameterizedTypeReference11163 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11184 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_38_in_ruleJvmParameterizedTypeReference11198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmWildcardTypeReference11411 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmUpperBound11545 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBoundAnded11649 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleJvmLowerBound11753 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFXGraph2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalFXGraph2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalFXGraph2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalFXGraph2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred5_InternalFXGraph3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalFXGraph3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalFXGraph3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalFXGraph3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalFXGraph4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred10_InternalFXGraph4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred11_InternalFXGraph4865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalFXGraph4874 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalFXGraph4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred12_InternalFXGraph4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred12_InternalFXGraph4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred12_InternalFXGraph5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred13_InternalFXGraph5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXGraph5296 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_synpred14_InternalFXGraph5303 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXGraph5310 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_synpred14_InternalFXGraph5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred16_InternalFXGraph6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalFXGraph8131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalFXGraph8140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred18_InternalFXGraph8589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalFXGraph8641 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_synpred19_InternalFXGraph8648 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalFXGraph8655 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_synpred19_InternalFXGraph8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFXGraph9236 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_synpred20_InternalFXGraph9243 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFXGraph9250 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_synpred20_InternalFXGraph9260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalFXGraph10141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred22_InternalFXGraph10286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_synpred23_InternalFXGraph10316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred25_InternalFXGraph10663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred26_InternalFXGraph11120 = new BitSet(new long[]{0x0000000000000002L});

}