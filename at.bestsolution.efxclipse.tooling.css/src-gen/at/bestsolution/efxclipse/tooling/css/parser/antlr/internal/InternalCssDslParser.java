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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_IDENT", "RULE_COMMA", "RULE_WS", "RULE_HASH", "RULE_INCLUDES", "RULE_DASHMATCH", "RULE_INTEGER", "RULE_REAL", "RULE_ML_COMMENT", "'@charset'", "'@CHARSET'", "';'", "'@import'", "'@IMPORT'", "'@page'", "'@PAGE'", "'{'", "'}'", "':'", "'@media'", "'@MEDIA'", "'*'", "'.'", "'['", "'='", "']'", "'-'", "'+'", "'>'", "'/'", "'('", "')'", "'url'", "'%'", "'em'", "'ex'", "'px'", "'cm'", "'mm'", "'in'", "'pt'", "'pc'", "'deg'", "'rad'", "'grad'", "'ms'", "'s'", "'hz'", "'khz'", "'!important'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_INCLUDES=9;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_REAL=12;
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
    public static final int RULE_HASH=8;
    public static final int RULE_COMMA=6;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_DASHMATCH=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_IDENT=5;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=7;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:76:1: rulestylesheet returns [EObject current=null] : ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* ) ;
    public final EObject rulestylesheet() throws RecognitionException {
        EObject current = null;

        EObject lv_charset_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_ruleset_2_0 = null;

        EObject lv_media_3_0 = null;

        EObject lv_page_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:79:28: ( ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:80:1: ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:80:1: ( ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:80:2: ( (lv_charset_0_0= rulecharset ) )? ( (lv_imports_1_0= ruleimportExpression ) )* ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:80:2: ( (lv_charset_0_0= rulecharset ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:81:1: (lv_charset_0_0= rulecharset )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:81:1: (lv_charset_0_0= rulecharset )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:82:3: lv_charset_0_0= rulecharset
                    {
                     
                    	        newCompositeNode(grammarAccess.getStylesheetAccess().getCharsetCharsetParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecharset_in_rulestylesheet131);
                    lv_charset_0_0=rulecharset();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
                    	        }
                           		set(
                           			current, 
                           			"charset",
                            		lv_charset_0_0, 
                            		"charset");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:98:3: ( (lv_imports_1_0= ruleimportExpression ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=17 && LA2_0<=18)||LA2_0==37) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:99:1: (lv_imports_1_0= ruleimportExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:99:1: (lv_imports_1_0= ruleimportExpression )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:100:3: lv_imports_1_0= ruleimportExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getImportsImportExpressionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleimportExpression_in_rulestylesheet153);
            	    lv_imports_1_0=ruleimportExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_1_0, 
            	            		"importExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:116:3: ( ( (lv_ruleset_2_0= ruleruleset ) ) | ( (lv_media_3_0= rulemedia ) ) | ( (lv_page_4_0= rulepage ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case RULE_IDENT:
                case RULE_HASH:
                case 23:
                case 26:
                case 27:
                case 28:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                    {
                    alt3=1;
                    }
                    break;
                case 24:
                case 25:
                    {
                    alt3=2;
                    }
                    break;
                case 19:
                case 20:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:116:4: ( (lv_ruleset_2_0= ruleruleset ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:116:4: ( (lv_ruleset_2_0= ruleruleset ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:117:1: (lv_ruleset_2_0= ruleruleset )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:117:1: (lv_ruleset_2_0= ruleruleset )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:118:3: lv_ruleset_2_0= ruleruleset
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getRulesetRulesetParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleruleset_in_rulestylesheet176);
            	    lv_ruleset_2_0=ruleruleset();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ruleset",
            	            		lv_ruleset_2_0, 
            	            		"ruleset");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:135:6: ( (lv_media_3_0= rulemedia ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:135:6: ( (lv_media_3_0= rulemedia ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:136:1: (lv_media_3_0= rulemedia )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:136:1: (lv_media_3_0= rulemedia )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:137:3: lv_media_3_0= rulemedia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getMediaMediaParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulemedia_in_rulestylesheet203);
            	    lv_media_3_0=rulemedia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"media",
            	            		lv_media_3_0, 
            	            		"media");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:154:6: ( (lv_page_4_0= rulepage ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:154:6: ( (lv_page_4_0= rulepage ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:155:1: (lv_page_4_0= rulepage )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:155:1: (lv_page_4_0= rulepage )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:156:3: lv_page_4_0= rulepage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStylesheetAccess().getPagePageParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulepage_in_rulestylesheet230);
            	    lv_page_4_0=rulepage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"page",
            	            		lv_page_4_0, 
            	            		"page");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


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
    // $ANTLR end "rulestylesheet"


    // $ANTLR start "entryRulecharset"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:180:1: entryRulecharset returns [EObject current=null] : iv_rulecharset= rulecharset EOF ;
    public final EObject entryRulecharset() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharset = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:181:2: (iv_rulecharset= rulecharset EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:182:2: iv_rulecharset= rulecharset EOF
            {
             newCompositeNode(grammarAccess.getCharsetRule()); 
            pushFollow(FOLLOW_rulecharset_in_entryRulecharset268);
            iv_rulecharset=rulecharset();

            state._fsp--;

             current =iv_rulecharset; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecharset278); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecharset"


    // $ANTLR start "rulecharset"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:189:1: rulecharset returns [EObject current=null] : ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject rulecharset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_charset_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:192:28: ( ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:193:1: ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:193:1: ( (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:193:2: (otherlv_0= '@charset' | otherlv_1= '@CHARSET' ) ( (lv_charset_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:193:2: (otherlv_0= '@charset' | otherlv_1= '@CHARSET' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:193:4: otherlv_0= '@charset'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulecharset316); 

                        	newLeafNode(otherlv_0, grammarAccess.getCharsetAccess().getCharsetKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:198:7: otherlv_1= '@CHARSET'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_rulecharset334); 

                        	newLeafNode(otherlv_1, grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:202:2: ( (lv_charset_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:203:1: (lv_charset_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:203:1: (lv_charset_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:204:3: lv_charset_2_0= RULE_STRING
            {
            lv_charset_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulecharset352); 

            			newLeafNode(lv_charset_2_0, grammarAccess.getCharsetAccess().getCharsetSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCharsetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"charset",
                    		lv_charset_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_rulecharset369); 

                	newLeafNode(otherlv_3, grammarAccess.getCharsetAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "rulecharset"


    // $ANTLR start "entryRuleimportExpression"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:232:1: entryRuleimportExpression returns [EObject current=null] : iv_ruleimportExpression= ruleimportExpression EOF ;
    public final EObject entryRuleimportExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleimportExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:233:2: (iv_ruleimportExpression= ruleimportExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:234:2: iv_ruleimportExpression= ruleimportExpression EOF
            {
             newCompositeNode(grammarAccess.getImportExpressionRule()); 
            pushFollow(FOLLOW_ruleimportExpression_in_entryRuleimportExpression405);
            iv_ruleimportExpression=ruleimportExpression();

            state._fsp--;

             current =iv_ruleimportExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleimportExpression415); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleimportExpression"


    // $ANTLR start "ruleimportExpression"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:241:1: ruleimportExpression returns [EObject current=null] : ( ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' ) ) ;
    public final EObject ruleimportExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_5=null;
        EObject this_URLType_3 = null;

        AntlrDatatypeRuleToken lv_mediaList_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:244:28: ( ( ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:1: ( ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:1: ( ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) ) ) | (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=17 && LA7_0<=18)) ) {
                alt7=1;
            }
            else if ( (LA7_0==37) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:2: ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:2: ( (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:3: (otherlv_0= '@import' | otherlv_1= '@IMPORT' ) ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:3: (otherlv_0= '@import' | otherlv_1= '@IMPORT' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==17) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==18) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:245:5: otherlv_0= '@import'
                            {
                            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleimportExpression454); 

                                	newLeafNode(otherlv_0, grammarAccess.getImportExpressionAccess().getImportKeyword_0_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:250:7: otherlv_1= '@IMPORT'
                            {
                            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleimportExpression472); 

                                	newLeafNode(otherlv_1, grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_0_1());
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:254:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:255:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:255:1: (lv_value_2_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:256:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleimportExpression490); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getImportExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportExpressionRule());
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:273:6: (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:273:6: (this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';' )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:274:5: this_URLType_3= ruleURLType ( (lv_mediaList_4_0= rulemedia_list ) )? otherlv_5= ';'
                    {
                     
                            newCompositeNode(grammarAccess.getImportExpressionAccess().getURLTypeParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleURLType_in_ruleimportExpression525);
                    this_URLType_3=ruleURLType();

                    state._fsp--;

                     
                            current = this_URLType_3; 
                            afterParserOrEnumRuleCall();
                        
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:282:1: ( (lv_mediaList_4_0= rulemedia_list ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_IDENT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:283:1: (lv_mediaList_4_0= rulemedia_list )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:283:1: (lv_mediaList_4_0= rulemedia_list )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:284:3: lv_mediaList_4_0= rulemedia_list
                            {
                             
                            	        newCompositeNode(grammarAccess.getImportExpressionAccess().getMediaListMedia_listParserRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulemedia_list_in_ruleimportExpression545);
                            lv_mediaList_4_0=rulemedia_list();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getImportExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mediaList",
                                    		lv_mediaList_4_0, 
                                    		"media_list");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleimportExpression558); 

                        	newLeafNode(otherlv_5, grammarAccess.getImportExpressionAccess().getSemicolonKeyword_1_2());
                        

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
    // $ANTLR end "ruleimportExpression"


    // $ANTLR start "entryRulepage"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:312:1: entryRulepage returns [EObject current=null] : iv_rulepage= rulepage EOF ;
    public final EObject entryRulepage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepage = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:313:2: (iv_rulepage= rulepage EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:314:2: iv_rulepage= rulepage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulepage_in_entryRulepage595);
            iv_rulepage=rulepage();

            state._fsp--;

             current =iv_rulepage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepage605); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepage"


    // $ANTLR start "rulepage"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:321:1: rulepage returns [EObject current=null] : ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_generic_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_generic_declaration ) )? )* otherlv_8= '}' ) ;
    public final EObject rulepage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_pseudoPage_3_0 = null;

        EObject lv_declarations_5_0 = null;

        EObject lv_declarations_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:324:28: ( ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_generic_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_generic_declaration ) )? )* otherlv_8= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:325:1: ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_generic_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_generic_declaration ) )? )* otherlv_8= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:325:1: ( () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_generic_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_generic_declaration ) )? )* otherlv_8= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:325:2: () (otherlv_1= '@page' | otherlv_2= '@PAGE' ) ( (lv_pseudoPage_3_0= rulepseudo_page ) )? otherlv_4= '{' ( (lv_declarations_5_0= rulecss_generic_declaration ) )? (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_generic_declaration ) )? )* otherlv_8= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:325:2: ()
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:326:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPageAccess().getPageAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:331:2: (otherlv_1= '@page' | otherlv_2= '@PAGE' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:331:4: otherlv_1= '@page'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_rulepage652); 

                        	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:336:7: otherlv_2= '@PAGE'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulepage670); 

                        	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getPAGEKeyword_1_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:340:2: ( (lv_pseudoPage_3_0= rulepseudo_page ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:341:1: (lv_pseudoPage_3_0= rulepseudo_page )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:341:1: (lv_pseudoPage_3_0= rulepseudo_page )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:342:3: lv_pseudoPage_3_0= rulepseudo_page
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getPseudoPagePseudo_pageParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulepseudo_page_in_rulepage692);
                    lv_pseudoPage_3_0=rulepseudo_page();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	        }
                           		set(
                           			current, 
                           			"pseudoPage",
                            		lv_pseudoPage_3_0, 
                            		"pseudo_page");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_rulepage705); 

                	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:362:1: ( (lv_declarations_5_0= rulecss_generic_declaration ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_IDENT||LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:363:1: (lv_declarations_5_0= rulecss_generic_declaration )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:363:1: (lv_declarations_5_0= rulecss_generic_declaration )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:364:3: lv_declarations_5_0= rulecss_generic_declaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getPageAccess().getDeclarationsCss_generic_declarationParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_generic_declaration_in_rulepage726);
                    lv_declarations_5_0=rulecss_generic_declaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPageRule());
                    	        }
                           		add(
                           			current, 
                           			"declarations",
                            		lv_declarations_5_0, 
                            		"css_generic_declaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:380:3: (otherlv_6= ';' ( (lv_declarations_7_0= rulecss_generic_declaration ) )? )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:380:5: otherlv_6= ';' ( (lv_declarations_7_0= rulecss_generic_declaration ) )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_rulepage740); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getSemicolonKeyword_5_0());
            	        
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:384:1: ( (lv_declarations_7_0= rulecss_generic_declaration ) )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_IDENT||LA11_0==31) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:385:1: (lv_declarations_7_0= rulecss_generic_declaration )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:385:1: (lv_declarations_7_0= rulecss_generic_declaration )
            	            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:386:3: lv_declarations_7_0= rulecss_generic_declaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getPageAccess().getDeclarationsCss_generic_declarationParserRuleCall_5_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_rulecss_generic_declaration_in_rulepage761);
            	            lv_declarations_7_0=rulecss_generic_declaration();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getPageRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"declarations",
            	                    		lv_declarations_7_0, 
            	                    		"css_generic_declaration");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_rulepage776); 

                	newLeafNode(otherlv_8, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "rulepage"


    // $ANTLR start "entryRulepseudo_page"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:414:1: entryRulepseudo_page returns [String current=null] : iv_rulepseudo_page= rulepseudo_page EOF ;
    public final String entryRulepseudo_page() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepseudo_page = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:415:2: (iv_rulepseudo_page= rulepseudo_page EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:416:2: iv_rulepseudo_page= rulepseudo_page EOF
            {
             newCompositeNode(grammarAccess.getPseudo_pageRule()); 
            pushFollow(FOLLOW_rulepseudo_page_in_entryRulepseudo_page813);
            iv_rulepseudo_page=rulepseudo_page();

            state._fsp--;

             current =iv_rulepseudo_page.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepseudo_page824); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepseudo_page"


    // $ANTLR start "rulepseudo_page"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:423:1: rulepseudo_page returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_IDENT_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken rulepseudo_page() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:426:28: ( (kw= ':' this_IDENT_1= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:427:1: (kw= ':' this_IDENT_1= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:427:1: (kw= ':' this_IDENT_1= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:428:2: kw= ':' this_IDENT_1= RULE_IDENT
            {
            kw=(Token)match(input,23,FOLLOW_23_in_rulepseudo_page862); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPseudo_pageAccess().getColonKeyword_0()); 
                
            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulepseudo_page877); 

            		current.merge(this_IDENT_1);
                
             
                newLeafNode(this_IDENT_1, grammarAccess.getPseudo_pageAccess().getIDENTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "rulepseudo_page"


    // $ANTLR start "entryRulemedia"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:448:1: entryRulemedia returns [EObject current=null] : iv_rulemedia= rulemedia EOF ;
    public final EObject entryRulemedia() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemedia = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:449:2: (iv_rulemedia= rulemedia EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:450:2: iv_rulemedia= rulemedia EOF
            {
             newCompositeNode(grammarAccess.getMediaRule()); 
            pushFollow(FOLLOW_rulemedia_in_entryRulemedia922);
            iv_rulemedia=rulemedia();

            state._fsp--;

             current =iv_rulemedia; 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia932); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:457:1: rulemedia returns [EObject current=null] : ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' ) ;
    public final EObject rulemedia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_medialist_2_0 = null;

        EObject lv_rulesets_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:460:28: ( ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:461:1: ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:461:1: ( (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:461:2: (otherlv_0= '@media' | otherlv_1= '@MEDIA' ) ( (lv_medialist_2_0= rulemedia_list ) ) otherlv_3= '{' ( (lv_rulesets_4_0= ruleruleset ) )* otherlv_5= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:461:2: (otherlv_0= '@media' | otherlv_1= '@MEDIA' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:461:4: otherlv_0= '@media'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulemedia970); 

                        	newLeafNode(otherlv_0, grammarAccess.getMediaAccess().getMediaKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:466:7: otherlv_1= '@MEDIA'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_rulemedia988); 

                        	newLeafNode(otherlv_1, grammarAccess.getMediaAccess().getMEDIAKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:470:2: ( (lv_medialist_2_0= rulemedia_list ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:471:1: (lv_medialist_2_0= rulemedia_list )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:471:1: (lv_medialist_2_0= rulemedia_list )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:472:3: lv_medialist_2_0= rulemedia_list
            {
             
            	        newCompositeNode(grammarAccess.getMediaAccess().getMedialistMedia_listParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulemedia_list_in_rulemedia1010);
            lv_medialist_2_0=rulemedia_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMediaRule());
            	        }
                   		set(
                   			current, 
                   			"medialist",
                    		lv_medialist_2_0, 
                    		"media_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulemedia1022); 

                	newLeafNode(otherlv_3, grammarAccess.getMediaAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:492:1: ( (lv_rulesets_4_0= ruleruleset ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_IDENT||LA14_0==RULE_HASH||LA14_0==23||(LA14_0>=26 && LA14_0<=28)||(LA14_0>=39 && LA14_0<=53)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:493:1: (lv_rulesets_4_0= ruleruleset )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:493:1: (lv_rulesets_4_0= ruleruleset )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:494:3: lv_rulesets_4_0= ruleruleset
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMediaAccess().getRulesetsRulesetParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleruleset_in_rulemedia1043);
            	    lv_rulesets_4_0=ruleruleset();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMediaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rulesets",
            	            		lv_rulesets_4_0, 
            	            		"ruleset");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_rulemedia1056); 

                	newLeafNode(otherlv_5, grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:522:1: entryRulemedia_list returns [String current=null] : iv_rulemedia_list= rulemedia_list EOF ;
    public final String entryRulemedia_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemedia_list = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:523:2: (iv_rulemedia_list= rulemedia_list EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:524:2: iv_rulemedia_list= rulemedia_list EOF
            {
             newCompositeNode(grammarAccess.getMedia_listRule()); 
            pushFollow(FOLLOW_rulemedia_list_in_entryRulemedia_list1093);
            iv_rulemedia_list=rulemedia_list();

            state._fsp--;

             current =iv_rulemedia_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedia_list1104); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:531:1: rulemedia_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* ) ;
    public final AntlrDatatypeRuleToken rulemedia_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMA_1=null;
        AntlrDatatypeRuleToken this_medium_0 = null;

        AntlrDatatypeRuleToken this_medium_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:534:28: ( (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:535:1: (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:535:1: (this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:536:5: this_medium_0= rulemedium (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )*
            {
             
                    newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulemedium_in_rulemedia_list1151);
            this_medium_0=rulemedium();

            state._fsp--;


            		current.merge(this_medium_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:546:1: (this_COMMA_1= RULE_COMMA this_medium_2= rulemedium )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:546:6: this_COMMA_1= RULE_COMMA this_medium_2= rulemedium
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rulemedia_list1172); 

            	    		current.merge(this_COMMA_1);
            	        
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getMedia_listAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getMedia_listAccess().getMediumParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulemedium_in_rulemedia_list1199);
            	    this_medium_2=rulemedium();

            	    state._fsp--;


            	    		current.merge(this_medium_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:572:1: entryRulemedium returns [String current=null] : iv_rulemedium= rulemedium EOF ;
    public final String entryRulemedium() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemedium = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:573:2: (iv_rulemedium= rulemedium EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:574:2: iv_rulemedium= rulemedium EOF
            {
             newCompositeNode(grammarAccess.getMediumRule()); 
            pushFollow(FOLLOW_rulemedium_in_entryRulemedium1247);
            iv_rulemedium=rulemedium();

            state._fsp--;

             current =iv_rulemedium.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemedium1258); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:581:1: rulemedium returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENT_0= RULE_IDENT ;
    public final AntlrDatatypeRuleToken rulemedium() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:584:28: (this_IDENT_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:585:5: this_IDENT_0= RULE_IDENT
            {
            this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulemedium1297); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:600:1: entryRuleruleset returns [EObject current=null] : iv_ruleruleset= ruleruleset EOF ;
    public final EObject entryRuleruleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleset = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:601:2: (iv_ruleruleset= ruleruleset EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:602:2: iv_ruleruleset= ruleruleset EOF
            {
             newCompositeNode(grammarAccess.getRulesetRule()); 
            pushFollow(FOLLOW_ruleruleset_in_entryRuleruleset1341);
            iv_ruleruleset=ruleruleset();

            state._fsp--;

             current =iv_ruleruleset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleset1351); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:609:1: ruleruleset returns [EObject current=null] : ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:612:28: ( ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:613:1: ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:613:1: ( ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:613:2: ( (lv_selectors_0_0= ruleselector ) ) (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )* otherlv_3= '{' ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )* otherlv_6= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:613:2: ( (lv_selectors_0_0= ruleselector ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:614:1: (lv_selectors_0_0= ruleselector )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:614:1: (lv_selectors_0_0= ruleselector )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:615:3: lv_selectors_0_0= ruleselector
            {
             
            	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleselector_in_ruleruleset1397);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:631:2: (this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:631:3: this_COMMA_1= RULE_COMMA ( (lv_selectors_2_0= ruleselector ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleruleset1409); 
            	     
            	        newLeafNode(this_COMMA_1, grammarAccess.getRulesetAccess().getCOMMATerminalRuleCall_1_0()); 
            	        
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:635:1: ( (lv_selectors_2_0= ruleselector ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:636:1: (lv_selectors_2_0= ruleselector )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:636:1: (lv_selectors_2_0= ruleselector )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:637:3: lv_selectors_2_0= ruleselector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRulesetAccess().getSelectorsSelectorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleselector_in_ruleruleset1429);
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
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleruleset1443); 

                	newLeafNode(otherlv_3, grammarAccess.getRulesetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:657:1: ( ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_IDENT||LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:657:2: ( (lv_declarations_4_0= rulecss_declaration ) ) otherlv_5= ';'
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:657:2: ( (lv_declarations_4_0= rulecss_declaration ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:658:1: (lv_declarations_4_0= rulecss_declaration )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:658:1: (lv_declarations_4_0= rulecss_declaration )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:659:3: lv_declarations_4_0= rulecss_declaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRulesetAccess().getDeclarationsCss_declarationParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecss_declaration_in_ruleruleset1465);
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

            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleruleset1477); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRulesetAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleruleset1491); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:691:1: entryRuleselector returns [EObject current=null] : iv_ruleselector= ruleselector EOF ;
    public final EObject entryRuleselector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleselector = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:695:2: (iv_ruleselector= ruleselector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:696:2: iv_ruleselector= ruleselector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleselector_in_entryRuleselector1533);
            iv_ruleselector=ruleselector();

            state._fsp--;

             current =iv_ruleselector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleselector1543); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:706:1: ruleselector returns [EObject current=null] : ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )? ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:710:28: ( ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:711:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:711:1: ( ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:711:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) ) ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:711:2: ( (lv_simpleselectors_0_0= rulesimple_selector ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:712:1: (lv_simpleselectors_0_0= rulesimple_selector )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:712:1: (lv_simpleselectors_0_0= rulesimple_selector )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:713:3: lv_simpleselectors_0_0= rulesimple_selector
            {
             
            	        newCompositeNode(grammarAccess.getSelectorAccess().getSimpleselectorsSimple_selectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulesimple_selector_in_ruleselector1593);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:729:2: ( ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) ) | ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=32 && LA21_0<=33)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_WS) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:729:3: ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:729:3: ( ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:729:4: ( (lv_combinator_1_0= rulecombinator ) ) ( (lv_selector_2_0= ruleselector ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:729:4: ( (lv_combinator_1_0= rulecombinator ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:730:1: (lv_combinator_1_0= rulecombinator )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:730:1: (lv_combinator_1_0= rulecombinator )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:731:3: lv_combinator_1_0= rulecombinator
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecombinator_in_ruleselector1616);
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:747:2: ( (lv_selector_2_0= ruleselector ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:748:1: (lv_selector_2_0= ruleselector )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:748:1: (lv_selector_2_0= ruleselector )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:749:3: lv_selector_2_0= ruleselector
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleselector_in_ruleselector1637);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:766:6: ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:766:6: ( (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )? )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:766:7: (this_WS_3= RULE_WS )+ ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:766:7: (this_WS_3= RULE_WS )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_WS) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:766:8: this_WS_3= RULE_WS
                    	    {
                    	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleselector1657); 
                    	     
                    	        newLeafNode(this_WS_3, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:770:3: ( ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_IDENT||LA20_0==RULE_HASH||LA20_0==23||(LA20_0>=26 && LA20_0<=28)||(LA20_0>=32 && LA20_0<=33)||(LA20_0>=39 && LA20_0<=53)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:770:4: ( (lv_combinator_4_0= rulecombinator ) )? ( (lv_selector_5_0= ruleselector ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:770:4: ( (lv_combinator_4_0= rulecombinator ) )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( ((LA19_0>=32 && LA19_0<=33)) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:771:1: (lv_combinator_4_0= rulecombinator )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:771:1: (lv_combinator_4_0= rulecombinator )
                                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:772:3: lv_combinator_4_0= rulecombinator
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getSelectorAccess().getCombinatorCombinatorParserRuleCall_1_1_1_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_rulecombinator_in_ruleselector1680);
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

                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:788:3: ( (lv_selector_5_0= ruleselector ) )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:789:1: (lv_selector_5_0= ruleselector )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:789:1: (lv_selector_5_0= ruleselector )
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:790:3: lv_selector_5_0= ruleselector
                            {
                             
                            	        newCompositeNode(grammarAccess.getSelectorAccess().getSelectorSelectorParserRuleCall_1_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleselector_in_ruleselector1702);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:817:1: entryRulesimple_selector returns [EObject current=null] : iv_rulesimple_selector= rulesimple_selector EOF ;
    public final EObject entryRulesimple_selector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_selector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:818:2: (iv_rulesimple_selector= rulesimple_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:819:2: iv_rulesimple_selector= rulesimple_selector EOF
            {
             newCompositeNode(grammarAccess.getSimple_selectorRule()); 
            pushFollow(FOLLOW_rulesimple_selector_in_entryRulesimple_selector1747);
            iv_rulesimple_selector=rulesimple_selector();

            state._fsp--;

             current =iv_rulesimple_selector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_selector1757); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:826:1: rulesimple_selector returns [EObject current=null] : ( ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )* ) | ( (lv_subSelectors_2_0= rulesub_selector ) )+ ) ;
    public final EObject rulesimple_selector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_element_0_0 = null;

        EObject lv_subSelectors_1_0 = null;

        EObject lv_subSelectors_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:829:28: ( ( ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )* ) | ( (lv_subSelectors_2_0= rulesub_selector ) )+ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:830:1: ( ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )* ) | ( (lv_subSelectors_2_0= rulesub_selector ) )+ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:830:1: ( ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )* ) | ( (lv_subSelectors_2_0= rulesub_selector ) )+ )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_IDENT||LA24_0==26||(LA24_0>=39 && LA24_0<=53)) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_HASH||LA24_0==23||(LA24_0>=27 && LA24_0<=28)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:830:2: ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:830:2: ( ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )* )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:830:3: ( (lv_element_0_0= ruleelement_name ) ) ( (lv_subSelectors_1_0= rulesub_selector ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:830:3: ( (lv_element_0_0= ruleelement_name ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:831:1: (lv_element_0_0= ruleelement_name )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:831:1: (lv_element_0_0= ruleelement_name )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:832:3: lv_element_0_0= ruleelement_name
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getElementElement_nameParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleelement_name_in_rulesimple_selector1804);
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

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:848:2: ( (lv_subSelectors_1_0= rulesub_selector ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_HASH||LA22_0==23||(LA22_0>=27 && LA22_0<=28)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:849:1: (lv_subSelectors_1_0= rulesub_selector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:849:1: (lv_subSelectors_1_0= rulesub_selector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:850:3: lv_subSelectors_1_0= rulesub_selector
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulesub_selector_in_rulesimple_selector1825);
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
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:867:6: ( (lv_subSelectors_2_0= rulesub_selector ) )+
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:867:6: ( (lv_subSelectors_2_0= rulesub_selector ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_HASH||LA23_0==23||(LA23_0>=27 && LA23_0<=28)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:868:1: (lv_subSelectors_2_0= rulesub_selector )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:868:1: (lv_subSelectors_2_0= rulesub_selector )
                    	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:869:3: lv_subSelectors_2_0= rulesub_selector
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimple_selectorAccess().getSubSelectorsSub_selectorParserRuleCall_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulesub_selector_in_rulesimple_selector1854);
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
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:893:1: entryRuleelement_name returns [String current=null] : iv_ruleelement_name= ruleelement_name EOF ;
    public final String entryRuleelement_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelement_name = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:894:2: (iv_ruleelement_name= ruleelement_name EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:895:2: iv_ruleelement_name= ruleelement_name EOF
            {
             newCompositeNode(grammarAccess.getElement_nameRule()); 
            pushFollow(FOLLOW_ruleelement_name_in_entryRuleelement_name1892);
            iv_ruleelement_name=ruleelement_name();

            state._fsp--;

             current =iv_ruleelement_name.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement_name1903); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:902:1: ruleelement_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENT_0= RULE_IDENT | this_ReservedWords_1= ruleReservedWords | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleelement_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_ReservedWords_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:905:28: ( (this_IDENT_0= RULE_IDENT | this_ReservedWords_1= ruleReservedWords | kw= '*' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:906:1: (this_IDENT_0= RULE_IDENT | this_ReservedWords_1= ruleReservedWords | kw= '*' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:906:1: (this_IDENT_0= RULE_IDENT | this_ReservedWords_1= ruleReservedWords | kw= '*' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt25=1;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt25=2;
                }
                break;
            case 26:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:906:6: this_IDENT_0= RULE_IDENT
                    {
                    this_IDENT_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleelement_name1943); 

                    		current.merge(this_IDENT_0);
                        
                     
                        newLeafNode(this_IDENT_0, grammarAccess.getElement_nameAccess().getIDENTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:915:5: this_ReservedWords_1= ruleReservedWords
                    {
                     
                            newCompositeNode(grammarAccess.getElement_nameAccess().getReservedWordsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReservedWords_in_ruleelement_name1976);
                    this_ReservedWords_1=ruleReservedWords();

                    state._fsp--;


                    		current.merge(this_ReservedWords_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:927:2: kw= '*'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleelement_name2000); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getElement_nameAccess().getAsteriskKeyword_2()); 
                        

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:940:1: entryRulesub_selector returns [EObject current=null] : iv_rulesub_selector= rulesub_selector EOF ;
    public final EObject entryRulesub_selector() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesub_selector = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:941:2: (iv_rulesub_selector= rulesub_selector EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:942:2: iv_rulesub_selector= rulesub_selector EOF
            {
             newCompositeNode(grammarAccess.getSub_selectorRule()); 
            pushFollow(FOLLOW_rulesub_selector_in_entryRulesub_selector2040);
            iv_rulesub_selector=rulesub_selector();

            state._fsp--;

             current =iv_rulesub_selector; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesub_selector2050); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:949:1: rulesub_selector returns [EObject current=null] : ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) ) ;
    public final EObject rulesub_selector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_class_1_0 = null;

        AntlrDatatypeRuleToken lv_attrib_2_0 = null;

        AntlrDatatypeRuleToken lv_pseudoclass_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:952:28: ( ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:953:1: ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:953:1: ( ( (lv_id_0_0= rulecss_id ) ) | ( (lv_class_1_0= rulecss_class ) ) | ( (lv_attrib_2_0= rulecss_attrib ) ) | ( (lv_pseudoclass_3_0= rulecss_pseudo ) ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case RULE_HASH:
                {
                alt26=1;
                }
                break;
            case 27:
                {
                alt26=2;
                }
                break;
            case 28:
                {
                alt26=3;
                }
                break;
            case 23:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:953:2: ( (lv_id_0_0= rulecss_id ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:953:2: ( (lv_id_0_0= rulecss_id ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:954:1: (lv_id_0_0= rulecss_id )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:954:1: (lv_id_0_0= rulecss_id )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:955:3: lv_id_0_0= rulecss_id
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getIdCss_idParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_id_in_rulesub_selector2096);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:972:6: ( (lv_class_1_0= rulecss_class ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:972:6: ( (lv_class_1_0= rulecss_class ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:973:1: (lv_class_1_0= rulecss_class )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:973:1: (lv_class_1_0= rulecss_class )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:974:3: lv_class_1_0= rulecss_class
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getClassCss_classParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_class_in_rulesub_selector2123);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:991:6: ( (lv_attrib_2_0= rulecss_attrib ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:991:6: ( (lv_attrib_2_0= rulecss_attrib ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:992:1: (lv_attrib_2_0= rulecss_attrib )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:992:1: (lv_attrib_2_0= rulecss_attrib )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:993:3: lv_attrib_2_0= rulecss_attrib
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getAttribCss_attribParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_attrib_in_rulesub_selector2150);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1010:6: ( (lv_pseudoclass_3_0= rulecss_pseudo ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1010:6: ( (lv_pseudoclass_3_0= rulecss_pseudo ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1011:1: (lv_pseudoclass_3_0= rulecss_pseudo )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1011:1: (lv_pseudoclass_3_0= rulecss_pseudo )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1012:3: lv_pseudoclass_3_0= rulecss_pseudo
                    {
                     
                    	        newCompositeNode(grammarAccess.getSub_selectorAccess().getPseudoclassCss_pseudoParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_pseudo_in_rulesub_selector2177);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1036:1: entryRulecss_class returns [String current=null] : iv_rulecss_class= rulecss_class EOF ;
    public final String entryRulecss_class() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_class = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1037:2: (iv_rulecss_class= rulecss_class EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1038:2: iv_rulecss_class= rulecss_class EOF
            {
             newCompositeNode(grammarAccess.getCss_classRule()); 
            pushFollow(FOLLOW_rulecss_class_in_entryRulecss_class2214);
            iv_rulecss_class=rulecss_class();

            state._fsp--;

             current =iv_rulecss_class.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_class2225); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1045:1: rulecss_class returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ) ;
    public final AntlrDatatypeRuleToken rulecss_class() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;
        AntlrDatatypeRuleToken this_ReservedWords_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1048:28: ( (kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1049:1: (kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1049:1: (kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1050:2: kw= '.' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords )
            {
            kw=(Token)match(input,27,FOLLOW_27_in_rulecss_class2263); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_classAccess().getFullStopKeyword_0()); 
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1055:1: (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_IDENT) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=39 && LA27_0<=53)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1055:6: this_IDENT_1= RULE_IDENT
                    {
                    this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_class2279); 

                    		current.merge(this_IDENT_1);
                        
                     
                        newLeafNode(this_IDENT_1, grammarAccess.getCss_classAccess().getIDENTTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1064:5: this_ReservedWords_2= ruleReservedWords
                    {
                     
                            newCompositeNode(grammarAccess.getCss_classAccess().getReservedWordsParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleReservedWords_in_rulecss_class2312);
                    this_ReservedWords_2=ruleReservedWords();

                    state._fsp--;


                    		current.merge(this_ReservedWords_2);
                        
                     
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
        }
        return current;
    }
    // $ANTLR end "rulecss_class"


    // $ANTLR start "entryRulecss_id"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1082:1: entryRulecss_id returns [String current=null] : iv_rulecss_id= rulecss_id EOF ;
    public final String entryRulecss_id() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_id = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1083:2: (iv_rulecss_id= rulecss_id EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1084:2: iv_rulecss_id= rulecss_id EOF
            {
             newCompositeNode(grammarAccess.getCss_idRule()); 
            pushFollow(FOLLOW_rulecss_id_in_entryRulecss_id2359);
            iv_rulecss_id=rulecss_id();

            state._fsp--;

             current =iv_rulecss_id.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_id2370); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1091:1: rulecss_id returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_HASH_0= RULE_HASH ;
    public final AntlrDatatypeRuleToken rulecss_id() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HASH_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1094:28: (this_HASH_0= RULE_HASH )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1095:5: this_HASH_0= RULE_HASH
            {
            this_HASH_0=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rulecss_id2409); 

            		current.merge(this_HASH_0);
                
             
                newLeafNode(this_HASH_0, grammarAccess.getCss_idAccess().getHASHTerminalRuleCall()); 
                

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1110:1: entryRulecss_attrib returns [String current=null] : iv_rulecss_attrib= rulecss_attrib EOF ;
    public final String entryRulecss_attrib() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_attrib = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1111:2: (iv_rulecss_attrib= rulecss_attrib EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1112:2: iv_rulecss_attrib= rulecss_attrib EOF
            {
             newCompositeNode(grammarAccess.getCss_attribRule()); 
            pushFollow(FOLLOW_rulecss_attrib_in_entryRulecss_attrib2454);
            iv_rulecss_attrib=rulecss_attrib();

            state._fsp--;

             current =iv_rulecss_attrib.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_attrib2465); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1119:1: rulecss_attrib returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '=' | this_INCLUDES_4= RULE_INCLUDES | this_DASHMATCH_5= RULE_DASHMATCH ) ( (this_IDENT_6= RULE_IDENT | this_ReservedWords_7= ruleReservedWords ) | this_STRING_8= RULE_STRING ) )? kw= ']' ) ;
    public final AntlrDatatypeRuleToken rulecss_attrib() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;
        Token this_INCLUDES_4=null;
        Token this_DASHMATCH_5=null;
        Token this_IDENT_6=null;
        Token this_STRING_8=null;
        AntlrDatatypeRuleToken this_ReservedWords_2 = null;

        AntlrDatatypeRuleToken this_ReservedWords_7 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1122:28: ( (kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '=' | this_INCLUDES_4= RULE_INCLUDES | this_DASHMATCH_5= RULE_DASHMATCH ) ( (this_IDENT_6= RULE_IDENT | this_ReservedWords_7= ruleReservedWords ) | this_STRING_8= RULE_STRING ) )? kw= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1123:1: (kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '=' | this_INCLUDES_4= RULE_INCLUDES | this_DASHMATCH_5= RULE_DASHMATCH ) ( (this_IDENT_6= RULE_IDENT | this_ReservedWords_7= ruleReservedWords ) | this_STRING_8= RULE_STRING ) )? kw= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1123:1: (kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '=' | this_INCLUDES_4= RULE_INCLUDES | this_DASHMATCH_5= RULE_DASHMATCH ) ( (this_IDENT_6= RULE_IDENT | this_ReservedWords_7= ruleReservedWords ) | this_STRING_8= RULE_STRING ) )? kw= ']' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1124:2: kw= '[' (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords ) ( (kw= '=' | this_INCLUDES_4= RULE_INCLUDES | this_DASHMATCH_5= RULE_DASHMATCH ) ( (this_IDENT_6= RULE_IDENT | this_ReservedWords_7= ruleReservedWords ) | this_STRING_8= RULE_STRING ) )? kw= ']'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_rulecss_attrib2503); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getLeftSquareBracketKeyword_0()); 
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1129:1: (this_IDENT_1= RULE_IDENT | this_ReservedWords_2= ruleReservedWords )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_IDENT) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=39 && LA28_0<=53)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1129:6: this_IDENT_1= RULE_IDENT
                    {
                    this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_attrib2519); 

                    		current.merge(this_IDENT_1);
                        
                     
                        newLeafNode(this_IDENT_1, grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1138:5: this_ReservedWords_2= ruleReservedWords
                    {
                     
                            newCompositeNode(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleReservedWords_in_rulecss_attrib2552);
                    this_ReservedWords_2=ruleReservedWords();

                    state._fsp--;


                    		current.merge(this_ReservedWords_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1148:2: ( (kw= '=' | this_INCLUDES_4= RULE_INCLUDES | this_DASHMATCH_5= RULE_DASHMATCH ) ( (this_IDENT_6= RULE_IDENT | this_ReservedWords_7= ruleReservedWords ) | this_STRING_8= RULE_STRING ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_INCLUDES && LA32_0<=RULE_DASHMATCH)||LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1148:3: (kw= '=' | this_INCLUDES_4= RULE_INCLUDES | this_DASHMATCH_5= RULE_DASHMATCH ) ( (this_IDENT_6= RULE_IDENT | this_ReservedWords_7= ruleReservedWords ) | this_STRING_8= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1148:3: (kw= '=' | this_INCLUDES_4= RULE_INCLUDES | this_DASHMATCH_5= RULE_DASHMATCH )
                    int alt29=3;
                    switch ( input.LA(1) ) {
                    case 29:
                        {
                        alt29=1;
                        }
                        break;
                    case RULE_INCLUDES:
                        {
                        alt29=2;
                        }
                        break;
                    case RULE_DASHMATCH:
                        {
                        alt29=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }

                    switch (alt29) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1149:2: kw= '='
                            {
                            kw=(Token)match(input,29,FOLLOW_29_in_rulecss_attrib2573); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCss_attribAccess().getEqualsSignKeyword_2_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1155:10: this_INCLUDES_4= RULE_INCLUDES
                            {
                            this_INCLUDES_4=(Token)match(input,RULE_INCLUDES,FOLLOW_RULE_INCLUDES_in_rulecss_attrib2594); 

                            		current.merge(this_INCLUDES_4);
                                
                             
                                newLeafNode(this_INCLUDES_4, grammarAccess.getCss_attribAccess().getINCLUDESTerminalRuleCall_2_0_1()); 
                                

                            }
                            break;
                        case 3 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1163:10: this_DASHMATCH_5= RULE_DASHMATCH
                            {
                            this_DASHMATCH_5=(Token)match(input,RULE_DASHMATCH,FOLLOW_RULE_DASHMATCH_in_rulecss_attrib2620); 

                            		current.merge(this_DASHMATCH_5);
                                
                             
                                newLeafNode(this_DASHMATCH_5, grammarAccess.getCss_attribAccess().getDASHMATCHTerminalRuleCall_2_0_2()); 
                                

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1170:2: ( (this_IDENT_6= RULE_IDENT | this_ReservedWords_7= ruleReservedWords ) | this_STRING_8= RULE_STRING )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_IDENT||(LA31_0>=39 && LA31_0<=53)) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==RULE_STRING) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1170:3: (this_IDENT_6= RULE_IDENT | this_ReservedWords_7= ruleReservedWords )
                            {
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1170:3: (this_IDENT_6= RULE_IDENT | this_ReservedWords_7= ruleReservedWords )
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==RULE_IDENT) ) {
                                alt30=1;
                            }
                            else if ( ((LA30_0>=39 && LA30_0<=53)) ) {
                                alt30=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 30, 0, input);

                                throw nvae;
                            }
                            switch (alt30) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1170:8: this_IDENT_6= RULE_IDENT
                                    {
                                    this_IDENT_6=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_attrib2643); 

                                    		current.merge(this_IDENT_6);
                                        
                                     
                                        newLeafNode(this_IDENT_6, grammarAccess.getCss_attribAccess().getIDENTTerminalRuleCall_2_1_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1179:5: this_ReservedWords_7= ruleReservedWords
                                    {
                                     
                                            newCompositeNode(grammarAccess.getCss_attribAccess().getReservedWordsParserRuleCall_2_1_0_1()); 
                                        
                                    pushFollow(FOLLOW_ruleReservedWords_in_rulecss_attrib2676);
                                    this_ReservedWords_7=ruleReservedWords();

                                    state._fsp--;


                                    		current.merge(this_ReservedWords_7);
                                        
                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1190:10: this_STRING_8= RULE_STRING
                            {
                            this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulecss_attrib2703); 

                            		current.merge(this_STRING_8);
                                
                             
                                newLeafNode(this_STRING_8, grammarAccess.getCss_attribAccess().getSTRINGTerminalRuleCall_2_1_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,30,FOLLOW_30_in_rulecss_attrib2724); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1211:1: entryRulecss_declaration returns [EObject current=null] : iv_rulecss_declaration= rulecss_declaration EOF ;
    public final EObject entryRulecss_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_declaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1212:2: (iv_rulecss_declaration= rulecss_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1213:2: iv_rulecss_declaration= rulecss_declaration EOF
            {
             newCompositeNode(grammarAccess.getCss_declarationRule()); 
            pushFollow(FOLLOW_rulecss_declaration_in_entryRulecss_declaration2764);
            iv_rulecss_declaration=rulecss_declaration();

            state._fsp--;

             current =iv_rulecss_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_declaration2774); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1220:1: rulecss_declaration returns [EObject current=null] : this_css_generic_declaration_0= rulecss_generic_declaration ;
    public final EObject rulecss_declaration() throws RecognitionException {
        EObject current = null;

        EObject this_css_generic_declaration_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1223:28: (this_css_generic_declaration_0= rulecss_generic_declaration )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1225:5: this_css_generic_declaration_0= rulecss_generic_declaration
            {
             
                    newCompositeNode(grammarAccess.getCss_declarationAccess().getCss_generic_declarationParserRuleCall()); 
                
            pushFollow(FOLLOW_rulecss_generic_declaration_in_rulecss_declaration2820);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1241:1: entryRulecss_generic_declaration returns [EObject current=null] : iv_rulecss_generic_declaration= rulecss_generic_declaration EOF ;
    public final EObject entryRulecss_generic_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecss_generic_declaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1242:2: (iv_rulecss_generic_declaration= rulecss_generic_declaration EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1243:2: iv_rulecss_generic_declaration= rulecss_generic_declaration EOF
            {
             newCompositeNode(grammarAccess.getCss_generic_declarationRule()); 
            pushFollow(FOLLOW_rulecss_generic_declaration_in_entryRulecss_generic_declaration2854);
            iv_rulecss_generic_declaration=rulecss_generic_declaration();

            state._fsp--;

             current =iv_rulecss_generic_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_generic_declaration2864); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1250:1: rulecss_generic_declaration returns [EObject current=null] : ( ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) ) ( (lv_prio_3_0= rulecss_prio ) )? ) ;
    public final EObject rulecss_generic_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_property_0_0 = null;

        EObject lv_expression_2_0 = null;

        AntlrDatatypeRuleToken lv_prio_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1253:28: ( ( ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) ) ( (lv_prio_3_0= rulecss_prio ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1254:1: ( ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) ) ( (lv_prio_3_0= rulecss_prio ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1254:1: ( ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) ) ( (lv_prio_3_0= rulecss_prio ) )? )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1254:2: ( (lv_property_0_0= rulecss_property ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleexpr ) ) ( (lv_prio_3_0= rulecss_prio ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1254:2: ( (lv_property_0_0= rulecss_property ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1255:1: (lv_property_0_0= rulecss_property )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1255:1: (lv_property_0_0= rulecss_property )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1256:3: lv_property_0_0= rulecss_property
            {
             
            	        newCompositeNode(grammarAccess.getCss_generic_declarationAccess().getPropertyCss_propertyParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecss_property_in_rulecss_generic_declaration2910);
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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_rulecss_generic_declaration2922); 

                	newLeafNode(otherlv_1, grammarAccess.getCss_generic_declarationAccess().getColonKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1276:1: ( (lv_expression_2_0= ruleexpr ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1277:1: (lv_expression_2_0= ruleexpr )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1277:1: (lv_expression_2_0= ruleexpr )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1278:3: lv_expression_2_0= ruleexpr
            {
             
            	        newCompositeNode(grammarAccess.getCss_generic_declarationAccess().getExpressionExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleexpr_in_rulecss_generic_declaration2943);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1294:2: ( (lv_prio_3_0= rulecss_prio ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1295:1: (lv_prio_3_0= rulecss_prio )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1295:1: (lv_prio_3_0= rulecss_prio )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1296:3: lv_prio_3_0= rulecss_prio
                    {
                     
                    	        newCompositeNode(grammarAccess.getCss_generic_declarationAccess().getPrioCss_prioParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_prio_in_rulecss_generic_declaration2964);
                    lv_prio_3_0=rulecss_prio();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCss_generic_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"prio",
                            		lv_prio_3_0, 
                            		"css_prio");
                    	        afterParserOrEnumRuleCall();
                    	    

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
        }
        return current;
    }
    // $ANTLR end "rulecss_generic_declaration"


    // $ANTLR start "entryRulecss_prio"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1320:1: entryRulecss_prio returns [String current=null] : iv_rulecss_prio= rulecss_prio EOF ;
    public final String entryRulecss_prio() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_prio = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1321:2: (iv_rulecss_prio= rulecss_prio EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1322:2: iv_rulecss_prio= rulecss_prio EOF
            {
             newCompositeNode(grammarAccess.getCss_prioRule()); 
            pushFollow(FOLLOW_rulecss_prio_in_entryRulecss_prio3002);
            iv_rulecss_prio=rulecss_prio();

            state._fsp--;

             current =iv_rulecss_prio.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_prio3013); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecss_prio"


    // $ANTLR start "rulecss_prio"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1329:1: rulecss_prio returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IMPORTANT_SYM_0= ruleIMPORTANT_SYM ;
    public final AntlrDatatypeRuleToken rulecss_prio() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IMPORTANT_SYM_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1332:28: (this_IMPORTANT_SYM_0= ruleIMPORTANT_SYM )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1334:5: this_IMPORTANT_SYM_0= ruleIMPORTANT_SYM
            {
             
                    newCompositeNode(grammarAccess.getCss_prioAccess().getIMPORTANT_SYMParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleIMPORTANT_SYM_in_rulecss_prio3059);
            this_IMPORTANT_SYM_0=ruleIMPORTANT_SYM();

            state._fsp--;


            		current.merge(this_IMPORTANT_SYM_0);
                
             
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
    // $ANTLR end "rulecss_prio"


    // $ANTLR start "entryRulecss_property"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1352:1: entryRulecss_property returns [String current=null] : iv_rulecss_property= rulecss_property EOF ;
    public final String entryRulecss_property() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_property = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1353:2: (iv_rulecss_property= rulecss_property EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1354:2: iv_rulecss_property= rulecss_property EOF
            {
             newCompositeNode(grammarAccess.getCss_propertyRule()); 
            pushFollow(FOLLOW_rulecss_property_in_entryRulecss_property3104);
            iv_rulecss_property=rulecss_property();

            state._fsp--;

             current =iv_rulecss_property.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_property3115); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1361:1: rulecss_property returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_IDENT_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken rulecss_property() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1364:28: ( ( (kw= '-' )? this_IDENT_1= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1365:1: ( (kw= '-' )? this_IDENT_1= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1365:1: ( (kw= '-' )? this_IDENT_1= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1365:2: (kw= '-' )? this_IDENT_1= RULE_IDENT
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1365:2: (kw= '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1366:2: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_rulecss_property3154); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCss_propertyAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_property3171); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1386:1: entryRulecss_pseudo returns [String current=null] : iv_rulecss_pseudo= rulecss_pseudo EOF ;
    public final String entryRulecss_pseudo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecss_pseudo = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1387:2: (iv_rulecss_pseudo= rulecss_pseudo EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1388:2: iv_rulecss_pseudo= rulecss_pseudo EOF
            {
             newCompositeNode(grammarAccess.getCss_pseudoRule()); 
            pushFollow(FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo3217);
            iv_rulecss_pseudo=rulecss_pseudo();

            state._fsp--;

             current =iv_rulecss_pseudo.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecss_pseudo3228); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1395:1: rulecss_pseudo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_IDENT_1= RULE_IDENT ) ;
    public final AntlrDatatypeRuleToken rulecss_pseudo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENT_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1398:28: ( (kw= ':' this_IDENT_1= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1399:1: (kw= ':' this_IDENT_1= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1399:1: (kw= ':' this_IDENT_1= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1400:2: kw= ':' this_IDENT_1= RULE_IDENT
            {
            kw=(Token)match(input,23,FOLLOW_23_in_rulecss_pseudo3266); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCss_pseudoAccess().getColonKeyword_0()); 
                
            this_IDENT_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulecss_pseudo3281); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1420:1: entryRulecombinator returns [String current=null] : iv_rulecombinator= rulecombinator EOF ;
    public final String entryRulecombinator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecombinator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1421:2: (iv_rulecombinator= rulecombinator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1422:2: iv_rulecombinator= rulecombinator EOF
            {
             newCompositeNode(grammarAccess.getCombinatorRule()); 
            pushFollow(FOLLOW_rulecombinator_in_entryRulecombinator3327);
            iv_rulecombinator=rulecombinator();

            state._fsp--;

             current =iv_rulecombinator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecombinator3338); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1429:1: rulecombinator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )* ) ;
    public final AntlrDatatypeRuleToken rulecombinator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_WS_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1432:28: ( ( (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1433:1: ( (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1433:1: ( (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1433:2: (kw= '+' | kw= '>' ) (this_WS_2= RULE_WS )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1433:2: (kw= '+' | kw= '>' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            else if ( (LA35_0==33) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1434:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_rulecombinator3377); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1441:2: kw= '>'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_rulecombinator3396); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCombinatorAccess().getGreaterThanSignKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1446:2: (this_WS_2= RULE_WS )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_WS) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1446:7: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulecombinator3413); 

            	    		current.merge(this_WS_2);
            	        
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getCombinatorAccess().getWSTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1461:1: entryRuleoperator returns [String current=null] : iv_ruleoperator= ruleoperator EOF ;
    public final String entryRuleoperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoperator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1462:2: (iv_ruleoperator= ruleoperator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1463:2: iv_ruleoperator= ruleoperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleoperator_in_entryRuleoperator3461);
            iv_ruleoperator=ruleoperator();

            state._fsp--;

             current =iv_ruleoperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoperator3472); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1470:1: ruleoperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' | this_COMMA_1= RULE_COMMA ) ;
    public final AntlrDatatypeRuleToken ruleoperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_COMMA_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1473:28: ( (kw= '/' | this_COMMA_1= RULE_COMMA ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1474:1: (kw= '/' | this_COMMA_1= RULE_COMMA )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1474:1: (kw= '/' | this_COMMA_1= RULE_COMMA )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_COMMA) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1475:2: kw= '/'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleoperator3510); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1481:10: this_COMMA_1= RULE_COMMA
                    {
                    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleoperator3531); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1496:1: entryRuleunary_operator returns [String current=null] : iv_ruleunary_operator= ruleunary_operator EOF ;
    public final String entryRuleunary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_operator = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1497:2: (iv_ruleunary_operator= ruleunary_operator EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1498:2: iv_ruleunary_operator= ruleunary_operator EOF
            {
             newCompositeNode(grammarAccess.getUnary_operatorRule()); 
            pushFollow(FOLLOW_ruleunary_operator_in_entryRuleunary_operator3577);
            iv_ruleunary_operator=ruleunary_operator();

            state._fsp--;

             current =iv_ruleunary_operator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_operator3588); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1505:1: ruleunary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleunary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1508:28: ( (kw= '-' | kw= '+' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1509:1: (kw= '-' | kw= '+' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1509:1: (kw= '-' | kw= '+' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            else if ( (LA38_0==32) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1510:2: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleunary_operator3626); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1517:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleunary_operator3645); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1530:1: entryRuleexpr returns [EObject current=null] : iv_ruleexpr= ruleexpr EOF ;
    public final EObject entryRuleexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1534:2: (iv_ruleexpr= ruleexpr EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1535:2: iv_ruleexpr= ruleexpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr3691);
            iv_ruleexpr=ruleexpr();

            state._fsp--;

             current =iv_ruleexpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr3701); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1545:1: ruleexpr returns [EObject current=null] : ( ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )* ) ;
    public final EObject ruleexpr() throws RecognitionException {
        EObject current = null;

        EObject lv_termGroups_0_0 = null;

        EObject lv_termGroups_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1549:28: ( ( ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1550:1: ( ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1550:1: ( ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1550:2: ( (lv_termGroups_0_0= ruletermGroup ) ) ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1550:2: ( (lv_termGroups_0_0= ruletermGroup ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1551:1: (lv_termGroups_0_0= ruletermGroup )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1551:1: (lv_termGroups_0_0= ruletermGroup )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1552:3: lv_termGroups_0_0= ruletermGroup
            {
             
            	        newCompositeNode(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruletermGroup_in_ruleexpr3751);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1568:2: ( ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_COMMA||LA39_0==34) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1569:5: ruleoperator ( (lv_termGroups_2_0= ruletermGroup ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getExprAccess().getOperatorParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleoperator_in_ruleexpr3768);
            	    ruleoperator();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1576:1: ( (lv_termGroups_2_0= ruletermGroup ) )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1577:1: (lv_termGroups_2_0= ruletermGroup )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1577:1: (lv_termGroups_2_0= ruletermGroup )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1578:3: lv_termGroups_2_0= ruletermGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAccess().getTermGroupsTermGroupParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletermGroup_in_ruleexpr3788);
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
            	    break loop39;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1605:1: entryRuletermGroup returns [EObject current=null] : iv_ruletermGroup= ruletermGroup EOF ;
    public final EObject entryRuletermGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermGroup = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1606:2: (iv_ruletermGroup= ruletermGroup EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1607:2: iv_ruletermGroup= ruletermGroup EOF
            {
             newCompositeNode(grammarAccess.getTermGroupRule()); 
            pushFollow(FOLLOW_ruletermGroup_in_entryRuletermGroup3830);
            iv_ruletermGroup=ruletermGroup();

            state._fsp--;

             current =iv_ruletermGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletermGroup3840); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1614:1: ruletermGroup returns [EObject current=null] : ( (lv_terms_0_0= ruleterm ) )+ ;
    public final EObject ruletermGroup() throws RecognitionException {
        EObject current = null;

        EObject lv_terms_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1617:28: ( ( (lv_terms_0_0= ruleterm ) )+ )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1618:1: ( (lv_terms_0_0= ruleterm ) )+
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1618:1: ( (lv_terms_0_0= ruleterm ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_IDENT)||LA40_0==RULE_HASH||(LA40_0>=RULE_INTEGER && LA40_0<=RULE_REAL)||(LA40_0>=31 && LA40_0<=32)||LA40_0==37) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1619:1: (lv_terms_0_0= ruleterm )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1619:1: (lv_terms_0_0= ruleterm )
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1620:3: lv_terms_0_0= ruleterm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermGroupAccess().getTermsTermParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleterm_in_ruletermGroup3885);
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
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1644:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1645:2: (iv_ruleterm= ruleterm EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1646:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm3921);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm3931); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1653:1: ruleterm returns [EObject current=null] : ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= rulecss_property ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1656:28: ( ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= rulecss_property ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1657:1: ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= rulecss_property ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1657:1: ( ( (lv_number_0_0= rulenumberTerm ) ) | ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_identifier_2_0= rulecss_property ) ) | ( (lv_url_3_0= ruleURLType ) ) | ( (lv_function_4_0= rulefunction ) ) | ( (lv_hexColor_5_0= ruleHexColor ) ) )
            int alt41=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==RULE_IDENT) ) {
                    int LA41_4 = input.LA(3);

                    if ( (LA41_4==EOF||(LA41_4>=RULE_STRING && LA41_4<=RULE_HASH)||(LA41_4>=RULE_INTEGER && LA41_4<=RULE_REAL)||LA41_4==16||LA41_4==22||(LA41_4>=31 && LA41_4<=32)||LA41_4==34||(LA41_4>=36 && LA41_4<=37)||LA41_4==54) ) {
                        alt41=3;
                    }
                    else if ( (LA41_4==35) ) {
                        alt41=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 4, input);

                        throw nvae;
                    }
                }
                else if ( ((LA41_1>=RULE_INTEGER && LA41_1<=RULE_REAL)) ) {
                    alt41=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
            case RULE_REAL:
            case 32:
                {
                alt41=1;
                }
                break;
            case RULE_STRING:
                {
                alt41=2;
                }
                break;
            case RULE_IDENT:
                {
                int LA41_4 = input.LA(2);

                if ( (LA41_4==EOF||(LA41_4>=RULE_STRING && LA41_4<=RULE_HASH)||(LA41_4>=RULE_INTEGER && LA41_4<=RULE_REAL)||LA41_4==16||LA41_4==22||(LA41_4>=31 && LA41_4<=32)||LA41_4==34||(LA41_4>=36 && LA41_4<=37)||LA41_4==54) ) {
                    alt41=3;
                }
                else if ( (LA41_4==35) ) {
                    alt41=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 4, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt41=4;
                }
                break;
            case RULE_HASH:
                {
                alt41=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1657:2: ( (lv_number_0_0= rulenumberTerm ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1657:2: ( (lv_number_0_0= rulenumberTerm ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1658:1: (lv_number_0_0= rulenumberTerm )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1658:1: (lv_number_0_0= rulenumberTerm )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1659:3: lv_number_0_0= rulenumberTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getNumberNumberTermParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulenumberTerm_in_ruleterm3977);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1676:6: ( (lv_stringValue_1_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1676:6: ( (lv_stringValue_1_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1677:1: (lv_stringValue_1_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1677:1: (lv_stringValue_1_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1678:3: lv_stringValue_1_0= RULE_STRING
                    {
                    lv_stringValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleterm4000); 

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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1695:6: ( (lv_identifier_2_0= rulecss_property ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1695:6: ( (lv_identifier_2_0= rulecss_property ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1696:1: (lv_identifier_2_0= rulecss_property )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1696:1: (lv_identifier_2_0= rulecss_property )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1697:3: lv_identifier_2_0= rulecss_property
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getIdentifierCss_propertyParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulecss_property_in_ruleterm4032);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1714:6: ( (lv_url_3_0= ruleURLType ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1714:6: ( (lv_url_3_0= ruleURLType ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1715:1: (lv_url_3_0= ruleURLType )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1715:1: (lv_url_3_0= ruleURLType )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1716:3: lv_url_3_0= ruleURLType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getUrlURLTypeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleURLType_in_ruleterm4059);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1733:6: ( (lv_function_4_0= rulefunction ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1733:6: ( (lv_function_4_0= rulefunction ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1734:1: (lv_function_4_0= rulefunction )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1734:1: (lv_function_4_0= rulefunction )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1735:3: lv_function_4_0= rulefunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getFunctionFunctionParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_in_ruleterm4086);
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
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1752:6: ( (lv_hexColor_5_0= ruleHexColor ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1752:6: ( (lv_hexColor_5_0= ruleHexColor ) )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1753:1: (lv_hexColor_5_0= ruleHexColor )
                    {
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1753:1: (lv_hexColor_5_0= ruleHexColor )
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1754:3: lv_hexColor_5_0= ruleHexColor
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getHexColorHexColorParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHexColor_in_ruleterm4113);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1778:1: entryRulenumberTerm returns [String current=null] : iv_rulenumberTerm= rulenumberTerm EOF ;
    public final String entryRulenumberTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumberTerm = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1782:2: (iv_rulenumberTerm= rulenumberTerm EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1783:2: iv_rulenumberTerm= rulenumberTerm EOF
            {
             newCompositeNode(grammarAccess.getNumberTermRule()); 
            pushFollow(FOLLOW_rulenumberTerm_in_entryRulenumberTerm4156);
            iv_rulenumberTerm=rulenumberTerm();

            state._fsp--;

             current =iv_rulenumberTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumberTerm4167); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1793:1: rulenumberTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1797:28: ( ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1798:1: ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1798:1: ( (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1798:2: (this_unary_operator_0= ruleunary_operator )? (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1798:2: (this_unary_operator_0= ruleunary_operator )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=31 && LA42_0<=32)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1799:5: this_unary_operator_0= ruleunary_operator
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getUnary_operatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleunary_operator_in_rulenumberTerm4219);
                    this_unary_operator_0=ruleunary_operator();

                    state._fsp--;


                    		current.merge(this_unary_operator_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1809:3: (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )
            int alt43=8;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1810:5: this_NUMBER_1= ruleNUMBER
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getNUMBERParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_in_rulenumberTerm4249);
                    this_NUMBER_1=ruleNUMBER();

                    state._fsp--;


                    		current.merge(this_NUMBER_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1822:5: this_PERCENTAGE_2= rulePERCENTAGE
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getPERCENTAGEParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulePERCENTAGE_in_rulenumberTerm4282);
                    this_PERCENTAGE_2=rulePERCENTAGE();

                    state._fsp--;


                    		current.merge(this_PERCENTAGE_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1834:5: this_LENGTH_3= ruleLENGTH
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getLENGTHParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleLENGTH_in_rulenumberTerm4315);
                    this_LENGTH_3=ruleLENGTH();

                    state._fsp--;


                    		current.merge(this_LENGTH_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1846:5: this_EMS_4= ruleEMS
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getEMSParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleEMS_in_rulenumberTerm4348);
                    this_EMS_4=ruleEMS();

                    state._fsp--;


                    		current.merge(this_EMS_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1858:5: this_EXS_5= ruleEXS
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getEXSParserRuleCall_1_4()); 
                        
                    pushFollow(FOLLOW_ruleEXS_in_rulenumberTerm4381);
                    this_EXS_5=ruleEXS();

                    state._fsp--;


                    		current.merge(this_EXS_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1870:5: this_ANGLE_6= ruleANGLE
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getANGLEParserRuleCall_1_5()); 
                        
                    pushFollow(FOLLOW_ruleANGLE_in_rulenumberTerm4414);
                    this_ANGLE_6=ruleANGLE();

                    state._fsp--;


                    		current.merge(this_ANGLE_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1882:5: this_TIME_7= ruleTIME
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getTIMEParserRuleCall_1_6()); 
                        
                    pushFollow(FOLLOW_ruleTIME_in_rulenumberTerm4447);
                    this_TIME_7=ruleTIME();

                    state._fsp--;


                    		current.merge(this_TIME_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1894:5: this_FREQ_8= ruleFREQ
                    {
                     
                            newCompositeNode(grammarAccess.getNumberTermAccess().getFREQParserRuleCall_1_7()); 
                        
                    pushFollow(FOLLOW_ruleFREQ_in_rulenumberTerm4480);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1915:1: entryRulenum returns [String current=null] : iv_rulenum= rulenum EOF ;
    public final String entryRulenum() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenum = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1916:2: (iv_rulenum= rulenum EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1917:2: iv_rulenum= rulenum EOF
            {
             newCompositeNode(grammarAccess.getNumRule()); 
            pushFollow(FOLLOW_rulenum_in_entryRulenum4531);
            iv_rulenum=rulenum();

            state._fsp--;

             current =iv_rulenum.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenum4542); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1924:1: rulenum returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_integer_0= RULE_INTEGER | this_real_1= RULE_REAL ) ;
    public final AntlrDatatypeRuleToken rulenum() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_integer_0=null;
        Token this_real_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1927:28: ( (this_integer_0= RULE_INTEGER | this_real_1= RULE_REAL ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1928:1: (this_integer_0= RULE_INTEGER | this_real_1= RULE_REAL )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1928:1: (this_integer_0= RULE_INTEGER | this_real_1= RULE_REAL )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INTEGER) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_REAL) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1928:6: this_integer_0= RULE_INTEGER
                    {
                    this_integer_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rulenum4582); 

                    		current.merge(this_integer_0);
                        
                     
                        newLeafNode(this_integer_0, grammarAccess.getNumAccess().getIntegerTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1936:10: this_real_1= RULE_REAL
                    {
                    this_real_1=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rulenum4608); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1951:1: entryRulefunction returns [EObject current=null] : iv_rulefunction= rulefunction EOF ;
    public final EObject entryRulefunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1955:2: (iv_rulefunction= rulefunction EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1956:2: iv_rulefunction= rulefunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction4659);
            iv_rulefunction=rulefunction();

            state._fsp--;

             current =iv_rulefunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction4669); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1966:1: rulefunction returns [EObject current=null] : ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')' ) ;
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
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1970:28: ( ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1971:1: ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1971:1: ( (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1971:2: (otherlv_0= '-' )? ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' (this_WS_3= RULE_WS )* ( (lv_expression_4_0= ruleexpr ) ) (this_WS_5= RULE_WS )* otherlv_6= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1971:2: (otherlv_0= '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==31) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1971:4: otherlv_0= '-'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_31_in_rulefunction4711); 

                        	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1975:3: ( (lv_name_1_0= RULE_IDENT ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1976:1: (lv_name_1_0= RULE_IDENT )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1976:1: (lv_name_1_0= RULE_IDENT )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1977:3: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_rulefunction4730); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_rulefunction4747); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1997:1: (this_WS_3= RULE_WS )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_WS) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:1997:2: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulefunction4759); 
            	     
            	        newLeafNode(this_WS_3, grammarAccess.getFunctionAccess().getWSTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2001:3: ( (lv_expression_4_0= ruleexpr ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2002:1: (lv_expression_4_0= ruleexpr )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2002:1: (lv_expression_4_0= ruleexpr )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2003:3: lv_expression_4_0= ruleexpr
            {
             
            	        newCompositeNode(grammarAccess.getFunctionAccess().getExpressionExprParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleexpr_in_rulefunction4781);
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

            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2019:2: (this_WS_5= RULE_WS )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_WS) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2019:3: this_WS_5= RULE_WS
            	    {
            	    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulefunction4793); 
            	     
            	        newLeafNode(this_WS_5, grammarAccess.getFunctionAccess().getWSTerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_6=(Token)match(input,36,FOLLOW_36_in_rulefunction4806); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2038:1: entryRuleHexColor returns [String current=null] : iv_ruleHexColor= ruleHexColor EOF ;
    public final String entryRuleHexColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexColor = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2042:2: (iv_ruleHexColor= ruleHexColor EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2043:2: iv_ruleHexColor= ruleHexColor EOF
            {
             newCompositeNode(grammarAccess.getHexColorRule()); 
            pushFollow(FOLLOW_ruleHexColor_in_entryRuleHexColor4853);
            iv_ruleHexColor=ruleHexColor();

            state._fsp--;

             current =iv_ruleHexColor.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexColor4864); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2053:1: ruleHexColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_HASH_0= RULE_HASH ;
    public final AntlrDatatypeRuleToken ruleHexColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HASH_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2057:28: (this_HASH_0= RULE_HASH )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2058:5: this_HASH_0= RULE_HASH
            {
            this_HASH_0=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleHexColor4907); 

            		current.merge(this_HASH_0);
                
             
                newLeafNode(this_HASH_0, grammarAccess.getHexColorAccess().getHASHTerminalRuleCall()); 
                

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2076:1: entryRuleURLType returns [EObject current=null] : iv_ruleURLType= ruleURLType EOF ;
    public final EObject entryRuleURLType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLType = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2080:2: (iv_ruleURLType= ruleURLType EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2081:2: iv_ruleURLType= ruleURLType EOF
            {
             newCompositeNode(grammarAccess.getURLTypeRule()); 
            pushFollow(FOLLOW_ruleURLType_in_entryRuleURLType4961);
            iv_ruleURLType=ruleURLType();

            state._fsp--;

             current =iv_ruleURLType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURLType4971); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2091:1: ruleURLType returns [EObject current=null] : (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleURLType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2095:28: ( (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2096:1: (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2096:1: (otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2096:3: otherlv_0= 'url' otherlv_1= '(' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleURLType5012); 

                	newLeafNode(otherlv_0, grammarAccess.getURLTypeAccess().getUrlKeyword_0());
                
            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleURLType5024); 

                	newLeafNode(otherlv_1, grammarAccess.getURLTypeAccess().getLeftParenthesisKeyword_1());
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2104:1: ( (lv_url_2_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2105:1: (lv_url_2_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2105:1: (lv_url_2_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2106:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleURLType5041); 

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

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleURLType5058); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2137:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2138:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2139:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER5099);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER5110); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2146:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_num_0= rulenum ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2149:28: (this_num_0= rulenum )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2151:5: this_num_0= rulenum
            {
             
                    newCompositeNode(grammarAccess.getNUMBERAccess().getNumParserRuleCall()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleNUMBER5156);
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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2169:1: entryRulePERCENTAGE returns [String current=null] : iv_rulePERCENTAGE= rulePERCENTAGE EOF ;
    public final String entryRulePERCENTAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePERCENTAGE = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2170:2: (iv_rulePERCENTAGE= rulePERCENTAGE EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2171:2: iv_rulePERCENTAGE= rulePERCENTAGE EOF
            {
             newCompositeNode(grammarAccess.getPERCENTAGERule()); 
            pushFollow(FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE5201);
            iv_rulePERCENTAGE=rulePERCENTAGE();

            state._fsp--;

             current =iv_rulePERCENTAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePERCENTAGE5212); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2178:1: rulePERCENTAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= '%' ) ;
    public final AntlrDatatypeRuleToken rulePERCENTAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2181:28: ( (this_num_0= rulenum kw= '%' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2182:1: (this_num_0= rulenum kw= '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2182:1: (this_num_0= rulenum kw= '%' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2183:5: this_num_0= rulenum kw= '%'
            {
             
                    newCompositeNode(grammarAccess.getPERCENTAGEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_rulePERCENTAGE5259);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,38,FOLLOW_38_in_rulePERCENTAGE5277); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2207:1: entryRuleEMS returns [String current=null] : iv_ruleEMS= ruleEMS EOF ;
    public final String entryRuleEMS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMS = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2208:2: (iv_ruleEMS= ruleEMS EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2209:2: iv_ruleEMS= ruleEMS EOF
            {
             newCompositeNode(grammarAccess.getEMSRule()); 
            pushFollow(FOLLOW_ruleEMS_in_entryRuleEMS5318);
            iv_ruleEMS=ruleEMS();

            state._fsp--;

             current =iv_ruleEMS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEMS5329); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2216:1: ruleEMS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= 'em' ) ;
    public final AntlrDatatypeRuleToken ruleEMS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2219:28: ( (this_num_0= rulenum kw= 'em' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2220:1: (this_num_0= rulenum kw= 'em' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2220:1: (this_num_0= rulenum kw= 'em' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2221:5: this_num_0= rulenum kw= 'em'
            {
             
                    newCompositeNode(grammarAccess.getEMSAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleEMS5376);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,39,FOLLOW_39_in_ruleEMS5394); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2245:1: entryRuleEXS returns [String current=null] : iv_ruleEXS= ruleEXS EOF ;
    public final String entryRuleEXS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXS = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2246:2: (iv_ruleEXS= ruleEXS EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2247:2: iv_ruleEXS= ruleEXS EOF
            {
             newCompositeNode(grammarAccess.getEXSRule()); 
            pushFollow(FOLLOW_ruleEXS_in_entryRuleEXS5435);
            iv_ruleEXS=ruleEXS();

            state._fsp--;

             current =iv_ruleEXS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXS5446); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2254:1: ruleEXS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum kw= 'ex' ) ;
    public final AntlrDatatypeRuleToken ruleEXS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2257:28: ( (this_num_0= rulenum kw= 'ex' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2258:1: (this_num_0= rulenum kw= 'ex' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2258:1: (this_num_0= rulenum kw= 'ex' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2259:5: this_num_0= rulenum kw= 'ex'
            {
             
                    newCompositeNode(grammarAccess.getEXSAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleEXS5493);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,40,FOLLOW_40_in_ruleEXS5511); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2283:1: entryRuleLENGTH returns [String current=null] : iv_ruleLENGTH= ruleLENGTH EOF ;
    public final String entryRuleLENGTH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLENGTH = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2287:2: (iv_ruleLENGTH= ruleLENGTH EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2288:2: iv_ruleLENGTH= ruleLENGTH EOF
            {
             newCompositeNode(grammarAccess.getLENGTHRule()); 
            pushFollow(FOLLOW_ruleLENGTH_in_entryRuleLENGTH5558);
            iv_ruleLENGTH=ruleLENGTH();

            state._fsp--;

             current =iv_ruleLENGTH.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLENGTH5569); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2298:1: ruleLENGTH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) ) ;
    public final AntlrDatatypeRuleToken ruleLENGTH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2302:28: ( (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2303:1: (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2303:1: (this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2304:5: this_num_0= rulenum (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' )
            {
             
                    newCompositeNode(grammarAccess.getLENGTHAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleLENGTH5620);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2314:1: (kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' )
            int alt48=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt48=1;
                }
                break;
            case 42:
                {
                alt48=2;
                }
                break;
            case 43:
                {
                alt48=3;
                }
                break;
            case 44:
                {
                alt48=4;
                }
                break;
            case 45:
                {
                alt48=5;
                }
                break;
            case 46:
                {
                alt48=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2315:2: kw= 'px'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleLENGTH5639); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPxKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2322:2: kw= 'cm'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleLENGTH5658); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getCmKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2329:2: kw= 'mm'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleLENGTH5677); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getMmKeyword_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2336:2: kw= 'in'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleLENGTH5696); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getInKeyword_1_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2343:2: kw= 'pt'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleLENGTH5715); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLENGTHAccess().getPtKeyword_1_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2350:2: kw= 'pc'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleLENGTH5734); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2366:1: entryRuleANGLE returns [String current=null] : iv_ruleANGLE= ruleANGLE EOF ;
    public final String entryRuleANGLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANGLE = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2367:2: (iv_ruleANGLE= ruleANGLE EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2368:2: iv_ruleANGLE= ruleANGLE EOF
            {
             newCompositeNode(grammarAccess.getANGLERule()); 
            pushFollow(FOLLOW_ruleANGLE_in_entryRuleANGLE5780);
            iv_ruleANGLE=ruleANGLE();

            state._fsp--;

             current =iv_ruleANGLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleANGLE5791); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2375:1: ruleANGLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) ) ;
    public final AntlrDatatypeRuleToken ruleANGLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2378:28: ( (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2379:1: (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2379:1: (this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2380:5: this_num_0= rulenum (kw= 'deg' | kw= 'rad' | kw= 'grad' )
            {
             
                    newCompositeNode(grammarAccess.getANGLEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleANGLE5838);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2390:1: (kw= 'deg' | kw= 'rad' | kw= 'grad' )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt49=1;
                }
                break;
            case 48:
                {
                alt49=2;
                }
                break;
            case 49:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2391:2: kw= 'deg'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleANGLE5857); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getDegKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2398:2: kw= 'rad'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleANGLE5876); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getANGLEAccess().getRadKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2405:2: kw= 'grad'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleANGLE5895); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2418:1: entryRuleTIME returns [String current=null] : iv_ruleTIME= ruleTIME EOF ;
    public final String entryRuleTIME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTIME = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2419:2: (iv_ruleTIME= ruleTIME EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2420:2: iv_ruleTIME= ruleTIME EOF
            {
             newCompositeNode(grammarAccess.getTIMERule()); 
            pushFollow(FOLLOW_ruleTIME_in_entryRuleTIME5937);
            iv_ruleTIME=ruleTIME();

            state._fsp--;

             current =iv_ruleTIME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTIME5948); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2427:1: ruleTIME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'ms' | kw= 's' ) ) ;
    public final AntlrDatatypeRuleToken ruleTIME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2430:28: ( (this_num_0= rulenum (kw= 'ms' | kw= 's' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2431:1: (this_num_0= rulenum (kw= 'ms' | kw= 's' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2431:1: (this_num_0= rulenum (kw= 'ms' | kw= 's' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2432:5: this_num_0= rulenum (kw= 'ms' | kw= 's' )
            {
             
                    newCompositeNode(grammarAccess.getTIMEAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleTIME5995);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2442:1: (kw= 'ms' | kw= 's' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==50) ) {
                alt50=1;
            }
            else if ( (LA50_0==51) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2443:2: kw= 'ms'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleTIME6014); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTIMEAccess().getMsKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2450:2: kw= 's'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleTIME6033); 

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2463:1: entryRuleFREQ returns [String current=null] : iv_ruleFREQ= ruleFREQ EOF ;
    public final String entryRuleFREQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFREQ = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2464:2: (iv_ruleFREQ= ruleFREQ EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2465:2: iv_ruleFREQ= ruleFREQ EOF
            {
             newCompositeNode(grammarAccess.getFREQRule()); 
            pushFollow(FOLLOW_ruleFREQ_in_entryRuleFREQ6075);
            iv_ruleFREQ=ruleFREQ();

            state._fsp--;

             current =iv_ruleFREQ.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFREQ6086); 

            }

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
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2472:1: ruleFREQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) ) ;
    public final AntlrDatatypeRuleToken ruleFREQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_num_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2475:28: ( (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2476:1: (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2476:1: (this_num_0= rulenum (kw= 'hz' | kw= 'khz' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2477:5: this_num_0= rulenum (kw= 'hz' | kw= 'khz' )
            {
             
                    newCompositeNode(grammarAccess.getFREQAccess().getNumParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulenum_in_ruleFREQ6133);
            this_num_0=rulenum();

            state._fsp--;


            		current.merge(this_num_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2487:1: (kw= 'hz' | kw= 'khz' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==52) ) {
                alt51=1;
            }
            else if ( (LA51_0==53) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2488:2: kw= 'hz'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleFREQ6152); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFREQAccess().getHzKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2495:2: kw= 'khz'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleFREQ6171); 

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


    // $ANTLR start "entryRuleIMPORTANT_SYM"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2508:1: entryRuleIMPORTANT_SYM returns [String current=null] : iv_ruleIMPORTANT_SYM= ruleIMPORTANT_SYM EOF ;
    public final String entryRuleIMPORTANT_SYM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMPORTANT_SYM = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2509:2: (iv_ruleIMPORTANT_SYM= ruleIMPORTANT_SYM EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2510:2: iv_ruleIMPORTANT_SYM= ruleIMPORTANT_SYM EOF
            {
             newCompositeNode(grammarAccess.getIMPORTANT_SYMRule()); 
            pushFollow(FOLLOW_ruleIMPORTANT_SYM_in_entryRuleIMPORTANT_SYM6213);
            iv_ruleIMPORTANT_SYM=ruleIMPORTANT_SYM();

            state._fsp--;

             current =iv_ruleIMPORTANT_SYM.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIMPORTANT_SYM6224); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIMPORTANT_SYM"


    // $ANTLR start "ruleIMPORTANT_SYM"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2517:1: ruleIMPORTANT_SYM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!important' ;
    public final AntlrDatatypeRuleToken ruleIMPORTANT_SYM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2520:28: (kw= '!important' )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2522:2: kw= '!important'
            {
            kw=(Token)match(input,54,FOLLOW_54_in_ruleIMPORTANT_SYM6261); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIMPORTANT_SYMAccess().getImportantKeyword()); 
                

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
    // $ANTLR end "ruleIMPORTANT_SYM"


    // $ANTLR start "entryRuleReservedWords"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2535:1: entryRuleReservedWords returns [String current=null] : iv_ruleReservedWords= ruleReservedWords EOF ;
    public final String entryRuleReservedWords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReservedWords = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2536:2: (iv_ruleReservedWords= ruleReservedWords EOF )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2537:2: iv_ruleReservedWords= ruleReservedWords EOF
            {
             newCompositeNode(grammarAccess.getReservedWordsRule()); 
            pushFollow(FOLLOW_ruleReservedWords_in_entryRuleReservedWords6301);
            iv_ruleReservedWords=ruleReservedWords();

            state._fsp--;

             current =iv_ruleReservedWords.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReservedWords6312); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReservedWords"


    // $ANTLR start "ruleReservedWords"
    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2544:1: ruleReservedWords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'em' | kw= 'ex' | kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' | kw= 'deg' | kw= 'rad' | kw= 'grad' | kw= 'ms' | kw= 's' | kw= 'hz' | kw= 'khz' ) ;
    public final AntlrDatatypeRuleToken ruleReservedWords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2547:28: ( (kw= 'em' | kw= 'ex' | kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' | kw= 'deg' | kw= 'rad' | kw= 'grad' | kw= 'ms' | kw= 's' | kw= 'hz' | kw= 'khz' ) )
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2548:1: (kw= 'em' | kw= 'ex' | kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' | kw= 'deg' | kw= 'rad' | kw= 'grad' | kw= 'ms' | kw= 's' | kw= 'hz' | kw= 'khz' )
            {
            // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2548:1: (kw= 'em' | kw= 'ex' | kw= 'px' | kw= 'cm' | kw= 'mm' | kw= 'in' | kw= 'pt' | kw= 'pc' | kw= 'deg' | kw= 'rad' | kw= 'grad' | kw= 'ms' | kw= 's' | kw= 'hz' | kw= 'khz' )
            int alt52=15;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt52=1;
                }
                break;
            case 40:
                {
                alt52=2;
                }
                break;
            case 41:
                {
                alt52=3;
                }
                break;
            case 42:
                {
                alt52=4;
                }
                break;
            case 43:
                {
                alt52=5;
                }
                break;
            case 44:
                {
                alt52=6;
                }
                break;
            case 45:
                {
                alt52=7;
                }
                break;
            case 46:
                {
                alt52=8;
                }
                break;
            case 47:
                {
                alt52=9;
                }
                break;
            case 48:
                {
                alt52=10;
                }
                break;
            case 49:
                {
                alt52=11;
                }
                break;
            case 50:
                {
                alt52=12;
                }
                break;
            case 51:
                {
                alt52=13;
                }
                break;
            case 52:
                {
                alt52=14;
                }
                break;
            case 53:
                {
                alt52=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2549:2: kw= 'em'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleReservedWords6350); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getEmKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2556:2: kw= 'ex'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleReservedWords6369); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getExKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2563:2: kw= 'px'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleReservedWords6388); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getPxKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2570:2: kw= 'cm'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleReservedWords6407); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getCmKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2577:2: kw= 'mm'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleReservedWords6426); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getMmKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2584:2: kw= 'in'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleReservedWords6445); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getInKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2591:2: kw= 'pt'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleReservedWords6464); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getPtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2598:2: kw= 'pc'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleReservedWords6483); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getPcKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2605:2: kw= 'deg'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleReservedWords6502); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getDegKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2612:2: kw= 'rad'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleReservedWords6521); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getRadKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2619:2: kw= 'grad'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleReservedWords6540); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getGradKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2626:2: kw= 'ms'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleReservedWords6559); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getMsKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2633:2: kw= 's'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleReservedWords6578); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getSKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2640:2: kw= 'hz'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleReservedWords6597); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getHzKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../at.bestsolution.efxclipse.tooling.css/src-gen/at/bestsolution/efxclipse/tooling/css/parser/antlr/internal/InternalCssDsl.g:2647:2: kw= 'khz'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleReservedWords6616); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReservedWordsAccess().getKhzKeyword_14()); 
                        

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
    // $ANTLR end "ruleReservedWords"

    // Delegated rules


    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA43_eotS =
        "\13\uffff";
    static final String DFA43_eofS =
        "\1\uffff\2\11\10\uffff";
    static final String DFA43_minS =
        "\1\13\2\4\10\uffff";
    static final String DFA43_maxS =
        "\1\14\2\66\10\uffff";
    static final String DFA43_acceptS =
        "\3\uffff\1\10\1\6\1\4\1\3\1\7\1\5\1\1\1\2";
    static final String DFA43_specialS =
        "\13\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1\1\2",
            "\5\11\2\uffff\2\11\3\uffff\1\11\5\uffff\1\11\10\uffff\2\11"+
            "\1\uffff\1\11\1\uffff\2\11\1\12\1\5\1\10\6\6\3\4\2\7\2\3\1\11",
            "\5\11\2\uffff\2\11\3\uffff\1\11\5\uffff\1\11\10\uffff\2\11"+
            "\1\uffff\1\11\1\uffff\2\11\1\12\1\5\1\10\6\6\3\4\2\7\2\3\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1809:3: (this_NUMBER_1= ruleNUMBER | this_PERCENTAGE_2= rulePERCENTAGE | this_LENGTH_3= ruleLENGTH | this_EMS_4= ruleEMS | this_EXS_5= ruleEXS | this_ANGLE_6= ruleANGLE | this_TIME_7= ruleTIME | this_FREQ_8= ruleFREQ )";
        }
    }
 

    public static final BitSet FOLLOW_rulestylesheet_in_entryRulestylesheet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestylesheet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecharset_in_rulestylesheet131 = new BitSet(new long[]{0x003FFFA01F9E0122L});
    public static final BitSet FOLLOW_ruleimportExpression_in_rulestylesheet153 = new BitSet(new long[]{0x003FFFA01F9E0122L});
    public static final BitSet FOLLOW_ruleruleset_in_rulestylesheet176 = new BitSet(new long[]{0x003FFF801F980122L});
    public static final BitSet FOLLOW_rulemedia_in_rulestylesheet203 = new BitSet(new long[]{0x003FFF801F980122L});
    public static final BitSet FOLLOW_rulepage_in_rulestylesheet230 = new BitSet(new long[]{0x003FFF801F980122L});
    public static final BitSet FOLLOW_rulecharset_in_entryRulecharset268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecharset278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulecharset316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15_in_rulecharset334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulecharset352 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulecharset369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleimportExpression_in_entryRuleimportExpression405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleimportExpression415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleimportExpression454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18_in_ruleimportExpression472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleimportExpression490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleimportExpression525 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_rulemedia_list_in_ruleimportExpression545 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleimportExpression558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepage_in_entryRulepage595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepage605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulepage652 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_20_in_rulepage670 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rulepseudo_page_in_rulepage692 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulepage705 = new BitSet(new long[]{0x0000000080410020L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_rulepage726 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16_in_rulepage740 = new BitSet(new long[]{0x0000000080410020L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_rulepage761 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_rulepage776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepseudo_page_in_entryRulepseudo_page813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepseudo_page824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulepseudo_page862 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulepseudo_page877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_in_entryRulemedia922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulemedia970 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25_in_rulemedia988 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulemedia_list_in_rulemedia1010 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulemedia1022 = new BitSet(new long[]{0x003FFF801CC00120L});
    public static final BitSet FOLLOW_ruleruleset_in_rulemedia1043 = new BitSet(new long[]{0x003FFF801CC00120L});
    public static final BitSet FOLLOW_22_in_rulemedia1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedia_list_in_entryRulemedia_list1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedia_list1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemedium_in_rulemedia_list1151 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rulemedia_list1172 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulemedium_in_rulemedia_list1199 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rulemedium_in_entryRulemedium1247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemedium1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulemedium1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleset_in_entryRuleruleset1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleset1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1397 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleruleset1409 = new BitSet(new long[]{0x003FFF801C800120L});
    public static final BitSet FOLLOW_ruleselector_in_ruleruleset1429 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_21_in_ruleruleset1443 = new BitSet(new long[]{0x0000000080400020L});
    public static final BitSet FOLLOW_rulecss_declaration_in_ruleruleset1465 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleset1477 = new BitSet(new long[]{0x0000000080400020L});
    public static final BitSet FOLLOW_22_in_ruleruleset1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleselector_in_entryRuleselector1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleselector1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_ruleselector1593 = new BitSet(new long[]{0x0000000300000082L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1616 = new BitSet(new long[]{0x003FFF801C800120L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleselector1657 = new BitSet(new long[]{0x003FFF831C8001A2L});
    public static final BitSet FOLLOW_rulecombinator_in_ruleselector1680 = new BitSet(new long[]{0x003FFF801C800120L});
    public static final BitSet FOLLOW_ruleselector_in_ruleselector1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_selector_in_entryRulesimple_selector1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_selector1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_name_in_rulesimple_selector1804 = new BitSet(new long[]{0x003FFF801C800122L});
    public static final BitSet FOLLOW_rulesub_selector_in_rulesimple_selector1825 = new BitSet(new long[]{0x003FFF801C800122L});
    public static final BitSet FOLLOW_rulesub_selector_in_rulesimple_selector1854 = new BitSet(new long[]{0x003FFF801C800122L});
    public static final BitSet FOLLOW_ruleelement_name_in_entryRuleelement_name1892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement_name1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleelement_name1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_ruleelement_name1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleelement_name2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesub_selector_in_entryRulesub_selector2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesub_selector2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_rulesub_selector2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_rulesub_selector2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_rulesub_selector2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_rulesub_selector2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_class_in_entryRulecss_class2214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_class2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulecss_class2263 = new BitSet(new long[]{0x003FFF8000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_class2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rulecss_class2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_id_in_entryRulecss_id2359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_id2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_rulecss_id2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_attrib_in_entryRulecss_attrib2454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_attrib2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulecss_attrib2503 = new BitSet(new long[]{0x003FFF8000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_attrib2519 = new BitSet(new long[]{0x0000000060000600L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rulecss_attrib2552 = new BitSet(new long[]{0x0000000060000600L});
    public static final BitSet FOLLOW_29_in_rulecss_attrib2573 = new BitSet(new long[]{0x003FFF8000000030L});
    public static final BitSet FOLLOW_RULE_INCLUDES_in_rulecss_attrib2594 = new BitSet(new long[]{0x003FFF8000000030L});
    public static final BitSet FOLLOW_RULE_DASHMATCH_in_rulecss_attrib2620 = new BitSet(new long[]{0x003FFF8000000030L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_attrib2643 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleReservedWords_in_rulecss_attrib2676 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulecss_attrib2703 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulecss_attrib2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_declaration_in_entryRulecss_declaration2764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_declaration2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_rulecss_declaration2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_generic_declaration_in_entryRulecss_generic_declaration2854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_generic_declaration2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_rulecss_generic_declaration2910 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulecss_generic_declaration2922 = new BitSet(new long[]{0x0000002180061930L});
    public static final BitSet FOLLOW_ruleexpr_in_rulecss_generic_declaration2943 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rulecss_prio_in_rulecss_generic_declaration2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_prio_in_entryRulecss_prio3002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_prio3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIMPORTANT_SYM_in_rulecss_prio3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_entryRulecss_property3104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_property3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulecss_property3154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_property3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_pseudo_in_entryRulecss_pseudo3217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecss_pseudo3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulecss_pseudo3266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulecss_pseudo3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecombinator_in_entryRulecombinator3327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecombinator3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulecombinator3377 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_33_in_rulecombinator3396 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_WS_in_rulecombinator3413 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleoperator_in_entryRuleoperator3461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoperator3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleoperator3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleoperator3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator3577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleunary_operator3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleunary_operator3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr3691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermGroup_in_ruleexpr3751 = new BitSet(new long[]{0x0000000400000042L});
    public static final BitSet FOLLOW_ruleoperator_in_ruleexpr3768 = new BitSet(new long[]{0x0000002180061930L});
    public static final BitSet FOLLOW_ruletermGroup_in_ruleexpr3788 = new BitSet(new long[]{0x0000000400000042L});
    public static final BitSet FOLLOW_ruletermGroup_in_entryRuletermGroup3830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermGroup3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_ruletermGroup3885 = new BitSet(new long[]{0x0000002180061932L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm3921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_ruleterm3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleterm4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecss_property_in_ruleterm4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_ruleterm4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_ruleterm4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_ruleterm4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumberTerm_in_entryRulenumberTerm4156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumberTerm4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_operator_in_rulenumberTerm4219 = new BitSet(new long[]{0x0000000180001800L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rulenumberTerm4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_rulenumberTerm4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_rulenumberTerm4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_rulenumberTerm4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_rulenumberTerm4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_rulenumberTerm4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_rulenumberTerm4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_rulenumberTerm4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_entryRulenum4531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenum4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rulenum4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rulenum4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction4659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulefunction4711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_rulefunction4730 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_rulefunction4747 = new BitSet(new long[]{0x00000021800619B0L});
    public static final BitSet FOLLOW_RULE_WS_in_rulefunction4759 = new BitSet(new long[]{0x00000021800619B0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulefunction4781 = new BitSet(new long[]{0x0000001000000080L});
    public static final BitSet FOLLOW_RULE_WS_in_rulefunction4793 = new BitSet(new long[]{0x0000001000000080L});
    public static final BitSet FOLLOW_36_in_rulefunction4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexColor_in_entryRuleHexColor4853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexColor4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleHexColor4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURLType_in_entryRuleURLType4961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURLType4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleURLType5012 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleURLType5024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleURLType5041 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleURLType5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER5099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleNUMBER5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENTAGE_in_entryRulePERCENTAGE5201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePERCENTAGE5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_rulePERCENTAGE5259 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulePERCENTAGE5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEMS_in_entryRuleEMS5318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEMS5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleEMS5376 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEMS5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXS_in_entryRuleEXS5435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXS5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleEXS5493 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEXS5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLENGTH_in_entryRuleLENGTH5558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLENGTH5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleLENGTH5620 = new BitSet(new long[]{0x00007E0000000000L});
    public static final BitSet FOLLOW_41_in_ruleLENGTH5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLENGTH5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleLENGTH5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleLENGTH5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLENGTH5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLENGTH5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANGLE_in_entryRuleANGLE5780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANGLE5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleANGLE5838 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_47_in_ruleANGLE5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleANGLE5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleANGLE5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTIME_in_entryRuleTIME5937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTIME5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleTIME5995 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_50_in_ruleTIME6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTIME6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFREQ_in_entryRuleFREQ6075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFREQ6086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenum_in_ruleFREQ6133 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_ruleFREQ6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleFREQ6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIMPORTANT_SYM_in_entryRuleIMPORTANT_SYM6213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIMPORTANT_SYM6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleIMPORTANT_SYM6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReservedWords_in_entryRuleReservedWords6301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReservedWords6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleReservedWords6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleReservedWords6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleReservedWords6388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleReservedWords6407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleReservedWords6426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleReservedWords6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleReservedWords6464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleReservedWords6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleReservedWords6502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleReservedWords6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleReservedWords6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleReservedWords6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleReservedWords6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleReservedWords6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleReservedWords6616 = new BitSet(new long[]{0x0000000000000002L});

}