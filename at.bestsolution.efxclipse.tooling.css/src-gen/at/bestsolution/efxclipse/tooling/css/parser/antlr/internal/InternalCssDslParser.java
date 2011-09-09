package at.bestsolution.efxclipse.tooling.css.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.efxclipse.tooling.css.services.CssDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCssDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMA", "RULE_IDENT", "RULE_WS", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_STRING", "RULE_INTEGER", "RULE_REAL", "RULE_ML_COMMENT", "'media'", "'{'", "'}'", "';'", "'*'", "'.'", "'#'", "'['", "'='", "']'", "':'", "'-'", "'+'", "'>'", "'/'", "'('", "')'", "'url'", "'%'", "'em'", "'ex'", "'px'", "'cm'", "'mm'", "'in'", "'pt'", "'pc'", "'deg'", "'rad'", "'grad'", "'ms'", "'s'", "'hz'", "'khz'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_INCLUDES=7;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_REAL=11;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_COMMA=4;
    public static final int RULE_ML_COMMENT=12;
    public static final int RULE_DASHMATCH=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_IDENT=5;
    public static final int T__39=39;
    public static final int RULE_WS=6;
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
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g"; }



     	private CssDslGrammarAccess grammarAccess;
     	
        public InternalCssDslParser(TokenStream input, CssDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "stylesheet";	
       	}
       	
       	@Override
       	protected CssDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulestylesheet"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:67:1: entryRulestylesheet returns [EObject current=null] : iv_rulestylesheet= rulestylesheet EOF ;
    public final EObject entryRulestylesheet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestylesheet = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:68:2: (iv_rulestylesheet= rulestylesheet EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:69:2: iv_rulestylesheet= rulestylesheet EOF
            {
             newCompositeNode(grammarAccess.getStylesheetRule()); 
            pushFollow(FOLLOW_rulestylesheet_in_entryRulestylesheet75);
            iv_rulestylesheet=rulestylesheet();

            state._fsp--;

             current =iv_rulestylesheet; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestylesheet85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestylesheet"


    // $ANTLR start "rulestylesheet"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:76:1: rulestylesheet returns [EObject current=null] : ( ( (lv_ruleset_0_0= ruleruleset ) ) | ( (lv_media_1_0= rulemedia ) ) )* ;
    public final EObject rulestylesheet() throws RecognitionException {
        EObject current = null;

        EObject lv_ruleset_0_0 = null;

        EObject lv_media_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:79:28: ( ( ( (lv_ruleset_0_0= ruleruleset ) ) | ( (lv_media_1_0= rulemedia ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:80:1: ( ( (lv_ruleset_0_0= ruleruleset ) ) | ( (lv_media_1_0= rulemedia ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:80:1: ( ( (lv_ruleset_0_0= ruleruleset ) ) | ( (lv_media_1_0= rulemedia ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_IDENT||(LA1_0>=17 && LA1_0<=20)||LA1_0==23) ) {
                    alt1=1;
                }
                else if ( (LA1_0==13) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:80:2: ( (lv_ruleset_0_0= ruleruleset ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:80:2: ( (lv_ruleset_0_0= ruleruleset ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:81:1: (lv_ruleset_0_0= ruleruleset )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:81:1: (lv_ruleset_0_0= ruleruleset )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:82:3: lv_ruleset_0_0= ruleruleset
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleruleset_in_rulestylesheet131);
            	    lv_ruleset_0_0=ruleruleset();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ruleset",
            	            		lv_ruleset_0_0, 
            	            		"ruleset");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:99:6: ( (lv_media_1_0= rulemedia ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:99:6: ( (lv_media_1_0= rulemedia ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:100:1: (lv_media_1_0= rulemedia )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:100:1: (lv_media_1_0= rulemedia )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:101:3: lv_media_1_0= rulemedia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulemedia_in_rulestylesheet158);
            	    lv_media_1_0=rulemedia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"media",
            	            		lv_media_1_0, 
            	            		"media");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestylesheet"


    // $ANTLR start "entryRulemedia"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:125:1: entryRulemedia returns [EObject current=null] : iv_rulemedia= rulemedia EOF ;
    public final EObject entryRulemedia() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemedia = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:126:2: (iv_rulemedia= rulemedia EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:127:2: iv_rulemedia= rulemedia EOF
            {
             newCompositeNode(grammarAccess.getMediaRule()); 
            pushFollow(FOLLOW_rulemedia_in_entryRulemedia195);
            iv_rulemedia=rulemedia();

            state._fsp--;

             current =iv_rulemedia; 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia205); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemedia"


    // $ANTLR start "rulemedia"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:134:1: rulemedia returns [EObject current=null] : (otherlv_0= 'media' ( (lv_medialist_1_0= rulemedia_list ) ) otherlv_2= '{' ( (lv_rulesets_3_0= ruleruleset ) )* otherlv_4= '}' ) ;
    public final EObject rulemedia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_medialist_1_0 = null;

        EObject lv_rulesets_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:137:28: ( (otherlv_0= 'media' ( (lv_medialist_1_0= rulemedia_list ) ) otherlv_2= '{' ( (lv_rulesets_3_0= ruleruleset ) )* otherlv_4= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:138:1: (otherlv_0= 'media' ( (lv_medialist_1_0= rulemedia_list ) ) otherlv_2= '{' ( (lv_rulesets_3_0= ruleruleset ) )* otherlv_4= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:138:1: (otherlv_0= 'media' ( (lv_medialist_1_0= rulemedia_list ) ) otherlv_2= '{' ( (lv_rulesets_3_0= ruleruleset ) )* otherlv_4= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:138:3: otherlv_0= 'media' ( (lv_medialist_1_0= rulemedia_list ) ) otherlv_2= '{' ( (lv_rulesets_3_0= ruleruleset ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulemedia242); 

                	newLeafNode(otherlv_0, grammarAccess.getMediaAccess().getMediaKeyword_0());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:142:1: ( (lv_medialist_1_0= rulemedia_list ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:143:1: (lv_medialist_1_0= rulemedia_list )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:143:1: (lv_medialist_1_0= rulemedia_list )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:144:3: lv_medialist_1_0= rulemedia_list
            {
             
            	        newCompositeNode(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulemedia_list_in_rulemedia263);
            lv_medialist_1_0=rulemedia_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMediaRule());
            	        }
                   		set(
                   			current, 
                   			"medialist",
                    		lv_medialist_1_0, 
                    		"media_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulemedia275); 

                	newLeafNode(otherlv_2, grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:164:1: ( (lv_rulesets_3_0= ruleruleset ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_IDENT||(LA2_0>=17 && LA2_0<=20)||LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:165:1: (lv_rulesets_3_0= ruleruleset )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:165:1: (lv_rulesets_3_0= ruleruleset )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:166:3: lv_rulesets_3_0= ruleruleset
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleruleset_in_rulemedia296);
            	    lv_rulesets_3_0=ruleruleset();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMediaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rulesets",
            	            		lv_rulesets_3_0, 
            	            		"ruleset");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_rulemedia309); 

                	newLeafNode(otherlv_4, grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemedia"


    // $ANTLR start "entryRulemedia_list"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:194:1: entryRulemedia_list returns [String current=null] : iv_rulemedia_list= rulemedia_list EOF ;
    public final String entryRulemedia_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemedia_list = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:195:2: (iv_rulemedia_list= rulemedia_list EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:196:2: iv_rulemedia_list= rulemedia_list EOF
            {
             newCompositeNode(grammarAccess.getMedia_listRule()); 
            pushFollow(FOLLOW_rulemedia_list_in_entryRulemedia_list346);
            iv_rulemedia_list=rulemedia_list();

            state._fsp--;

             current =iv_rulemedia_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia_list357); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemedia_list"


    // $ANTLR start "rulemedia_list"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:203:1: rulemedia_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* ) ;
    public final AntlrDatatypeRuleToken rulemedia_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMA_1=null;
        AntlrDatatypeRuleToken this_medium_0 = null;

        AntlrDatatypeRuleToken this_medium_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:206:28: ( (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:207:1: (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:207:1: (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:208:5: this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )*
            {
             
                    newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulemedium_in_rulemedia_list404);
            this_medium_0=rulemedium();

            state._fsp--;


            		current.merge(this_medium_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:218:1: (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:218:6: this_COMMA_1= RULE_COMMA this_medium_2= rulemedium
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulemedia_list425); 

            	    		current.merge(this_COMMA_1);
            	        
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulemedium_in_rulemedia_list452);
            	    this_medium_2=rulemedium();

            	    state._fsp--;


            	    		current.merge(this_medium_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemedia_list"


    // $ANTLR start "entryRulemedium"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:244:1: entryRulemedium returns [String current=null] : iv_rulemedium= rulemedium EOF ;
    public final String entryRulemedium() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemedium = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:2: (iv_rulemedium= rulemedium EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:246:2: iv_rulemedium= rulemedium EOF
            {
             newCompositeNode(grammarAccess.getMediumRule()); 
            pushFollow(FOLLOW_rulemedium_in_entryRulemedium500);
            iv_rulemedium=rulemedium();

            state._fsp--;

             current =iv_rulemedium.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedium511); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemedium"


    // $ANTLR start "rulemedium"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:253:1: rulemedium returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENT_0= RULE_IDENT ;
    public final AntlrDatatypeRuleToken rulemedium() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:256:28: (this_IDENT_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:257:5: this_IDENT_0= RULE_IDENT
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulemedium550); 

            		current.merge(this_IDENT_0);
                
             
                newLeafNode(this_IDENT_0, grammarAccess.getMediumAccess().getIDENTTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemedium"


    // $ANTLR start "entryRuleruleset"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:272:1: entryRuleruleset returns [EObject current=null] : iv_ruleruleset= ruleruleset EOF ;
    public final EObject entryRuleruleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleset = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:273:2: (iv_ruleruleset= ruleruleset EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:274:2: iv_ruleruleset= ruleruleset EOF
            {
             newCompositeNode(grammarAccess.getRulesetRule()); 
            pushFollow(FOLLOW_ruleruleset_in_entryRuleruleset594);
            iv_ruleruleset=ruleruleset();

            state._fsp--;

             current =iv_ruleruleset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleset604); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleruleset"


    // $ANTLR start "ruleruleset"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:281:1: ruleruleset returns [EObject current=null] : ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
    public final EObject ruleruleset() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_selectors_0_0 = null;

        EObject lv_selectors_2_0 = null;

        EObject lv_declarations_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:284:28: ( ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:285:1: ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:285:1: ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:285:2: ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:285:2: ( (lv_selectors_0_0= ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:286:1: (lv_selectors_0_0= ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:286:1: (lv_selectors_0_0= ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:287:3: lv_selectors_0_0= ruleselector
            {
             
            	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleselector_in_ruleruleset650);
            lv_selectors_0_0=ruleselector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRulesetRule());
            	        }
                   		add(
                   			current, 
                   			"selectors",
                    		lv_selectors_0_0, 
                    		"selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:303:2: (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:303:3: this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleruleset662); 
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:307:1: ( (lv_selectors_2_0= ruleselector ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:308:1: (lv_selectors_2_0= ruleselector )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:308:1: (lv_selectors_2_0= ruleselector )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:309:3: lv_selectors_2_0= ruleselector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleselector_in_ruleruleset682);
            	    lv_selectors_2_0=ruleselector();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRulesetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"selectors",
            	            		lv_selectors_2_0, 
            	            		"selector");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleruleset696); 

                	newLeafNode(otherlv_3, grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:329:1: ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_IDENT||LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:329:2: ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';'
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:329:2: ( (lv_declarations_4_0= rulecss_declaration ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:330:1: (lv_declarations_4_0= rulecss_declaration )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:330:1: (lv_declarations_4_0= rulecss_declaration )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:331:3: lv_declarations_4_0= rulecss_declaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecss_declaration_in_ruleruleset718);
            	    lv_declarations_4_0=rulecss_declaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRulesetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_4_0, 
            	            		"css_declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleruleset730); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRulesetAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleruleset744); 

                	newLeafNode(otherlv_6, grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleruleset"


    // $ANTLR start "entryRuleselector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:363:1: entryRuleselector returns [EObject current=null] : iv_ruleselector= ruleselector EOF ;
    public final EObject entryRuleselector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleselector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:367:2: (iv_ruleselector= ruleselector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:368:2: iv_ruleselector= ruleselector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector786);
            iv_ruleselector=ruleselector();

            state._fsp--;

             current =iv_ruleselector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector796); 

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
    // $ANTLR end "entryRuleselector"


    // $ANTLR start "ruleselector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:378:1: ruleselector returns [EObject current=null] : ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )? ) ;
    public final EObject ruleselector() throws RecognitionException {
        EObject current = null;

        Token this_WS_3=null;
        EObject lv_simpleselectors_0_0 = null;

        AntlrDatatypeRuleToken lv_combinator_1_0 = null;

        EObject lv_selector_2_0 = null;

        AntlrDatatypeRuleToken lv_combinator_4_0 = null;

        EObject lv_selector_5_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:382:28: ( ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:383:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:383:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:383:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:383:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:384:1: (lv_simpleselectors_0_0= rulesimple_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:384:1: (lv_simpleselectors_0_0= rulesimple_selector )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:385:3: lv_simpleselectors_0_0= rulesimple_selector
            {
             
            	        newCompositeNode(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulesimple_selector_in_ruleselector846);
            lv_simpleselectors_0_0=rulesimple_selector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectorRule());
            	        }
                   		add(
                   			current, 
                   			"simpleselectors",
                    		lv_simpleselectors_0_0, 
                    		"simple_selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:401:2: ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=25 && LA9_0<=26)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_WS) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:401:3: ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:401:3: ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:401:4: ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:401:4: ( (lv_combinator_1_0= rulecombinator ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:402:1: (lv_combinator_1_0= rulecombinator )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:402:1: (lv_combinator_1_0= rulecombinator )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:403:3: lv_combinator_1_0= rulecombinator
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecombinator_in_ruleselector869);
                    lv_combinator_1_0=rulecombinator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                    	        }
                           		set(
                           			current, 
                           			"combinator",
                            		lv_combinator_1_0, 
                            		"combinator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:419:2: ( (lv_selector_2_0= ruleselector ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:420:1: (lv_selector_2_0= ruleselector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:420:1: (lv_selector_2_0= ruleselector )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:421:3: lv_selector_2_0= ruleselector
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleselector_in_ruleselector890);
                    lv_selector_2_0=ruleselector();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                    	        }
                           		set(
                           			current, 
                           			"selector",
                            		lv_selector_2_0, 
                            		"selector");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:438:6: ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:438:6: ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:438:7: (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:438:7: (this_WS_3= RULE_WS )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_WS) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:438:8: this_WS_3= RULE_WS
                    	    {
                    	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector910); 
                    	     
                    	        newLeafNode(this_WS_3, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:442:3: ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_IDENT||(LA8_0>=17 && LA8_0<=20)||LA8_0==23||(LA8_0>=25 && LA8_0<=26)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:442:4: ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:442:4: ( (lv_combinator_4_0= rulecombinator ) )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( ((LA7_0>=25 && LA7_0<=26)) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:443:1: (lv_combinator_4_0= rulecombinator )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:443:1: (lv_combinator_4_0= rulecombinator )
                                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:444:3: lv_combinator_4_0= rulecombinator
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_rulecombinator_in_ruleselector933);
                                    lv_combinator_4_0=rulecombinator();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"combinator",
                                            		lv_combinator_4_0, 
                                            		"combinator");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:460:3: ( (lv_selector_5_0= ruleselector ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:461:1: (lv_selector_5_0= ruleselector )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:461:1: (lv_selector_5_0= ruleselector )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:462:3: lv_selector_5_0= ruleselector
                            {
                             
                            	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleselector_in_ruleselector955);
                            lv_selector_5_0=ruleselector();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSelectorRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"selector",
                                    		lv_selector_5_0, 
                                    		"selector");
                            	        afterParserOrEnumRuleCall();
                            	    

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


            }

             leaveRule(); 
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
    // $ANTLR end "ruleselector"


    // $ANTLR start "entryRulesimple_selector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:489:1: entryRulesimple_selector returns [EObject current=null] : iv_rulesimple_selector= rulesimple_selector EOF ;
    public final EObject entryRulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_selector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:490:2: (iv_rulesimple_selector= rulesimple_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:491:2: iv_rulesimple_selector= rulesimple_selector EOF
            {
             newCompositeNode(grammarAccess.getSimple_selectorRule()); 
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector1000);
            iv_rulesimple_selector=rulesimple_selector();

            state._fsp--;

             current =iv_rulesimple_selector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector1010); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_selector"


    // $ANTLR start "rulesimple_selector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:498:1: rulesimple_selector returns [EObject current=null] : ( ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )* ) | ( (lv_subSelectors_2_0= rulesub_selector ) )+ ) ;
    public final EObject rulesimple_selector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_element_0_0 = null;

        EObject lv_subSelectors_1_0 = null;

        EObject lv_subSelectors_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:501:28: ( ( ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )* ) | ( (lv_subSelectors_2_0= rulesub_selector ) )+ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:502:1: ( ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )* ) | ( (lv_subSelectors_2_0= rulesub_selector ) )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:502:1: ( ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )* ) | ( (lv_subSelectors_2_0= rulesub_selector ) )+ )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_IDENT||LA12_0==17) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=18 && LA12_0<=20)||LA12_0==23) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:502:2: ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:502:2: ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )* )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:502:3: ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:502:3: ( (lv_element_0_0= ruleelement_name ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:503:1: (lv_element_0_0= ruleelement_name )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:503:1: (lv_element_0_0= ruleelement_name )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:504:3: lv_element_0_0= ruleelement_name
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getElementElement_nameParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleelement_name_in_rulesimple_selector1057);
                    lv_element_0_0=ruleelement_name();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_0_0, 
                            		"element_name");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:520:2: ( (lv_subSelectors_1_0= rulesub_selector ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=18 && LA10_0<=20)||LA10_0==23) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:521:1: (lv_subSelectors_1_0= rulesub_selector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:521:1: (lv_subSelectors_1_0= rulesub_selector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:522:3: lv_subSelectors_1_0= rulesub_selector
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulesub_selector_in_rulesimple_selector1078);
                    	    lv_subSelectors_1_0=rulesub_selector();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subSelectors",
                    	            		lv_subSelectors_1_0, 
                    	            		"sub_selector");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:539:6: ( (lv_subSelectors_2_0= rulesub_selector ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:539:6: ( (lv_subSelectors_2_0= rulesub_selector ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=18 && LA11_0<=20)||LA11_0==23) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:540:1: (lv_subSelectors_2_0= rulesub_selector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:540:1: (lv_subSelectors_2_0= rulesub_selector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:541:3: lv_subSelectors_2_0= rulesub_selector
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulesub_selector_in_rulesimple_selector1107);
                    	    lv_subSelectors_2_0=rulesub_selector();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimple_selectorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subSelectors",
                    	            		lv_subSelectors_2_0, 
                    	            		"sub_selector");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_selector"


    // $ANTLR start "entryRuleelement_name"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:565:1: entryRuleelement_name returns [String current=null] : iv_ruleelement_name= ruleelement_name EOF ;
    public final String entryRuleelement_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelement_name = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:566:2: (iv_ruleelement_name= ruleelement_name EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:567:2: iv_ruleelement_name= ruleelement_name EOF
            {
             newCompositeNode(grammarAccess.getElement_nameRule()); 
            pushFollow(FOLLOW_ruleelement_name_in_entryRuleelement_name1145);
            iv_ruleelement_name=ruleelement_name();

            state._fsp--;

             current =iv_ruleelement_name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement_name1156); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleelement_name"


    // $ANTLR start "ruleelement_name"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:574:1: ruleelement_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleelement_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:577:28: ( (this_IDENT_0= RULE_IDENT | kw= '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:578:1: (this_IDENT_0= RULE_IDENT | kw= '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:578:1: (this_IDENT_0= RULE_IDENT | kw= '*' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_IDENT) ) {
                alt13=1;
            }
            else if ( (LA13_0==17) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:578:6: this_IDENT_0= RULE_IDENT
                    {
                    this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleelement_name1196); 

                    		current.merge(this_IDENT_0);
                        
                     
                        newLeafNode(this_IDENT_0, grammarAccess.getElement_nameAccess().getIDENTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:587:2: kw= '*'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleelement_name1220); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getElement_nameAccess().getAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleelement_name"


    // $ANTLR start "entryRulesub_selector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:600:1: entryRulesub_selector returns [EObject current=null] : iv_rulesub_selector= rulesub_selector EOF ;
    public final EObject entryRulesub_selector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesub_selector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:601:2: (iv_rulesub_selector= rulesub_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:602:2: iv_rulesub_selector= rulesub_selector EOF
            {
             newCompositeNode(grammarAccess.getSub_selectorRule()); 
            pushFollow(FOLLOW_rulesub_selector_in_entryRulesub_selector1260);
            iv_rulesub_selector=rulesub_selector();

            state._fsp--;

             current =iv_rulesub_selector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesub_selector1270); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesub_selector"


    // $ANTLR start "rulesub_selector"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:609:1: rulesub_selector returns [EObject current=null] : ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) ) ;
    public final EObject rulesub_selector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_class_1_0 = null;

        AntlrDatatypeRuleToken lv_attrib_2_0 = null;

        AntlrDatatypeRuleToken lv_pseudoclass_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:612:28: ( ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:613:1: ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:613:1: ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt14=1;
                }
                break;
            case 18:
                {
                alt14=2;
                }
                break;
            case 20:
                {
                alt14=3;
                }
                break;
            case 23:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:613:2: ( (lv_id_0_0= rulecss_id ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:613:2: ( (lv_id_0_0= rulecss_id ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:614:1: (lv_id_0_0= rulecss_id )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:614:1: (lv_id_0_0= rulecss_id )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:615:3: lv_id_0_0= rulecss_id
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getIdCss_idParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_id_in_rulesub_selector1316);
                    lv_id_0_0=rulecss_id();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSub_selectorRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"css_id");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:632:6: ( (lv_class_1_0= rulecss_class ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:632:6: ( (lv_class_1_0= rulecss_class ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:633:1: (lv_class_1_0= rulecss_class )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:633:1: (lv_class_1_0= rulecss_class )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:634:3: lv_class_1_0= rulecss_class
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getClassCss_classParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_class_in_rulesub_selector1343);
                    lv_class_1_0=rulecss_class();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSub_selectorRule());
                    	        }
                           		set(
                           			current, 
                           			"class",
                            		lv_class_1_0, 
                            		"css_class");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:651:6: ( (lv_attrib_2_0= rulecss_attrib ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:651:6: ( (lv_attrib_2_0= rulecss_attrib ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:652:1: (lv_attrib_2_0= rulecss_attrib )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:652:1: (lv_attrib_2_0= rulecss_attrib )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:653:3: lv_attrib_2_0= rulecss_attrib
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getAttribCss_attribParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_attrib_in_rulesub_selector1370);
                    lv_attrib_2_0=rulecss_attrib();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSub_selectorRule());
                    	        }
                           		set(
                           			current, 
                           			"attrib",
                            		lv_attrib_2_0, 
                            		"css_attrib");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:670:6: ( (lv_pseudoclass_3_0= rulecss_pseudo ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:670:6: ( (lv_pseudoclass_3_0= rulecss_pseudo ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:671:1: (lv_pseudoclass_3_0= rulecss_pseudo )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:671:1: (lv_pseudoclass_3_0= rulecss_pseudo )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:672:3: lv_pseudoclass_3_0= rulecss_pseudo
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getPseudoclassCss_pseudoParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_pseudo_in_rulesub_selector1397);
                    lv_pseudoclass_3_0=rulecss_pseudo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSub_selectorRule());
                    	        }
                           		set(
                           			current, 
                           			"pseudoclass",
                            		lv_pseudoclass_3_0, 
                            		"css_pseudo");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesub_selector"


    // $ANTLR start "entryRulecss_class"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:696:1: entryRulecss_class returns [String current=null] : iv_rulecss_class= rulecss_class EOF ;
    public final String entryRulecss_class() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_class = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:697:2: (iv_rulecss_class= rulecss_class EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:698:2: iv_rulecss_class= rulecss_class EOF
            {
             newCompositeNode(grammarAccess.getCss_classRule()); 
            pushFollow(FOLLOW_rulecss_class_in_entryRulecss_class1434);
            iv_rulecss_class=rulecss_class();

            state._fsp--;

             current =iv_rulecss_class.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_class1445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_class"


    // $ANTLR start "rulecss_class"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:705:1: rulecss_class returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_IDENT_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken rulecss_class() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:708:28: ( (kw= '.' this_IDENT_1= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:709:1: (kw= '.' this_IDENT_1= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:709:1: (kw= '.' this_IDENT_1= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:710:2: kw= '.' this_IDENT_1= RULE_IDENT
            {
            kw=(Token)match(input,18,FOLLOW_18_in_rulecss_class1483); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_classAccess().getFullStopKeyword_0()); 
                
            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_class1498); 

            		current.merge(this_IDENT_1);
                
             
                newLeafNode(this_IDENT_1, grammarAccess.getCss_classAccess().getIDENTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_class"


    // $ANTLR start "entryRulecss_id"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:730:1: entryRulecss_id returns [String current=null] : iv_rulecss_id= rulecss_id EOF ;
    public final String entryRulecss_id() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_id = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:731:2: (iv_rulecss_id= rulecss_id EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:732:2: iv_rulecss_id= rulecss_id EOF
            {
             newCompositeNode(grammarAccess.getCss_idRule()); 
            pushFollow(FOLLOW_rulecss_id_in_entryRulecss_id1544);
            iv_rulecss_id=rulecss_id();

            state._fsp--;

             current =iv_rulecss_id.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_id1555); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_id"


    // $ANTLR start "rulecss_id"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:739:1: rulecss_id returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#' this_IDENT_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken rulecss_id() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:742:28: ( (kw= '#' this_IDENT_1= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:743:1: (kw= '#' this_IDENT_1= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:743:1: (kw= '#' this_IDENT_1= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:744:2: kw= '#' this_IDENT_1= RULE_IDENT
            {
            kw=(Token)match(input,19,FOLLOW_19_in_rulecss_id1593); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_idAccess().getNumberSignKeyword_0()); 
                
            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_id1608); 

            		current.merge(this_IDENT_1);
                
             
                newLeafNode(this_IDENT_1, grammarAccess.getCss_idAccess().getIDENTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_id"


    // $ANTLR start "entryRulecss_attrib"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:764:1: entryRulecss_attrib returns [String current=null] : iv_rulecss_attrib= rulecss_attrib EOF ;
    public final String entryRulecss_attrib() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_attrib = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:765:2: (iv_rulecss_attrib= rulecss_attrib EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:766:2: iv_rulecss_attrib= rulecss_attrib EOF
            {
             newCompositeNode(grammarAccess.getCss_attribRule()); 
            pushFollow(FOLLOW_rulecss_attrib_in_entryRulecss_attrib1654);
            iv_rulecss_attrib=rulecss_attrib();

            state._fsp--;

             current =iv_rulecss_attrib.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_attrib1665); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_attrib"


    // $ANTLR start "rulecss_attrib"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:773:1: rulecss_attrib returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_IDENT_1= RULE_IDENT ( (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING ) )? kw= ']' ) ;
    public final AntlrDatatypeRuleToken rulecss_attrib() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;
        Token this_INCLUDES_3=null;
        Token this_DASHMATCH_4=null;
        Token this_IDENT_5=null;
        Token this_STRING_6=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:776:28: ( (kw= '[' this_IDENT_1= RULE_IDENT ( (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING ) )? kw= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:777:1: (kw= '[' this_IDENT_1= RULE_IDENT ( (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING ) )? kw= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:777:1: (kw= '[' this_IDENT_1= RULE_IDENT ( (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING ) )? kw= ']' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:778:2: kw= '[' this_IDENT_1= RULE_IDENT ( (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING ) )? kw= ']'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_rulecss_attrib1703); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getLeftSquareBracketKeyword_0()); 
                
            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_attrib1718); 

            		current.merge(this_IDENT_1);
                
             
                newLeafNode(this_IDENT_1, grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_1()); 
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:790:1: ( (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_INCLUDES && LA17_0<=RULE_DASHMATCH)||LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:790:2: (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:790:2: (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH )
                    int alt15=3;
                    switch ( input.LA(1) ) {
                    case 21:
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:791:2: kw= '='
                            {
                            kw=(Token)match(input,21,FOLLOW_21_in_rulecss_attrib1738); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getEqualsSignKeyword_2_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:797:10: this_INCLUDES_3= RULE_INCLUDES
                            {
                            this_INCLUDES_3=(Token)match(input,RULE_INCLUDES,FOLLOW_RULE_INCLUDES_in_rulecss_attrib1759); 

                            		current.merge(this_INCLUDES_3);
                                
                             
                                newLeafNode(this_INCLUDES_3, grammarAccess.getCss_attribAccess().getINCLUDESTerminalRuleCall_2_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:805:10: this_DASHMATCH_4= RULE_DASHMATCH
                            {
                            this_DASHMATCH_4=(Token)match(input,RULE_DASHMATCH,FOLLOW_RULE_DASHMATCH_in_rulecss_attrib1785); 

                            		current.merge(this_DASHMATCH_4);
                                
                             
                                newLeafNode(this_DASHMATCH_4, grammarAccess.getCss_attribAccess().getDASHMATCHTerminalRuleCall_2_0_2()); 
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:812:2: (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_IDENT) ) {
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
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:812:7: this_IDENT_5= RULE_IDENT
                            {
                            this_IDENT_5=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_attrib1807); 

                            		current.merge(this_IDENT_5);
                                
                             
                                newLeafNode(this_IDENT_5, grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_2_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:820:10: this_STRING_6= RULE_STRING
                            {
                            this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulecss_attrib1833); 

                            		current.merge(this_STRING_6);
                                
                             
                                newLeafNode(this_STRING_6, grammarAccess.getCss_attribAccess().getSTRINGTerminalRuleCall_2_1_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,22,FOLLOW_22_in_rulecss_attrib1854); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getRightSquareBracketKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_attrib"


    // $ANTLR start "entryRulecss_declaration"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:841:1: entryRulecss_declaration returns [EObject current=null] : iv_rulecss_declaration= rulecss_declaration EOF ;
    public final EObject entryRulecss_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_declaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:842:2: (iv_rulecss_declaration= rulecss_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:843:2: iv_rulecss_declaration= rulecss_declaration EOF
            {
             newCompositeNode(grammarAccess.getCss_declarationRule()); 
            pushFollow(FOLLOW_rulecss_declaration_in_entryRulecss_declaration1894);
            iv_rulecss_declaration=rulecss_declaration();

            state._fsp--;

             current =iv_rulecss_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_declaration1904); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_declaration"


    // $ANTLR start "rulecss_declaration"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:850:1: rulecss_declaration returns [EObject current=null] : this_css_generic_declaration_0= rulecss_generic_declaration ;
    public final EObject rulecss_declaration() throws RecognitionException {
        EObject current = null;

        EObject this_css_generic_declaration_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:853:28: (this_css_generic_declaration_0= rulecss_generic_declaration )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:855:5: this_css_generic_declaration_0= rulecss_generic_declaration
            {
             
                    newCompositeNode(grammarAccess.getCss_declarationAccess().getCss_generic_declarationParserRuleCall()); 
                
            pushFollow(FOLLOW_rulecss_generic_declaration_in_rulecss_declaration1950);
            this_css_generic_declaration_0=rulecss_generic_declaration();

            state._fsp--;

             
                    current = this_css_generic_declaration_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_declaration"


    // $ANTLR start "entryRulecss_generic_declaration"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:871:1: entryRulecss_generic_declaration returns [EObject current=null] : iv_rulecss_generic_declaration= rulecss_generic_declaration EOF ;
    public final EObject entryRulecss_generic_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_generic_declaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:872:2: (iv_rulecss_generic_declaration= rulecss_generic_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:873:2: iv_rulecss_generic_declaration= rulecss_generic_declaration EOF
            {
             newCompositeNode(grammarAccess.getCss_generic_declarationRule()); 
            pushFollow(FOLLOW_rulecss_generic_declaration_in_entryRulecss_generic_declaration1984);
            iv_rulecss_generic_declaration=rulecss_generic_declaration();

            state._fsp--;

             current =iv_rulecss_generic_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_generic_declaration1994); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_generic_declaration"


    // $ANTLR start "rulecss_generic_declaration"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:880:1: rulecss_generic_declaration returns [EObject current=null] : ( ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) ) ) ;
    public final EObject rulecss_generic_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_property_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:883:28: ( ( ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:884:1: ( ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:884:1: ( ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:884:2: ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:884:2: ( (lv_property_0_0= rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:885:1: (lv_property_0_0= rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:885:1: (lv_property_0_0= rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:886:3: lv_property_0_0= rulecss_property
            {
             
            	        newCompositeNode(grammarAccess.getCss_generic_declarationAccess().getPropertyCss_propertyParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecss_property_in_rulecss_generic_declaration2040);
            lv_property_0_0=rulecss_property();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCss_generic_declarationRule());
            	        }
                   		set(
                   			current, 
                   			"property",
                    		lv_property_0_0, 
                    		"css_property");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_rulecss_generic_declaration2052); 

                	newLeafNode(otherlv_1, grammarAccess.getCss_generic_declarationAccess().getColonKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:906:1: ( (lv_expression_2_0= ruleexpr ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:907:1: (lv_expression_2_0= ruleexpr )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:907:1: (lv_expression_2_0= ruleexpr )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:908:3: lv_expression_2_0= ruleexpr
            {
             
            	        newCompositeNode(grammarAccess.getCss_generic_declarationAccess().getExpressionExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleexpr_in_rulecss_generic_declaration2073);
            lv_expression_2_0=ruleexpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCss_generic_declarationRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_generic_declaration"


    // $ANTLR start "entryRulecss_property"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:932:1: entryRulecss_property returns [String current=null] : iv_rulecss_property= rulecss_property EOF ;
    public final String entryRulecss_property() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_property = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:933:2: (iv_rulecss_property= rulecss_property EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:934:2: iv_rulecss_property= rulecss_property EOF
            {
             newCompositeNode(grammarAccess.getCss_propertyRule()); 
            pushFollow(FOLLOW_rulecss_property_in_entryRulecss_property2110);
            iv_rulecss_property=rulecss_property();

            state._fsp--;

             current =iv_rulecss_property.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_property2121); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_property"


    // $ANTLR start "rulecss_property"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:941:1: rulecss_property returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_IDENT_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken rulecss_property() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:944:28: ( ( (kw= '-' )? this_IDENT_1= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:945:1: ( (kw= '-' )? this_IDENT_1= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:945:1: ( (kw= '-' )? this_IDENT_1= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:945:2: (kw= '-' )? this_IDENT_1= RULE_IDENT
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:945:2: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:946:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_rulecss_property2160); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCss_propertyAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_property2177); 

            		current.merge(this_IDENT_1);
                
             
                newLeafNode(this_IDENT_1, grammarAccess.getCss_propertyAccess().getIDENTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_property"


    // $ANTLR start "entryRulecss_pseudo"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:966:1: entryRulecss_pseudo returns [String current=null] : iv_rulecss_pseudo= rulecss_pseudo EOF ;
    public final String entryRulecss_pseudo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_pseudo = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:967:2: (iv_rulecss_pseudo= rulecss_pseudo EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:968:2: iv_rulecss_pseudo= rulecss_pseudo EOF
            {
             newCompositeNode(grammarAccess.getCss_pseudoRule()); 
            pushFollow(FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo2223);
            iv_rulecss_pseudo=rulecss_pseudo();

            state._fsp--;

             current =iv_rulecss_pseudo.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_pseudo2234); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_pseudo"


    // $ANTLR start "rulecss_pseudo"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:975:1: rulecss_pseudo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_IDENT_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken rulecss_pseudo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:978:28: ( (kw= ':' this_IDENT_1= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:979:1: (kw= ':' this_IDENT_1= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:979:1: (kw= ':' this_IDENT_1= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:980:2: kw= ':' this_IDENT_1= RULE_IDENT
            {
            kw=(Token)match(input,23,FOLLOW_23_in_rulecss_pseudo2272); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_pseudoAccess().getColonKeyword_0()); 
                
            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_pseudo2287); 

            		current.merge(this_IDENT_1);
                
             
                newLeafNode(this_IDENT_1, grammarAccess.getCss_pseudoAccess().getIDENTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecss_pseudo"


    // $ANTLR start "entryRulecombinator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1000:1: entryRulecombinator returns [String current=null] : iv_rulecombinator= rulecombinator EOF ;
    public final String entryRulecombinator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecombinator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1001:2: (iv_rulecombinator= rulecombinator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1002:2: iv_rulecombinator= rulecombinator EOF
            {
             newCompositeNode(grammarAccess.getCombinatorRule()); 
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator2333);
            iv_rulecombinator=rulecombinator();

            state._fsp--;

             current =iv_rulecombinator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator2344); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecombinator"


    // $ANTLR start "rulecombinator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1009:1: rulecombinator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )* ) ;
    public final AntlrDatatypeRuleToken rulecombinator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_WS_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1012:28: ( ( (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1013:1: ( (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1013:1: ( (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1013:2: (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1013:2: (kw= '+' | kw= '>' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            else if ( (LA19_0==26) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1014:2: kw= '+'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_rulecombinator2383); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1021:2: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_rulecombinator2402); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1026:2: (this_WS_2= RULE_WS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1026:7: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecombinator2419); 

            	    		current.merge(this_WS_2);
            	        
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecombinator"


    // $ANTLR start "entryRuleoperator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1041:1: entryRuleoperator returns [String current=null] : iv_ruleoperator= ruleoperator EOF ;
    public final String entryRuleoperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoperator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1042:2: (iv_ruleoperator= ruleoperator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1043:2: iv_ruleoperator= ruleoperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleoperator_in_entryRuleoperator2467);
            iv_ruleoperator=ruleoperator();

            state._fsp--;

             current =iv_ruleoperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoperator2478); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoperator"


    // $ANTLR start "ruleoperator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1050:1: ruleoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' | this_COMMA_1= RULE_COMMA ) ;
    public final AntlrDatatypeRuleToken ruleoperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_COMMA_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1053:28: ( (kw= '/' | this_COMMA_1= RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1054:1: (kw= '/' | this_COMMA_1= RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1054:1: (kw= '/' | this_COMMA_1= RULE_COMMA )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_COMMA) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1055:2: kw= '/'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleoperator2516); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1061:10: this_COMMA_1= RULE_COMMA
                    {
                    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleoperator2537); 

                    		current.merge(this_COMMA_1);
                        
                     
                        newLeafNode(this_COMMA_1, grammarAccess.getOperatorAccess().getCOMMATerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoperator"


    // $ANTLR start "entryRuleunary_operator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1076:1: entryRuleunary_operator returns [String current=null] : iv_ruleunary_operator= ruleunary_operator EOF ;
    public final String entryRuleunary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_operator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1077:2: (iv_ruleunary_operator= ruleunary_operator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1078:2: iv_ruleunary_operator= ruleunary_operator EOF
            {
             newCompositeNode(grammarAccess.getUnary_operatorRule()); 
            pushFollow(FOLLOW_ruleunary_operator_in_entryRuleunary_operator2583);
            iv_ruleunary_operator=ruleunary_operator();

            state._fsp--;

             current =iv_ruleunary_operator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_operator2594); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunary_operator"


    // $ANTLR start "ruleunary_operator"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1085:1: ruleunary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleunary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1088:28: ( (kw= '-' | kw= '+' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1089:1: (kw= '-' | kw= '+' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1089:1: (kw= '-' | kw= '+' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            else if ( (LA22_0==25) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1090:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleunary_operator2632); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1097:2: kw= '+'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleunary_operator2651); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunary_operator"


    // $ANTLR start "entryRuleexpr"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1110:1: entryRuleexpr returns [EObject current=null] : iv_ruleexpr= ruleexpr EOF ;
    public final EObject entryRuleexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1114:2: (iv_ruleexpr= ruleexpr EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1115:2: iv_ruleexpr= ruleexpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr2697);
            iv_ruleexpr=ruleexpr();

            state._fsp--;

             current =iv_ruleexpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr2707); 

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
    // $ANTLR end "entryRuleexpr"


    // $ANTLR start "ruleexpr"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1125:1: ruleexpr returns [EObject current=null] : ( ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )* ) ;
    public final EObject ruleexpr() throws RecognitionException {
        EObject current = null;

        EObject lv_termGroups_0_0 = null;

        EObject lv_termGroups_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1129:28: ( ( ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1130:1: ( ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1130:1: ( ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1130:2: ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1130:2: ( (lv_termGroups_0_0= ruletermGroup ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1131:1: (lv_termGroups_0_0= ruletermGroup )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1131:1: (lv_termGroups_0_0= ruletermGroup )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1132:3: lv_termGroups_0_0= ruletermGroup
            {
             
            	        newCompositeNode(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruletermGroup_in_ruleexpr2757);
            lv_termGroups_0_0=ruletermGroup();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprRule());
            	        }
                   		add(
                   			current, 
                   			"termGroups",
                    		lv_termGroups_0_0, 
                    		"termGroup");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1148:2: ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_COMMA||LA23_0==27) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1149:5: ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getExprAccess().getOperatorParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleoperator_in_ruleexpr2774);
            	    ruleoperator();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1156:1: ( (lv_termGroups_2_0= ruletermGroup ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1157:1: (lv_termGroups_2_0= ruletermGroup )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1157:1: (lv_termGroups_2_0= ruletermGroup )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1158:3: lv_termGroups_2_0= ruletermGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletermGroup_in_ruleexpr2794);
            	    lv_termGroups_2_0=ruletermGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"termGroups",
            	            		lv_termGroups_2_0, 
            	            		"termGroup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
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
    // $ANTLR end "ruleexpr"


    // $ANTLR start "entryRuletermGroup"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1185:1: entryRuletermGroup returns [EObject current=null] : iv_ruletermGroup= ruletermGroup EOF ;
    public final EObject entryRuletermGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermGroup = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1186:2: (iv_ruletermGroup= ruletermGroup EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1187:2: iv_ruletermGroup= ruletermGroup EOF
            {
             newCompositeNode(grammarAccess.getTermGroupRule()); 
            pushFollow(FOLLOW_ruletermGroup_in_entryRuletermGroup2836);
            iv_ruletermGroup=ruletermGroup();

            state._fsp--;

             current =iv_ruletermGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletermGroup2846); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletermGroup"


    // $ANTLR start "ruletermGroup"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1194:1: ruletermGroup returns [EObject current=null] : ( (lv_terms_0_0= ruleterm ) )+ ;
    public final EObject ruletermGroup() throws RecognitionException {
        EObject current = null;

        EObject lv_terms_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1197:28: ( ( (lv_terms_0_0= ruleterm ) )+ )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1198:1: ( (lv_terms_0_0= ruleterm ) )+
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1198:1: ( (lv_terms_0_0= ruleterm ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_IDENT||(LA24_0>=RULE_STRING && LA24_0<=RULE_REAL)||LA24_0==19||(LA24_0>=24 && LA24_0<=25)||LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1199:1: (lv_terms_0_0= ruleterm )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1199:1: (lv_terms_0_0= ruleterm )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1200:3: lv_terms_0_0= ruleterm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermGroupAccess().getTermsTermParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleterm_in_ruletermGroup2891);
            	    lv_terms_0_0=ruleterm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTermGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"terms",
            	            		lv_terms_0_0, 
            	            		"term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletermGroup"


    // $ANTLR start "entryRuleterm"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1224:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1225:2: (iv_ruleterm= ruleterm EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1226:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm2927);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm2937); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1233:1: ruleterm returns [EObject current=null] : ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= rulecss_property ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_1_0=null;
        AntlrDatatypeRuleToken lv_number_0_0 = null;

        AntlrDatatypeRuleToken lv_identifier_2_0 = null;

        EObject lv_url_3_0 = null;

        EObject lv_function_4_0 = null;

        AntlrDatatypeRuleToken lv_hexColor_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1236:28: ( ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= rulecss_property ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1237:1: ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= rulecss_property ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1237:1: ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= rulecss_property ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA25_1 = input.LA(2);

                if ( ((LA25_1>=RULE_INTEGER && LA25_1<=RULE_REAL)) ) {
                    alt25=1;
                }
                else if ( (LA25_1==RULE_IDENT) ) {
                    int LA25_4 = input.LA(3);

                    if ( (LA25_4==28) ) {
                        alt25=5;
                    }
                    else if ( (LA25_4==EOF||(LA25_4>=RULE_COMMA && LA25_4<=RULE_WS)||(LA25_4>=RULE_STRING && LA25_4<=RULE_REAL)||LA25_4==16||LA25_4==19||(LA25_4>=24 && LA25_4<=25)||LA25_4==27||(LA25_4>=29 && LA25_4<=30)) ) {
                        alt25=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
            case RULE_REAL:
            case 25:
                {
                alt25=1;
                }
                break;
            case RULE_STRING:
                {
                alt25=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA25_4 = input.LA(2);

                if ( (LA25_4==28) ) {
                    alt25=5;
                }
                else if ( (LA25_4==EOF||(LA25_4>=RULE_COMMA && LA25_4<=RULE_WS)||(LA25_4>=RULE_STRING && LA25_4<=RULE_REAL)||LA25_4==16||LA25_4==19||(LA25_4>=24 && LA25_4<=25)||LA25_4==27||(LA25_4>=29 && LA25_4<=30)) ) {
                    alt25=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 4, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                alt25=4;
                }
                break;
            case 19:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1237:2: ( (lv_number_0_0= rulenumberTerm ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1237:2: ( (lv_number_0_0= rulenumberTerm ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1238:1: (lv_number_0_0= rulenumberTerm )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1238:1: (lv_number_0_0= rulenumberTerm )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1239:3: lv_number_0_0= rulenumberTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getNumberNumberTermParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulenumberTerm_in_ruleterm2983);
                    lv_number_0_0=rulenumberTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_0_0, 
                            		"numberTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1256:6: ( (lv_stringValue_1_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1256:6: ( (lv_stringValue_1_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1257:1: (lv_stringValue_1_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1257:1: (lv_stringValue_1_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1258:3: lv_stringValue_1_0= RULE_STRING
                    {
                    lv_stringValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleterm3006); 

                    			newLeafNode(lv_stringValue_1_0, grammarAccess.getTermAccess().getStringValueSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"stringValue",
                            		lv_stringValue_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1275:6: ( (lv_identifier_2_0= rulecss_property ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1275:6: ( (lv_identifier_2_0= rulecss_property ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1276:1: (lv_identifier_2_0= rulecss_property )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1276:1: (lv_identifier_2_0= rulecss_property )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1277:3: lv_identifier_2_0= rulecss_property
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getIdentifierCss_propertyParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_property_in_ruleterm3038);
                    lv_identifier_2_0=rulecss_property();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"identifier",
                            		lv_identifier_2_0, 
                            		"css_property");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1294:6: ( (lv_url_3_0= ruleURLType ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1294:6: ( (lv_url_3_0= ruleURLType ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1295:1: (lv_url_3_0= ruleURLType )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1295:1: (lv_url_3_0= ruleURLType )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1296:3: lv_url_3_0= ruleURLType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getUrlURLTypeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleURLType_in_ruleterm3065);
                    lv_url_3_0=ruleURLType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"url",
                            		lv_url_3_0, 
                            		"URLType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1313:6: ( (lv_function_4_0= rulefunction ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1313:6: ( (lv_function_4_0= rulefunction ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1314:1: (lv_function_4_0= rulefunction )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1314:1: (lv_function_4_0= rulefunction )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1315:3: lv_function_4_0= rulefunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getFunctionFunctionParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_in_ruleterm3092);
                    lv_function_4_0=rulefunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"function",
                            		lv_function_4_0, 
                            		"function");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1332:6: ( (lv_hexColor_5_0= ruleHexColor ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1332:6: ( (lv_hexColor_5_0= ruleHexColor ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1333:1: (lv_hexColor_5_0= ruleHexColor )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1333:1: (lv_hexColor_5_0= ruleHexColor )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1334:3: lv_hexColor_5_0= ruleHexColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getHexColorHexColorParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHexColor_in_ruleterm3119);
                    lv_hexColor_5_0=ruleHexColor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"hexColor",
                            		lv_hexColor_5_0, 
                            		"HexColor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulenumberTerm"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1358:1: entryRulenumberTerm returns [String current=null] : iv_rulenumberTerm= rulenumberTerm EOF ;
    public final String entryRulenumberTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumberTerm = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1362:2: (iv_rulenumberTerm= rulenumberTerm EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1363:2: iv_rulenumberTerm= rulenumberTerm EOF
            {
             newCompositeNode(grammarAccess.getNumberTermRule()); 
            pushFollow(FOLLOW_rulenumberTerm_in_entryRulenumberTerm3162);
            iv_rulenumberTerm=rulenumberTerm();

            state._fsp--;

             current =iv_rulenumberTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumberTerm3173); 

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
    // $ANTLR end "entryRulenumberTerm"


    // $ANTLR start "rulenumberTerm"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1373:1: rulenumberTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) ) ;
    public final AntlrDatatypeRuleToken rulenumberTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_unary_operator_0 = null;

        AntlrDatatypeRuleToken this_NUMBER_1 = null;

        AntlrDatatypeRuleToken this_PERCENTAGE_2 = null;

        AntlrDatatypeRuleToken this_LENGTH_3 = null;

        AntlrDatatypeRuleToken this_EMS_4 = null;

        AntlrDatatypeRuleToken this_EXS_5 = null;

        AntlrDatatypeRuleToken this_ANGLE_6 = null;

        AntlrDatatypeRuleToken this_TIME_7 = null;

        AntlrDatatypeRuleToken this_FREQ_8 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1377:28: ( ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1378:1: ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1378:1: ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1378:2: (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1378:2: (this_unary_operator_0= ruleunary_operator )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=24 && LA26_0<=25)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1379:5: this_unary_operator_0= ruleunary_operator
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getUnary_operatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleunary_operator_in_rulenumberTerm3225);
                    this_unary_operator_0=ruleunary_operator();

                    state._fsp--;


                    		current.merge(this_unary_operator_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1389:3: (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )
            int alt27=8;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1390:5: this_NUMBER_1= ruleNUMBER
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getNUMBERParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_in_rulenumberTerm3255);
                    this_NUMBER_1=ruleNUMBER();

                    state._fsp--;


                    		current.merge(this_NUMBER_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1402:5: this_PERCENTAGE_2= rulePERCENTAGE
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getPERCENTAGEParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulePERCENTAGE_in_rulenumberTerm3288);
                    this_PERCENTAGE_2=rulePERCENTAGE();

                    state._fsp--;


                    		current.merge(this_PERCENTAGE_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1414:5: this_LENGTH_3= ruleLENGTH
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getLENGTHParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleLENGTH_in_rulenumberTerm3321);
                    this_LENGTH_3=ruleLENGTH();

                    state._fsp--;


                    		current.merge(this_LENGTH_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1426:5: this_EMS_4= ruleEMS
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getEMSParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleEMS_in_rulenumberTerm3354);
                    this_EMS_4=ruleEMS();

                    state._fsp--;


                    		current.merge(this_EMS_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1438:5: this_EXS_5= ruleEXS
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getEXSParserRuleCall_1_4()); 
                        
                    pushFollow(FOLLOW_ruleEXS_in_rulenumberTerm3387);
                    this_EXS_5=ruleEXS();

                    state._fsp--;


                    		current.merge(this_EXS_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1450:5: this_ANGLE_6= ruleANGLE
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getANGLEParserRuleCall_1_5()); 
                        
                    pushFollow(FOLLOW_ruleANGLE_in_rulenumberTerm3420);
                    this_ANGLE_6=ruleANGLE();

                    state._fsp--;


                    		current.merge(this_ANGLE_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1462:5: this_TIME_7= ruleTIME
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getTIMEParserRuleCall_1_6()); 
                        
                    pushFollow(FOLLOW_ruleTIME_in_rulenumberTerm3453);
                    this_TIME_7=ruleTIME();

                    state._fsp--;


                    		current.merge(this_TIME_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1474:5: this_FREQ_8= ruleFREQ
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getFREQParserRuleCall_1_7()); 
                        
                    pushFollow(FOLLOW_ruleFREQ_in_rulenumberTerm3486);
                    this_FREQ_8=ruleFREQ();

                    state._fsp--;


                    		current.merge(this_FREQ_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // $ANTLR end "rulenumberTerm"


    // $ANTLR start "entryRulenum"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1495:1: entryRulenum returns [String current=null] : iv_rulenum= rulenum EOF ;
    public final String entryRulenum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenum = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1496:2: (iv_rulenum= rulenum EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1497:2: iv_rulenum= rulenum EOF
            {
             newCompositeNode(grammarAccess.getNumRule()); 
            pushFollow(FOLLOW_rulenum_in_entryRulenum3537);
            iv_rulenum=rulenum();

            state._fsp--;

             current =iv_rulenum.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenum3548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenum"


    // $ANTLR start "rulenum"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1504:1: rulenum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_integer_0= RULE_INTEGER | this_real_1= RULE_REAL ) ;
    public final AntlrDatatypeRuleToken rulenum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_integer_0=null;
        Token this_real_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1507:28: ( (this_integer_0= RULE_INTEGER | this_real_1= RULE_REAL ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1508:1: (this_integer_0= RULE_INTEGER | this_real_1= RULE_REAL )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1508:1: (this_integer_0= RULE_INTEGER | this_real_1= RULE_REAL )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INTEGER) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_REAL) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1508:6: this_integer_0= RULE_INTEGER
                    {
                    this_integer_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rulenum3588); 

                    		current.merge(this_integer_0);
                        
                     
                        newLeafNode(this_integer_0, grammarAccess.getNumAccess().getIntegerTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1516:10: this_real_1= RULE_REAL
                    {
                    this_real_1=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rulenum3614); 

                    		current.merge(this_real_1);
                        
                     
                        newLeafNode(this_real_1, grammarAccess.getNumAccess().getRealTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenum"


    // $ANTLR start "entryRulefunction"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1531:1: entryRulefunction returns [EObject current=null] : iv_rulefunction= rulefunction EOF ;
    public final EObject entryRulefunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1535:2: (iv_rulefunction= rulefunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1536:2: iv_rulefunction= rulefunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction3665);
            iv_rulefunction=rulefunction();

            state._fsp--;

             current =iv_rulefunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction3675); 

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
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1546:1: rulefunction returns [EObject current=null] : ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')' ) ;
    public final EObject rulefunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_WS_3=null;
        Token this_WS_5=null;
        Token otherlv_6=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1550:28: ( ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1551:1: ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1551:1: ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1551:2: (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1551:2: (otherlv_0= '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1551:4: otherlv_0= '-'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulefunction3717); 

                        	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1555:3: ( (lv_name_1_0= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1556:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1556:1: (lv_name_1_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1557:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulefunction3736); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDENTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"IDENT");
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulefunction3753); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1577:1: (this_WS_3= RULE_WS )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_WS) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1577:2: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulefunction3765); 
            	     
            	        newLeafNode(this_WS_3, grammarAccess.getFunctionAccess().getWSTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1581:3: ( (lv_expression_4_0= ruleexpr ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1582:1: (lv_expression_4_0= ruleexpr )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1582:1: (lv_expression_4_0= ruleexpr )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1583:3: lv_expression_4_0= ruleexpr
            {
             
            	        newCompositeNode(grammarAccess.getFunctionAccess().getExpressionExprParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleexpr_in_rulefunction3787);
            lv_expression_4_0=ruleexpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1599:2: (this_WS_5= RULE_WS )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_WS) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1599:3: this_WS_5= RULE_WS
            	    {
            	    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulefunction3799); 
            	     
            	        newLeafNode(this_WS_5, grammarAccess.getFunctionAccess().getWSTerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_rulefunction3812); 

                	newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRuleHexColor"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1618:1: entryRuleHexColor returns [String current=null] : iv_ruleHexColor= ruleHexColor EOF ;
    public final String entryRuleHexColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexColor = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1622:2: (iv_ruleHexColor= ruleHexColor EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1623:2: iv_ruleHexColor= ruleHexColor EOF
            {
             newCompositeNode(grammarAccess.getHexColorRule()); 
            pushFollow(FOLLOW_ruleHexColor_in_entryRuleHexColor3859);
            iv_ruleHexColor=ruleHexColor();

            state._fsp--;

             current =iv_ruleHexColor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexColor3870); 

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
    // $ANTLR end "entryRuleHexColor"


    // $ANTLR start "ruleHexColor"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1633:1: ruleHexColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#' (this_integer_1= RULE_INTEGER )? this_IDENT_2= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken ruleHexColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_integer_1=null;
        Token this_IDENT_2=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1637:28: ( (kw= '#' (this_integer_1= RULE_INTEGER )? this_IDENT_2= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1638:1: (kw= '#' (this_integer_1= RULE_INTEGER )? this_IDENT_2= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1638:1: (kw= '#' (this_integer_1= RULE_INTEGER )? this_IDENT_2= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1639:2: kw= '#' (this_integer_1= RULE_INTEGER )? this_IDENT_2= RULE_IDENT
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleHexColor3912); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHexColorAccess().getNumberSignKeyword_0()); 
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1644:1: (this_integer_1= RULE_INTEGER )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INTEGER) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1644:6: this_integer_1= RULE_INTEGER
                    {
                    this_integer_1=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleHexColor3928); 

                    		current.merge(this_integer_1);
                        
                     
                        newLeafNode(this_integer_1, grammarAccess.getHexColorAccess().getIntegerTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleHexColor3950); 

            		current.merge(this_IDENT_2);
                
             
                newLeafNode(this_IDENT_2, grammarAccess.getHexColorAccess().getIDENTTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
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
    // $ANTLR end "ruleHexColor"


    // $ANTLR start "entryRuleURLType"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1669:1: entryRuleURLType returns [EObject current=null] : iv_ruleURLType= ruleURLType EOF ;
    public final EObject entryRuleURLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1673:2: (iv_ruleURLType= ruleURLType EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1674:2: iv_ruleURLType= ruleURLType EOF
            {
             newCompositeNode(grammarAccess.getURLTypeRule()); 
            pushFollow(FOLLOW_ruleURLType_in_entryRuleURLType4005);
            iv_ruleURLType=ruleURLType();

            state._fsp--;

             current =iv_ruleURLType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLType4015); 

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
    // $ANTLR end "entryRuleURLType"


    // $ANTLR start "ruleURLType"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1684:1: ruleURLType returns [EObject current=null] : (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleURLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1688:28: ( (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1689:1: (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1689:1: (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1689:3: otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleURLType4056); 

                	newLeafNode(otherlv_0, grammarAccess.getURLTypeAccess().getUrlKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleURLType4068); 

                	newLeafNode(otherlv_1, grammarAccess.getURLTypeAccess().getLeftParenthesisKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1697:1: ( (lv_url_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1698:1: (lv_url_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1698:1: (lv_url_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1699:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleURLType4085); 

            			newLeafNode(lv_url_2_0, grammarAccess.getURLTypeAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getURLTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"url",
                    		lv_url_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleURLType4102); 

                	newLeafNode(otherlv_3, grammarAccess.getURLTypeAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // $ANTLR end "ruleURLType"


    // $ANTLR start "entryRuleNUMBER"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1730:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1731:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1732:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER4143);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER4154); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1739:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_num_0= rulenum ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1742:28: (this_num_0= rulenum )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1744:5: this_num_0= rulenum
            {
             
                    newCompositeNode(grammarAccess.getNUMBERAccess().getNumParserRuleCall()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleNUMBER4200);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRulePERCENTAGE"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1762:1: entryRulePERCENTAGE returns [String current=null] : iv_rulePERCENTAGE= rulePERCENTAGE EOF ;
    public final String entryRulePERCENTAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePERCENTAGE = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1763:2: (iv_rulePERCENTAGE= rulePERCENTAGE EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1764:2: iv_rulePERCENTAGE= rulePERCENTAGE EOF
            {
             newCompositeNode(grammarAccess.getPERCENTAGERule()); 
            pushFollow(FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE4245);
            iv_rulePERCENTAGE=rulePERCENTAGE();

            state._fsp--;

             current =iv_rulePERCENTAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePERCENTAGE4256); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePERCENTAGE"


    // $ANTLR start "rulePERCENTAGE"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1771:1: rulePERCENTAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= '%' ) ;
    public final AntlrDatatypeRuleToken rulePERCENTAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1774:28: ( (this_num_0= rulenum kw= '%' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1775:1: (this_num_0= rulenum kw= '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1775:1: (this_num_0= rulenum kw= '%' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1776:5: this_num_0= rulenum kw= '%'
            {
             
                    newCompositeNode(grammarAccess.getPERCENTAGEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_rulePERCENTAGE4303);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,31,FOLLOW_31_in_rulePERCENTAGE4321); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPERCENTAGEAccess().getPercentSignKeyword_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePERCENTAGE"


    // $ANTLR start "entryRuleEMS"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1800:1: entryRuleEMS returns [String current=null] : iv_ruleEMS= ruleEMS EOF ;
    public final String entryRuleEMS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMS = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1801:2: (iv_ruleEMS= ruleEMS EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1802:2: iv_ruleEMS= ruleEMS EOF
            {
             newCompositeNode(grammarAccess.getEMSRule()); 
            pushFollow(FOLLOW_ruleEMS_in_entryRuleEMS4362);
            iv_ruleEMS=ruleEMS();

            state._fsp--;

             current =iv_ruleEMS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMS4373); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMS"


    // $ANTLR start "ruleEMS"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1809:1: ruleEMS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= 'em' ) ;
    public final AntlrDatatypeRuleToken ruleEMS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1812:28: ( (this_num_0= rulenum kw= 'em' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1813:1: (this_num_0= rulenum kw= 'em' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1813:1: (this_num_0= rulenum kw= 'em' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1814:5: this_num_0= rulenum kw= 'em'
            {
             
                    newCompositeNode(grammarAccess.getEMSAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleEMS4420);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,32,FOLLOW_32_in_ruleEMS4438); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEMSAccess().getEmKeyword_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMS"


    // $ANTLR start "entryRuleEXS"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1838:1: entryRuleEXS returns [String current=null] : iv_ruleEXS= ruleEXS EOF ;
    public final String entryRuleEXS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXS = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1839:2: (iv_ruleEXS= ruleEXS EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1840:2: iv_ruleEXS= ruleEXS EOF
            {
             newCompositeNode(grammarAccess.getEXSRule()); 
            pushFollow(FOLLOW_ruleEXS_in_entryRuleEXS4479);
            iv_ruleEXS=ruleEXS();

            state._fsp--;

             current =iv_ruleEXS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXS4490); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXS"


    // $ANTLR start "ruleEXS"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1847:1: ruleEXS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= 'ex' ) ;
    public final AntlrDatatypeRuleToken ruleEXS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1850:28: ( (this_num_0= rulenum kw= 'ex' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1851:1: (this_num_0= rulenum kw= 'ex' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1851:1: (this_num_0= rulenum kw= 'ex' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1852:5: this_num_0= rulenum kw= 'ex'
            {
             
                    newCompositeNode(grammarAccess.getEXSAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleEXS4537);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,33,FOLLOW_33_in_ruleEXS4555); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEXSAccess().getExKeyword_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXS"


    // $ANTLR start "entryRuleLENGTH"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1876:1: entryRuleLENGTH returns [String current=null] : iv_ruleLENGTH= ruleLENGTH EOF ;
    public final String entryRuleLENGTH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLENGTH = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1880:2: (iv_ruleLENGTH= ruleLENGTH EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1881:2: iv_ruleLENGTH= ruleLENGTH EOF
            {
             newCompositeNode(grammarAccess.getLENGTHRule()); 
            pushFollow(FOLLOW_ruleLENGTH_in_entryRuleLENGTH4602);
            iv_ruleLENGTH=ruleLENGTH();

            state._fsp--;

             current =iv_ruleLENGTH.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLENGTH4613); 

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
    // $ANTLR end "entryRuleLENGTH"


    // $ANTLR start "ruleLENGTH"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1891:1: ruleLENGTH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) ) ;
    public final AntlrDatatypeRuleToken ruleLENGTH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1895:28: ( (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1896:1: (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1896:1: (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1897:5: this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' )
            {
             
                    newCompositeNode(grammarAccess.getLENGTHAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleLENGTH4664);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1907:1: (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt33=1;
                }
                break;
            case 35:
                {
                alt33=2;
                }
                break;
            case 36:
                {
                alt33=3;
                }
                break;
            case 37:
                {
                alt33=4;
                }
                break;
            case 38:
                {
                alt33=5;
                }
                break;
            case 39:
                {
                alt33=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1908:2: kw= 'px'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleLENGTH4683); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1915:2: kw= 'cm'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleLENGTH4702); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1922:2: kw= 'mm'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleLENGTH4721); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1929:2: kw= 'in'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleLENGTH4740); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1936:2: kw= 'pt'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleLENGTH4759); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1943:2: kw= 'pc'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleLENGTH4778); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPcKeyword_1_5()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // $ANTLR end "ruleLENGTH"


    // $ANTLR start "entryRuleANGLE"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1959:1: entryRuleANGLE returns [String current=null] : iv_ruleANGLE= ruleANGLE EOF ;
    public final String entryRuleANGLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANGLE = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1960:2: (iv_ruleANGLE= ruleANGLE EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1961:2: iv_ruleANGLE= ruleANGLE EOF
            {
             newCompositeNode(grammarAccess.getANGLERule()); 
            pushFollow(FOLLOW_ruleANGLE_in_entryRuleANGLE4824);
            iv_ruleANGLE=ruleANGLE();

            state._fsp--;

             current =iv_ruleANGLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANGLE4835); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleANGLE"


    // $ANTLR start "ruleANGLE"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1968:1: ruleANGLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) ) ;
    public final AntlrDatatypeRuleToken ruleANGLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1971:28: ( (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1972:1: (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1972:1: (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1973:5: this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' )
            {
             
                    newCompositeNode(grammarAccess.getANGLEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleANGLE4882);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1983:1: (kw= 'deg' | kw= 'rad' | kw= 'grad' )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt34=1;
                }
                break;
            case 41:
                {
                alt34=2;
                }
                break;
            case 42:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1984:2: kw= 'deg'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleANGLE4901); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1991:2: kw= 'rad'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleANGLE4920); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1998:2: kw= 'grad'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleANGLE4939); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getGradKeyword_1_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleANGLE"


    // $ANTLR start "entryRuleTIME"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2011:1: entryRuleTIME returns [String current=null] : iv_ruleTIME= ruleTIME EOF ;
    public final String entryRuleTIME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTIME = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2012:2: (iv_ruleTIME= ruleTIME EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2013:2: iv_ruleTIME= ruleTIME EOF
            {
             newCompositeNode(grammarAccess.getTIMERule()); 
            pushFollow(FOLLOW_ruleTIME_in_entryRuleTIME4981);
            iv_ruleTIME=ruleTIME();

            state._fsp--;

             current =iv_ruleTIME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTIME4992); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTIME"


    // $ANTLR start "ruleTIME"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2020:1: ruleTIME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'ms' | kw= 's' ) ) ;
    public final AntlrDatatypeRuleToken ruleTIME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2023:28: ( (this_num_0= rulenum (kw= 'ms' | kw= 's' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2024:1: (this_num_0= rulenum (kw= 'ms' | kw= 's' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2024:1: (this_num_0= rulenum (kw= 'ms' | kw= 's' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2025:5: this_num_0= rulenum (kw= 'ms' | kw= 's' )
            {
             
                    newCompositeNode(grammarAccess.getTIMEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleTIME5039);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2035:1: (kw= 'ms' | kw= 's' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            else if ( (LA35_0==44) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2036:2: kw= 'ms'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleTIME5058); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2043:2: kw= 's'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleTIME5077); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTIMEAccess().getSKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTIME"


    // $ANTLR start "entryRuleFREQ"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2056:1: entryRuleFREQ returns [String current=null] : iv_ruleFREQ= ruleFREQ EOF ;
    public final String entryRuleFREQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFREQ = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2057:2: (iv_ruleFREQ= ruleFREQ EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2058:2: iv_ruleFREQ= ruleFREQ EOF
            {
             newCompositeNode(grammarAccess.getFREQRule()); 
            pushFollow(FOLLOW_ruleFREQ_in_entryRuleFREQ5119);
            iv_ruleFREQ=ruleFREQ();

            state._fsp--;

             current =iv_ruleFREQ.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFREQ5130); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFREQ"


    // $ANTLR start "ruleFREQ"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2065:1: ruleFREQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) ) ;
    public final AntlrDatatypeRuleToken ruleFREQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2068:28: ( (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2069:1: (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2069:1: (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2070:5: this_num_0= rulenum (kw= 'hz' | kw= 'khz' )
            {
             
                    newCompositeNode(grammarAccess.getFREQAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleFREQ5177);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2080:1: (kw= 'hz' | kw= 'khz' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==45) ) {
                alt36=1;
            }
            else if ( (LA36_0==46) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2081:2: kw= 'hz'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleFREQ5196); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFREQAccess().getHzKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2088:2: kw= 'khz'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleFREQ5215); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFREQAccess().getKhzKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFREQ"

    // Delegated rules


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\13\uffff";
    static final String DFA27_eofS =
        "\1\uffff\2\3\10\uffff";
    static final String DFA27_minS =
        "\1\12\2\4\10\uffff";
    static final String DFA27_maxS =
        "\1\13\2\56\10\uffff";
    static final String DFA27_acceptS =
        "\3\uffff\1\1\1\7\1\10\1\4\1\6\1\3\1\5\1\2";
    static final String DFA27_specialS =
        "\13\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\1\2",
            "\3\3\2\uffff\3\3\4\uffff\1\3\2\uffff\1\3\4\uffff\2\3\1\uffff"+
            "\1\3\1\uffff\2\3\1\12\1\6\1\11\6\10\3\7\2\4\2\5",
            "\3\3\2\uffff\3\3\4\uffff\1\3\2\uffff\1\3\4\uffff\2\3\1\uffff"+
            "\1\3\1\uffff\2\3\1\12\1\6\1\11\6\10\3\7\2\4\2\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1389:3: (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )";
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_rulestylesheet131 = new BitSet(new long[]{0x00000000009E2022L});
    public static final BitSet FOLLOW_rulemedia_in_rulestylesheet158 = new BitSet(new long[]{0x00000000009E2022L});
    public static final BitSet FOLLOW_rulemedia_in_entryRulemedia195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulemedia242 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulemedia_list_in_rulemedia263 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulemedia275 = new BitSet(new long[]{0x00000000009E8020L});
    public static final BitSet FOLLOW_ruleruleset_in_rulemedia296 = new BitSet(new long[]{0x00000000009E8020L});
    public static final BitSet FOLLOW_15_in_rulemedia309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_entryRulemedia_list346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia_list357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rulemedia_list404 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulemedia_list425 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulemedium_in_rulemedia_list452 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulemedium_in_entryRulemedium500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedium511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulemedium550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_entryRuleruleset594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleset604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset650 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleruleset662 = new BitSet(new long[]{0x00000000009E0020L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset682 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleruleset696 = new BitSet(new long[]{0x0000000001008020L});
    public static final BitSet FOLLOW_rulecss_declaration_in_ruleruleset718 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleset730 = new BitSet(new long[]{0x0000000001008020L});
    public static final BitSet FOLLOW_15_in_ruleruleset744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_ruleselector846 = new BitSet(new long[]{0x0000000006000042L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector869 = new BitSet(new long[]{0x00000000009E0020L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector910 = new BitSet(new long[]{0x00000000069E0062L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector933 = new BitSet(new long[]{0x00000000009E0020L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector1000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_rulesimple_selector1057 = new BitSet(new long[]{0x00000000009E0022L});
    public static final BitSet FOLLOW_rulesub_selector_in_rulesimple_selector1078 = new BitSet(new long[]{0x00000000009E0022L});
    public static final BitSet FOLLOW_rulesub_selector_in_rulesimple_selector1107 = new BitSet(new long[]{0x00000000009E0022L});
    public static final BitSet FOLLOW_ruleelement_name_in_entryRuleelement_name1145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement_name1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleelement_name1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleelement_name1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_entryRulesub_selector1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesub_selector1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_rulesub_selector1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_rulesub_selector1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_rulesub_selector1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_rulesub_selector1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_entryRulecss_class1434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_class1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulecss_class1483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_class1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_entryRulecss_id1544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_id1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulecss_id1593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_id1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_entryRulecss_attrib1654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_attrib1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulecss_attrib1703 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_attrib1718 = new BitSet(new long[]{0x0000000000600180L});
    public static final BitSet FOLLOW_21_in_rulecss_attrib1738 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_RULE_INCLUDES_in_rulecss_attrib1759 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_RULE_DASHMATCH_in_rulecss_attrib1785 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_attrib1807 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulecss_attrib1833 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulecss_attrib1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_entryRulecss_declaration1894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_declaration1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_rulecss_declaration1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_entryRulecss_generic_declaration1984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_generic_declaration1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_rulecss_generic_declaration2040 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulecss_generic_declaration2052 = new BitSet(new long[]{0x0000000043080E20L});
    public static final BitSet FOLLOW_ruleexpr_in_rulecss_generic_declaration2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_entryRulecss_property2110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_property2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulecss_property2160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_property2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo2223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_pseudo2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulecss_pseudo2272 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_pseudo2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator2333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulecombinator2383 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_26_in_rulecombinator2402 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecombinator2419 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleoperator_in_entryRuleoperator2467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoperator2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleoperator2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleoperator2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator2583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleunary_operator2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleunary_operator2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr2697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_ruleexpr2757 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_ruleoperator_in_ruleexpr2774 = new BitSet(new long[]{0x0000000043080E20L});
    public static final BitSet FOLLOW_ruletermGroup_in_ruleexpr2794 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_ruletermGroup_in_entryRuletermGroup2836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermGroup2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_ruletermGroup2891 = new BitSet(new long[]{0x0000000043080E22L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm2927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_ruleterm2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleterm3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_ruleterm3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleterm3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_ruleterm3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_ruleterm3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_entryRulenumberTerm3162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumberTerm3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_rulenumberTerm3225 = new BitSet(new long[]{0x0000000003000C00L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rulenumberTerm3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_rulenumberTerm3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_rulenumberTerm3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_rulenumberTerm3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_rulenumberTerm3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_rulenumberTerm3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_rulenumberTerm3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_rulenumberTerm3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_entryRulenum3537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenum3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rulenum3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rulenum3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction3665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulefunction3717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulefunction3736 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulefunction3753 = new BitSet(new long[]{0x0000000043080E60L});
    public static final BitSet FOLLOW_RULE_WS_in_rulefunction3765 = new BitSet(new long[]{0x0000000043080E60L});
    public static final BitSet FOLLOW_ruleexpr_in_rulefunction3787 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_RULE_WS_in_rulefunction3799 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_rulefunction3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_entryRuleHexColor3859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexColor3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleHexColor3912 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleHexColor3928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleHexColor3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_entryRuleURLType4005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLType4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleURLType4056 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleURLType4068 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleURLType4085 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleURLType4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER4143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleNUMBER4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE4245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePERCENTAGE4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rulePERCENTAGE4303 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePERCENTAGE4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_entryRuleEMS4362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMS4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleEMS4420 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEMS4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_entryRuleEXS4479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXS4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleEXS4537 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEXS4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_entryRuleLENGTH4602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLENGTH4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleLENGTH4664 = new BitSet(new long[]{0x000000FC00000000L});
    public static final BitSet FOLLOW_34_in_ruleLENGTH4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLENGTH4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleLENGTH4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleLENGTH4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLENGTH4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleLENGTH4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_entryRuleANGLE4824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANGLE4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleANGLE4882 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_40_in_ruleANGLE4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleANGLE4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleANGLE4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_entryRuleTIME4981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTIME4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleTIME5039 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_ruleTIME5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTIME5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_entryRuleFREQ5119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFREQ5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleFREQ5177 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_ruleFREQ5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleFREQ5215 = new BitSet(new long[]{0x0000000000000002L});

}