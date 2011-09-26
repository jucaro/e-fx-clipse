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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'('", "'createdby'", "')'", "'id'", "'{'", "'|'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", "'-'", "'idref'", "'include'", "'.'", "'*'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'super'", "'::'", "'new'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
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
    public static final int RULE_INT=6;
    public static final int RULE_REAL=7;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:176:1: ruleElement returns [EObject current=null] : ( ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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

        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_defines_10_0 = null;

        EObject lv_defines_12_0 = null;

        EObject lv_properties_14_0 = null;

        EObject lv_properties_16_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:179:28: ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:180:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:180:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:180:2: ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( (lv_properties_14_0= ruleProperty ) ) (otherlv_15= ',' ( (lv_properties_16_0= ruleProperty ) ) )* otherlv_17= '}' )?
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

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:198:2: (otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:198:4: otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleElement362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getElementAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:202:1: ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_STRING||(LA2_0>=RULE_INT && LA2_0<=RULE_REAL)||(LA2_0>=24 && LA2_0<=26)) ) {
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
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:202:2: ( (lv_value_2_0= ruleSimpleValueProperty ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:202:2: ( (lv_value_2_0= ruleSimpleValueProperty ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:203:1: (lv_value_2_0= ruleSimpleValueProperty )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:203:1: (lv_value_2_0= ruleSimpleValueProperty )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:204:3: lv_value_2_0= ruleSimpleValueProperty
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementAccess().getValueSimpleValuePropertyParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSimpleValueProperty_in_ruleElement384);
                            lv_value_2_0=ruleSimpleValueProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getElementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_2_0, 
                                      		"SimpleValueProperty");
                              	        afterParserOrEnumRuleCall();
                              	    
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
                            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleElement403); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getElementAccess().getCreatedbyKeyword_1_1_1_0());
                                  
                            }
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:225:1: ( (lv_factory_4_0= RULE_STRING ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:226:1: (lv_factory_4_0= RULE_STRING )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:226:1: (lv_factory_4_0= RULE_STRING )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:227:3: lv_factory_4_0= RULE_STRING
                            {
                            lv_factory_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElement420); if (state.failed) return current;
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

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleElement439); if (state.failed) return current;
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
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleElement454); if (state.failed) return current;
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
                    pushFollow(FOLLOW_ruleValidID_in_ruleElement475);
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
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleElement490); if (state.failed) return current;
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
                            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleElement503); if (state.failed) return current;
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
                            pushFollow(FOLLOW_ruleDefine_in_ruleElement524);
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
                            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleElement537); if (state.failed) return current;
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
                            	    pushFollow(FOLLOW_ruleDefine_in_ruleElement558);
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

                            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleElement572); if (state.failed) return current;
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
                    pushFollow(FOLLOW_ruleProperty_in_ruleElement595);
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
                    	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleElement608); if (state.failed) return current;
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
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleElement629);
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

                    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleElement643); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleDefine_in_entryRuleDefine681);
            iv_ruleDefine=ruleDefine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefine691); if (state.failed) return current;

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
            pushFollow(FOLLOW_ruleElement_in_ruleDefine736);
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
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty771);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty781); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:421:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueProperty ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:424:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueProperty ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:425:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueProperty ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:425:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueProperty ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:425:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueProperty ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:425:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:426:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:426:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:427:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty823); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleProperty840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:447:1: ( (lv_value_2_0= ruleValueProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:448:1: (lv_value_2_0= ruleValueProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:448:1: (lv_value_2_0= ruleValueProperty )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:449:3: lv_value_2_0= ruleValueProperty
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getValueValuePropertyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueProperty_in_ruleProperty861);
            lv_value_2_0=ruleValueProperty();

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
                      		"ValueProperty");
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


    // $ANTLR start "entryRuleValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:473:1: entryRuleValueProperty returns [EObject current=null] : iv_ruleValueProperty= ruleValueProperty EOF ;
    public final EObject entryRuleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:474:2: (iv_ruleValueProperty= ruleValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:475:2: iv_ruleValueProperty= ruleValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleValueProperty_in_entryRuleValueProperty897);
            iv_ruleValueProperty=ruleValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueProperty907); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:482:1: ruleValueProperty returns [EObject current=null] : (this_SingleValueProperty_0= ruleSingleValueProperty | this_MultiValueProperty_1= ruleMultiValueProperty ) ;
    public final EObject ruleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValueProperty_0 = null;

        EObject this_MultiValueProperty_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:485:28: ( (this_SingleValueProperty_0= ruleSingleValueProperty | this_MultiValueProperty_1= ruleMultiValueProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:486:1: (this_SingleValueProperty_0= ruleSingleValueProperty | this_MultiValueProperty_1= ruleMultiValueProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:486:1: (this_SingleValueProperty_0= ruleSingleValueProperty | this_MultiValueProperty_1= ruleMultiValueProperty )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_REAL)||LA9_0==13||(LA9_0>=24 && LA9_0<=28)||LA9_0==73) ) {
                alt9=1;
            }
            else if ( (LA9_0==17||LA9_0==22) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:487:5: this_SingleValueProperty_0= ruleSingleValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuePropertyAccess().getSingleValuePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleValueProperty_in_ruleValueProperty954);
                    this_SingleValueProperty_0=ruleSingleValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SingleValueProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:497:5: this_MultiValueProperty_1= ruleMultiValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuePropertyAccess().getMultiValuePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMultiValueProperty_in_ruleValueProperty981);
                    this_MultiValueProperty_1=ruleMultiValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MultiValueProperty_1; 
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
    // $ANTLR end "ruleValueProperty"


    // $ANTLR start "entryRuleSingleValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:513:1: entryRuleSingleValueProperty returns [EObject current=null] : iv_ruleSingleValueProperty= ruleSingleValueProperty EOF ;
    public final EObject entryRuleSingleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:514:2: (iv_ruleSingleValueProperty= ruleSingleValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:515:2: iv_ruleSingleValueProperty= ruleSingleValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleSingleValueProperty_in_entryRuleSingleValueProperty1016);
            iv_ruleSingleValueProperty=ruleSingleValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleValueProperty1026); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleValueProperty"


    // $ANTLR start "ruleSingleValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:522:1: ruleSingleValueProperty returns [EObject current=null] : (this_SimpleValueProperty_0= ruleSimpleValueProperty | this_Element_1= ruleElement | this_ReferenceValueProperty_2= ruleReferenceValueProperty | this_IncludeValueProperty_3= ruleIncludeValueProperty ) ;
    public final EObject ruleSingleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValueProperty_0 = null;

        EObject this_Element_1 = null;

        EObject this_ReferenceValueProperty_2 = null;

        EObject this_IncludeValueProperty_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:525:28: ( (this_SimpleValueProperty_0= ruleSimpleValueProperty | this_Element_1= ruleElement | this_ReferenceValueProperty_2= ruleReferenceValueProperty | this_IncludeValueProperty_3= ruleIncludeValueProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:526:1: (this_SimpleValueProperty_0= ruleSimpleValueProperty | this_Element_1= ruleElement | this_ReferenceValueProperty_2= ruleReferenceValueProperty | this_IncludeValueProperty_3= ruleIncludeValueProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:526:1: (this_SimpleValueProperty_0= ruleSimpleValueProperty | this_Element_1= ruleElement | this_ReferenceValueProperty_2= ruleReferenceValueProperty | this_IncludeValueProperty_3= ruleIncludeValueProperty )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case 24:
            case 25:
            case 26:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
            case 13:
            case 73:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            case 28:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:527:5: this_SimpleValueProperty_0= ruleSimpleValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleValuePropertyAccess().getSimpleValuePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleValueProperty_in_ruleSingleValueProperty1073);
                    this_SimpleValueProperty_0=ruleSimpleValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimpleValueProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:537:5: this_Element_1= ruleElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleValuePropertyAccess().getElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElement_in_ruleSingleValueProperty1100);
                    this_Element_1=ruleElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Element_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:547:5: this_ReferenceValueProperty_2= ruleReferenceValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleValuePropertyAccess().getReferenceValuePropertyParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceValueProperty_in_ruleSingleValueProperty1127);
                    this_ReferenceValueProperty_2=ruleReferenceValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceValueProperty_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:557:5: this_IncludeValueProperty_3= ruleIncludeValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleValuePropertyAccess().getIncludeValuePropertyParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIncludeValueProperty_in_ruleSingleValueProperty1154);
                    this_IncludeValueProperty_3=ruleIncludeValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IncludeValueProperty_3; 
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
    // $ANTLR end "ruleSingleValueProperty"


    // $ANTLR start "entryRuleMultiValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:573:1: entryRuleMultiValueProperty returns [EObject current=null] : iv_ruleMultiValueProperty= ruleMultiValueProperty EOF ;
    public final EObject entryRuleMultiValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:574:2: (iv_ruleMultiValueProperty= ruleMultiValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:575:2: iv_ruleMultiValueProperty= ruleMultiValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleMultiValueProperty_in_entryRuleMultiValueProperty1189);
            iv_ruleMultiValueProperty=ruleMultiValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValueProperty1199); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiValueProperty"


    // $ANTLR start "ruleMultiValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:582:1: ruleMultiValueProperty returns [EObject current=null] : (this_ListValueProperty_0= ruleListValueProperty | this_MapValueProperty_1= ruleMapValueProperty ) ;
    public final EObject ruleMultiValueProperty() throws RecognitionException {
        EObject current = null;

        EObject this_ListValueProperty_0 = null;

        EObject this_MapValueProperty_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:585:28: ( (this_ListValueProperty_0= ruleListValueProperty | this_MapValueProperty_1= ruleMapValueProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:586:1: (this_ListValueProperty_0= ruleListValueProperty | this_MapValueProperty_1= ruleMapValueProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:586:1: (this_ListValueProperty_0= ruleListValueProperty | this_MapValueProperty_1= ruleMapValueProperty )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:587:5: this_ListValueProperty_0= ruleListValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiValuePropertyAccess().getListValuePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleListValueProperty_in_ruleMultiValueProperty1246);
                    this_ListValueProperty_0=ruleListValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ListValueProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:597:5: this_MapValueProperty_1= ruleMapValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiValuePropertyAccess().getMapValuePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMapValueProperty_in_ruleMultiValueProperty1273);
                    this_MapValueProperty_1=ruleMapValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MapValueProperty_1; 
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
    // $ANTLR end "ruleMultiValueProperty"


    // $ANTLR start "entryRuleListValueElement"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:613:1: entryRuleListValueElement returns [EObject current=null] : iv_ruleListValueElement= ruleListValueElement EOF ;
    public final EObject entryRuleListValueElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValueElement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:614:2: (iv_ruleListValueElement= ruleListValueElement EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:615:2: iv_ruleListValueElement= ruleListValueElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListValueElementRule()); 
            }
            pushFollow(FOLLOW_ruleListValueElement_in_entryRuleListValueElement1308);
            iv_ruleListValueElement=ruleListValueElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListValueElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListValueElement1318); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListValueElement"


    // $ANTLR start "ruleListValueElement"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:622:1: ruleListValueElement returns [EObject current=null] : (this_Element_0= ruleElement | this_ReferenceValueProperty_1= ruleReferenceValueProperty | this_IncludeValueProperty_2= ruleIncludeValueProperty ) ;
    public final EObject ruleListValueElement() throws RecognitionException {
        EObject current = null;

        EObject this_Element_0 = null;

        EObject this_ReferenceValueProperty_1 = null;

        EObject this_IncludeValueProperty_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:625:28: ( (this_Element_0= ruleElement | this_ReferenceValueProperty_1= ruleReferenceValueProperty | this_IncludeValueProperty_2= ruleIncludeValueProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:626:1: (this_Element_0= ruleElement | this_ReferenceValueProperty_1= ruleReferenceValueProperty | this_IncludeValueProperty_2= ruleIncludeValueProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:626:1: (this_Element_0= ruleElement | this_ReferenceValueProperty_1= ruleReferenceValueProperty | this_IncludeValueProperty_2= ruleIncludeValueProperty )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 13:
            case 73:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:627:5: this_Element_0= ruleElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListValueElementAccess().getElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElement_in_ruleListValueElement1365);
                    this_Element_0=ruleElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Element_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:637:5: this_ReferenceValueProperty_1= ruleReferenceValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListValueElementAccess().getReferenceValuePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceValueProperty_in_ruleListValueElement1392);
                    this_ReferenceValueProperty_1=ruleReferenceValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceValueProperty_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:647:5: this_IncludeValueProperty_2= ruleIncludeValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListValueElementAccess().getIncludeValuePropertyParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIncludeValueProperty_in_ruleListValueElement1419);
                    this_IncludeValueProperty_2=ruleIncludeValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IncludeValueProperty_2; 
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
    // $ANTLR end "ruleListValueElement"


    // $ANTLR start "entryRuleListValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:663:1: entryRuleListValueProperty returns [EObject current=null] : iv_ruleListValueProperty= ruleListValueProperty EOF ;
    public final EObject entryRuleListValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:664:2: (iv_ruleListValueProperty= ruleListValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:665:2: iv_ruleListValueProperty= ruleListValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleListValueProperty_in_entryRuleListValueProperty1454);
            iv_ruleListValueProperty=ruleListValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListValueProperty1464); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListValueProperty"


    // $ANTLR start "ruleListValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:672:1: ruleListValueProperty returns [EObject current=null] : (otherlv_0= '[' ( (lv_value_1_0= ruleListValueElement ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleListValueProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:675:28: ( (otherlv_0= '[' ( (lv_value_1_0= ruleListValueElement ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) ) )* otherlv_4= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:676:1: (otherlv_0= '[' ( (lv_value_1_0= ruleListValueElement ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) ) )* otherlv_4= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:676:1: (otherlv_0= '[' ( (lv_value_1_0= ruleListValueElement ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) ) )* otherlv_4= ']' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:676:3: otherlv_0= '[' ( (lv_value_1_0= ruleListValueElement ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleListValueProperty1501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getListValuePropertyAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:680:1: ( (lv_value_1_0= ruleListValueElement ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:681:1: (lv_value_1_0= ruleListValueElement )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:681:1: (lv_value_1_0= ruleListValueElement )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:682:3: lv_value_1_0= ruleListValueElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListValuePropertyAccess().getValueListValueElementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleListValueElement_in_ruleListValueProperty1522);
            lv_value_1_0=ruleListValueElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getListValuePropertyRule());
              	        }
                     		add(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"ListValueElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:698:2: (otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:698:4: otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleListValueProperty1535); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getListValuePropertyAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:702:1: ( (lv_value_3_0= ruleListValueElement ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:703:1: (lv_value_3_0= ruleListValueElement )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:703:1: (lv_value_3_0= ruleListValueElement )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:704:3: lv_value_3_0= ruleListValueElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getListValuePropertyAccess().getValueListValueElementParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleListValueElement_in_ruleListValueProperty1556);
            	    lv_value_3_0=ruleListValueElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getListValuePropertyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"value",
            	              		lv_value_3_0, 
            	              		"ListValueElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleListValueProperty1570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getListValuePropertyAccess().getRightSquareBracketKeyword_3());
                  
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
    // $ANTLR end "ruleListValueProperty"


    // $ANTLR start "entryRuleMapValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:732:1: entryRuleMapValueProperty returns [EObject current=null] : iv_ruleMapValueProperty= ruleMapValueProperty EOF ;
    public final EObject entryRuleMapValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:733:2: (iv_ruleMapValueProperty= ruleMapValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:734:2: iv_ruleMapValueProperty= ruleMapValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleMapValueProperty_in_entryRuleMapValueProperty1606);
            iv_ruleMapValueProperty=ruleMapValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapValueProperty1616); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapValueProperty"


    // $ANTLR start "ruleMapValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:741:1: ruleMapValueProperty returns [EObject current=null] : (otherlv_0= '{' ( (lv_properties_1_0= ruleProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleMapValueProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_1_0 = null;

        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:744:28: ( (otherlv_0= '{' ( (lv_properties_1_0= ruleProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) ) )* otherlv_4= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:745:1: (otherlv_0= '{' ( (lv_properties_1_0= ruleProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) ) )* otherlv_4= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:745:1: (otherlv_0= '{' ( (lv_properties_1_0= ruleProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) ) )* otherlv_4= '}' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:745:3: otherlv_0= '{' ( (lv_properties_1_0= ruleProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleMapValueProperty1653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMapValuePropertyAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:749:1: ( (lv_properties_1_0= ruleProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:750:1: (lv_properties_1_0= ruleProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:750:1: (lv_properties_1_0= ruleProperty )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:751:3: lv_properties_1_0= ruleProperty
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapValuePropertyAccess().getPropertiesPropertyParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleProperty_in_ruleMapValueProperty1674);
            lv_properties_1_0=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapValuePropertyRule());
              	        }
                     		add(
                     			current, 
                     			"properties",
                      		lv_properties_1_0, 
                      		"Property");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:767:2: (otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:767:4: otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleMapValueProperty1687); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getMapValuePropertyAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:771:1: ( (lv_properties_3_0= ruleProperty ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:772:1: (lv_properties_3_0= ruleProperty )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:772:1: (lv_properties_3_0= ruleProperty )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:773:3: lv_properties_3_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMapValuePropertyAccess().getPropertiesPropertyParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleMapValueProperty1708);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMapValuePropertyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_3_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleMapValueProperty1722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMapValuePropertyAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleMapValueProperty"


    // $ANTLR start "entryRuleSimpleValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:801:1: entryRuleSimpleValueProperty returns [EObject current=null] : iv_ruleSimpleValueProperty= ruleSimpleValueProperty EOF ;
    public final EObject entryRuleSimpleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:802:2: (iv_ruleSimpleValueProperty= ruleSimpleValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:803:2: iv_ruleSimpleValueProperty= ruleSimpleValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueProperty_in_entryRuleSimpleValueProperty1758);
            iv_ruleSimpleValueProperty=ruleSimpleValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValueProperty1768); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleValueProperty"


    // $ANTLR start "ruleSimpleValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:810:1: ruleSimpleValueProperty returns [EObject current=null] : ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) ) ) | ( ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) ) ) ) ;
    public final EObject ruleSimpleValueProperty() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;
        Token lv_booleanValue_1_1=null;
        Token lv_booleanValue_1_2=null;
        Token lv_negative_2_0=null;
        Token lv_intValue_3_0=null;
        Token lv_realValue_4_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:813:28: ( ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) ) ) | ( ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:814:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) ) ) | ( ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:814:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) ) ) | ( ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt18=1;
                }
                break;
            case 24:
            case 25:
                {
                alt18=2;
                }
                break;
            case RULE_INT:
            case RULE_REAL:
            case 26:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:814:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:814:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:815:1: (lv_stringValue_0_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:815:1: (lv_stringValue_0_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:816:3: lv_stringValue_0_0= RULE_STRING
                    {
                    lv_stringValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleValueProperty1810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_stringValue_0_0, grammarAccess.getSimpleValuePropertyAccess().getStringValueSTRINGTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSimpleValuePropertyRule());
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:833:6: ( ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:833:6: ( ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:834:1: ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:834:1: ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:835:1: (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:835:1: (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==24) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==25) ) {
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
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:836:3: lv_booleanValue_1_1= 'true'
                            {
                            lv_booleanValue_1_1=(Token)match(input,24,FOLLOW_24_in_ruleSimpleValueProperty1841); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_booleanValue_1_1, grammarAccess.getSimpleValuePropertyAccess().getBooleanValueTrueKeyword_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimpleValuePropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "booleanValue", lv_booleanValue_1_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:848:8: lv_booleanValue_1_2= 'false'
                            {
                            lv_booleanValue_1_2=(Token)match(input,25,FOLLOW_25_in_ruleSimpleValueProperty1870); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_booleanValue_1_2, grammarAccess.getSimpleValuePropertyAccess().getBooleanValueFalseKeyword_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimpleValuePropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "booleanValue", lv_booleanValue_1_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:864:6: ( ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:864:6: ( ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:864:7: ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:864:7: ( (lv_negative_2_0= '-' ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==26) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:865:1: (lv_negative_2_0= '-' )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:865:1: (lv_negative_2_0= '-' )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:866:3: lv_negative_2_0= '-'
                            {
                            lv_negative_2_0=(Token)match(input,26,FOLLOW_26_in_ruleSimpleValueProperty1911); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_negative_2_0, grammarAccess.getSimpleValuePropertyAccess().getNegativeHyphenMinusKeyword_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimpleValuePropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "negative", true, "-");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:879:3: ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_INT) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==RULE_REAL) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:879:4: ( (lv_intValue_3_0= RULE_INT ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:879:4: ( (lv_intValue_3_0= RULE_INT ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:880:1: (lv_intValue_3_0= RULE_INT )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:880:1: (lv_intValue_3_0= RULE_INT )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:881:3: lv_intValue_3_0= RULE_INT
                            {
                            lv_intValue_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSimpleValueProperty1943); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_intValue_3_0, grammarAccess.getSimpleValuePropertyAccess().getIntValueINTTerminalRuleCall_2_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimpleValuePropertyRule());
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
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:898:6: ( (lv_realValue_4_0= RULE_REAL ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:898:6: ( (lv_realValue_4_0= RULE_REAL ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:899:1: (lv_realValue_4_0= RULE_REAL )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:899:1: (lv_realValue_4_0= RULE_REAL )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:900:3: lv_realValue_4_0= RULE_REAL
                            {
                            lv_realValue_4_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleSimpleValueProperty1971); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_realValue_4_0, grammarAccess.getSimpleValuePropertyAccess().getRealValueREALTerminalRuleCall_2_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimpleValuePropertyRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"realValue",
                                      		lv_realValue_4_0, 
                                      		"REAL");
                              	    
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
    // $ANTLR end "ruleSimpleValueProperty"


    // $ANTLR start "entryRuleReferenceValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:924:1: entryRuleReferenceValueProperty returns [EObject current=null] : iv_ruleReferenceValueProperty= ruleReferenceValueProperty EOF ;
    public final EObject entryRuleReferenceValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:925:2: (iv_ruleReferenceValueProperty= ruleReferenceValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:926:2: iv_ruleReferenceValueProperty= ruleReferenceValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceValueProperty_in_entryRuleReferenceValueProperty2014);
            iv_ruleReferenceValueProperty=ruleReferenceValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceValueProperty2024); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceValueProperty"


    // $ANTLR start "ruleReferenceValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:933:1: ruleReferenceValueProperty returns [EObject current=null] : (otherlv_0= 'idref' ( ( ruleValidID ) ) ) ;
    public final EObject ruleReferenceValueProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:936:28: ( (otherlv_0= 'idref' ( ( ruleValidID ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:937:1: (otherlv_0= 'idref' ( ( ruleValidID ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:937:1: (otherlv_0= 'idref' ( ( ruleValidID ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:937:3: otherlv_0= 'idref' ( ( ruleValidID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleReferenceValueProperty2061); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceValuePropertyAccess().getIdrefKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:941:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:942:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:942:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:943:3: ruleValidID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceValuePropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceValuePropertyAccess().getReferenceElementCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleReferenceValueProperty2084);
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
    // $ANTLR end "ruleReferenceValueProperty"


    // $ANTLR start "entryRuleIncludeValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:964:1: entryRuleIncludeValueProperty returns [EObject current=null] : iv_ruleIncludeValueProperty= ruleIncludeValueProperty EOF ;
    public final EObject entryRuleIncludeValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:965:2: (iv_ruleIncludeValueProperty= ruleIncludeValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:966:2: iv_ruleIncludeValueProperty= ruleIncludeValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleIncludeValueProperty_in_entryRuleIncludeValueProperty2120);
            iv_ruleIncludeValueProperty=ruleIncludeValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIncludeValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeValueProperty2130); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIncludeValueProperty"


    // $ANTLR start "ruleIncludeValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:973:1: ruleIncludeValueProperty returns [EObject current=null] : (otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleIncludeValueProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_source_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:976:28: ( (otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:977:1: (otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:977:1: (otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:977:3: otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleIncludeValueProperty2167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeValuePropertyAccess().getIncludeKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:981:1: ( (lv_source_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:982:1: (lv_source_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:982:1: (lv_source_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:983:3: lv_source_1_0= RULE_STRING
            {
            lv_source_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIncludeValueProperty2184); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_source_1_0, grammarAccess.getIncludeValuePropertyAccess().getSourceSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIncludeValuePropertyRule());
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
    // $ANTLR end "ruleIncludeValueProperty"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1007:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1008:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1009:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2226);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2237); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1016:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1019:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1020:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1020:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1021:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard2284);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1031:1: (kw= '.' kw= '*' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1032:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleQualifiedNameWithWildCard2303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleQualifiedNameWithWildCard2316); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1051:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1052:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1053:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression2358);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression2368); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1060:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1063:28: (this_XAssignment_0= ruleXAssignment )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1065:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression2414);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1081:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1082:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1083:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment2448);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment2458); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1090:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1093:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1094:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1094:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==EOF||(LA21_1>=RULE_STRING && LA21_1<=RULE_INT)||LA21_1==13||LA21_1==15||LA21_1==17||(LA21_1>=19 && LA21_1<=26)||(LA21_1>=29 && LA21_1<=30)||(LA21_1>=32 && LA21_1<=73)) ) {
                    alt21=2;
                }
                else if ( (LA21_1==31) ) {
                    alt21=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==RULE_STRING||LA21_0==RULE_INT||LA21_0==13||LA21_0==17||LA21_0==22||(LA21_0>=24 && LA21_0<=26)||LA21_0==41||LA21_0==44||LA21_0==48||LA21_0==52||LA21_0==54||(LA21_0>=57 && LA21_0<=59)||LA21_0==63||(LA21_0>=65 && LA21_0<=70)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1094:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1094:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1094:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1094:3: ()
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1095:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1100:2: ( ( ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1101:1: ( ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1101:1: ( ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1102:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment2516);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2532);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1123:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1124:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1124:1: (lv_value_3_0= ruleXAssignment )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1125:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2552);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1142:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1142:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1143:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2582);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1151:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==32) ) {
                        int LA20_1 = input.LA(2);

                        if ( (synpred1_InternalFXGraph()) ) {
                            alt20=1;
                        }
                    }
                    switch (alt20) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1151:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1151:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1151:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1156:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1156:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1156:7: ()
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1157:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1162:2: ( ( ruleOpMultiAssign ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1163:1: ( ruleOpMultiAssign )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1163:1: ( ruleOpMultiAssign )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1164:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2635);
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

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1177:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1178:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1178:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1179:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2658);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1203:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1204:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1205:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2698);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2709); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1212:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1215:28: (kw= '=' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1217:2: kw= '='
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpSingleAssign2746); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1230:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1231:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1232:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2786);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2797); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1239:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1242:28: (kw= '+=' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1244:2: kw= '+='
            {
            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpMultiAssign2834); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1257:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1258:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1259:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2873);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2883); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1266:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1269:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1270:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1270:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1271:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2930);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1279:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred2_InternalFXGraph()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1279:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1279:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1279:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1284:6: ( () ( ( ruleOpOr ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1284:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1284:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1285:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1290:2: ( ( ruleOpOr ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1291:1: ( ruleOpOr )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1291:1: ( ruleOpOr )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1292:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2983);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1305:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1306:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1306:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1307:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3006);
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1331:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1332:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1333:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr3045);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr3056); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1340:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1343:28: (kw= '||' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1345:2: kw= '||'
            {
            kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOr3093); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1358:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1359:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1360:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3132);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression3142); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1367:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1370:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1371:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1371:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1372:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3189);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1380:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==34) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred3_InternalFXGraph()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1380:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1380:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1380:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1385:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1385:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1385:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1386:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1391:2: ( ( ruleOpAnd ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1392:1: ( ruleOpAnd )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1392:1: ( ruleOpAnd )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1393:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression3242);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1406:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1407:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1407:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1408:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3265);
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
            	    break loop23;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1432:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1433:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1434:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd3304);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd3315); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1441:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1444:28: (kw= '&&' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1446:2: kw= '&&'
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAnd3352); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1459:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1460:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1461:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3391);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression3401); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1468:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1471:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1472:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1472:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1473:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3448);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1481:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred4_InternalFXGraph()) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==36) ) {
                    int LA24_3 = input.LA(2);

                    if ( (synpred4_InternalFXGraph()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1481:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1481:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1481:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1486:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1486:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1486:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1487:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1492:2: ( ( ruleOpEquality ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1493:1: ( ruleOpEquality )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1493:1: ( ruleOpEquality )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1494:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3501);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1507:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1508:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1508:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1509:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3524);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1533:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1534:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1535:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3563);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3574); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1542:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1545:28: ( (kw= '==' | kw= '!=' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1546:1: (kw= '==' | kw= '!=' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1546:1: (kw= '==' | kw= '!=' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            else if ( (LA25_0==36) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1547:2: kw= '=='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpEquality3612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1554:2: kw= '!='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpEquality3631); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1567:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1568:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1569:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3671);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3681); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1576:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1579:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1580:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1580:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1581:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3728);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1589:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop26:
            do {
                int alt26=3;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA26_2 = input.LA(2);

                    if ( (synpred5_InternalFXGraph()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA26_3 = input.LA(2);

                    if ( (synpred6_InternalFXGraph()) ) {
                        alt26=2;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA26_4 = input.LA(2);

                    if ( (synpred6_InternalFXGraph()) ) {
                        alt26=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA26_5 = input.LA(2);

                    if ( (synpred6_InternalFXGraph()) ) {
                        alt26=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA26_6 = input.LA(2);

                    if ( (synpred6_InternalFXGraph()) ) {
                        alt26=2;
                    }


                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1589:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1589:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1589:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1589:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1589:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1591:5: ( () otherlv_2= 'instanceof' )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1591:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1591:6: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1592:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXRelationalExpression3764); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1601:3: ( ( ruleQualifiedName ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1602:1: ( ruleQualifiedName )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1602:1: ( ruleQualifiedName )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1603:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3789);
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
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1617:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1617:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1617:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1617:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1617:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1622:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1622:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1622:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1623:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1628:2: ( ( ruleOpCompare ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1629:1: ( ruleOpCompare )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1629:1: ( ruleOpCompare )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1630:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3850);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1643:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1644:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1644:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1645:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3873);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1669:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1670:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1671:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3913);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3924); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1678:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1681:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1682:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1682:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt27=1;
                }
                break;
            case 39:
                {
                alt27=2;
                }
                break;
            case 40:
                {
                alt27=3;
                }
                break;
            case 41:
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1683:2: kw= '>='
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpCompare3962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1690:2: kw= '<='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpCompare3981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1697:2: kw= '>'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpCompare4000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1704:2: kw= '<'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpCompare4019); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1717:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1718:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1719:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4059);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4069); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1726:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1729:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1730:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1730:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1731:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4116);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1739:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred7_InternalFXGraph()) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==43) ) {
                    int LA28_3 = input.LA(2);

                    if ( (synpred7_InternalFXGraph()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1739:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1739:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1739:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1744:6: ( () ( ( ruleOpOther ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1744:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1744:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1745:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1750:2: ( ( ruleOpOther ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1751:1: ( ruleOpOther )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1751:1: ( ruleOpOther )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1752:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4169);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1765:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1766:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1766:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1767:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4192);
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
            	    break loop28;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1791:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1792:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1793:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther4231);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther4242); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1800:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1803:28: ( (kw= '->' | kw= '..' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1804:1: (kw= '->' | kw= '..' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1804:1: (kw= '->' | kw= '..' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            else if ( (LA29_0==43) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1805:2: kw= '->'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpOther4280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1812:2: kw= '..'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpOther4299); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1825:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1826:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1827:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4339);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4349); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1834:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1837:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1838:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1838:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1839:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4396);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1847:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==44) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred8_InternalFXGraph()) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==26) ) {
                    int LA30_3 = input.LA(2);

                    if ( (synpred8_InternalFXGraph()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1847:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1847:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1847:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1852:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1852:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1852:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1853:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1858:2: ( ( ruleOpAdd ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1859:1: ( ruleOpAdd )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1859:1: ( ruleOpAdd )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1860:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4449);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1873:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1874:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1874:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1875:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4472);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1899:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1900:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1901:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd4511);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd4522); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1908:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1911:28: ( (kw= '+' | kw= '-' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1912:1: (kw= '+' | kw= '-' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1912:1: (kw= '+' | kw= '-' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            else if ( (LA31_0==26) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1913:2: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpAdd4560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1920:2: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpAdd4579); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1933:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1934:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1935:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4619);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4629); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1942:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1945:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1946:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1946:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1947:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4676);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1955:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop32:
            do {
                int alt32=2;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred9_InternalFXGraph()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred9_InternalFXGraph()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (synpred9_InternalFXGraph()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA32_5 = input.LA(2);

                    if ( (synpred9_InternalFXGraph()) ) {
                        alt32=1;
                    }


                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1955:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1955:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1955:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1960:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1960:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1960:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1961:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1966:2: ( ( ruleOpMulti ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1967:1: ( ruleOpMulti )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1967:1: ( ruleOpMulti )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1968:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4729);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1981:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1982:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1982:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1983:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4752);
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
            	    break loop32;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2007:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2008:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2009:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4791);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4802); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2016:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2019:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2020:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2020:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt33=1;
                }
                break;
            case 45:
                {
                alt33=2;
                }
                break;
            case 46:
                {
                alt33=3;
                }
                break;
            case 47:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2021:2: kw= '*'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpMulti4840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2028:2: kw= '**'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpMulti4859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2035:2: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpMulti4878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2042:2: kw= '%'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpMulti4897); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2055:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2056:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2057:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4937);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4947); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2064:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2067:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2068:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2068:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26||LA34_0==44||LA34_0==48) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_INT)||LA34_0==13||LA34_0==17||LA34_0==22||(LA34_0>=24 && LA34_0<=25)||LA34_0==41||LA34_0==52||LA34_0==54||(LA34_0>=57 && LA34_0<=59)||LA34_0==63||(LA34_0>=65 && LA34_0<=70)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2068:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2068:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2068:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2068:3: ()
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2069:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2074:2: ( ( ruleOpUnary ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2075:1: ( ruleOpUnary )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2075:1: ( ruleOpUnary )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2076:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5005);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2089:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2090:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2090:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2091:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5026);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2109:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5055);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2125:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2126:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2127:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary5091);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary5102); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2134:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2137:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2138:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2138:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt35=1;
                }
                break;
            case 26:
                {
                alt35=2;
                }
                break;
            case 44:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2139:2: kw= '!'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpUnary5140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2146:2: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpUnary5159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2153:2: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpUnary5178); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2166:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2167:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2168:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5218);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression5228); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2175:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2178:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2179:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2179:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2180:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5275);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2188:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==49) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred10_InternalFXGraph()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2188:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2188:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2188:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2190:5: ( () otherlv_2= 'as' )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2190:6: () otherlv_2= 'as'
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2190:6: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2191:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXCastedExpression5310); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2200:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2201:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2201:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2202:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5333);
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
            	    break loop36;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2226:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2227:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2228:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5371);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall5381); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2235:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2238:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2239:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2239:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2240:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5428);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2248:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop43:
            do {
                int alt43=3;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    int LA43_2 = input.LA(2);

                    if ( (synpred11_InternalFXGraph()) ) {
                        alt43=1;
                    }
                    else if ( (synpred12_InternalFXGraph()) ) {
                        alt43=2;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA43_3 = input.LA(2);

                    if ( (synpred12_InternalFXGraph()) ) {
                        alt43=2;
                    }


                    }
                    break;
                case 51:
                    {
                    int LA43_4 = input.LA(2);

                    if ( (synpred12_InternalFXGraph()) ) {
                        alt43=2;
                    }


                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2248:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2248:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2248:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2248:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2248:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2254:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2254:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2254:26: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2255:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall5477); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2264:1: ( ( ruleValidID ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2265:1: ( ruleValidID )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2265:1: ( ruleValidID )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2266:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5500);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5516);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2287:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2288:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2288:1: (lv_value_5_0= ruleXAssignment )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2289:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5538);
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
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2306:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2306:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2306:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2306:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2306:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2322:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2322:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2322:8: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2323:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2328:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt37=3;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt37=1;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt37=2;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt37=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt37) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2328:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall5624); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2333:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2333:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2334:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2334:1: (lv_nullSafe_8_0= '?.' )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2335:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall5648); if (state.failed) return current;
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
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2349:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2349:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2350:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2350:1: (lv_spreading_9_0= '*.' )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2351:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,51,FOLLOW_51_in_ruleXMemberFeatureCall5685); if (state.failed) return current;
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

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2364:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==41) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2364:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall5714); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2368:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2369:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2369:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2370:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5735);
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

            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2386:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop38:
            	            do {
            	                int alt38=2;
            	                int LA38_0 = input.LA(1);

            	                if ( (LA38_0==19) ) {
            	                    alt38=1;
            	                }


            	                switch (alt38) {
            	            	case 1 :
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2386:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall5748); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2390:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2391:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2391:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2392:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5769);
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
            	            	    break loop38;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall5783); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2412:3: ( ( ruleValidID ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2413:1: ( ruleValidID )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2413:1: ( ruleValidID )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2414:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5808);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2427:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt42=2;
            	    alt42 = dfa42.predict(input);
            	    switch (alt42) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2427:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2427:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2427:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2434:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2435:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,13,FOLLOW_13_in_ruleXMemberFeatureCall5842); if (state.failed) return current;
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

            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2448:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt41=3;
            	            alt41 = dfa41.predict(input);
            	            switch (alt41) {
            	                case 1 :
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2448:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2448:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2448:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2460:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2461:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5917);
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
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2478:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2478:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2478:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2478:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2479:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2479:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2480:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5945);
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

            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2496:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop40:
            	                    do {
            	                        int alt40=2;
            	                        int LA40_0 = input.LA(1);

            	                        if ( (LA40_0==19) ) {
            	                            alt40=1;
            	                        }


            	                        switch (alt40) {
            	                    	case 1 :
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2496:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall5958); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2500:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2501:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2501:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2502:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5979);
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
            	                    	    break loop40;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleXMemberFeatureCall5996); if (state.failed) return current;
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
            	    break loop43;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2530:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2531:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2532:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6037);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression6047); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2539:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2542:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2543:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2543:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt44=13;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt44=1;
                }
                break;
            case 17:
                {
                alt44=2;
                }
                break;
            case 54:
                {
                alt44=3;
                }
                break;
            case RULE_ID:
            case 41:
            case 63:
                {
                alt44=4;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 22:
            case 24:
            case 25:
            case 66:
            case 67:
                {
                alt44=5;
                }
                break;
            case 52:
                {
                alt44=6;
                }
                break;
            case 57:
                {
                alt44=7;
                }
                break;
            case 58:
                {
                alt44=8;
                }
                break;
            case 59:
                {
                alt44=9;
                }
                break;
            case 68:
                {
                alt44=10;
                }
                break;
            case 69:
                {
                alt44=11;
                }
                break;
            case 70:
                {
                alt44=12;
                }
                break;
            case 13:
                {
                alt44=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2544:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression6094);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2554:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6121);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2564:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6148);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2574:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6175);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2584:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6202);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2594:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6229);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2604:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6256);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2614:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6283);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2624:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6310);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2634:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6337);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2644:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6364);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2654:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6391);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2664:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6418);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2680:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2681:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2682:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral6453);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral6463); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2689:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2692:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2693:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2693:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt45=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt45=1;
                }
                break;
            case 24:
            case 25:
                {
                alt45=2;
                }
                break;
            case RULE_INT:
                {
                alt45=3;
                }
                break;
            case 66:
                {
                alt45=4;
                }
                break;
            case RULE_STRING:
                {
                alt45=5;
                }
                break;
            case 67:
                {
                alt45=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2694:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral6510);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2704:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6537);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2714:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral6564);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2724:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral6591);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2734:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral6618);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2744:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6645);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2760:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2761:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2762:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure6680);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure6690); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2769:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2772:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2773:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2773:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2773:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2773:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2774:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleXClosure6736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2783:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||LA47_0==13||LA47_0==73) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2783:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2783:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2784:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2784:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2785:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6758);
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

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2801:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==19) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2801:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleXClosure6771); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2805:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2806:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2806:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2807:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6792);
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
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleXClosure6808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2827:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2828:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2828:1: (lv_expression_6_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2829:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure6829);
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

            otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleXClosure6841); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2857:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2858:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2859:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6877);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6887); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2866:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2869:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2870:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2870:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2870:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2870:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2870:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2881:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2881:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2881:6: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2882:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2887:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||LA49_0==13||LA49_0==73) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2887:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2887:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2888:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2888:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2889:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6985);
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

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2905:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==19) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2905:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXShortClosure6998); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2909:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2910:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2910:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2911:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7019);
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
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXShortClosure7035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2931:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2932:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2932:1: (lv_expression_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2933:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure7058);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2957:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2958:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2959:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7094);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression7104); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2966:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2969:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2970:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2970:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2970:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleXParenthesizedExpression7141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7163);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXParenthesizedExpression7174); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2995:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2996:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2997:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7210);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression7220); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3004:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3007:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3008:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3008:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3008:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3008:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3009:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXIfExpression7266); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXIfExpression7278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3022:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3023:1: (lv_if_3_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3023:1: (lv_if_3_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3024:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7299);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleXIfExpression7311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3044:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3045:1: (lv_then_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3045:1: (lv_then_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3046:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7332);
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

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3062:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==53) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred16_InternalFXGraph()) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3062:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3062:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3062:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleXIfExpression7353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3067:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3068:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3068:1: (lv_else_7_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3069:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7375);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3093:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3094:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3095:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7413);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7423); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3102:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3105:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3106:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3106:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3106:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3106:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3107:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression7469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3116:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==21) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3116:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3116:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3117:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3117:1: (lv_localVarName_2_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3118:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7491);
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

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression7503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3138:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3139:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3139:1: (lv_switch_4_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3140:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7526);
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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression7538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3160:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID||LA52_0==13||LA52_0==21||LA52_0==56||LA52_0==73) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3161:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3161:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3162:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7559);
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
            	    if ( cnt52 >= 1 ) break loop52;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3178:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3178:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression7573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression7585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3186:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3187:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3187:1: (lv_default_9_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3188:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7606);
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

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleXSwitchExpression7620); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3216:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3217:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3218:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7656);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7666); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3225:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3228:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3229:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3229:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3229:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3229:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID||LA54_0==13||LA54_0==73) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3230:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3230:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3231:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7712);
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

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3247:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==56) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3247:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart7726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3251:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3252:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3252:1: (lv_case_2_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3253:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7747);
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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXCasePart7761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3273:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3274:1: (lv_then_4_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3274:1: (lv_then_4_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3275:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7782);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3299:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3300:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3301:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7818);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7828); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3308:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3311:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3312:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3312:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3312:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3312:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3313:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXForLoopExpression7874); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXForLoopExpression7886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3326:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3327:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3327:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3328:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7907);
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

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXForLoopExpression7919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3348:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3349:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3349:1: (lv_forExpression_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3350:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7940);
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleXForLoopExpression7952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3370:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3371:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3371:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3372:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7973);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3396:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3397:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3398:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8009);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression8019); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3405:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3408:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3409:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3409:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3409:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3409:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3410:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXWhileExpression8065); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXWhileExpression8077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3423:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3424:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3424:1: (lv_predicate_3_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3425:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8098);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleXWhileExpression8110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3445:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3446:1: (lv_body_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3446:1: (lv_body_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3447:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8131);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3471:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3472:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3473:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8167);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression8177); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3480:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3483:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3484:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3484:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3484:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3484:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3485:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression8223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3494:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3495:1: (lv_body_2_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3495:1: (lv_body_2_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3496:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8244);
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

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression8256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleXDoWhileExpression8268); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3520:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3521:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3521:1: (lv_predicate_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3522:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8289);
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

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleXDoWhileExpression8301); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3550:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3551:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3552:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8337);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8347); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3559:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3562:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3563:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3563:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3563:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3563:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3564:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression8393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3573:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_INT)||LA57_0==13||LA57_0==17||LA57_0==22||(LA57_0>=24 && LA57_0<=26)||LA57_0==41||LA57_0==44||LA57_0==48||LA57_0==52||LA57_0==54||(LA57_0>=57 && LA57_0<=59)||(LA57_0>=61 && LA57_0<=63)||(LA57_0>=65 && LA57_0<=70)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3573:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3573:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3574:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3574:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3575:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8415);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3591:2: (otherlv_3= ';' )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==60) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3591:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXBlockExpression8428); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXBlockExpression8444); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3607:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3608:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3609:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8480);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8490); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3616:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3619:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3620:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3620:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=61 && LA58_0<=62)) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_INT)||LA58_0==13||LA58_0==17||LA58_0==22||(LA58_0>=24 && LA58_0<=26)||LA58_0==41||LA58_0==44||LA58_0==48||LA58_0==52||LA58_0==54||(LA58_0>=57 && LA58_0<=59)||LA58_0==63||(LA58_0>=65 && LA58_0<=70)) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3621:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8537);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3631:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8564);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3647:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3648:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3649:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8599);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8609); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3656:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3659:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3660:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3660:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3660:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3660:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3661:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3666:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==61) ) {
                alt59=1;
            }
            else if ( (LA59_0==62) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3666:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3666:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3667:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3667:1: (lv_writeable_1_0= 'var' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3668:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration8662); if (state.failed) return current;
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3682:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration8693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3686:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (synpred17_InternalFXGraph()) ) {
                    alt60=1;
                }
                else if ( (true) ) {
                    alt60=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA60_0==13) && (synpred17_InternalFXGraph())) {
                alt60=1;
            }
            else if ( (LA60_0==73) && (synpred17_InternalFXGraph())) {
                alt60=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3686:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3686:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3686:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3694:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3694:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3694:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3695:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3695:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3696:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8741);
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

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3712:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3713:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3713:1: (lv_name_4_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3714:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8762);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3731:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3731:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3732:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3732:1: (lv_name_5_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3733:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8791);
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

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3749:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==31) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3749:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXVariableDeclaration8805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3753:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3754:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3754:1: (lv_right_7_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3755:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8826);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3779:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3780:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3781:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8864);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8874); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3788:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3791:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3792:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3792:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3792:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3792:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==RULE_ID||LA62_1==29||LA62_1==41) ) {
                    alt62=1;
                }
            }
            else if ( (LA62_0==13||LA62_0==73) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3793:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3793:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3794:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8920);
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

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3810:3: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3811:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3811:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3812:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8942);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3836:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3837:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3838:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8978);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8988); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3845:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3848:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3849:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3849:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3849:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3849:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3850:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3855:2: ( ( ruleStaticQualifier ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==64) ) {
                    alt63=1;
                }
            }
            switch (alt63) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3856:1: ( ruleStaticQualifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3856:1: ( ruleStaticQualifier )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3857:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9045);
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

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3870:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==41) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3870:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall9059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3874:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3875:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3875:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3876:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9080);
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

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3892:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==19) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3892:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXFeatureCall9093); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3896:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3897:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3897:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3898:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9114);
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
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall9128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3918:3: ( ( ruleIdOrSuper ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3919:1: ( ruleIdOrSuper )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3919:1: ( ruleIdOrSuper )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3920:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9153);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3933:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3933:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3933:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3933:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3940:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3941:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,13,FOLLOW_13_in_ruleXFeatureCall9187); if (state.failed) return current;
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

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3954:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt67=3;
                    alt67 = dfa67.predict(input);
                    switch (alt67) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3954:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3954:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3954:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3966:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3967:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9262);
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
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3984:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3984:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3984:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3984:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3985:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3985:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3986:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9290);
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

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4002:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==19) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4002:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleXFeatureCall9303); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4006:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4007:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4007:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4008:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9324);
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
                            	    break loop66;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleXFeatureCall9341); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4036:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4037:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4038:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9380);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9391); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4045:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4048:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4049:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4049:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                alt69=1;
            }
            else if ( (LA69_0==63) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4050:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9438);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4062:2: kw= 'super'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleIdOrSuper9462); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4075:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4076:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4077:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9503);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9514); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4084:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4087:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4088:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4088:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt70=0;
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==RULE_ID) ) {
                    int LA70_2 = input.LA(2);

                    if ( (LA70_2==64) ) {
                        alt70=1;
                    }


                }


                switch (alt70) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4089:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9561);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,64,FOLLOW_64_in_ruleStaticQualifier9579); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt70 >= 1 ) break loop70;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(70, input);
                        throw eee;
                }
                cnt70++;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4113:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4114:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4115:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9620);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9630); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4122:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4125:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4126:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4126:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4126:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4126:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4127:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXConstructorCall9676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4136:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4137:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4137:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4138:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9699);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4151:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==41) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4151:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall9712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4155:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4156:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4156:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4157:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9733);
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

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4173:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==19) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4173:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleXConstructorCall9746); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4177:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4178:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4178:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4179:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9767);
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
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleXConstructorCall9781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleXConstructorCall9795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4203:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt74=3;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4203:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4203:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4203:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4215:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4216:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9857);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4233:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4233:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4233:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4233:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4234:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4234:1: (lv_arguments_10_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4235:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9885);
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

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4251:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==19) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4251:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleXConstructorCall9898); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4255:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4256:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4256:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4257:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9919);
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
                    	    break loop73;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleXConstructorCall9936); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4285:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4286:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4287:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9972);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9982); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4294:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4297:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4298:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4298:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4298:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4298:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4299:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4304:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==25) ) {
                alt75=1;
            }
            else if ( (LA75_0==24) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4304:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleXBooleanLiteral10029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4309:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4309:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4310:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4310:1: (lv_isTrue_2_0= 'true' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4311:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,24,FOLLOW_24_in_ruleXBooleanLiteral10053); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4332:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4333:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4334:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10103);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10113); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4341:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4344:28: ( ( () otherlv_1= 'null' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4345:1: ( () otherlv_1= 'null' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4345:1: ( () otherlv_1= 'null' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4345:2: () otherlv_1= 'null'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4345:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4346:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXNullLiteral10159); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4363:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4364:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4365:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral10195);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral10205); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4372:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4375:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4376:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4376:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4376:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4376:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4377:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4382:2: ( (lv_value_1_0= RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4383:1: (lv_value_1_0= RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4383:1: (lv_value_1_0= RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4384:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral10256); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4408:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4409:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4410:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10297);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10307); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4417:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4420:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4421:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4421:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4421:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4421:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4422:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4427:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4428:1: (lv_value_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4428:1: (lv_value_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4429:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10358); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4453:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4454:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4455:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10399);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10409); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4462:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4465:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4466:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4466:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4466:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4466:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4467:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXTypeLiteral10455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXTypeLiteral10467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4480:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4481:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4481:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4482:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10490);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleXTypeLiteral10502); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4507:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4508:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4509:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10538);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10548); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4516:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4519:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4520:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4520:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4520:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4520:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4521:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXThrowExpression10594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4530:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4531:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4531:1: (lv_expression_2_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4532:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10615);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4556:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4557:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4558:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10651);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10661); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4565:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4568:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4569:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4569:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4569:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4569:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4570:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXReturnExpression10707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4579:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4579:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4584:1: (lv_expression_2_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4585:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10738);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4609:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4610:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4611:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10775);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10785); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4618:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4621:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4622:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4622:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4622:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4622:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4623:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTryCatchFinallyExpression10831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4632:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4633:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4633:1: (lv_expression_2_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4634:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10852);
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

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4650:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==72) ) {
                alt79=1;
            }
            else if ( (LA79_0==71) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4650:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4650:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4650:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4650:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==72) ) {
                            int LA77_2 = input.LA(2);

                            if ( (synpred22_InternalFXGraph()) ) {
                                alt77=1;
                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4650:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4652:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4653:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10882);
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
                    	    if ( cnt77 >= 1 ) break loop77;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4669:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==71) ) {
                        int LA78_1 = input.LA(2);

                        if ( (synpred23_InternalFXGraph()) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4669:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4669:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4669:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression10904); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4674:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4675:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4675:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4676:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10926);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4693:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4693:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4693:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression10948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4697:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4698:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4698:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4699:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10969);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4723:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4724:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4725:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11007);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11017); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4732:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4735:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4736:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4736:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4736:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4736:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4736:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleXCatchClause11062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleXCatchClause11075); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4745:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4746:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4746:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4747:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause11096);
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleXCatchClause11108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4767:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4768:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4768:1: (lv_expression_4_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4769:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11129);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4793:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4794:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4795:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11166);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11177); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4802:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4805:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4806:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4806:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4807:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11224);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4817:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==29) ) {
                    int LA80_1 = input.LA(2);

                    if ( (LA80_1==RULE_ID) ) {
                        int LA80_3 = input.LA(3);

                        if ( (synpred25_InternalFXGraph()) ) {
                            alt80=1;
                        }


                    }


                }


                switch (alt80) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4817:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4817:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4817:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleQualifiedName11252); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11275);
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
            	    break loop80;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4844:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4845:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4846:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11322);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11332); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4853:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4856:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4857:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4857:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==13||LA81_0==73) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4858:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11379);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4868:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11406);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4884:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4885:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4886:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11441);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11451); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4893:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4896:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4897:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4897:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4897:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4897:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==13) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4897:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleXFunctionTypeRef11489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4901:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4902:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4902:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4903:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11510);
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

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4919:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==19) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4919:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXFunctionTypeRef11523); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4923:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4924:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4924:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4925:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11544);
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
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleXFunctionTypeRef11558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,73,FOLLOW_73_in_ruleXFunctionTypeRef11572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4949:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4950:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4950:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4951:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11593);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4975:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4976:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4977:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11629);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11639); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4984:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4987:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4988:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4988:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4988:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4988:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4989:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4989:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4990:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11687);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5003:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5003:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5003:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5003:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleJvmParameterizedTypeReference11708); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5008:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5009:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5009:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5010:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11730);
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

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5026:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==19) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5026:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleJvmParameterizedTypeReference11743); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5030:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5031:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5031:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5032:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11764);
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
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleJvmParameterizedTypeReference11778); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5060:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5061:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5062:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11816);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11826); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5069:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5072:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5073:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5073:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID||LA86_0==13||LA86_0==73) ) {
                alt86=1;
            }
            else if ( (LA86_0==74) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5074:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11873);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5084:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11900);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5100:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5101:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5102:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11935);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11945); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5109:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5112:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5113:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5113:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5113:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5113:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5114:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleJvmWildcardTypeReference11991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5123:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==75) ) {
                alt87=1;
            }
            else if ( (LA87_0==63) ) {
                alt87=2;
            }
            switch (alt87) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5123:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5123:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5124:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5124:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5125:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12013);
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
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5142:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5142:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5143:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5143:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5144:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12040);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5168:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5169:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5170:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12078);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12088); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5177:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5180:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5181:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5181:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5181:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleJvmUpperBound12125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5185:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5186:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5186:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5187:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12146);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5211:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5212:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5213:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12182);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12192); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5220:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5223:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5224:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5224:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5224:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBoundAnded12229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5228:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5229:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5229:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5230:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12250);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5254:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5255:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5256:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12286);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12296); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5263:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5266:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5267:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5267:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5267:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleJvmLowerBound12333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5271:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5272:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5272:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5273:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12354);
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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5299:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5300:2: (iv_ruleValidID= ruleValidID EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5301:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12393);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12404); if (state.failed) return current;

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
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5308:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5311:28: (this_ID_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5312:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12443); if (state.failed) return current;
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
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1151:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1151:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1151:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1151:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1151:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1152:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1152:2: ( ( ruleOpMultiAssign ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1153:1: ( ruleOpMultiAssign )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1153:1: ( ruleOpMultiAssign )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1154:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFXGraph2603);
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
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1279:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1279:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1279:4: ( () ( ( ruleOpOr ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1279:5: () ( ( ruleOpOr ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1279:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1280:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1280:2: ( ( ruleOpOr ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1281:1: ( ruleOpOr )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1281:1: ( ruleOpOr )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1282:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalFXGraph2951);
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
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1380:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1380:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1380:4: ( () ( ( ruleOpAnd ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1380:5: () ( ( ruleOpAnd ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1380:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1381:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1381:2: ( ( ruleOpAnd ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1382:1: ( ruleOpAnd )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1382:1: ( ruleOpAnd )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1383:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalFXGraph3210);
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
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1481:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1481:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1481:4: ( () ( ( ruleOpEquality ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1481:5: () ( ( ruleOpEquality ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1481:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1482:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1482:2: ( ( ruleOpEquality ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1483:1: ( ruleOpEquality )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1483:1: ( ruleOpEquality )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1484:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalFXGraph3469);
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
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1589:4: ( ( () 'instanceof' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1589:5: ( () 'instanceof' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1589:5: ( () 'instanceof' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1589:6: () 'instanceof'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1589:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1590:1: 
        {
        }

        match(input,37,FOLLOW_37_in_synpred5_InternalFXGraph3745); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalFXGraph

    // $ANTLR start synpred6_InternalFXGraph
    public final void synpred6_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1617:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1617:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1617:9: ( () ( ( ruleOpCompare ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1617:10: () ( ( ruleOpCompare ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1617:10: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1618:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1618:2: ( ( ruleOpCompare ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1619:1: ( ruleOpCompare )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1619:1: ( ruleOpCompare )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1620:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalFXGraph3818);
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
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1739:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1739:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1739:4: ( () ( ( ruleOpOther ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1739:5: () ( ( ruleOpOther ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1739:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1740:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1740:2: ( ( ruleOpOther ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1741:1: ( ruleOpOther )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1741:1: ( ruleOpOther )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1742:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalFXGraph4137);
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
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1847:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1847:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1847:4: ( () ( ( ruleOpAdd ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1847:5: () ( ( ruleOpAdd ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1847:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1848:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1848:2: ( ( ruleOpAdd ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1849:1: ( ruleOpAdd )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1849:1: ( ruleOpAdd )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1850:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalFXGraph4417);
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
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1955:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1955:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1955:4: ( () ( ( ruleOpMulti ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1955:5: () ( ( ruleOpMulti ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1955:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1956:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1956:2: ( ( ruleOpMulti ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1957:1: ( ruleOpMulti )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1957:1: ( ruleOpMulti )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1958:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalFXGraph4697);
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
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2188:3: ( ( () 'as' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2188:4: ( () 'as' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2188:4: ( () 'as' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2188:5: () 'as'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2188:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2189:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred10_InternalFXGraph5291); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalFXGraph

    // $ANTLR start synpred11_InternalFXGraph
    public final void synpred11_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2248:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2248:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2248:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2248:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2248:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2249:1: 
        {
        }

        match(input,29,FOLLOW_29_in_synpred11_InternalFXGraph5445); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2250:1: ( ( ruleValidID ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2251:1: ( ruleValidID )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2251:1: ( ruleValidID )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2252:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalFXGraph5454);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalFXGraph5460);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalFXGraph

    // $ANTLR start synpred12_InternalFXGraph
    public final void synpred12_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2306:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2306:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2306:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2306:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2306:10: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2307:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2307:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt88=3;
        switch ( input.LA(1) ) {
        case 29:
            {
            alt88=1;
            }
            break;
        case 50:
            {
            alt88=2;
            }
            break;
        case 51:
            {
            alt88=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 88, 0, input);

            throw nvae;
        }

        switch (alt88) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2307:4: '.'
                {
                match(input,29,FOLLOW_29_in_synpred12_InternalFXGraph5563); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2309:6: ( ( '?.' ) )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2309:6: ( ( '?.' ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2310:1: ( '?.' )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2310:1: ( '?.' )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2311:2: '?.'
                {
                match(input,50,FOLLOW_50_in_synpred12_InternalFXGraph5577); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2316:6: ( ( '*.' ) )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2316:6: ( ( '*.' ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2317:1: ( '*.' )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2317:1: ( '*.' )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2318:2: '*.'
                {
                match(input,51,FOLLOW_51_in_synpred12_InternalFXGraph5597); if (state.failed) return ;

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
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2427:4: ( ( '(' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2428:1: ( '(' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2428:1: ( '(' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2429:2: '('
        {
        match(input,13,FOLLOW_13_in_synpred13_InternalFXGraph5824); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalFXGraph

    // $ANTLR start synpred14_InternalFXGraph
    public final void synpred14_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2448:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2448:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2448:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2448:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2448:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2449:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2449:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==13||LA90_0==73) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2449:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2449:3: ( ( ruleJvmFormalParameter ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2450:1: ( ruleJvmFormalParameter )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2450:1: ( ruleJvmFormalParameter )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2451:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXGraph5876);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2453:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==19) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2453:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,19,FOLLOW_19_in_synpred14_InternalFXGraph5883); if (state.failed) return ;
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2454:1: ( ( ruleJvmFormalParameter ) )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2455:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2455:1: ( ruleJvmFormalParameter )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2456:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXGraph5890);
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

        match(input,18,FOLLOW_18_in_synpred14_InternalFXGraph5900); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalFXGraph

    // $ANTLR start synpred16_InternalFXGraph
    public final void synpred16_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3062:4: ( 'else' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3062:6: 'else'
        {
        match(input,53,FOLLOW_53_in_synpred16_InternalFXGraph7345); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalFXGraph

    // $ANTLR start synpred17_InternalFXGraph
    public final void synpred17_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3686:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3686:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3686:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3686:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3686:6: ( ( ruleJvmTypeReference ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3687:1: ( ruleJvmTypeReference )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3687:1: ( ruleJvmTypeReference )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3688:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalFXGraph8711);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3690:2: ( ( ruleValidID ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3691:1: ( ruleValidID )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3691:1: ( ruleValidID )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3692:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalFXGraph8720);
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
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3933:4: ( ( '(' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3934:1: ( '(' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3934:1: ( '(' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3935:2: '('
        {
        match(input,13,FOLLOW_13_in_synpred18_InternalFXGraph9169); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalFXGraph

    // $ANTLR start synpred19_InternalFXGraph
    public final void synpred19_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3954:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3954:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3954:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3954:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3954:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3955:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3955:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==RULE_ID||LA94_0==13||LA94_0==73) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3955:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3955:3: ( ( ruleJvmFormalParameter ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3956:1: ( ruleJvmFormalParameter )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3956:1: ( ruleJvmFormalParameter )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3957:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalFXGraph9221);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3959:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop93:
                do {
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==19) ) {
                        alt93=1;
                    }


                    switch (alt93) {
                	case 1 :
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3959:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,19,FOLLOW_19_in_synpred19_InternalFXGraph9228); if (state.failed) return ;
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3960:1: ( ( ruleJvmFormalParameter ) )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3961:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3961:1: ( ruleJvmFormalParameter )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3962:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalFXGraph9235);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop93;
                    }
                } while (true);


                }
                break;

        }

        match(input,18,FOLLOW_18_in_synpred19_InternalFXGraph9245); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalFXGraph

    // $ANTLR start synpred20_InternalFXGraph
    public final void synpred20_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4203:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4203:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4203:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4203:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4203:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4204:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4204:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==13||LA96_0==73) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4204:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4204:3: ( ( ruleJvmFormalParameter ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4205:1: ( ruleJvmFormalParameter )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4205:1: ( ruleJvmFormalParameter )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4206:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFXGraph9816);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4208:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==19) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4208:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,19,FOLLOW_19_in_synpred20_InternalFXGraph9823); if (state.failed) return ;
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4209:1: ( ( ruleJvmFormalParameter ) )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4210:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4210:1: ( ruleJvmFormalParameter )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4211:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFXGraph9830);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);


                }
                break;

        }

        match(input,18,FOLLOW_18_in_synpred20_InternalFXGraph9840); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalFXGraph

    // $ANTLR start synpred21_InternalFXGraph
    public final void synpred21_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4579:2: ( ( ruleXExpression ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4580:1: ( ruleXExpression )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4580:1: ( ruleXExpression )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4581:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalFXGraph10721);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalFXGraph

    // $ANTLR start synpred22_InternalFXGraph
    public final void synpred22_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4650:5: ( 'catch' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4650:7: 'catch'
        {
        match(input,72,FOLLOW_72_in_synpred22_InternalFXGraph10866); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalFXGraph

    // $ANTLR start synpred23_InternalFXGraph
    public final void synpred23_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4669:5: ( 'finally' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4669:7: 'finally'
        {
        match(input,71,FOLLOW_71_in_synpred23_InternalFXGraph10896); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalFXGraph

    // $ANTLR start synpred25_InternalFXGraph
    public final void synpred25_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4817:3: ( '.' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4818:2: '.'
        {
        match(input,29,FOLLOW_29_in_synpred25_InternalFXGraph11243); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalFXGraph

    // $ANTLR start synpred26_InternalFXGraph
    public final void synpred26_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5003:4: ( '<' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5003:6: '<'
        {
        match(input,41,FOLLOW_41_in_synpred26_InternalFXGraph11700); if (state.failed) return ;

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


    protected DFA42 dfa42 = new DFA42(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA85 dfa85 = new DFA85(this);
    static final String DFA42_eotS =
        "\74\uffff";
    static final String DFA42_eofS =
        "\1\2\73\uffff";
    static final String DFA42_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA42_maxS =
        "\1\111\1\0\72\uffff";
    static final String DFA42_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA42_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA42_transitionS = {
            "\3\2\6\uffff\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\10\2\2\uffff"+
            "\2\2\1\uffff\40\2\1\uffff\11\2",
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

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "2427:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_1 = input.LA(1);

                         
                        int index42_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index42_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\34\uffff";
    static final String DFA41_eofS =
        "\34\uffff";
    static final String DFA41_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA41_maxS =
        "\1\111\2\0\31\uffff";
    static final String DFA41_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA41_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\5\1\1\1\5\6\uffff\1\2\1\uffff\1\33\1\uffff\1\5\1\4\3\uffff"+
            "\1\5\1\uffff\3\5\16\uffff\1\5\2\uffff\1\5\3\uffff\1\5\3\uffff"+
            "\1\5\1\uffff\1\5\2\uffff\3\5\3\uffff\1\5\1\uffff\6\5\2\uffff"+
            "\1\3",
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "2448:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_0 = input.LA(1);

                         
                        int index41_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA41_0==RULE_ID) ) {s = 1;}

                        else if ( (LA41_0==13) ) {s = 2;}

                        else if ( (LA41_0==73) && (synpred14_InternalFXGraph())) {s = 3;}

                        else if ( (LA41_0==18) && (synpred14_InternalFXGraph())) {s = 4;}

                        else if ( (LA41_0==RULE_STRING||LA41_0==RULE_INT||LA41_0==17||LA41_0==22||(LA41_0>=24 && LA41_0<=26)||LA41_0==41||LA41_0==44||LA41_0==48||LA41_0==52||LA41_0==54||(LA41_0>=57 && LA41_0<=59)||LA41_0==63||(LA41_0>=65 && LA41_0<=70)) ) {s = 5;}

                        else if ( (LA41_0==15) ) {s = 27;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\74\uffff";
    static final String DFA68_eofS =
        "\1\2\73\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA68_maxS =
        "\1\111\1\0\72\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA68_transitionS = {
            "\3\2\6\uffff\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\10\2\2\uffff"+
            "\2\2\1\uffff\40\2\1\uffff\11\2",
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
            return "3933:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
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
    static final String DFA67_eotS =
        "\34\uffff";
    static final String DFA67_eofS =
        "\34\uffff";
    static final String DFA67_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA67_maxS =
        "\1\111\2\0\31\uffff";
    static final String DFA67_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA67_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\5\1\1\1\5\6\uffff\1\2\1\uffff\1\33\1\uffff\1\5\1\4\3\uffff"+
            "\1\5\1\uffff\3\5\16\uffff\1\5\2\uffff\1\5\3\uffff\1\5\3\uffff"+
            "\1\5\1\uffff\1\5\2\uffff\3\5\3\uffff\1\5\1\uffff\6\5\2\uffff"+
            "\1\3",
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

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3954:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_0 = input.LA(1);

                         
                        int index67_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_0==RULE_ID) ) {s = 1;}

                        else if ( (LA67_0==13) ) {s = 2;}

                        else if ( (LA67_0==73) && (synpred19_InternalFXGraph())) {s = 3;}

                        else if ( (LA67_0==18) && (synpred19_InternalFXGraph())) {s = 4;}

                        else if ( (LA67_0==RULE_STRING||LA67_0==RULE_INT||LA67_0==17||LA67_0==22||(LA67_0>=24 && LA67_0<=26)||LA67_0==41||LA67_0==44||LA67_0==48||LA67_0==52||LA67_0==54||(LA67_0>=57 && LA67_0<=59)||LA67_0==63||(LA67_0>=65 && LA67_0<=70)) ) {s = 5;}

                        else if ( (LA67_0==15) ) {s = 27;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\34\uffff";
    static final String DFA74_eofS =
        "\34\uffff";
    static final String DFA74_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA74_maxS =
        "\1\111\2\0\31\uffff";
    static final String DFA74_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA74_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\5\1\1\1\5\6\uffff\1\2\1\uffff\1\33\1\uffff\1\5\1\4\3\uffff"+
            "\1\5\1\uffff\3\5\16\uffff\1\5\2\uffff\1\5\3\uffff\1\5\3\uffff"+
            "\1\5\1\uffff\1\5\2\uffff\3\5\3\uffff\1\5\1\uffff\6\5\2\uffff"+
            "\1\3",
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

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "4203:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_0 = input.LA(1);

                         
                        int index74_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA74_0==RULE_ID) ) {s = 1;}

                        else if ( (LA74_0==13) ) {s = 2;}

                        else if ( (LA74_0==73) && (synpred20_InternalFXGraph())) {s = 3;}

                        else if ( (LA74_0==18) && (synpred20_InternalFXGraph())) {s = 4;}

                        else if ( (LA74_0==RULE_STRING||LA74_0==RULE_INT||LA74_0==17||LA74_0==22||(LA74_0>=24 && LA74_0<=26)||LA74_0==41||LA74_0==44||LA74_0==48||LA74_0==52||LA74_0==54||(LA74_0>=57 && LA74_0<=59)||LA74_0==63||(LA74_0>=65 && LA74_0<=70)) ) {s = 5;}

                        else if ( (LA74_0==15) ) {s = 27;}

                         
                        input.seek(index74_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA76_eotS =
        "\74\uffff";
    static final String DFA76_eofS =
        "\1\31\73\uffff";
    static final String DFA76_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA76_maxS =
        "\1\111\30\0\43\uffff";
    static final String DFA76_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\17\1\1\1\15\6\uffff\1\30\1\uffff\1\31\1\uffff\1\6\1\uffff"+
            "\3\31\1\12\1\31\1\14\1\13\1\3\2\uffff\2\31\1\uffff\11\31\1\10"+
            "\2\31\1\4\3\31\1\2\3\31\1\21\1\31\1\7\2\31\1\22\1\23\1\24\3"+
            "\31\1\11\1\uffff\1\5\1\16\1\20\1\25\1\26\1\27\3\31",
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

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "4579:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_2 = input.LA(1);

                         
                        int index76_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_3 = input.LA(1);

                         
                        int index76_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_4 = input.LA(1);

                         
                        int index76_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA76_5 = input.LA(1);

                         
                        int index76_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA76_6 = input.LA(1);

                         
                        int index76_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA76_7 = input.LA(1);

                         
                        int index76_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA76_8 = input.LA(1);

                         
                        int index76_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA76_9 = input.LA(1);

                         
                        int index76_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA76_10 = input.LA(1);

                         
                        int index76_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA76_11 = input.LA(1);

                         
                        int index76_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA76_12 = input.LA(1);

                         
                        int index76_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA76_13 = input.LA(1);

                         
                        int index76_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA76_14 = input.LA(1);

                         
                        int index76_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA76_15 = input.LA(1);

                         
                        int index76_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA76_16 = input.LA(1);

                         
                        int index76_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA76_17 = input.LA(1);

                         
                        int index76_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA76_18 = input.LA(1);

                         
                        int index76_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA76_19 = input.LA(1);

                         
                        int index76_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA76_20 = input.LA(1);

                         
                        int index76_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA76_21 = input.LA(1);

                         
                        int index76_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA76_22 = input.LA(1);

                         
                        int index76_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA76_23 = input.LA(1);

                         
                        int index76_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA76_24 = input.LA(1);

                         
                        int index76_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index76_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\76\uffff";
    static final String DFA85_eofS =
        "\1\2\75\uffff";
    static final String DFA85_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA85_maxS =
        "\1\111\1\0\74\uffff";
    static final String DFA85_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA85_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA85_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\14\2\2\uffff\2\2\1\uffff\11\2\1\1"+
            "\26\2\1\uffff\11\2",
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

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "5003:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_1 = input.LA(1);

                         
                        int index85_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXGraph()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index85_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
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
    public static final BitSet FOLLOW_13_in_ruleElement362 = new BitSet(new long[]{0x00000000070040D0L});
    public static final BitSet FOLLOW_ruleSimpleValueProperty_in_ruleElement384 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14_in_ruleElement403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElement420 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleElement439 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_ruleElement454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleElement475 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleElement490 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_ruleElement503 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDefine_in_ruleElement524 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleElement537 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDefine_in_ruleElement558 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleElement572 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleElement595 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleElement608 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleElement629 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleElement643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleDefine736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty823 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleProperty840 = new BitSet(new long[]{0x000000001F4220F0L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleValueProperty_in_ruleProperty861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueProperty_in_entryRuleValueProperty897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueProperty907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueProperty_in_ruleValueProperty954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueProperty_in_ruleValueProperty981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueProperty_in_entryRuleSingleValueProperty1016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleValueProperty1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueProperty_in_ruleSingleValueProperty1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleSingleValueProperty1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValueProperty_in_ruleSingleValueProperty1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeValueProperty_in_ruleSingleValueProperty1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueProperty_in_entryRuleMultiValueProperty1189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValueProperty1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValueProperty_in_ruleMultiValueProperty1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapValueProperty_in_ruleMultiValueProperty1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValueElement_in_entryRuleListValueElement1308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListValueElement1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleListValueElement1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValueProperty_in_ruleListValueElement1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeValueProperty_in_ruleListValueElement1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValueProperty_in_entryRuleListValueProperty1454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListValueProperty1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleListValueProperty1501 = new BitSet(new long[]{0x000000001F0020F0L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleListValueElement_in_ruleListValueProperty1522 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_19_in_ruleListValueProperty1535 = new BitSet(new long[]{0x000000001F0020F0L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleListValueElement_in_ruleListValueProperty1556 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_23_in_ruleListValueProperty1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapValueProperty_in_entryRuleMapValueProperty1606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapValueProperty1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMapValueProperty1653 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleMapValueProperty1674 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleMapValueProperty1687 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleMapValueProperty1708 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleMapValueProperty1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueProperty_in_entryRuleSimpleValueProperty1758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValueProperty1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleValueProperty1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSimpleValueProperty1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSimpleValueProperty1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSimpleValueProperty1911 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSimpleValueProperty1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleSimpleValueProperty1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValueProperty_in_entryRuleReferenceValueProperty2014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceValueProperty2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleReferenceValueProperty2061 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleReferenceValueProperty2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeValueProperty_in_entryRuleIncludeValueProperty2120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeValueProperty2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleIncludeValueProperty2167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeValueProperty2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard2284 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleQualifiedNameWithWildCard2303 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleQualifiedNameWithWildCard2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression2358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment2448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment2516 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2532 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2582 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2635 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpSingleAssign2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpMultiAssign2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2930 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2983 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3006 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr3045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOr3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3189 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression3242 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3265 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd3304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAnd3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3448 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3501 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3524 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpEquality3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpEquality3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3728 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_37_in_ruleXRelationalExpression3764 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression3789 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3850 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3873 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpCompare3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpCompare3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpCompare4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpCompare4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4116 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4169 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4192 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther4231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpOther4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpOther4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4396 = new BitSet(new long[]{0x0000100004000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4449 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4472 = new BitSet(new long[]{0x0000100004000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd4511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpAdd4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpAdd4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4676 = new BitSet(new long[]{0x0000E00040000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4729 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4752 = new BitSet(new long[]{0x0000E00040000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpMulti4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpMulti4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpMulti4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpMulti4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5005 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary5091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpUnary5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpUnary5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpUnary5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5275 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXCastedExpression5310 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5333 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5428 = new BitSet(new long[]{0x000C000020000002L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall5477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5500 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5516 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5538 = new BitSet(new long[]{0x000C000020000002L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall5624 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall5648 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_51_in_ruleXMemberFeatureCall5685 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall5714 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5735 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall5748 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall5769 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall5783 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5808 = new BitSet(new long[]{0x000C000020002002L});
    public static final BitSet FOLLOW_13_in_ruleXMemberFeatureCall5842 = new BitSet(new long[]{0x8E5112000746A070L,0x000000000000027EL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5917 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5945 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall5958 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5979 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleXMemberFeatureCall5996 = new BitSet(new long[]{0x000C000020000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral6453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral6591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure6680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure6690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleXClosure6736 = new BitSet(new long[]{0x0000000000042020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6758 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleXClosure6771 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6792 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleXClosure6808 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure6829 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXClosure6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6985 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleXShortClosure6998 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7019 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleXShortClosure7035 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXParenthesizedExpression7141 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7163 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXParenthesizedExpression7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXIfExpression7266 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXIfExpression7278 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7299 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXIfExpression7311 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7332 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXIfExpression7353 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression7469 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7491 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression7503 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7526 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression7538 = new BitSet(new long[]{0x0100000000202020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7559 = new BitSet(new long[]{0x0180000000302020L,0x0000000000000200L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression7573 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression7585 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7606 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXSwitchExpression7620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7712 = new BitSet(new long[]{0x0100000000200000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart7726 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7747 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXCasePart7761 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXForLoopExpression7874 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXForLoopExpression7886 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7907 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXForLoopExpression7919 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7940 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXForLoopExpression7952 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression8019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXWhileExpression8065 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXWhileExpression8077 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8098 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXWhileExpression8110 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression8223 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8244 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression8256 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXDoWhileExpression8268 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8289 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXDoWhileExpression8301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression8393 = new BitSet(new long[]{0xEE51120007522070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8415 = new BitSet(new long[]{0xFE51120007522070L,0x000000000000007EL});
    public static final BitSet FOLLOW_60_in_ruleXBlockExpression8428 = new BitSet(new long[]{0xEE51120007522070L,0x000000000000007EL});
    public static final BitSet FOLLOW_20_in_ruleXBlockExpression8444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration8662 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration8693 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8762 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8791 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleXVariableDeclaration8805 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8920 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9045 = new BitSet(new long[]{0x8000020000000020L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall9059 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9080 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_19_in_ruleXFeatureCall9093 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9114 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall9128 = new BitSet(new long[]{0x8000020000000020L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9153 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleXFeatureCall9187 = new BitSet(new long[]{0x8E5112000746A070L,0x000000000000027EL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9262 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9290 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleXFeatureCall9303 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9324 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleXFeatureCall9341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleIdOrSuper9462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleStaticQualifier9579 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXConstructorCall9676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9699 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall9712 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9733 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_19_in_ruleXConstructorCall9746 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9767 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_40_in_ruleXConstructorCall9781 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXConstructorCall9795 = new BitSet(new long[]{0x8E5112000746A070L,0x000000000000027EL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9857 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9885 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleXConstructorCall9898 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9919 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleXConstructorCall9936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleXBooleanLiteral10029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleXBooleanLiteral10053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXNullLiteral10159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral10195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral10205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral10256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTypeLiteral10455 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXTypeLiteral10467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10490 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXTypeLiteral10502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXThrowExpression10594 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXReturnExpression10707 = new BitSet(new long[]{0x8E51120007422072L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTryCatchFinallyExpression10831 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10882 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression10904 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression10948 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXCatchClause11062 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXCatchClause11075 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause11096 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXCatchClause11108 = new BitSet(new long[]{0x8E51120007422070L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11224 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleQualifiedName11252 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11275 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXFunctionTypeRef11489 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11510 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleXFunctionTypeRef11523 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11544 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleXFunctionTypeRef11558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleXFunctionTypeRef11572 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11687 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleJvmParameterizedTypeReference11708 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11730 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_19_in_ruleJvmParameterizedTypeReference11743 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11764 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_40_in_ruleJvmParameterizedTypeReference11778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmWildcardTypeReference11991 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmUpperBound12125 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBoundAnded12229 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleJvmLowerBound12333 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFXGraph2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalFXGraph2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalFXGraph3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalFXGraph3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred5_InternalFXGraph3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalFXGraph3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalFXGraph4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalFXGraph4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalFXGraph4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred10_InternalFXGraph5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred11_InternalFXGraph5445 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalFXGraph5454 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalFXGraph5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred12_InternalFXGraph5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred12_InternalFXGraph5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred12_InternalFXGraph5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred13_InternalFXGraph5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXGraph5876 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_synpred14_InternalFXGraph5883 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXGraph5890 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_synpred14_InternalFXGraph5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred16_InternalFXGraph7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalFXGraph8711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalFXGraph8720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred18_InternalFXGraph9169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalFXGraph9221 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_synpred19_InternalFXGraph9228 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalFXGraph9235 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_synpred19_InternalFXGraph9245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFXGraph9816 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_synpred20_InternalFXGraph9823 = new BitSet(new long[]{0x0000000000002020L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFXGraph9830 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_synpred20_InternalFXGraph9840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalFXGraph10721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred22_InternalFXGraph10866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_synpred23_InternalFXGraph10896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred25_InternalFXGraph11243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred26_InternalFXGraph11700 = new BitSet(new long[]{0x0000000000000002L});

}