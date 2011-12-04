package at.bestsolution.efxclipse.tooling.fxml2.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.efxclipse.tooling.fxml2.services.FXMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFXMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_STRING", "RULE_ID", "RULE_ANY_OTHER", "RULE_WS", "RULE_INT", "RULE_SL_COMMENT", "'<?xml'", "'version='", "'encoding='", "'?>'", "'<?'", "'<'", "'>'", "'</'", "'/>'", "':'", "'='", "'.'", "'*'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=6;
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
    public static final int RULE_ANY_OTHER=7;
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
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=9;
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
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=4;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
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
    public static final int RULE_WS=8;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalFXMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFXMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFXMLParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g"; }



     	private FXMLGrammarAccess grammarAccess;
     	
        public InternalFXMLParser(TokenStream input, FXMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected FXMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_xmlDec_0_0= ruleXMLDec ) ) ( (lv_comments_1_0= RULE_ML_COMMENT ) )* ( (lv_imports_2_0= ruleProcessingInstruction ) )+ ( (lv_comments_3_0= RULE_ML_COMMENT ) )* ( (lv_root_4_0= ruleClassDefinition ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_comments_1_0=null;
        Token lv_comments_3_0=null;
        AntlrDatatypeRuleToken lv_xmlDec_0_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_root_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:79:28: ( ( ( (lv_xmlDec_0_0= ruleXMLDec ) ) ( (lv_comments_1_0= RULE_ML_COMMENT ) )* ( (lv_imports_2_0= ruleProcessingInstruction ) )+ ( (lv_comments_3_0= RULE_ML_COMMENT ) )* ( (lv_root_4_0= ruleClassDefinition ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:80:1: ( ( (lv_xmlDec_0_0= ruleXMLDec ) ) ( (lv_comments_1_0= RULE_ML_COMMENT ) )* ( (lv_imports_2_0= ruleProcessingInstruction ) )+ ( (lv_comments_3_0= RULE_ML_COMMENT ) )* ( (lv_root_4_0= ruleClassDefinition ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:80:1: ( ( (lv_xmlDec_0_0= ruleXMLDec ) ) ( (lv_comments_1_0= RULE_ML_COMMENT ) )* ( (lv_imports_2_0= ruleProcessingInstruction ) )+ ( (lv_comments_3_0= RULE_ML_COMMENT ) )* ( (lv_root_4_0= ruleClassDefinition ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:80:2: ( (lv_xmlDec_0_0= ruleXMLDec ) ) ( (lv_comments_1_0= RULE_ML_COMMENT ) )* ( (lv_imports_2_0= ruleProcessingInstruction ) )+ ( (lv_comments_3_0= RULE_ML_COMMENT ) )* ( (lv_root_4_0= ruleClassDefinition ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:80:2: ( (lv_xmlDec_0_0= ruleXMLDec ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:81:1: (lv_xmlDec_0_0= ruleXMLDec )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:81:1: (lv_xmlDec_0_0= ruleXMLDec )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:82:3: lv_xmlDec_0_0= ruleXMLDec
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getXmlDecXMLDecParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXMLDec_in_ruleModel131);
            lv_xmlDec_0_0=ruleXMLDec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
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

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:98:2: ( (lv_comments_1_0= RULE_ML_COMMENT ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ML_COMMENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:99:1: (lv_comments_1_0= RULE_ML_COMMENT )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:99:1: (lv_comments_1_0= RULE_ML_COMMENT )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:100:3: lv_comments_1_0= RULE_ML_COMMENT
            	    {
            	    lv_comments_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleModel148); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_comments_1_0, grammarAccess.getModelAccess().getCommentsML_COMMENTTerminalRuleCall_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getModelRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"comments",
            	              		lv_comments_1_0, 
            	              		"ML_COMMENT");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:116:3: ( (lv_imports_2_0= ruleProcessingInstruction ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:117:1: (lv_imports_2_0= ruleProcessingInstruction )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:117:1: (lv_imports_2_0= ruleProcessingInstruction )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:118:3: lv_imports_2_0= ruleProcessingInstruction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsProcessingInstructionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProcessingInstruction_in_ruleModel175);
            	    lv_imports_2_0=ruleProcessingInstruction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"ProcessingInstruction");
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

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:134:3: ( (lv_comments_3_0= RULE_ML_COMMENT ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ML_COMMENT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:135:1: (lv_comments_3_0= RULE_ML_COMMENT )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:135:1: (lv_comments_3_0= RULE_ML_COMMENT )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:136:3: lv_comments_3_0= RULE_ML_COMMENT
            	    {
            	    lv_comments_3_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleModel193); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_comments_3_0, grammarAccess.getModelAccess().getCommentsML_COMMENTTerminalRuleCall_3_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getModelRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"comments",
            	              		lv_comments_3_0, 
            	              		"ML_COMMENT");
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:152:3: ( (lv_root_4_0= ruleClassDefinition ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:153:1: (lv_root_4_0= ruleClassDefinition )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:153:1: (lv_root_4_0= ruleClassDefinition )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:154:3: lv_root_4_0= ruleClassDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getRootClassDefinitionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleClassDefinition_in_ruleModel220);
            lv_root_4_0=ruleClassDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"root",
                      		lv_root_4_0, 
                      		"ClassDefinition");
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


    // $ANTLR start "entryRuleXMLDec"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:178:1: entryRuleXMLDec returns [String current=null] : iv_ruleXMLDec= ruleXMLDec EOF ;
    public final String entryRuleXMLDec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXMLDec = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:179:2: (iv_ruleXMLDec= ruleXMLDec EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:180:2: iv_ruleXMLDec= ruleXMLDec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMLDecRule()); 
            }
            pushFollow(FOLLOW_ruleXMLDec_in_entryRuleXMLDec257);
            iv_ruleXMLDec=ruleXMLDec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMLDec.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMLDec268); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:187:1: ruleXMLDec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<?xml' kw= 'version=' this_STRING_2= RULE_STRING kw= 'encoding=' this_STRING_4= RULE_STRING kw= '?>' ) ;
    public final AntlrDatatypeRuleToken ruleXMLDec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;
        Token this_STRING_4=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:190:28: ( (kw= '<?xml' kw= 'version=' this_STRING_2= RULE_STRING kw= 'encoding=' this_STRING_4= RULE_STRING kw= '?>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:191:1: (kw= '<?xml' kw= 'version=' this_STRING_2= RULE_STRING kw= 'encoding=' this_STRING_4= RULE_STRING kw= '?>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:191:1: (kw= '<?xml' kw= 'version=' this_STRING_2= RULE_STRING kw= 'encoding=' this_STRING_4= RULE_STRING kw= '?>' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:192:2: kw= '<?xml' kw= 'version=' this_STRING_2= RULE_STRING kw= 'encoding=' this_STRING_4= RULE_STRING kw= '?>'
            {
            kw=(Token)match(input,11,FOLLOW_11_in_ruleXMLDec306); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getXMLDecAccess().getXmlKeyword_0()); 
                  
            }
            kw=(Token)match(input,12,FOLLOW_12_in_ruleXMLDec319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getXMLDecAccess().getVersionKeyword_1()); 
                  
            }
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXMLDec334); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_2, grammarAccess.getXMLDecAccess().getSTRINGTerminalRuleCall_2()); 
                  
            }
            kw=(Token)match(input,13,FOLLOW_13_in_ruleXMLDec352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getXMLDecAccess().getEncodingKeyword_3()); 
                  
            }
            this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXMLDec367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_4, grammarAccess.getXMLDecAccess().getSTRINGTerminalRuleCall_4()); 
                  
            }
            kw=(Token)match(input,14,FOLLOW_14_in_ruleXMLDec385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getXMLDecAccess().getQuestionMarkGreaterThanSignKeyword_5()); 
                  
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:237:1: entryRuleProcessingInstruction returns [EObject current=null] : iv_ruleProcessingInstruction= ruleProcessingInstruction EOF ;
    public final EObject entryRuleProcessingInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessingInstruction = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:238:2: (iv_ruleProcessingInstruction= ruleProcessingInstruction EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:239:2: iv_ruleProcessingInstruction= ruleProcessingInstruction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessingInstructionRule()); 
            }
            pushFollow(FOLLOW_ruleProcessingInstruction_in_entryRuleProcessingInstruction425);
            iv_ruleProcessingInstruction=ruleProcessingInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcessingInstruction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessingInstruction435); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:246:1: ruleProcessingInstruction returns [EObject current=null] : (otherlv_0= '<?' ( (lv_type_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleQualifiedNameWithWildCard ) ) otherlv_3= '?>' ) ;
    public final EObject ruleProcessingInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:249:28: ( (otherlv_0= '<?' ( (lv_type_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleQualifiedNameWithWildCard ) ) otherlv_3= '?>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:250:1: (otherlv_0= '<?' ( (lv_type_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleQualifiedNameWithWildCard ) ) otherlv_3= '?>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:250:1: (otherlv_0= '<?' ( (lv_type_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleQualifiedNameWithWildCard ) ) otherlv_3= '?>' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:250:3: otherlv_0= '<?' ( (lv_type_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleQualifiedNameWithWildCard ) ) otherlv_3= '?>'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleProcessingInstruction472); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getProcessingInstructionAccess().getLessThanSignQuestionMarkKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:254:1: ( (lv_type_1_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:255:1: (lv_type_1_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:255:1: (lv_type_1_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:256:3: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcessingInstruction489); if (state.failed) return current;
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

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:272:2: ( (lv_value_2_0= ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:273:1: (lv_value_2_0= ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:273:1: (lv_value_2_0= ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:274:3: lv_value_2_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProcessingInstructionAccess().getValueQualifiedNameWithWildCardParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleProcessingInstruction515);
            lv_value_2_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProcessingInstructionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"QualifiedNameWithWildCard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleProcessingInstruction527); if (state.failed) return current;
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


    // $ANTLR start "entryRuleClassDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:302:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:303:2: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:304:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleClassDefinition_in_entryRuleClassDefinition563);
            iv_ruleClassDefinition=ruleClassDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDefinition573); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDefinition"


    // $ANTLR start "ruleClassDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:311:1: ruleClassDefinition returns [EObject current=null] : ( (otherlv_0= '<' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= rulePropertyAttributeDefinition ) )* otherlv_3= '>' ( (lv_children_4_0= rulePropertyDefinition ) )+ otherlv_5= '</' ( (lv_endname_6_0= RULE_ID ) ) otherlv_7= '>' ) | (otherlv_8= '<' ( (lv_name_9_0= RULE_ID ) ) ( (lv_attributes_10_0= rulePropertyAttributeDefinition ) )* otherlv_11= '/>' ) ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_endname_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_11=null;
        EObject lv_attributes_2_0 = null;

        EObject lv_children_4_0 = null;

        EObject lv_attributes_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:314:28: ( ( (otherlv_0= '<' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= rulePropertyAttributeDefinition ) )* otherlv_3= '>' ( (lv_children_4_0= rulePropertyDefinition ) )+ otherlv_5= '</' ( (lv_endname_6_0= RULE_ID ) ) otherlv_7= '>' ) | (otherlv_8= '<' ( (lv_name_9_0= RULE_ID ) ) ( (lv_attributes_10_0= rulePropertyAttributeDefinition ) )* otherlv_11= '/>' ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:315:1: ( (otherlv_0= '<' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= rulePropertyAttributeDefinition ) )* otherlv_3= '>' ( (lv_children_4_0= rulePropertyDefinition ) )+ otherlv_5= '</' ( (lv_endname_6_0= RULE_ID ) ) otherlv_7= '>' ) | (otherlv_8= '<' ( (lv_name_9_0= RULE_ID ) ) ( (lv_attributes_10_0= rulePropertyAttributeDefinition ) )* otherlv_11= '/>' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:315:1: ( (otherlv_0= '<' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= rulePropertyAttributeDefinition ) )* otherlv_3= '>' ( (lv_children_4_0= rulePropertyDefinition ) )+ otherlv_5= '</' ( (lv_endname_6_0= RULE_ID ) ) otherlv_7= '>' ) | (otherlv_8= '<' ( (lv_name_9_0= RULE_ID ) ) ( (lv_attributes_10_0= rulePropertyAttributeDefinition ) )* otherlv_11= '/>' ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:315:2: (otherlv_0= '<' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= rulePropertyAttributeDefinition ) )* otherlv_3= '>' ( (lv_children_4_0= rulePropertyDefinition ) )+ otherlv_5= '</' ( (lv_endname_6_0= RULE_ID ) ) otherlv_7= '>' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:315:2: (otherlv_0= '<' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= rulePropertyAttributeDefinition ) )* otherlv_3= '>' ( (lv_children_4_0= rulePropertyDefinition ) )+ otherlv_5= '</' ( (lv_endname_6_0= RULE_ID ) ) otherlv_7= '>' )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:315:4: otherlv_0= '<' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= rulePropertyAttributeDefinition ) )* otherlv_3= '>' ( (lv_children_4_0= rulePropertyDefinition ) )+ otherlv_5= '</' ( (lv_endname_6_0= RULE_ID ) ) otherlv_7= '>'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleClassDefinition611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getClassDefinitionAccess().getLessThanSignKeyword_0_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:319:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:320:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:320:1: (lv_name_1_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:321:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassDefinition628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getClassDefinitionAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:337:2: ( (lv_attributes_2_0= rulePropertyAttributeDefinition ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:338:1: (lv_attributes_2_0= rulePropertyAttributeDefinition )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:338:1: (lv_attributes_2_0= rulePropertyAttributeDefinition )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:339:3: lv_attributes_2_0= rulePropertyAttributeDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassDefinitionAccess().getAttributesPropertyAttributeDefinitionParserRuleCall_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyAttributeDefinition_in_ruleClassDefinition654);
                    	    lv_attributes_2_0=rulePropertyAttributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_2_0, 
                    	              		"PropertyAttributeDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleClassDefinition667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClassDefinitionAccess().getGreaterThanSignKeyword_0_3());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:359:1: ( (lv_children_4_0= rulePropertyDefinition ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:360:1: (lv_children_4_0= rulePropertyDefinition )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:360:1: (lv_children_4_0= rulePropertyDefinition )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:361:3: lv_children_4_0= rulePropertyDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassDefinitionAccess().getChildrenPropertyDefinitionParserRuleCall_0_4_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleClassDefinition688);
                    	    lv_children_4_0=rulePropertyDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"children",
                    	              		lv_children_4_0, 
                    	              		"PropertyDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleClassDefinition701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getClassDefinitionAccess().getLessThanSignSolidusKeyword_0_5());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:381:1: ( (lv_endname_6_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:382:1: (lv_endname_6_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:382:1: (lv_endname_6_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:383:3: lv_endname_6_0= RULE_ID
                    {
                    lv_endname_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassDefinition718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_endname_6_0, grammarAccess.getClassDefinitionAccess().getEndnameIDTerminalRuleCall_0_6_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"endname",
                              		lv_endname_6_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleClassDefinition735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getClassDefinitionAccess().getGreaterThanSignKeyword_0_7());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:404:6: (otherlv_8= '<' ( (lv_name_9_0= RULE_ID ) ) ( (lv_attributes_10_0= rulePropertyAttributeDefinition ) )* otherlv_11= '/>' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:404:6: (otherlv_8= '<' ( (lv_name_9_0= RULE_ID ) ) ( (lv_attributes_10_0= rulePropertyAttributeDefinition ) )* otherlv_11= '/>' )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:404:8: otherlv_8= '<' ( (lv_name_9_0= RULE_ID ) ) ( (lv_attributes_10_0= rulePropertyAttributeDefinition ) )* otherlv_11= '/>'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleClassDefinition755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getClassDefinitionAccess().getLessThanSignKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:408:1: ( (lv_name_9_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:409:1: (lv_name_9_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:409:1: (lv_name_9_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:410:3: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassDefinition772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_9_0, grammarAccess.getClassDefinitionAccess().getNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_9_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:426:2: ( (lv_attributes_10_0= rulePropertyAttributeDefinition ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:427:1: (lv_attributes_10_0= rulePropertyAttributeDefinition )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:427:1: (lv_attributes_10_0= rulePropertyAttributeDefinition )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:428:3: lv_attributes_10_0= rulePropertyAttributeDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassDefinitionAccess().getAttributesPropertyAttributeDefinitionParserRuleCall_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyAttributeDefinition_in_ruleClassDefinition798);
                    	    lv_attributes_10_0=rulePropertyAttributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_10_0, 
                    	              		"PropertyAttributeDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleClassDefinition811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getClassDefinitionAccess().getSolidusGreaterThanSignKeyword_1_3());
                          
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
    // $ANTLR end "ruleClassDefinition"


    // $ANTLR start "entryRulePropertyAttributeDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:456:1: entryRulePropertyAttributeDefinition returns [EObject current=null] : iv_rulePropertyAttributeDefinition= rulePropertyAttributeDefinition EOF ;
    public final EObject entryRulePropertyAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAttributeDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:457:2: (iv_rulePropertyAttributeDefinition= rulePropertyAttributeDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:458:2: iv_rulePropertyAttributeDefinition= rulePropertyAttributeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyAttributeDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePropertyAttributeDefinition_in_entryRulePropertyAttributeDefinition848);
            iv_rulePropertyAttributeDefinition=rulePropertyAttributeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyAttributeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAttributeDefinition858); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyAttributeDefinition"


    // $ANTLR start "rulePropertyAttributeDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:465:1: rulePropertyAttributeDefinition returns [EObject current=null] : ( ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject rulePropertyAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_namespace_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:468:28: ( ( ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:469:1: ( ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:469:1: ( ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:469:2: ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:469:2: ( ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==20) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:469:3: ( (lv_namespace_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:469:3: ( (lv_namespace_0_0= RULE_ID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:470:1: (lv_namespace_0_0= RULE_ID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:470:1: (lv_namespace_0_0= RULE_ID )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:471:3: lv_namespace_0_0= RULE_ID
                    {
                    lv_namespace_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyAttributeDefinition901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_namespace_0_0, grammarAccess.getPropertyAttributeDefinitionAccess().getNamespaceIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyAttributeDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"namespace",
                              		lv_namespace_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulePropertyAttributeDefinition918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPropertyAttributeDefinitionAccess().getColonKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:491:3: ( (lv_name_2_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:492:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:492:1: (lv_name_2_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:493:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyAttributeDefinition937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getPropertyAttributeDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyAttributeDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePropertyAttributeDefinition954); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPropertyAttributeDefinitionAccess().getEqualsSignKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:513:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:514:1: (lv_value_4_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:514:1: (lv_value_4_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:515:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePropertyAttributeDefinition971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_4_0, grammarAccess.getPropertyAttributeDefinitionAccess().getValueSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyAttributeDefinitionRule());
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
    // $ANTLR end "rulePropertyAttributeDefinition"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:539:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:540:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:541:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1012);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition1022); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:548:1: rulePropertyDefinition returns [EObject current=null] : (otherlv_0= '<' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '>' ( ( (lv_children_3_0= ruleClassDefinition ) )+ | ( (lv_simpleValue_4_0= ruleContent ) ) ) otherlv_5= '</' ( (lv_endname_6_0= ruleQualifiedName ) ) otherlv_7= '>' ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_children_3_0 = null;

        AntlrDatatypeRuleToken lv_simpleValue_4_0 = null;

        AntlrDatatypeRuleToken lv_endname_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:551:28: ( (otherlv_0= '<' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '>' ( ( (lv_children_3_0= ruleClassDefinition ) )+ | ( (lv_simpleValue_4_0= ruleContent ) ) ) otherlv_5= '</' ( (lv_endname_6_0= ruleQualifiedName ) ) otherlv_7= '>' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:552:1: (otherlv_0= '<' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '>' ( ( (lv_children_3_0= ruleClassDefinition ) )+ | ( (lv_simpleValue_4_0= ruleContent ) ) ) otherlv_5= '</' ( (lv_endname_6_0= ruleQualifiedName ) ) otherlv_7= '>' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:552:1: (otherlv_0= '<' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '>' ( ( (lv_children_3_0= ruleClassDefinition ) )+ | ( (lv_simpleValue_4_0= ruleContent ) ) ) otherlv_5= '</' ( (lv_endname_6_0= ruleQualifiedName ) ) otherlv_7= '>' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:552:3: otherlv_0= '<' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '>' ( ( (lv_children_3_0= ruleClassDefinition ) )+ | ( (lv_simpleValue_4_0= ruleContent ) ) ) otherlv_5= '</' ( (lv_endname_6_0= ruleQualifiedName ) ) otherlv_7= '>'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePropertyDefinition1059); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyDefinitionAccess().getLessThanSignKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:556:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:557:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:557:1: (lv_name_1_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:558:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyDefinition1080);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePropertyDefinition1092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyDefinitionAccess().getGreaterThanSignKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:578:1: ( ( (lv_children_3_0= ruleClassDefinition ) )+ | ( (lv_simpleValue_4_0= ruleContent ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==EOF||(LA10_0>=RULE_STRING && LA10_0<=RULE_WS)||LA10_0==18) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:578:2: ( (lv_children_3_0= ruleClassDefinition ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:578:2: ( (lv_children_3_0= ruleClassDefinition ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:579:1: (lv_children_3_0= ruleClassDefinition )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:579:1: (lv_children_3_0= ruleClassDefinition )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:580:3: lv_children_3_0= ruleClassDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getChildrenClassDefinitionParserRuleCall_3_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleClassDefinition_in_rulePropertyDefinition1114);
                    	    lv_children_3_0=ruleClassDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"children",
                    	              		lv_children_3_0, 
                    	              		"ClassDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:597:6: ( (lv_simpleValue_4_0= ruleContent ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:597:6: ( (lv_simpleValue_4_0= ruleContent ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:598:1: (lv_simpleValue_4_0= ruleContent )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:598:1: (lv_simpleValue_4_0= ruleContent )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:599:3: lv_simpleValue_4_0= ruleContent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getSimpleValueContentParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContent_in_rulePropertyDefinition1142);
                    lv_simpleValue_4_0=ruleContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"simpleValue",
                              		lv_simpleValue_4_0, 
                              		"Content");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulePropertyDefinition1155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPropertyDefinitionAccess().getLessThanSignSolidusKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:619:1: ( (lv_endname_6_0= ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:620:1: (lv_endname_6_0= ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:620:1: (lv_endname_6_0= ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:621:3: lv_endname_6_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getEndnameQualifiedNameParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyDefinition1176);
            lv_endname_6_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"endname",
                      		lv_endname_6_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_rulePropertyDefinition1188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPropertyDefinitionAccess().getGreaterThanSignKeyword_6());
                  
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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleContent"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:649:1: entryRuleContent returns [String current=null] : iv_ruleContent= ruleContent EOF ;
    public final String entryRuleContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContent = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:650:2: (iv_ruleContent= ruleContent EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:651:2: iv_ruleContent= ruleContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentRule()); 
            }
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent1225);
            iv_ruleContent=ruleContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContent.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent1236); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:658:1: ruleContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )* ;
    public final AntlrDatatypeRuleToken ruleContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_ANY_OTHER_2=null;
        Token this_WS_3=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:661:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:662:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )*
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:662:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | this_WS_3= RULE_WS )*
            loop11:
            do {
                int alt11=5;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt11=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt11=2;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt11=3;
                    }
                    break;
                case RULE_WS:
                    {
                    alt11=4;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:662:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContent1276); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getContentAccess().getIDTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:670:10: this_STRING_1= RULE_STRING
            	    {
            	    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContent1302); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_STRING_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_STRING_1, grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:678:10: this_ANY_OTHER_2= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleContent1328); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ANY_OTHER_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ANY_OTHER_2, grammarAccess.getContentAccess().getANY_OTHERTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:686:10: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleContent1354); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_3, grammarAccess.getContentAccess().getWSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
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
        }
        return current;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:701:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:702:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:703:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1401);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1412); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:710:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:713:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:714:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:714:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:715:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1459);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:725:1: (kw= '.' kw= '*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:726:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedNameWithWildCard1478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleQualifiedNameWithWildCard1491); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:745:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:746:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:747:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1533);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1543); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:754:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:757:28: (this_XAssignment_0= ruleXAssignment )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:759:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1589);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:775:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:776:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:777:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1623);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1633); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:784:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:787:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:788:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:788:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||(LA14_1>=RULE_STRING && LA14_1<=RULE_ID)||LA14_1==RULE_INT||(LA14_1>=16 && LA14_1<=17)||LA14_1==20||(LA14_1>=22 && LA14_1<=46)||(LA14_1>=48 && LA14_1<=74)) ) {
                    alt14=2;
                }
                else if ( (LA14_1==21) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==RULE_STRING||LA14_0==RULE_INT||LA14_0==16||(LA14_0>=34 && LA14_0<=35)||LA14_0==39||LA14_0==44||LA14_0==46||LA14_0==50||(LA14_0>=52 && LA14_0<=53)||(LA14_0>=57 && LA14_0<=59)||LA14_0==62||(LA14_0>=64 && LA14_0<=71)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:788:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:788:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:788:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:788:3: ()
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:789:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:794:2: ( ( ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:795:1: ( ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:795:1: ( ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:796:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1691);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1707);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:817:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:818:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:818:1: (lv_value_3_0= ruleXAssignment )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:819:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1727);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:836:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:836:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:837:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1757);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:845:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==24) ) {
                        int LA13_1 = input.LA(2);

                        if ( (synpred1_InternalFXML()) ) {
                            alt13=1;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:845:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:845:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:845:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:850:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:850:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:850:7: ()
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:851:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:856:2: ( ( ruleOpMultiAssign ) )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:857:1: ( ruleOpMultiAssign )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:857:1: ( ruleOpMultiAssign )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:858:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1810);
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

                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:871:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:872:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:872:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:873:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1833);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:897:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:898:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:899:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1873);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1884); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:906:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:909:28: (kw= '=' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:911:2: kw= '='
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpSingleAssign1921); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:924:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:925:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:926:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1961);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1972); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:933:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:936:28: (kw= '+=' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:938:2: kw= '+='
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpMultiAssign2009); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:951:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:952:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:953:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2048);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2058); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:960:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:963:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:964:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:964:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:965:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2105);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:973:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred2_InternalFXML()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:973:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:973:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:973:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:978:6: ( () ( ( ruleOpOr ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:978:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:978:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:979:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:984:2: ( ( ruleOpOr ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:985:1: ( ruleOpOr )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:985:1: ( ruleOpOr )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:986:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2158);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:999:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1000:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1000:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1001:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2181);
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
            	    break loop15;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1025:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1026:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1027:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2220);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2231); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1034:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1037:28: (kw= '||' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1039:2: kw= '||'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOr2268); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1052:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1053:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1054:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2307);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2317); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1061:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1064:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1065:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1065:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1066:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2364);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1074:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred3_InternalFXML()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1074:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1074:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1074:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1079:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1079:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1079:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1080:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1085:2: ( ( ruleOpAnd ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1086:1: ( ruleOpAnd )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1086:1: ( ruleOpAnd )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1087:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2417);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1100:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1101:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1101:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1102:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2440);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1126:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1127:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1128:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2479);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2490); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1135:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1138:28: (kw= '&&' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1140:2: kw= '&&'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpAnd2527); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1153:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1154:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1155:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2566);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2576); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1162:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1165:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1166:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1166:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1167:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2623);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1175:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred4_InternalFXML()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==28) ) {
                    int LA17_3 = input.LA(2);

                    if ( (synpred4_InternalFXML()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1175:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1175:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1175:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1180:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1180:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1180:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1181:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1186:2: ( ( ruleOpEquality ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1187:1: ( ruleOpEquality )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1187:1: ( ruleOpEquality )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1188:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2676);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1201:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1202:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1202:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1203:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2699);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1227:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1228:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1229:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2738);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2749); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1236:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1239:28: ( (kw= '==' | kw= '!=' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1240:1: (kw= '==' | kw= '!=' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1240:1: (kw= '==' | kw= '!=' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            else if ( (LA18_0==28) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1241:2: kw= '=='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpEquality2787); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1248:2: kw= '!='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpEquality2806); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1261:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1262:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1263:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2846);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2856); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1270:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1273:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1274:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1274:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1275:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2903);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1283:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop19:
            do {
                int alt19=3;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    int LA19_2 = input.LA(2);

                    if ( (synpred5_InternalFXML()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (synpred6_InternalFXML()) ) {
                        alt19=2;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA19_4 = input.LA(2);

                    if ( (synpred6_InternalFXML()) ) {
                        alt19=2;
                    }


                    }
                    break;
                case 17:
                    {
                    int LA19_5 = input.LA(2);

                    if ( (synpred6_InternalFXML()) ) {
                        alt19=2;
                    }


                    }
                    break;
                case 16:
                    {
                    int LA19_6 = input.LA(2);

                    if ( (synpred6_InternalFXML()) ) {
                        alt19=2;
                    }


                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1283:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1283:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1283:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1283:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1283:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1285:5: ( () otherlv_2= 'instanceof' )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1285:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1285:6: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1286:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleXRelationalExpression2939); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1295:3: ( ( ruleQualifiedName ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1296:1: ( ruleQualifiedName )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1296:1: ( ruleQualifiedName )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1297:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2964);
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
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1311:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1311:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1311:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1311:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1311:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1316:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1316:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1316:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1317:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1322:2: ( ( ruleOpCompare ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1323:1: ( ruleOpCompare )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1323:1: ( ruleOpCompare )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1324:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3025);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1337:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1338:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1338:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1339:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3048);
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
            	    break loop19;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1363:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1364:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1365:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3088);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3099); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1372:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1375:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1376:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1376:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt20=1;
                }
                break;
            case 31:
                {
                alt20=2;
                }
                break;
            case 17:
                {
                alt20=3;
                }
                break;
            case 16:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1377:2: kw= '>='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare3137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1384:2: kw= '<='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpCompare3156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1391:2: kw= '>'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleOpCompare3175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1398:2: kw= '<'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleOpCompare3194); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1411:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1412:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1413:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3234);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3244); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1420:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1423:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1424:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1424:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1425:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3291);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1433:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred7_InternalFXML()) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==33) ) {
                    int LA21_3 = input.LA(2);

                    if ( (synpred7_InternalFXML()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1433:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1433:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1433:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1438:6: ( () ( ( ruleOpOther ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1438:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1438:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1439:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1444:2: ( ( ruleOpOther ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1445:1: ( ruleOpOther )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1445:1: ( ruleOpOther )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1446:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3344);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1459:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1460:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1460:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1461:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3367);
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
            	    break loop21;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1485:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1486:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1487:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3406);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3417); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1494:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1497:28: ( (kw= '->' | kw= '..' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1498:1: (kw= '->' | kw= '..' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1498:1: (kw= '->' | kw= '..' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            else if ( (LA22_0==33) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1499:2: kw= '->'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3455); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1506:2: kw= '..'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther3474); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1519:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1520:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1521:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3514);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3524); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1528:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1531:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1532:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1532:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1533:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3571);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1541:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==34) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred8_InternalFXML()) ) {
                        alt23=1;
                    }


                }
                else if ( (LA23_0==35) ) {
                    int LA23_3 = input.LA(2);

                    if ( (synpred8_InternalFXML()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1541:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1541:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1541:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1546:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1546:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1546:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1547:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1552:2: ( ( ruleOpAdd ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1553:1: ( ruleOpAdd )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1553:1: ( ruleOpAdd )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1554:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3624);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1567:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1568:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1568:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1569:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3647);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1593:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1594:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1595:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3686);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3697); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1602:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1605:28: ( (kw= '+' | kw= '-' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1606:1: (kw= '+' | kw= '-' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1606:1: (kw= '+' | kw= '-' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            else if ( (LA24_0==35) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1607:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd3735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1614:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd3754); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1627:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1628:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1629:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3794);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3804); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1636:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1639:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1640:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1640:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1641:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3851);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1649:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    int LA25_2 = input.LA(2);

                    if ( (synpred9_InternalFXML()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA25_3 = input.LA(2);

                    if ( (synpred9_InternalFXML()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA25_4 = input.LA(2);

                    if ( (synpred9_InternalFXML()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA25_5 = input.LA(2);

                    if ( (synpred9_InternalFXML()) ) {
                        alt25=1;
                    }


                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1649:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1649:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1649:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1654:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1654:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1654:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1655:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1660:2: ( ( ruleOpMulti ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1661:1: ( ruleOpMulti )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1661:1: ( ruleOpMulti )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1662:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3904);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1675:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1676:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1676:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1677:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3927);
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
            	    break loop25;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1701:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1702:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1703:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3966);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3977); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1710:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1713:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1714:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1714:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt26=1;
                }
                break;
            case 36:
                {
                alt26=2;
                }
                break;
            case 37:
                {
                alt26=3;
                }
                break;
            case 38:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1715:2: kw= '*'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpMulti4015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1722:2: kw= '**'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti4034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1729:2: kw= '/'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti4053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1736:2: kw= '%'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti4072); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1749:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1750:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1751:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4112);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4122); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1758:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1761:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1762:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1762:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=34 && LA27_0<=35)||LA27_0==39) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||LA27_0==RULE_INT||LA27_0==16||LA27_0==44||LA27_0==46||LA27_0==50||(LA27_0>=52 && LA27_0<=53)||(LA27_0>=57 && LA27_0<=59)||LA27_0==62||(LA27_0>=64 && LA27_0<=71)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1762:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1762:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1762:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1762:3: ()
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1763:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1768:2: ( ( ruleOpUnary ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1769:1: ( ruleOpUnary )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1769:1: ( ruleOpUnary )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1770:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4180);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1783:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1784:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1784:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1785:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4201);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1803:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4230);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1819:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1820:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1821:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4266);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4277); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1828:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1831:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1832:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1832:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt28=1;
                }
                break;
            case 35:
                {
                alt28=2;
                }
                break;
            case 34:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1833:2: kw= '!'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary4315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1840:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary4334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1847:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary4353); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1860:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1861:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1862:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4393);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4403); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1869:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1872:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1873:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1873:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1874:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4450);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1882:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred10_InternalFXML()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1882:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1882:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1882:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1884:5: ( () otherlv_2= 'as' )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1884:6: () otherlv_2= 'as'
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1884:6: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1885:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXCastedExpression4485); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1894:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1895:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1895:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1896:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4508);
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
            	    break loop29;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1920:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1921:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1922:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4546);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4556); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1929:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1932:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1933:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1933:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1934:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4603);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1942:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop37:
            do {
                int alt37=3;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (synpred11_InternalFXML()) ) {
                        alt37=1;
                    }
                    else if ( (synpred12_InternalFXML()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (synpred12_InternalFXML()) ) {
                        alt37=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA37_4 = input.LA(2);

                    if ( (synpred12_InternalFXML()) ) {
                        alt37=2;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1942:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1942:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1942:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1942:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1942:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1948:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1948:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1948:26: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1949:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall4652); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1958:1: ( ( ruleValidID ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1959:1: ( ruleValidID )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1959:1: ( ruleValidID )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1960:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4675);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4691);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1981:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1982:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1982:1: (lv_value_5_0= ruleXAssignment )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1983:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4713);
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
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2000:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2000:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2000:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2000:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2000:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2016:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2016:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2016:8: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2017:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2022:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt30=3;
            	    switch ( input.LA(1) ) {
            	    case 22:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2022:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall4799); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2027:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2027:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2028:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2028:1: (lv_nullSafe_8_0= '?.' )
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2029:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4823); if (state.failed) return current;
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
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2043:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2043:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2044:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2044:1: (lv_spreading_9_0= '*.' )
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2045:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4860); if (state.failed) return current;
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

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2058:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==16) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2058:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall4889); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2062:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2063:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2063:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2064:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4910);
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

            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2080:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop31:
            	            do {
            	                int alt31=2;
            	                int LA31_0 = input.LA(1);

            	                if ( (LA31_0==43) ) {
            	                    alt31=1;
            	                }


            	                switch (alt31) {
            	            	case 1 :
            	            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2080:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4923); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2084:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2085:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2085:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2086:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4944);
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
            	            	    break loop31;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleXMemberFeatureCall4958); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2106:3: ( ( ruleValidID ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2107:1: ( ruleValidID )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2107:1: ( ruleValidID )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2108:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4983);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2121:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2121:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2121:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2121:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2128:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2129:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall5017); if (state.failed) return current;
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

            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2142:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt34=3;
            	            alt34 = dfa34.predict(input);
            	            switch (alt34) {
            	                case 1 :
            	                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2142:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2142:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2142:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2159:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2160:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5102);
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
            	                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2177:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2177:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2177:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2177:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2178:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2178:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2179:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5130);
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

            	                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2195:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop33:
            	                    do {
            	                        int alt33=2;
            	                        int LA33_0 = input.LA(1);

            	                        if ( (LA33_0==43) ) {
            	                            alt33=1;
            	                        }


            	                        switch (alt33) {
            	                    	case 1 :
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2195:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall5143); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2199:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2200:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2200:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2201:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5164);
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
            	                    	    break loop33;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall5181); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2221:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt36=2;
            	    alt36 = dfa36.predict(input);
            	    switch (alt36) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2221:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2226:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2227:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5214);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2251:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2252:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2253:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5254);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5264); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2260:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2263:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2264:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2264:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt38=13;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt38=1;
                }
                break;
            case 53:
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
            case 16:
            case 62:
                {
                alt38=4;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 46:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt38=5;
                }
                break;
            case 50:
                {
                alt38=6;
                }
                break;
            case 57:
                {
                alt38=7;
                }
                break;
            case 58:
                {
                alt38=8;
                }
                break;
            case 59:
                {
                alt38=9;
                }
                break;
            case 69:
                {
                alt38=10;
                }
                break;
            case 70:
                {
                alt38=11;
                }
                break;
            case 71:
                {
                alt38=12;
                }
                break;
            case 44:
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2265:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5311);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2275:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5338);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2285:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5365);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2295:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5392);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2305:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5419);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2315:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5446);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2325:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5473);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2335:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5500);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2345:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5527);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2355:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5554);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2365:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5581);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2375:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5608);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2385:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5635);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2401:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2402:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2403:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5670);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5680); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2410:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2413:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2414:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2414:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt39=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt39=1;
                }
                break;
            case 65:
            case 66:
                {
                alt39=2;
                }
                break;
            case RULE_INT:
                {
                alt39=3;
                }
                break;
            case 67:
                {
                alt39=4;
                }
                break;
            case RULE_STRING:
                {
                alt39=5;
                }
                break;
            case 68:
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2415:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5727);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2425:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5754);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2435:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5781);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2445:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5808);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2455:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5835);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2465:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5862);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2481:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2482:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2483:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5897);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5907); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2490:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2493:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2494:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2494:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2494:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2494:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2495:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2504:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2504:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2519:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2519:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2519:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID||LA41_0==44||LA41_0==74) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2519:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2519:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2520:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2520:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2521:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6024);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2537:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==43) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2537:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleXClosure6037); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2541:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2542:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2542:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2543:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6058);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
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

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2559:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2560:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2560:1: (lv_explicitSyntax_5_0= '|' )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2561:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,47,FOLLOW_47_in_ruleXClosure6080); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2574:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2575:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2575:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2576:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6117);
            lv_expression_6_0=ruleXExpressionInClosure();

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
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleXClosure6129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
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


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2604:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2605:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2606:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6165);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2613:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2616:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2617:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2617:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2617:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2617:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2618:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2623:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)||LA44_0==RULE_INT||LA44_0==16||(LA44_0>=34 && LA44_0<=35)||LA44_0==39||LA44_0==44||LA44_0==46||LA44_0==50||(LA44_0>=52 && LA44_0<=53)||(LA44_0>=57 && LA44_0<=62)||(LA44_0>=64 && LA44_0<=71)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2623:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2623:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2624:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2624:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2625:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6231);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2641:2: (otherlv_2= ';' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==49) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2641:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXExpressionInClosure6244); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2653:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2654:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2655:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6284);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6294); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2662:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2665:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2666:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2666:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2666:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2666:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2666:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2682:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2682:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2682:7: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2683:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2688:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==44||LA46_0==74) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2688:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2688:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2689:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2689:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2690:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6402);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2706:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==43) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2706:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure6415); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2710:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2711:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2711:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2712:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6436);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2728:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2729:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2729:1: (lv_explicitSyntax_4_0= '|' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2730:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,47,FOLLOW_47_in_ruleXShortClosure6458); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2743:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2744:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2744:1: (lv_expression_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2745:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6494);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2769:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2770:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2771:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6530);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6540); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2778:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2781:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2782:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2782:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2782:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXParenthesizedExpression6577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6599);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXParenthesizedExpression6610); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2807:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2808:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2809:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6646);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6656); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2816:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2819:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2820:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2820:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2820:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2820:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2821:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression6702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression6714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2834:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2835:1: (lv_if_3_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2835:1: (lv_if_3_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2836:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6735);
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

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression6747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2856:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2857:1: (lv_then_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2857:1: (lv_then_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2858:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6768);
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

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2874:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==51) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred18_InternalFXML()) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2874:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2874:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2874:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression6789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2879:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2880:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2880:1: (lv_else_7_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2881:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6811);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2905:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2906:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2907:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6849);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6859); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2914:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2917:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2918:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2918:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2918:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2918:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2919:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2928:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==20) && (synpred19_InternalFXML())) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2928:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2933:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2933:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2933:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2934:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2934:1: (lv_localVarName_2_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2935:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6946);
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

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleXSwitchExpression6958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2955:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2956:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2956:1: (lv_switch_4_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2957:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6982);
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

            otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2977:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==20||LA49_0==44||LA49_0==56||LA49_0==74) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2978:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2978:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2979:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7015);
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
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2995:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==54) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2995:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression7029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleXSwitchExpression7041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3003:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3004:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3004:1: (lv_default_9_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3005:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7062);
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

            otherlv_10=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression7076); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3033:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3034:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3035:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7112);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7122); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3042:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3045:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3046:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3046:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3046:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3046:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==44||LA51_0==74) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3047:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3047:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3048:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7168);
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

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3064:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==56) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3064:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart7182); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3068:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3069:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3069:1: (lv_case_2_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3070:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7203);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleXCasePart7217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3090:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3091:1: (lv_then_4_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3091:1: (lv_then_4_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3092:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7238);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3116:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3117:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3118:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7274);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7284); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3125:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3128:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3129:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3129:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3129:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3129:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3130:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXForLoopExpression7330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXForLoopExpression7342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3143:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3144:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3144:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3145:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7363);
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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXForLoopExpression7375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3165:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3166:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3166:1: (lv_forExpression_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3167:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7396);
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

            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleXForLoopExpression7408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3187:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3188:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3188:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3189:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7429);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3213:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3214:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3215:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7465);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7475); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3222:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3225:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3226:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3226:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3226:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3226:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3227:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXWhileExpression7521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXWhileExpression7533); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3240:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3241:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3241:1: (lv_predicate_3_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3242:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7554);
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

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXWhileExpression7566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3262:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3263:1: (lv_body_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3263:1: (lv_body_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3264:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7587);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3288:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3289:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3290:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7623);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7633); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3297:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3300:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3301:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3301:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3301:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3301:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3302:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression7679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3311:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3312:1: (lv_body_2_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3312:1: (lv_body_2_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3313:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7700);
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

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression7712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXDoWhileExpression7724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3337:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3338:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3338:1: (lv_predicate_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3339:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7745);
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

            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleXDoWhileExpression7757); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3367:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3368:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3369:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7793);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7803); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3376:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3379:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3380:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3380:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3380:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3380:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3381:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression7849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3390:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_ID)||LA54_0==RULE_INT||LA54_0==16||(LA54_0>=34 && LA54_0<=35)||LA54_0==39||LA54_0==44||LA54_0==46||LA54_0==50||(LA54_0>=52 && LA54_0<=53)||(LA54_0>=57 && LA54_0<=62)||(LA54_0>=64 && LA54_0<=71)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3390:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3390:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3391:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3391:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3392:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7871);
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

            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3408:2: (otherlv_3= ';' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==49) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3408:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXBlockExpression7884); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXBlockExpression7900); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3424:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3425:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3426:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7936);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7946); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3433:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3436:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3437:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3437:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=60 && LA55_0<=61)) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_ID)||LA55_0==RULE_INT||LA55_0==16||(LA55_0>=34 && LA55_0<=35)||LA55_0==39||LA55_0==44||LA55_0==46||LA55_0==50||(LA55_0>=52 && LA55_0<=53)||(LA55_0>=57 && LA55_0<=59)||LA55_0==62||(LA55_0>=64 && LA55_0<=71)) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3438:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7993);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3448:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8020);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3464:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3465:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3466:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8055);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8065); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3473:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3476:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3477:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3477:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3477:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3477:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3478:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3483:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==60) ) {
                alt56=1;
            }
            else if ( (LA56_0==61) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3483:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3483:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3484:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3484:1: (lv_writeable_1_0= 'var' )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3485:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration8118); if (state.failed) return current;
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3499:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration8149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3503:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred20_InternalFXML()) ) {
                    alt57=1;
                }
                else if ( (true) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA57_0==44) && (synpred20_InternalFXML())) {
                alt57=1;
            }
            else if ( (LA57_0==74) && (synpred20_InternalFXML())) {
                alt57=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3503:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3503:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3503:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3511:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3511:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3511:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3512:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3512:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3513:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8197);
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

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3529:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3530:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3530:1: (lv_name_4_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3531:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8218);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3548:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3548:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3549:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3549:1: (lv_name_5_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3550:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8247);
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

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3566:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==21) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3566:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleXVariableDeclaration8261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3570:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3571:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3571:1: (lv_right_7_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3572:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8282);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3596:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3597:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3598:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8320);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8330); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3605:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3608:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3609:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3609:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3609:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3609:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_ID||LA59_1==16||LA59_1==22||LA59_1==46) ) {
                    alt59=1;
                }
            }
            else if ( (LA59_0==44||LA59_0==74) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3610:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3610:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3611:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8376);
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

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3627:3: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3628:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3628:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3629:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8398);
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


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3653:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3654:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3655:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8434);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8444); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3662:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3665:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3666:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3666:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3666:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3666:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3667:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3667:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3668:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8490);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
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

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3684:2: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3685:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3685:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3686:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8511);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
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
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3710:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3711:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3712:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8547);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8557); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3719:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3722:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3723:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3723:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3723:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3723:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3724:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3729:2: ( ( ruleStaticQualifier ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==63) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3730:1: ( ruleStaticQualifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3730:1: ( ruleStaticQualifier )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3731:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8614);
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

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3744:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==16) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3744:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXFeatureCall8628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3748:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3749:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3749:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3750:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8649);
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

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3766:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==43) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3766:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall8662); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3770:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3771:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3771:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3772:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8683);
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
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleXFeatureCall8697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3792:3: ( ( ruleIdOrSuper ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3793:1: ( ruleIdOrSuper )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3793:1: ( ruleIdOrSuper )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3794:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8722);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3807:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3807:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3807:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3807:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3814:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3815:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall8756); if (state.failed) return current;
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

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3828:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt64=3;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3828:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3828:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3828:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3845:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3846:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8841);
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
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3863:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3863:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3863:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3863:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3864:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3864:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3865:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8869);
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

                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3881:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==43) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3881:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall8882); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3885:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3886:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3886:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3887:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8903);
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
                            	    break loop63;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3907:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3907:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3912:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3913:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8953);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3937:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3938:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3939:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8991);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9002); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3946:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3949:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3950:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3950:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            else if ( (LA67_0==62) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3951:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9049);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3963:2: kw= 'super'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleIdOrSuper9073); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3976:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3977:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3978:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9114);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9125); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3985:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3988:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3989:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3989:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==63) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3990:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9172);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,63,FOLLOW_63_in_ruleStaticQualifier9190); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4014:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4015:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4016:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9231);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9241); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4023:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4026:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4027:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4027:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4027:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4027:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4028:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXConstructorCall9287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4037:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4038:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4038:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4039:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9310);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4052:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==16) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4052:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleXConstructorCall9323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4056:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4057:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4057:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4058:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9344);
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

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4074:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==43) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4074:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall9357); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4078:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4079:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4079:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4080:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9378);
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
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleXConstructorCall9392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall9406); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4104:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt72=3;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4104:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4104:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4104:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4121:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4122:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9478);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4139:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4139:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4139:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4139:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4140:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4140:1: (lv_arguments_10_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4141:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9506);
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

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4157:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==43) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4157:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall9519); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4161:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4162:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4162:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4163:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9540);
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
                    	    break loop71;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall9557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4183:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4183:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4188:1: (lv_arguments_14_0= ruleXClosure )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4189:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9588);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4213:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4214:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4215:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9625);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9635); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4222:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4225:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4226:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4226:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4226:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4226:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4227:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4232:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==65) ) {
                alt74=1;
            }
            else if ( (LA74_0==66) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4232:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral9682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4237:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4237:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4238:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4238:1: (lv_isTrue_2_0= 'true' )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4239:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,66,FOLLOW_66_in_ruleXBooleanLiteral9706); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4260:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4261:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4262:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9756);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9766); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4269:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4272:28: ( ( () otherlv_1= 'null' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4273:1: ( () otherlv_1= 'null' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4273:1: ( () otherlv_1= 'null' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4273:2: () otherlv_1= 'null'
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4273:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4274:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXNullLiteral9812); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4291:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4292:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4293:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9848);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9858); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4300:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4303:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4304:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4304:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4304:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4304:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4305:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4310:2: ( (lv_value_1_0= RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4311:1: (lv_value_1_0= RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4311:1: (lv_value_1_0= RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4312:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9909); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4336:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4337:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4338:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9950);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9960); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4345:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4348:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4349:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4349:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4349:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4349:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4350:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4355:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4356:1: (lv_value_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4356:1: (lv_value_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4357:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10011); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4381:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4382:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4383:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10052);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10062); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4390:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4393:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4394:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4394:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4394:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4394:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4395:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTypeLiteral10108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXTypeLiteral10120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4408:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4409:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4409:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4410:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10143);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXTypeLiteral10155); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4435:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4436:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4437:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10191);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10201); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4444:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4447:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4448:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4448:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4448:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4448:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4449:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXThrowExpression10247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4458:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4459:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4459:1: (lv_expression_2_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4460:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10268);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4484:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4485:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4486:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10304);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10314); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4493:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4496:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4497:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4497:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4497:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4497:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4498:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXReturnExpression10360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4507:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4507:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4512:1: (lv_expression_2_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4513:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10391);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4537:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4538:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4539:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10428);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10438); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4546:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4549:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4550:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4550:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4550:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4550:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4551:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression10484); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4560:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4561:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4561:1: (lv_expression_2_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4562:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10505);
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

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4578:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==73) ) {
                alt78=1;
            }
            else if ( (LA78_0==72) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4578:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4578:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4578:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4578:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==73) ) {
                            int LA76_2 = input.LA(2);

                            if ( (synpred27_InternalFXML()) ) {
                                alt76=1;
                            }


                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4578:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4580:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4581:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10535);
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
                    	    if ( cnt76 >= 1 ) break loop76;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4597:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==72) ) {
                        int LA77_1 = input.LA(2);

                        if ( (synpred28_InternalFXML()) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4597:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4597:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4597:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression10557); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4602:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4603:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4603:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4604:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10579);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4621:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4621:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4621:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression10601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4625:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4626:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4626:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4627:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10622);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4651:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4652:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4653:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10660);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10670); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4660:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4663:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4664:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4664:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4664:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4664:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4664:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleXCatchClause10715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXCatchClause10728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4673:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4674:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4674:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4675:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10749);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

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
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXCatchClause10761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4695:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4696:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4696:1: (lv_expression_4_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4697:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10782);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4721:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4722:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4723:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10819);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10830); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4730:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4733:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4734:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4734:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4735:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10877);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4745:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==22) ) {
                    int LA79_2 = input.LA(2);

                    if ( (LA79_2==RULE_ID) ) {
                        int LA79_3 = input.LA(3);

                        if ( (synpred30_InternalFXML()) ) {
                            alt79=1;
                        }


                    }


                }


                switch (alt79) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4745:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4745:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4745:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName10905); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10928);
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
            	    break loop79;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4772:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4773:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4774:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10975);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10985); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4781:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4784:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4785:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4785:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==44||LA81_0==74) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4785:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4785:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4786:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11033);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4794:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==46) ) {
                            int LA80_2 = input.LA(2);

                            if ( (LA80_2==48) ) {
                                int LA80_3 = input.LA(3);

                                if ( (synpred31_InternalFXML()) ) {
                                    alt80=1;
                                }


                            }


                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4794:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4797:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4797:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4797:6: ()
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4798:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleJvmTypeReference11071); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleJvmTypeReference11083); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4813:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11115);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4829:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4830:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4831:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11150);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11160); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4838:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4841:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4842:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4842:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4842:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4842:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==44) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4842:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef11198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4846:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4847:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4847:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4848:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11219);
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

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4864:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==43) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4864:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef11232); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4868:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4869:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4869:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4870:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11253);
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

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef11267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleXFunctionTypeRef11281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4894:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4895:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4895:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4896:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11302);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4920:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4921:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4922:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11338);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11348); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4929:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4932:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4933:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4933:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4933:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4933:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4934:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4934:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4935:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11396);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4948:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4948:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4948:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4948:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleJvmParameterizedTypeReference11417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4953:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4954:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4954:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4955:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11439);
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

                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4971:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==43) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4971:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleJvmParameterizedTypeReference11452); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4975:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4976:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4976:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4977:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11473);
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

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleJvmParameterizedTypeReference11487); if (state.failed) return current;
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5005:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5006:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5007:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11525);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11535); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5014:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5017:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5018:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5018:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID||LA86_0==44||LA86_0==74) ) {
                alt86=1;
            }
            else if ( (LA86_0==75) ) {
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5019:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11582);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5029:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11609);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5045:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5046:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5047:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11644);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11654); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5054:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5057:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5058:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5058:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5058:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5058:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5059:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleJvmWildcardTypeReference11700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5068:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==76) ) {
                alt87=1;
            }
            else if ( (LA87_0==62) ) {
                alt87=2;
            }
            switch (alt87) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5068:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5068:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5069:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5069:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5070:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11722);
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
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5087:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5087:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5088:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5088:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5089:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11749);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5113:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5114:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5115:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11787);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11797); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5122:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5125:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5126:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5126:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5126:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBound11834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5130:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5131:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5131:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5132:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11855);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5156:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5157:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5158:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11891);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11901); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5165:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5168:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5169:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5169:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5169:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBoundAnded11938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5173:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5174:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5174:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5175:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11959);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5199:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5200:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5201:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11995);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12005); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5208:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5211:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5212:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5212:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5212:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleJvmLowerBound12042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5216:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5217:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5217:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5218:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12063);
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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5244:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5245:2: (iv_ruleValidID= ruleValidID EOF )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5246:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12102);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12113); if (state.failed) return current;

            }

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
    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5253:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5256:28: (this_ID_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:5257:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12152); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalFXML
    public final void synpred1_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:845:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:845:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:845:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:845:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:845:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:846:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:846:2: ( ( ruleOpMultiAssign ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:847:1: ( ruleOpMultiAssign )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:847:1: ( ruleOpMultiAssign )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:848:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFXML1778);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalFXML

    // $ANTLR start synpred2_InternalFXML
    public final void synpred2_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:973:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:973:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:973:4: ( () ( ( ruleOpOr ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:973:5: () ( ( ruleOpOr ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:973:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:974:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:974:2: ( ( ruleOpOr ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:975:1: ( ruleOpOr )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:975:1: ( ruleOpOr )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:976:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalFXML2126);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalFXML

    // $ANTLR start synpred3_InternalFXML
    public final void synpred3_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1074:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1074:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1074:4: ( () ( ( ruleOpAnd ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1074:5: () ( ( ruleOpAnd ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1074:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1075:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1075:2: ( ( ruleOpAnd ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1076:1: ( ruleOpAnd )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1076:1: ( ruleOpAnd )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1077:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalFXML2385);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalFXML

    // $ANTLR start synpred4_InternalFXML
    public final void synpred4_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1175:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1175:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1175:4: ( () ( ( ruleOpEquality ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1175:5: () ( ( ruleOpEquality ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1175:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1176:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1176:2: ( ( ruleOpEquality ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1177:1: ( ruleOpEquality )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1177:1: ( ruleOpEquality )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1178:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalFXML2644);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalFXML

    // $ANTLR start synpred5_InternalFXML
    public final void synpred5_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1283:4: ( ( () 'instanceof' ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1283:5: ( () 'instanceof' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1283:5: ( () 'instanceof' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1283:6: () 'instanceof'
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1283:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1284:1: 
        {
        }

        match(input,29,FOLLOW_29_in_synpred5_InternalFXML2920); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalFXML

    // $ANTLR start synpred6_InternalFXML
    public final void synpred6_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1311:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1311:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1311:9: ( () ( ( ruleOpCompare ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1311:10: () ( ( ruleOpCompare ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1311:10: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1312:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1312:2: ( ( ruleOpCompare ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1313:1: ( ruleOpCompare )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1313:1: ( ruleOpCompare )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1314:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalFXML2993);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalFXML

    // $ANTLR start synpred7_InternalFXML
    public final void synpred7_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1433:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1433:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1433:4: ( () ( ( ruleOpOther ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1433:5: () ( ( ruleOpOther ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1433:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1434:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1434:2: ( ( ruleOpOther ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1435:1: ( ruleOpOther )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1435:1: ( ruleOpOther )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1436:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalFXML3312);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalFXML

    // $ANTLR start synpred8_InternalFXML
    public final void synpred8_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1541:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1541:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1541:4: ( () ( ( ruleOpAdd ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1541:5: () ( ( ruleOpAdd ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1541:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1542:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1542:2: ( ( ruleOpAdd ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1543:1: ( ruleOpAdd )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1543:1: ( ruleOpAdd )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1544:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalFXML3592);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalFXML

    // $ANTLR start synpred9_InternalFXML
    public final void synpred9_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1649:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1649:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1649:4: ( () ( ( ruleOpMulti ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1649:5: () ( ( ruleOpMulti ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1649:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1650:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1650:2: ( ( ruleOpMulti ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1651:1: ( ruleOpMulti )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1651:1: ( ruleOpMulti )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1652:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalFXML3872);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalFXML

    // $ANTLR start synpred10_InternalFXML
    public final void synpred10_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1882:3: ( ( () 'as' ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1882:4: ( () 'as' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1882:4: ( () 'as' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1882:5: () 'as'
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1882:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1883:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred10_InternalFXML4466); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalFXML

    // $ANTLR start synpred11_InternalFXML
    public final void synpred11_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1942:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1942:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1942:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1942:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1942:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1943:1: 
        {
        }

        match(input,22,FOLLOW_22_in_synpred11_InternalFXML4620); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1944:1: ( ( ruleValidID ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1945:1: ( ruleValidID )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1945:1: ( ruleValidID )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:1946:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalFXML4629);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalFXML4635);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalFXML

    // $ANTLR start synpred12_InternalFXML
    public final void synpred12_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2000:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2000:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2000:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2000:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2000:10: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2001:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2001:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt88=3;
        switch ( input.LA(1) ) {
        case 22:
            {
            alt88=1;
            }
            break;
        case 41:
            {
            alt88=2;
            }
            break;
        case 42:
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
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2001:4: '.'
                {
                match(input,22,FOLLOW_22_in_synpred12_InternalFXML4738); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2003:6: ( ( '?.' ) )
                {
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2003:6: ( ( '?.' ) )
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2004:1: ( '?.' )
                {
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2004:1: ( '?.' )
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2005:2: '?.'
                {
                match(input,41,FOLLOW_41_in_synpred12_InternalFXML4752); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2010:6: ( ( '*.' ) )
                {
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2010:6: ( ( '*.' ) )
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2011:1: ( '*.' )
                {
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2011:1: ( '*.' )
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2012:2: '*.'
                {
                match(input,42,FOLLOW_42_in_synpred12_InternalFXML4772); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalFXML

    // $ANTLR start synpred13_InternalFXML
    public final void synpred13_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2121:4: ( ( '(' ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2122:1: ( '(' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2122:1: ( '(' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2123:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred13_InternalFXML4999); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalFXML

    // $ANTLR start synpred14_InternalFXML
    public final void synpred14_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2142:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2142:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2142:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2142:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2142:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2143:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2143:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==44||LA90_0==74) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2143:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2143:3: ( ( ruleJvmFormalParameter ) )
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2144:1: ( ruleJvmFormalParameter )
                {
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2144:1: ( ruleJvmFormalParameter )
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2145:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXML5051);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2147:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==43) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2147:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred14_InternalFXML5058); if (state.failed) return ;
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2148:1: ( ( ruleJvmFormalParameter ) )
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2149:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2149:1: ( ruleJvmFormalParameter )
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2150:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXML5065);
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

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2152:6: ( ( '|' ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2153:1: ( '|' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2153:1: ( '|' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2154:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred14_InternalFXML5079); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalFXML

    // $ANTLR start synpred15_InternalFXML
    public final void synpred15_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2221:4: ( ( ruleXClosure ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2222:1: ( ruleXClosure )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2222:1: ( ruleXClosure )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2223:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalFXML5197);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalFXML

    // $ANTLR start synpred16_InternalFXML
    public final void synpred16_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2504:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2504:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2504:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2504:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2504:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt92=2;
        int LA92_0 = input.LA(1);

        if ( (LA92_0==RULE_ID||LA92_0==44||LA92_0==74) ) {
            alt92=1;
        }
        switch (alt92) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2504:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2504:5: ( ( ruleJvmFormalParameter ) )
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2505:1: ( ruleJvmFormalParameter )
                {
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2505:1: ( ruleJvmFormalParameter )
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2506:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFXML5970);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2508:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop91:
                do {
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==43) ) {
                        alt91=1;
                    }


                    switch (alt91) {
                	case 1 :
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2508:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred16_InternalFXML5977); if (state.failed) return ;
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2509:1: ( ( ruleJvmFormalParameter ) )
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2510:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2510:1: ( ruleJvmFormalParameter )
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2511:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFXML5984);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop91;
                    }
                } while (true);


                }
                break;

        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2513:6: ( ( '|' ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2514:1: ( '|' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2514:1: ( '|' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2515:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred16_InternalFXML5998); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalFXML

    // $ANTLR start synpred18_InternalFXML
    public final void synpred18_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2874:4: ( 'else' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2874:6: 'else'
        {
        match(input,51,FOLLOW_51_in_synpred18_InternalFXML6781); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalFXML

    // $ANTLR start synpred19_InternalFXML
    public final void synpred19_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2928:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2928:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2928:3: ( ( ( ruleValidID ) ) ':' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2928:4: ( ( ruleValidID ) ) ':'
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2928:4: ( ( ruleValidID ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2929:1: ( ruleValidID )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2929:1: ( ruleValidID )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:2930:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalFXML6921);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,20,FOLLOW_20_in_synpred19_InternalFXML6927); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalFXML

    // $ANTLR start synpred20_InternalFXML
    public final void synpred20_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3503:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3503:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3503:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3503:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3503:6: ( ( ruleJvmTypeReference ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3504:1: ( ruleJvmTypeReference )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3504:1: ( ruleJvmTypeReference )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3505:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalFXML8167);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3507:2: ( ( ruleValidID ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3508:1: ( ruleValidID )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3508:1: ( ruleValidID )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3509:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalFXML8176);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalFXML

    // $ANTLR start synpred21_InternalFXML
    public final void synpred21_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3807:4: ( ( '(' ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3808:1: ( '(' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3808:1: ( '(' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3809:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred21_InternalFXML8738); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalFXML

    // $ANTLR start synpred22_InternalFXML
    public final void synpred22_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3828:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3828:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3828:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3828:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3828:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3829:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3829:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==44||LA96_0==74) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3829:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3829:3: ( ( ruleJvmFormalParameter ) )
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3830:1: ( ruleJvmFormalParameter )
                {
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3830:1: ( ruleJvmFormalParameter )
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3831:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalFXML8790);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3833:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==43) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3833:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred22_InternalFXML8797); if (state.failed) return ;
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3834:1: ( ( ruleJvmFormalParameter ) )
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3835:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3835:1: ( ruleJvmFormalParameter )
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3836:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalFXML8804);
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

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3838:6: ( ( '|' ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3839:1: ( '|' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3839:1: ( '|' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3840:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred22_InternalFXML8818); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalFXML

    // $ANTLR start synpred23_InternalFXML
    public final void synpred23_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3907:4: ( ( ruleXClosure ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3908:1: ( ruleXClosure )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3908:1: ( ruleXClosure )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:3909:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalFXML8936);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalFXML

    // $ANTLR start synpred24_InternalFXML
    public final void synpred24_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4104:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4104:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4104:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4104:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4104:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4105:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4105:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==44||LA98_0==74) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4105:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4105:3: ( ( ruleJvmFormalParameter ) )
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4106:1: ( ruleJvmFormalParameter )
                {
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4106:1: ( ruleJvmFormalParameter )
                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4107:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalFXML9427);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4109:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==43) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4109:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred24_InternalFXML9434); if (state.failed) return ;
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4110:1: ( ( ruleJvmFormalParameter ) )
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4111:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4111:1: ( ruleJvmFormalParameter )
                	    // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4112:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalFXML9441);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop97;
                    }
                } while (true);


                }
                break;

        }

        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4114:6: ( ( '|' ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4115:1: ( '|' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4115:1: ( '|' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4116:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred24_InternalFXML9455); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalFXML

    // $ANTLR start synpred25_InternalFXML
    public final void synpred25_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4183:2: ( ( ruleXClosure ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4184:1: ( ruleXClosure )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4184:1: ( ruleXClosure )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4185:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalFXML9571);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalFXML

    // $ANTLR start synpred26_InternalFXML
    public final void synpred26_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4507:2: ( ( ruleXExpression ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4508:1: ( ruleXExpression )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4508:1: ( ruleXExpression )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4509:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalFXML10374);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalFXML

    // $ANTLR start synpred27_InternalFXML
    public final void synpred27_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4578:5: ( 'catch' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4578:7: 'catch'
        {
        match(input,73,FOLLOW_73_in_synpred27_InternalFXML10519); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalFXML

    // $ANTLR start synpred28_InternalFXML
    public final void synpred28_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4597:5: ( 'finally' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4597:7: 'finally'
        {
        match(input,72,FOLLOW_72_in_synpred28_InternalFXML10549); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalFXML

    // $ANTLR start synpred30_InternalFXML
    public final void synpred30_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4745:3: ( '.' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4746:2: '.'
        {
        match(input,22,FOLLOW_22_in_synpred30_InternalFXML10896); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalFXML

    // $ANTLR start synpred31_InternalFXML
    public final void synpred31_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4794:2: ( ( () '[' ']' ) )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4794:3: ( () '[' ']' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4794:3: ( () '[' ']' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4794:4: () '[' ']'
        {
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4794:4: ()
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4795:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred31_InternalFXML11048); if (state.failed) return ;
        match(input,48,FOLLOW_48_in_synpred31_InternalFXML11052); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalFXML

    // $ANTLR start synpred32_InternalFXML
    public final void synpred32_InternalFXML_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4948:4: ( '<' )
        // ../at.bestsolution.efxclipse.tooling.fxml2/src-gen/at/bestsolution/efxclipse/tooling/fxml2/parser/antlr/internal/InternalFXML.g:4948:6: '<'
        {
        match(input,16,FOLLOW_16_in_synpred32_InternalFXML11409); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalFXML

    // Delegated rules

    public final boolean synpred28_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalFXML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalFXML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA85 dfa85 = new DFA85(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\20\2\6\1\24\2\uffff\1\6\1\5\1\25\1\6";
    static final String DFA7_maxS =
        "\1\20\1\6\1\23\1\25\2\uffff\1\6\1\5\1\25\1\23";
    static final String DFA7_acceptS =
        "\4\uffff\1\2\1\1\4\uffff";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\12\uffff\1\5\1\uffff\1\4",
            "\1\6\1\7",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\7",
            "\1\3\12\uffff\1\5\1\uffff\1\4"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "315:1: ( (otherlv_0= '<' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= rulePropertyAttributeDefinition ) )* otherlv_3= '>' ( (lv_children_4_0= rulePropertyDefinition ) )+ otherlv_5= '</' ( (lv_endname_6_0= RULE_ID ) ) otherlv_7= '>' ) | (otherlv_8= '<' ( (lv_name_9_0= RULE_ID ) ) ( (lv_attributes_10_0= rulePropertyAttributeDefinition ) )* otherlv_11= '/>' ) )";
        }
    }
    static final String DFA35_eotS =
        "\74\uffff";
    static final String DFA35_eofS =
        "\1\2\73\uffff";
    static final String DFA35_minS =
        "\1\5\1\0\72\uffff";
    static final String DFA35_maxS =
        "\1\112\1\0\72\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\2\2\uffff\1\2\6\uffff\2\2\2\uffff\1\2\1\uffff\26\2\1\1\2"+
            "\2\1\uffff\17\2\1\uffff\13\2",
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
            return "2121:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index35_1);
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
    static final String DFA34_eotS =
        "\34\uffff";
    static final String DFA34_eofS =
        "\34\uffff";
    static final String DFA34_minS =
        "\1\5\2\0\31\uffff";
    static final String DFA34_maxS =
        "\1\112\2\0\31\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA34_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\5\1\1\2\uffff\1\5\6\uffff\1\5\21\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\33\1\5\1\4\2\uffff\1\5\1\uffff\2\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2142:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==RULE_ID) ) {s = 1;}

                        else if ( (LA34_0==44) ) {s = 2;}

                        else if ( (LA34_0==74) && (synpred14_InternalFXML())) {s = 3;}

                        else if ( (LA34_0==47) && (synpred14_InternalFXML())) {s = 4;}

                        else if ( (LA34_0==RULE_STRING||LA34_0==RULE_INT||LA34_0==16||(LA34_0>=34 && LA34_0<=35)||LA34_0==39||LA34_0==46||LA34_0==50||(LA34_0>=52 && LA34_0<=53)||(LA34_0>=57 && LA34_0<=59)||LA34_0==62||(LA34_0>=64 && LA34_0<=71)) ) {s = 5;}

                        else if ( (LA34_0==45) ) {s = 27;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalFXML()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalFXML()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\74\uffff";
    static final String DFA36_eofS =
        "\1\2\73\uffff";
    static final String DFA36_minS =
        "\1\5\1\0\72\uffff";
    static final String DFA36_maxS =
        "\1\112\1\0\72\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA36_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA36_transitionS = {
            "\2\2\2\uffff\1\2\6\uffff\2\2\2\uffff\1\2\1\uffff\30\2\1\1\1"+
            "\uffff\17\2\1\uffff\13\2",
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
            return "2221:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred15_InternalFXML()) ) {s = 59;}

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
    static final String DFA42_eotS =
        "\36\uffff";
    static final String DFA42_eofS =
        "\36\uffff";
    static final String DFA42_minS =
        "\1\5\2\0\33\uffff";
    static final String DFA42_maxS =
        "\1\112\2\0\33\uffff";
    static final String DFA42_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA42_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\5\1\1\2\uffff\1\5\6\uffff\1\5\21\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\2\5\3\uffff"+
            "\6\5\1\uffff\10\5\2\uffff\1\3",
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
            return "2504:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_0 = input.LA(1);

                         
                        int index42_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA42_0==RULE_ID) ) {s = 1;}

                        else if ( (LA42_0==44) ) {s = 2;}

                        else if ( (LA42_0==74) && (synpred16_InternalFXML())) {s = 3;}

                        else if ( (LA42_0==47) && (synpred16_InternalFXML())) {s = 4;}

                        else if ( (LA42_0==RULE_STRING||LA42_0==RULE_INT||LA42_0==16||(LA42_0>=34 && LA42_0<=35)||LA42_0==39||LA42_0==46||LA42_0==48||LA42_0==50||(LA42_0>=52 && LA42_0<=53)||(LA42_0>=57 && LA42_0<=62)||(LA42_0>=64 && LA42_0<=71)) ) {s = 5;}

                         
                        input.seek(index42_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_1 = input.LA(1);

                         
                        int index42_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalFXML()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index42_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalFXML()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index42_2);
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
    static final String DFA65_eotS =
        "\74\uffff";
    static final String DFA65_eofS =
        "\1\2\73\uffff";
    static final String DFA65_minS =
        "\1\5\1\0\72\uffff";
    static final String DFA65_maxS =
        "\1\112\1\0\72\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA65_transitionS = {
            "\2\2\2\uffff\1\2\6\uffff\2\2\2\uffff\1\2\1\uffff\26\2\1\1\2"+
            "\2\1\uffff\17\2\1\uffff\13\2",
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

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3807:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\34\uffff";
    static final String DFA64_eofS =
        "\34\uffff";
    static final String DFA64_minS =
        "\1\5\2\0\31\uffff";
    static final String DFA64_maxS =
        "\1\112\2\0\31\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\5\1\1\2\uffff\1\5\6\uffff\1\5\21\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\33\1\5\1\4\2\uffff\1\5\1\uffff\2\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3828:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_0 = input.LA(1);

                         
                        int index64_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_0==RULE_ID) ) {s = 1;}

                        else if ( (LA64_0==44) ) {s = 2;}

                        else if ( (LA64_0==74) && (synpred22_InternalFXML())) {s = 3;}

                        else if ( (LA64_0==47) && (synpred22_InternalFXML())) {s = 4;}

                        else if ( (LA64_0==RULE_STRING||LA64_0==RULE_INT||LA64_0==16||(LA64_0>=34 && LA64_0<=35)||LA64_0==39||LA64_0==46||LA64_0==50||(LA64_0>=52 && LA64_0<=53)||(LA64_0>=57 && LA64_0<=59)||LA64_0==62||(LA64_0>=64 && LA64_0<=71)) ) {s = 5;}

                        else if ( (LA64_0==45) ) {s = 27;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalFXML()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalFXML()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\74\uffff";
    static final String DFA66_eofS =
        "\1\2\73\uffff";
    static final String DFA66_minS =
        "\1\5\1\0\72\uffff";
    static final String DFA66_maxS =
        "\1\112\1\0\72\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA66_transitionS = {
            "\2\2\2\uffff\1\2\6\uffff\2\2\2\uffff\1\2\1\uffff\30\2\1\1\1"+
            "\uffff\17\2\1\uffff\13\2",
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

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3907:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\34\uffff";
    static final String DFA72_eofS =
        "\34\uffff";
    static final String DFA72_minS =
        "\1\5\2\0\31\uffff";
    static final String DFA72_maxS =
        "\1\112\2\0\31\uffff";
    static final String DFA72_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA72_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\5\1\1\2\uffff\1\5\6\uffff\1\5\21\uffff\2\5\3\uffff\1\5\4"+
            "\uffff\1\2\1\33\1\5\1\4\2\uffff\1\5\1\uffff\2\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "4104:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_0 = input.LA(1);

                         
                        int index72_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA72_0==RULE_ID) ) {s = 1;}

                        else if ( (LA72_0==44) ) {s = 2;}

                        else if ( (LA72_0==74) && (synpred24_InternalFXML())) {s = 3;}

                        else if ( (LA72_0==47) && (synpred24_InternalFXML())) {s = 4;}

                        else if ( (LA72_0==RULE_STRING||LA72_0==RULE_INT||LA72_0==16||(LA72_0>=34 && LA72_0<=35)||LA72_0==39||LA72_0==46||LA72_0==50||(LA72_0>=52 && LA72_0<=53)||(LA72_0>=57 && LA72_0<=59)||LA72_0==62||(LA72_0>=64 && LA72_0<=71)) ) {s = 5;}

                        else if ( (LA72_0==45) ) {s = 27;}

                         
                        input.seek(index72_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalFXML()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalFXML()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\74\uffff";
    static final String DFA73_eofS =
        "\1\2\73\uffff";
    static final String DFA73_minS =
        "\1\5\1\0\72\uffff";
    static final String DFA73_maxS =
        "\1\112\1\0\72\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA73_transitionS = {
            "\2\2\2\uffff\1\2\6\uffff\2\2\2\uffff\1\2\1\uffff\30\2\1\1\1"+
            "\uffff\17\2\1\uffff\13\2",
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

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "4183:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA75_eotS =
        "\74\uffff";
    static final String DFA75_eofS =
        "\1\31\73\uffff";
    static final String DFA75_minS =
        "\1\5\30\0\43\uffff";
    static final String DFA75_maxS =
        "\1\112\30\0\43\uffff";
    static final String DFA75_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA75_transitionS = {
            "\1\17\1\1\2\uffff\1\15\6\uffff\1\10\1\31\2\uffff\1\31\1\uffff"+
            "\14\31\1\4\1\3\3\31\1\2\4\31\1\30\1\31\1\12\1\uffff\2\31\1\21"+
            "\1\31\1\7\1\6\3\31\1\22\1\23\1\24\2\31\1\11\1\uffff\1\5\1\13"+
            "\1\14\1\16\1\20\1\25\1\26\1\27\3\31",
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

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "4507:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA75_2 = input.LA(1);

                         
                        int index75_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA75_3 = input.LA(1);

                         
                        int index75_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA75_4 = input.LA(1);

                         
                        int index75_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA75_5 = input.LA(1);

                         
                        int index75_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA75_6 = input.LA(1);

                         
                        int index75_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA75_7 = input.LA(1);

                         
                        int index75_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA75_8 = input.LA(1);

                         
                        int index75_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA75_9 = input.LA(1);

                         
                        int index75_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA75_10 = input.LA(1);

                         
                        int index75_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA75_11 = input.LA(1);

                         
                        int index75_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA75_12 = input.LA(1);

                         
                        int index75_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA75_13 = input.LA(1);

                         
                        int index75_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA75_14 = input.LA(1);

                         
                        int index75_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA75_15 = input.LA(1);

                         
                        int index75_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA75_16 = input.LA(1);

                         
                        int index75_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA75_17 = input.LA(1);

                         
                        int index75_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA75_18 = input.LA(1);

                         
                        int index75_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA75_19 = input.LA(1);

                         
                        int index75_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA75_20 = input.LA(1);

                         
                        int index75_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA75_21 = input.LA(1);

                         
                        int index75_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA75_22 = input.LA(1);

                         
                        int index75_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA75_23 = input.LA(1);

                         
                        int index75_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA75_24 = input.LA(1);

                         
                        int index75_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXML()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index75_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\74\uffff";
    static final String DFA85_eofS =
        "\1\2\73\uffff";
    static final String DFA85_minS =
        "\1\5\1\0\72\uffff";
    static final String DFA85_maxS =
        "\1\112\1\0\72\uffff";
    static final String DFA85_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA85_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA85_transitionS = {
            "\2\2\2\uffff\1\2\6\uffff\1\1\1\2\2\uffff\1\2\1\uffff\31\2\1"+
            "\uffff\17\2\1\uffff\13\2",
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
            return "4948:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
                        if ( (synpred32_InternalFXML()) ) {s = 59;}

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
    public static final BitSet FOLLOW_ruleXMLDec_in_ruleModel131 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleModel148 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleProcessingInstruction_in_ruleModel175 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleModel193 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleClassDefinition_in_ruleModel220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMLDec_in_entryRuleXMLDec257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMLDec268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleXMLDec306 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleXMLDec319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXMLDec334 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXMLDec352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXMLDec367 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXMLDec385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessingInstruction_in_entryRuleProcessingInstruction425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessingInstruction435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleProcessingInstruction472 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcessingInstruction489 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleProcessingInstruction515 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProcessingInstruction527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDefinition_in_entryRuleClassDefinition563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDefinition573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleClassDefinition611 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassDefinition628 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_rulePropertyAttributeDefinition_in_ruleClassDefinition654 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_17_in_ruleClassDefinition667 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleClassDefinition688 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_18_in_ruleClassDefinition701 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassDefinition718 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleClassDefinition735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleClassDefinition755 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassDefinition772 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_rulePropertyAttributeDefinition_in_ruleClassDefinition798 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_19_in_ruleClassDefinition811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAttributeDefinition_in_entryRulePropertyAttributeDefinition848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAttributeDefinition858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyAttributeDefinition901 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePropertyAttributeDefinition918 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyAttributeDefinition937 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePropertyAttributeDefinition954 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePropertyAttributeDefinition971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePropertyDefinition1059 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyDefinition1080 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePropertyDefinition1092 = new BitSet(new long[]{0x00000000000501F0L});
    public static final BitSet FOLLOW_ruleClassDefinition_in_rulePropertyDefinition1114 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_ruleContent_in_rulePropertyDefinition1142 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePropertyDefinition1155 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyDefinition1176 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePropertyDefinition1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent1225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContent1276 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContent1302 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleContent1328 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleContent1354 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1459 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedNameWithWildCard1478 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleQualifiedNameWithWildCard1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1691 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1707 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1757 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1810 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpSingleAssign1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpMultiAssign2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2105 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2158 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2181 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOr2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2364 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2417 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2440 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpAnd2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2623 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2676 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2699 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpEquality2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpEquality2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2903 = new BitSet(new long[]{0x00000000E0030002L});
    public static final BitSet FOLLOW_29_in_ruleXRelationalExpression2939 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2964 = new BitSet(new long[]{0x00000000E0030002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3025 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3048 = new BitSet(new long[]{0x00000000E0030002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpCompare3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpCompare3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3291 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3344 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3367 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3571 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3624 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3647 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3851 = new BitSet(new long[]{0x0000007000800002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3904 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3927 = new BitSet(new long[]{0x0000007000800002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpMulti4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4180 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4450 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleXCastedExpression4485 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4508 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4603 = new BitSet(new long[]{0x0000060000400002L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall4652 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4675 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4691 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4713 = new BitSet(new long[]{0x0000060000400002L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall4799 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4823 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4860 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall4889 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4910 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4923 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4944 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_ruleXMemberFeatureCall4958 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4983 = new BitSet(new long[]{0x0000560000400002L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall5017 = new BitSet(new long[]{0x4E34F08C00010260L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall5102 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5130 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall5143 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall5164 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall5181 = new BitSet(new long[]{0x0000460000400002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5214 = new BitSet(new long[]{0x0000060000400002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5953 = new BitSet(new long[]{0x7E35D08C00010260L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6024 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure6037 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure6058 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure6080 = new BitSet(new long[]{0x7E35508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure6117 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6231 = new BitSet(new long[]{0x7E36508C00010262L,0x00000000000000FFL});
    public static final BitSet FOLLOW_49_in_ruleXExpressionInClosure6244 = new BitSet(new long[]{0x7E34508C00010262L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6402 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure6415 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6436 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXShortClosure6458 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXParenthesizedExpression6577 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6599 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXParenthesizedExpression6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression6702 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression6714 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6735 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression6747 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6768 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression6789 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6905 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6946 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXSwitchExpression6958 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6982 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6994 = new BitSet(new long[]{0x0100100000100040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7015 = new BitSet(new long[]{0x01C0100000100040L,0x0000000000000400L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression7029 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXSwitchExpression7041 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7062 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7168 = new BitSet(new long[]{0x0100000000100000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart7182 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7203 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXCasePart7217 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXForLoopExpression7330 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXForLoopExpression7342 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7363 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXForLoopExpression7375 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7396 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXForLoopExpression7408 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXWhileExpression7521 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXWhileExpression7533 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7554 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXWhileExpression7566 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression7679 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7700 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression7712 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXDoWhileExpression7724 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7745 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXDoWhileExpression7757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression7849 = new BitSet(new long[]{0x7EB4508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7871 = new BitSet(new long[]{0x7EB6508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_49_in_ruleXBlockExpression7884 = new BitSet(new long[]{0x7EB4508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_55_in_ruleXBlockExpression7900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration8118 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration8149 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8197 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8218 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8247 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleXVariableDeclaration8261 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8376 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8490 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8614 = new BitSet(new long[]{0x4000000000010040L});
    public static final BitSet FOLLOW_16_in_ruleXFeatureCall8628 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8649 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall8662 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8683 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_ruleXFeatureCall8697 = new BitSet(new long[]{0x4000000000010040L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8722 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall8756 = new BitSet(new long[]{0x4E34F08C00010260L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8841 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8869 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall8882 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8903 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8920 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleIdOrSuper9073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9172 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleStaticQualifier9190 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXConstructorCall9287 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9310 = new BitSet(new long[]{0x0000100000010000L});
    public static final BitSet FOLLOW_16_in_ruleXConstructorCall9323 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9344 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall9357 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9378 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_ruleXConstructorCall9392 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall9406 = new BitSet(new long[]{0x4E34F08C00010260L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9478 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9506 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall9519 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9540 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall9557 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral9682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXBooleanLiteral9706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXNullLiteral9812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTypeLiteral10108 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXTypeLiteral10120 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10143 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXTypeLiteral10155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXThrowExpression10247 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXReturnExpression10360 = new BitSet(new long[]{0x4E34508C00010262L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression10484 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10535 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression10557 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression10601 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXCatchClause10715 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXCatchClause10728 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10749 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXCatchClause10761 = new BitSet(new long[]{0x4E34508C00010260L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10877 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName10905 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10928 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11033 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleJvmTypeReference11071 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleJvmTypeReference11083 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef11198 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11219 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef11232 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11253 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef11267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleXFunctionTypeRef11281 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11396 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleJvmParameterizedTypeReference11417 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11439 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_43_in_ruleJvmParameterizedTypeReference11452 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11473 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_17_in_ruleJvmParameterizedTypeReference11487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmWildcardTypeReference11700 = new BitSet(new long[]{0x4000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBound11834 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBoundAnded11938 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleJvmLowerBound12042 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFXML1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalFXML2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalFXML2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalFXML2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred5_InternalFXML2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalFXML2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalFXML3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalFXML3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalFXML3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred10_InternalFXML4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred11_InternalFXML4620 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalFXML4629 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalFXML4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred12_InternalFXML4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred12_InternalFXML4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred12_InternalFXML4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred13_InternalFXML4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXML5051 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalFXML5058 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXML5065 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred14_InternalFXML5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalFXML5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFXML5970 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred16_InternalFXML5977 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalFXML5984 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred16_InternalFXML5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred18_InternalFXML6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalFXML6921 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_synpred19_InternalFXML6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalFXML8167 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalFXML8176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred21_InternalFXML8738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalFXML8790 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred22_InternalFXML8797 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalFXML8804 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred22_InternalFXML8818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalFXML8936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalFXML9427 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred24_InternalFXML9434 = new BitSet(new long[]{0x0000100000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalFXML9441 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred24_InternalFXML9455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalFXML9571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalFXML10374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred27_InternalFXML10519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred28_InternalFXML10549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred30_InternalFXML10896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred31_InternalFXML11048 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_synpred31_InternalFXML11052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred32_InternalFXML11409 = new BitSet(new long[]{0x0000000000000002L});

}