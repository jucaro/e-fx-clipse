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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMA", "RULE_IDENT", "RULE_WS", "RULE_HEXDIGITS", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_STRING", "RULE_INTEGER", "RULE_REAL", "RULE_ML_COMMENT", "'media'", "'{'", "'}'", "';'", "'*'", "'.'", "'#'", "'['", "'='", "']'", "':'", "'-'", "'+'", "'>'", "'/'", "'('", "')'", "'url'", "'%'", "'em'", "'ex'", "'px'", "'cm'", "'mm'", "'in'", "'pt'", "'pc'", "'deg'", "'rad'", "'grad'", "'ms'", "'s'", "'hz'", "'khz'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_INCLUDES=8;
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
    public static final int RULE_REAL=12;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_COMMA=4;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_DASHMATCH=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=10;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_IDENT=5;
    public static final int T__39=39;
    public static final int RULE_HEXDIGITS=7;
    public static final int RULE_WS=6;
    public static final int RULE_INTEGER=11;

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

                if ( (LA1_0==RULE_IDENT||LA1_0==RULE_HEXDIGITS||(LA1_0>=18 && LA1_0<=21)||LA1_0==24) ) {
                    alt1=1;
                }
                else if ( (LA1_0==14) ) {
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
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulemedia242); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulemedia275); 

                	newLeafNode(otherlv_2, grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:164:1: ( (lv_rulesets_3_0= ruleruleset ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_IDENT||LA2_0==RULE_HEXDIGITS||(LA2_0>=18 && LA2_0<=21)||LA2_0==24) ) {
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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulemedia309); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleruleset696); 

                	newLeafNode(otherlv_3, grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:329:1: ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_IDENT||LA5_0==25) ) {
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

            	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleruleset730); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRulesetAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleruleset744); 

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

            if ( ((LA9_0>=26 && LA9_0<=27)) ) {
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

                    if ( (LA8_0==RULE_IDENT||LA8_0==RULE_HEXDIGITS||(LA8_0>=18 && LA8_0<=21)||LA8_0==24||(LA8_0>=26 && LA8_0<=27)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:442:4: ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:442:4: ( (lv_combinator_4_0= rulecombinator ) )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( ((LA7_0>=26 && LA7_0<=27)) ) {
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

            if ( (LA12_0==RULE_IDENT||LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_HEXDIGITS||(LA12_0>=19 && LA12_0<=21)||LA12_0==24) ) {
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

                        if ( (LA10_0==RULE_HEXDIGITS||(LA10_0>=19 && LA10_0<=21)||LA10_0==24) ) {
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

                        if ( (LA11_0==RULE_HEXDIGITS||(LA11_0>=19 && LA11_0<=21)||LA11_0==24) ) {
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
            else if ( (LA13_0==18) ) {
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
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleelement_name1220); 

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
            case RULE_HEXDIGITS:
            case 20:
                {
                alt14=1;
                }
                break;
            case 19:
                {
                alt14=2;
                }
                break;
            case 21:
                {
                alt14=3;
                }
                break;
            case 24:
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
            kw=(Token)match(input,19,FOLLOW_19_in_rulecss_class1483); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:739:1: rulecss_id returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '#' this_IDENT_1= RULE_IDENT ) | this_hexdigits_2= RULE_HEXDIGITS ) ;
    public final AntlrDatatypeRuleToken rulecss_id() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;
        Token this_hexdigits_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:742:28: ( ( (kw= '#' this_IDENT_1= RULE_IDENT ) | this_hexdigits_2= RULE_HEXDIGITS ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:743:1: ( (kw= '#' this_IDENT_1= RULE_IDENT ) | this_hexdigits_2= RULE_HEXDIGITS )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:743:1: ( (kw= '#' this_IDENT_1= RULE_IDENT ) | this_hexdigits_2= RULE_HEXDIGITS )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_HEXDIGITS) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:743:2: (kw= '#' this_IDENT_1= RULE_IDENT )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:743:2: (kw= '#' this_IDENT_1= RULE_IDENT )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:744:2: kw= '#' this_IDENT_1= RULE_IDENT
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_rulecss_id1594); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCss_idAccess().getNumberSignKeyword_0_0()); 
                        
                    this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_id1609); 

                    		current.merge(this_IDENT_1);
                        
                     
                        newLeafNode(this_IDENT_1, grammarAccess.getCss_idAccess().getIDENTTerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:757:10: this_hexdigits_2= RULE_HEXDIGITS
                    {
                    this_hexdigits_2=(Token)match(input,RULE_HEXDIGITS,FOLLOW_RULE_HEXDIGITS_in_rulecss_id1636); 

                    		current.merge(this_hexdigits_2);
                        
                     
                        newLeafNode(this_hexdigits_2, grammarAccess.getCss_idAccess().getHexdigitsTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "rulecss_id"


    // $ANTLR start "entryRulecss_attrib"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:772:1: entryRulecss_attrib returns [String current=null] : iv_rulecss_attrib= rulecss_attrib EOF ;
    public final String entryRulecss_attrib() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_attrib = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:773:2: (iv_rulecss_attrib= rulecss_attrib EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:774:2: iv_rulecss_attrib= rulecss_attrib EOF
            {
             newCompositeNode(grammarAccess.getCss_attribRule()); 
            pushFollow(FOLLOW_rulecss_attrib_in_entryRulecss_attrib1682);
            iv_rulecss_attrib=rulecss_attrib();

            state._fsp--;

             current =iv_rulecss_attrib.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_attrib1693); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:781:1: rulecss_attrib returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_IDENT_1= RULE_IDENT ( (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING ) )? kw= ']' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:784:28: ( (kw= '[' this_IDENT_1= RULE_IDENT ( (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING ) )? kw= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:785:1: (kw= '[' this_IDENT_1= RULE_IDENT ( (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING ) )? kw= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:785:1: (kw= '[' this_IDENT_1= RULE_IDENT ( (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING ) )? kw= ']' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:786:2: kw= '[' this_IDENT_1= RULE_IDENT ( (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING ) )? kw= ']'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_rulecss_attrib1731); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getLeftSquareBracketKeyword_0()); 
                
            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_attrib1746); 

            		current.merge(this_IDENT_1);
                
             
                newLeafNode(this_IDENT_1, grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_1()); 
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:798:1: ( (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_INCLUDES && LA18_0<=RULE_DASHMATCH)||LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:798:2: (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH ) (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:798:2: (kw= '=' | this_INCLUDES_3= RULE_INCLUDES | this_DASHMATCH_4= RULE_DASHMATCH )
                    int alt16=3;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt16=1;
                        }
                        break;
                    case RULE_INCLUDES:
                        {
                        alt16=2;
                        }
                        break;
                    case RULE_DASHMATCH:
                        {
                        alt16=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:799:2: kw= '='
                            {
                            kw=(Token)match(input,22,FOLLOW_22_in_rulecss_attrib1766); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getEqualsSignKeyword_2_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:805:10: this_INCLUDES_3= RULE_INCLUDES
                            {
                            this_INCLUDES_3=(Token)match(input,RULE_INCLUDES,FOLLOW_RULE_INCLUDES_in_rulecss_attrib1787); 

                            		current.merge(this_INCLUDES_3);
                                
                             
                                newLeafNode(this_INCLUDES_3, grammarAccess.getCss_attribAccess().getINCLUDESTerminalRuleCall_2_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:813:10: this_DASHMATCH_4= RULE_DASHMATCH
                            {
                            this_DASHMATCH_4=(Token)match(input,RULE_DASHMATCH,FOLLOW_RULE_DASHMATCH_in_rulecss_attrib1813); 

                            		current.merge(this_DASHMATCH_4);
                                
                             
                                newLeafNode(this_DASHMATCH_4, grammarAccess.getCss_attribAccess().getDASHMATCHTerminalRuleCall_2_0_2()); 
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:820:2: (this_IDENT_5= RULE_IDENT | this_STRING_6= RULE_STRING )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_IDENT) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==RULE_STRING) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:820:7: this_IDENT_5= RULE_IDENT
                            {
                            this_IDENT_5=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_attrib1835); 

                            		current.merge(this_IDENT_5);
                                
                             
                                newLeafNode(this_IDENT_5, grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_2_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:828:10: this_STRING_6= RULE_STRING
                            {
                            this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulecss_attrib1861); 

                            		current.merge(this_STRING_6);
                                
                             
                                newLeafNode(this_STRING_6, grammarAccess.getCss_attribAccess().getSTRINGTerminalRuleCall_2_1_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,23,FOLLOW_23_in_rulecss_attrib1882); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:849:1: entryRulecss_declaration returns [EObject current=null] : iv_rulecss_declaration= rulecss_declaration EOF ;
    public final EObject entryRulecss_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_declaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:850:2: (iv_rulecss_declaration= rulecss_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:851:2: iv_rulecss_declaration= rulecss_declaration EOF
            {
             newCompositeNode(grammarAccess.getCss_declarationRule()); 
            pushFollow(FOLLOW_rulecss_declaration_in_entryRulecss_declaration1922);
            iv_rulecss_declaration=rulecss_declaration();

            state._fsp--;

             current =iv_rulecss_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_declaration1932); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:858:1: rulecss_declaration returns [EObject current=null] : this_css_generic_declaration_0= rulecss_generic_declaration ;
    public final EObject rulecss_declaration() throws RecognitionException {
        EObject current = null;

        EObject this_css_generic_declaration_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:861:28: (this_css_generic_declaration_0= rulecss_generic_declaration )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:863:5: this_css_generic_declaration_0= rulecss_generic_declaration
            {
             
                    newCompositeNode(grammarAccess.getCss_declarationAccess().getCss_generic_declarationParserRuleCall()); 
                
            pushFollow(FOLLOW_rulecss_generic_declaration_in_rulecss_declaration1978);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:879:1: entryRulecss_generic_declaration returns [EObject current=null] : iv_rulecss_generic_declaration= rulecss_generic_declaration EOF ;
    public final EObject entryRulecss_generic_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_generic_declaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:880:2: (iv_rulecss_generic_declaration= rulecss_generic_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:881:2: iv_rulecss_generic_declaration= rulecss_generic_declaration EOF
            {
             newCompositeNode(grammarAccess.getCss_generic_declarationRule()); 
            pushFollow(FOLLOW_rulecss_generic_declaration_in_entryRulecss_generic_declaration2012);
            iv_rulecss_generic_declaration=rulecss_generic_declaration();

            state._fsp--;

             current =iv_rulecss_generic_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_generic_declaration2022); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:888:1: rulecss_generic_declaration returns [EObject current=null] : ( ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) ) ) ;
    public final EObject rulecss_generic_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_property_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:891:28: ( ( ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:892:1: ( ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:892:1: ( ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:892:2: ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:892:2: ( (lv_property_0_0= rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:893:1: (lv_property_0_0= rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:893:1: (lv_property_0_0= rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:894:3: lv_property_0_0= rulecss_property
            {
             
            	        newCompositeNode(grammarAccess.getCss_generic_declarationAccess().getPropertyCss_propertyParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecss_property_in_rulecss_generic_declaration2068);
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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_rulecss_generic_declaration2080); 

                	newLeafNode(otherlv_1, grammarAccess.getCss_generic_declarationAccess().getColonKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:914:1: ( (lv_expression_2_0= ruleexpr ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:915:1: (lv_expression_2_0= ruleexpr )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:915:1: (lv_expression_2_0= ruleexpr )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:916:3: lv_expression_2_0= ruleexpr
            {
             
            	        newCompositeNode(grammarAccess.getCss_generic_declarationAccess().getExpressionExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleexpr_in_rulecss_generic_declaration2101);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:940:1: entryRulecss_property returns [String current=null] : iv_rulecss_property= rulecss_property EOF ;
    public final String entryRulecss_property() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_property = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:941:2: (iv_rulecss_property= rulecss_property EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:942:2: iv_rulecss_property= rulecss_property EOF
            {
             newCompositeNode(grammarAccess.getCss_propertyRule()); 
            pushFollow(FOLLOW_rulecss_property_in_entryRulecss_property2138);
            iv_rulecss_property=rulecss_property();

            state._fsp--;

             current =iv_rulecss_property.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_property2149); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:949:1: rulecss_property returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_IDENT_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken rulecss_property() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:952:28: ( ( (kw= '-' )? this_IDENT_1= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:953:1: ( (kw= '-' )? this_IDENT_1= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:953:1: ( (kw= '-' )? this_IDENT_1= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:953:2: (kw= '-' )? this_IDENT_1= RULE_IDENT
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:953:2: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:954:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_rulecss_property2188); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCss_propertyAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_property2205); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:974:1: entryRulecss_pseudo returns [String current=null] : iv_rulecss_pseudo= rulecss_pseudo EOF ;
    public final String entryRulecss_pseudo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_pseudo = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:975:2: (iv_rulecss_pseudo= rulecss_pseudo EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:976:2: iv_rulecss_pseudo= rulecss_pseudo EOF
            {
             newCompositeNode(grammarAccess.getCss_pseudoRule()); 
            pushFollow(FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo2251);
            iv_rulecss_pseudo=rulecss_pseudo();

            state._fsp--;

             current =iv_rulecss_pseudo.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_pseudo2262); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:983:1: rulecss_pseudo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_IDENT_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken rulecss_pseudo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:986:28: ( (kw= ':' this_IDENT_1= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:987:1: (kw= ':' this_IDENT_1= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:987:1: (kw= ':' this_IDENT_1= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:988:2: kw= ':' this_IDENT_1= RULE_IDENT
            {
            kw=(Token)match(input,24,FOLLOW_24_in_rulecss_pseudo2300); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_pseudoAccess().getColonKeyword_0()); 
                
            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_pseudo2315); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1008:1: entryRulecombinator returns [String current=null] : iv_rulecombinator= rulecombinator EOF ;
    public final String entryRulecombinator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecombinator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1009:2: (iv_rulecombinator= rulecombinator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1010:2: iv_rulecombinator= rulecombinator EOF
            {
             newCompositeNode(grammarAccess.getCombinatorRule()); 
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator2361);
            iv_rulecombinator=rulecombinator();

            state._fsp--;

             current =iv_rulecombinator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator2372); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1017:1: rulecombinator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )* ) ;
    public final AntlrDatatypeRuleToken rulecombinator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_WS_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1020:28: ( ( (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1021:1: ( (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1021:1: ( (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1021:2: (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1021:2: (kw= '+' | kw= '>' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            else if ( (LA20_0==27) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1022:2: kw= '+'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_rulecombinator2411); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1029:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_rulecombinator2430); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1034:2: (this_WS_2= RULE_WS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1034:7: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecombinator2447); 

            	    		current.merge(this_WS_2);
            	        
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1049:1: entryRuleoperator returns [String current=null] : iv_ruleoperator= ruleoperator EOF ;
    public final String entryRuleoperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoperator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1050:2: (iv_ruleoperator= ruleoperator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1051:2: iv_ruleoperator= ruleoperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleoperator_in_entryRuleoperator2495);
            iv_ruleoperator=ruleoperator();

            state._fsp--;

             current =iv_ruleoperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoperator2506); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1058:1: ruleoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' | this_COMMA_1= RULE_COMMA ) ;
    public final AntlrDatatypeRuleToken ruleoperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_COMMA_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1061:28: ( (kw= '/' | this_COMMA_1= RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1062:1: (kw= '/' | this_COMMA_1= RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1062:1: (kw= '/' | this_COMMA_1= RULE_COMMA )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_COMMA) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1063:2: kw= '/'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleoperator2544); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1069:10: this_COMMA_1= RULE_COMMA
                    {
                    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleoperator2565); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1084:1: entryRuleunary_operator returns [String current=null] : iv_ruleunary_operator= ruleunary_operator EOF ;
    public final String entryRuleunary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_operator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1085:2: (iv_ruleunary_operator= ruleunary_operator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1086:2: iv_ruleunary_operator= ruleunary_operator EOF
            {
             newCompositeNode(grammarAccess.getUnary_operatorRule()); 
            pushFollow(FOLLOW_ruleunary_operator_in_entryRuleunary_operator2611);
            iv_ruleunary_operator=ruleunary_operator();

            state._fsp--;

             current =iv_ruleunary_operator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_operator2622); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1093:1: ruleunary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleunary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1096:28: ( (kw= '-' | kw= '+' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1097:1: (kw= '-' | kw= '+' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1097:1: (kw= '-' | kw= '+' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            else if ( (LA23_0==26) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1098:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleunary_operator2660); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1105:2: kw= '+'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleunary_operator2679); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1118:1: entryRuleexpr returns [EObject current=null] : iv_ruleexpr= ruleexpr EOF ;
    public final EObject entryRuleexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1122:2: (iv_ruleexpr= ruleexpr EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1123:2: iv_ruleexpr= ruleexpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr2725);
            iv_ruleexpr=ruleexpr();

            state._fsp--;

             current =iv_ruleexpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr2735); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1133:1: ruleexpr returns [EObject current=null] : ( ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )* ) ;
    public final EObject ruleexpr() throws RecognitionException {
        EObject current = null;

        EObject lv_termGroups_0_0 = null;

        EObject lv_termGroups_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1137:28: ( ( ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1138:1: ( ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1138:1: ( ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1138:2: ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1138:2: ( (lv_termGroups_0_0= ruletermGroup ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1139:1: (lv_termGroups_0_0= ruletermGroup )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1139:1: (lv_termGroups_0_0= ruletermGroup )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1140:3: lv_termGroups_0_0= ruletermGroup
            {
             
            	        newCompositeNode(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruletermGroup_in_ruleexpr2785);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1156:2: ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_COMMA||LA24_0==28) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1157:5: ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getExprAccess().getOperatorParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleoperator_in_ruleexpr2802);
            	    ruleoperator();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1164:1: ( (lv_termGroups_2_0= ruletermGroup ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1165:1: (lv_termGroups_2_0= ruletermGroup )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1165:1: (lv_termGroups_2_0= ruletermGroup )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1166:3: lv_termGroups_2_0= ruletermGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletermGroup_in_ruleexpr2822);
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
            	    break loop24;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1193:1: entryRuletermGroup returns [EObject current=null] : iv_ruletermGroup= ruletermGroup EOF ;
    public final EObject entryRuletermGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermGroup = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1194:2: (iv_ruletermGroup= ruletermGroup EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1195:2: iv_ruletermGroup= ruletermGroup EOF
            {
             newCompositeNode(grammarAccess.getTermGroupRule()); 
            pushFollow(FOLLOW_ruletermGroup_in_entryRuletermGroup2864);
            iv_ruletermGroup=ruletermGroup();

            state._fsp--;

             current =iv_ruletermGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletermGroup2874); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1202:1: ruletermGroup returns [EObject current=null] : ( (lv_terms_0_0= ruleterm ) )+ ;
    public final EObject ruletermGroup() throws RecognitionException {
        EObject current = null;

        EObject lv_terms_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1205:28: ( ( (lv_terms_0_0= ruleterm ) )+ )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1206:1: ( (lv_terms_0_0= ruleterm ) )+
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1206:1: ( (lv_terms_0_0= ruleterm ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_IDENT||LA25_0==RULE_HEXDIGITS||(LA25_0>=RULE_STRING && LA25_0<=RULE_REAL)||(LA25_0>=25 && LA25_0<=26)||LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1207:1: (lv_terms_0_0= ruleterm )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1207:1: (lv_terms_0_0= ruleterm )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1208:3: lv_terms_0_0= ruleterm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermGroupAccess().getTermsTermParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleterm_in_ruletermGroup2919);
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1232:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1233:2: (iv_ruleterm= ruleterm EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1234:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm2955);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm2965); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1241:1: ruleterm returns [EObject current=null] : ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= rulecss_property ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1244:28: ( ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= rulecss_property ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1245:1: ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= rulecss_property ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1245:1: ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= rulecss_property ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                int LA26_1 = input.LA(2);

                if ( ((LA26_1>=RULE_INTEGER && LA26_1<=RULE_REAL)) ) {
                    alt26=1;
                }
                else if ( (LA26_1==RULE_IDENT) ) {
                    int LA26_4 = input.LA(3);

                    if ( (LA26_4==EOF||(LA26_4>=RULE_COMMA && LA26_4<=RULE_HEXDIGITS)||(LA26_4>=RULE_STRING && LA26_4<=RULE_REAL)||LA26_4==17||(LA26_4>=25 && LA26_4<=26)||LA26_4==28||(LA26_4>=30 && LA26_4<=31)) ) {
                        alt26=3;
                    }
                    else if ( (LA26_4==29) ) {
                        alt26=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
            case RULE_REAL:
            case 26:
                {
                alt26=1;
                }
                break;
            case RULE_STRING:
                {
                alt26=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA26_4 = input.LA(2);

                if ( (LA26_4==EOF||(LA26_4>=RULE_COMMA && LA26_4<=RULE_HEXDIGITS)||(LA26_4>=RULE_STRING && LA26_4<=RULE_REAL)||LA26_4==17||(LA26_4>=25 && LA26_4<=26)||LA26_4==28||(LA26_4>=30 && LA26_4<=31)) ) {
                    alt26=3;
                }
                else if ( (LA26_4==29) ) {
                    alt26=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 4, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                alt26=4;
                }
                break;
            case RULE_HEXDIGITS:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1245:2: ( (lv_number_0_0= rulenumberTerm ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1245:2: ( (lv_number_0_0= rulenumberTerm ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1246:1: (lv_number_0_0= rulenumberTerm )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1246:1: (lv_number_0_0= rulenumberTerm )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1247:3: lv_number_0_0= rulenumberTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getNumberNumberTermParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulenumberTerm_in_ruleterm3011);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1264:6: ( (lv_stringValue_1_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1264:6: ( (lv_stringValue_1_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1265:1: (lv_stringValue_1_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1265:1: (lv_stringValue_1_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1266:3: lv_stringValue_1_0= RULE_STRING
                    {
                    lv_stringValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleterm3034); 

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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1283:6: ( (lv_identifier_2_0= rulecss_property ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1283:6: ( (lv_identifier_2_0= rulecss_property ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1284:1: (lv_identifier_2_0= rulecss_property )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1284:1: (lv_identifier_2_0= rulecss_property )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1285:3: lv_identifier_2_0= rulecss_property
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getIdentifierCss_propertyParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_property_in_ruleterm3066);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1302:6: ( (lv_url_3_0= ruleURLType ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1302:6: ( (lv_url_3_0= ruleURLType ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1303:1: (lv_url_3_0= ruleURLType )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1303:1: (lv_url_3_0= ruleURLType )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1304:3: lv_url_3_0= ruleURLType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getUrlURLTypeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleURLType_in_ruleterm3093);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1321:6: ( (lv_function_4_0= rulefunction ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1321:6: ( (lv_function_4_0= rulefunction ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1322:1: (lv_function_4_0= rulefunction )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1322:1: (lv_function_4_0= rulefunction )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1323:3: lv_function_4_0= rulefunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getFunctionFunctionParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_in_ruleterm3120);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1340:6: ( (lv_hexColor_5_0= ruleHexColor ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1340:6: ( (lv_hexColor_5_0= ruleHexColor ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1341:1: (lv_hexColor_5_0= ruleHexColor )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1341:1: (lv_hexColor_5_0= ruleHexColor )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1342:3: lv_hexColor_5_0= ruleHexColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getHexColorHexColorParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHexColor_in_ruleterm3147);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1366:1: entryRulenumberTerm returns [String current=null] : iv_rulenumberTerm= rulenumberTerm EOF ;
    public final String entryRulenumberTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumberTerm = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1370:2: (iv_rulenumberTerm= rulenumberTerm EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1371:2: iv_rulenumberTerm= rulenumberTerm EOF
            {
             newCompositeNode(grammarAccess.getNumberTermRule()); 
            pushFollow(FOLLOW_rulenumberTerm_in_entryRulenumberTerm3190);
            iv_rulenumberTerm=rulenumberTerm();

            state._fsp--;

             current =iv_rulenumberTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumberTerm3201); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1381:1: rulenumberTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1385:28: ( ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1386:1: ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1386:1: ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1386:2: (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1386:2: (this_unary_operator_0= ruleunary_operator )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=25 && LA27_0<=26)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1387:5: this_unary_operator_0= ruleunary_operator
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getUnary_operatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleunary_operator_in_rulenumberTerm3253);
                    this_unary_operator_0=ruleunary_operator();

                    state._fsp--;


                    		current.merge(this_unary_operator_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1397:3: (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )
            int alt28=8;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1398:5: this_NUMBER_1= ruleNUMBER
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getNUMBERParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_in_rulenumberTerm3283);
                    this_NUMBER_1=ruleNUMBER();

                    state._fsp--;


                    		current.merge(this_NUMBER_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1410:5: this_PERCENTAGE_2= rulePERCENTAGE
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getPERCENTAGEParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulePERCENTAGE_in_rulenumberTerm3316);
                    this_PERCENTAGE_2=rulePERCENTAGE();

                    state._fsp--;


                    		current.merge(this_PERCENTAGE_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1422:5: this_LENGTH_3= ruleLENGTH
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getLENGTHParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleLENGTH_in_rulenumberTerm3349);
                    this_LENGTH_3=ruleLENGTH();

                    state._fsp--;


                    		current.merge(this_LENGTH_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1434:5: this_EMS_4= ruleEMS
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getEMSParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleEMS_in_rulenumberTerm3382);
                    this_EMS_4=ruleEMS();

                    state._fsp--;


                    		current.merge(this_EMS_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1446:5: this_EXS_5= ruleEXS
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getEXSParserRuleCall_1_4()); 
                        
                    pushFollow(FOLLOW_ruleEXS_in_rulenumberTerm3415);
                    this_EXS_5=ruleEXS();

                    state._fsp--;


                    		current.merge(this_EXS_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1458:5: this_ANGLE_6= ruleANGLE
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getANGLEParserRuleCall_1_5()); 
                        
                    pushFollow(FOLLOW_ruleANGLE_in_rulenumberTerm3448);
                    this_ANGLE_6=ruleANGLE();

                    state._fsp--;


                    		current.merge(this_ANGLE_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1470:5: this_TIME_7= ruleTIME
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getTIMEParserRuleCall_1_6()); 
                        
                    pushFollow(FOLLOW_ruleTIME_in_rulenumberTerm3481);
                    this_TIME_7=ruleTIME();

                    state._fsp--;


                    		current.merge(this_TIME_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1482:5: this_FREQ_8= ruleFREQ
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getFREQParserRuleCall_1_7()); 
                        
                    pushFollow(FOLLOW_ruleFREQ_in_rulenumberTerm3514);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1503:1: entryRulenum returns [String current=null] : iv_rulenum= rulenum EOF ;
    public final String entryRulenum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenum = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1504:2: (iv_rulenum= rulenum EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1505:2: iv_rulenum= rulenum EOF
            {
             newCompositeNode(grammarAccess.getNumRule()); 
            pushFollow(FOLLOW_rulenum_in_entryRulenum3565);
            iv_rulenum=rulenum();

            state._fsp--;

             current =iv_rulenum.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenum3576); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1512:1: rulenum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_integer_0= RULE_INTEGER | this_real_1= RULE_REAL ) ;
    public final AntlrDatatypeRuleToken rulenum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_integer_0=null;
        Token this_real_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1515:28: ( (this_integer_0= RULE_INTEGER | this_real_1= RULE_REAL ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1516:1: (this_integer_0= RULE_INTEGER | this_real_1= RULE_REAL )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1516:1: (this_integer_0= RULE_INTEGER | this_real_1= RULE_REAL )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INTEGER) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_REAL) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1516:6: this_integer_0= RULE_INTEGER
                    {
                    this_integer_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rulenum3616); 

                    		current.merge(this_integer_0);
                        
                     
                        newLeafNode(this_integer_0, grammarAccess.getNumAccess().getIntegerTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1524:10: this_real_1= RULE_REAL
                    {
                    this_real_1=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rulenum3642); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1539:1: entryRulefunction returns [EObject current=null] : iv_rulefunction= rulefunction EOF ;
    public final EObject entryRulefunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1543:2: (iv_rulefunction= rulefunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1544:2: iv_rulefunction= rulefunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction3693);
            iv_rulefunction=rulefunction();

            state._fsp--;

             current =iv_rulefunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction3703); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1554:1: rulefunction returns [EObject current=null] : ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1558:28: ( ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1559:1: ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1559:1: ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1559:2: (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1559:2: (otherlv_0= '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1559:4: otherlv_0= '-'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_25_in_rulefunction3745); 

                        	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1563:3: ( (lv_name_1_0= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1564:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1564:1: (lv_name_1_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1565:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulefunction3764); 

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

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_rulefunction3781); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1585:1: (this_WS_3= RULE_WS )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_WS) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1585:2: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulefunction3793); 
            	     
            	        newLeafNode(this_WS_3, grammarAccess.getFunctionAccess().getWSTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1589:3: ( (lv_expression_4_0= ruleexpr ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1590:1: (lv_expression_4_0= ruleexpr )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1590:1: (lv_expression_4_0= ruleexpr )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1591:3: lv_expression_4_0= ruleexpr
            {
             
            	        newCompositeNode(grammarAccess.getFunctionAccess().getExpressionExprParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleexpr_in_rulefunction3815);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1607:2: (this_WS_5= RULE_WS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1607:3: this_WS_5= RULE_WS
            	    {
            	    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulefunction3827); 
            	     
            	        newLeafNode(this_WS_5, grammarAccess.getFunctionAccess().getWSTerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_rulefunction3840); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1626:1: entryRuleHexColor returns [String current=null] : iv_ruleHexColor= ruleHexColor EOF ;
    public final String entryRuleHexColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexColor = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1627:2: (iv_ruleHexColor= ruleHexColor EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1628:2: iv_ruleHexColor= ruleHexColor EOF
            {
             newCompositeNode(grammarAccess.getHexColorRule()); 
            pushFollow(FOLLOW_ruleHexColor_in_entryRuleHexColor3881);
            iv_ruleHexColor=ruleHexColor();

            state._fsp--;

             current =iv_ruleHexColor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexColor3892); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHexColor"


    // $ANTLR start "ruleHexColor"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1635:1: ruleHexColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_hexdigits_0= RULE_HEXDIGITS ;
    public final AntlrDatatypeRuleToken ruleHexColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_hexdigits_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1638:28: (this_hexdigits_0= RULE_HEXDIGITS )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1639:5: this_hexdigits_0= RULE_HEXDIGITS
            {
            this_hexdigits_0=(Token)match(input,RULE_HEXDIGITS,FOLLOW_RULE_HEXDIGITS_in_ruleHexColor3931); 

            		current.merge(this_hexdigits_0);
                
             
                newLeafNode(this_hexdigits_0, grammarAccess.getHexColorAccess().getHexdigitsTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleHexColor"


    // $ANTLR start "entryRuleURLType"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1654:1: entryRuleURLType returns [EObject current=null] : iv_ruleURLType= ruleURLType EOF ;
    public final EObject entryRuleURLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1658:2: (iv_ruleURLType= ruleURLType EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1659:2: iv_ruleURLType= ruleURLType EOF
            {
             newCompositeNode(grammarAccess.getURLTypeRule()); 
            pushFollow(FOLLOW_ruleURLType_in_entryRuleURLType3981);
            iv_ruleURLType=ruleURLType();

            state._fsp--;

             current =iv_ruleURLType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLType3991); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1669:1: ruleURLType returns [EObject current=null] : (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleURLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1673:28: ( (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1674:1: (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1674:1: (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1674:3: otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleURLType4032); 

                	newLeafNode(otherlv_0, grammarAccess.getURLTypeAccess().getUrlKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleURLType4044); 

                	newLeafNode(otherlv_1, grammarAccess.getURLTypeAccess().getLeftParenthesisKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1682:1: ( (lv_url_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1683:1: (lv_url_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1683:1: (lv_url_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1684:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleURLType4061); 

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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleURLType4078); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1715:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1716:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1717:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER4119);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER4130); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1724:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_num_0= rulenum ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1727:28: (this_num_0= rulenum )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1729:5: this_num_0= rulenum
            {
             
                    newCompositeNode(grammarAccess.getNUMBERAccess().getNumParserRuleCall()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleNUMBER4176);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1747:1: entryRulePERCENTAGE returns [String current=null] : iv_rulePERCENTAGE= rulePERCENTAGE EOF ;
    public final String entryRulePERCENTAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePERCENTAGE = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1748:2: (iv_rulePERCENTAGE= rulePERCENTAGE EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1749:2: iv_rulePERCENTAGE= rulePERCENTAGE EOF
            {
             newCompositeNode(grammarAccess.getPERCENTAGERule()); 
            pushFollow(FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE4221);
            iv_rulePERCENTAGE=rulePERCENTAGE();

            state._fsp--;

             current =iv_rulePERCENTAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePERCENTAGE4232); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1756:1: rulePERCENTAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= '%' ) ;
    public final AntlrDatatypeRuleToken rulePERCENTAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1759:28: ( (this_num_0= rulenum kw= '%' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1760:1: (this_num_0= rulenum kw= '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1760:1: (this_num_0= rulenum kw= '%' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1761:5: this_num_0= rulenum kw= '%'
            {
             
                    newCompositeNode(grammarAccess.getPERCENTAGEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_rulePERCENTAGE4279);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,32,FOLLOW_32_in_rulePERCENTAGE4297); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1785:1: entryRuleEMS returns [String current=null] : iv_ruleEMS= ruleEMS EOF ;
    public final String entryRuleEMS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMS = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1786:2: (iv_ruleEMS= ruleEMS EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1787:2: iv_ruleEMS= ruleEMS EOF
            {
             newCompositeNode(grammarAccess.getEMSRule()); 
            pushFollow(FOLLOW_ruleEMS_in_entryRuleEMS4338);
            iv_ruleEMS=ruleEMS();

            state._fsp--;

             current =iv_ruleEMS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMS4349); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1794:1: ruleEMS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= 'em' ) ;
    public final AntlrDatatypeRuleToken ruleEMS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1797:28: ( (this_num_0= rulenum kw= 'em' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1798:1: (this_num_0= rulenum kw= 'em' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1798:1: (this_num_0= rulenum kw= 'em' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1799:5: this_num_0= rulenum kw= 'em'
            {
             
                    newCompositeNode(grammarAccess.getEMSAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleEMS4396);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,33,FOLLOW_33_in_ruleEMS4414); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1823:1: entryRuleEXS returns [String current=null] : iv_ruleEXS= ruleEXS EOF ;
    public final String entryRuleEXS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXS = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1824:2: (iv_ruleEXS= ruleEXS EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1825:2: iv_ruleEXS= ruleEXS EOF
            {
             newCompositeNode(grammarAccess.getEXSRule()); 
            pushFollow(FOLLOW_ruleEXS_in_entryRuleEXS4455);
            iv_ruleEXS=ruleEXS();

            state._fsp--;

             current =iv_ruleEXS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXS4466); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1832:1: ruleEXS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= 'ex' ) ;
    public final AntlrDatatypeRuleToken ruleEXS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1835:28: ( (this_num_0= rulenum kw= 'ex' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1836:1: (this_num_0= rulenum kw= 'ex' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1836:1: (this_num_0= rulenum kw= 'ex' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1837:5: this_num_0= rulenum kw= 'ex'
            {
             
                    newCompositeNode(grammarAccess.getEXSAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleEXS4513);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleEXS4531); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1861:1: entryRuleLENGTH returns [String current=null] : iv_ruleLENGTH= ruleLENGTH EOF ;
    public final String entryRuleLENGTH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLENGTH = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1865:2: (iv_ruleLENGTH= ruleLENGTH EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1866:2: iv_ruleLENGTH= ruleLENGTH EOF
            {
             newCompositeNode(grammarAccess.getLENGTHRule()); 
            pushFollow(FOLLOW_ruleLENGTH_in_entryRuleLENGTH4578);
            iv_ruleLENGTH=ruleLENGTH();

            state._fsp--;

             current =iv_ruleLENGTH.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLENGTH4589); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1876:1: ruleLENGTH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) ) ;
    public final AntlrDatatypeRuleToken ruleLENGTH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1880:28: ( (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1881:1: (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1881:1: (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1882:5: this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' )
            {
             
                    newCompositeNode(grammarAccess.getLENGTHAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleLENGTH4640);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1892:1: (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt33=1;
                }
                break;
            case 36:
                {
                alt33=2;
                }
                break;
            case 37:
                {
                alt33=3;
                }
                break;
            case 38:
                {
                alt33=4;
                }
                break;
            case 39:
                {
                alt33=5;
                }
                break;
            case 40:
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1893:2: kw= 'px'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleLENGTH4659); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1900:2: kw= 'cm'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleLENGTH4678); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1907:2: kw= 'mm'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleLENGTH4697); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1914:2: kw= 'in'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleLENGTH4716); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1921:2: kw= 'pt'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleLENGTH4735); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1928:2: kw= 'pc'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleLENGTH4754); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1944:1: entryRuleANGLE returns [String current=null] : iv_ruleANGLE= ruleANGLE EOF ;
    public final String entryRuleANGLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANGLE = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1945:2: (iv_ruleANGLE= ruleANGLE EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1946:2: iv_ruleANGLE= ruleANGLE EOF
            {
             newCompositeNode(grammarAccess.getANGLERule()); 
            pushFollow(FOLLOW_ruleANGLE_in_entryRuleANGLE4800);
            iv_ruleANGLE=ruleANGLE();

            state._fsp--;

             current =iv_ruleANGLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANGLE4811); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1953:1: ruleANGLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) ) ;
    public final AntlrDatatypeRuleToken ruleANGLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1956:28: ( (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1957:1: (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1957:1: (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1958:5: this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' )
            {
             
                    newCompositeNode(grammarAccess.getANGLEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleANGLE4858);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1968:1: (kw= 'deg' | kw= 'rad' | kw= 'grad' )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt34=1;
                }
                break;
            case 42:
                {
                alt34=2;
                }
                break;
            case 43:
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1969:2: kw= 'deg'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleANGLE4877); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1976:2: kw= 'rad'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleANGLE4896); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1983:2: kw= 'grad'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleANGLE4915); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1996:1: entryRuleTIME returns [String current=null] : iv_ruleTIME= ruleTIME EOF ;
    public final String entryRuleTIME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTIME = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1997:2: (iv_ruleTIME= ruleTIME EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1998:2: iv_ruleTIME= ruleTIME EOF
            {
             newCompositeNode(grammarAccess.getTIMERule()); 
            pushFollow(FOLLOW_ruleTIME_in_entryRuleTIME4957);
            iv_ruleTIME=ruleTIME();

            state._fsp--;

             current =iv_ruleTIME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTIME4968); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2005:1: ruleTIME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'ms' | kw= 's' ) ) ;
    public final AntlrDatatypeRuleToken ruleTIME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2008:28: ( (this_num_0= rulenum (kw= 'ms' | kw= 's' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2009:1: (this_num_0= rulenum (kw= 'ms' | kw= 's' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2009:1: (this_num_0= rulenum (kw= 'ms' | kw= 's' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2010:5: this_num_0= rulenum (kw= 'ms' | kw= 's' )
            {
             
                    newCompositeNode(grammarAccess.getTIMEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleTIME5015);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2020:1: (kw= 'ms' | kw= 's' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            else if ( (LA35_0==45) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2021:2: kw= 'ms'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleTIME5034); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2028:2: kw= 's'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleTIME5053); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2041:1: entryRuleFREQ returns [String current=null] : iv_ruleFREQ= ruleFREQ EOF ;
    public final String entryRuleFREQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFREQ = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2042:2: (iv_ruleFREQ= ruleFREQ EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2043:2: iv_ruleFREQ= ruleFREQ EOF
            {
             newCompositeNode(grammarAccess.getFREQRule()); 
            pushFollow(FOLLOW_ruleFREQ_in_entryRuleFREQ5095);
            iv_ruleFREQ=ruleFREQ();

            state._fsp--;

             current =iv_ruleFREQ.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFREQ5106); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2050:1: ruleFREQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) ) ;
    public final AntlrDatatypeRuleToken ruleFREQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2053:28: ( (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2054:1: (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2054:1: (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2055:5: this_num_0= rulenum (kw= 'hz' | kw= 'khz' )
            {
             
                    newCompositeNode(grammarAccess.getFREQAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleFREQ5153);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2065:1: (kw= 'hz' | kw= 'khz' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            else if ( (LA36_0==47) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2066:2: kw= 'hz'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleFREQ5172); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFREQAccess().getHzKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2073:2: kw= 'khz'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleFREQ5191); 

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


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\13\uffff";
    static final String DFA28_eofS =
        "\1\uffff\2\6\10\uffff";
    static final String DFA28_minS =
        "\1\13\2\4\10\uffff";
    static final String DFA28_maxS =
        "\1\14\2\57\10\uffff";
    static final String DFA28_acceptS =
        "\3\uffff\1\10\1\5\1\4\1\1\1\6\1\7\1\2\1\3";
    static final String DFA28_specialS =
        "\13\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\1\2",
            "\4\6\2\uffff\3\6\4\uffff\1\6\7\uffff\2\6\1\uffff\1\6\1\uffff"+
            "\2\6\1\11\1\5\1\4\6\12\3\7\2\10\2\3",
            "\4\6\2\uffff\3\6\4\uffff\1\6\7\uffff\2\6\1\uffff\1\6\1\uffff"+
            "\2\6\1\11\1\5\1\4\6\12\3\7\2\10\2\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1397:3: (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )";
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_rulestylesheet131 = new BitSet(new long[]{0x00000000013C40A2L});
    public static final BitSet FOLLOW_rulemedia_in_rulestylesheet158 = new BitSet(new long[]{0x00000000013C40A2L});
    public static final BitSet FOLLOW_rulemedia_in_entryRulemedia195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulemedia242 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulemedia_list_in_rulemedia263 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulemedia275 = new BitSet(new long[]{0x00000000013D00A0L});
    public static final BitSet FOLLOW_ruleruleset_in_rulemedia296 = new BitSet(new long[]{0x00000000013D00A0L});
    public static final BitSet FOLLOW_16_in_rulemedia309 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset650 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleruleset662 = new BitSet(new long[]{0x00000000013C00A0L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset682 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleruleset696 = new BitSet(new long[]{0x0000000002010020L});
    public static final BitSet FOLLOW_rulecss_declaration_in_ruleruleset718 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleruleset730 = new BitSet(new long[]{0x0000000002010020L});
    public static final BitSet FOLLOW_16_in_ruleruleset744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_ruleselector846 = new BitSet(new long[]{0x000000000C000042L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector869 = new BitSet(new long[]{0x00000000013C00A0L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector910 = new BitSet(new long[]{0x000000000D3C00E2L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector933 = new BitSet(new long[]{0x00000000013C00A0L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector1000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_rulesimple_selector1057 = new BitSet(new long[]{0x00000000013C00A2L});
    public static final BitSet FOLLOW_rulesub_selector_in_rulesimple_selector1078 = new BitSet(new long[]{0x00000000013C00A2L});
    public static final BitSet FOLLOW_rulesub_selector_in_rulesimple_selector1107 = new BitSet(new long[]{0x00000000013C00A2L});
    public static final BitSet FOLLOW_ruleelement_name_in_entryRuleelement_name1145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement_name1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleelement_name1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleelement_name1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_entryRulesub_selector1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesub_selector1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_rulesub_selector1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_rulesub_selector1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_rulesub_selector1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_rulesub_selector1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_entryRulecss_class1434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_class1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulecss_class1483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_class1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_entryRulecss_id1544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_id1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulecss_id1594 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_id1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXDIGITS_in_rulecss_id1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_entryRulecss_attrib1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_attrib1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulecss_attrib1731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_attrib1746 = new BitSet(new long[]{0x0000000000C00300L});
    public static final BitSet FOLLOW_22_in_rulecss_attrib1766 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_RULE_INCLUDES_in_rulecss_attrib1787 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_RULE_DASHMATCH_in_rulecss_attrib1813 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_attrib1835 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulecss_attrib1861 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulecss_attrib1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_entryRulecss_declaration1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_declaration1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_rulecss_declaration1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_entryRulecss_generic_declaration2012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_generic_declaration2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_rulecss_generic_declaration2068 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulecss_generic_declaration2080 = new BitSet(new long[]{0x0000000086001CA0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulecss_generic_declaration2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_entryRulecss_property2138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_property2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulecss_property2188 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_property2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo2251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_pseudo2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulecss_pseudo2300 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_pseudo2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator2361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulecombinator2411 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_27_in_rulecombinator2430 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecombinator2447 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleoperator_in_entryRuleoperator2495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoperator2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleoperator2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleoperator2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator2611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleunary_operator2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleunary_operator2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr2725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_ruleexpr2785 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_ruleoperator_in_ruleexpr2802 = new BitSet(new long[]{0x0000000086001CA0L});
    public static final BitSet FOLLOW_ruletermGroup_in_ruleexpr2822 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_ruletermGroup_in_entryRuletermGroup2864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermGroup2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_ruletermGroup2919 = new BitSet(new long[]{0x0000000086001CA2L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm2955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_ruleterm3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleterm3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_ruleterm3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleterm3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_ruleterm3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_ruleterm3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_entryRulenumberTerm3190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumberTerm3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_rulenumberTerm3253 = new BitSet(new long[]{0x0000000006001800L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rulenumberTerm3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_rulenumberTerm3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_rulenumberTerm3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_rulenumberTerm3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_rulenumberTerm3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_rulenumberTerm3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_rulenumberTerm3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_rulenumberTerm3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_entryRulenum3565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenum3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rulenum3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rulenum3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction3693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulefunction3745 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulefunction3764 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulefunction3781 = new BitSet(new long[]{0x0000000086001CE0L});
    public static final BitSet FOLLOW_RULE_WS_in_rulefunction3793 = new BitSet(new long[]{0x0000000086001CE0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulefunction3815 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_RULE_WS_in_rulefunction3827 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_30_in_rulefunction3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_entryRuleHexColor3881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexColor3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXDIGITS_in_ruleHexColor3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_entryRuleURLType3981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLType3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleURLType4032 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleURLType4044 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleURLType4061 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleURLType4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER4119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleNUMBER4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE4221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePERCENTAGE4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rulePERCENTAGE4279 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePERCENTAGE4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_entryRuleEMS4338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMS4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleEMS4396 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEMS4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_entryRuleEXS4455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXS4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleEXS4513 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEXS4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_entryRuleLENGTH4578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLENGTH4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleLENGTH4640 = new BitSet(new long[]{0x000001F800000000L});
    public static final BitSet FOLLOW_35_in_ruleLENGTH4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleLENGTH4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleLENGTH4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLENGTH4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleLENGTH4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleLENGTH4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_entryRuleANGLE4800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANGLE4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleANGLE4858 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_41_in_ruleANGLE4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleANGLE4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleANGLE4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_entryRuleTIME4957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTIME4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleTIME5015 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_44_in_ruleTIME5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTIME5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_entryRuleFREQ5095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFREQ5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleFREQ5153 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleFREQ5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleFREQ5191 = new BitSet(new long[]{0x0000000000000002L});

}