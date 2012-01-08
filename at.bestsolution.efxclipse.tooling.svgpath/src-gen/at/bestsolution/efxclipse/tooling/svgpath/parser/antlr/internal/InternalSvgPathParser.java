package at.bestsolution.efxclipse.tooling.svgpath.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.efxclipse.tooling.svgpath.services.SvgPathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgPathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WSP", "'M'", "'m'", "'Z'", "'z'", "'L'", "'l'", "'H'", "'h'", "'V'", "'v'", "'C'", "'c'", "'S'", "'s'", "'Q'", "'q'", "'T'", "'t'", "'A'", "'a'", "','", "'.'", "'e'", "'E'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'+'", "'-'"
    };
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int RULE_WSP=4;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int T__5=5;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;

    // delegates
    // delegators


        public InternalSvgPathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSvgPathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSvgPathParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g"; }



     	private SvgPathGrammarAccess grammarAccess;
     	
        public InternalSvgPathParser(TokenStream input, SvgPathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "svg_path";	
       	}
       	
       	@Override
       	protected SvgPathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulesvg_path"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:67:1: entryRulesvg_path returns [EObject current=null] : iv_rulesvg_path= rulesvg_path EOF ;
    public final EObject entryRulesvg_path() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesvg_path = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:68:2: (iv_rulesvg_path= rulesvg_path EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:69:2: iv_rulesvg_path= rulesvg_path EOF
            {
             newCompositeNode(grammarAccess.getSvg_pathRule()); 
            pushFollow(FOLLOW_rulesvg_path_in_entryRulesvg_path75);
            iv_rulesvg_path=rulesvg_path();

            state._fsp--;

             current =iv_rulesvg_path; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesvg_path85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesvg_path"


    // $ANTLR start "rulesvg_path"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:76:1: rulesvg_path returns [EObject current=null] : ( (lv_moveto_drawto_command_groups_0_0= rulemoveto_drawto_command_groups ) )? ;
    public final EObject rulesvg_path() throws RecognitionException {
        EObject current = null;

        EObject lv_moveto_drawto_command_groups_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:79:28: ( ( (lv_moveto_drawto_command_groups_0_0= rulemoveto_drawto_command_groups ) )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:80:1: ( (lv_moveto_drawto_command_groups_0_0= rulemoveto_drawto_command_groups ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:80:1: ( (lv_moveto_drawto_command_groups_0_0= rulemoveto_drawto_command_groups ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=5 && LA1_0<=6)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:81:1: (lv_moveto_drawto_command_groups_0_0= rulemoveto_drawto_command_groups )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:81:1: (lv_moveto_drawto_command_groups_0_0= rulemoveto_drawto_command_groups )
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:82:3: lv_moveto_drawto_command_groups_0_0= rulemoveto_drawto_command_groups
                    {
                     
                    	        newCompositeNode(grammarAccess.getSvg_pathAccess().getMoveto_drawto_command_groupsMoveto_drawto_command_groupsParserRuleCall_0()); 
                    	    
                    pushFollow(FOLLOW_rulemoveto_drawto_command_groups_in_rulesvg_path130);
                    lv_moveto_drawto_command_groups_0_0=rulemoveto_drawto_command_groups();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSvg_pathRule());
                    	        }
                           		set(
                           			current, 
                           			"moveto_drawto_command_groups",
                            		lv_moveto_drawto_command_groups_0_0, 
                            		"moveto_drawto_command_groups");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "rulesvg_path"


    // $ANTLR start "entryRulemoveto_drawto_command_groups"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:106:1: entryRulemoveto_drawto_command_groups returns [EObject current=null] : iv_rulemoveto_drawto_command_groups= rulemoveto_drawto_command_groups EOF ;
    public final EObject entryRulemoveto_drawto_command_groups() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemoveto_drawto_command_groups = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:107:2: (iv_rulemoveto_drawto_command_groups= rulemoveto_drawto_command_groups EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:108:2: iv_rulemoveto_drawto_command_groups= rulemoveto_drawto_command_groups EOF
            {
             newCompositeNode(grammarAccess.getMoveto_drawto_command_groupsRule()); 
            pushFollow(FOLLOW_rulemoveto_drawto_command_groups_in_entryRulemoveto_drawto_command_groups166);
            iv_rulemoveto_drawto_command_groups=rulemoveto_drawto_command_groups();

            state._fsp--;

             current =iv_rulemoveto_drawto_command_groups; 
            match(input,EOF,FOLLOW_EOF_in_entryRulemoveto_drawto_command_groups176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemoveto_drawto_command_groups"


    // $ANTLR start "rulemoveto_drawto_command_groups"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:115:1: rulemoveto_drawto_command_groups returns [EObject current=null] : ( (lv_commands_0_0= rulemoveto_drawto_command_group ) ) ;
    public final EObject rulemoveto_drawto_command_groups() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:118:28: ( ( (lv_commands_0_0= rulemoveto_drawto_command_group ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:119:1: ( (lv_commands_0_0= rulemoveto_drawto_command_group ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:119:1: ( (lv_commands_0_0= rulemoveto_drawto_command_group ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:120:1: (lv_commands_0_0= rulemoveto_drawto_command_group )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:120:1: (lv_commands_0_0= rulemoveto_drawto_command_group )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:121:3: lv_commands_0_0= rulemoveto_drawto_command_group
            {
             
            	        newCompositeNode(grammarAccess.getMoveto_drawto_command_groupsAccess().getCommandsMoveto_drawto_command_groupParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulemoveto_drawto_command_group_in_rulemoveto_drawto_command_groups221);
            lv_commands_0_0=rulemoveto_drawto_command_group();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoveto_drawto_command_groupsRule());
            	        }
                   		add(
                   			current, 
                   			"commands",
                    		lv_commands_0_0, 
                    		"moveto_drawto_command_group");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "rulemoveto_drawto_command_groups"


    // $ANTLR start "entryRulemoveto_drawto_command_group"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:145:1: entryRulemoveto_drawto_command_group returns [EObject current=null] : iv_rulemoveto_drawto_command_group= rulemoveto_drawto_command_group EOF ;
    public final EObject entryRulemoveto_drawto_command_group() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemoveto_drawto_command_group = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:146:2: (iv_rulemoveto_drawto_command_group= rulemoveto_drawto_command_group EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:147:2: iv_rulemoveto_drawto_command_group= rulemoveto_drawto_command_group EOF
            {
             newCompositeNode(grammarAccess.getMoveto_drawto_command_groupRule()); 
            pushFollow(FOLLOW_rulemoveto_drawto_command_group_in_entryRulemoveto_drawto_command_group256);
            iv_rulemoveto_drawto_command_group=rulemoveto_drawto_command_group();

            state._fsp--;

             current =iv_rulemoveto_drawto_command_group; 
            match(input,EOF,FOLLOW_EOF_in_entryRulemoveto_drawto_command_group266); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemoveto_drawto_command_group"


    // $ANTLR start "rulemoveto_drawto_command_group"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:154:1: rulemoveto_drawto_command_group returns [EObject current=null] : ( ( (lv_moveto_0_0= rulemoveto ) ) ( (lv_drawto_commands_1_0= ruledrawto_commands ) )? ) ;
    public final EObject rulemoveto_drawto_command_group() throws RecognitionException {
        EObject current = null;

        EObject lv_moveto_0_0 = null;

        EObject lv_drawto_commands_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:157:28: ( ( ( (lv_moveto_0_0= rulemoveto ) ) ( (lv_drawto_commands_1_0= ruledrawto_commands ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:158:1: ( ( (lv_moveto_0_0= rulemoveto ) ) ( (lv_drawto_commands_1_0= ruledrawto_commands ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:158:1: ( ( (lv_moveto_0_0= rulemoveto ) ) ( (lv_drawto_commands_1_0= ruledrawto_commands ) )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:158:2: ( (lv_moveto_0_0= rulemoveto ) ) ( (lv_drawto_commands_1_0= ruledrawto_commands ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:158:2: ( (lv_moveto_0_0= rulemoveto ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:159:1: (lv_moveto_0_0= rulemoveto )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:159:1: (lv_moveto_0_0= rulemoveto )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:160:3: lv_moveto_0_0= rulemoveto
            {
             
            	        newCompositeNode(grammarAccess.getMoveto_drawto_command_groupAccess().getMovetoMovetoParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulemoveto_in_rulemoveto_drawto_command_group312);
            lv_moveto_0_0=rulemoveto();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoveto_drawto_command_groupRule());
            	        }
                   		set(
                   			current, 
                   			"moveto",
                    		lv_moveto_0_0, 
                    		"moveto");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:176:2: ( (lv_drawto_commands_1_0= ruledrawto_commands ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=7 && LA2_0<=24)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:177:1: (lv_drawto_commands_1_0= ruledrawto_commands )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:177:1: (lv_drawto_commands_1_0= ruledrawto_commands )
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:178:3: lv_drawto_commands_1_0= ruledrawto_commands
                    {
                     
                    	        newCompositeNode(grammarAccess.getMoveto_drawto_command_groupAccess().getDrawto_commandsDrawto_commandsParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruledrawto_commands_in_rulemoveto_drawto_command_group333);
                    lv_drawto_commands_1_0=ruledrawto_commands();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMoveto_drawto_command_groupRule());
                    	        }
                           		set(
                           			current, 
                           			"drawto_commands",
                            		lv_drawto_commands_1_0, 
                            		"drawto_commands");
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
    // $ANTLR end "rulemoveto_drawto_command_group"


    // $ANTLR start "entryRulemoveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:202:1: entryRulemoveto returns [EObject current=null] : iv_rulemoveto= rulemoveto EOF ;
    public final EObject entryRulemoveto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemoveto = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:203:2: (iv_rulemoveto= rulemoveto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:204:2: iv_rulemoveto= rulemoveto EOF
            {
             newCompositeNode(grammarAccess.getMovetoRule()); 
            pushFollow(FOLLOW_rulemoveto_in_entryRulemoveto370);
            iv_rulemoveto=rulemoveto();

            state._fsp--;

             current =iv_rulemoveto; 
            match(input,EOF,FOLLOW_EOF_in_entryRulemoveto380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemoveto"


    // $ANTLR start "rulemoveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:211:1: rulemoveto returns [EObject current=null] : ( (otherlv_0= 'M' | otherlv_1= 'm' ) ( (lv_point_2_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_lineto_argument_sequence_4_0= rulelineto_argument_sequence ) ) ) ;
    public final EObject rulemoveto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_point_2_0 = null;

        EObject lv_lineto_argument_sequence_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:214:28: ( ( (otherlv_0= 'M' | otherlv_1= 'm' ) ( (lv_point_2_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_lineto_argument_sequence_4_0= rulelineto_argument_sequence ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:215:1: ( (otherlv_0= 'M' | otherlv_1= 'm' ) ( (lv_point_2_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_lineto_argument_sequence_4_0= rulelineto_argument_sequence ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:215:1: ( (otherlv_0= 'M' | otherlv_1= 'm' ) ( (lv_point_2_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_lineto_argument_sequence_4_0= rulelineto_argument_sequence ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:215:2: (otherlv_0= 'M' | otherlv_1= 'm' ) ( (lv_point_2_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_lineto_argument_sequence_4_0= rulelineto_argument_sequence ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:215:2: (otherlv_0= 'M' | otherlv_1= 'm' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==5) ) {
                alt3=1;
            }
            else if ( (LA3_0==6) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:215:4: otherlv_0= 'M'
                    {
                    otherlv_0=(Token)match(input,5,FOLLOW_5_in_rulemoveto418); 

                        	newLeafNode(otherlv_0, grammarAccess.getMovetoAccess().getMKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:220:7: otherlv_1= 'm'
                    {
                    otherlv_1=(Token)match(input,6,FOLLOW_6_in_rulemoveto436); 

                        	newLeafNode(otherlv_1, grammarAccess.getMovetoAccess().getMKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:224:2: ( (lv_point_2_0= rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:225:1: (lv_point_2_0= rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:225:1: (lv_point_2_0= rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:226:3: lv_point_2_0= rulecoordinate_pair
            {
             
            	        newCompositeNode(grammarAccess.getMovetoAccess().getPointCoordinate_pairParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_pair_in_rulemoveto458);
            lv_point_2_0=rulecoordinate_pair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMovetoRule());
            	        }
                   		set(
                   			current, 
                   			"point",
                    		lv_point_2_0, 
                    		"coordinate_pair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:242:2: ( rulecomma )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:243:5: rulecomma
                    {
                     
                            newCompositeNode(grammarAccess.getMovetoAccess().getCommaParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulecomma_in_rulemoveto475);
                    rulecomma();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:250:3: ( (lv_lineto_argument_sequence_4_0= rulelineto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:251:1: (lv_lineto_argument_sequence_4_0= rulelineto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:251:1: (lv_lineto_argument_sequence_4_0= rulelineto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:252:3: lv_lineto_argument_sequence_4_0= rulelineto_argument_sequence
            {
             
            	        newCompositeNode(grammarAccess.getMovetoAccess().getLineto_argument_sequenceLineto_argument_sequenceParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulelineto_argument_sequence_in_rulemoveto497);
            lv_lineto_argument_sequence_4_0=rulelineto_argument_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMovetoRule());
            	        }
                   		set(
                   			current, 
                   			"lineto_argument_sequence",
                    		lv_lineto_argument_sequence_4_0, 
                    		"lineto_argument_sequence");
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
    // $ANTLR end "rulemoveto"


    // $ANTLR start "entryRulelineto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:276:1: entryRulelineto_argument_sequence returns [EObject current=null] : iv_rulelineto_argument_sequence= rulelineto_argument_sequence EOF ;
    public final EObject entryRulelineto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelineto_argument_sequence = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:277:2: (iv_rulelineto_argument_sequence= rulelineto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:278:2: iv_rulelineto_argument_sequence= rulelineto_argument_sequence EOF
            {
             newCompositeNode(grammarAccess.getLineto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulelineto_argument_sequence_in_entryRulelineto_argument_sequence533);
            iv_rulelineto_argument_sequence=rulelineto_argument_sequence();

            state._fsp--;

             current =iv_rulelineto_argument_sequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelineto_argument_sequence543); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelineto_argument_sequence"


    // $ANTLR start "rulelineto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:285:1: rulelineto_argument_sequence returns [EObject current=null] : ( ( (lv_pairs_0_0= rulecoordinate_pair ) ) ( ( rulecomma )? ( (lv_pairs_2_0= rulecoordinate_pair ) ) )* ) ;
    public final EObject rulelineto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject lv_pairs_0_0 = null;

        EObject lv_pairs_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:288:28: ( ( ( (lv_pairs_0_0= rulecoordinate_pair ) ) ( ( rulecomma )? ( (lv_pairs_2_0= rulecoordinate_pair ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:289:1: ( ( (lv_pairs_0_0= rulecoordinate_pair ) ) ( ( rulecomma )? ( (lv_pairs_2_0= rulecoordinate_pair ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:289:1: ( ( (lv_pairs_0_0= rulecoordinate_pair ) ) ( ( rulecomma )? ( (lv_pairs_2_0= rulecoordinate_pair ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:289:2: ( (lv_pairs_0_0= rulecoordinate_pair ) ) ( ( rulecomma )? ( (lv_pairs_2_0= rulecoordinate_pair ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:289:2: ( (lv_pairs_0_0= rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:290:1: (lv_pairs_0_0= rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:290:1: (lv_pairs_0_0= rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:291:3: lv_pairs_0_0= rulecoordinate_pair
            {
             
            	        newCompositeNode(grammarAccess.getLineto_argument_sequenceAccess().getPairsCoordinate_pairParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_pair_in_rulelineto_argument_sequence589);
            lv_pairs_0_0=rulecoordinate_pair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLineto_argument_sequenceRule());
            	        }
                   		add(
                   			current, 
                   			"pairs",
                    		lv_pairs_0_0, 
                    		"coordinate_pair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:307:2: ( ( rulecomma )? ( (lv_pairs_2_0= rulecoordinate_pair ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25||(LA6_0>=29 && LA6_0<=40)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:307:3: ( rulecomma )? ( (lv_pairs_2_0= rulecoordinate_pair ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:307:3: ( rulecomma )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==25) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:308:5: rulecomma
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getLineto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            	                
            	            pushFollow(FOLLOW_rulecomma_in_rulelineto_argument_sequence607);
            	            rulecomma();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:315:3: ( (lv_pairs_2_0= rulecoordinate_pair ) )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:316:1: (lv_pairs_2_0= rulecoordinate_pair )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:316:1: (lv_pairs_2_0= rulecoordinate_pair )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:317:3: lv_pairs_2_0= rulecoordinate_pair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLineto_argument_sequenceAccess().getPairsCoordinate_pairParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecoordinate_pair_in_rulelineto_argument_sequence629);
            	    lv_pairs_2_0=rulecoordinate_pair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLineto_argument_sequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pairs",
            	            		lv_pairs_2_0, 
            	            		"coordinate_pair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "rulelineto_argument_sequence"


    // $ANTLR start "entryRuledrawto_commands"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:341:1: entryRuledrawto_commands returns [EObject current=null] : iv_ruledrawto_commands= ruledrawto_commands EOF ;
    public final EObject entryRuledrawto_commands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledrawto_commands = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:342:2: (iv_ruledrawto_commands= ruledrawto_commands EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:343:2: iv_ruledrawto_commands= ruledrawto_commands EOF
            {
             newCompositeNode(grammarAccess.getDrawto_commandsRule()); 
            pushFollow(FOLLOW_ruledrawto_commands_in_entryRuledrawto_commands667);
            iv_ruledrawto_commands=ruledrawto_commands();

            state._fsp--;

             current =iv_ruledrawto_commands; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledrawto_commands677); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledrawto_commands"


    // $ANTLR start "ruledrawto_commands"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:350:1: ruledrawto_commands returns [EObject current=null] : ( (lv_drawto_commands_0_0= ruledrawto_command ) )+ ;
    public final EObject ruledrawto_commands() throws RecognitionException {
        EObject current = null;

        EObject lv_drawto_commands_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:353:28: ( ( (lv_drawto_commands_0_0= ruledrawto_command ) )+ )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:354:1: ( (lv_drawto_commands_0_0= ruledrawto_command ) )+
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:354:1: ( (lv_drawto_commands_0_0= ruledrawto_command ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=7 && LA7_0<=24)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:355:1: (lv_drawto_commands_0_0= ruledrawto_command )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:355:1: (lv_drawto_commands_0_0= ruledrawto_command )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:356:3: lv_drawto_commands_0_0= ruledrawto_command
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDrawto_commandsAccess().getDrawto_commandsDrawto_commandParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruledrawto_command_in_ruledrawto_commands722);
            	    lv_drawto_commands_0_0=ruledrawto_command();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDrawto_commandsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"drawto_commands",
            	            		lv_drawto_commands_0_0, 
            	            		"drawto_command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "ruledrawto_commands"


    // $ANTLR start "entryRuledrawto_command"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:380:1: entryRuledrawto_command returns [EObject current=null] : iv_ruledrawto_command= ruledrawto_command EOF ;
    public final EObject entryRuledrawto_command() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledrawto_command = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:381:2: (iv_ruledrawto_command= ruledrawto_command EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:382:2: iv_ruledrawto_command= ruledrawto_command EOF
            {
             newCompositeNode(grammarAccess.getDrawto_commandRule()); 
            pushFollow(FOLLOW_ruledrawto_command_in_entryRuledrawto_command758);
            iv_ruledrawto_command=ruledrawto_command();

            state._fsp--;

             current =iv_ruledrawto_command; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledrawto_command768); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledrawto_command"


    // $ANTLR start "ruledrawto_command"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:389:1: ruledrawto_command returns [EObject current=null] : (this_closepath_0= ruleclosepath | this_lineto_1= rulelineto | this_horizontal_lineto_2= rulehorizontal_lineto | this_vertical_lineto_3= rulevertical_lineto | this_curveto_4= rulecurveto | this_smooth_curveto_5= rulesmooth_curveto | this_quadratic_bezier_curveto_6= rulequadratic_bezier_curveto | this_smooth_quadratic_bezier_curveto_7= rulesmooth_quadratic_bezier_curveto | this_elliptical_arc_8= ruleelliptical_arc ) ;
    public final EObject ruledrawto_command() throws RecognitionException {
        EObject current = null;

        EObject this_closepath_0 = null;

        EObject this_lineto_1 = null;

        EObject this_horizontal_lineto_2 = null;

        EObject this_vertical_lineto_3 = null;

        EObject this_curveto_4 = null;

        EObject this_smooth_curveto_5 = null;

        EObject this_quadratic_bezier_curveto_6 = null;

        EObject this_smooth_quadratic_bezier_curveto_7 = null;

        EObject this_elliptical_arc_8 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:392:28: ( (this_closepath_0= ruleclosepath | this_lineto_1= rulelineto | this_horizontal_lineto_2= rulehorizontal_lineto | this_vertical_lineto_3= rulevertical_lineto | this_curveto_4= rulecurveto | this_smooth_curveto_5= rulesmooth_curveto | this_quadratic_bezier_curveto_6= rulequadratic_bezier_curveto | this_smooth_quadratic_bezier_curveto_7= rulesmooth_quadratic_bezier_curveto | this_elliptical_arc_8= ruleelliptical_arc ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:393:1: (this_closepath_0= ruleclosepath | this_lineto_1= rulelineto | this_horizontal_lineto_2= rulehorizontal_lineto | this_vertical_lineto_3= rulevertical_lineto | this_curveto_4= rulecurveto | this_smooth_curveto_5= rulesmooth_curveto | this_quadratic_bezier_curveto_6= rulequadratic_bezier_curveto | this_smooth_quadratic_bezier_curveto_7= rulesmooth_quadratic_bezier_curveto | this_elliptical_arc_8= ruleelliptical_arc )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:393:1: (this_closepath_0= ruleclosepath | this_lineto_1= rulelineto | this_horizontal_lineto_2= rulehorizontal_lineto | this_vertical_lineto_3= rulevertical_lineto | this_curveto_4= rulecurveto | this_smooth_curveto_5= rulesmooth_curveto | this_quadratic_bezier_curveto_6= rulequadratic_bezier_curveto | this_smooth_quadratic_bezier_curveto_7= rulesmooth_quadratic_bezier_curveto | this_elliptical_arc_8= ruleelliptical_arc )
            int alt8=9;
            switch ( input.LA(1) ) {
            case 7:
            case 8:
                {
                alt8=1;
                }
                break;
            case 9:
            case 10:
                {
                alt8=2;
                }
                break;
            case 11:
            case 12:
                {
                alt8=3;
                }
                break;
            case 13:
            case 14:
                {
                alt8=4;
                }
                break;
            case 15:
            case 16:
                {
                alt8=5;
                }
                break;
            case 17:
            case 18:
                {
                alt8=6;
                }
                break;
            case 19:
            case 20:
                {
                alt8=7;
                }
                break;
            case 21:
            case 22:
                {
                alt8=8;
                }
                break;
            case 23:
            case 24:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:394:5: this_closepath_0= ruleclosepath
                    {
                     
                            newCompositeNode(grammarAccess.getDrawto_commandAccess().getClosepathParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleclosepath_in_ruledrawto_command815);
                    this_closepath_0=ruleclosepath();

                    state._fsp--;

                     
                            current = this_closepath_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:404:5: this_lineto_1= rulelineto
                    {
                     
                            newCompositeNode(grammarAccess.getDrawto_commandAccess().getLinetoParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulelineto_in_ruledrawto_command842);
                    this_lineto_1=rulelineto();

                    state._fsp--;

                     
                            current = this_lineto_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:414:5: this_horizontal_lineto_2= rulehorizontal_lineto
                    {
                     
                            newCompositeNode(grammarAccess.getDrawto_commandAccess().getHorizontal_linetoParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulehorizontal_lineto_in_ruledrawto_command869);
                    this_horizontal_lineto_2=rulehorizontal_lineto();

                    state._fsp--;

                     
                            current = this_horizontal_lineto_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:424:5: this_vertical_lineto_3= rulevertical_lineto
                    {
                     
                            newCompositeNode(grammarAccess.getDrawto_commandAccess().getVertical_linetoParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulevertical_lineto_in_ruledrawto_command896);
                    this_vertical_lineto_3=rulevertical_lineto();

                    state._fsp--;

                     
                            current = this_vertical_lineto_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:434:5: this_curveto_4= rulecurveto
                    {
                     
                            newCompositeNode(grammarAccess.getDrawto_commandAccess().getCurvetoParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulecurveto_in_ruledrawto_command923);
                    this_curveto_4=rulecurveto();

                    state._fsp--;

                     
                            current = this_curveto_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:444:5: this_smooth_curveto_5= rulesmooth_curveto
                    {
                     
                            newCompositeNode(grammarAccess.getDrawto_commandAccess().getSmooth_curvetoParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulesmooth_curveto_in_ruledrawto_command950);
                    this_smooth_curveto_5=rulesmooth_curveto();

                    state._fsp--;

                     
                            current = this_smooth_curveto_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:454:5: this_quadratic_bezier_curveto_6= rulequadratic_bezier_curveto
                    {
                     
                            newCompositeNode(grammarAccess.getDrawto_commandAccess().getQuadratic_bezier_curvetoParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulequadratic_bezier_curveto_in_ruledrawto_command977);
                    this_quadratic_bezier_curveto_6=rulequadratic_bezier_curveto();

                    state._fsp--;

                     
                            current = this_quadratic_bezier_curveto_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:464:5: this_smooth_quadratic_bezier_curveto_7= rulesmooth_quadratic_bezier_curveto
                    {
                     
                            newCompositeNode(grammarAccess.getDrawto_commandAccess().getSmooth_quadratic_bezier_curvetoParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulesmooth_quadratic_bezier_curveto_in_ruledrawto_command1004);
                    this_smooth_quadratic_bezier_curveto_7=rulesmooth_quadratic_bezier_curveto();

                    state._fsp--;

                     
                            current = this_smooth_quadratic_bezier_curveto_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:474:5: this_elliptical_arc_8= ruleelliptical_arc
                    {
                     
                            newCompositeNode(grammarAccess.getDrawto_commandAccess().getElliptical_arcParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleelliptical_arc_in_ruledrawto_command1031);
                    this_elliptical_arc_8=ruleelliptical_arc();

                    state._fsp--;

                     
                            current = this_elliptical_arc_8; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruledrawto_command"


    // $ANTLR start "entryRuleclosepath"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:490:1: entryRuleclosepath returns [EObject current=null] : iv_ruleclosepath= ruleclosepath EOF ;
    public final EObject entryRuleclosepath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleclosepath = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:491:2: (iv_ruleclosepath= ruleclosepath EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:492:2: iv_ruleclosepath= ruleclosepath EOF
            {
             newCompositeNode(grammarAccess.getClosepathRule()); 
            pushFollow(FOLLOW_ruleclosepath_in_entryRuleclosepath1066);
            iv_ruleclosepath=ruleclosepath();

            state._fsp--;

             current =iv_ruleclosepath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclosepath1076); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleclosepath"


    // $ANTLR start "ruleclosepath"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:499:1: ruleclosepath returns [EObject current=null] : ( () (otherlv_1= 'Z' | otherlv_2= 'z' ) ) ;
    public final EObject ruleclosepath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:502:28: ( ( () (otherlv_1= 'Z' | otherlv_2= 'z' ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:503:1: ( () (otherlv_1= 'Z' | otherlv_2= 'z' ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:503:1: ( () (otherlv_1= 'Z' | otherlv_2= 'z' ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:503:2: () (otherlv_1= 'Z' | otherlv_2= 'z' )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:503:2: ()
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:504:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClosepathAccess().getClosepathAction_0(),
                        current);
                

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:509:2: (otherlv_1= 'Z' | otherlv_2= 'z' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==7) ) {
                alt9=1;
            }
            else if ( (LA9_0==8) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:509:4: otherlv_1= 'Z'
                    {
                    otherlv_1=(Token)match(input,7,FOLLOW_7_in_ruleclosepath1123); 

                        	newLeafNode(otherlv_1, grammarAccess.getClosepathAccess().getZKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:514:7: otherlv_2= 'z'
                    {
                    otherlv_2=(Token)match(input,8,FOLLOW_8_in_ruleclosepath1141); 

                        	newLeafNode(otherlv_2, grammarAccess.getClosepathAccess().getZKeyword_1_1());
                        

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
    // $ANTLR end "ruleclosepath"


    // $ANTLR start "entryRulelineto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:526:1: entryRulelineto returns [EObject current=null] : iv_rulelineto= rulelineto EOF ;
    public final EObject entryRulelineto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelineto = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:527:2: (iv_rulelineto= rulelineto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:528:2: iv_rulelineto= rulelineto EOF
            {
             newCompositeNode(grammarAccess.getLinetoRule()); 
            pushFollow(FOLLOW_rulelineto_in_entryRulelineto1178);
            iv_rulelineto=rulelineto();

            state._fsp--;

             current =iv_rulelineto; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelineto1188); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelineto"


    // $ANTLR start "rulelineto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:535:1: rulelineto returns [EObject current=null] : ( (otherlv_0= 'L' | otherlv_1= 'l' ) ( (lv_lineto_argument_sequence_2_0= rulelineto_argument_sequence ) ) ) ;
    public final EObject rulelineto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_lineto_argument_sequence_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:538:28: ( ( (otherlv_0= 'L' | otherlv_1= 'l' ) ( (lv_lineto_argument_sequence_2_0= rulelineto_argument_sequence ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:539:1: ( (otherlv_0= 'L' | otherlv_1= 'l' ) ( (lv_lineto_argument_sequence_2_0= rulelineto_argument_sequence ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:539:1: ( (otherlv_0= 'L' | otherlv_1= 'l' ) ( (lv_lineto_argument_sequence_2_0= rulelineto_argument_sequence ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:539:2: (otherlv_0= 'L' | otherlv_1= 'l' ) ( (lv_lineto_argument_sequence_2_0= rulelineto_argument_sequence ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:539:2: (otherlv_0= 'L' | otherlv_1= 'l' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==9) ) {
                alt10=1;
            }
            else if ( (LA10_0==10) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:539:4: otherlv_0= 'L'
                    {
                    otherlv_0=(Token)match(input,9,FOLLOW_9_in_rulelineto1226); 

                        	newLeafNode(otherlv_0, grammarAccess.getLinetoAccess().getLKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:544:7: otherlv_1= 'l'
                    {
                    otherlv_1=(Token)match(input,10,FOLLOW_10_in_rulelineto1244); 

                        	newLeafNode(otherlv_1, grammarAccess.getLinetoAccess().getLKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:548:2: ( (lv_lineto_argument_sequence_2_0= rulelineto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:549:1: (lv_lineto_argument_sequence_2_0= rulelineto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:549:1: (lv_lineto_argument_sequence_2_0= rulelineto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:550:3: lv_lineto_argument_sequence_2_0= rulelineto_argument_sequence
            {
             
            	        newCompositeNode(grammarAccess.getLinetoAccess().getLineto_argument_sequenceLineto_argument_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulelineto_argument_sequence_in_rulelineto1266);
            lv_lineto_argument_sequence_2_0=rulelineto_argument_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinetoRule());
            	        }
                   		set(
                   			current, 
                   			"lineto_argument_sequence",
                    		lv_lineto_argument_sequence_2_0, 
                    		"lineto_argument_sequence");
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
    // $ANTLR end "rulelineto"


    // $ANTLR start "entryRulehorizontal_lineto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:574:1: entryRulehorizontal_lineto returns [EObject current=null] : iv_rulehorizontal_lineto= rulehorizontal_lineto EOF ;
    public final EObject entryRulehorizontal_lineto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulehorizontal_lineto = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:575:2: (iv_rulehorizontal_lineto= rulehorizontal_lineto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:576:2: iv_rulehorizontal_lineto= rulehorizontal_lineto EOF
            {
             newCompositeNode(grammarAccess.getHorizontal_linetoRule()); 
            pushFollow(FOLLOW_rulehorizontal_lineto_in_entryRulehorizontal_lineto1302);
            iv_rulehorizontal_lineto=rulehorizontal_lineto();

            state._fsp--;

             current =iv_rulehorizontal_lineto; 
            match(input,EOF,FOLLOW_EOF_in_entryRulehorizontal_lineto1312); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulehorizontal_lineto"


    // $ANTLR start "rulehorizontal_lineto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:583:1: rulehorizontal_lineto returns [EObject current=null] : ( (otherlv_0= 'H' | otherlv_1= 'h' ) ( (lv_horizontal_lineto_argument_sequence_2_0= rulehorizontal_lineto_argument_sequence ) ) ) ;
    public final EObject rulehorizontal_lineto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_horizontal_lineto_argument_sequence_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:586:28: ( ( (otherlv_0= 'H' | otherlv_1= 'h' ) ( (lv_horizontal_lineto_argument_sequence_2_0= rulehorizontal_lineto_argument_sequence ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:587:1: ( (otherlv_0= 'H' | otherlv_1= 'h' ) ( (lv_horizontal_lineto_argument_sequence_2_0= rulehorizontal_lineto_argument_sequence ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:587:1: ( (otherlv_0= 'H' | otherlv_1= 'h' ) ( (lv_horizontal_lineto_argument_sequence_2_0= rulehorizontal_lineto_argument_sequence ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:587:2: (otherlv_0= 'H' | otherlv_1= 'h' ) ( (lv_horizontal_lineto_argument_sequence_2_0= rulehorizontal_lineto_argument_sequence ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:587:2: (otherlv_0= 'H' | otherlv_1= 'h' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            else if ( (LA11_0==12) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:587:4: otherlv_0= 'H'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulehorizontal_lineto1350); 

                        	newLeafNode(otherlv_0, grammarAccess.getHorizontal_linetoAccess().getHKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:592:7: otherlv_1= 'h'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_rulehorizontal_lineto1368); 

                        	newLeafNode(otherlv_1, grammarAccess.getHorizontal_linetoAccess().getHKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:596:2: ( (lv_horizontal_lineto_argument_sequence_2_0= rulehorizontal_lineto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:597:1: (lv_horizontal_lineto_argument_sequence_2_0= rulehorizontal_lineto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:597:1: (lv_horizontal_lineto_argument_sequence_2_0= rulehorizontal_lineto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:598:3: lv_horizontal_lineto_argument_sequence_2_0= rulehorizontal_lineto_argument_sequence
            {
             
            	        newCompositeNode(grammarAccess.getHorizontal_linetoAccess().getHorizontal_lineto_argument_sequenceHorizontal_lineto_argument_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulehorizontal_lineto_argument_sequence_in_rulehorizontal_lineto1390);
            lv_horizontal_lineto_argument_sequence_2_0=rulehorizontal_lineto_argument_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHorizontal_linetoRule());
            	        }
                   		set(
                   			current, 
                   			"horizontal_lineto_argument_sequence",
                    		lv_horizontal_lineto_argument_sequence_2_0, 
                    		"horizontal_lineto_argument_sequence");
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
    // $ANTLR end "rulehorizontal_lineto"


    // $ANTLR start "entryRulehorizontal_lineto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:622:1: entryRulehorizontal_lineto_argument_sequence returns [EObject current=null] : iv_rulehorizontal_lineto_argument_sequence= rulehorizontal_lineto_argument_sequence EOF ;
    public final EObject entryRulehorizontal_lineto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulehorizontal_lineto_argument_sequence = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:623:2: (iv_rulehorizontal_lineto_argument_sequence= rulehorizontal_lineto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:624:2: iv_rulehorizontal_lineto_argument_sequence= rulehorizontal_lineto_argument_sequence EOF
            {
             newCompositeNode(grammarAccess.getHorizontal_lineto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulehorizontal_lineto_argument_sequence_in_entryRulehorizontal_lineto_argument_sequence1426);
            iv_rulehorizontal_lineto_argument_sequence=rulehorizontal_lineto_argument_sequence();

            state._fsp--;

             current =iv_rulehorizontal_lineto_argument_sequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulehorizontal_lineto_argument_sequence1436); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulehorizontal_lineto_argument_sequence"


    // $ANTLR start "rulehorizontal_lineto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:631:1: rulehorizontal_lineto_argument_sequence returns [EObject current=null] : ( ( (lv_coordinates_0_0= rulecoordinate ) ) ( ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) ) )* ) ;
    public final EObject rulehorizontal_lineto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject lv_coordinates_0_0 = null;

        EObject lv_coordinates_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:634:28: ( ( ( (lv_coordinates_0_0= rulecoordinate ) ) ( ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:635:1: ( ( (lv_coordinates_0_0= rulecoordinate ) ) ( ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:635:1: ( ( (lv_coordinates_0_0= rulecoordinate ) ) ( ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:635:2: ( (lv_coordinates_0_0= rulecoordinate ) ) ( ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:635:2: ( (lv_coordinates_0_0= rulecoordinate ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:636:1: (lv_coordinates_0_0= rulecoordinate )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:636:1: (lv_coordinates_0_0= rulecoordinate )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:637:3: lv_coordinates_0_0= rulecoordinate
            {
             
            	        newCompositeNode(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getCoordinatesCoordinateParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_in_rulehorizontal_lineto_argument_sequence1482);
            lv_coordinates_0_0=rulecoordinate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHorizontal_lineto_argument_sequenceRule());
            	        }
                   		add(
                   			current, 
                   			"coordinates",
                    		lv_coordinates_0_0, 
                    		"coordinate");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:653:2: ( ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25||(LA13_0>=29 && LA13_0<=40)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:653:3: ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:653:3: ( rulecomma )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==25) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:654:5: rulecomma
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            	                
            	            pushFollow(FOLLOW_rulecomma_in_rulehorizontal_lineto_argument_sequence1500);
            	            rulecomma();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:661:3: ( (lv_coordinates_2_0= rulecoordinate ) )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:662:1: (lv_coordinates_2_0= rulecoordinate )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:662:1: (lv_coordinates_2_0= rulecoordinate )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:663:3: lv_coordinates_2_0= rulecoordinate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getCoordinatesCoordinateParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecoordinate_in_rulehorizontal_lineto_argument_sequence1522);
            	    lv_coordinates_2_0=rulecoordinate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHorizontal_lineto_argument_sequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"coordinates",
            	            		lv_coordinates_2_0, 
            	            		"coordinate");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "rulehorizontal_lineto_argument_sequence"


    // $ANTLR start "entryRulevertical_lineto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:687:1: entryRulevertical_lineto returns [EObject current=null] : iv_rulevertical_lineto= rulevertical_lineto EOF ;
    public final EObject entryRulevertical_lineto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevertical_lineto = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:688:2: (iv_rulevertical_lineto= rulevertical_lineto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:689:2: iv_rulevertical_lineto= rulevertical_lineto EOF
            {
             newCompositeNode(grammarAccess.getVertical_linetoRule()); 
            pushFollow(FOLLOW_rulevertical_lineto_in_entryRulevertical_lineto1560);
            iv_rulevertical_lineto=rulevertical_lineto();

            state._fsp--;

             current =iv_rulevertical_lineto; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevertical_lineto1570); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevertical_lineto"


    // $ANTLR start "rulevertical_lineto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:696:1: rulevertical_lineto returns [EObject current=null] : ( (otherlv_0= 'V' | otherlv_1= 'v' ) ( (lv_vertical_lineto_argument_sequence_2_0= rulevertical_lineto_argument_sequence ) ) ) ;
    public final EObject rulevertical_lineto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vertical_lineto_argument_sequence_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:699:28: ( ( (otherlv_0= 'V' | otherlv_1= 'v' ) ( (lv_vertical_lineto_argument_sequence_2_0= rulevertical_lineto_argument_sequence ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:700:1: ( (otherlv_0= 'V' | otherlv_1= 'v' ) ( (lv_vertical_lineto_argument_sequence_2_0= rulevertical_lineto_argument_sequence ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:700:1: ( (otherlv_0= 'V' | otherlv_1= 'v' ) ( (lv_vertical_lineto_argument_sequence_2_0= rulevertical_lineto_argument_sequence ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:700:2: (otherlv_0= 'V' | otherlv_1= 'v' ) ( (lv_vertical_lineto_argument_sequence_2_0= rulevertical_lineto_argument_sequence ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:700:2: (otherlv_0= 'V' | otherlv_1= 'v' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            else if ( (LA14_0==14) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:700:4: otherlv_0= 'V'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulevertical_lineto1608); 

                        	newLeafNode(otherlv_0, grammarAccess.getVertical_linetoAccess().getVKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:705:7: otherlv_1= 'v'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_rulevertical_lineto1626); 

                        	newLeafNode(otherlv_1, grammarAccess.getVertical_linetoAccess().getVKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:709:2: ( (lv_vertical_lineto_argument_sequence_2_0= rulevertical_lineto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:710:1: (lv_vertical_lineto_argument_sequence_2_0= rulevertical_lineto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:710:1: (lv_vertical_lineto_argument_sequence_2_0= rulevertical_lineto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:711:3: lv_vertical_lineto_argument_sequence_2_0= rulevertical_lineto_argument_sequence
            {
             
            	        newCompositeNode(grammarAccess.getVertical_linetoAccess().getVertical_lineto_argument_sequenceVertical_lineto_argument_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulevertical_lineto_argument_sequence_in_rulevertical_lineto1648);
            lv_vertical_lineto_argument_sequence_2_0=rulevertical_lineto_argument_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVertical_linetoRule());
            	        }
                   		set(
                   			current, 
                   			"vertical_lineto_argument_sequence",
                    		lv_vertical_lineto_argument_sequence_2_0, 
                    		"vertical_lineto_argument_sequence");
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
    // $ANTLR end "rulevertical_lineto"


    // $ANTLR start "entryRulevertical_lineto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:735:1: entryRulevertical_lineto_argument_sequence returns [EObject current=null] : iv_rulevertical_lineto_argument_sequence= rulevertical_lineto_argument_sequence EOF ;
    public final EObject entryRulevertical_lineto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevertical_lineto_argument_sequence = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:736:2: (iv_rulevertical_lineto_argument_sequence= rulevertical_lineto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:737:2: iv_rulevertical_lineto_argument_sequence= rulevertical_lineto_argument_sequence EOF
            {
             newCompositeNode(grammarAccess.getVertical_lineto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulevertical_lineto_argument_sequence_in_entryRulevertical_lineto_argument_sequence1684);
            iv_rulevertical_lineto_argument_sequence=rulevertical_lineto_argument_sequence();

            state._fsp--;

             current =iv_rulevertical_lineto_argument_sequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevertical_lineto_argument_sequence1694); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevertical_lineto_argument_sequence"


    // $ANTLR start "rulevertical_lineto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:744:1: rulevertical_lineto_argument_sequence returns [EObject current=null] : ( ( (lv_coordinates_0_0= rulecoordinate ) ) ( ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) ) )* ) ;
    public final EObject rulevertical_lineto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject lv_coordinates_0_0 = null;

        EObject lv_coordinates_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:747:28: ( ( ( (lv_coordinates_0_0= rulecoordinate ) ) ( ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:748:1: ( ( (lv_coordinates_0_0= rulecoordinate ) ) ( ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:748:1: ( ( (lv_coordinates_0_0= rulecoordinate ) ) ( ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:748:2: ( (lv_coordinates_0_0= rulecoordinate ) ) ( ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:748:2: ( (lv_coordinates_0_0= rulecoordinate ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:749:1: (lv_coordinates_0_0= rulecoordinate )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:749:1: (lv_coordinates_0_0= rulecoordinate )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:750:3: lv_coordinates_0_0= rulecoordinate
            {
             
            	        newCompositeNode(grammarAccess.getVertical_lineto_argument_sequenceAccess().getCoordinatesCoordinateParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_in_rulevertical_lineto_argument_sequence1740);
            lv_coordinates_0_0=rulecoordinate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVertical_lineto_argument_sequenceRule());
            	        }
                   		add(
                   			current, 
                   			"coordinates",
                    		lv_coordinates_0_0, 
                    		"coordinate");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:766:2: ( ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25||(LA16_0>=29 && LA16_0<=40)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:766:3: ( rulecomma )? ( (lv_coordinates_2_0= rulecoordinate ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:766:3: ( rulecomma )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==25) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:767:5: rulecomma
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getVertical_lineto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            	                
            	            pushFollow(FOLLOW_rulecomma_in_rulevertical_lineto_argument_sequence1758);
            	            rulecomma();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:774:3: ( (lv_coordinates_2_0= rulecoordinate ) )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:775:1: (lv_coordinates_2_0= rulecoordinate )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:775:1: (lv_coordinates_2_0= rulecoordinate )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:776:3: lv_coordinates_2_0= rulecoordinate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVertical_lineto_argument_sequenceAccess().getCoordinatesCoordinateParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecoordinate_in_rulevertical_lineto_argument_sequence1780);
            	    lv_coordinates_2_0=rulecoordinate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVertical_lineto_argument_sequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"coordinates",
            	            		lv_coordinates_2_0, 
            	            		"coordinate");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "rulevertical_lineto_argument_sequence"


    // $ANTLR start "entryRulecurveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:800:1: entryRulecurveto returns [EObject current=null] : iv_rulecurveto= rulecurveto EOF ;
    public final EObject entryRulecurveto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecurveto = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:801:2: (iv_rulecurveto= rulecurveto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:802:2: iv_rulecurveto= rulecurveto EOF
            {
             newCompositeNode(grammarAccess.getCurvetoRule()); 
            pushFollow(FOLLOW_rulecurveto_in_entryRulecurveto1818);
            iv_rulecurveto=rulecurveto();

            state._fsp--;

             current =iv_rulecurveto; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecurveto1828); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecurveto"


    // $ANTLR start "rulecurveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:809:1: rulecurveto returns [EObject current=null] : ( (otherlv_0= 'C' | otherlv_1= 'c' ) ( (lv_curveto_argument_sequence_2_0= rulecurveto_argument_sequence ) ) ) ;
    public final EObject rulecurveto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_curveto_argument_sequence_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:812:28: ( ( (otherlv_0= 'C' | otherlv_1= 'c' ) ( (lv_curveto_argument_sequence_2_0= rulecurveto_argument_sequence ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:813:1: ( (otherlv_0= 'C' | otherlv_1= 'c' ) ( (lv_curveto_argument_sequence_2_0= rulecurveto_argument_sequence ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:813:1: ( (otherlv_0= 'C' | otherlv_1= 'c' ) ( (lv_curveto_argument_sequence_2_0= rulecurveto_argument_sequence ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:813:2: (otherlv_0= 'C' | otherlv_1= 'c' ) ( (lv_curveto_argument_sequence_2_0= rulecurveto_argument_sequence ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:813:2: (otherlv_0= 'C' | otherlv_1= 'c' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            else if ( (LA17_0==16) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:813:4: otherlv_0= 'C'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulecurveto1866); 

                        	newLeafNode(otherlv_0, grammarAccess.getCurvetoAccess().getCKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:818:7: otherlv_1= 'c'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulecurveto1884); 

                        	newLeafNode(otherlv_1, grammarAccess.getCurvetoAccess().getCKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:822:2: ( (lv_curveto_argument_sequence_2_0= rulecurveto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:823:1: (lv_curveto_argument_sequence_2_0= rulecurveto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:823:1: (lv_curveto_argument_sequence_2_0= rulecurveto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:824:3: lv_curveto_argument_sequence_2_0= rulecurveto_argument_sequence
            {
             
            	        newCompositeNode(grammarAccess.getCurvetoAccess().getCurveto_argument_sequenceCurveto_argument_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulecurveto_argument_sequence_in_rulecurveto1906);
            lv_curveto_argument_sequence_2_0=rulecurveto_argument_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCurvetoRule());
            	        }
                   		set(
                   			current, 
                   			"curveto_argument_sequence",
                    		lv_curveto_argument_sequence_2_0, 
                    		"curveto_argument_sequence");
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
    // $ANTLR end "rulecurveto"


    // $ANTLR start "entryRulecurveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:848:1: entryRulecurveto_argument_sequence returns [EObject current=null] : iv_rulecurveto_argument_sequence= rulecurveto_argument_sequence EOF ;
    public final EObject entryRulecurveto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecurveto_argument_sequence = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:849:2: (iv_rulecurveto_argument_sequence= rulecurveto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:850:2: iv_rulecurveto_argument_sequence= rulecurveto_argument_sequence EOF
            {
             newCompositeNode(grammarAccess.getCurveto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulecurveto_argument_sequence_in_entryRulecurveto_argument_sequence1942);
            iv_rulecurveto_argument_sequence=rulecurveto_argument_sequence();

            state._fsp--;

             current =iv_rulecurveto_argument_sequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecurveto_argument_sequence1952); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecurveto_argument_sequence"


    // $ANTLR start "rulecurveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:857:1: rulecurveto_argument_sequence returns [EObject current=null] : ( ( (lv_curveto_arguments_0_0= rulecurveto_argument ) ) ( ( rulecomma )? ( (lv_curveto_arguments_2_0= rulecurveto_argument ) ) )* ) ;
    public final EObject rulecurveto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject lv_curveto_arguments_0_0 = null;

        EObject lv_curveto_arguments_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:860:28: ( ( ( (lv_curveto_arguments_0_0= rulecurveto_argument ) ) ( ( rulecomma )? ( (lv_curveto_arguments_2_0= rulecurveto_argument ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:861:1: ( ( (lv_curveto_arguments_0_0= rulecurveto_argument ) ) ( ( rulecomma )? ( (lv_curveto_arguments_2_0= rulecurveto_argument ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:861:1: ( ( (lv_curveto_arguments_0_0= rulecurveto_argument ) ) ( ( rulecomma )? ( (lv_curveto_arguments_2_0= rulecurveto_argument ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:861:2: ( (lv_curveto_arguments_0_0= rulecurveto_argument ) ) ( ( rulecomma )? ( (lv_curveto_arguments_2_0= rulecurveto_argument ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:861:2: ( (lv_curveto_arguments_0_0= rulecurveto_argument ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:862:1: (lv_curveto_arguments_0_0= rulecurveto_argument )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:862:1: (lv_curveto_arguments_0_0= rulecurveto_argument )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:863:3: lv_curveto_arguments_0_0= rulecurveto_argument
            {
             
            	        newCompositeNode(grammarAccess.getCurveto_argument_sequenceAccess().getCurveto_argumentsCurveto_argumentParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecurveto_argument_in_rulecurveto_argument_sequence1998);
            lv_curveto_arguments_0_0=rulecurveto_argument();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCurveto_argument_sequenceRule());
            	        }
                   		add(
                   			current, 
                   			"curveto_arguments",
                    		lv_curveto_arguments_0_0, 
                    		"curveto_argument");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:879:2: ( ( rulecomma )? ( (lv_curveto_arguments_2_0= rulecurveto_argument ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25||(LA19_0>=29 && LA19_0<=40)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:879:3: ( rulecomma )? ( (lv_curveto_arguments_2_0= rulecurveto_argument ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:879:3: ( rulecomma )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==25) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:880:5: rulecomma
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getCurveto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            	                
            	            pushFollow(FOLLOW_rulecomma_in_rulecurveto_argument_sequence2016);
            	            rulecomma();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:887:3: ( (lv_curveto_arguments_2_0= rulecurveto_argument ) )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:888:1: (lv_curveto_arguments_2_0= rulecurveto_argument )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:888:1: (lv_curveto_arguments_2_0= rulecurveto_argument )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:889:3: lv_curveto_arguments_2_0= rulecurveto_argument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCurveto_argument_sequenceAccess().getCurveto_argumentsCurveto_argumentParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecurveto_argument_in_rulecurveto_argument_sequence2038);
            	    lv_curveto_arguments_2_0=rulecurveto_argument();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCurveto_argument_sequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"curveto_arguments",
            	            		lv_curveto_arguments_2_0, 
            	            		"curveto_argument");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "rulecurveto_argument_sequence"


    // $ANTLR start "entryRulecurveto_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:913:1: entryRulecurveto_argument returns [EObject current=null] : iv_rulecurveto_argument= rulecurveto_argument EOF ;
    public final EObject entryRulecurveto_argument() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecurveto_argument = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:914:2: (iv_rulecurveto_argument= rulecurveto_argument EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:915:2: iv_rulecurveto_argument= rulecurveto_argument EOF
            {
             newCompositeNode(grammarAccess.getCurveto_argumentRule()); 
            pushFollow(FOLLOW_rulecurveto_argument_in_entryRulecurveto_argument2076);
            iv_rulecurveto_argument=rulecurveto_argument();

            state._fsp--;

             current =iv_rulecurveto_argument; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecurveto_argument2086); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecurveto_argument"


    // $ANTLR start "rulecurveto_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:922:1: rulecurveto_argument returns [EObject current=null] : ( ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c3_4_0= rulecoordinate_pair ) ) ) ;
    public final EObject rulecurveto_argument() throws RecognitionException {
        EObject current = null;

        EObject lv_c1_0_0 = null;

        EObject lv_c2_2_0 = null;

        EObject lv_c3_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:925:28: ( ( ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c3_4_0= rulecoordinate_pair ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:926:1: ( ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c3_4_0= rulecoordinate_pair ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:926:1: ( ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c3_4_0= rulecoordinate_pair ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:926:2: ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c3_4_0= rulecoordinate_pair ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:926:2: ( (lv_c1_0_0= rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:927:1: (lv_c1_0_0= rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:927:1: (lv_c1_0_0= rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:928:3: lv_c1_0_0= rulecoordinate_pair
            {
             
            	        newCompositeNode(grammarAccess.getCurveto_argumentAccess().getC1Coordinate_pairParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_pair_in_rulecurveto_argument2132);
            lv_c1_0_0=rulecoordinate_pair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCurveto_argumentRule());
            	        }
                   		set(
                   			current, 
                   			"c1",
                    		lv_c1_0_0, 
                    		"coordinate_pair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:944:2: ( rulecomma )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:945:5: rulecomma
                    {
                     
                            newCompositeNode(grammarAccess.getCurveto_argumentAccess().getCommaParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecomma_in_rulecurveto_argument2149);
                    rulecomma();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:952:3: ( (lv_c2_2_0= rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:953:1: (lv_c2_2_0= rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:953:1: (lv_c2_2_0= rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:954:3: lv_c2_2_0= rulecoordinate_pair
            {
             
            	        newCompositeNode(grammarAccess.getCurveto_argumentAccess().getC2Coordinate_pairParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_pair_in_rulecurveto_argument2171);
            lv_c2_2_0=rulecoordinate_pair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCurveto_argumentRule());
            	        }
                   		set(
                   			current, 
                   			"c2",
                    		lv_c2_2_0, 
                    		"coordinate_pair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:970:2: ( rulecomma )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:971:5: rulecomma
                    {
                     
                            newCompositeNode(grammarAccess.getCurveto_argumentAccess().getCommaParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulecomma_in_rulecurveto_argument2188);
                    rulecomma();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:978:3: ( (lv_c3_4_0= rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:979:1: (lv_c3_4_0= rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:979:1: (lv_c3_4_0= rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:980:3: lv_c3_4_0= rulecoordinate_pair
            {
             
            	        newCompositeNode(grammarAccess.getCurveto_argumentAccess().getC3Coordinate_pairParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_pair_in_rulecurveto_argument2210);
            lv_c3_4_0=rulecoordinate_pair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCurveto_argumentRule());
            	        }
                   		set(
                   			current, 
                   			"c3",
                    		lv_c3_4_0, 
                    		"coordinate_pair");
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
    // $ANTLR end "rulecurveto_argument"


    // $ANTLR start "entryRulesmooth_curveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1004:1: entryRulesmooth_curveto returns [EObject current=null] : iv_rulesmooth_curveto= rulesmooth_curveto EOF ;
    public final EObject entryRulesmooth_curveto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesmooth_curveto = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1005:2: (iv_rulesmooth_curveto= rulesmooth_curveto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1006:2: iv_rulesmooth_curveto= rulesmooth_curveto EOF
            {
             newCompositeNode(grammarAccess.getSmooth_curvetoRule()); 
            pushFollow(FOLLOW_rulesmooth_curveto_in_entryRulesmooth_curveto2246);
            iv_rulesmooth_curveto=rulesmooth_curveto();

            state._fsp--;

             current =iv_rulesmooth_curveto; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesmooth_curveto2256); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesmooth_curveto"


    // $ANTLR start "rulesmooth_curveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1013:1: rulesmooth_curveto returns [EObject current=null] : ( (otherlv_0= 'S' | otherlv_1= 's' ) ( (lv_smooth_curveto_argument_sequence_2_0= rulesmooth_curveto_argument_sequence ) ) ) ;
    public final EObject rulesmooth_curveto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_smooth_curveto_argument_sequence_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1016:28: ( ( (otherlv_0= 'S' | otherlv_1= 's' ) ( (lv_smooth_curveto_argument_sequence_2_0= rulesmooth_curveto_argument_sequence ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1017:1: ( (otherlv_0= 'S' | otherlv_1= 's' ) ( (lv_smooth_curveto_argument_sequence_2_0= rulesmooth_curveto_argument_sequence ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1017:1: ( (otherlv_0= 'S' | otherlv_1= 's' ) ( (lv_smooth_curveto_argument_sequence_2_0= rulesmooth_curveto_argument_sequence ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1017:2: (otherlv_0= 'S' | otherlv_1= 's' ) ( (lv_smooth_curveto_argument_sequence_2_0= rulesmooth_curveto_argument_sequence ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1017:2: (otherlv_0= 'S' | otherlv_1= 's' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            else if ( (LA22_0==18) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1017:4: otherlv_0= 'S'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulesmooth_curveto2294); 

                        	newLeafNode(otherlv_0, grammarAccess.getSmooth_curvetoAccess().getSKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1022:7: otherlv_1= 's'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulesmooth_curveto2312); 

                        	newLeafNode(otherlv_1, grammarAccess.getSmooth_curvetoAccess().getSKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1026:2: ( (lv_smooth_curveto_argument_sequence_2_0= rulesmooth_curveto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1027:1: (lv_smooth_curveto_argument_sequence_2_0= rulesmooth_curveto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1027:1: (lv_smooth_curveto_argument_sequence_2_0= rulesmooth_curveto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1028:3: lv_smooth_curveto_argument_sequence_2_0= rulesmooth_curveto_argument_sequence
            {
             
            	        newCompositeNode(grammarAccess.getSmooth_curvetoAccess().getSmooth_curveto_argument_sequenceSmooth_curveto_argument_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulesmooth_curveto_argument_sequence_in_rulesmooth_curveto2334);
            lv_smooth_curveto_argument_sequence_2_0=rulesmooth_curveto_argument_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSmooth_curvetoRule());
            	        }
                   		set(
                   			current, 
                   			"smooth_curveto_argument_sequence",
                    		lv_smooth_curveto_argument_sequence_2_0, 
                    		"smooth_curveto_argument_sequence");
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
    // $ANTLR end "rulesmooth_curveto"


    // $ANTLR start "entryRulesmooth_curveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1052:1: entryRulesmooth_curveto_argument_sequence returns [EObject current=null] : iv_rulesmooth_curveto_argument_sequence= rulesmooth_curveto_argument_sequence EOF ;
    public final EObject entryRulesmooth_curveto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesmooth_curveto_argument_sequence = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1053:2: (iv_rulesmooth_curveto_argument_sequence= rulesmooth_curveto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1054:2: iv_rulesmooth_curveto_argument_sequence= rulesmooth_curveto_argument_sequence EOF
            {
             newCompositeNode(grammarAccess.getSmooth_curveto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulesmooth_curveto_argument_sequence_in_entryRulesmooth_curveto_argument_sequence2370);
            iv_rulesmooth_curveto_argument_sequence=rulesmooth_curveto_argument_sequence();

            state._fsp--;

             current =iv_rulesmooth_curveto_argument_sequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesmooth_curveto_argument_sequence2380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesmooth_curveto_argument_sequence"


    // $ANTLR start "rulesmooth_curveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1061:1: rulesmooth_curveto_argument_sequence returns [EObject current=null] : ( ( (lv_smooth_curveto_arguments_0_0= rulesmooth_curveto_argument ) ) ( ( rulecomma )? ( (lv_smooth_curveto_arguments_2_0= rulesmooth_curveto_argument ) ) )* ) ;
    public final EObject rulesmooth_curveto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject lv_smooth_curveto_arguments_0_0 = null;

        EObject lv_smooth_curveto_arguments_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1064:28: ( ( ( (lv_smooth_curveto_arguments_0_0= rulesmooth_curveto_argument ) ) ( ( rulecomma )? ( (lv_smooth_curveto_arguments_2_0= rulesmooth_curveto_argument ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1065:1: ( ( (lv_smooth_curveto_arguments_0_0= rulesmooth_curveto_argument ) ) ( ( rulecomma )? ( (lv_smooth_curveto_arguments_2_0= rulesmooth_curveto_argument ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1065:1: ( ( (lv_smooth_curveto_arguments_0_0= rulesmooth_curveto_argument ) ) ( ( rulecomma )? ( (lv_smooth_curveto_arguments_2_0= rulesmooth_curveto_argument ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1065:2: ( (lv_smooth_curveto_arguments_0_0= rulesmooth_curveto_argument ) ) ( ( rulecomma )? ( (lv_smooth_curveto_arguments_2_0= rulesmooth_curveto_argument ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1065:2: ( (lv_smooth_curveto_arguments_0_0= rulesmooth_curveto_argument ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1066:1: (lv_smooth_curveto_arguments_0_0= rulesmooth_curveto_argument )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1066:1: (lv_smooth_curveto_arguments_0_0= rulesmooth_curveto_argument )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1067:3: lv_smooth_curveto_arguments_0_0= rulesmooth_curveto_argument
            {
             
            	        newCompositeNode(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getSmooth_curveto_argumentsSmooth_curveto_argumentParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulesmooth_curveto_argument_in_rulesmooth_curveto_argument_sequence2426);
            lv_smooth_curveto_arguments_0_0=rulesmooth_curveto_argument();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSmooth_curveto_argument_sequenceRule());
            	        }
                   		add(
                   			current, 
                   			"smooth_curveto_arguments",
                    		lv_smooth_curveto_arguments_0_0, 
                    		"smooth_curveto_argument");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1083:2: ( ( rulecomma )? ( (lv_smooth_curveto_arguments_2_0= rulesmooth_curveto_argument ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==25||(LA24_0>=29 && LA24_0<=40)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1083:3: ( rulecomma )? ( (lv_smooth_curveto_arguments_2_0= rulesmooth_curveto_argument ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1083:3: ( rulecomma )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==25) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1084:5: rulecomma
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            	                
            	            pushFollow(FOLLOW_rulecomma_in_rulesmooth_curveto_argument_sequence2444);
            	            rulecomma();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1091:3: ( (lv_smooth_curveto_arguments_2_0= rulesmooth_curveto_argument ) )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1092:1: (lv_smooth_curveto_arguments_2_0= rulesmooth_curveto_argument )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1092:1: (lv_smooth_curveto_arguments_2_0= rulesmooth_curveto_argument )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1093:3: lv_smooth_curveto_arguments_2_0= rulesmooth_curveto_argument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getSmooth_curveto_argumentsSmooth_curveto_argumentParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesmooth_curveto_argument_in_rulesmooth_curveto_argument_sequence2466);
            	    lv_smooth_curveto_arguments_2_0=rulesmooth_curveto_argument();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSmooth_curveto_argument_sequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"smooth_curveto_arguments",
            	            		lv_smooth_curveto_arguments_2_0, 
            	            		"smooth_curveto_argument");
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
        }
        return current;
    }
    // $ANTLR end "rulesmooth_curveto_argument_sequence"


    // $ANTLR start "entryRulesmooth_curveto_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1117:1: entryRulesmooth_curveto_argument returns [EObject current=null] : iv_rulesmooth_curveto_argument= rulesmooth_curveto_argument EOF ;
    public final EObject entryRulesmooth_curveto_argument() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesmooth_curveto_argument = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1118:2: (iv_rulesmooth_curveto_argument= rulesmooth_curveto_argument EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1119:2: iv_rulesmooth_curveto_argument= rulesmooth_curveto_argument EOF
            {
             newCompositeNode(grammarAccess.getSmooth_curveto_argumentRule()); 
            pushFollow(FOLLOW_rulesmooth_curveto_argument_in_entryRulesmooth_curveto_argument2504);
            iv_rulesmooth_curveto_argument=rulesmooth_curveto_argument();

            state._fsp--;

             current =iv_rulesmooth_curveto_argument; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesmooth_curveto_argument2514); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesmooth_curveto_argument"


    // $ANTLR start "rulesmooth_curveto_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1126:1: rulesmooth_curveto_argument returns [EObject current=null] : ( ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) ) ) ;
    public final EObject rulesmooth_curveto_argument() throws RecognitionException {
        EObject current = null;

        EObject lv_c1_0_0 = null;

        EObject lv_c2_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1129:28: ( ( ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1130:1: ( ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1130:1: ( ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1130:2: ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1130:2: ( (lv_c1_0_0= rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1131:1: (lv_c1_0_0= rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1131:1: (lv_c1_0_0= rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1132:3: lv_c1_0_0= rulecoordinate_pair
            {
             
            	        newCompositeNode(grammarAccess.getSmooth_curveto_argumentAccess().getC1Coordinate_pairParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_pair_in_rulesmooth_curveto_argument2560);
            lv_c1_0_0=rulecoordinate_pair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSmooth_curveto_argumentRule());
            	        }
                   		set(
                   			current, 
                   			"c1",
                    		lv_c1_0_0, 
                    		"coordinate_pair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1148:2: ( rulecomma )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1149:5: rulecomma
                    {
                     
                            newCompositeNode(grammarAccess.getSmooth_curveto_argumentAccess().getCommaParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecomma_in_rulesmooth_curveto_argument2577);
                    rulecomma();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1156:3: ( (lv_c2_2_0= rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1157:1: (lv_c2_2_0= rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1157:1: (lv_c2_2_0= rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1158:3: lv_c2_2_0= rulecoordinate_pair
            {
             
            	        newCompositeNode(grammarAccess.getSmooth_curveto_argumentAccess().getC2Coordinate_pairParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_pair_in_rulesmooth_curveto_argument2599);
            lv_c2_2_0=rulecoordinate_pair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSmooth_curveto_argumentRule());
            	        }
                   		set(
                   			current, 
                   			"c2",
                    		lv_c2_2_0, 
                    		"coordinate_pair");
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
    // $ANTLR end "rulesmooth_curveto_argument"


    // $ANTLR start "entryRulequadratic_bezier_curveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1182:1: entryRulequadratic_bezier_curveto returns [EObject current=null] : iv_rulequadratic_bezier_curveto= rulequadratic_bezier_curveto EOF ;
    public final EObject entryRulequadratic_bezier_curveto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulequadratic_bezier_curveto = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1183:2: (iv_rulequadratic_bezier_curveto= rulequadratic_bezier_curveto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1184:2: iv_rulequadratic_bezier_curveto= rulequadratic_bezier_curveto EOF
            {
             newCompositeNode(grammarAccess.getQuadratic_bezier_curvetoRule()); 
            pushFollow(FOLLOW_rulequadratic_bezier_curveto_in_entryRulequadratic_bezier_curveto2635);
            iv_rulequadratic_bezier_curveto=rulequadratic_bezier_curveto();

            state._fsp--;

             current =iv_rulequadratic_bezier_curveto; 
            match(input,EOF,FOLLOW_EOF_in_entryRulequadratic_bezier_curveto2645); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulequadratic_bezier_curveto"


    // $ANTLR start "rulequadratic_bezier_curveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1191:1: rulequadratic_bezier_curveto returns [EObject current=null] : ( (otherlv_0= 'Q' | otherlv_1= 'q' ) this_quadratic_bezier_curveto_argument_sequence_2= rulequadratic_bezier_curveto_argument_sequence ) ;
    public final EObject rulequadratic_bezier_curveto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_quadratic_bezier_curveto_argument_sequence_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1194:28: ( ( (otherlv_0= 'Q' | otherlv_1= 'q' ) this_quadratic_bezier_curveto_argument_sequence_2= rulequadratic_bezier_curveto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1195:1: ( (otherlv_0= 'Q' | otherlv_1= 'q' ) this_quadratic_bezier_curveto_argument_sequence_2= rulequadratic_bezier_curveto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1195:1: ( (otherlv_0= 'Q' | otherlv_1= 'q' ) this_quadratic_bezier_curveto_argument_sequence_2= rulequadratic_bezier_curveto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1195:2: (otherlv_0= 'Q' | otherlv_1= 'q' ) this_quadratic_bezier_curveto_argument_sequence_2= rulequadratic_bezier_curveto_argument_sequence
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1195:2: (otherlv_0= 'Q' | otherlv_1= 'q' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            else if ( (LA26_0==20) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1195:4: otherlv_0= 'Q'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulequadratic_bezier_curveto2683); 

                        	newLeafNode(otherlv_0, grammarAccess.getQuadratic_bezier_curvetoAccess().getQKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1200:7: otherlv_1= 'q'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulequadratic_bezier_curveto2701); 

                        	newLeafNode(otherlv_1, grammarAccess.getQuadratic_bezier_curvetoAccess().getQKeyword_0_1());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getQuadratic_bezier_curvetoAccess().getQuadratic_bezier_curveto_argument_sequenceParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulequadratic_bezier_curveto_argument_sequence_in_rulequadratic_bezier_curveto2724);
            this_quadratic_bezier_curveto_argument_sequence_2=rulequadratic_bezier_curveto_argument_sequence();

            state._fsp--;

             
                    current = this_quadratic_bezier_curveto_argument_sequence_2; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "rulequadratic_bezier_curveto"


    // $ANTLR start "entryRulequadratic_bezier_curveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1221:1: entryRulequadratic_bezier_curveto_argument_sequence returns [EObject current=null] : iv_rulequadratic_bezier_curveto_argument_sequence= rulequadratic_bezier_curveto_argument_sequence EOF ;
    public final EObject entryRulequadratic_bezier_curveto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulequadratic_bezier_curveto_argument_sequence = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1222:2: (iv_rulequadratic_bezier_curveto_argument_sequence= rulequadratic_bezier_curveto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1223:2: iv_rulequadratic_bezier_curveto_argument_sequence= rulequadratic_bezier_curveto_argument_sequence EOF
            {
             newCompositeNode(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulequadratic_bezier_curveto_argument_sequence_in_entryRulequadratic_bezier_curveto_argument_sequence2759);
            iv_rulequadratic_bezier_curveto_argument_sequence=rulequadratic_bezier_curveto_argument_sequence();

            state._fsp--;

             current =iv_rulequadratic_bezier_curveto_argument_sequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulequadratic_bezier_curveto_argument_sequence2769); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulequadratic_bezier_curveto_argument_sequence"


    // $ANTLR start "rulequadratic_bezier_curveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1230:1: rulequadratic_bezier_curveto_argument_sequence returns [EObject current=null] : ( ( (lv_quadratic_bezier_curveto_arguments_0_0= rulequadratic_bezier_curveto_argument ) ) ( ( rulecomma )? ( (lv_quadratic_bezier_curveto_arguments_2_0= rulequadratic_bezier_curveto_argument ) ) )* ) ;
    public final EObject rulequadratic_bezier_curveto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject lv_quadratic_bezier_curveto_arguments_0_0 = null;

        EObject lv_quadratic_bezier_curveto_arguments_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1233:28: ( ( ( (lv_quadratic_bezier_curveto_arguments_0_0= rulequadratic_bezier_curveto_argument ) ) ( ( rulecomma )? ( (lv_quadratic_bezier_curveto_arguments_2_0= rulequadratic_bezier_curveto_argument ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1234:1: ( ( (lv_quadratic_bezier_curveto_arguments_0_0= rulequadratic_bezier_curveto_argument ) ) ( ( rulecomma )? ( (lv_quadratic_bezier_curveto_arguments_2_0= rulequadratic_bezier_curveto_argument ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1234:1: ( ( (lv_quadratic_bezier_curveto_arguments_0_0= rulequadratic_bezier_curveto_argument ) ) ( ( rulecomma )? ( (lv_quadratic_bezier_curveto_arguments_2_0= rulequadratic_bezier_curveto_argument ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1234:2: ( (lv_quadratic_bezier_curveto_arguments_0_0= rulequadratic_bezier_curveto_argument ) ) ( ( rulecomma )? ( (lv_quadratic_bezier_curveto_arguments_2_0= rulequadratic_bezier_curveto_argument ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1234:2: ( (lv_quadratic_bezier_curveto_arguments_0_0= rulequadratic_bezier_curveto_argument ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1235:1: (lv_quadratic_bezier_curveto_arguments_0_0= rulequadratic_bezier_curveto_argument )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1235:1: (lv_quadratic_bezier_curveto_arguments_0_0= rulequadratic_bezier_curveto_argument )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1236:3: lv_quadratic_bezier_curveto_arguments_0_0= rulequadratic_bezier_curveto_argument
            {
             
            	        newCompositeNode(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getQuadratic_bezier_curveto_argumentsQuadratic_bezier_curveto_argumentParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulequadratic_bezier_curveto_argument_in_rulequadratic_bezier_curveto_argument_sequence2815);
            lv_quadratic_bezier_curveto_arguments_0_0=rulequadratic_bezier_curveto_argument();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceRule());
            	        }
                   		add(
                   			current, 
                   			"quadratic_bezier_curveto_arguments",
                    		lv_quadratic_bezier_curveto_arguments_0_0, 
                    		"quadratic_bezier_curveto_argument");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1252:2: ( ( rulecomma )? ( (lv_quadratic_bezier_curveto_arguments_2_0= rulequadratic_bezier_curveto_argument ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25||(LA28_0>=29 && LA28_0<=40)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1252:3: ( rulecomma )? ( (lv_quadratic_bezier_curveto_arguments_2_0= rulequadratic_bezier_curveto_argument ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1252:3: ( rulecomma )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==25) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1253:5: rulecomma
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            	                
            	            pushFollow(FOLLOW_rulecomma_in_rulequadratic_bezier_curveto_argument_sequence2833);
            	            rulecomma();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1260:3: ( (lv_quadratic_bezier_curveto_arguments_2_0= rulequadratic_bezier_curveto_argument ) )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1261:1: (lv_quadratic_bezier_curveto_arguments_2_0= rulequadratic_bezier_curveto_argument )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1261:1: (lv_quadratic_bezier_curveto_arguments_2_0= rulequadratic_bezier_curveto_argument )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1262:3: lv_quadratic_bezier_curveto_arguments_2_0= rulequadratic_bezier_curveto_argument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getQuadratic_bezier_curveto_argumentsQuadratic_bezier_curveto_argumentParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulequadratic_bezier_curveto_argument_in_rulequadratic_bezier_curveto_argument_sequence2855);
            	    lv_quadratic_bezier_curveto_arguments_2_0=rulequadratic_bezier_curveto_argument();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"quadratic_bezier_curveto_arguments",
            	            		lv_quadratic_bezier_curveto_arguments_2_0, 
            	            		"quadratic_bezier_curveto_argument");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "rulequadratic_bezier_curveto_argument_sequence"


    // $ANTLR start "entryRulequadratic_bezier_curveto_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1286:1: entryRulequadratic_bezier_curveto_argument returns [EObject current=null] : iv_rulequadratic_bezier_curveto_argument= rulequadratic_bezier_curveto_argument EOF ;
    public final EObject entryRulequadratic_bezier_curveto_argument() throws RecognitionException {
        EObject current = null;

        EObject iv_rulequadratic_bezier_curveto_argument = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1287:2: (iv_rulequadratic_bezier_curveto_argument= rulequadratic_bezier_curveto_argument EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1288:2: iv_rulequadratic_bezier_curveto_argument= rulequadratic_bezier_curveto_argument EOF
            {
             newCompositeNode(grammarAccess.getQuadratic_bezier_curveto_argumentRule()); 
            pushFollow(FOLLOW_rulequadratic_bezier_curveto_argument_in_entryRulequadratic_bezier_curveto_argument2893);
            iv_rulequadratic_bezier_curveto_argument=rulequadratic_bezier_curveto_argument();

            state._fsp--;

             current =iv_rulequadratic_bezier_curveto_argument; 
            match(input,EOF,FOLLOW_EOF_in_entryRulequadratic_bezier_curveto_argument2903); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulequadratic_bezier_curveto_argument"


    // $ANTLR start "rulequadratic_bezier_curveto_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1295:1: rulequadratic_bezier_curveto_argument returns [EObject current=null] : ( ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) ) ) ;
    public final EObject rulequadratic_bezier_curveto_argument() throws RecognitionException {
        EObject current = null;

        EObject lv_c1_0_0 = null;

        EObject lv_c2_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1298:28: ( ( ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1299:1: ( ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1299:1: ( ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1299:2: ( (lv_c1_0_0= rulecoordinate_pair ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate_pair ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1299:2: ( (lv_c1_0_0= rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1300:1: (lv_c1_0_0= rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1300:1: (lv_c1_0_0= rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1301:3: lv_c1_0_0= rulecoordinate_pair
            {
             
            	        newCompositeNode(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getC1Coordinate_pairParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_pair_in_rulequadratic_bezier_curveto_argument2949);
            lv_c1_0_0=rulecoordinate_pair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuadratic_bezier_curveto_argumentRule());
            	        }
                   		set(
                   			current, 
                   			"c1",
                    		lv_c1_0_0, 
                    		"coordinate_pair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1317:2: ( rulecomma )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1318:5: rulecomma
                    {
                     
                            newCompositeNode(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getCommaParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecomma_in_rulequadratic_bezier_curveto_argument2966);
                    rulecomma();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1325:3: ( (lv_c2_2_0= rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1326:1: (lv_c2_2_0= rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1326:1: (lv_c2_2_0= rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1327:3: lv_c2_2_0= rulecoordinate_pair
            {
             
            	        newCompositeNode(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getC2Coordinate_pairParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_pair_in_rulequadratic_bezier_curveto_argument2988);
            lv_c2_2_0=rulecoordinate_pair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuadratic_bezier_curveto_argumentRule());
            	        }
                   		set(
                   			current, 
                   			"c2",
                    		lv_c2_2_0, 
                    		"coordinate_pair");
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
    // $ANTLR end "rulequadratic_bezier_curveto_argument"


    // $ANTLR start "entryRulesmooth_quadratic_bezier_curveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1351:1: entryRulesmooth_quadratic_bezier_curveto returns [EObject current=null] : iv_rulesmooth_quadratic_bezier_curveto= rulesmooth_quadratic_bezier_curveto EOF ;
    public final EObject entryRulesmooth_quadratic_bezier_curveto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesmooth_quadratic_bezier_curveto = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1352:2: (iv_rulesmooth_quadratic_bezier_curveto= rulesmooth_quadratic_bezier_curveto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1353:2: iv_rulesmooth_quadratic_bezier_curveto= rulesmooth_quadratic_bezier_curveto EOF
            {
             newCompositeNode(grammarAccess.getSmooth_quadratic_bezier_curvetoRule()); 
            pushFollow(FOLLOW_rulesmooth_quadratic_bezier_curveto_in_entryRulesmooth_quadratic_bezier_curveto3024);
            iv_rulesmooth_quadratic_bezier_curveto=rulesmooth_quadratic_bezier_curveto();

            state._fsp--;

             current =iv_rulesmooth_quadratic_bezier_curveto; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesmooth_quadratic_bezier_curveto3034); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesmooth_quadratic_bezier_curveto"


    // $ANTLR start "rulesmooth_quadratic_bezier_curveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1360:1: rulesmooth_quadratic_bezier_curveto returns [EObject current=null] : ( (otherlv_0= 'T' | otherlv_1= 't' ) ( (lv_smooth_quadratic_bezier_curveto_argument_sequence_2_0= rulesmooth_quadratic_bezier_curveto_argument_sequence ) ) ) ;
    public final EObject rulesmooth_quadratic_bezier_curveto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_smooth_quadratic_bezier_curveto_argument_sequence_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1363:28: ( ( (otherlv_0= 'T' | otherlv_1= 't' ) ( (lv_smooth_quadratic_bezier_curveto_argument_sequence_2_0= rulesmooth_quadratic_bezier_curveto_argument_sequence ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1364:1: ( (otherlv_0= 'T' | otherlv_1= 't' ) ( (lv_smooth_quadratic_bezier_curveto_argument_sequence_2_0= rulesmooth_quadratic_bezier_curveto_argument_sequence ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1364:1: ( (otherlv_0= 'T' | otherlv_1= 't' ) ( (lv_smooth_quadratic_bezier_curveto_argument_sequence_2_0= rulesmooth_quadratic_bezier_curveto_argument_sequence ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1364:2: (otherlv_0= 'T' | otherlv_1= 't' ) ( (lv_smooth_quadratic_bezier_curveto_argument_sequence_2_0= rulesmooth_quadratic_bezier_curveto_argument_sequence ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1364:2: (otherlv_0= 'T' | otherlv_1= 't' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            else if ( (LA30_0==22) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1364:4: otherlv_0= 'T'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_rulesmooth_quadratic_bezier_curveto3072); 

                        	newLeafNode(otherlv_0, grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getTKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1369:7: otherlv_1= 't'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulesmooth_quadratic_bezier_curveto3090); 

                        	newLeafNode(otherlv_1, grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getTKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1373:2: ( (lv_smooth_quadratic_bezier_curveto_argument_sequence_2_0= rulesmooth_quadratic_bezier_curveto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1374:1: (lv_smooth_quadratic_bezier_curveto_argument_sequence_2_0= rulesmooth_quadratic_bezier_curveto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1374:1: (lv_smooth_quadratic_bezier_curveto_argument_sequence_2_0= rulesmooth_quadratic_bezier_curveto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1375:3: lv_smooth_quadratic_bezier_curveto_argument_sequence_2_0= rulesmooth_quadratic_bezier_curveto_argument_sequence
            {
             
            	        newCompositeNode(grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getSmooth_quadratic_bezier_curveto_argument_sequenceSmooth_quadratic_bezier_curveto_argument_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulesmooth_quadratic_bezier_curveto_argument_sequence_in_rulesmooth_quadratic_bezier_curveto3112);
            lv_smooth_quadratic_bezier_curveto_argument_sequence_2_0=rulesmooth_quadratic_bezier_curveto_argument_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSmooth_quadratic_bezier_curvetoRule());
            	        }
                   		set(
                   			current, 
                   			"smooth_quadratic_bezier_curveto_argument_sequence",
                    		lv_smooth_quadratic_bezier_curveto_argument_sequence_2_0, 
                    		"smooth_quadratic_bezier_curveto_argument_sequence");
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
    // $ANTLR end "rulesmooth_quadratic_bezier_curveto"


    // $ANTLR start "entryRulesmooth_quadratic_bezier_curveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1399:1: entryRulesmooth_quadratic_bezier_curveto_argument_sequence returns [EObject current=null] : iv_rulesmooth_quadratic_bezier_curveto_argument_sequence= rulesmooth_quadratic_bezier_curveto_argument_sequence EOF ;
    public final EObject entryRulesmooth_quadratic_bezier_curveto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesmooth_quadratic_bezier_curveto_argument_sequence = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1400:2: (iv_rulesmooth_quadratic_bezier_curveto_argument_sequence= rulesmooth_quadratic_bezier_curveto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1401:2: iv_rulesmooth_quadratic_bezier_curveto_argument_sequence= rulesmooth_quadratic_bezier_curveto_argument_sequence EOF
            {
             newCompositeNode(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulesmooth_quadratic_bezier_curveto_argument_sequence_in_entryRulesmooth_quadratic_bezier_curveto_argument_sequence3148);
            iv_rulesmooth_quadratic_bezier_curveto_argument_sequence=rulesmooth_quadratic_bezier_curveto_argument_sequence();

            state._fsp--;

             current =iv_rulesmooth_quadratic_bezier_curveto_argument_sequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesmooth_quadratic_bezier_curveto_argument_sequence3158); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesmooth_quadratic_bezier_curveto_argument_sequence"


    // $ANTLR start "rulesmooth_quadratic_bezier_curveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1408:1: rulesmooth_quadratic_bezier_curveto_argument_sequence returns [EObject current=null] : ( ( (lv_coordinate_pairs_0_0= rulecoordinate_pair ) ) ( ( rulecomma )? ( (lv_coordinate_pairs_2_0= rulecoordinate_pair ) ) )* ) ;
    public final EObject rulesmooth_quadratic_bezier_curveto_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject lv_coordinate_pairs_0_0 = null;

        EObject lv_coordinate_pairs_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1411:28: ( ( ( (lv_coordinate_pairs_0_0= rulecoordinate_pair ) ) ( ( rulecomma )? ( (lv_coordinate_pairs_2_0= rulecoordinate_pair ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1412:1: ( ( (lv_coordinate_pairs_0_0= rulecoordinate_pair ) ) ( ( rulecomma )? ( (lv_coordinate_pairs_2_0= rulecoordinate_pair ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1412:1: ( ( (lv_coordinate_pairs_0_0= rulecoordinate_pair ) ) ( ( rulecomma )? ( (lv_coordinate_pairs_2_0= rulecoordinate_pair ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1412:2: ( (lv_coordinate_pairs_0_0= rulecoordinate_pair ) ) ( ( rulecomma )? ( (lv_coordinate_pairs_2_0= rulecoordinate_pair ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1412:2: ( (lv_coordinate_pairs_0_0= rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1413:1: (lv_coordinate_pairs_0_0= rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1413:1: (lv_coordinate_pairs_0_0= rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1414:3: lv_coordinate_pairs_0_0= rulecoordinate_pair
            {
             
            	        newCompositeNode(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getCoordinate_pairsCoordinate_pairParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_pair_in_rulesmooth_quadratic_bezier_curveto_argument_sequence3204);
            lv_coordinate_pairs_0_0=rulecoordinate_pair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceRule());
            	        }
                   		add(
                   			current, 
                   			"coordinate_pairs",
                    		lv_coordinate_pairs_0_0, 
                    		"coordinate_pair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1430:2: ( ( rulecomma )? ( (lv_coordinate_pairs_2_0= rulecoordinate_pair ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==25||(LA32_0>=29 && LA32_0<=40)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1430:3: ( rulecomma )? ( (lv_coordinate_pairs_2_0= rulecoordinate_pair ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1430:3: ( rulecomma )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==25) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1431:5: rulecomma
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            	                
            	            pushFollow(FOLLOW_rulecomma_in_rulesmooth_quadratic_bezier_curveto_argument_sequence3222);
            	            rulecomma();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1438:3: ( (lv_coordinate_pairs_2_0= rulecoordinate_pair ) )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1439:1: (lv_coordinate_pairs_2_0= rulecoordinate_pair )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1439:1: (lv_coordinate_pairs_2_0= rulecoordinate_pair )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1440:3: lv_coordinate_pairs_2_0= rulecoordinate_pair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getCoordinate_pairsCoordinate_pairParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecoordinate_pair_in_rulesmooth_quadratic_bezier_curveto_argument_sequence3244);
            	    lv_coordinate_pairs_2_0=rulecoordinate_pair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"coordinate_pairs",
            	            		lv_coordinate_pairs_2_0, 
            	            		"coordinate_pair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "rulesmooth_quadratic_bezier_curveto_argument_sequence"


    // $ANTLR start "entryRuleelliptical_arc"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1464:1: entryRuleelliptical_arc returns [EObject current=null] : iv_ruleelliptical_arc= ruleelliptical_arc EOF ;
    public final EObject entryRuleelliptical_arc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelliptical_arc = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1465:2: (iv_ruleelliptical_arc= ruleelliptical_arc EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1466:2: iv_ruleelliptical_arc= ruleelliptical_arc EOF
            {
             newCompositeNode(grammarAccess.getElliptical_arcRule()); 
            pushFollow(FOLLOW_ruleelliptical_arc_in_entryRuleelliptical_arc3282);
            iv_ruleelliptical_arc=ruleelliptical_arc();

            state._fsp--;

             current =iv_ruleelliptical_arc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelliptical_arc3292); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleelliptical_arc"


    // $ANTLR start "ruleelliptical_arc"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1473:1: ruleelliptical_arc returns [EObject current=null] : ( (otherlv_0= 'A' | otherlv_1= 'a' ) ( (lv_elliptical_arc_argument_sequence_2_0= ruleelliptical_arc_argument_sequence ) ) ) ;
    public final EObject ruleelliptical_arc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_elliptical_arc_argument_sequence_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1476:28: ( ( (otherlv_0= 'A' | otherlv_1= 'a' ) ( (lv_elliptical_arc_argument_sequence_2_0= ruleelliptical_arc_argument_sequence ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1477:1: ( (otherlv_0= 'A' | otherlv_1= 'a' ) ( (lv_elliptical_arc_argument_sequence_2_0= ruleelliptical_arc_argument_sequence ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1477:1: ( (otherlv_0= 'A' | otherlv_1= 'a' ) ( (lv_elliptical_arc_argument_sequence_2_0= ruleelliptical_arc_argument_sequence ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1477:2: (otherlv_0= 'A' | otherlv_1= 'a' ) ( (lv_elliptical_arc_argument_sequence_2_0= ruleelliptical_arc_argument_sequence ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1477:2: (otherlv_0= 'A' | otherlv_1= 'a' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            else if ( (LA33_0==24) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1477:4: otherlv_0= 'A'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleelliptical_arc3330); 

                        	newLeafNode(otherlv_0, grammarAccess.getElliptical_arcAccess().getAKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1482:7: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleelliptical_arc3348); 

                        	newLeafNode(otherlv_1, grammarAccess.getElliptical_arcAccess().getAKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1486:2: ( (lv_elliptical_arc_argument_sequence_2_0= ruleelliptical_arc_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1487:1: (lv_elliptical_arc_argument_sequence_2_0= ruleelliptical_arc_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1487:1: (lv_elliptical_arc_argument_sequence_2_0= ruleelliptical_arc_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1488:3: lv_elliptical_arc_argument_sequence_2_0= ruleelliptical_arc_argument_sequence
            {
             
            	        newCompositeNode(grammarAccess.getElliptical_arcAccess().getElliptical_arc_argument_sequenceElliptical_arc_argument_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleelliptical_arc_argument_sequence_in_ruleelliptical_arc3370);
            lv_elliptical_arc_argument_sequence_2_0=ruleelliptical_arc_argument_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElliptical_arcRule());
            	        }
                   		set(
                   			current, 
                   			"elliptical_arc_argument_sequence",
                    		lv_elliptical_arc_argument_sequence_2_0, 
                    		"elliptical_arc_argument_sequence");
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
    // $ANTLR end "ruleelliptical_arc"


    // $ANTLR start "entryRuleelliptical_arc_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1512:1: entryRuleelliptical_arc_argument_sequence returns [EObject current=null] : iv_ruleelliptical_arc_argument_sequence= ruleelliptical_arc_argument_sequence EOF ;
    public final EObject entryRuleelliptical_arc_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelliptical_arc_argument_sequence = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1513:2: (iv_ruleelliptical_arc_argument_sequence= ruleelliptical_arc_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1514:2: iv_ruleelliptical_arc_argument_sequence= ruleelliptical_arc_argument_sequence EOF
            {
             newCompositeNode(grammarAccess.getElliptical_arc_argument_sequenceRule()); 
            pushFollow(FOLLOW_ruleelliptical_arc_argument_sequence_in_entryRuleelliptical_arc_argument_sequence3406);
            iv_ruleelliptical_arc_argument_sequence=ruleelliptical_arc_argument_sequence();

            state._fsp--;

             current =iv_ruleelliptical_arc_argument_sequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelliptical_arc_argument_sequence3416); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleelliptical_arc_argument_sequence"


    // $ANTLR start "ruleelliptical_arc_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1521:1: ruleelliptical_arc_argument_sequence returns [EObject current=null] : ( ( (lv_elliptical_arc_arguments_0_0= ruleelliptical_arc_argument ) ) ( ( rulecomma )? ( (lv_elliptical_arc_arguments_2_0= ruleelliptical_arc_argument ) ) )* ) ;
    public final EObject ruleelliptical_arc_argument_sequence() throws RecognitionException {
        EObject current = null;

        EObject lv_elliptical_arc_arguments_0_0 = null;

        EObject lv_elliptical_arc_arguments_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1524:28: ( ( ( (lv_elliptical_arc_arguments_0_0= ruleelliptical_arc_argument ) ) ( ( rulecomma )? ( (lv_elliptical_arc_arguments_2_0= ruleelliptical_arc_argument ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1525:1: ( ( (lv_elliptical_arc_arguments_0_0= ruleelliptical_arc_argument ) ) ( ( rulecomma )? ( (lv_elliptical_arc_arguments_2_0= ruleelliptical_arc_argument ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1525:1: ( ( (lv_elliptical_arc_arguments_0_0= ruleelliptical_arc_argument ) ) ( ( rulecomma )? ( (lv_elliptical_arc_arguments_2_0= ruleelliptical_arc_argument ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1525:2: ( (lv_elliptical_arc_arguments_0_0= ruleelliptical_arc_argument ) ) ( ( rulecomma )? ( (lv_elliptical_arc_arguments_2_0= ruleelliptical_arc_argument ) ) )*
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1525:2: ( (lv_elliptical_arc_arguments_0_0= ruleelliptical_arc_argument ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1526:1: (lv_elliptical_arc_arguments_0_0= ruleelliptical_arc_argument )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1526:1: (lv_elliptical_arc_arguments_0_0= ruleelliptical_arc_argument )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1527:3: lv_elliptical_arc_arguments_0_0= ruleelliptical_arc_argument
            {
             
            	        newCompositeNode(grammarAccess.getElliptical_arc_argument_sequenceAccess().getElliptical_arc_argumentsElliptical_arc_argumentParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleelliptical_arc_argument_in_ruleelliptical_arc_argument_sequence3462);
            lv_elliptical_arc_arguments_0_0=ruleelliptical_arc_argument();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElliptical_arc_argument_sequenceRule());
            	        }
                   		add(
                   			current, 
                   			"elliptical_arc_arguments",
                    		lv_elliptical_arc_arguments_0_0, 
                    		"elliptical_arc_argument");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1543:2: ( ( rulecomma )? ( (lv_elliptical_arc_arguments_2_0= ruleelliptical_arc_argument ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==25||(LA35_0>=29 && LA35_0<=38)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1543:3: ( rulecomma )? ( (lv_elliptical_arc_arguments_2_0= ruleelliptical_arc_argument ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1543:3: ( rulecomma )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==25) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1544:5: rulecomma
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getElliptical_arc_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            	                
            	            pushFollow(FOLLOW_rulecomma_in_ruleelliptical_arc_argument_sequence3480);
            	            rulecomma();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1551:3: ( (lv_elliptical_arc_arguments_2_0= ruleelliptical_arc_argument ) )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1552:1: (lv_elliptical_arc_arguments_2_0= ruleelliptical_arc_argument )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1552:1: (lv_elliptical_arc_arguments_2_0= ruleelliptical_arc_argument )
            	    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1553:3: lv_elliptical_arc_arguments_2_0= ruleelliptical_arc_argument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getElliptical_arc_argument_sequenceAccess().getElliptical_arc_argumentsElliptical_arc_argumentParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleelliptical_arc_argument_in_ruleelliptical_arc_argument_sequence3502);
            	    lv_elliptical_arc_arguments_2_0=ruleelliptical_arc_argument();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getElliptical_arc_argument_sequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elliptical_arc_arguments",
            	            		lv_elliptical_arc_arguments_2_0, 
            	            		"elliptical_arc_argument");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleelliptical_arc_argument_sequence"


    // $ANTLR start "entryRuleelliptical_arc_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1577:1: entryRuleelliptical_arc_argument returns [EObject current=null] : iv_ruleelliptical_arc_argument= ruleelliptical_arc_argument EOF ;
    public final EObject entryRuleelliptical_arc_argument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelliptical_arc_argument = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1578:2: (iv_ruleelliptical_arc_argument= ruleelliptical_arc_argument EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1579:2: iv_ruleelliptical_arc_argument= ruleelliptical_arc_argument EOF
            {
             newCompositeNode(grammarAccess.getElliptical_arc_argumentRule()); 
            pushFollow(FOLLOW_ruleelliptical_arc_argument_in_entryRuleelliptical_arc_argument3540);
            iv_ruleelliptical_arc_argument=ruleelliptical_arc_argument();

            state._fsp--;

             current =iv_ruleelliptical_arc_argument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelliptical_arc_argument3550); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleelliptical_arc_argument"


    // $ANTLR start "ruleelliptical_arc_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1586:1: ruleelliptical_arc_argument returns [EObject current=null] : ( ( (lv_rx_0_0= rulenonnegative_number ) ) ( rulecomma )? ( (lv_ry_2_0= rulenonnegative_number ) ) ( rulecomma )? ( (lv_rotation_4_0= rulenumber ) ) rulecomma ( (lv_largearcflag_6_0= ruleflag ) ) ( rulecomma )? ( (lv_sweepflag_8_0= ruleflag ) ) ( rulecomma )? ( (lv_coordinate_pair_10_0= rulecoordinate_pair ) ) ) ;
    public final EObject ruleelliptical_arc_argument() throws RecognitionException {
        EObject current = null;

        EObject lv_rx_0_0 = null;

        EObject lv_ry_2_0 = null;

        EObject lv_rotation_4_0 = null;

        AntlrDatatypeRuleToken lv_largearcflag_6_0 = null;

        AntlrDatatypeRuleToken lv_sweepflag_8_0 = null;

        EObject lv_coordinate_pair_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1589:28: ( ( ( (lv_rx_0_0= rulenonnegative_number ) ) ( rulecomma )? ( (lv_ry_2_0= rulenonnegative_number ) ) ( rulecomma )? ( (lv_rotation_4_0= rulenumber ) ) rulecomma ( (lv_largearcflag_6_0= ruleflag ) ) ( rulecomma )? ( (lv_sweepflag_8_0= ruleflag ) ) ( rulecomma )? ( (lv_coordinate_pair_10_0= rulecoordinate_pair ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1590:1: ( ( (lv_rx_0_0= rulenonnegative_number ) ) ( rulecomma )? ( (lv_ry_2_0= rulenonnegative_number ) ) ( rulecomma )? ( (lv_rotation_4_0= rulenumber ) ) rulecomma ( (lv_largearcflag_6_0= ruleflag ) ) ( rulecomma )? ( (lv_sweepflag_8_0= ruleflag ) ) ( rulecomma )? ( (lv_coordinate_pair_10_0= rulecoordinate_pair ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1590:1: ( ( (lv_rx_0_0= rulenonnegative_number ) ) ( rulecomma )? ( (lv_ry_2_0= rulenonnegative_number ) ) ( rulecomma )? ( (lv_rotation_4_0= rulenumber ) ) rulecomma ( (lv_largearcflag_6_0= ruleflag ) ) ( rulecomma )? ( (lv_sweepflag_8_0= ruleflag ) ) ( rulecomma )? ( (lv_coordinate_pair_10_0= rulecoordinate_pair ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1590:2: ( (lv_rx_0_0= rulenonnegative_number ) ) ( rulecomma )? ( (lv_ry_2_0= rulenonnegative_number ) ) ( rulecomma )? ( (lv_rotation_4_0= rulenumber ) ) rulecomma ( (lv_largearcflag_6_0= ruleflag ) ) ( rulecomma )? ( (lv_sweepflag_8_0= ruleflag ) ) ( rulecomma )? ( (lv_coordinate_pair_10_0= rulecoordinate_pair ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1590:2: ( (lv_rx_0_0= rulenonnegative_number ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1591:1: (lv_rx_0_0= rulenonnegative_number )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1591:1: (lv_rx_0_0= rulenonnegative_number )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1592:3: lv_rx_0_0= rulenonnegative_number
            {
             
            	        newCompositeNode(grammarAccess.getElliptical_arc_argumentAccess().getRxNonnegative_numberParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulenonnegative_number_in_ruleelliptical_arc_argument3596);
            lv_rx_0_0=rulenonnegative_number();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElliptical_arc_argumentRule());
            	        }
                   		set(
                   			current, 
                   			"rx",
                    		lv_rx_0_0, 
                    		"nonnegative_number");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1608:2: ( rulecomma )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1609:5: rulecomma
                    {
                     
                            newCompositeNode(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecomma_in_ruleelliptical_arc_argument3613);
                    rulecomma();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1616:3: ( (lv_ry_2_0= rulenonnegative_number ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1617:1: (lv_ry_2_0= rulenonnegative_number )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1617:1: (lv_ry_2_0= rulenonnegative_number )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1618:3: lv_ry_2_0= rulenonnegative_number
            {
             
            	        newCompositeNode(grammarAccess.getElliptical_arc_argumentAccess().getRyNonnegative_numberParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulenonnegative_number_in_ruleelliptical_arc_argument3635);
            lv_ry_2_0=rulenonnegative_number();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElliptical_arc_argumentRule());
            	        }
                   		set(
                   			current, 
                   			"ry",
                    		lv_ry_2_0, 
                    		"nonnegative_number");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1634:2: ( rulecomma )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==25) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1635:5: rulecomma
                    {
                     
                            newCompositeNode(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulecomma_in_ruleelliptical_arc_argument3652);
                    rulecomma();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1642:3: ( (lv_rotation_4_0= rulenumber ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1643:1: (lv_rotation_4_0= rulenumber )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1643:1: (lv_rotation_4_0= rulenumber )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1644:3: lv_rotation_4_0= rulenumber
            {
             
            	        newCompositeNode(grammarAccess.getElliptical_arc_argumentAccess().getRotationNumberParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulenumber_in_ruleelliptical_arc_argument3674);
            lv_rotation_4_0=rulenumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElliptical_arc_argumentRule());
            	        }
                   		set(
                   			current, 
                   			"rotation",
                    		lv_rotation_4_0, 
                    		"number");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_5()); 
                
            pushFollow(FOLLOW_rulecomma_in_ruleelliptical_arc_argument3690);
            rulecomma();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1668:1: ( (lv_largearcflag_6_0= ruleflag ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1669:1: (lv_largearcflag_6_0= ruleflag )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1669:1: (lv_largearcflag_6_0= ruleflag )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1670:3: lv_largearcflag_6_0= ruleflag
            {
             
            	        newCompositeNode(grammarAccess.getElliptical_arc_argumentAccess().getLargearcflagFlagParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleflag_in_ruleelliptical_arc_argument3710);
            lv_largearcflag_6_0=ruleflag();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElliptical_arc_argumentRule());
            	        }
                   		set(
                   			current, 
                   			"largearcflag",
                    		lv_largearcflag_6_0, 
                    		"flag");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1686:2: ( rulecomma )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1687:5: rulecomma
                    {
                     
                            newCompositeNode(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulecomma_in_ruleelliptical_arc_argument3727);
                    rulecomma();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1694:3: ( (lv_sweepflag_8_0= ruleflag ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1695:1: (lv_sweepflag_8_0= ruleflag )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1695:1: (lv_sweepflag_8_0= ruleflag )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1696:3: lv_sweepflag_8_0= ruleflag
            {
             
            	        newCompositeNode(grammarAccess.getElliptical_arc_argumentAccess().getSweepflagFlagParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleflag_in_ruleelliptical_arc_argument3749);
            lv_sweepflag_8_0=ruleflag();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElliptical_arc_argumentRule());
            	        }
                   		set(
                   			current, 
                   			"sweepflag",
                    		lv_sweepflag_8_0, 
                    		"flag");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1712:2: ( rulecomma )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1713:5: rulecomma
                    {
                     
                            newCompositeNode(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_rulecomma_in_ruleelliptical_arc_argument3766);
                    rulecomma();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1720:3: ( (lv_coordinate_pair_10_0= rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1721:1: (lv_coordinate_pair_10_0= rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1721:1: (lv_coordinate_pair_10_0= rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1722:3: lv_coordinate_pair_10_0= rulecoordinate_pair
            {
             
            	        newCompositeNode(grammarAccess.getElliptical_arc_argumentAccess().getCoordinate_pairCoordinate_pairParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_pair_in_ruleelliptical_arc_argument3788);
            lv_coordinate_pair_10_0=rulecoordinate_pair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElliptical_arc_argumentRule());
            	        }
                   		set(
                   			current, 
                   			"coordinate_pair",
                    		lv_coordinate_pair_10_0, 
                    		"coordinate_pair");
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
    // $ANTLR end "ruleelliptical_arc_argument"


    // $ANTLR start "entryRulecoordinate_pair"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1746:1: entryRulecoordinate_pair returns [EObject current=null] : iv_rulecoordinate_pair= rulecoordinate_pair EOF ;
    public final EObject entryRulecoordinate_pair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecoordinate_pair = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1747:2: (iv_rulecoordinate_pair= rulecoordinate_pair EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1748:2: iv_rulecoordinate_pair= rulecoordinate_pair EOF
            {
             newCompositeNode(grammarAccess.getCoordinate_pairRule()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_entryRulecoordinate_pair3824);
            iv_rulecoordinate_pair=rulecoordinate_pair();

            state._fsp--;

             current =iv_rulecoordinate_pair; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecoordinate_pair3834); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecoordinate_pair"


    // $ANTLR start "rulecoordinate_pair"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1755:1: rulecoordinate_pair returns [EObject current=null] : ( ( (lv_c1_0_0= rulecoordinate ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate ) ) ) ;
    public final EObject rulecoordinate_pair() throws RecognitionException {
        EObject current = null;

        EObject lv_c1_0_0 = null;

        EObject lv_c2_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1758:28: ( ( ( (lv_c1_0_0= rulecoordinate ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1759:1: ( ( (lv_c1_0_0= rulecoordinate ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1759:1: ( ( (lv_c1_0_0= rulecoordinate ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1759:2: ( (lv_c1_0_0= rulecoordinate ) ) ( rulecomma )? ( (lv_c2_2_0= rulecoordinate ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1759:2: ( (lv_c1_0_0= rulecoordinate ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1760:1: (lv_c1_0_0= rulecoordinate )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1760:1: (lv_c1_0_0= rulecoordinate )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1761:3: lv_c1_0_0= rulecoordinate
            {
             
            	        newCompositeNode(grammarAccess.getCoordinate_pairAccess().getC1CoordinateParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_in_rulecoordinate_pair3880);
            lv_c1_0_0=rulecoordinate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCoordinate_pairRule());
            	        }
                   		set(
                   			current, 
                   			"c1",
                    		lv_c1_0_0, 
                    		"coordinate");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1777:2: ( rulecomma )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1778:5: rulecomma
                    {
                     
                            newCompositeNode(grammarAccess.getCoordinate_pairAccess().getCommaParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecomma_in_rulecoordinate_pair3897);
                    rulecomma();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1785:3: ( (lv_c2_2_0= rulecoordinate ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1786:1: (lv_c2_2_0= rulecoordinate )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1786:1: (lv_c2_2_0= rulecoordinate )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1787:3: lv_c2_2_0= rulecoordinate
            {
             
            	        newCompositeNode(grammarAccess.getCoordinate_pairAccess().getC2CoordinateParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulecoordinate_in_rulecoordinate_pair3919);
            lv_c2_2_0=rulecoordinate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCoordinate_pairRule());
            	        }
                   		set(
                   			current, 
                   			"c2",
                    		lv_c2_2_0, 
                    		"coordinate");
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
    // $ANTLR end "rulecoordinate_pair"


    // $ANTLR start "entryRulecomma"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1811:1: entryRulecomma returns [String current=null] : iv_rulecomma= rulecomma EOF ;
    public final String entryRulecomma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecomma = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1812:2: (iv_rulecomma= rulecomma EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1813:2: iv_rulecomma= rulecomma EOF
            {
             newCompositeNode(grammarAccess.getCommaRule()); 
            pushFollow(FOLLOW_rulecomma_in_entryRulecomma3956);
            iv_rulecomma=rulecomma();

            state._fsp--;

             current =iv_rulecomma.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecomma3967); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecomma"


    // $ANTLR start "rulecomma"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1820:1: rulecomma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken rulecomma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1823:28: (kw= ',' )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1825:2: kw= ','
            {
            kw=(Token)match(input,25,FOLLOW_25_in_rulecomma4004); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCommaAccess().getCommaKeyword()); 
                

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
    // $ANTLR end "rulecomma"


    // $ANTLR start "entryRulecoordinate"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1838:1: entryRulecoordinate returns [EObject current=null] : iv_rulecoordinate= rulecoordinate EOF ;
    public final EObject entryRulecoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecoordinate = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1839:2: (iv_rulecoordinate= rulecoordinate EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1840:2: iv_rulecoordinate= rulecoordinate EOF
            {
             newCompositeNode(grammarAccess.getCoordinateRule()); 
            pushFollow(FOLLOW_rulecoordinate_in_entryRulecoordinate4043);
            iv_rulecoordinate=rulecoordinate();

            state._fsp--;

             current =iv_rulecoordinate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecoordinate4053); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecoordinate"


    // $ANTLR start "rulecoordinate"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1847:1: rulecoordinate returns [EObject current=null] : this_number_0= rulenumber ;
    public final EObject rulecoordinate() throws RecognitionException {
        EObject current = null;

        EObject this_number_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1850:28: (this_number_0= rulenumber )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1852:5: this_number_0= rulenumber
            {
             
                    newCompositeNode(grammarAccess.getCoordinateAccess().getNumberParserRuleCall()); 
                
            pushFollow(FOLLOW_rulenumber_in_rulecoordinate4099);
            this_number_0=rulenumber();

            state._fsp--;

             
                    current = this_number_0; 
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
    // $ANTLR end "rulecoordinate"


    // $ANTLR start "entryRulenumber"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1868:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1869:2: (iv_rulenumber= rulenumber EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1870:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber4133);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber4143); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1877:1: rulenumber returns [EObject current=null] : ( ( (lv_sign_0_0= rulesign ) )? ( (lv_nonnegative_number_1_0= rulenonnegative_number ) ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_sign_0_0 = null;

        EObject lv_nonnegative_number_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1880:28: ( ( ( (lv_sign_0_0= rulesign ) )? ( (lv_nonnegative_number_1_0= rulenonnegative_number ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1881:1: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_nonnegative_number_1_0= rulenonnegative_number ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1881:1: ( ( (lv_sign_0_0= rulesign ) )? ( (lv_nonnegative_number_1_0= rulenonnegative_number ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1881:2: ( (lv_sign_0_0= rulesign ) )? ( (lv_nonnegative_number_1_0= rulenonnegative_number ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1881:2: ( (lv_sign_0_0= rulesign ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=39 && LA41_0<=40)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1882:1: (lv_sign_0_0= rulesign )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1882:1: (lv_sign_0_0= rulesign )
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1883:3: lv_sign_0_0= rulesign
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAccess().getSignSignParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulesign_in_rulenumber4189);
                    lv_sign_0_0=rulesign();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumberRule());
                    	        }
                           		set(
                           			current, 
                           			"sign",
                            		lv_sign_0_0, 
                            		"sign");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1899:3: ( (lv_nonnegative_number_1_0= rulenonnegative_number ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1900:1: (lv_nonnegative_number_1_0= rulenonnegative_number )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1900:1: (lv_nonnegative_number_1_0= rulenonnegative_number )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1901:3: lv_nonnegative_number_1_0= rulenonnegative_number
            {
             
            	        newCompositeNode(grammarAccess.getNumberAccess().getNonnegative_numberNonnegative_numberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulenonnegative_number_in_rulenumber4211);
            lv_nonnegative_number_1_0=rulenonnegative_number();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	        }
                   		set(
                   			current, 
                   			"nonnegative_number",
                    		lv_nonnegative_number_1_0, 
                    		"nonnegative_number");
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
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRulenonnegative_number"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1925:1: entryRulenonnegative_number returns [EObject current=null] : iv_rulenonnegative_number= rulenonnegative_number EOF ;
    public final EObject entryRulenonnegative_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenonnegative_number = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1926:2: (iv_rulenonnegative_number= rulenonnegative_number EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1927:2: iv_rulenonnegative_number= rulenonnegative_number EOF
            {
             newCompositeNode(grammarAccess.getNonnegative_numberRule()); 
            pushFollow(FOLLOW_rulenonnegative_number_in_entryRulenonnegative_number4247);
            iv_rulenonnegative_number=rulenonnegative_number();

            state._fsp--;

             current =iv_rulenonnegative_number; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenonnegative_number4257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenonnegative_number"


    // $ANTLR start "rulenonnegative_number"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1934:1: rulenonnegative_number returns [EObject current=null] : ( ( (lv_intseq_0_0= ruledigit_sequence ) ) (otherlv_1= '.' ( (lv_floatseq_2_0= ruledigit_sequence ) ) )? ( (lv_exponent_3_0= ruleexponent ) )? ) ;
    public final EObject rulenonnegative_number() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_intseq_0_0 = null;

        EObject lv_floatseq_2_0 = null;

        EObject lv_exponent_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1937:28: ( ( ( (lv_intseq_0_0= ruledigit_sequence ) ) (otherlv_1= '.' ( (lv_floatseq_2_0= ruledigit_sequence ) ) )? ( (lv_exponent_3_0= ruleexponent ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1938:1: ( ( (lv_intseq_0_0= ruledigit_sequence ) ) (otherlv_1= '.' ( (lv_floatseq_2_0= ruledigit_sequence ) ) )? ( (lv_exponent_3_0= ruleexponent ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1938:1: ( ( (lv_intseq_0_0= ruledigit_sequence ) ) (otherlv_1= '.' ( (lv_floatseq_2_0= ruledigit_sequence ) ) )? ( (lv_exponent_3_0= ruleexponent ) )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1938:2: ( (lv_intseq_0_0= ruledigit_sequence ) ) (otherlv_1= '.' ( (lv_floatseq_2_0= ruledigit_sequence ) ) )? ( (lv_exponent_3_0= ruleexponent ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1938:2: ( (lv_intseq_0_0= ruledigit_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1939:1: (lv_intseq_0_0= ruledigit_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1939:1: (lv_intseq_0_0= ruledigit_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1940:3: lv_intseq_0_0= ruledigit_sequence
            {
             
            	        newCompositeNode(grammarAccess.getNonnegative_numberAccess().getIntseqDigit_sequenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruledigit_sequence_in_rulenonnegative_number4303);
            lv_intseq_0_0=ruledigit_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNonnegative_numberRule());
            	        }
                   		set(
                   			current, 
                   			"intseq",
                    		lv_intseq_0_0, 
                    		"digit_sequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1956:2: (otherlv_1= '.' ( (lv_floatseq_2_0= ruledigit_sequence ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==26) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1956:4: otherlv_1= '.' ( (lv_floatseq_2_0= ruledigit_sequence ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_rulenonnegative_number4316); 

                        	newLeafNode(otherlv_1, grammarAccess.getNonnegative_numberAccess().getFullStopKeyword_1_0());
                        
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1960:1: ( (lv_floatseq_2_0= ruledigit_sequence ) )
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1961:1: (lv_floatseq_2_0= ruledigit_sequence )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1961:1: (lv_floatseq_2_0= ruledigit_sequence )
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1962:3: lv_floatseq_2_0= ruledigit_sequence
                    {
                     
                    	        newCompositeNode(grammarAccess.getNonnegative_numberAccess().getFloatseqDigit_sequenceParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruledigit_sequence_in_rulenonnegative_number4337);
                    lv_floatseq_2_0=ruledigit_sequence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNonnegative_numberRule());
                    	        }
                           		set(
                           			current, 
                           			"floatseq",
                            		lv_floatseq_2_0, 
                            		"digit_sequence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1978:4: ( (lv_exponent_3_0= ruleexponent ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=27 && LA43_0<=28)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1979:1: (lv_exponent_3_0= ruleexponent )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1979:1: (lv_exponent_3_0= ruleexponent )
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:1980:3: lv_exponent_3_0= ruleexponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getNonnegative_numberAccess().getExponentExponentParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleexponent_in_rulenonnegative_number4360);
                    lv_exponent_3_0=ruleexponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNonnegative_numberRule());
                    	        }
                           		set(
                           			current, 
                           			"exponent",
                            		lv_exponent_3_0, 
                            		"exponent");
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
    // $ANTLR end "rulenonnegative_number"


    // $ANTLR start "entryRuleexponent"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2004:1: entryRuleexponent returns [EObject current=null] : iv_ruleexponent= ruleexponent EOF ;
    public final EObject entryRuleexponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexponent = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2005:2: (iv_ruleexponent= ruleexponent EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2006:2: iv_ruleexponent= ruleexponent EOF
            {
             newCompositeNode(grammarAccess.getExponentRule()); 
            pushFollow(FOLLOW_ruleexponent_in_entryRuleexponent4397);
            iv_ruleexponent=ruleexponent();

            state._fsp--;

             current =iv_ruleexponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexponent4407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexponent"


    // $ANTLR start "ruleexponent"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2013:1: ruleexponent returns [EObject current=null] : ( (otherlv_0= 'e' | otherlv_1= 'E' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) ) ;
    public final EObject ruleexponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_sign_2_0 = null;

        EObject lv_digit_sequence_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2016:28: ( ( (otherlv_0= 'e' | otherlv_1= 'E' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2017:1: ( (otherlv_0= 'e' | otherlv_1= 'E' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2017:1: ( (otherlv_0= 'e' | otherlv_1= 'E' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2017:2: (otherlv_0= 'e' | otherlv_1= 'E' ) ( (lv_sign_2_0= rulesign ) )? ( (lv_digit_sequence_3_0= ruledigit_sequence ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2017:2: (otherlv_0= 'e' | otherlv_1= 'E' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==27) ) {
                alt44=1;
            }
            else if ( (LA44_0==28) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2017:4: otherlv_0= 'e'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleexponent4445); 

                        	newLeafNode(otherlv_0, grammarAccess.getExponentAccess().getEKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2022:7: otherlv_1= 'E'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleexponent4463); 

                        	newLeafNode(otherlv_1, grammarAccess.getExponentAccess().getEKeyword_0_1());
                        

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2026:2: ( (lv_sign_2_0= rulesign ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=39 && LA45_0<=40)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2027:1: (lv_sign_2_0= rulesign )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2027:1: (lv_sign_2_0= rulesign )
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2028:3: lv_sign_2_0= rulesign
                    {
                     
                    	        newCompositeNode(grammarAccess.getExponentAccess().getSignSignParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulesign_in_ruleexponent4485);
                    lv_sign_2_0=rulesign();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExponentRule());
                    	        }
                           		set(
                           			current, 
                           			"sign",
                            		lv_sign_2_0, 
                            		"sign");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2044:3: ( (lv_digit_sequence_3_0= ruledigit_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2045:1: (lv_digit_sequence_3_0= ruledigit_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2045:1: (lv_digit_sequence_3_0= ruledigit_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2046:3: lv_digit_sequence_3_0= ruledigit_sequence
            {
             
            	        newCompositeNode(grammarAccess.getExponentAccess().getDigit_sequenceDigit_sequenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruledigit_sequence_in_ruleexponent4507);
            lv_digit_sequence_3_0=ruledigit_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExponentRule());
            	        }
                   		set(
                   			current, 
                   			"digit_sequence",
                    		lv_digit_sequence_3_0, 
                    		"digit_sequence");
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
    // $ANTLR end "ruleexponent"


    // $ANTLR start "entryRuledigit_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2070:1: entryRuledigit_sequence returns [EObject current=null] : iv_ruledigit_sequence= ruledigit_sequence EOF ;
    public final EObject entryRuledigit_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledigit_sequence = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2071:2: (iv_ruledigit_sequence= ruledigit_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2072:2: iv_ruledigit_sequence= ruledigit_sequence EOF
            {
             newCompositeNode(grammarAccess.getDigit_sequenceRule()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence4543);
            iv_ruledigit_sequence=ruledigit_sequence();

            state._fsp--;

             current =iv_ruledigit_sequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit_sequence4553); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledigit_sequence"


    // $ANTLR start "ruledigit_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2079:1: ruledigit_sequence returns [EObject current=null] : ( (lv_digits_0_0= ruledigit ) ) ;
    public final EObject ruledigit_sequence() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_digits_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2082:28: ( ( (lv_digits_0_0= ruledigit ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2083:1: ( (lv_digits_0_0= ruledigit ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2083:1: ( (lv_digits_0_0= ruledigit ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2084:1: (lv_digits_0_0= ruledigit )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2084:1: (lv_digits_0_0= ruledigit )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2085:3: lv_digits_0_0= ruledigit
            {
             
            	        newCompositeNode(grammarAccess.getDigit_sequenceAccess().getDigitsDigitParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruledigit_in_ruledigit_sequence4598);
            lv_digits_0_0=ruledigit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDigit_sequenceRule());
            	        }
                   		add(
                   			current, 
                   			"digits",
                    		lv_digits_0_0, 
                    		"digit");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruledigit_sequence"


    // $ANTLR start "entryRuledigit"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2109:1: entryRuledigit returns [String current=null] : iv_ruledigit= ruledigit EOF ;
    public final String entryRuledigit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledigit = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2110:2: (iv_ruledigit= ruledigit EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2111:2: iv_ruledigit= ruledigit EOF
            {
             newCompositeNode(grammarAccess.getDigitRule()); 
            pushFollow(FOLLOW_ruledigit_in_entryRuledigit4634);
            iv_ruledigit=ruledigit();

            state._fsp--;

             current =iv_ruledigit.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit4645); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledigit"


    // $ANTLR start "ruledigit"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2118:1: ruledigit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) ;
    public final AntlrDatatypeRuleToken ruledigit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2121:28: ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2122:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2122:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )
            int alt46=10;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt46=1;
                }
                break;
            case 30:
                {
                alt46=2;
                }
                break;
            case 31:
                {
                alt46=3;
                }
                break;
            case 32:
                {
                alt46=4;
                }
                break;
            case 33:
                {
                alt46=5;
                }
                break;
            case 34:
                {
                alt46=6;
                }
                break;
            case 35:
                {
                alt46=7;
                }
                break;
            case 36:
                {
                alt46=8;
                }
                break;
            case 37:
                {
                alt46=9;
                }
                break;
            case 38:
                {
                alt46=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2123:2: kw= '0'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruledigit4683); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2130:2: kw= '1'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruledigit4702); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitOneKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2137:2: kw= '2'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruledigit4721); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2144:2: kw= '3'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruledigit4740); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2151:2: kw= '4'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruledigit4759); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitFourKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2158:2: kw= '5'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruledigit4778); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2165:2: kw= '6'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruledigit4797); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitSixKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2172:2: kw= '7'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruledigit4816); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2179:2: kw= '8'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruledigit4835); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitEightKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2186:2: kw= '9'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruledigit4854); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDigitAccess().getDigitNineKeyword_9()); 
                        

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
    // $ANTLR end "ruledigit"


    // $ANTLR start "entryRulesign"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2199:1: entryRulesign returns [String current=null] : iv_rulesign= rulesign EOF ;
    public final String entryRulesign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesign = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2200:2: (iv_rulesign= rulesign EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2201:2: iv_rulesign= rulesign EOF
            {
             newCompositeNode(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_rulesign_in_entryRulesign4895);
            iv_rulesign=rulesign();

            state._fsp--;

             current =iv_rulesign.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesign4906); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesign"


    // $ANTLR start "rulesign"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2208:1: rulesign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulesign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2211:28: ( (kw= '+' | kw= '-' ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2212:1: (kw= '+' | kw= '-' )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2212:1: (kw= '+' | kw= '-' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==39) ) {
                alt47=1;
            }
            else if ( (LA47_0==40) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2213:2: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_rulesign4944); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2220:2: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_rulesign4963); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
                        

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
    // $ANTLR end "rulesign"


    // $ANTLR start "entryRuleflag"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2233:1: entryRuleflag returns [String current=null] : iv_ruleflag= ruleflag EOF ;
    public final String entryRuleflag() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleflag = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2234:2: (iv_ruleflag= ruleflag EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2235:2: iv_ruleflag= ruleflag EOF
            {
             newCompositeNode(grammarAccess.getFlagRule()); 
            pushFollow(FOLLOW_ruleflag_in_entryRuleflag5004);
            iv_ruleflag=ruleflag();

            state._fsp--;

             current =iv_ruleflag.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleflag5015); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleflag"


    // $ANTLR start "ruleflag"
    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2242:1: ruleflag returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0' | kw= '1' ) ;
    public final AntlrDatatypeRuleToken ruleflag() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2245:28: ( (kw= '0' | kw= '1' ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2246:1: (kw= '0' | kw= '1' )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2246:1: (kw= '0' | kw= '1' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==29) ) {
                alt48=1;
            }
            else if ( (LA48_0==30) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2247:2: kw= '0'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleflag5053); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFlagAccess().getDigitZeroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath/src-gen/at/bestsolution/efxclipse/tooling/svgpath/parser/antlr/internal/InternalSvgPath.g:2254:2: kw= '1'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleflag5072); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFlagAccess().getDigitOneKeyword_1()); 
                        

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
    // $ANTLR end "ruleflag"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulesvg_path_in_entryRulesvg_path75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesvg_path85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemoveto_drawto_command_groups_in_rulesvg_path130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemoveto_drawto_command_groups_in_entryRulemoveto_drawto_command_groups166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemoveto_drawto_command_groups176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemoveto_drawto_command_group_in_rulemoveto_drawto_command_groups221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemoveto_drawto_command_group_in_entryRulemoveto_drawto_command_group256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemoveto_drawto_command_group266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemoveto_in_rulemoveto_drawto_command_group312 = new BitSet(new long[]{0x0000000001FFFF82L});
    public static final BitSet FOLLOW_ruledrawto_commands_in_rulemoveto_drawto_command_group333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemoveto_in_entryRulemoveto370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemoveto380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_5_in_rulemoveto418 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_6_in_rulemoveto436 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rulemoveto458 = new BitSet(new long[]{0x000001FFE2000000L});
    public static final BitSet FOLLOW_rulecomma_in_rulemoveto475 = new BitSet(new long[]{0x000001FFE2000000L});
    public static final BitSet FOLLOW_rulelineto_argument_sequence_in_rulemoveto497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelineto_argument_sequence_in_entryRulelineto_argument_sequence533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelineto_argument_sequence543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rulelineto_argument_sequence589 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_rulecomma_in_rulelineto_argument_sequence607 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rulelineto_argument_sequence629 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_ruledrawto_commands_in_entryRuledrawto_commands667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledrawto_commands677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledrawto_command_in_ruledrawto_commands722 = new BitSet(new long[]{0x0000000001FFFF82L});
    public static final BitSet FOLLOW_ruledrawto_command_in_entryRuledrawto_command758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledrawto_command768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclosepath_in_ruledrawto_command815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelineto_in_ruledrawto_command842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehorizontal_lineto_in_ruledrawto_command869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevertical_lineto_in_ruledrawto_command896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecurveto_in_ruledrawto_command923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_curveto_in_ruledrawto_command950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_in_ruledrawto_command977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_quadratic_bezier_curveto_in_ruledrawto_command1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelliptical_arc_in_ruledrawto_command1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclosepath_in_entryRuleclosepath1066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclosepath1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_ruleclosepath1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_ruleclosepath1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelineto_in_entryRulelineto1178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelineto1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rulelineto1226 = new BitSet(new long[]{0x000001FFE2000000L});
    public static final BitSet FOLLOW_10_in_rulelineto1244 = new BitSet(new long[]{0x000001FFE2000000L});
    public static final BitSet FOLLOW_rulelineto_argument_sequence_in_rulelineto1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehorizontal_lineto_in_entryRulehorizontal_lineto1302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulehorizontal_lineto1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulehorizontal_lineto1350 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_12_in_rulehorizontal_lineto1368 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulehorizontal_lineto_argument_sequence_in_rulehorizontal_lineto1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehorizontal_lineto_argument_sequence_in_entryRulehorizontal_lineto_argument_sequence1426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulehorizontal_lineto_argument_sequence1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_in_rulehorizontal_lineto_argument_sequence1482 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_rulecomma_in_rulehorizontal_lineto_argument_sequence1500 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulecoordinate_in_rulehorizontal_lineto_argument_sequence1522 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_rulevertical_lineto_in_entryRulevertical_lineto1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevertical_lineto1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulevertical_lineto1608 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_14_in_rulevertical_lineto1626 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulevertical_lineto_argument_sequence_in_rulevertical_lineto1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevertical_lineto_argument_sequence_in_entryRulevertical_lineto_argument_sequence1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevertical_lineto_argument_sequence1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_in_rulevertical_lineto_argument_sequence1740 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_rulecomma_in_rulevertical_lineto_argument_sequence1758 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulecoordinate_in_rulevertical_lineto_argument_sequence1780 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_rulecurveto_in_entryRulecurveto1818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecurveto1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulecurveto1866 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_16_in_rulecurveto1884 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulecurveto_argument_sequence_in_rulecurveto1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecurveto_argument_sequence_in_entryRulecurveto_argument_sequence1942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecurveto_argument_sequence1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecurveto_argument_in_rulecurveto_argument_sequence1998 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_rulecomma_in_rulecurveto_argument_sequence2016 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulecurveto_argument_in_rulecurveto_argument_sequence2038 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_rulecurveto_argument_in_entryRulecurveto_argument2076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecurveto_argument2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rulecurveto_argument2132 = new BitSet(new long[]{0x000001FFE2000000L});
    public static final BitSet FOLLOW_rulecomma_in_rulecurveto_argument2149 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rulecurveto_argument2171 = new BitSet(new long[]{0x000001FFE2000000L});
    public static final BitSet FOLLOW_rulecomma_in_rulecurveto_argument2188 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rulecurveto_argument2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_curveto_in_entryRulesmooth_curveto2246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesmooth_curveto2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulesmooth_curveto2294 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_18_in_rulesmooth_curveto2312 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulesmooth_curveto_argument_sequence_in_rulesmooth_curveto2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_curveto_argument_sequence_in_entryRulesmooth_curveto_argument_sequence2370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesmooth_curveto_argument_sequence2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_curveto_argument_in_rulesmooth_curveto_argument_sequence2426 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_rulecomma_in_rulesmooth_curveto_argument_sequence2444 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulesmooth_curveto_argument_in_rulesmooth_curveto_argument_sequence2466 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_rulesmooth_curveto_argument_in_entryRulesmooth_curveto_argument2504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesmooth_curveto_argument2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rulesmooth_curveto_argument2560 = new BitSet(new long[]{0x000001FFE2000000L});
    public static final BitSet FOLLOW_rulecomma_in_rulesmooth_curveto_argument2577 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rulesmooth_curveto_argument2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_in_entryRulequadratic_bezier_curveto2635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulequadratic_bezier_curveto2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulequadratic_bezier_curveto2683 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_20_in_rulequadratic_bezier_curveto2701 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_argument_sequence_in_rulequadratic_bezier_curveto2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_argument_sequence_in_entryRulequadratic_bezier_curveto_argument_sequence2759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulequadratic_bezier_curveto_argument_sequence2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_argument_in_rulequadratic_bezier_curveto_argument_sequence2815 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_rulecomma_in_rulequadratic_bezier_curveto_argument_sequence2833 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_argument_in_rulequadratic_bezier_curveto_argument_sequence2855 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_argument_in_entryRulequadratic_bezier_curveto_argument2893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulequadratic_bezier_curveto_argument2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rulequadratic_bezier_curveto_argument2949 = new BitSet(new long[]{0x000001FFE2000000L});
    public static final BitSet FOLLOW_rulecomma_in_rulequadratic_bezier_curveto_argument2966 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rulequadratic_bezier_curveto_argument2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_quadratic_bezier_curveto_in_entryRulesmooth_quadratic_bezier_curveto3024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesmooth_quadratic_bezier_curveto3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulesmooth_quadratic_bezier_curveto3072 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_22_in_rulesmooth_quadratic_bezier_curveto3090 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulesmooth_quadratic_bezier_curveto_argument_sequence_in_rulesmooth_quadratic_bezier_curveto3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_quadratic_bezier_curveto_argument_sequence_in_entryRulesmooth_quadratic_bezier_curveto_argument_sequence3148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesmooth_quadratic_bezier_curveto_argument_sequence3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rulesmooth_quadratic_bezier_curveto_argument_sequence3204 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_rulecomma_in_rulesmooth_quadratic_bezier_curveto_argument_sequence3222 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rulesmooth_quadratic_bezier_curveto_argument_sequence3244 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_ruleelliptical_arc_in_entryRuleelliptical_arc3282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelliptical_arc3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleelliptical_arc3330 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_24_in_ruleelliptical_arc3348 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_ruleelliptical_arc_argument_sequence_in_ruleelliptical_arc3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelliptical_arc_argument_sequence_in_entryRuleelliptical_arc_argument_sequence3406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelliptical_arc_argument_sequence3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelliptical_arc_argument_in_ruleelliptical_arc_argument_sequence3462 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_rulecomma_in_ruleelliptical_arc_argument_sequence3480 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_ruleelliptical_arc_argument_in_ruleelliptical_arc_argument_sequence3502 = new BitSet(new long[]{0x000001FFE2000002L});
    public static final BitSet FOLLOW_ruleelliptical_arc_argument_in_entryRuleelliptical_arc_argument3540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelliptical_arc_argument3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenonnegative_number_in_ruleelliptical_arc_argument3596 = new BitSet(new long[]{0x000001FFE2000000L});
    public static final BitSet FOLLOW_rulecomma_in_ruleelliptical_arc_argument3613 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulenonnegative_number_in_ruleelliptical_arc_argument3635 = new BitSet(new long[]{0x000001FFE2000000L});
    public static final BitSet FOLLOW_rulecomma_in_ruleelliptical_arc_argument3652 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulenumber_in_ruleelliptical_arc_argument3674 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rulecomma_in_ruleelliptical_arc_argument3690 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_ruleflag_in_ruleelliptical_arc_argument3710 = new BitSet(new long[]{0x0000000062000000L});
    public static final BitSet FOLLOW_rulecomma_in_ruleelliptical_arc_argument3727 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_ruleflag_in_ruleelliptical_arc_argument3749 = new BitSet(new long[]{0x000001FFE2000000L});
    public static final BitSet FOLLOW_rulecomma_in_ruleelliptical_arc_argument3766 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_ruleelliptical_arc_argument3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_entryRulecoordinate_pair3824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecoordinate_pair3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_in_rulecoordinate_pair3880 = new BitSet(new long[]{0x000001FFE2000000L});
    public static final BitSet FOLLOW_rulecomma_in_rulecoordinate_pair3897 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulecoordinate_in_rulecoordinate_pair3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_entryRulecomma3956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecomma3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulecomma4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_in_entryRulecoordinate4043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecoordinate4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rulecoordinate4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber4133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_rulenumber4189 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulenonnegative_number_in_rulenumber4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenonnegative_number_in_entryRulenonnegative_number4247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenonnegative_number4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rulenonnegative_number4303 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_26_in_rulenonnegative_number4316 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rulenonnegative_number4337 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleexponent_in_rulenonnegative_number4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexponent_in_entryRuleexponent4397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexponent4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleexponent4445 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_28_in_ruleexponent4463 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_rulesign_in_ruleexponent4485 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_ruleexponent4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence4543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit_sequence4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_ruledigit_sequence4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_entryRuledigit4634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruledigit4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruledigit4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruledigit4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruledigit4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruledigit4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruledigit4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruledigit4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruledigit4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruledigit4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruledigit4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_entryRulesign4895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesign4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulesign4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulesign4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleflag_in_entryRuleflag5004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleflag5015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleflag5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleflag5072 = new BitSet(new long[]{0x0000000000000002L});

}